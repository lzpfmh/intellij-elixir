// This is a generated file. Not intended for manual editing.
package org.elixir_lang.psi.impl;

import com.ericsson.otp.erlang.OtpErlangObject;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import org.elixir_lang.psi.*;
import org.jetbrains.annotations.NotNull;

import java.util.List;

public class ElixirUnmatchedInOperationImpl extends ElixirUnmatchedExpressionImpl implements ElixirUnmatchedInOperation {

  public ElixirUnmatchedInOperationImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof ElixirVisitor) ((ElixirVisitor)visitor).visitUnmatchedInOperation(this);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public ElixirInInfixOperator getInInfixOperator() {
    return findNotNullChildByClass(ElixirInInfixOperator.class);
  }

  @Override
  @NotNull
  public List<ElixirUnmatchedExpression> getUnmatchedExpressionList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, ElixirUnmatchedExpression.class);
  }

  @NotNull
  public Quotable leftOperand() {
    return ElixirPsiImplUtil.leftOperand(this);
  }

  @NotNull
  public Operator operator() {
    return ElixirPsiImplUtil.operator(this);
  }

  @NotNull
  public OtpErlangObject quote() {
    return ElixirPsiImplUtil.quote(this);
  }

  @NotNull
  public Quotable rightOperand() {
    return ElixirPsiImplUtil.rightOperand(this);
  }

}
