package name.kropp.intellij.qml.preview

enum class QmlSceneRendering(override val option: String, override val description: String) : QmlSceneOption {
  Default("", "Default"),
  Desktop("--desktop", "Force use of desktop GL (AA_UseDesktopOpenGL)"),
  GLES("--gles", "Force use of GLES (AA_UseOpenGLES)"),
  Software("--software", "Force use of software rendering (AA_UseOpenGLES)"),
}