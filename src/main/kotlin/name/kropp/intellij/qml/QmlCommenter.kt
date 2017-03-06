package name.kropp.intellij.qml

import com.intellij.lang.Commenter

class QmlCommenter : Commenter {
  override fun getLineCommentPrefix() = "//"
  override fun getBlockCommentPrefix() = "/*"
  override fun getBlockCommentSuffix() = "*/"
  override fun getCommentedBlockCommentPrefix() = null
  override fun getCommentedBlockCommentSuffix() = null
}