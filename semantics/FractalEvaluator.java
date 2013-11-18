/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package fractal.semantics;

import fractal.syntax.ASTDefine;
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
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public FractalValue visitASTSaveStmt(ASTSaveStmt form, FractalState state) throws FractalException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public FractalValue visitASTRestoreStmt(ASTRestoreStmt form, FractalState state) throws FractalException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public FractalValue visitASTRender(ASTRender form, FractalState state) throws FractalException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public FractalValue visitASTSetLevel(ASTSetLevel form, FractalState state) throws FractalException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public FractalValue visitASTSetScale(ASTSetScale form, FractalState state) throws FractalException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public FractalValue visitASTDefine(ASTDefine form, FractalState state) throws FractalException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public FractalValue visitASTFractal(ASTFractal form, FractalState state) throws FractalException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public FractalValue visitASTSelf(ASTSelf form, FractalState state) throws FractalException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public FractalValue visitASTTCmdLeft(ASTTCmdLeft form, FractalState state) throws FractalException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public FractalValue visitASTTCmdRight(ASTTCmdRight form, FractalState state) throws FractalException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public FractalValue visitASTTCmdForward(ASTTCmdForward form, FractalState state) throws FractalException {
      FractalValue distVal = form.getLength().visit(this, state);
      Double dist = distVal.realValue() * state.getDefaultScale();
      state.getTurtleState().displace(dist);
      return FractalValue.NO_VALUE;
    }

    @Override
    public FractalValue visitASTTCmdBack(ASTTCmdBack form, FractalState state) throws FractalException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public FractalValue visitASTTCmdPenDown(ASTTCmdPenDown form, FractalState state) throws FractalException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public FractalValue visitASTTCmdPenUp(ASTTCmdPenUp form, FractalState state) throws FractalException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public FractalValue visitASTTCmdClear(ASTTCmdClear form, FractalState state) throws FractalException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public FractalValue visitASTTCmdHome(ASTTCmdHome form, FractalState state) throws FractalException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public FractalValue visitASTExpAdd(ASTExpAdd form, FractalState state) throws FractalException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public FractalValue visitASTExpSub(ASTExpSub form, FractalState state) throws FractalException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public FractalValue visitASTExpMul(ASTExpMul form, FractalState state) throws FractalException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public FractalValue visitASTExpDiv(ASTExpDiv form, FractalState state) throws FractalException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public FractalValue visitASTExpMod(ASTExpMod form, FractalState state) throws FractalException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public FractalValue visitASTExpLit(ASTExpLit form, FractalState state) throws FractalException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public FractalValue visitASTExpVar(ASTExpVar form, FractalState state) throws FractalException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
