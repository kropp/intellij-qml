package name.kropp.intellij.qml

import com.intellij.navigation.ItemPresentation
import com.intellij.psi.PsiElement

class QmlElementStructureViewPresentation(private val element: PsiElement) : ItemPresentation {
  override fun getLocationString() = ""
  override fun getIcon(unused: Boolean) = QmlIcon
  override fun getPresentableText() = element.text
}