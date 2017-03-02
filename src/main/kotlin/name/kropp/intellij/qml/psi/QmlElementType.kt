package name.kropp.intellij.qml.psi

import com.intellij.psi.tree.IElementType
import name.kropp.intellij.qml.QmlLanguage

open class QmlElementType(debugName: String) : IElementType(debugName, QmlLanguage)