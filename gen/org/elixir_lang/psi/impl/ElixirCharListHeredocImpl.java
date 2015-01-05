// This is a generated file. Not intended for manual editing.
package org.elixir_lang.psi.impl;

import com.ericsson.otp.erlang.OtpErlangObject;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;
import org.elixir_lang.psi.ElixirCharListHeredoc;
import org.elixir_lang.psi.ElixirInterpolatedCharListBody;
import org.elixir_lang.psi.ElixirVisitor;
import org.jetbrains.annotations.NotNull;

public class ElixirCharListHeredocImpl extends ASTWrapperPsiElement implements ElixirCharListHeredoc {

  public ElixirCharListHeredocImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof ElixirVisitor) ((ElixirVisitor)visitor).visitCharListHeredoc(this);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public ElixirInterpolatedCharListBody getInterpolatedCharListBody() {
    return findNotNullChildByClass(ElixirInterpolatedCharListBody.class);
  }

  @NotNull
  public OtpErlangObject quote() {
    return ElixirPsiImplUtil.quote(this);
  }

}
