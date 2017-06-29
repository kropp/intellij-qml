package name.kropp.intellij.qml

import com.intellij.ide.structureView.StructureViewTreeElement
import com.intellij.ide.util.treeView.smartTree.TreeElement
import com.intellij.navigation.NavigationItem
import name.kropp.intellij.qml.psi.QmlAttributeAssignment

class QmlStructureViewPropertyElement(private val element: QmlAttributeAssignment) : StructureViewTreeElement {
  override fun getPresentation() = QmlAttributeStructureViewPresentation(element)

  override fun getChildren(): Array<TreeElement> {
    return element.`object`?.let { arrayOf<TreeElement>(QmlStructureViewElement(it)) } ?: emptyArray()
  }

  override fun getValue() = element

  override fun canNavigate() = (element as? NavigationItem)?.canNavigate() == true
  override fun canNavigateToSource() = (element as? NavigationItem)?.canNavigateToSource() == true

  override fun navigate(requestFocus: Boolean) {
    (element as? NavigationItem)?.navigate(requestFocus)
  }
}