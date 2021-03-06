// This is a generated file. Not intended for manual editing.
package net.masterthought.dlanguage.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static net.masterthought.dlanguage.psi.DLanguageTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import net.masterthought.dlanguage.psi.*;

public class DLanguageWhileStatementImpl extends ASTWrapperPsiElement implements DLanguageWhileStatement {

  public DLanguageWhileStatementImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull DLanguageVisitor visitor) {
    visitor.visitWhileStatement(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof DLanguageVisitor) accept((DLanguageVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public DLanguageCommaExpression getCommaExpression() {
    return PsiTreeUtil.getChildOfType(this, DLanguageCommaExpression.class);
  }

  @Override
  @Nullable
  public DLanguageScopeStatement getScopeStatement() {
    return PsiTreeUtil.getChildOfType(this, DLanguageScopeStatement.class);
  }

  @Override
  @NotNull
  public PsiElement getKwWhile() {
    return notNullChild(findChildByType(KW_WHILE));
  }

  @Override
  @Nullable
  public PsiElement getOpParLeft() {
    return findChildByType(OP_PAR_LEFT);
  }

  @Override
  @Nullable
  public PsiElement getOpParRight() {
    return findChildByType(OP_PAR_RIGHT);
  }

}
