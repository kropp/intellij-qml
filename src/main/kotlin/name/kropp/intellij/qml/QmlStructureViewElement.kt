package name.kropp.intellij.qml

import com.intellij.ide.structureView.StructureViewTreeElement
import com.intellij.ide.util.treeView.smartTree.TreeElement
import name.kropp.intellij.qml.psi.QmlPsiElement

class QmlStructureViewElement(private val element: QmlPsiElement) : StructureViewTreeElement {
  override fun getPresentation() = QmlElementStructureViewPresentation(element)

  override fun getChildren(): Array<TreeElement> {
    return element.children.filterIsInstance<QmlPsiElement>().map(::QmlStructureViewElement).toTypedArray()
  }

  override fun canNavigate(): Boolean {
    return false
  }

  override fun getValue(): Any {
    return element
  }

  override fun canNavigateToSource(): Boolean {
    return false
  }

  override fun navigate(requestFocus: Boolean) {

  }

}