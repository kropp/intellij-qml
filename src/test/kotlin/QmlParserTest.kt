import com.intellij.testFramework.ParsingTestCase
import name.kropp.intellij.qml.QmlParserDefinition

class QmlParserTest : ParsingTestCase("parser", "qml", QmlParserDefinition()) {
  fun testExample() = doTest(true)
  fun testComments() = doTest(true)
  fun testImports() = doTest(true)
  fun testProperties() = doTest(true)
  fun testSignals() = doTest(true)
  fun testMethodAttribute() = doTest(true)
  fun testInlineCode() = doTest(true)

  override fun getTestDataPath() = "testData"
}