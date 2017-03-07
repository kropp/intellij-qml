package name.kropp.intellij.qml

import com.intellij.lang.annotation.AnnotationHolder
import com.intellij.lang.annotation.Annotator
import com.intellij.psi.PsiElement
import name.kropp.intellij.qml.psi.QmlPropertyName
import name.kropp.intellij.qml.psi.QmlTypeName

class QmlAnnotator : Annotator {
  override fun annotate(element: PsiElement, holder: AnnotationHolder) {
    if (element is QmlTypeName) {
      holder.createInfoAnnotation(element, null).textAttributes = QmlSyntaxHighlighter.TYPE_NAME
    } else if (element is QmlPropertyName) {
      if (element.text == "id") {
        holder.createInfoAnnotation(element, null).textAttributes = QmlSyntaxHighlighter.ID
      } else {
        holder.createInfoAnnotation(element, null).textAttributes = QmlSyntaxHighlighter.PROPERTY
      }
    }
  }
}