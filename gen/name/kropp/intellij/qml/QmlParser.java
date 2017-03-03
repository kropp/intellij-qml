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
    if (t == COMMENT) {
      r = comment(b, 0);
    }
    else if (t == IMPORT) {
      r = consumeToken(b, IMPORT_$);
    }
    else if (t == OBJECT) {
      r = object(b, 0);
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
  public static boolean comment(PsiBuilder b, int l) {
    Marker m = enter_section_(b);
    exit_section_(b, m, COMMENT, true);
    return true;
  }

  /* ********************************************************** */
  // 'import' module
  public static boolean import_$(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "import_$")) return false;
    if (!nextTokenIs(b, KEYWORD_IMPORT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, KEYWORD_IMPORT, MODULE);
    exit_section_(b, m, IMPORT, r);
    return r;
  }

  /* ********************************************************** */
  // typename '{' fields '}'
  public static boolean object(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "object")) return false;
    if (!nextTokenIs(b, TYPENAME)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, TYPENAME, LBRACE, FIELDS, RBRACE);
    exit_section_(b, m, OBJECT, r);
    return r;
  }

  /* ********************************************************** */
  // import* comment? object
  static boolean qml(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "qml")) return false;
    if (!nextTokenIs(b, "", KEYWORD_IMPORT, TYPENAME)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = qml_0(b, l + 1);
    r = r && qml_1(b, l + 1);
    r = r && object(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // import*
  private static boolean qml_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "qml_0")) return false;
    int c = current_position_(b);
    while (true) {
      if (!import_$(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "qml_0", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // comment?
  private static boolean qml_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "qml_1")) return false;
    comment(b, l + 1);
    return true;
  }

}
