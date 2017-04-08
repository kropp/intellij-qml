package name.kropp.intellij.qml.preview

import com.intellij.execution.configurations.ConfigurationFactory
import com.intellij.openapi.project.Project

class QmlRunConfigurationFactory(qmlRunConfigurationType: QmlRunConfigurationType) : ConfigurationFactory(qmlRunConfigurationType) {
  override fun createTemplateConfiguration(project: Project) = QmlRunConfiguration(project, this, "name")
  override fun isConfigurationSingletonByDefault() = true
}