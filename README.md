# QML support for IntelliJ-based IDEs

[![Build status](https://teamcity.jetbrains.com/app/rest/builds/buildType:(id:IntellijIdeaPlugins_Qml_Build)/statusIcon.svg)](https://teamcity.jetbrains.com/viewType.html?buildTypeId=IntellijIdeaPlugins_Qml_Build)

[QML support plugin](https://plugins.jetbrains.com/plugin/9532-qml-support)

### Development

The plugin is built using Gradle and uses [gradle-intellij-plugin](https://github.com/JetBrains/gradle-intellij-plugin)
to integrate with IntelliJ Platform.
 
To build a plugin run

```
$ ./gradlew buildPlugin
```

Plugin zip file will be created in `build/distributions`

To test plugin in IDE run `./gradlew runIdea`

#### Grammar modifications

The plugin uses [Grammar-Kit](https://github.com/jetbrains/grammar-kit) to generate parser and lexer. Please install [Grammar-Kit plugin](https://plugins.jetbrains.com/plugin/6606-grammar-kit) and refer to the documentation if you want to modify the grammar.

To regenerate parser, open `qml.bnf` and press Ctrl+Shift+G (Cmd+Shift+G on Mac)
To regenerate lexer, open `qml.flex` and press Ctrl+Shift+G (Cmd+Shift+G on Mac)

Please make sure to add a test to `QmlParserTest.kt` for any parser changes.
 
### Contribution

Plugin is written in [Kotlin](http://kotlinlang.org/).

Pull requests are welcome!