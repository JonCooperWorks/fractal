/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package fractal.semantics;

import java.util.EmptyStackException;
import fractal.sys.FractalRestoreException;
import cs34q.turtle.Turtle;
import fractal.syntax.ASTStatement;
import fractal.syntax.ASTDefine;
import fractal.syntax.ASTExp;
import fractal.syntax.ASTExpAdd;
import fractal.syntax.ASTExpDiv;
import fractal.syntax.ASTExpLit;
import fractal.syntax.ASTExpMod;
import fractal.syntax.ASTExpMul;
import fractal.syntax.ASTExpSub;
import fractal.syntax.ASTExpVar;
import fractal.syntax.ASTFracCompose;
import fractal.syntax.ASTFracSequence;
import fractal.syntax.ASTFracVar;
import fractal.syntax.ASTFracExp;
import fractal.syntax.ASTFractal;
import fractal.syntax.ASTRender;
import fractal.syntax.ASTRestoreStmt;
import fractal.syntax.ASTSaveStmt;
import fractal.syntax.ASTSelf;
import fractal.syntax.ASTSetLevel;
import fractal.syntax.ASTSetScale;
import fractal.syntax.ASTStmtSequence;
import fractal.syntax.ASTTCmdBack;
import fractal.syntax.ASTTCmdClear;
import fractal.syntax.ASTTCmdForward;
import fractal.syntax.ASTTCmdHome;
import fractal.syntax.ASTTCmdLeft;
import fractal.syntax.ASTTCmdPenDown;
import fractal.syntax.ASTTCmdPenUp;
import fractal.syntax.ASTTCmdRight;
import fractal.sys.FractalException;
import fractal.values.FractalValue;

/**
 *
 * @author newts
 */
public class FractalEvaluator extends AbstractFractalEvaluator {

    @Override
    public FractalValue visitASTStmtSequence(ASTStmtSequence seq, FractalState state) throws FractalException {
        System.out.println("StmtSequence");

        state.updateDisplay();

        for(ASTStatement stmt: seq.getSeq()) {
          stmt.visit(this, state);
        }
        return FractalValue.NO_VALUE;
    }

    @Override
    public FractalValue visitASTSaveStmt(ASTSaveStmt form, FractalState state) throws FractalException {
      System.out.println("SaveStmt");
      state.pushTurtle();
      return FractalValue.NO_VALUE;
    }

    @Override
    public FractalValue visitASTRestoreStmt(ASTRestoreStmt form, FractalState state) throws FractalException {
      System.out.println("RestoreStmt");
      try {
        state.popTurtle();
      }

      catch (EmptyStackException e) {
        throw new FractalRestoreException(); 
      }

      return FractalValue.NO_VALUE;

    }

    @Override
    public FractalValue visitASTRender(ASTRender form, FractalState state) throws FractalException {
      System.out.println("Render");
      ASTExp levelExp = form.getLevel();
      ASTExp scaleExp = form.getScale();
      ASTFracExp fracExp = form.getFractal();

      double level, scale;

      if (levelExp == null || scaleExp == null) {
        level = 9;
        scale = 100;
      }

      else {
        level = levelExp.visit(this, state).realValue();
        scale = scaleExp.visit(this, state).realValue();
      }

      
      return fracExp.visit(this, state);
    }

    @Override
    public FractalValue visitASTSetLevel(ASTSetLevel form, FractalState state) throws FractalException {
      System.out.println("Level");
      ASTExp levelExp = form.getLevel();
      FractalValue levelVal = levelExp.visit(this, state);
      int level = levelVal.intValue();
      state.setDefaultLevel(level);
      return FractalValue.NO_VALUE;
    }

    @Override
    public FractalValue visitASTSetScale(ASTSetScale form, FractalState state) throws FractalException {
      System.out.println("Scale");
      ASTExp scaleExp = form.getScale();
      FractalValue scaleVal = scaleExp.visit(this, state);
      int scale = scaleVal.intValue();
      state.setDefaultScale(scale);
      return FractalValue.NO_VALUE;
    }

    @Override
    public FractalValue visitASTDefine(ASTDefine form, FractalState state) throws FractalException {
      System.out.println("Define");
      Environment current = state.getEnvironment();
      FractalValue value = form.getValueExp().visit(this, state);
      current.put(form.getVar(), value);
      return value;
    }

    @Override
    public FractalValue visitASTFracSequence(ASTFracSequence form, FractalState state) throws FractalException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public FractalValue visitASTFracCompose(ASTFracCompose form, FractalState state) throws FractalException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public FractalValue visitASTFracVar(ASTFracVar form, FractalState state) throws FractalException {
      System.out.println("Fracvar");
      Environment current = state.getEnvironment();
      return current.get(form.getVar());
    }

    @Override
    public FractalValue visitASTFractal(ASTFractal form, FractalState state) throws FractalException {
      System.out.println("Fractal");
      for (ASTStatement stmt: form.getBody()) {
        stmt.visit(this, state);
      }

      return FractalValue.NO_VALUE;
    }

    @Override
    public FractalValue visitASTSelf(ASTSelf form, FractalState state) throws FractalException {
      System.out.println("Self");
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public FractalValue visitASTTCmdLeft(ASTTCmdLeft form, FractalState state) throws FractalException {
      System.out.println("Left");
      Turtle turtle = state.getTurtleState();
      FractalValue angleVal = form.visit(this, state);
      double angle = angleVal.realValue();
      turtle.deriveTurned(-1 * angle);
      return FractalValue.NO_VALUE;
    }

    @Override
    public FractalValue visitASTTCmdRight(ASTTCmdRight form, FractalState state) throws FractalException {
      System.out.println("Right");
      Turtle turtle = state.getTurtleState();
      FractalValue angleVal = form.visit(this, state);
      double angle = angleVal.realValue();
      turtle.deriveTurned(angle);
      return FractalValue.NO_VALUE;
    }

    @Override
    public FractalValue visitASTTCmdForward(ASTTCmdForward form, FractalState state) throws FractalException {
      System.out.println("Forward");
      FractalValue distVal = form.getLength().visit(this, state);
      Double dist = distVal.realValue() * state.getDefaultScale();
      state.getTurtleState().displace(dist);
      return FractalValue.NO_VALUE;
    }

    @Override
    public FractalValue visitASTTCmdBack(ASTTCmdBack form, FractalState state) throws FractalException {
      System.out.println("Back");
      FractalValue distVal = form.getLength().visit(this, state);
      Double dist = distVal.realValue() * state.getDefaultScale();
      state.getTurtleState().displace(-1 * dist);
      return FractalValue.NO_VALUE;
    }

    @Override
    public FractalValue visitASTTCmdPenDown(ASTTCmdPenDown form, FractalState state) throws FractalException {
      System.out.println("Pendown");
      Turtle turtle = state.getTurtleState();
      state.setTurtleState(new Turtle(turtle.getX(), turtle.getY(), turtle.getBearingInDegs(), true));
      return FractalValue.NO_VALUE;
    }

    @Override
    public FractalValue visitASTTCmdPenUp(ASTTCmdPenUp form, FractalState state) throws FractalException {
      System.out.println("Penup");
      Turtle turtle = state.getTurtleState();
      state.setTurtleState(new Turtle(turtle.getX(), turtle.getY(), turtle.getBearingInDegs(), true));
      return FractalValue.NO_VALUE;
    }

    @Override
    public FractalValue visitASTTCmdClear(ASTTCmdClear form, FractalState state) throws FractalException {
      System.out.println("Clear");
      state.getDisplay().clear();
      return FractalValue.NO_VALUE;
    }

    @Override
    public FractalValue visitASTTCmdHome(ASTTCmdHome form, FractalState state) throws FractalException {
      System.out.println("Home");
      Turtle turtle = state.getTurtleState();
      turtle.home();
      return FractalValue.NO_VALUE;
    }

    @Override
    public FractalValue visitASTExpAdd(ASTExpAdd form, FractalState state) throws FractalException {
      System.out.println("Add");
      FractalValue first = form.getFirst().visit(this, state);
      FractalValue second = form.getSecond().visit(this, state);
      return first.add(second);
    }

    @Override
    public FractalValue visitASTExpSub(ASTExpSub form, FractalState state) throws FractalException {
      System.out.println("Sub");
      FractalValue first = form.getFirst().visit(this, state);
      FractalValue second = form.getSecond().visit(this, state);
      return first.sub(second);
    }

    @Override
    public FractalValue visitASTExpMul(ASTExpMul form, FractalState state) throws FractalException {
      System.out.println("Mul");
      FractalValue first = form.getFirst().visit(this, state);
      FractalValue second = form.getSecond().visit(this, state);
      return first.mul(second);
    }

    @Override
    public FractalValue visitASTExpDiv(ASTExpDiv form, FractalState state) throws FractalException {
      System.out.println("Div");
      FractalValue first = form.getFirst().visit(this, state);
      FractalValue second = form.getSecond().visit(this, state);
      return first.div(second);
    }

    @Override
    public FractalValue visitASTExpMod(ASTExpMod form, FractalState state) throws FractalException {
      System.out.println("Mod");
      FractalValue first = form.getFirst().visit(this, state);
      FractalValue second = form.getSecond().visit(this, state);
      return first.mod(second);
    }

    @Override
    public FractalValue visitASTExpLit(ASTExpLit form, FractalState state) throws FractalException {
      System.out.println("Lit");
      return form.getValue();
    }

    @Override
    public FractalValue visitASTExpVar(ASTExpVar form, FractalState state) throws FractalException {
      System.out.println("Var");
      Environment current = state.getEnvironment();
      return current.get(form.getVar());
    }
    
}
