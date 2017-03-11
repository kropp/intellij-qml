package name.kropp.intellij.qml

import com.intellij.lang.BracePair
import com.intellij.lang.PairedBraceMatcher
import com.intellij.psi.PsiFile
import com.intellij.psi.tree.IElementType
import name.kropp.intellij.qml.psi.QmlObject
import name.kropp.intellij.qml.psi.QmlTypes

class QmlPairedBraceMatcher : PairedBraceMatcher {
  override fun getPairs() = arrayOf(
      BracePair(QmlTypes.LBRACE, QmlTypes.RBRACE, true),
      BracePair(QmlTypes.LBRACKET, QmlTypes.RBRACKET, true),
      BracePair(QmlTypes.LPAREN, QmlTypes.RPAREN, false)
  )

  override fun isPairedBracesAllowedBeforeType(lbraceType: IElementType, contextType: IElementType?) = true

  override fun getCodeConstructStart(file: PsiFile, openingBraceOffset: Int): Int {
    val element = file.findElementAt(openingBraceOffset)
    val obj = element?.parent
    if (obj is QmlObject) {
      return obj.textRange.startOffset
    }
    return openingBraceOffset
  }
}