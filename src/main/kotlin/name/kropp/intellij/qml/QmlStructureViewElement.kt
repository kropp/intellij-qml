package name.kropp.intellij.qml

import com.intellij.ide.structureView.StructureViewTreeElement
import com.intellij.ide.util.treeView.smartTree.TreeElement
import com.intellij.psi.PsiElement

class QmlStructureViewElement(private val element: PsiElement) : StructureViewTreeElement {
  override fun getPresentation() = QmlElementStructureViewPresentation(element)

  override fun getChildren(): Array<TreeElement> {
    return emptyArray()
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