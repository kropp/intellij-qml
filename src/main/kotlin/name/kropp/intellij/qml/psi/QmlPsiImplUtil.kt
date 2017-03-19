package name.kropp.intellij.qml.psi

object QmlPsiImplUtil {
  @JvmStatic fun updateText(filename: QmlFilename, newText: String): QmlFilename {
    val newFilename = QmlElementFactory.createFilename(filename.project, newText)
    return filename.replace(newFilename) as QmlFilename
  }
}