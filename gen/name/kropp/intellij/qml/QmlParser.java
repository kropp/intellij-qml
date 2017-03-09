// This is a generated file. Not intended for manual editing.
package name.kropp.intellij.qml;

import com.intellij.lang.PsiBuilder;
import com.intellij.lang.PsiBuilder.Marker;
import static name.kropp.intellij.qml.psi.QmlTypes.*;
import static com.intellij.lang.parser.GeneratedParserUtilBase.*;
import com.intellij.psi.tree.IElementType;
import com.intellij.lang.ASTNode;
import com.intellij.psi.tree.TokenSet;
import com.intellij.lang.PsiParser;
import com.intellij.lang.LightPsiParser;

@SuppressWarnings({"SimplifiableIfStatement", "UnusedAssignment"})
public class QmlParser implements PsiParser, LightPsiParser {

  public ASTNode parse(IElementType t, PsiBuilder b) {
    parseLight(t, b);
    return b.getTreeBuilt();
  }

  public void parseLight(IElementType t, PsiBuilder b) {
    boolean r;
    b = adapt_builder_(t, b, this, null);
    Marker m = enter_section_(b, 0, _COLLAPSE_, null);
    if (t == ATTRIBUTE) {
      r = attribute(b, 0);
    }
    else if (t == ATTRIBUTE_ASSIGNMENT) {
      r = attribute_assignment(b, 0);
    }
    else if (t == BLOCK_COMMENT) {
      r = block_comment(b, 0);
    }
    else if (t == BODY) {
      r = body(b, 0);
    }
    else if (t == IMPORT) {
      r = consumeToken(b, IMPORT_$);
    }
    else if (t == IMPORTS) {
      r = imports(b, 0);
    }
    else if (t == LINE_COMMENT) {
      r = line_comment(b, 0);
    }
    else if (t == MODULE) {
      r = module(b, 0);
    }
    else if (t == OBJECT) {
      r = object(b, 0);
    }
    else if (t == QUALIFIER) {
      r = qualifier(b, 0);
    }
    else if (t == TYPE) {
      r = type(b, 0);
    }
    else if (t == VERSION) {
      r = version(b, 0);
    }
    else {
      r = parse_root_(t, b, 0);
    }
    exit_section_(b, 0, m, t, r, true, TRUE_CONDITION);
  }

  protected boolean parse_root_(IElementType t, PsiBuilder b, int l) {
    return qml(b, l + 1);
  }

  /* ********************************************************** */
  // identifier
  public static boolean attribute(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "attribute")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IDENTIFIER);
    exit_section_(b, m, ATTRIBUTE, r);
    return r;
  }

  /* ********************************************************** */
  // (attribute ':')? (object|string|boolean|number|identifier|value)
  public static boolean attribute_assignment(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "attribute_assignment")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ATTRIBUTE_ASSIGNMENT, "<attribute assignment>");
    r = attribute_assignment_0(b, l + 1);
    r = r && attribute_assignment_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (attribute ':')?
  private static boolean attribute_assignment_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "attribute_assignment_0")) return false;
    attribute_assignment_0_0(b, l + 1);
    return true;
  }

  // attribute ':'
  private static boolean attribute_assignment_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "attribute_assignment_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = attribute(b, l + 1);
    r = r && consumeToken(b, COLON);
    exit_section_(b, m, null, r);
    return r;
  }

  // object|string|boolean|number|identifier|value
  private static boolean attribute_assignment_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "attribute_assignment_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = object(b, l + 1);
    if (!r) r = consumeToken(b, STRING);
    if (!r) r = boolean_$(b, l + 1);
    if (!r) r = number(b, l + 1);
    if (!r) r = consumeToken(b, IDENTIFIER);
    if (!r) r = consumeToken(b, VALUE);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  public static boolean block_comment(PsiBuilder b, int l) {
    Marker m = enter_section_(b);
    exit_section_(b, m, BLOCK_COMMENT, true);
    return true;
  }

  /* ********************************************************** */
  // '{' attribute_assignment* '}'
  public static boolean body(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "body")) return false;
    if (!nextTokenIs(b, LBRACE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LBRACE);
    r = r && body_1(b, l + 1);
    r = r && consumeToken(b, RBRACE);
    exit_section_(b, m, BODY, r);
    return r;
  }

  // attribute_assignment*
  private static boolean body_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "body_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!attribute_assignment(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "body_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  /* ********************************************************** */
  // 'true'|'false'
  static boolean boolean_$(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "boolean_$")) return false;
    if (!nextTokenIs(b, "", FALSE, TRUE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, TRUE);
    if (!r) r = consumeToken(b, FALSE);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // 'import' module version? ('as' qualifier)?
  public static boolean import_$(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "import_$")) return false;
    if (!nextTokenIs(b, KEYWORD_IMPORT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, KEYWORD_IMPORT);
    r = r && module(b, l + 1);
    r = r && import_2(b, l + 1);
    r = r && import_3(b, l + 1);
    exit_section_(b, m, IMPORT, r);
    return r;
  }

  // version?
  private static boolean import_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "import_2")) return false;
    version(b, l + 1);
    return true;
  }

  // ('as' qualifier)?
  private static boolean import_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "import_3")) return false;
    import_3_0(b, l + 1);
    return true;
  }

  // 'as' qualifier
  private static boolean import_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "import_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, KEYWORD_AS);
    r = r && qualifier(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // import+
  public static boolean imports(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "imports")) return false;
    if (!nextTokenIs(b, KEYWORD_IMPORT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = import_$(b, l + 1);
    int c = current_position_(b);
    while (r) {
      if (!import_$(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "imports", c)) break;
      c = current_position_(b);
    }
    exit_section_(b, m, IMPORTS, r);
    return r;
  }

  /* ********************************************************** */
  public static boolean line_comment(PsiBuilder b, int l) {
    Marker m = enter_section_(b);
    exit_section_(b, m, LINE_COMMENT, true);
    return true;
  }

  /* ********************************************************** */
  // identifier
  public static boolean module(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "module")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IDENTIFIER);
    exit_section_(b, m, MODULE, r);
    return r;
  }

  /* ********************************************************** */
  // integer|float
  static boolean number(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "number")) return false;
    if (!nextTokenIs(b, "", FLOAT, INTEGER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, INTEGER);
    if (!r) r = consumeToken(b, FLOAT);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // type body
  public static boolean object(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "object")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = type(b, l + 1);
    r = r && body(b, l + 1);
    exit_section_(b, m, OBJECT, r);
    return r;
  }

  /* ********************************************************** */
  // imports? object
  static boolean qml(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "qml")) return false;
    if (!nextTokenIs(b, "", KEYWORD_IMPORT, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = qml_0(b, l + 1);
    r = r && object(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // imports?
  private static boolean qml_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "qml_0")) return false;
    imports(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // identifier
  public static boolean qualifier(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "qualifier")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IDENTIFIER);
    exit_section_(b, m, QUALIFIER, r);
    return r;
  }

  /* ********************************************************** */
  // identifier
  public static boolean type(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IDENTIFIER);
    exit_section_(b, m, TYPE, r);
    return r;
  }

  /* ********************************************************** */
  // float
  public static boolean version(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "version")) return false;
    if (!nextTokenIs(b, FLOAT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, FLOAT);
    exit_section_(b, m, VERSION, r);
    return r;
  }

}
