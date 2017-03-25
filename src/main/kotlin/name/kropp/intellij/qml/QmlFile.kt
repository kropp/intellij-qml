package name.kropp.intellij.qml

import com.intellij.extapi.psi.PsiFileBase
import com.intellij.psi.FileViewProvider
import com.intellij.psi.util.PsiTreeUtil
import name.kropp.intellij.qml.psi.QmlObject

class QmlFile(viewProvider: FileViewProvider) : PsiFileBase(viewProvider, QmlLanguage) {
  override fun getFileType() = QmlFileType

  val qmlObject : QmlObject?
    get() = PsiTreeUtil.findChildOfType(this, QmlObject::class.java)
}