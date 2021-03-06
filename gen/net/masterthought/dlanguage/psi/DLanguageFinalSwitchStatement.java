// This is a generated file. Not intended for manual editing.
package net.masterthought.dlanguage.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface DLanguageFinalSwitchStatement extends PsiElement {

  @Nullable
  DLanguageCommaExpression getCommaExpression();

  @Nullable
  DLanguageScopeStatement getScopeStatement();

  @NotNull
  PsiElement getKwFinal();

  @NotNull
  PsiElement getKwSwitch();

  @Nullable
  PsiElement getOpParLeft();

  @Nullable
  PsiElement getOpParRight();

  //WARNING: processDeclarations(...) is skipped
  //matching processDeclarations(DLanguageFinalSwitchStatement, ...)
  //methods are not found in DPsiImplUtil

}
