package name.kropp.intellij.qml

import com.intellij.ide.structureView.StructureViewTreeElement
import com.intellij.ide.util.treeView.smartTree.TreeElement
import com.intellij.navigation.NavigationItem
import name.kropp.intellij.qml.psi.QmlPsiElement

class QmlStructureViewElement(private val element: QmlPsiElement) : StructureViewTreeElement {
  override fun getPresentation() = QmlElementStructureViewPresentation(element)

  override fun getChildren(): Array<TreeElement> {
    return element.children.filterIsInstance<QmlPsiElement>().map(::QmlStructureViewElement).toTypedArray()
  }

  override fun getValue() = element

  override fun canNavigate() = (element as? NavigationItem)?.canNavigate() == true
  override fun canNavigateToSource() = (element as? NavigationItem)?.canNavigateToSource() == true

  override fun navigate(requestFocus: Boolean) {
    (element as? NavigationItem)?.navigate(requestFocus)
  }
}