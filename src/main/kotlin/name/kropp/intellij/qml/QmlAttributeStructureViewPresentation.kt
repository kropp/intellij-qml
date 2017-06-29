package name.kropp.intellij.qml

import com.intellij.navigation.ItemPresentation
import name.kropp.intellij.qml.psi.QmlAttributeAssignment

class QmlAttributeStructureViewPresentation(private val element: QmlAttributeAssignment) : ItemPresentation {
  override fun getLocationString() = ""
  override fun getIcon(unused: Boolean) = QmlIcon
  override fun getPresentableText() = element.attribute?.text
}