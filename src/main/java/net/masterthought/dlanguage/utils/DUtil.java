package net.masterthought.dlanguage.utils;

import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiFile;
import com.intellij.psi.PsiNamedElement;
import com.intellij.psi.util.PsiTreeUtil;
import net.masterthought.dlanguage.psi.*;
import net.masterthought.dlanguage.psi.interfaces.*;
import org.jetbrains.annotations.NotNull;

import java.util.*;

import static net.masterthought.dlanguage.psi.impl.DPsiImplUtil.findParentOfType;
import static net.masterthought.dlanguage.psi.interfaces.HasVisibility.Visibility.*;

/**
 * General util class. Provides methods for finding named nodes in the Psi tree.
 */
public class DUtil {

    public static Map<Boolean, PsiElement> findElementInParent(PsiElement identifier, Class className) {
        PsiElement result = findParentOfType(identifier, className);
        Map<Boolean, PsiElement> map = new HashMap<>();
        map.put(result != null, result);
        return map;
    }

    public static Boolean elementHasParentFor(Map<Boolean, PsiElement> result) {
        return result.containsKey(true);
    }

    public static PsiElement getElementFor(Map<Boolean, PsiElement> result) {
        return (PsiElement) result.values().toArray()[0];
    }


    /**
     * Tells whether a named node is a definition node based on its context.
     * <p/>
     * Precondition: Element is in a Haskell file.
     */
    public static boolean definitionNode(@NotNull PsiNamedElement e) {
        if (e instanceof DLanguageIdentifier) return definitionNode((DLanguageIdentifier) e);
        return e instanceof Declaration;
    }

    public static boolean definitionNode(@NotNull DLanguageIdentifier e) {
        return true;
    }

//    public static boolean definitionNode(@NotNull DDefinitionClass e) {
//        return true;
//    }


    /**
     * Tells whether a node is a definition node based on its context.
     */
    public static boolean definitionNode(@NotNull ASTNode node) {
        final PsiElement element = node.getPsi();
        return element instanceof PsiNamedElement && definitionNode((PsiNamedElement) element);
    }

    public static boolean isNotNullOrEmpty(String str) {
        return (str != null && !str.isEmpty());
    }

//    @Nullable
//    public static String getQualifiedPrefix(@NotNull PsiElement e) {
//        final PsiElement q = PsiTreeUtil.getParentOfType(e, DLanguageFuncDeclaration.class);
//        if (q == null) {
//            return null;
//        }
//        final String qText = q.getText();
//        final int lastDotPos = qText.lastIndexOf('.');
//        if (lastDotPos == -1) {
//            return null;
//        }
//        return qText.substring(0, lastDotPos);
//    }

//    @NotNull
//    public static Set<String> getPotentialDefinitionModuleNames(@NotNull PsiElement e, @NotNull List<String> imports) {
//        final String qPrefix = getQualifiedPrefix(e);
//        if (qPrefix == null) { return DPsiUtil.getImportModuleNames(imports); }
//        Set<String> result = new HashSet<String>();
//        for (DPsiUtil.Import anImport : imports) {
//            if (qPrefix.equals(anImport.module) || qPrefix.equals(anImport.alias)) {
//                result.add(anImport.module);
//            }
//        }
//        return result;
//    }


    public static boolean isDunitTestFile(PsiFile psiFile) {
        Collection<DLanguageClassDeclaration> cds = PsiTreeUtil.findChildrenOfType(psiFile, DLanguageClassDeclaration.class);
        for (DLanguageClassDeclaration cd : cds) {
            // if a class contains the UnitTest mixin assume its a valid d-unit test class
            Collection<DLanguageTemplateMixin> tmis = PsiTreeUtil.findChildrenOfType(cd, DLanguageTemplateMixin.class);
            for (DLanguageTemplateMixin tmi : tmis) {
                if (tmi.getText().contains("UnitTest")) {
                    return true;
                }
            }
        }
        return false;
    }

    /**
     * @param namedElement constructor, or method contained within a class or struct
     * @return the class or struct containing this constructor/method. returns null if not found
     */
    public static DNamedElement getParentClassOrStruct(PsiElement namedElement) {
        return PsiTreeUtil.getParentOfType(namedElement, DLanguageClassDeclaration.class, DLanguageStructDeclaration.class);
    }

    public static DLanguageFuncDeclaration getParentFunction(PsiElement namedElement){
        return PsiTreeUtil.getParentOfType(namedElement,DLanguageFuncDeclaration.class);
    }

//    public static boolean isPublic(DNamedElement symbol) {
//        //search for "public:" and "public{}"
//        final DLanguageProtectionAttribute protectionAttribute = findChildOfType(symbol, DLanguageProtectionAttribute.class);
//        try {
//            if (protectionAttribute.getText().equals("public")) {
//                return true;
//            }
//        } catch (NullPointerException ignored) {
//        }
//        return searchForPublicWrapper(symbol);
//    }
//
//    private static boolean searchForPublicWrapper(DNamedElement symbol) {
//        return searchForPublic(symbol);
//    }
//
//    private static boolean searchForPublic(PsiElement symbol) {
//        if (symbol instanceof DLanguageAttributeSpecifier)
//            if (((DLanguageAttributeSpecifier) symbol).getAttribute().getProtectionAttribute() != null && ((DLanguageAttributeSpecifier) symbol).getAttribute().getProtectionAttribute().getText().equals("public"))
//                return true;
//        if (symbol instanceof DLanguageClassDeclaration || symbol instanceof DLanguageTemplateInstance || symbol instanceof DLanguageModuleDeclaration || symbol instanceof DLanguageFuncDeclaration || symbol instanceof DLanguageInterface || symbol instanceof DLanguageStructDeclaration)
//            return false;
//        if (symbol == null)
//            return false;
//        if (null != findChildOfType(symbol, DLanguageModuleDeclaration.class))
//            return false;
//        return searchForPublic(symbol.getParent());
//    }

    public static <T extends HasVisibility> List<T> getPublicElements(List<T> elements) {
        List<T> res = new ArrayList<>();
        for (T element : elements) {
            if (element.isPublic()) {
                res.add(element);
            }
        }
        return res;
    }

    public static <T extends HasVisibility> List<T> getProtectedElements(List<T> elements) {
        List<T> res = new ArrayList<>();
        for (T element : elements) {
            if (element.isPublic()) {
                res.add(element);
            }
        }
        return res;
    }

    public static <T extends HasVisibility> List<T> getPrivateElements(List<T> elements) {
        List<T> res = new ArrayList<>();
        for (T element : elements) {
            if (element.isPublic()) {
                res.add(element);
            }
        }
        return res;
    }

    public static <T extends HasProperty> List<T> getElementsWithAtProperty(List<T> elements) {
        List<T> res = new ArrayList<>();
        for (T element : elements) {
            if (element.isPropertyFunction()) {
                res.add(element);
            }
        }
        return res;
    }

    @NotNull
    public static PsiElement getTopLevelOfRecursiveElement(PsiElement element, Class<? extends PsiElement> tClass) {
        if (!tClass.isInstance(element.getParent()))
            return element;
        return getTopLevelOfRecursiveElement(element.getParent(), tClass);
    }

    @NotNull
    public static DLanguageIdentifier getEndOfIdentifierList(DLanguageQualifiedIdentifierList list) {
        return (DLanguageIdentifier) (list.getChildren()[list.getChildren().length - 1]);//if not identifier through
    }

    @NotNull
    public static DLanguageIdentifier getEndOfIdentifierList(DLanguageModuleFullyQualifiedName list) {
        if (list.getModuleFullyQualifiedName() == null) {
            return list.getIdentifier();
        }
        return getEndOfIdentifierList(list.getModuleFullyQualifiedName());
    }

    @NotNull
    public static DLanguageIdentifier getEndOfIdentifierList(DLanguageIdentifierList list) {
        if (list.getIdentifierList() == null) {
            return list.getIdentifier();
        }
        return getEndOfIdentifierList(list.getIdentifierList());
    }

    static List<Mixin> getMixins(PsiElement elementToSearch) {
        List<Mixin> mixins = new ArrayList<>();
        if (elementToSearch instanceof DLanguageMixinDeclaration) {
            final DLanguageMixinDeclaration mixin = (DLanguageMixinDeclaration) elementToSearch;
            mixins.add(mixin);
        }
        if (elementToSearch instanceof DLanguageTemplateMixin) {
            final DLanguageTemplateMixin mixin = (DLanguageTemplateMixin) elementToSearch;
            mixins.add(mixin);
        }
        if (elementToSearch instanceof DLanguageMixinExpression) {
            final DLanguageMixinExpression mixin = (DLanguageMixinExpression) elementToSearch;
            mixins.add(mixin);
        }
        if (elementToSearch instanceof DLanguageMixinStatement) {
            final DLanguageMixinStatement mixin = (DLanguageMixinStatement) elementToSearch;
            mixins.add(mixin);
        }
        return mixins;
    }

    public static HasVisibility.Visibility protectionToVisibilty(DLanguageProtectionAttribute protectionAttribute) {
        final String text = protectionAttribute.getText();
        if (text.equals("private"))
            return private_;
        if (text.equals("public"))
            return public_;
        if (text.equals("protected"))
            return protected_;
        throw new IllegalArgumentException(protectionAttribute.toString() + protectionAttribute.getText());
    }

    public static HasVisibility.Visibility protectionToVisibilty(String text) {
        if (text.equals("private"))
            return private_;
        if (text.equals("public"))
            return public_;
        if (text.equals("protected"))
            return protected_;
        throw new IllegalArgumentException(text);

    }
}

