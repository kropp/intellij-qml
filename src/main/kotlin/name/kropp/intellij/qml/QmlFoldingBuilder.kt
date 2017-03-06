package name.kropp.intellij.qml

import com.intellij.lang.ASTNode
import com.intellij.lang.folding.FoldingBuilderEx
import com.intellij.lang.folding.FoldingDescriptor
import com.intellij.openapi.editor.Document
import com.intellij.psi.PsiComment
import com.intellij.psi.PsiElement
import com.intellij.psi.util.PsiTreeUtil
import name.kropp.intellij.qml.psi.QmlBlockComment
import name.kropp.intellij.qml.psi.QmlBody
import name.kropp.intellij.qml.psi.QmlImports

class QmlFoldingBuilder : FoldingBuilderEx() {
  override fun buildFoldRegions(root: PsiElement, document: Document, quick: Boolean): Array<FoldingDescriptor>
      = PsiTreeUtil.findChildrenOfAnyType(root, QmlImports::class.java, QmlBody::class.java, PsiComment::class.java)
      .mapNotNull {
        when (it) {
          is QmlImports -> QmlImportsFoldingDescriptor(it)
          is QmlBody -> QmlBodyFoldingDescriptor(it)
          is PsiComment -> QmlBlockCommentFoldingDescriptor(it)
          else -> null
        }
      }
      .toTypedArray()

  override fun getPlaceholderText(node: ASTNode) = "{}"
  override fun isCollapsedByDefault(node: ASTNode) = false

  class QmlBodyFoldingDescriptor(body: QmlBody) : FoldingDescriptor(body, body.textRange)
  class QmlImportsFoldingDescriptor(imports: QmlImports) : FoldingDescriptor(imports, imports.textRange) {
    override fun getPlaceholderText() = "import..."
  }
  class QmlBlockCommentFoldingDescriptor(private val comment: PsiComment) : FoldingDescriptor(comment, comment.textRange) {
    override fun getPlaceholderText() = "/ ${comment.text.removePrefix("/*").removeSuffix("*/").split("\n").firstOrNull() ?: ""} /"
  }
}