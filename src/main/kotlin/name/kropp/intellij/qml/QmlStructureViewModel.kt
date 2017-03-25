package name.kropp.intellij.qml

import com.intellij.ide.structureView.StructureViewModelBase

class QmlStructureViewModel(qmlFile: QmlFile) : StructureViewModelBase(qmlFile, QmlStructureViewElement(qmlFile.qmlObject!!))