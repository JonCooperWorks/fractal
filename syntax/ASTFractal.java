package fractal.syntax;

import fractal.semantics.Visitor;
import fractal.sys.FractalException;
import java.util.ArrayList;

/**
  Class ASTFractal.
  Intermediate representation class autogenerated by CS34Q semantic generator.
  Created on Sat Oct 12 03:13:16 2013
*/
public class ASTFractal extends ASTFracExp {
  ArrayList<ASTStatement> body;

  public ASTFractal (ArrayList<ASTStatement> body) {
    this.body = body;
  }

  public ArrayList<ASTStatement> getBody() {
    return body;
  }

    /**
     * The method called when we would like the visitor to evaluate its
     * corresponding method starting from the ASTNode subtype(s).
     * @param <S> The input type (type of state or context)
     * @param <T> The output type
     * @param v The visitor to be used with this tree.
     * @param state The context or state needed by the visitor
     * @return An instance of the generaic type T.
     * @throws FractalException
     */
    @Override
  public <S, T> T visit(Visitor<S, T> v, S state) throws FractalException {
    return v.visitASTFractal(this, state);
  }

}
