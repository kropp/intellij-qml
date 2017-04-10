package name.kropp.intellij.qml.preview

enum class QmlSceneScaling(override val option: String, override val description: String, override val tooltip: String): QmlSceneOption {
  Default("", "Default", ""),
  Enable("--scaling", "Enable High DPI scaling", "AA_EnableHighDpiScaling"),
  Disable("--no-scaling", "Disable High DPI scaling", "AA_DisableHighDpiScaling")
}