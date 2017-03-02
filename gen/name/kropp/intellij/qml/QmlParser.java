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
  // comment*
  static boolean qml(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "qml")) return false;
    int c = current_position_(b);
    while (true) {
      if (!comment(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "qml", c)) break;
      c = current_position_(b);
    }
    return true;
  }

}
