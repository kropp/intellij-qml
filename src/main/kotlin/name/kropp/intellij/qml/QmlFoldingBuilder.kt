package name.kropp.intellij.qml

import com.intellij.lang.ASTNode
import com.intellij.lang.folding.FoldingBuilderEx
import com.intellij.lang.folding.FoldingDescriptor
import com.intellij.openapi.editor.Document
import com.intellij.psi.PsiElement
import com.intellij.psi.util.PsiTreeUtil
import name.kropp.intellij.qml.psi.QmlBody

class QmlFoldingBuilder : FoldingBuilderEx() {
  override fun buildFoldRegions(root: PsiElement, document: Document, quick: Boolean): Array<FoldingDescriptor>
      = PsiTreeUtil.findChildrenOfAnyType(root, QmlBody::class.java)
      .mapNotNull(::QmlBodyFoldingDescriptor)
      .toTypedArray()

  override fun getPlaceholderText(node: ASTNode) = "{}"
  override fun isCollapsedByDefault(node: ASTNode) = false

  class QmlBodyFoldingDescriptor(body: QmlBody) : FoldingDescriptor(body, body.textRange)
}