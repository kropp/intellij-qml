import QtQuick 2.0

Item {
    signal clicked
    signal hovered()
    signal actionPerformed(string action, var actionResult)
}