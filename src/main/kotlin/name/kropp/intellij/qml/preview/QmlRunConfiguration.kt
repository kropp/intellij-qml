package name.kropp.intellij.qml.preview

import com.intellij.execution.Executor
import com.intellij.execution.configurations.LocatableConfigurationBase
import com.intellij.execution.configurations.RunConfiguration
import com.intellij.execution.configurations.RunProfileState
import com.intellij.execution.runners.ExecutionEnvironment
import com.intellij.openapi.options.SettingsEditor
import com.intellij.openapi.project.Project

class QmlRunConfiguration(project: Project, factory: QmlRunConfigurationFactory, name: String) : LocatableConfigurationBase(project, factory, name) {
  override fun getConfigurationEditor(): SettingsEditor<out RunConfiguration> {
    TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
  }

  override fun getState(executor: Executor, environment: ExecutionEnvironment): RunProfileState? {
    TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
  }

}