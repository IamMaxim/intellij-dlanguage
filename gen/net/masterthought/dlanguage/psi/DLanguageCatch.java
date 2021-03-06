// This is a generated file. Not intended for manual editing.
package net.masterthought.dlanguage.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface DLanguageCatch extends PsiElement {

  @NotNull
  DLanguageCatchParameter getCatchParameter();

  @Nullable
  DLanguageStatement getStatement();

  @NotNull
  PsiElement getKwCatch();

  @NotNull
  PsiElement getOpParLeft();

  @Nullable
  PsiElement getOpParRight();

  //WARNING: processDeclarations(...) is skipped
  //matching processDeclarations(DLanguageCatch, ...)
  //methods are not found in DPsiImplUtil

}
