package name.kropp.intellij.qml.psi

import com.intellij.openapi.project.Project
import com.intellij.psi.PsiFileFactory
import name.kropp.intellij.qml.QmlFile
import name.kropp.intellij.qml.QmlFileType

object QmlElementFactory {
  fun createQmlFile(project: Project, content: String) = PsiFileFactory.getInstance(project).createFileFromText("dummy.qml", QmlFileType, content) as QmlFile

  fun createFilename(project: Project, filename: String): QmlFilename {
    val qmlFile = createQmlFile(project, "import $filename\nO {}")
    val imports = qmlFile.firstChild as QmlImports
    return imports.importList.first().filename!!
  }
}