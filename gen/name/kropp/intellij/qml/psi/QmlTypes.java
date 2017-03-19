// This is a generated file. Not intended for manual editing.
package name.kropp.intellij.qml.psi;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import name.kropp.intellij.qml.psi.impl.*;

public interface QmlTypes {

  IElementType ARGUMENT = new QmlElementType("ARGUMENT");
  IElementType ATTRIBUTE = new QmlElementType("ATTRIBUTE");
  IElementType ATTRIBUTE_ASSIGNMENT = new QmlElementType("ATTRIBUTE_ASSIGNMENT");
  IElementType BLOCK_COMMENT = new QmlElementType("BLOCK_COMMENT");
  IElementType BODY = new QmlElementType("BODY");
  IElementType FILENAME = new QmlElementType("FILENAME");
  IElementType IMPORT = new QmlElementType("IMPORT");
  IElementType IMPORTS = new QmlElementType("IMPORTS");
  IElementType JAVASCRIPT = new QmlElementType("JAVASCRIPT");
  IElementType LINE_COMMENT = new QmlElementType("LINE_COMMENT");
  IElementType LIST = new QmlElementType("LIST");
  IElementType METHOD = new QmlElementType("METHOD");
  IElementType METHOD_ATTRIBUTE = new QmlElementType("METHOD_ATTRIBUTE");
  IElementType METHOD_BODY = new QmlElementType("METHOD_BODY");
  IElementType METHOD_CALL = new QmlElementType("METHOD_CALL");
  IElementType MODULE = new QmlElementType("MODULE");
  IElementType OBJECT = new QmlElementType("OBJECT");
  IElementType PARAMETER = new QmlElementType("PARAMETER");
  IElementType PROPERTY = new QmlElementType("PROPERTY");
  IElementType PROPERTY_DEFINITION = new QmlElementType("PROPERTY_DEFINITION");
  IElementType QUALIFIER = new QmlElementType("QUALIFIER");
  IElementType SIGNAL = new QmlElementType("SIGNAL");
  IElementType SIGNAL_DEFINITION = new QmlElementType("SIGNAL_DEFINITION");
  IElementType SIGNAL_PARAMETER = new QmlElementType("SIGNAL_PARAMETER");
  IElementType TYPE = new QmlElementType("TYPE");
  IElementType VERSION = new QmlElementType("VERSION");

  IElementType COLON = new QmlTokenType(":");
  IElementType COMMA = new QmlTokenType(",");
  IElementType FALSE = new QmlTokenType("false");
  IElementType FLOAT = new QmlTokenType("float");
  IElementType IDENTIFIER = new QmlTokenType("identifier");
  IElementType IMPORT_$ = new QmlTokenType("import_$");
  IElementType INTEGER = new QmlTokenType("integer");
  IElementType KEYWORD_AS = new QmlTokenType("as");
  IElementType KEYWORD_DEFAULT = new QmlTokenType("default");
  IElementType KEYWORD_DOUBLE = new QmlTokenType("double");
  IElementType KEYWORD_FUNCTION = new QmlTokenType("function");
  IElementType KEYWORD_IMPORT = new QmlTokenType("import");
  IElementType KEYWORD_PROPERTY = new QmlTokenType("property");
  IElementType KEYWORD_READONLY = new QmlTokenType("readonly");
  IElementType KEYWORD_REAL = new QmlTokenType("real");
  IElementType KEYWORD_SIGNAL = new QmlTokenType("signal");
  IElementType KEYWORD_VAR = new QmlTokenType("var");
  IElementType LBRACE = new QmlTokenType("{");
  IElementType LBRACKET = new QmlTokenType("[");
  IElementType LPAREN = new QmlTokenType("(");
  IElementType RBRACE = new QmlTokenType("}");
  IElementType RBRACKET = new QmlTokenType("]");
  IElementType RPAREN = new QmlTokenType(")");
  IElementType SEMICOLON = new QmlTokenType(";");
  IElementType STRING = new QmlTokenType("string");
  IElementType TRUE = new QmlTokenType("true");
  IElementType VALUE = new QmlTokenType("value");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
       if (type == ARGUMENT) {
        return new QmlArgumentImpl(node);
      }
      else if (type == ATTRIBUTE) {
        return new QmlAttributeImpl(node);
      }
      else if (type == ATTRIBUTE_ASSIGNMENT) {
        return new QmlAttributeAssignmentImpl(node);
      }
      else if (type == BLOCK_COMMENT) {
        return new QmlBlockCommentImpl(node);
      }
      else if (type == BODY) {
        return new QmlBodyImpl(node);
      }
      else if (type == FILENAME) {
        return new QmlFilenameImpl(node);
      }
      else if (type == IMPORT) {
        return new QmlImportImpl(node);
      }
      else if (type == IMPORTS) {
        return new QmlImportsImpl(node);
      }
      else if (type == JAVASCRIPT) {
        return new QmlJavascriptImpl(node);
      }
      else if (type == LINE_COMMENT) {
        return new QmlLineCommentImpl(node);
      }
      else if (type == LIST) {
        return new QmlListImpl(node);
      }
      else if (type == METHOD) {
        return new QmlMethodImpl(node);
      }
      else if (type == METHOD_ATTRIBUTE) {
        return new QmlMethodAttributeImpl(node);
      }
      else if (type == METHOD_BODY) {
        return new QmlMethodBodyImpl(node);
      }
      else if (type == METHOD_CALL) {
        return new QmlMethodCallImpl(node);
      }
      else if (type == MODULE) {
        return new QmlModuleImpl(node);
      }
      else if (type == OBJECT) {
        return new QmlObjectImpl(node);
      }
      else if (type == PARAMETER) {
        return new QmlParameterImpl(node);
      }
      else if (type == PROPERTY) {
        return new QmlPropertyImpl(node);
      }
      else if (type == PROPERTY_DEFINITION) {
        return new QmlPropertyDefinitionImpl(node);
      }
      else if (type == QUALIFIER) {
        return new QmlQualifierImpl(node);
      }
      else if (type == SIGNAL) {
        return new QmlSignalImpl(node);
      }
      else if (type == SIGNAL_DEFINITION) {
        return new QmlSignalDefinitionImpl(node);
      }
      else if (type == SIGNAL_PARAMETER) {
        return new QmlSignalParameterImpl(node);
      }
      else if (type == TYPE) {
        return new QmlTypeImpl(node);
      }
      else if (type == VERSION) {
        return new QmlVersionImpl(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
