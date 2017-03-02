package name.kropp.intellij.qml

import com.intellij.extapi.psi.PsiFileBase
import com.intellij.psi.FileViewProvider

class QmlFile(viewProvider: FileViewProvider) : PsiFileBase(viewProvider, QmlLanguage) {
  override fun getFileType() = QmlFileType
}