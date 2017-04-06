package name.kropp.intellij.qml

import com.intellij.navigation.ItemPresentation
import name.kropp.intellij.qml.psi.QmlPsiElement

class QmlElementStructureViewPresentation(private val element: QmlPsiElement) : ItemPresentation {
  override fun getLocationString() = ""
  override fun getIcon(unused: Boolean) = QmlIcon
  override fun getPresentableText() = element.text
}