package name.kropp.intellij.qml.preview

import com.intellij.execution.Executor
import com.intellij.execution.configurations.CommandLineState
import com.intellij.execution.configurations.GeneralCommandLine
import com.intellij.execution.configurations.LocatableConfigurationBase
import com.intellij.execution.configurations.RunProfileState
import com.intellij.execution.process.ColoredProcessHandler
import com.intellij.execution.process.ProcessHandler
import com.intellij.execution.process.ProcessTerminatedListener
import com.intellij.execution.runners.ExecutionEnvironment
import com.intellij.openapi.project.Project
import org.jdom.Element
import java.io.File

class QmlRunConfiguration(project: Project, factory: QmlRunConfigurationFactory, name: String) : LocatableConfigurationBase<RunProfileState>(project, factory, name) {
  var qmlscenePath: String = ""
  var filename: String = ""
  var size: QmlSceneSize = QmlSceneSize.None
  var rendering: QmlSceneRendering = QmlSceneRendering.Default
  var scaling: QmlSceneScaling = QmlSceneScaling.Default
  var slowAnimations: Boolean = false

  private companion object {
    const val QMLSCENE = "qmlscene"
    const val FILENAME = "filename"
    const val SIZE = "size"
    const val RENDERING = "rendering"
    const val SCALING = "scaling"
    const val SLOW_ANIMATIONS = "slowAnimations"
  }

  override fun getConfigurationEditor() = QmlRunConfigurationEditor()

  override fun readExternal(element: Element) {
    super.readExternal(element)
    qmlscenePath = element.getAttributeValue(QMLSCENE) ?: ""
    filename = element.getAttributeValue(FILENAME) ?: ""
    size = enumValueOf(element.getAttributeValue(SIZE))
    rendering = enumValueOf(element.getAttributeValue(RENDERING))
    scaling = enumValueOf(element.getAttributeValue(SCALING))
    slowAnimations = element.getAttributeValue(SLOW_ANIMATIONS) == "true"
  }

  override fun writeExternal(element: Element) {
    super.writeExternal(element)
    element.setAttribute(QMLSCENE, qmlscenePath)
    element.setAttribute(FILENAME, filename)
    element.setAttribute(SIZE, size.name)
    element.setAttribute(RENDERING, rendering.name)
    element.setAttribute(SCALING, scaling.name)
    element.setAttribute(SLOW_ANIMATIONS, slowAnimations.toString())
  }

  override fun getState(executor: Executor, executionEnvironment: ExecutionEnvironment): RunProfileState? {
    return object : CommandLineState(executionEnvironment) {
      override fun startProcess(): ProcessHandler {
        val args = mutableListOf<String>()
        arrayOf<QmlSceneOption>(size, rendering, scaling)
            .filter { it.option.isNotEmpty() }
            .forEach { args += it.option }
        if (slowAnimations) {
          args += "--slow-animations"
        }
        args += filename

        val cmd = GeneralCommandLine()
            .withExePath(qmlscenePath)
            .withWorkDirectory(File(filename).parent)
            .withParameters(args)
        val processHandler = ColoredProcessHandler(cmd)
        ProcessTerminatedListener.attach(processHandler)
        return processHandler
      }
    }

  }
}