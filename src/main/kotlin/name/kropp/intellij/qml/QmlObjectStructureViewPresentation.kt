package name.kropp.intellij.qml

import com.intellij.navigation.ItemPresentation
import name.kropp.intellij.qml.psi.QmlObject

class QmlObjectStructureViewPresentation(private val element: QmlObject) : ItemPresentation {
  override fun getLocationString() = ""
  override fun getIcon(unused: Boolean) = QmlIcon
  override fun getPresentableText() = element.type.text
}