package name.kropp.intellij.qml

import com.intellij.lang.ASTNode
import com.intellij.lang.Language
import com.intellij.lang.ParserDefinition
import com.intellij.openapi.project.Project
import com.intellij.psi.FileViewProvider
import com.intellij.psi.TokenType
import com.intellij.psi.tree.IFileElementType
import com.intellij.psi.tree.TokenSet
import name.kropp.intellij.qml.psi.QmlTypes

class QmlParserDefinition : ParserDefinition {
  companion object {
    val WHITE_SPACES = TokenSet.create(TokenType.WHITE_SPACE)
    val COMMENTS = TokenSet.create(QmlTypes.LINE_COMMENT, QmlTypes.BLOCK_COMMENT)

    val FILE = IFileElementType(Language.findInstance(QmlLanguage::class.java))
  }

  override fun getFileNodeType() = FILE
  override fun getWhitespaceTokens() = WHITE_SPACES
  override fun getCommentTokens() = COMMENTS
  override fun getStringLiteralElements() = TokenSet.EMPTY

  override fun spaceExistanceTypeBetweenTokens(left: ASTNode?, right: ASTNode?) = ParserDefinition.SpaceRequirements.MAY

  override fun createFile(viewProvider: FileViewProvider) = QmlFile(viewProvider)

  override fun createParser(project: Project?) = QmlParser()
  override fun createLexer(project: Project?) = QmlLexerAdapter()

  override fun createElement(node: ASTNode?) = QmlTypes.Factory.createElement(node)
}