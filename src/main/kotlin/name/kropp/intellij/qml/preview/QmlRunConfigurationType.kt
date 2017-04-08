package name.kropp.intellij.qml.preview

import com.intellij.execution.configurations.ConfigurationType
import name.kropp.intellij.qml.QmlIcon

class QmlRunConfigurationType : ConfigurationType {
  override fun getDisplayName() = "Qml Scene"
  override fun getIcon() = QmlIcon
  override fun getConfigurationTypeDescription() = "Preview"

  override fun getId() = "QML_SCENE_RUN_CONFIGURATION"

  override fun getConfigurationFactories() = arrayOf(QmlRunConfigurationFactory(this))
}

