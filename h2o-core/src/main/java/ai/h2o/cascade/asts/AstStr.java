package ai.h2o.cascade.asts;


import ai.h2o.cascade.core.Scope;
import ai.h2o.cascade.core.ValStr;

/**
 * A String literal.
 */
public class AstStr extends AstNode<AstStr> {
  private String value;

  public AstStr(String str) {
    value = str;
  }

  @Override
  public ValStr exec(Scope scope) {
    return new ValStr(value);
  }

  @Override
  public String str() {
    return value;
  }

}
