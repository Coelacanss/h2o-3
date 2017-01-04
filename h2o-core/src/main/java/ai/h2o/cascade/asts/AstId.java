package ai.h2o.cascade.asts;

import ai.h2o.cascade.Cascade;
import ai.h2o.cascade.core.Scope;
import ai.h2o.cascade.core.Val;

/**
 * Identifier, will perform a name lookup in the local/session scopes.
 */
public class AstId extends AstNode<AstId> {
  private String name;

  public AstId(String name) {
    this.name = name;
  }

  @Override
  public Val exec(Scope scope) {
    try {
      return scope.lookupVariable(name);
    } catch (IllegalArgumentException e) {
      throw new Cascade.NameError(start, length, e.getMessage());
    }
  }

  @Override
  public String str() {
    return name;
  }
}
