import QtQuick 2.0
import QtQuick.Controls 2.0

Item {
    property bool textIsCool: button.text !== "cool"

    Button {
        id: button
        text: "Test"
    }
}