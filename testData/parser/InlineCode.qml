MouseArea {
    anchors.fill: parent
    onClicked: {
        var scenePos = mapToItem(null, mouseX, mouseY);
        console.log("MouseArea was clicked at scene pos " + scenePos);
    }
}