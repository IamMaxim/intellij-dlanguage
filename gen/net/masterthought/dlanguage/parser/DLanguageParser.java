// This is a generated file. Not intended for manual editing.
package net.masterthought.dlanguage.parser;

import com.intellij.lang.PsiBuilder;
import com.intellij.lang.PsiBuilder.Marker;
import static net.masterthought.dlanguage.psi.DLanguageTypes.*;
import static com.intellij.lang.parser.GeneratedParserUtilBase.*;
import com.intellij.psi.tree.IElementType;
import com.intellij.lang.ASTNode;
import com.intellij.psi.tree.TokenSet;
import com.intellij.lang.PsiParser;
import com.intellij.lang.LightPsiParser;

@SuppressWarnings({"SimplifiableIfStatement", "UnusedAssignment"})
public class DLanguageParser implements PsiParser, LightPsiParser {

  public ASTNode parse(IElementType t, PsiBuilder b) {
    parseLight(t, b);
    return b.getTreeBuilt();
  }

  public void parseLight(IElementType t, PsiBuilder b) {
    boolean r;
    b = adapt_builder_(t, b, this, null);
    Marker m = enter_section_(b, 0, _COLLAPSE_, null);
    if (t == ADD_EXPRESSION_) {
      r = AddExpression_(b, 0);
    }
    else if (t == AGGREGATE_BODY) {
      r = AggregateBody(b, 0);
    }
    else if (t == AGGREGATE_DECLARATION) {
      r = AggregateDeclaration(b, 0);
    }
    else if (t == ALIAS_DECLARATION) {
      r = AliasDeclaration(b, 0);
    }
    else if (t == ALIAS_DECLARATION_X) {
      r = AliasDeclarationX(b, 0);
    }
    else if (t == ALIAS_DECLARATION_Y) {
      r = AliasDeclarationY(b, 0);
    }
    else if (t == ALIAS_THIS) {
      r = AliasThis(b, 0);
    }
    else if (t == ALIGN_ATTRIBUTE) {
      r = AlignAttribute(b, 0);
    }
    else if (t == ALLOCATOR) {
      r = Allocator(b, 0);
    }
    else if (t == ALLOCATOR_ARGUMENTS) {
      r = AllocatorArguments(b, 0);
    }
    else if (t == ALT_DECLARATOR) {
      r = AltDeclarator(b, 0);
    }
    else if (t == ALT_DECLARATOR_IDENTIFIER) {
      r = AltDeclaratorIdentifier(b, 0);
    }
    else if (t == ALT_DECLARATOR_SUFFIX) {
      r = AltDeclaratorSuffix(b, 0);
    }
    else if (t == ALT_DECLARATOR_SUFFIXES) {
      r = AltDeclaratorSuffixes(b, 0);
    }
    else if (t == ALT_DECLARATOR_X) {
      r = AltDeclaratorX(b, 0);
    }
    else if (t == ALT_FUNC_DECLARATOR_SUFFIX) {
      r = AltFuncDeclaratorSuffix(b, 0);
    }
    else if (t == AND_EXXPRESSION_) {
      r = AndExxpression_(b, 0);
    }
    else if (t == ANON_UNION_DECLARATION) {
      r = AnonUnionDeclaration(b, 0);
    }
    else if (t == ANONYMOUS_ENUM_DECLARATION) {
      r = AnonymousEnumDeclaration(b, 0);
    }
    else if (t == ARGUMENT_LIST) {
      r = ArgumentList(b, 0);
    }
    else if (t == ARRAY_INITIALIZER) {
      r = ArrayInitializer(b, 0);
    }
    else if (t == ARRAY_LITERAL) {
      r = ArrayLiteral(b, 0);
    }
    else if (t == ARRAY_MEMBER_INITIALIZATION) {
      r = ArrayMemberInitialization(b, 0);
    }
    else if (t == ARRAY_MEMBER_INITIALIZATIONS) {
      r = ArrayMemberInitializations(b, 0);
    }
    else if (t == ASM_ADD_EXP) {
      r = AsmAddExp(b, 0);
    }
    else if (t == ASM_AND_EXP) {
      r = AsmAndExp(b, 0);
    }
    else if (t == ASM_BR_EXP) {
      r = AsmBrExp(b, 0);
    }
    else if (t == ASM_EQUAL_EXP) {
      r = AsmEqualExp(b, 0);
    }
    else if (t == ASM_EXP) {
      r = AsmExp(b, 0);
    }
    else if (t == ASM_INSTRUCTION) {
      r = AsmInstruction(b, 0);
    }
    else if (t == ASM_INSTRUCTION_LIST) {
      r = AsmInstructionList(b, 0);
    }
    else if (t == ASM_LOG_AND_EXP) {
      r = AsmLogAndExp(b, 0);
    }
    else if (t == ASM_LOG_OR_EXP) {
      r = AsmLogOrExp(b, 0);
    }
    else if (t == ASM_MUL_EXP) {
      r = AsmMulExp(b, 0);
    }
    else if (t == ASM_OR_EXP) {
      r = AsmOrExp(b, 0);
    }
    else if (t == ASM_PRIMARY_EXP) {
      r = AsmPrimaryExp(b, 0);
    }
    else if (t == ASM_REL_EXP) {
      r = AsmRelExp(b, 0);
    }
    else if (t == ASM_SHIFT_EXP) {
      r = AsmShiftExp(b, 0);
    }
    else if (t == ASM_STATEMENT) {
      r = AsmStatement(b, 0);
    }
    else if (t == ASM_TYPE_PREFIX) {
      r = AsmTypePrefix(b, 0);
    }
    else if (t == ASM_UNA_EXP) {
      r = AsmUnaExp(b, 0);
    }
    else if (t == ASM_XOR_EXP) {
      r = AsmXorExp(b, 0);
    }
    else if (t == ASSERT_EXPRESSION) {
      r = AssertExpression(b, 0);
    }
    else if (t == ASSIGN_EXPRESSION) {
      r = AssignExpression(b, 0);
    }
    else if (t == ASSOC_ARRAY_LITERAL) {
      r = AssocArrayLiteral(b, 0);
    }
    else if (t == ATTRIBUTE) {
      r = Attribute(b, 0);
    }
    else if (t == ATTRIBUTE_SPECIFIER) {
      r = AttributeSpecifier(b, 0);
    }
    else if (t == AUTO_DECLARATION) {
      r = AutoDeclaration(b, 0);
    }
    else if (t == AUTO_DECLARATION_X) {
      r = AutoDeclarationX(b, 0);
    }
    else if (t == AUTO_DECLARATION_Y) {
      r = AutoDeclarationY(b, 0);
    }
    else if (t == BASE_CLASS_LIST) {
      r = BaseClassList(b, 0);
    }
    else if (t == BASE_INTERFACE_LIST) {
      r = BaseInterfaceList(b, 0);
    }
    else if (t == BASIC_TYPE) {
      r = BasicType(b, 0);
    }
    else if (t == BASIC_TYPE_2) {
      r = BasicType2(b, 0);
    }
    else if (t == BASIC_TYPE_2_X) {
      r = BasicType2X(b, 0);
    }
    else if (t == BASIC_TYPE_X) {
      r = BasicTypeX(b, 0);
    }
    else if (t == BLOCK_STATEMENT) {
      r = BlockStatement(b, 0);
    }
    else if (t == BODY_STATEMENT) {
      r = BodyStatement(b, 0);
    }
    else if (t == BREAK_STATEMENT) {
      r = BreakStatement(b, 0);
    }
    else if (t == CASE_RANGE_STATEMENT) {
      r = CaseRangeStatement(b, 0);
    }
    else if (t == CASE_STATEMENT) {
      r = CaseStatement(b, 0);
    }
    else if (t == CAST_EXPRESSION) {
      r = CastExpression(b, 0);
    }
    else if (t == CATCH) {
      r = Catch(b, 0);
    }
    else if (t == CATCH_PARAMETER) {
      r = CatchParameter(b, 0);
    }
    else if (t == CATCHES) {
      r = Catches(b, 0);
    }
    else if (t == CLASS_ARGUMENTS) {
      r = ClassArguments(b, 0);
    }
    else if (t == CLASS_DECLARATION) {
      r = ClassDeclaration(b, 0);
    }
    else if (t == CLASS_TEMPLATE_DECLARATION) {
      r = ClassTemplateDeclaration(b, 0);
    }
    else if (t == COMMA_EXPRESSION) {
      r = CommaExpression(b, 0);
    }
    else if (t == CONDITION) {
      r = Condition(b, 0);
    }
    else if (t == CONDITIONAL_DECLARATION) {
      r = ConditionalDeclaration(b, 0);
    }
    else if (t == CONDITIONAL_EXPRESSION_) {
      r = ConditionalExpression_(b, 0);
    }
    else if (t == CONDITIONAL_STATEMENT) {
      r = ConditionalStatement(b, 0);
    }
    else if (t == CONSTRAINT) {
      r = Constraint(b, 0);
    }
    else if (t == CONSTRUCTOR) {
      r = Constructor(b, 0);
    }
    else if (t == CONSTRUCTOR_TEMPLATE) {
      r = ConstructorTemplate(b, 0);
    }
    else if (t == CONTINUE_STATEMENT) {
      r = ContinueStatement(b, 0);
    }
    else if (t == DEALLOCATOR) {
      r = Deallocator(b, 0);
    }
    else if (t == DEBUG_CONDITION) {
      r = DebugCondition(b, 0);
    }
    else if (t == DEBUG_SPECIFICATION) {
      r = DebugSpecification(b, 0);
    }
    else if (t == DECL_DEF) {
      r = DeclDef(b, 0);
    }
    else if (t == DECL_DEFS) {
      r = DeclDefs(b, 0);
    }
    else if (t == DECLARATION) {
      r = Declaration(b, 0);
    }
    else if (t == DECLARATION_BLOCK) {
      r = DeclarationBlock(b, 0);
    }
    else if (t == DECLARATION_STATEMENT) {
      r = DeclarationStatement(b, 0);
    }
    else if (t == DECLARATOR) {
      r = Declarator(b, 0);
    }
    else if (t == DECLARATOR_IDENTIFIER) {
      r = DeclaratorIdentifier(b, 0);
    }
    else if (t == DECLARATOR_IDENTIFIER_LIST) {
      r = DeclaratorIdentifierList(b, 0);
    }
    else if (t == DECLARATOR_INITIALIZER) {
      r = DeclaratorInitializer(b, 0);
    }
    else if (t == DECLARATORS) {
      r = Declarators(b, 0);
    }
    else if (t == DEFAULT_STATEMENT) {
      r = DefaultStatement(b, 0);
    }
    else if (t == DELETE_EXPRESSION) {
      r = DeleteExpression(b, 0);
    }
    else if (t == DEPRECATED_ATTRIBUTE) {
      r = DeprecatedAttribute(b, 0);
    }
    else if (t == DESTRUCTOR) {
      r = Destructor(b, 0);
    }
    else if (t == DO_STATEMENT) {
      r = DoStatement(b, 0);
    }
    else if (t == DOT_IDENTIFIER) {
      r = DotIdentifier(b, 0);
    }
    else if (t == ELSE_STATEMENT) {
      r = ElseStatement(b, 0);
    }
    else if (t == ENUM_BASE_TYPE) {
      r = EnumBaseType(b, 0);
    }
    else if (t == ENUM_BODY) {
      r = EnumBody(b, 0);
    }
    else if (t == ENUM_DECLARATION) {
      r = EnumDeclaration(b, 0);
    }
    else if (t == ENUM_FUNC_DECLARATION) {
      r = EnumFuncDeclaration(b, 0);
    }
    else if (t == ENUM_MEMBER) {
      r = EnumMember(b, 0);
    }
    else if (t == ENUM_MEMBERS) {
      r = EnumMembers(b, 0);
    }
    else if (t == EQUAL_EXPRESSION) {
      r = EqualExpression(b, 0);
    }
    else if (t == EXPRESSION_STATEMENT) {
      r = ExpressionStatement(b, 0);
    }
    else if (t == FINAL_SWITCH_STATEMENT) {
      r = FinalSwitchStatement(b, 0);
    }
    else if (t == FINALLY_STATEMENT) {
      r = FinallyStatement(b, 0);
    }
    else if (t == FIRST_EXP) {
      r = FirstExp(b, 0);
    }
    else if (t == FOR_STATEMENT) {
      r = ForStatement(b, 0);
    }
    else if (t == FOREACH) {
      r = Foreach(b, 0);
    }
    else if (t == FOREACH_AGGREGATE) {
      r = ForeachAggregate(b, 0);
    }
    else if (t == FOREACH_RANGE_STATEMENT) {
      r = ForeachRangeStatement(b, 0);
    }
    else if (t == FOREACH_STATEMENT) {
      r = ForeachStatement(b, 0);
    }
    else if (t == FOREACH_TYPE) {
      r = ForeachType(b, 0);
    }
    else if (t == FOREACH_TYPE_ATTRIBUTE) {
      r = ForeachTypeAttribute(b, 0);
    }
    else if (t == FOREACH_TYPE_ATTRIBUTES) {
      r = ForeachTypeAttributes(b, 0);
    }
    else if (t == FOREACH_TYPE_LIST) {
      r = ForeachTypeList(b, 0);
    }
    else if (t == FUNC_DECLARATION) {
      r = FuncDeclaration(b, 0);
    }
    else if (t == FUNC_DECLARATOR_SUFFIX) {
      r = FuncDeclaratorSuffix(b, 0);
    }
    else if (t == FUNCTION_ATTRIBUTE) {
      r = FunctionAttribute(b, 0);
    }
    else if (t == FUNCTION_ATTRIBUTES) {
      r = FunctionAttributes(b, 0);
    }
    else if (t == FUNCTION_BODY) {
      r = FunctionBody(b, 0);
    }
    else if (t == FUNCTION_CONTRACTS) {
      r = FunctionContracts(b, 0);
    }
    else if (t == FUNCTION_LITERAL) {
      r = FunctionLiteral(b, 0);
    }
    else if (t == FUNCTION_LITERAL_BODY) {
      r = FunctionLiteralBody(b, 0);
    }
    else if (t == GOTO_STATEMENT) {
      r = GotoStatement(b, 0);
    }
    else if (t == IDENTIFIER) {
      r = Identifier(b, 0);
    }
    else if (t == IDENTIFIER_LIST) {
      r = IdentifierList(b, 0);
    }
    else if (t == IDENTITY_EXPRESSION) {
      r = IdentityExpression(b, 0);
    }
    else if (t == IF_CONDITION) {
      r = IfCondition(b, 0);
    }
    else if (t == IF_STATEMENT) {
      r = IfStatement(b, 0);
    }
    else if (t == IMPORT) {
      r = Import(b, 0);
    }
    else if (t == IMPORT_BIND) {
      r = ImportBind(b, 0);
    }
    else if (t == IMPORT_BIND_LIST) {
      r = ImportBindList(b, 0);
    }
    else if (t == IMPORT_DECLARATION) {
      r = ImportDeclaration(b, 0);
    }
    else if (t == IMPORT_EXPRESSION) {
      r = ImportExpression(b, 0);
    }
    else if (t == IMPORT_LIST) {
      r = ImportList(b, 0);
    }
    else if (t == IN_EXPRESSION) {
      r = InExpression(b, 0);
    }
    else if (t == IN_OUT) {
      r = InOut(b, 0);
    }
    else if (t == IN_OUT_X) {
      r = InOutX(b, 0);
    }
    else if (t == IN_STATEMENT) {
      r = InStatement(b, 0);
    }
    else if (t == INCREMENT) {
      r = Increment(b, 0);
    }
    else if (t == INDEX_EXPRESSION) {
      r = IndexExpression(b, 0);
    }
    else if (t == INITIALIZE) {
      r = Initialize(b, 0);
    }
    else if (t == INITIALIZER) {
      r = Initializer(b, 0);
    }
    else if (t == INTEGER_EXPRESSION) {
      r = IntegerExpression(b, 0);
    }
    else if (t == INTERFACE) {
      r = Interface(b, 0);
    }
    else if (t == INTERFACE_DECLARATION) {
      r = InterfaceDeclaration(b, 0);
    }
    else if (t == INTERFACE_TEMPLATE_DECLARATION) {
      r = InterfaceTemplateDeclaration(b, 0);
    }
    else if (t == INTERFACES) {
      r = Interfaces(b, 0);
    }
    else if (t == INVARIANT) {
      r = Invariant(b, 0);
    }
    else if (t == IS_EXPRESSION) {
      r = IsExpression(b, 0);
    }
    else if (t == KEY_VALUE_PAIR) {
      r = KeyValuePair(b, 0);
    }
    else if (t == KEY_VALUE_PAIRS) {
      r = KeyValuePairs(b, 0);
    }
    else if (t == LABELED_STATEMENT) {
      r = LabeledStatement(b, 0);
    }
    else if (t == LAMBDA) {
      r = Lambda(b, 0);
    }
    else if (t == LAST_CATCH) {
      r = LastCatch(b, 0);
    }
    else if (t == LAST_EXP) {
      r = LastExp(b, 0);
    }
    else if (t == LINKAGE_ATTRIBUTE) {
      r = LinkageAttribute(b, 0);
    }
    else if (t == LINKAGE_TYPE) {
      r = LinkageType(b, 0);
    }
    else if (t == LWR_EXPRESSION) {
      r = LwrExpression(b, 0);
    }
    else if (t == MEMBER_FUNCTION_ATTRIBUTE) {
      r = MemberFunctionAttribute(b, 0);
    }
    else if (t == MEMBER_FUNCTION_ATTRIBUTES) {
      r = MemberFunctionAttributes(b, 0);
    }
    else if (t == MIXIN_DECLARATION) {
      r = MixinDeclaration(b, 0);
    }
    else if (t == MIXIN_EXPRESSION) {
      r = MixinExpression(b, 0);
    }
    else if (t == MIXIN_STATEMENT) {
      r = MixinStatement(b, 0);
    }
    else if (t == MIXIN_TEMPLATE_NAME) {
      r = MixinTemplateName(b, 0);
    }
    else if (t == MODULE_DECLARATION) {
      r = ModuleDeclaration(b, 0);
    }
    else if (t == MODULE_FULLY_QUALIFIED_NAME) {
      r = ModuleFullyQualifiedName(b, 0);
    }
    else if (t == MUL_EXPRESSION_) {
      r = MulExpression_(b, 0);
    }
    else if (t == MULTIPLE_ASSIGN) {
      r = MultipleAssign(b, 0);
    }
    else if (t == NEW_ANON_CLASS_EXPRESSION) {
      r = NewAnonClassExpression(b, 0);
    }
    else if (t == NEW_EXPRESSION) {
      r = NewExpression(b, 0);
    }
    else if (t == NEW_EXPRESSION_WITH_ARGS) {
      r = NewExpressionWithArgs(b, 0);
    }
    else if (t == NON_EMPTY_STATEMENT) {
      r = NonEmptyStatement(b, 0);
    }
    else if (t == NON_EMPTY_STATEMENT_NO_CASE_NO_DEFAULT) {
      r = NonEmptyStatementNoCaseNoDefault(b, 0);
    }
    else if (t == NON_VOID_INITIALIZER) {
      r = NonVoidInitializer(b, 0);
    }
    else if (t == OPCODE) {
      r = Opcode(b, 0);
    }
    else if (t == OPERAND) {
      r = Operand(b, 0);
    }
    else if (t == OPERANDS) {
      r = Operands(b, 0);
    }
    else if (t == OR_OR_EXPRESSION) {
      r = OrOrExpression(b, 0);
    }
    else if (t == OUT_STATEMENT) {
      r = OutStatement(b, 0);
    }
    else if (t == PARAMETER) {
      r = Parameter(b, 0);
    }
    else if (t == PARAMETER_ATTRIBUTES) {
      r = ParameterAttributes(b, 0);
    }
    else if (t == PARAMETER_LIST) {
      r = ParameterList(b, 0);
    }
    else if (t == PARAMETER_MEMBER_ATTRIBUTES) {
      r = ParameterMemberAttributes(b, 0);
    }
    else if (t == PARAMETERS) {
      r = Parameters(b, 0);
    }
    else if (t == POSTBLIT) {
      r = Postblit(b, 0);
    }
    else if (t == POSTFIX_EXPRESSION) {
      r = PostfixExpression(b, 0);
    }
    else if (t == POW_EXPRESSION_) {
      r = PowExpression_(b, 0);
    }
    else if (t == PRAGMA) {
      r = Pragma(b, 0);
    }
    else if (t == PRAGMA_STATEMENT) {
      r = PragmaStatement(b, 0);
    }
    else if (t == PRIMARY_EXPRESSION) {
      r = PrimaryExpression(b, 0);
    }
    else if (t == PROPERTY) {
      r = Property(b, 0);
    }
    else if (t == PROPERTY_IDENTIFIER) {
      r = PropertyIdentifier(b, 0);
    }
    else if (t == PROTECTION_ATTRIBUTE) {
      r = ProtectionAttribute(b, 0);
    }
    else if (t == QUALIFIED_IDENTIFIER_LIST) {
      r = QualifiedIdentifierList(b, 0);
    }
    else if (t == REGISTER) {
      r = Register(b, 0);
    }
    else if (t == REGISTER_64) {
      r = Register64(b, 0);
    }
    else if (t == REL_EXPRESSION) {
      r = RelExpression(b, 0);
    }
    else if (t == RETURN_STATEMENT) {
      r = ReturnStatement(b, 0);
    }
    else if (t == SCOPE_GUARD_STATEMENT) {
      r = ScopeGuardStatement(b, 0);
    }
    else if (t == SCOPE_STATEMENT) {
      r = ScopeStatement(b, 0);
    }
    else if (t == SCOPE_STATEMENT_LIST) {
      r = ScopeStatementList(b, 0);
    }
    else if (t == SHARED_STATIC_CONSTRUCTOR) {
      r = SharedStaticConstructor(b, 0);
    }
    else if (t == SHARED_STATIC_DESTRUCTOR) {
      r = SharedStaticDestructor(b, 0);
    }
    else if (t == SHIFT_EXPRESSION_) {
      r = ShiftExpression_(b, 0);
    }
    else if (t == SLICE_EXPRESSION) {
      r = SliceExpression(b, 0);
    }
    else if (t == SPECIAL_KEYWORD) {
      r = SpecialKeyword(b, 0);
    }
    else if (t == STATEMENT) {
      r = Statement(b, 0);
    }
    else if (t == STATEMENT_LIST) {
      r = StatementList(b, 0);
    }
    else if (t == STATEMENT_LIST_NO_CASE_NO_DEFAULT) {
      r = StatementListNoCaseNoDefault(b, 0);
    }
    else if (t == STATEMENT_NO_CASE_NO_DEFAULT) {
      r = StatementNoCaseNoDefault(b, 0);
    }
    else if (t == STATIC_ASSERT) {
      r = StaticAssert(b, 0);
    }
    else if (t == STATIC_CONSTRUCTOR) {
      r = StaticConstructor(b, 0);
    }
    else if (t == STATIC_DESTRUCTOR) {
      r = StaticDestructor(b, 0);
    }
    else if (t == STATIC_ELSE_CONDITION) {
      r = StaticElseCondition(b, 0);
    }
    else if (t == STATIC_IF_CONDITION) {
      r = StaticIfCondition(b, 0);
    }
    else if (t == STORAGE_CLASS) {
      r = StorageClass(b, 0);
    }
    else if (t == STORAGE_CLASSES) {
      r = StorageClasses(b, 0);
    }
    else if (t == STRING_LITERAL) {
      r = StringLiteral(b, 0);
    }
    else if (t == STRING_LITERALS) {
      r = StringLiterals(b, 0);
    }
    else if (t == STRUCT_DECLARATION) {
      r = StructDeclaration(b, 0);
    }
    else if (t == STRUCT_INITIALIZER) {
      r = StructInitializer(b, 0);
    }
    else if (t == STRUCT_MEMBER_INITIALIZER) {
      r = StructMemberInitializer(b, 0);
    }
    else if (t == STRUCT_MEMBER_INITIALIZERS) {
      r = StructMemberInitializers(b, 0);
    }
    else if (t == SUPER_CLASS) {
      r = SuperClass(b, 0);
    }
    else if (t == SWITCH_STATEMENT) {
      r = SwitchStatement(b, 0);
    }
    else if (t == SYMBOL) {
      r = Symbol(b, 0);
    }
    else if (t == SYMBOL_TAIL) {
      r = SymbolTail(b, 0);
    }
    else if (t == SYNCHRONIZED_STATEMENT) {
      r = SynchronizedStatement(b, 0);
    }
    else if (t == TEMPLATE_ALIAS_PARAMETER) {
      r = TemplateAliasParameter(b, 0);
    }
    else if (t == TEMPLATE_ARGUMENT) {
      r = TemplateArgument(b, 0);
    }
    else if (t == TEMPLATE_ARGUMENT_LIST) {
      r = TemplateArgumentList(b, 0);
    }
    else if (t == TEMPLATE_ARGUMENTS) {
      r = TemplateArguments(b, 0);
    }
    else if (t == TEMPLATE_DECLARATION) {
      r = TemplateDeclaration(b, 0);
    }
    else if (t == TEMPLATE_INSTANCE) {
      r = TemplateInstance(b, 0);
    }
    else if (t == TEMPLATE_MIXIN) {
      r = TemplateMixin(b, 0);
    }
    else if (t == TEMPLATE_MIXIN_DECLARATION) {
      r = TemplateMixinDeclaration(b, 0);
    }
    else if (t == TEMPLATE_PARAMETER) {
      r = TemplateParameter(b, 0);
    }
    else if (t == TEMPLATE_PARAMETER_LIST) {
      r = TemplateParameterList(b, 0);
    }
    else if (t == TEMPLATE_PARAMETERS) {
      r = TemplateParameters(b, 0);
    }
    else if (t == TEMPLATE_SINGLE_ARGUMENT) {
      r = TemplateSingleArgument(b, 0);
    }
    else if (t == TEMPLATE_THIS_PARAMETER) {
      r = TemplateThisParameter(b, 0);
    }
    else if (t == TEMPLATE_TUPLE_PARAMETER) {
      r = TemplateTupleParameter(b, 0);
    }
    else if (t == TEMPLATE_TYPE_PARAMETER) {
      r = TemplateTypeParameter(b, 0);
    }
    else if (t == TEMPLATE_VALUE_PARAMETER) {
      r = TemplateValueParameter(b, 0);
    }
    else if (t == TEMPLATE_VALUE_PARAMETER_DEFAULT) {
      r = TemplateValueParameterDefault(b, 0);
    }
    else if (t == TEST) {
      r = Test(b, 0);
    }
    else if (t == THEN_STATEMENT) {
      r = ThenStatement(b, 0);
    }
    else if (t == THROW_STATEMENT) {
      r = ThrowStatement(b, 0);
    }
    else if (t == TRAITS_ARGUMENT) {
      r = TraitsArgument(b, 0);
    }
    else if (t == TRAITS_ARGUMENTS) {
      r = TraitsArguments(b, 0);
    }
    else if (t == TRAITS_EXPRESSION) {
      r = TraitsExpression(b, 0);
    }
    else if (t == TRAITS_KEYWORD) {
      r = TraitsKeyword(b, 0);
    }
    else if (t == TRY_STATEMENT) {
      r = TryStatement(b, 0);
    }
    else if (t == TYPE) {
      r = Type(b, 0);
    }
    else if (t == TYPE_CTOR) {
      r = TypeCtor(b, 0);
    }
    else if (t == TYPE_CTORS) {
      r = TypeCtors(b, 0);
    }
    else if (t == TYPE_SPECIALIZATION) {
      r = TypeSpecialization(b, 0);
    }
    else if (t == TYPE_VECTOR) {
      r = TypeVector(b, 0);
    }
    else if (t == TYPEID_EXPRESSION) {
      r = TypeidExpression(b, 0);
    }
    else if (t == TYPEOF) {
      r = Typeof(b, 0);
    }
    else if (t == UNION_DECLARATION) {
      r = UnionDeclaration(b, 0);
    }
    else if (t == UNION_TEMPLATE_DECLARATION) {
      r = UnionTemplateDeclaration(b, 0);
    }
    else if (t == UNIT_TESTING) {
      r = UnitTesting(b, 0);
    }
    else if (t == UPR_EXPRESSION) {
      r = UprExpression(b, 0);
    }
    else if (t == USER_DEFINED_ATTRIBUTE) {
      r = UserDefinedAttribute(b, 0);
    }
    else if (t == VAR_DECLARATIONS) {
      r = VarDeclarations(b, 0);
    }
    else if (t == VAR_DECLARATOR) {
      r = VarDeclarator(b, 0);
    }
    else if (t == VAR_DECLARATOR_IDENTIFIER) {
      r = VarDeclaratorIdentifier(b, 0);
    }
    else if (t == VERSION_CONDITION) {
      r = VersionCondition(b, 0);
    }
    else if (t == VERSION_SPECIFICATION) {
      r = VersionSpecification(b, 0);
    }
    else if (t == VOID_INITIALIZER) {
      r = VoidInitializer(b, 0);
    }
    else if (t == WHILE_STATEMENT) {
      r = WhileStatement(b, 0);
    }
    else if (t == WITH_STATEMENT) {
      r = WithStatement(b, 0);
    }
    else if (t == XOR_EXPRESSION_) {
      r = XorExpression_(b, 0);
    }
    else {
      r = parse_root_(t, b, 0);
    }
    exit_section_(b, 0, m, t, r, true, TRUE_CONDITION);
  }

  protected boolean parse_root_(IElementType t, PsiBuilder b, int l) {
    return dFile(b, l + 1);
  }

  /* ********************************************************** */
  // MulExpression [ AddExpression_]
  static boolean AddExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AddExpression")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = MulExpression(b, l + 1);
    r = r && AddExpression_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [ AddExpression_]
  private static boolean AddExpression_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AddExpression_1")) return false;
    AddExpression_(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // ('+' | '-' | '~') AddExpression
  public static boolean AddExpression_(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AddExpression_")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _COLLAPSE_, ADD_EXPRESSION_, "<add expression>");
    r = AddExpression__0(b, l + 1);
    r = r && AddExpression(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // '+' | '-' | '~'
  private static boolean AddExpression__0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AddExpression__0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OP_PLUS);
    if (!r) r = consumeToken(b, OP_MINUS);
    if (!r) r = consumeToken(b, OP_TILDA);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // '{' DeclDefs? '}'
  public static boolean AggregateBody(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AggregateBody")) return false;
    if (!nextTokenIs(b, OP_BRACES_LEFT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OP_BRACES_LEFT);
    r = r && AggregateBody_1(b, l + 1);
    r = r && consumeToken(b, OP_BRACES_RIGHT);
    exit_section_(b, m, AGGREGATE_BODY, r);
    return r;
  }

  // DeclDefs?
  private static boolean AggregateBody_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AggregateBody_1")) return false;
    DeclDefs(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // ClassDeclaration
  //     | InterfaceDeclaration
  //     | StructDeclaration
  //     | UnionDeclaration
  public static boolean AggregateDeclaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AggregateDeclaration")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, AGGREGATE_DECLARATION, "<aggregate declaration>");
    r = ClassDeclaration(b, l + 1);
    if (!r) r = InterfaceDeclaration(b, l + 1);
    if (!r) r = StructDeclaration(b, l + 1);
    if (!r) r = UnionDeclaration(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // 'alias' Identifier '=' Type TemplateArguments? ';'
  //   | 'alias' Identifier '=' Initializer ';'
  //   | 'alias' StorageClasses? BasicType (FuncDeclarator|Declarator) ';'
  //   | 'alias' AliasDeclarationX ';'
  public static boolean AliasDeclaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AliasDeclaration")) return false;
    if (!nextTokenIs(b, KW_ALIAS)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = AliasDeclaration_0(b, l + 1);
    if (!r) r = AliasDeclaration_1(b, l + 1);
    if (!r) r = AliasDeclaration_2(b, l + 1);
    if (!r) r = AliasDeclaration_3(b, l + 1);
    exit_section_(b, m, ALIAS_DECLARATION, r);
    return r;
  }

  // 'alias' Identifier '=' Type TemplateArguments? ';'
  private static boolean AliasDeclaration_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AliasDeclaration_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, KW_ALIAS);
    r = r && Identifier(b, l + 1);
    r = r && consumeToken(b, OP_EQ);
    r = r && Type(b, l + 1);
    r = r && AliasDeclaration_0_4(b, l + 1);
    r = r && consumeToken(b, OP_SCOLON);
    exit_section_(b, m, null, r);
    return r;
  }

  // TemplateArguments?
  private static boolean AliasDeclaration_0_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AliasDeclaration_0_4")) return false;
    TemplateArguments(b, l + 1);
    return true;
  }

  // 'alias' Identifier '=' Initializer ';'
  private static boolean AliasDeclaration_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AliasDeclaration_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, KW_ALIAS);
    r = r && Identifier(b, l + 1);
    r = r && consumeToken(b, OP_EQ);
    r = r && Initializer(b, l + 1);
    r = r && consumeToken(b, OP_SCOLON);
    exit_section_(b, m, null, r);
    return r;
  }

  // 'alias' StorageClasses? BasicType (FuncDeclarator|Declarator) ';'
  private static boolean AliasDeclaration_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AliasDeclaration_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, KW_ALIAS);
    r = r && AliasDeclaration_2_1(b, l + 1);
    r = r && BasicType(b, l + 1);
    r = r && AliasDeclaration_2_3(b, l + 1);
    r = r && consumeToken(b, OP_SCOLON);
    exit_section_(b, m, null, r);
    return r;
  }

  // StorageClasses?
  private static boolean AliasDeclaration_2_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AliasDeclaration_2_1")) return false;
    StorageClasses(b, l + 1);
    return true;
  }

  // FuncDeclarator|Declarator
  private static boolean AliasDeclaration_2_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AliasDeclaration_2_3")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = FuncDeclarator(b, l + 1);
    if (!r) r = Declarator(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // 'alias' AliasDeclarationX ';'
  private static boolean AliasDeclaration_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AliasDeclaration_3")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, KW_ALIAS);
    r = r && AliasDeclarationX(b, l + 1);
    r = r && consumeToken(b, OP_SCOLON);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // AliasDeclarationY [',' AliasDeclarationX]
  public static boolean AliasDeclarationX(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AliasDeclarationX")) return false;
    if (!nextTokenIs(b, ID)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = AliasDeclarationY(b, l + 1);
    r = r && AliasDeclarationX_1(b, l + 1);
    exit_section_(b, m, ALIAS_DECLARATION_X, r);
    return r;
  }

  // [',' AliasDeclarationX]
  private static boolean AliasDeclarationX_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AliasDeclarationX_1")) return false;
    AliasDeclarationX_1_0(b, l + 1);
    return true;
  }

  // ',' AliasDeclarationX
  private static boolean AliasDeclarationX_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AliasDeclarationX_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OP_COMMA);
    r = r && AliasDeclarationX(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // Identifier TemplateParameters? '=' ( StorageClasses? Type | FunctionLiteral)
  public static boolean AliasDeclarationY(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AliasDeclarationY")) return false;
    if (!nextTokenIs(b, ID)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Identifier(b, l + 1);
    r = r && AliasDeclarationY_1(b, l + 1);
    r = r && consumeToken(b, OP_EQ);
    r = r && AliasDeclarationY_3(b, l + 1);
    exit_section_(b, m, ALIAS_DECLARATION_Y, r);
    return r;
  }

  // TemplateParameters?
  private static boolean AliasDeclarationY_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AliasDeclarationY_1")) return false;
    TemplateParameters(b, l + 1);
    return true;
  }

  // StorageClasses? Type | FunctionLiteral
  private static boolean AliasDeclarationY_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AliasDeclarationY_3")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = AliasDeclarationY_3_0(b, l + 1);
    if (!r) r = FunctionLiteral(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // StorageClasses? Type
  private static boolean AliasDeclarationY_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AliasDeclarationY_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = AliasDeclarationY_3_0_0(b, l + 1);
    r = r && Type(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // StorageClasses?
  private static boolean AliasDeclarationY_3_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AliasDeclarationY_3_0_0")) return false;
    StorageClasses(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // 'alias' Identifier 'this' ';'
  public static boolean AliasThis(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AliasThis")) return false;
    if (!nextTokenIs(b, KW_ALIAS)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, ALIAS_THIS, null);
    r = consumeToken(b, KW_ALIAS);
    r = r && Identifier(b, l + 1);
    r = r && consumeTokens(b, 1, KW_THIS, OP_SCOLON);
    p = r; // pin = 3
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // 'align' ('(' INTEGER_LITERAL ')')?
  public static boolean AlignAttribute(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AlignAttribute")) return false;
    if (!nextTokenIs(b, KW_ALIGN)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, ALIGN_ATTRIBUTE, null);
    r = consumeToken(b, KW_ALIGN);
    p = r; // pin = 1
    r = r && AlignAttribute_1(b, l + 1);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // ('(' INTEGER_LITERAL ')')?
  private static boolean AlignAttribute_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AlignAttribute_1")) return false;
    AlignAttribute_1_0(b, l + 1);
    return true;
  }

  // '(' INTEGER_LITERAL ')'
  private static boolean AlignAttribute_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AlignAttribute_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, OP_PAR_LEFT, INTEGER_LITERAL, OP_PAR_RIGHT);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // 'new' Parameters ';'
  //     | 'new' Parameters FunctionBody{
  //     //pin(".*") = 1
  //     }
  public static boolean Allocator(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Allocator")) return false;
    if (!nextTokenIs(b, KW_NEW)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Allocator_0(b, l + 1);
    if (!r) r = Allocator_1(b, l + 1);
    exit_section_(b, m, ALLOCATOR, r);
    return r;
  }

  // 'new' Parameters ';'
  private static boolean Allocator_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Allocator_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, KW_NEW);
    r = r && Parameters(b, l + 1);
    r = r && consumeToken(b, OP_SCOLON);
    exit_section_(b, m, null, r);
    return r;
  }

  // 'new' Parameters FunctionBody{
  //     //pin(".*") = 1
  //     }
  private static boolean Allocator_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Allocator_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, KW_NEW);
    r = r && Parameters(b, l + 1);
    r = r && FunctionBody(b, l + 1);
    r = r && Allocator_1_3(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // {
  //     //pin(".*") = 1
  //     }
  private static boolean Allocator_1_3(PsiBuilder b, int l) {
    return true;
  }

  /* ********************************************************** */
  // '(' ArgumentList? ')'
  public static boolean AllocatorArguments(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AllocatorArguments")) return false;
    if (!nextTokenIs(b, OP_PAR_LEFT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OP_PAR_LEFT);
    r = r && AllocatorArguments_1(b, l + 1);
    r = r && consumeToken(b, OP_PAR_RIGHT);
    exit_section_(b, m, ALLOCATOR_ARGUMENTS, r);
    return r;
  }

  // ArgumentList?
  private static boolean AllocatorArguments_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AllocatorArguments_1")) return false;
    ArgumentList(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // BasicType2? Identifier AltDeclaratorSuffixes
  //     | BasicType2? '(' AltDeclaratorX ')' AltFuncDeclaratorSuffix? AltDeclaratorSuffixes?
  public static boolean AltDeclarator(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AltDeclarator")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ALT_DECLARATOR, "<alt declarator>");
    r = AltDeclarator_0(b, l + 1);
    if (!r) r = AltDeclarator_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // BasicType2? Identifier AltDeclaratorSuffixes
  private static boolean AltDeclarator_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AltDeclarator_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = AltDeclarator_0_0(b, l + 1);
    r = r && Identifier(b, l + 1);
    r = r && AltDeclaratorSuffixes(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // BasicType2?
  private static boolean AltDeclarator_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AltDeclarator_0_0")) return false;
    BasicType2(b, l + 1);
    return true;
  }

  // BasicType2? '(' AltDeclaratorX ')' AltFuncDeclaratorSuffix? AltDeclaratorSuffixes?
  private static boolean AltDeclarator_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AltDeclarator_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = AltDeclarator_1_0(b, l + 1);
    r = r && consumeToken(b, OP_PAR_LEFT);
    r = r && AltDeclaratorX(b, l + 1);
    r = r && consumeToken(b, OP_PAR_RIGHT);
    r = r && AltDeclarator_1_4(b, l + 1);
    r = r && AltDeclarator_1_5(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // BasicType2?
  private static boolean AltDeclarator_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AltDeclarator_1_0")) return false;
    BasicType2(b, l + 1);
    return true;
  }

  // AltFuncDeclaratorSuffix?
  private static boolean AltDeclarator_1_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AltDeclarator_1_4")) return false;
    AltFuncDeclaratorSuffix(b, l + 1);
    return true;
  }

  // AltDeclaratorSuffixes?
  private static boolean AltDeclarator_1_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AltDeclarator_1_5")) return false;
    AltDeclaratorSuffixes(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // BasicType2? Identifier AltDeclaratorSuffixes? ('=' Initializer)?
  public static boolean AltDeclaratorIdentifier(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AltDeclaratorIdentifier")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ALT_DECLARATOR_IDENTIFIER, "<alt declarator identifier>");
    r = AltDeclaratorIdentifier_0(b, l + 1);
    r = r && Identifier(b, l + 1);
    r = r && AltDeclaratorIdentifier_2(b, l + 1);
    r = r && AltDeclaratorIdentifier_3(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // BasicType2?
  private static boolean AltDeclaratorIdentifier_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AltDeclaratorIdentifier_0")) return false;
    BasicType2(b, l + 1);
    return true;
  }

  // AltDeclaratorSuffixes?
  private static boolean AltDeclaratorIdentifier_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AltDeclaratorIdentifier_2")) return false;
    AltDeclaratorSuffixes(b, l + 1);
    return true;
  }

  // ('=' Initializer)?
  private static boolean AltDeclaratorIdentifier_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AltDeclaratorIdentifier_3")) return false;
    AltDeclaratorIdentifier_3_0(b, l + 1);
    return true;
  }

  // '=' Initializer
  private static boolean AltDeclaratorIdentifier_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AltDeclaratorIdentifier_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OP_EQ);
    r = r && Initializer(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // '[' (AssignExpression | Type)? ']'
  public static boolean AltDeclaratorSuffix(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AltDeclaratorSuffix")) return false;
    if (!nextTokenIs(b, OP_BRACKET_LEFT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OP_BRACKET_LEFT);
    r = r && AltDeclaratorSuffix_1(b, l + 1);
    r = r && consumeToken(b, OP_BRACKET_RIGHT);
    exit_section_(b, m, ALT_DECLARATOR_SUFFIX, r);
    return r;
  }

  // (AssignExpression | Type)?
  private static boolean AltDeclaratorSuffix_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AltDeclaratorSuffix_1")) return false;
    AltDeclaratorSuffix_1_0(b, l + 1);
    return true;
  }

  // AssignExpression | Type
  private static boolean AltDeclaratorSuffix_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AltDeclaratorSuffix_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = AssignExpression(b, l + 1);
    if (!r) r = Type(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // AltDeclaratorSuffix AltDeclaratorSuffix*
  public static boolean AltDeclaratorSuffixes(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AltDeclaratorSuffixes")) return false;
    if (!nextTokenIs(b, OP_BRACKET_LEFT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = AltDeclaratorSuffix(b, l + 1);
    r = r && AltDeclaratorSuffixes_1(b, l + 1);
    exit_section_(b, m, ALT_DECLARATOR_SUFFIXES, r);
    return r;
  }

  // AltDeclaratorSuffix*
  private static boolean AltDeclaratorSuffixes_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AltDeclaratorSuffixes_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!AltDeclaratorSuffix(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "AltDeclaratorSuffixes_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  /* ********************************************************** */
  // BasicType2? Identifier AltFuncDeclaratorSuffix?
  //     | AltDeclarator
  public static boolean AltDeclaratorX(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AltDeclaratorX")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ALT_DECLARATOR_X, "<alt declarator x>");
    r = AltDeclaratorX_0(b, l + 1);
    if (!r) r = AltDeclarator(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // BasicType2? Identifier AltFuncDeclaratorSuffix?
  private static boolean AltDeclaratorX_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AltDeclaratorX_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = AltDeclaratorX_0_0(b, l + 1);
    r = r && Identifier(b, l + 1);
    r = r && AltDeclaratorX_0_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // BasicType2?
  private static boolean AltDeclaratorX_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AltDeclaratorX_0_0")) return false;
    BasicType2(b, l + 1);
    return true;
  }

  // AltFuncDeclaratorSuffix?
  private static boolean AltDeclaratorX_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AltDeclaratorX_0_2")) return false;
    AltFuncDeclaratorSuffix(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // Parameters MemberFunctionAttributes?
  public static boolean AltFuncDeclaratorSuffix(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AltFuncDeclaratorSuffix")) return false;
    if (!nextTokenIs(b, OP_PAR_LEFT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Parameters(b, l + 1);
    r = r && AltFuncDeclaratorSuffix_1(b, l + 1);
    exit_section_(b, m, ALT_FUNC_DECLARATOR_SUFFIX, r);
    return r;
  }

  // MemberFunctionAttributes?
  private static boolean AltFuncDeclaratorSuffix_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AltFuncDeclaratorSuffix_1")) return false;
    MemberFunctionAttributes(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // '&&'? (OrExpression | CmpExpression) [AndAndExpression]
  static boolean AndAndExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AndAndExpression")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = AndAndExpression_0(b, l + 1);
    r = r && AndAndExpression_1(b, l + 1);
    r = r && AndAndExpression_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // '&&'?
  private static boolean AndAndExpression_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AndAndExpression_0")) return false;
    consumeToken(b, OP_BOOL_AND);
    return true;
  }

  // OrExpression | CmpExpression
  private static boolean AndAndExpression_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AndAndExpression_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = OrExpression(b, l + 1);
    if (!r) r = CmpExpression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [AndAndExpression]
  private static boolean AndAndExpression_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AndAndExpression_2")) return false;
    AndAndExpression(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // ShiftExpression [ AndExxpression_ ]
  static boolean AndExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AndExpression")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ShiftExpression(b, l + 1);
    r = r && AndExpression_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [ AndExxpression_ ]
  private static boolean AndExpression_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AndExpression_1")) return false;
    AndExxpression_(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // '&' AndExpression
  public static boolean AndExxpression_(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AndExxpression_")) return false;
    if (!nextTokenIs(b, OP_AND)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OP_AND);
    r = r && AndExpression(b, l + 1);
    exit_section_(b, m, AND_EXXPRESSION_, r);
    return r;
  }

  /* ********************************************************** */
  // 'union' AggregateBody
  public static boolean AnonUnionDeclaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AnonUnionDeclaration")) return false;
    if (!nextTokenIs(b, KW_UNION)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, ANON_UNION_DECLARATION, null);
    r = consumeToken(b, KW_UNION);
    p = r; // pin = 1
    r = r && AggregateBody(b, l + 1);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // 'enum' (':' EnumBaseType)? ('{' EnumMembers ','? '}')?
  public static boolean AnonymousEnumDeclaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AnonymousEnumDeclaration")) return false;
    if (!nextTokenIs(b, KW_ENUM)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, KW_ENUM);
    r = r && AnonymousEnumDeclaration_1(b, l + 1);
    r = r && AnonymousEnumDeclaration_2(b, l + 1);
    exit_section_(b, m, ANONYMOUS_ENUM_DECLARATION, r);
    return r;
  }

  // (':' EnumBaseType)?
  private static boolean AnonymousEnumDeclaration_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AnonymousEnumDeclaration_1")) return false;
    AnonymousEnumDeclaration_1_0(b, l + 1);
    return true;
  }

  // ':' EnumBaseType
  private static boolean AnonymousEnumDeclaration_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AnonymousEnumDeclaration_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OP_COLON);
    r = r && EnumBaseType(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ('{' EnumMembers ','? '}')?
  private static boolean AnonymousEnumDeclaration_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AnonymousEnumDeclaration_2")) return false;
    AnonymousEnumDeclaration_2_0(b, l + 1);
    return true;
  }

  // '{' EnumMembers ','? '}'
  private static boolean AnonymousEnumDeclaration_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AnonymousEnumDeclaration_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OP_BRACES_LEFT);
    r = r && EnumMembers(b, l + 1);
    r = r && AnonymousEnumDeclaration_2_0_2(b, l + 1);
    r = r && consumeToken(b, OP_BRACES_RIGHT);
    exit_section_(b, m, null, r);
    return r;
  }

  // ','?
  private static boolean AnonymousEnumDeclaration_2_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AnonymousEnumDeclaration_2_0_2")) return false;
    consumeToken(b, OP_COMMA);
    return true;
  }

  /* ********************************************************** */
  // ArgumentListMember (','  ArgumentListMember)* ','?
  public static boolean ArgumentList(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ArgumentList")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ARGUMENT_LIST, "<argument list>");
    r = ArgumentListMember(b, l + 1);
    r = r && ArgumentList_1(b, l + 1);
    r = r && ArgumentList_2(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (','  ArgumentListMember)*
  private static boolean ArgumentList_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ArgumentList_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!ArgumentList_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "ArgumentList_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // ','  ArgumentListMember
  private static boolean ArgumentList_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ArgumentList_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OP_COMMA);
    r = r && ArgumentListMember(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ','?
  private static boolean ArgumentList_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ArgumentList_2")) return false;
    consumeToken(b, OP_COMMA);
    return true;
  }

  /* ********************************************************** */
  // AssignExpression
  static boolean ArgumentListMember(PsiBuilder b, int l) {
    return AssignExpression(b, l + 1);
  }

  /* ********************************************************** */
  // '[' ArrayMemberInitializations? ','? ']'
  public static boolean ArrayInitializer(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ArrayInitializer")) return false;
    if (!nextTokenIs(b, OP_BRACKET_LEFT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OP_BRACKET_LEFT);
    r = r && ArrayInitializer_1(b, l + 1);
    r = r && ArrayInitializer_2(b, l + 1);
    r = r && consumeToken(b, OP_BRACKET_RIGHT);
    exit_section_(b, m, ARRAY_INITIALIZER, r);
    return r;
  }

  // ArrayMemberInitializations?
  private static boolean ArrayInitializer_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ArrayInitializer_1")) return false;
    ArrayMemberInitializations(b, l + 1);
    return true;
  }

  // ','?
  private static boolean ArrayInitializer_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ArrayInitializer_2")) return false;
    consumeToken(b, OP_COMMA);
    return true;
  }

  /* ********************************************************** */
  // '[' ArgumentList? ','? ']'
  public static boolean ArrayLiteral(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ArrayLiteral")) return false;
    if (!nextTokenIs(b, OP_BRACKET_LEFT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OP_BRACKET_LEFT);
    r = r && ArrayLiteral_1(b, l + 1);
    r = r && ArrayLiteral_2(b, l + 1);
    r = r && consumeToken(b, OP_BRACKET_RIGHT);
    exit_section_(b, m, ARRAY_LITERAL, r);
    return r;
  }

  // ArgumentList?
  private static boolean ArrayLiteral_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ArrayLiteral_1")) return false;
    ArgumentList(b, l + 1);
    return true;
  }

  // ','?
  private static boolean ArrayLiteral_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ArrayLiteral_2")) return false;
    consumeToken(b, OP_COMMA);
    return true;
  }

  /* ********************************************************** */
  // NonVoidInitializer [':' NonVoidInitializer]
  public static boolean ArrayMemberInitialization(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ArrayMemberInitialization")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ARRAY_MEMBER_INITIALIZATION, "<array member initialization>");
    r = NonVoidInitializer(b, l + 1);
    r = r && ArrayMemberInitialization_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // [':' NonVoidInitializer]
  private static boolean ArrayMemberInitialization_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ArrayMemberInitialization_1")) return false;
    ArrayMemberInitialization_1_0(b, l + 1);
    return true;
  }

  // ':' NonVoidInitializer
  private static boolean ArrayMemberInitialization_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ArrayMemberInitialization_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OP_COLON);
    r = r && NonVoidInitializer(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // ArrayMemberInitialization (',' ArrayMemberInitialization)*
  public static boolean ArrayMemberInitializations(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ArrayMemberInitializations")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ARRAY_MEMBER_INITIALIZATIONS, "<array member initializations>");
    r = ArrayMemberInitialization(b, l + 1);
    r = r && ArrayMemberInitializations_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (',' ArrayMemberInitialization)*
  private static boolean ArrayMemberInitializations_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ArrayMemberInitializations_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!ArrayMemberInitializations_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "ArrayMemberInitializations_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // ',' ArrayMemberInitialization
  private static boolean ArrayMemberInitializations_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ArrayMemberInitializations_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OP_COMMA);
    r = r && ArrayMemberInitialization(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // AsmMulExp [ ('+' | '-') AsmAddExp ]
  public static boolean AsmAddExp(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AsmAddExp")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ASM_ADD_EXP, "<asm add exp>");
    r = AsmMulExp(b, l + 1);
    r = r && AsmAddExp_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // [ ('+' | '-') AsmAddExp ]
  private static boolean AsmAddExp_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AsmAddExp_1")) return false;
    AsmAddExp_1_0(b, l + 1);
    return true;
  }

  // ('+' | '-') AsmAddExp
  private static boolean AsmAddExp_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AsmAddExp_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = AsmAddExp_1_0_0(b, l + 1);
    r = r && AsmAddExp(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // '+' | '-'
  private static boolean AsmAddExp_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AsmAddExp_1_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OP_PLUS);
    if (!r) r = consumeToken(b, OP_MINUS);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // AsmEqualExp ['&' AsmAndExp]
  public static boolean AsmAndExp(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AsmAndExp")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ASM_AND_EXP, "<asm and exp>");
    r = AsmEqualExp(b, l + 1);
    r = r && AsmAndExp_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ['&' AsmAndExp]
  private static boolean AsmAndExp_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AsmAndExp_1")) return false;
    AsmAndExp_1_0(b, l + 1);
    return true;
  }

  // '&' AsmAndExp
  private static boolean AsmAndExp_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AsmAndExp_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OP_AND);
    r = r && AsmAndExp(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // AsmUnaExp? ['[' AsmExp ']']
  public static boolean AsmBrExp(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AsmBrExp")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ASM_BR_EXP, "<asm br exp>");
    r = AsmBrExp_0(b, l + 1);
    r = r && AsmBrExp_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // AsmUnaExp?
  private static boolean AsmBrExp_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AsmBrExp_0")) return false;
    AsmUnaExp(b, l + 1);
    return true;
  }

  // ['[' AsmExp ']']
  private static boolean AsmBrExp_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AsmBrExp_1")) return false;
    AsmBrExp_1_0(b, l + 1);
    return true;
  }

  // '[' AsmExp ']'
  private static boolean AsmBrExp_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AsmBrExp_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OP_BRACKET_LEFT);
    r = r && AsmExp(b, l + 1);
    r = r && consumeToken(b, OP_BRACKET_RIGHT);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // AsmRelExp [ ('==' | '!=' ) AsmEqualExp]
  public static boolean AsmEqualExp(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AsmEqualExp")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ASM_EQUAL_EXP, "<asm equal exp>");
    r = AsmRelExp(b, l + 1);
    r = r && AsmEqualExp_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // [ ('==' | '!=' ) AsmEqualExp]
  private static boolean AsmEqualExp_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AsmEqualExp_1")) return false;
    AsmEqualExp_1_0(b, l + 1);
    return true;
  }

  // ('==' | '!=' ) AsmEqualExp
  private static boolean AsmEqualExp_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AsmEqualExp_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = AsmEqualExp_1_0_0(b, l + 1);
    r = r && AsmEqualExp(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // '==' | '!='
  private static boolean AsmEqualExp_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AsmEqualExp_1_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OP_EQ_EQ);
    if (!r) r = consumeToken(b, OP_NOT_EQ);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // AsmLogOrExp ('?' AsmExp ':' AsmExp)?
  public static boolean AsmExp(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AsmExp")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ASM_EXP, "<asm exp>");
    r = AsmLogOrExp(b, l + 1);
    r = r && AsmExp_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ('?' AsmExp ':' AsmExp)?
  private static boolean AsmExp_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AsmExp_1")) return false;
    AsmExp_1_0(b, l + 1);
    return true;
  }

  // '?' AsmExp ':' AsmExp
  private static boolean AsmExp_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AsmExp_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OP_QUEST);
    r = r && AsmExp(b, l + 1);
    r = r && consumeToken(b, OP_COLON);
    r = r && AsmExp(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // Identifier ':' AsmInstruction?
  //     | 'align' IntegerExpression
  //     | 'even'
  //     | 'naked'
  //     | 'db' Operands
  //     | 'ds' Operands
  //     | 'di' Operands
  //     | 'dl' Operands
  //     | 'df' Operands
  //     | 'dd' Operands
  //     | 'de' Operands
  //     | Opcode Operands?
  //     | Opcode Operands? AsmBrExp
  public static boolean AsmInstruction(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AsmInstruction")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ASM_INSTRUCTION, "<asm instruction>");
    r = AsmInstruction_0(b, l + 1);
    if (!r) r = AsmInstruction_1(b, l + 1);
    if (!r) r = consumeToken(b, "even");
    if (!r) r = consumeToken(b, "naked");
    if (!r) r = AsmInstruction_4(b, l + 1);
    if (!r) r = AsmInstruction_5(b, l + 1);
    if (!r) r = AsmInstruction_6(b, l + 1);
    if (!r) r = AsmInstruction_7(b, l + 1);
    if (!r) r = AsmInstruction_8(b, l + 1);
    if (!r) r = AsmInstruction_9(b, l + 1);
    if (!r) r = AsmInstruction_10(b, l + 1);
    if (!r) r = AsmInstruction_11(b, l + 1);
    if (!r) r = AsmInstruction_12(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // Identifier ':' AsmInstruction?
  private static boolean AsmInstruction_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AsmInstruction_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Identifier(b, l + 1);
    r = r && consumeToken(b, OP_COLON);
    r = r && AsmInstruction_0_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // AsmInstruction?
  private static boolean AsmInstruction_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AsmInstruction_0_2")) return false;
    AsmInstruction(b, l + 1);
    return true;
  }

  // 'align' IntegerExpression
  private static boolean AsmInstruction_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AsmInstruction_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, KW_ALIGN);
    r = r && IntegerExpression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // 'db' Operands
  private static boolean AsmInstruction_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AsmInstruction_4")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "db");
    r = r && Operands(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // 'ds' Operands
  private static boolean AsmInstruction_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AsmInstruction_5")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "ds");
    r = r && Operands(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // 'di' Operands
  private static boolean AsmInstruction_6(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AsmInstruction_6")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "di");
    r = r && Operands(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // 'dl' Operands
  private static boolean AsmInstruction_7(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AsmInstruction_7")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "dl");
    r = r && Operands(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // 'df' Operands
  private static boolean AsmInstruction_8(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AsmInstruction_8")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "df");
    r = r && Operands(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // 'dd' Operands
  private static boolean AsmInstruction_9(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AsmInstruction_9")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "dd");
    r = r && Operands(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // 'de' Operands
  private static boolean AsmInstruction_10(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AsmInstruction_10")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "de");
    r = r && Operands(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // Opcode Operands?
  private static boolean AsmInstruction_11(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AsmInstruction_11")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Opcode(b, l + 1);
    r = r && AsmInstruction_11_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // Operands?
  private static boolean AsmInstruction_11_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AsmInstruction_11_1")) return false;
    Operands(b, l + 1);
    return true;
  }

  // Opcode Operands? AsmBrExp
  private static boolean AsmInstruction_12(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AsmInstruction_12")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Opcode(b, l + 1);
    r = r && AsmInstruction_12_1(b, l + 1);
    r = r && AsmBrExp(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // Operands?
  private static boolean AsmInstruction_12_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AsmInstruction_12_1")) return false;
    Operands(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // AsmInstruction ';' AsmInstructionList?
  public static boolean AsmInstructionList(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AsmInstructionList")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ASM_INSTRUCTION_LIST, "<asm instruction list>");
    r = AsmInstruction(b, l + 1);
    r = r && consumeToken(b, OP_SCOLON);
    r = r && AsmInstructionList_2(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // AsmInstructionList?
  private static boolean AsmInstructionList_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AsmInstructionList_2")) return false;
    AsmInstructionList(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // AsmOrExp ['&&' AsmLogAndExp]
  public static boolean AsmLogAndExp(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AsmLogAndExp")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ASM_LOG_AND_EXP, "<asm log and exp>");
    r = AsmOrExp(b, l + 1);
    r = r && AsmLogAndExp_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ['&&' AsmLogAndExp]
  private static boolean AsmLogAndExp_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AsmLogAndExp_1")) return false;
    AsmLogAndExp_1_0(b, l + 1);
    return true;
  }

  // '&&' AsmLogAndExp
  private static boolean AsmLogAndExp_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AsmLogAndExp_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OP_BOOL_AND);
    r = r && AsmLogAndExp(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // AsmLogAndExp ['||' AsmLogOrExp]
  public static boolean AsmLogOrExp(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AsmLogOrExp")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ASM_LOG_OR_EXP, "<asm log or exp>");
    r = AsmLogAndExp(b, l + 1);
    r = r && AsmLogOrExp_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ['||' AsmLogOrExp]
  private static boolean AsmLogOrExp_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AsmLogOrExp_1")) return false;
    AsmLogOrExp_1_0(b, l + 1);
    return true;
  }

  // '||' AsmLogOrExp
  private static boolean AsmLogOrExp_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AsmLogOrExp_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OP_BOOL_OR);
    r = r && AsmLogOrExp(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // AsmBrExp [ ('*' | '/' | '%') AsmMulExp]
  public static boolean AsmMulExp(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AsmMulExp")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ASM_MUL_EXP, "<asm mul exp>");
    r = AsmBrExp(b, l + 1);
    r = r && AsmMulExp_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // [ ('*' | '/' | '%') AsmMulExp]
  private static boolean AsmMulExp_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AsmMulExp_1")) return false;
    AsmMulExp_1_0(b, l + 1);
    return true;
  }

  // ('*' | '/' | '%') AsmMulExp
  private static boolean AsmMulExp_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AsmMulExp_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = AsmMulExp_1_0_0(b, l + 1);
    r = r && AsmMulExp(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // '*' | '/' | '%'
  private static boolean AsmMulExp_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AsmMulExp_1_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OP_ASTERISK);
    if (!r) r = consumeToken(b, OP_DIV);
    if (!r) r = consumeToken(b, OP_MOD);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // AsmXorExp ['|' AsmOrExp]
  public static boolean AsmOrExp(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AsmOrExp")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ASM_OR_EXP, "<asm or exp>");
    r = AsmXorExp(b, l + 1);
    r = r && AsmOrExp_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ['|' AsmOrExp]
  private static boolean AsmOrExp_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AsmOrExp_1")) return false;
    AsmOrExp_1_0(b, l + 1);
    return true;
  }

  // '|' AsmOrExp
  private static boolean AsmOrExp_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AsmOrExp_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OP_OR);
    r = r && AsmOrExp(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // INTEGER_LITERAL
  //     | StringLiteral
  //     | FLOAT_LITERAL
  //     | '__LOCAL_SIZE'
  //     | '$'
  //     | Register (':' AsmExp)?
  //     | Register64 (':' AsmExp)?
  //     | DotIdentifier
  //     | 'this'
  public static boolean AsmPrimaryExp(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AsmPrimaryExp")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ASM_PRIMARY_EXP, "<asm primary exp>");
    r = consumeToken(b, INTEGER_LITERAL);
    if (!r) r = StringLiteral(b, l + 1);
    if (!r) r = consumeToken(b, FLOAT_LITERAL);
    if (!r) r = consumeToken(b, "__LOCAL_SIZE");
    if (!r) r = consumeToken(b, OP_DOLLAR);
    if (!r) r = AsmPrimaryExp_5(b, l + 1);
    if (!r) r = AsmPrimaryExp_6(b, l + 1);
    if (!r) r = DotIdentifier(b, l + 1);
    if (!r) r = consumeToken(b, KW_THIS);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // Register (':' AsmExp)?
  private static boolean AsmPrimaryExp_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AsmPrimaryExp_5")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Register(b, l + 1);
    r = r && AsmPrimaryExp_5_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (':' AsmExp)?
  private static boolean AsmPrimaryExp_5_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AsmPrimaryExp_5_1")) return false;
    AsmPrimaryExp_5_1_0(b, l + 1);
    return true;
  }

  // ':' AsmExp
  private static boolean AsmPrimaryExp_5_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AsmPrimaryExp_5_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OP_COLON);
    r = r && AsmExp(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // Register64 (':' AsmExp)?
  private static boolean AsmPrimaryExp_6(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AsmPrimaryExp_6")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Register64(b, l + 1);
    r = r && AsmPrimaryExp_6_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (':' AsmExp)?
  private static boolean AsmPrimaryExp_6_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AsmPrimaryExp_6_1")) return false;
    AsmPrimaryExp_6_1_0(b, l + 1);
    return true;
  }

  // ':' AsmExp
  private static boolean AsmPrimaryExp_6_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AsmPrimaryExp_6_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OP_COLON);
    r = r && AsmExp(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // AsmShiftExp [ ('<' | '<=' | '>' | '>=' ) AsmRelExp]
  public static boolean AsmRelExp(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AsmRelExp")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ASM_REL_EXP, "<asm rel exp>");
    r = AsmShiftExp(b, l + 1);
    r = r && AsmRelExp_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // [ ('<' | '<=' | '>' | '>=' ) AsmRelExp]
  private static boolean AsmRelExp_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AsmRelExp_1")) return false;
    AsmRelExp_1_0(b, l + 1);
    return true;
  }

  // ('<' | '<=' | '>' | '>=' ) AsmRelExp
  private static boolean AsmRelExp_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AsmRelExp_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = AsmRelExp_1_0_0(b, l + 1);
    r = r && AsmRelExp(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // '<' | '<=' | '>' | '>='
  private static boolean AsmRelExp_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AsmRelExp_1_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OP_LESS);
    if (!r) r = consumeToken(b, OP_LESS_EQ);
    if (!r) r = consumeToken(b, OP_GT);
    if (!r) r = consumeToken(b, OP_GT_EQ);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // AsmAddExp [ ('<<' | '>>' | '>>>') AsmShiftExp ]
  public static boolean AsmShiftExp(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AsmShiftExp")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ASM_SHIFT_EXP, "<asm shift exp>");
    r = AsmAddExp(b, l + 1);
    r = r && AsmShiftExp_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // [ ('<<' | '>>' | '>>>') AsmShiftExp ]
  private static boolean AsmShiftExp_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AsmShiftExp_1")) return false;
    AsmShiftExp_1_0(b, l + 1);
    return true;
  }

  // ('<<' | '>>' | '>>>') AsmShiftExp
  private static boolean AsmShiftExp_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AsmShiftExp_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = AsmShiftExp_1_0_0(b, l + 1);
    r = r && AsmShiftExp(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // '<<' | '>>' | '>>>'
  private static boolean AsmShiftExp_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AsmShiftExp_1_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OP_SH_LEFT);
    if (!r) r = consumeToken(b, OP_SH_RIGHT);
    if (!r) r = consumeToken(b, OP_USH_RIGHT);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // 'asm' FunctionAttributes? '{' AsmInstructionList? '}'
  public static boolean AsmStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AsmStatement")) return false;
    if (!nextTokenIs(b, KW_ASM)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, ASM_STATEMENT, null);
    r = consumeToken(b, KW_ASM);
    p = r; // pin = 1
    r = r && report_error_(b, AsmStatement_1(b, l + 1));
    r = p && report_error_(b, consumeToken(b, OP_BRACES_LEFT)) && r;
    r = p && report_error_(b, AsmStatement_3(b, l + 1)) && r;
    r = p && consumeToken(b, OP_BRACES_RIGHT) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // FunctionAttributes?
  private static boolean AsmStatement_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AsmStatement_1")) return false;
    FunctionAttributes(b, l + 1);
    return true;
  }

  // AsmInstructionList?
  private static boolean AsmStatement_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AsmStatement_3")) return false;
    AsmInstructionList(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // 'near' 'ptr'
  //     | 'far' 'ptr'
  //     | 'byte' 'ptr'
  //     | 'short' 'ptr'
  //     | 'int' 'ptr'
  //     | 'word' 'ptr'
  //     | 'dword' 'ptr'
  //     | 'qword' 'ptr'
  //     | 'float' 'ptr'
  //     | 'double' 'ptr'
  //     | 'real' 'ptr'
  //     | 'real ptr'
  public static boolean AsmTypePrefix(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AsmTypePrefix")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ASM_TYPE_PREFIX, "<asm type prefix>");
    r = AsmTypePrefix_0(b, l + 1);
    if (!r) r = AsmTypePrefix_1(b, l + 1);
    if (!r) r = AsmTypePrefix_2(b, l + 1);
    if (!r) r = AsmTypePrefix_3(b, l + 1);
    if (!r) r = AsmTypePrefix_4(b, l + 1);
    if (!r) r = AsmTypePrefix_5(b, l + 1);
    if (!r) r = AsmTypePrefix_6(b, l + 1);
    if (!r) r = AsmTypePrefix_7(b, l + 1);
    if (!r) r = AsmTypePrefix_8(b, l + 1);
    if (!r) r = AsmTypePrefix_9(b, l + 1);
    if (!r) r = AsmTypePrefix_10(b, l + 1);
    if (!r) r = consumeToken(b, "real ptr");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // 'near' 'ptr'
  private static boolean AsmTypePrefix_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AsmTypePrefix_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "near");
    r = r && consumeToken(b, "ptr");
    exit_section_(b, m, null, r);
    return r;
  }

  // 'far' 'ptr'
  private static boolean AsmTypePrefix_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AsmTypePrefix_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "far");
    r = r && consumeToken(b, "ptr");
    exit_section_(b, m, null, r);
    return r;
  }

  // 'byte' 'ptr'
  private static boolean AsmTypePrefix_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AsmTypePrefix_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, KW_BYTE);
    r = r && consumeToken(b, "ptr");
    exit_section_(b, m, null, r);
    return r;
  }

  // 'short' 'ptr'
  private static boolean AsmTypePrefix_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AsmTypePrefix_3")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, KW_SHORT);
    r = r && consumeToken(b, "ptr");
    exit_section_(b, m, null, r);
    return r;
  }

  // 'int' 'ptr'
  private static boolean AsmTypePrefix_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AsmTypePrefix_4")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, KW_INT);
    r = r && consumeToken(b, "ptr");
    exit_section_(b, m, null, r);
    return r;
  }

  // 'word' 'ptr'
  private static boolean AsmTypePrefix_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AsmTypePrefix_5")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "word");
    r = r && consumeToken(b, "ptr");
    exit_section_(b, m, null, r);
    return r;
  }

  // 'dword' 'ptr'
  private static boolean AsmTypePrefix_6(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AsmTypePrefix_6")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "dword");
    r = r && consumeToken(b, "ptr");
    exit_section_(b, m, null, r);
    return r;
  }

  // 'qword' 'ptr'
  private static boolean AsmTypePrefix_7(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AsmTypePrefix_7")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "qword");
    r = r && consumeToken(b, "ptr");
    exit_section_(b, m, null, r);
    return r;
  }

  // 'float' 'ptr'
  private static boolean AsmTypePrefix_8(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AsmTypePrefix_8")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, KW_FLOAT);
    r = r && consumeToken(b, "ptr");
    exit_section_(b, m, null, r);
    return r;
  }

  // 'double' 'ptr'
  private static boolean AsmTypePrefix_9(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AsmTypePrefix_9")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, KW_DOUBLE);
    r = r && consumeToken(b, "ptr");
    exit_section_(b, m, null, r);
    return r;
  }

  // 'real' 'ptr'
  private static boolean AsmTypePrefix_10(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AsmTypePrefix_10")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, KW_REAL);
    r = r && consumeToken(b, "ptr");
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // AsmTypePrefix AsmExp
  //     | 'offsetof' AsmExp
  //     | 'seg' AsmExp
  //     | '+' AsmUnaExp
  //     | '-' AsmUnaExp
  //     | '!' AsmUnaExp
  //     | '~' AsmUnaExp
  //     | AsmPrimaryExp
  public static boolean AsmUnaExp(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AsmUnaExp")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ASM_UNA_EXP, "<asm una exp>");
    r = AsmUnaExp_0(b, l + 1);
    if (!r) r = AsmUnaExp_1(b, l + 1);
    if (!r) r = AsmUnaExp_2(b, l + 1);
    if (!r) r = AsmUnaExp_3(b, l + 1);
    if (!r) r = AsmUnaExp_4(b, l + 1);
    if (!r) r = AsmUnaExp_5(b, l + 1);
    if (!r) r = AsmUnaExp_6(b, l + 1);
    if (!r) r = AsmPrimaryExp(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // AsmTypePrefix AsmExp
  private static boolean AsmUnaExp_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AsmUnaExp_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = AsmTypePrefix(b, l + 1);
    r = r && AsmExp(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // 'offsetof' AsmExp
  private static boolean AsmUnaExp_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AsmUnaExp_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "offsetof");
    r = r && AsmExp(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // 'seg' AsmExp
  private static boolean AsmUnaExp_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AsmUnaExp_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "seg");
    r = r && AsmExp(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // '+' AsmUnaExp
  private static boolean AsmUnaExp_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AsmUnaExp_3")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OP_PLUS);
    r = r && AsmUnaExp(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // '-' AsmUnaExp
  private static boolean AsmUnaExp_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AsmUnaExp_4")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OP_MINUS);
    r = r && AsmUnaExp(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // '!' AsmUnaExp
  private static boolean AsmUnaExp_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AsmUnaExp_5")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OP_NOT);
    r = r && AsmUnaExp(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // '~' AsmUnaExp
  private static boolean AsmUnaExp_6(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AsmUnaExp_6")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OP_TILDA);
    r = r && AsmUnaExp(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // AsmAndExp [ '^' AsmXorExp ]
  public static boolean AsmXorExp(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AsmXorExp")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ASM_XOR_EXP, "<asm xor exp>");
    r = AsmAndExp(b, l + 1);
    r = r && AsmXorExp_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // [ '^' AsmXorExp ]
  private static boolean AsmXorExp_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AsmXorExp_1")) return false;
    AsmXorExp_1_0(b, l + 1);
    return true;
  }

  // '^' AsmXorExp
  private static boolean AsmXorExp_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AsmXorExp_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OP_XOR);
    r = r && AsmXorExp(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // 'assert' '(' AssignExpression (',' AssignExpression)? ')'
  public static boolean AssertExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AssertExpression")) return false;
    if (!nextTokenIs(b, KW_ASSERT)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, ASSERT_EXPRESSION, null);
    r = consumeTokens(b, 1, KW_ASSERT, OP_PAR_LEFT);
    p = r; // pin = 1
    r = r && report_error_(b, AssignExpression(b, l + 1));
    r = p && report_error_(b, AssertExpression_3(b, l + 1)) && r;
    r = p && consumeToken(b, OP_PAR_RIGHT) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // (',' AssignExpression)?
  private static boolean AssertExpression_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AssertExpression_3")) return false;
    AssertExpression_3_0(b, l + 1);
    return true;
  }

  // ',' AssignExpression
  private static boolean AssertExpression_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AssertExpression_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OP_COMMA);
    r = r && AssignExpression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // (ConditionalExpression [ ( '=' | '+=' | '-=' | '*=' | '/=' | '%=' | '&=' | '|=' | '^=' | '~=' | '<<=' | '>>=' | '>>>=' | '^^=') AssignExpression]){
  //                             }
  public static boolean AssignExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AssignExpression")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _COLLAPSE_, ASSIGN_EXPRESSION, "<assign expression>");
    r = AssignExpression_0(b, l + 1);
    r = r && AssignExpression_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ConditionalExpression [ ( '=' | '+=' | '-=' | '*=' | '/=' | '%=' | '&=' | '|=' | '^=' | '~=' | '<<=' | '>>=' | '>>>=' | '^^=') AssignExpression]
  private static boolean AssignExpression_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AssignExpression_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ConditionalExpression(b, l + 1);
    r = r && AssignExpression_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [ ( '=' | '+=' | '-=' | '*=' | '/=' | '%=' | '&=' | '|=' | '^=' | '~=' | '<<=' | '>>=' | '>>>=' | '^^=') AssignExpression]
  private static boolean AssignExpression_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AssignExpression_0_1")) return false;
    AssignExpression_0_1_0(b, l + 1);
    return true;
  }

  // ( '=' | '+=' | '-=' | '*=' | '/=' | '%=' | '&=' | '|=' | '^=' | '~=' | '<<=' | '>>=' | '>>>=' | '^^=') AssignExpression
  private static boolean AssignExpression_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AssignExpression_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = AssignExpression_0_1_0_0(b, l + 1);
    r = r && AssignExpression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // '=' | '+=' | '-=' | '*=' | '/=' | '%=' | '&=' | '|=' | '^=' | '~=' | '<<=' | '>>=' | '>>>=' | '^^='
  private static boolean AssignExpression_0_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AssignExpression_0_1_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OP_EQ);
    if (!r) r = consumeToken(b, OP_PLUS_EQ);
    if (!r) r = consumeToken(b, OP_MINUS_EQ);
    if (!r) r = consumeToken(b, OP_MUL_EQ);
    if (!r) r = consumeToken(b, OP_DIV_EQ);
    if (!r) r = consumeToken(b, OP_MOD_EQ);
    if (!r) r = consumeToken(b, OP_AND_EQ);
    if (!r) r = consumeToken(b, OP_OR_EQ);
    if (!r) r = consumeToken(b, OP_XOR_EQ);
    if (!r) r = consumeToken(b, OP_TILDA_EQ);
    if (!r) r = consumeToken(b, OP_SH_LEFT_EQ);
    if (!r) r = consumeToken(b, OP_SH_RIGHT_EQ);
    if (!r) r = consumeToken(b, OP_USH_RIGHT_EQ);
    if (!r) r = consumeToken(b, OP_POW_EQ);
    exit_section_(b, m, null, r);
    return r;
  }

  // {
  //                             }
  private static boolean AssignExpression_1(PsiBuilder b, int l) {
    return true;
  }

  /* ********************************************************** */
  // '[' KeyValuePairs ']'
  public static boolean AssocArrayLiteral(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AssocArrayLiteral")) return false;
    if (!nextTokenIs(b, OP_BRACKET_LEFT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OP_BRACKET_LEFT);
    r = r && KeyValuePairs(b, l + 1);
    r = r && consumeToken(b, OP_BRACKET_RIGHT);
    exit_section_(b, m, ASSOC_ARRAY_LITERAL, r);
    return r;
  }

  /* ********************************************************** */
  // LinkageAttribute
  //     | AlignAttribute
  //     | DeprecatedAttribute
  //     | ProtectionAttribute
  //     | Pragma
  //     | 'static'
  //     | 'extern'
  //     | 'abstract'
  //     | 'final'
  //     | 'override'
  //     | 'synchronized'
  //     | 'auto'
  //     | 'scope'
  //     | 'const'
  //     | 'immutable'
  //     | 'inout'
  //     | 'shared'
  //     | '__gshared'
  //     | Property
  //     | 'nothrow'
  //     | 'pure'
  //     | 'ref'
  public static boolean Attribute(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Attribute")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ATTRIBUTE, "<attribute>");
    r = LinkageAttribute(b, l + 1);
    if (!r) r = AlignAttribute(b, l + 1);
    if (!r) r = DeprecatedAttribute(b, l + 1);
    if (!r) r = ProtectionAttribute(b, l + 1);
    if (!r) r = Pragma(b, l + 1);
    if (!r) r = consumeToken(b, KW_STATIC);
    if (!r) r = consumeToken(b, KW_EXTERN);
    if (!r) r = consumeToken(b, KW_ABSTRACT);
    if (!r) r = consumeToken(b, KW_FINAL);
    if (!r) r = consumeToken(b, KW_OVERRIDE);
    if (!r) r = consumeToken(b, KW_SYNCHRONIZED);
    if (!r) r = consumeToken(b, KW_AUTO);
    if (!r) r = consumeToken(b, KW_SCOPE);
    if (!r) r = consumeToken(b, KW_CONST);
    if (!r) r = consumeToken(b, KW_IMMUTABLE);
    if (!r) r = consumeToken(b, KW_INOUT);
    if (!r) r = consumeToken(b, KW_SHARED);
    if (!r) r = consumeToken(b, KW___GSHARED);
    if (!r) r = Property(b, l + 1);
    if (!r) r = consumeToken(b, KW_NOTHROW);
    if (!r) r = consumeToken(b, KW_PURE);
    if (!r) r = consumeToken(b, KW_REF);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // Attribute (':' | DeclarationBlock)
  public static boolean AttributeSpecifier(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AttributeSpecifier")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ATTRIBUTE_SPECIFIER, "<attribute specifier>");
    r = Attribute(b, l + 1);
    r = r && AttributeSpecifier_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ':' | DeclarationBlock
  private static boolean AttributeSpecifier_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AttributeSpecifier_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OP_COLON);
    if (!r) r = DeclarationBlock(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // StorageClasses? AutoDeclarationX ';'
  public static boolean AutoDeclaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AutoDeclaration")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, AUTO_DECLARATION, "<auto declaration>");
    r = AutoDeclaration_0(b, l + 1);
    r = r && AutoDeclarationX(b, l + 1);
    r = r && consumeToken(b, OP_SCOLON);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // StorageClasses?
  private static boolean AutoDeclaration_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AutoDeclaration_0")) return false;
    StorageClasses(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // AutoDeclarationY [',' AutoDeclarationX]
  public static boolean AutoDeclarationX(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AutoDeclarationX")) return false;
    if (!nextTokenIs(b, ID)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = AutoDeclarationY(b, l + 1);
    r = r && AutoDeclarationX_1(b, l + 1);
    exit_section_(b, m, AUTO_DECLARATION_X, r);
    return r;
  }

  // [',' AutoDeclarationX]
  private static boolean AutoDeclarationX_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AutoDeclarationX_1")) return false;
    AutoDeclarationX_1_0(b, l + 1);
    return true;
  }

  // ',' AutoDeclarationX
  private static boolean AutoDeclarationX_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AutoDeclarationX_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OP_COMMA);
    r = r && AutoDeclarationX(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // Identifier TemplateParameters? '=' Initializer
  public static boolean AutoDeclarationY(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AutoDeclarationY")) return false;
    if (!nextTokenIs(b, ID)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Identifier(b, l + 1);
    r = r && AutoDeclarationY_1(b, l + 1);
    r = r && consumeToken(b, OP_EQ);
    r = r && Initializer(b, l + 1);
    exit_section_(b, m, AUTO_DECLARATION_Y, r);
    return r;
  }

  // TemplateParameters?
  private static boolean AutoDeclarationY_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AutoDeclarationY_1")) return false;
    TemplateParameters(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // StorageClasses Identifier FuncDeclaratorSuffix FunctionBody?
  static boolean AutoFuncDeclaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AutoFuncDeclaration")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = StorageClasses(b, l + 1);
    r = r && Identifier(b, l + 1);
    r = r && FuncDeclaratorSuffix(b, l + 1);
    r = r && AutoFuncDeclaration_3(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // FunctionBody?
  private static boolean AutoFuncDeclaration_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AutoFuncDeclaration_3")) return false;
    FunctionBody(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // ':' SuperClass (',' Interfaces)?
  //     | ':' Interfaces
  public static boolean BaseClassList(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "BaseClassList")) return false;
    if (!nextTokenIs(b, OP_COLON)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = BaseClassList_0(b, l + 1);
    if (!r) r = BaseClassList_1(b, l + 1);
    exit_section_(b, m, BASE_CLASS_LIST, r);
    return r;
  }

  // ':' SuperClass (',' Interfaces)?
  private static boolean BaseClassList_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "BaseClassList_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OP_COLON);
    r = r && SuperClass(b, l + 1);
    r = r && BaseClassList_0_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (',' Interfaces)?
  private static boolean BaseClassList_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "BaseClassList_0_2")) return false;
    BaseClassList_0_2_0(b, l + 1);
    return true;
  }

  // ',' Interfaces
  private static boolean BaseClassList_0_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "BaseClassList_0_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OP_COMMA);
    r = r && Interfaces(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ':' Interfaces
  private static boolean BaseClassList_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "BaseClassList_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OP_COLON);
    r = r && Interfaces(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // ':' Interfaces
  public static boolean BaseInterfaceList(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "BaseInterfaceList")) return false;
    if (!nextTokenIs(b, OP_COLON)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OP_COLON);
    r = r && Interfaces(b, l + 1);
    exit_section_(b, m, BASE_INTERFACE_LIST, r);
    return r;
  }

  /* ********************************************************** */
  // BasicTypeX
  //     | ('.')? IdentifierList
  //     | Typeof ('.' IdentifierList)?
  //     | '(' Type ')'
  //     | TypeVector
  //     | '(' TypeVector ')'
  public static boolean BasicType(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "BasicType")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, BASIC_TYPE, "<basic type>");
    r = BasicTypeX(b, l + 1);
    if (!r) r = BasicType_1(b, l + 1);
    if (!r) r = BasicType_2(b, l + 1);
    if (!r) r = BasicType_3(b, l + 1);
    if (!r) r = TypeVector(b, l + 1);
    if (!r) r = BasicType_5(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ('.')? IdentifierList
  private static boolean BasicType_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "BasicType_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = BasicType_1_0(b, l + 1);
    r = r && IdentifierList(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ('.')?
  private static boolean BasicType_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "BasicType_1_0")) return false;
    consumeToken(b, OP_DOT);
    return true;
  }

  // Typeof ('.' IdentifierList)?
  private static boolean BasicType_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "BasicType_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Typeof(b, l + 1);
    r = r && BasicType_2_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ('.' IdentifierList)?
  private static boolean BasicType_2_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "BasicType_2_1")) return false;
    BasicType_2_1_0(b, l + 1);
    return true;
  }

  // '.' IdentifierList
  private static boolean BasicType_2_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "BasicType_2_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OP_DOT);
    r = r && IdentifierList(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // '(' Type ')'
  private static boolean BasicType_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "BasicType_3")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OP_PAR_LEFT);
    r = r && Type(b, l + 1);
    r = r && consumeToken(b, OP_PAR_RIGHT);
    exit_section_(b, m, null, r);
    return r;
  }

  // '(' TypeVector ')'
  private static boolean BasicType_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "BasicType_5")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OP_PAR_LEFT);
    r = r && TypeVector(b, l + 1);
    r = r && consumeToken(b, OP_PAR_RIGHT);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // BasicType2X BasicType2?
  public static boolean BasicType2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "BasicType2")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, BASIC_TYPE_2, "<basic type 2>");
    r = BasicType2X(b, l + 1);
    r = r && BasicType2_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // BasicType2?
  private static boolean BasicType2_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "BasicType2_1")) return false;
    BasicType2(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // '*'
  //     | '[' Type? ']'
  //     | '[' AssignExpression ']'
  //     | '[' AssignExpression '..' AssignExpression ']'
  //     // jflex doesn't support look ahead in the lexing process. This is a problem for situations such as [7..x], since this is lexed into '[' '7.' '.' ']'. This is not ideal todo
  //     | 'delegate' Parameters MemberFunctionAttributes?
  //     | 'function' Parameters FunctionAttributes?
  public static boolean BasicType2X(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "BasicType2X")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, BASIC_TYPE_2_X, "<basic type 2 x>");
    r = consumeToken(b, OP_ASTERISK);
    if (!r) r = BasicType2X_1(b, l + 1);
    if (!r) r = BasicType2X_2(b, l + 1);
    if (!r) r = BasicType2X_3(b, l + 1);
    if (!r) r = BasicType2X_4(b, l + 1);
    if (!r) r = BasicType2X_5(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // '[' Type? ']'
  private static boolean BasicType2X_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "BasicType2X_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OP_BRACKET_LEFT);
    r = r && BasicType2X_1_1(b, l + 1);
    r = r && consumeToken(b, OP_BRACKET_RIGHT);
    exit_section_(b, m, null, r);
    return r;
  }

  // Type?
  private static boolean BasicType2X_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "BasicType2X_1_1")) return false;
    Type(b, l + 1);
    return true;
  }

  // '[' AssignExpression ']'
  private static boolean BasicType2X_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "BasicType2X_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OP_BRACKET_LEFT);
    r = r && AssignExpression(b, l + 1);
    r = r && consumeToken(b, OP_BRACKET_RIGHT);
    exit_section_(b, m, null, r);
    return r;
  }

  // '[' AssignExpression '..' AssignExpression ']'
  private static boolean BasicType2X_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "BasicType2X_3")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OP_BRACKET_LEFT);
    r = r && AssignExpression(b, l + 1);
    r = r && consumeToken(b, OP_DDOT);
    r = r && AssignExpression(b, l + 1);
    r = r && consumeToken(b, OP_BRACKET_RIGHT);
    exit_section_(b, m, null, r);
    return r;
  }

  // 'delegate' Parameters MemberFunctionAttributes?
  private static boolean BasicType2X_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "BasicType2X_4")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, KW_DELEGATE);
    r = r && Parameters(b, l + 1);
    r = r && BasicType2X_4_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // MemberFunctionAttributes?
  private static boolean BasicType2X_4_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "BasicType2X_4_2")) return false;
    MemberFunctionAttributes(b, l + 1);
    return true;
  }

  // 'function' Parameters FunctionAttributes?
  private static boolean BasicType2X_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "BasicType2X_5")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, KW_FUNCTION);
    r = r && Parameters(b, l + 1);
    r = r && BasicType2X_5_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // FunctionAttributes?
  private static boolean BasicType2X_5_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "BasicType2X_5_2")) return false;
    FunctionAttributes(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // 'bool'
  //     | 'byte'
  //     | 'ubyte'
  //     | 'short'
  //     | 'ushort'
  //     | 'int'
  //     | 'uint'
  //     | 'long'
  //     | 'ulong'
  //     | 'char'
  //     | 'wchar'
  //     | 'dchar'
  //     | 'float'
  //     | 'double'
  //     | 'real'
  //     | 'ifloat'
  //     | 'idouble'
  //     | 'ireal'
  //     | 'cfloat'
  //     | 'cdouble'
  //     | 'creal'
  //     | 'void'
  public static boolean BasicTypeX(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "BasicTypeX")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, BASIC_TYPE_X, "<basic type x>");
    r = consumeToken(b, KW_BOOL);
    if (!r) r = consumeToken(b, KW_BYTE);
    if (!r) r = consumeToken(b, KW_UBYTE);
    if (!r) r = consumeToken(b, KW_SHORT);
    if (!r) r = consumeToken(b, KW_USHORT);
    if (!r) r = consumeToken(b, KW_INT);
    if (!r) r = consumeToken(b, KW_UINT);
    if (!r) r = consumeToken(b, KW_LONG);
    if (!r) r = consumeToken(b, KW_ULONG);
    if (!r) r = consumeToken(b, KW_CHAR);
    if (!r) r = consumeToken(b, KW_WCHAR);
    if (!r) r = consumeToken(b, KW_DCHAR);
    if (!r) r = consumeToken(b, KW_FLOAT);
    if (!r) r = consumeToken(b, KW_DOUBLE);
    if (!r) r = consumeToken(b, KW_REAL);
    if (!r) r = consumeToken(b, KW_IFLOAT);
    if (!r) r = consumeToken(b, KW_IDOUBLE);
    if (!r) r = consumeToken(b, KW_IREAL);
    if (!r) r = consumeToken(b, KW_CFLOAT);
    if (!r) r = consumeToken(b, KW_CDOUBLE);
    if (!r) r = consumeToken(b, KW_CREAL);
    if (!r) r = consumeToken(b, KW_VOID);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // '{' StatementList? '}'
  public static boolean BlockStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "BlockStatement")) return false;
    if (!nextTokenIs(b, OP_BRACES_LEFT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OP_BRACES_LEFT);
    r = r && BlockStatement_1(b, l + 1);
    r = r && consumeToken(b, OP_BRACES_RIGHT);
    exit_section_(b, m, BLOCK_STATEMENT, r);
    return r;
  }

  // StatementList?
  private static boolean BlockStatement_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "BlockStatement_1")) return false;
    StatementList(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // 'body' BlockStatement
  public static boolean BodyStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "BodyStatement")) return false;
    if (!nextTokenIs(b, KW_BODY)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, BODY_STATEMENT, null);
    r = consumeToken(b, KW_BODY);
    p = r; // pin = 1
    r = r && BlockStatement(b, l + 1);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // 'break' Identifier? ';'
  public static boolean BreakStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "BreakStatement")) return false;
    if (!nextTokenIs(b, KW_BREAK)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, BREAK_STATEMENT, null);
    r = consumeToken(b, KW_BREAK);
    p = r; // pin = 1
    r = r && report_error_(b, BreakStatement_1(b, l + 1));
    r = p && consumeToken(b, OP_SCOLON) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // Identifier?
  private static boolean BreakStatement_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "BreakStatement_1")) return false;
    Identifier(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // '@' PropertyIdentifier
  static boolean BuiltInProperty(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "BuiltInProperty")) return false;
    if (!nextTokenIs(b, OP_AT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OP_AT);
    r = r && PropertyIdentifier(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // 'case' FirstExp ':' '..' 'case' LastExp ':' StatementList
  public static boolean CaseRangeStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CaseRangeStatement")) return false;
    if (!nextTokenIs(b, KW_CASE)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, CASE_RANGE_STATEMENT, null);
    r = consumeToken(b, KW_CASE);
    r = r && FirstExp(b, l + 1);
    r = r && consumeTokens(b, 2, OP_COLON, OP_DDOT, KW_CASE);
    p = r; // pin = 4
    r = r && report_error_(b, LastExp(b, l + 1));
    r = p && report_error_(b, consumeToken(b, OP_COLON)) && r;
    r = p && StatementList(b, l + 1) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // 'case' ArgumentList ':' ScopeStatementList?
  public static boolean CaseStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CaseStatement")) return false;
    if (!nextTokenIs(b, KW_CASE)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, CASE_STATEMENT, null);
    r = consumeToken(b, KW_CASE);
    r = r && ArgumentList(b, l + 1);
    r = r && consumeToken(b, OP_COLON);
    p = r; // pin = 3
    r = r && CaseStatement_3(b, l + 1);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // ScopeStatementList?
  private static boolean CaseStatement_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CaseStatement_3")) return false;
    ScopeStatementList(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // 'cast' '(' Type ')' UnaryExpression
  //     | 'cast' '(' TypeCtors? ')' UnaryExpression{
  //         //pin(".*") = 1
  //     }
  public static boolean CastExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CastExpression")) return false;
    if (!nextTokenIs(b, KW_CAST)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = CastExpression_0(b, l + 1);
    if (!r) r = CastExpression_1(b, l + 1);
    exit_section_(b, m, CAST_EXPRESSION, r);
    return r;
  }

  // 'cast' '(' Type ')' UnaryExpression
  private static boolean CastExpression_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CastExpression_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, KW_CAST, OP_PAR_LEFT);
    r = r && Type(b, l + 1);
    r = r && consumeToken(b, OP_PAR_RIGHT);
    r = r && UnaryExpression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // 'cast' '(' TypeCtors? ')' UnaryExpression{
  //         //pin(".*") = 1
  //     }
  private static boolean CastExpression_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CastExpression_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, KW_CAST, OP_PAR_LEFT);
    r = r && CastExpression_1_2(b, l + 1);
    r = r && consumeToken(b, OP_PAR_RIGHT);
    r = r && UnaryExpression(b, l + 1);
    r = r && CastExpression_1_5(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // TypeCtors?
  private static boolean CastExpression_1_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CastExpression_1_2")) return false;
    TypeCtors(b, l + 1);
    return true;
  }

  // {
  //         //pin(".*") = 1
  //     }
  private static boolean CastExpression_1_5(PsiBuilder b, int l) {
    return true;
  }

  /* ********************************************************** */
  // 'catch' '(' CatchParameter ')' Statement
  public static boolean Catch(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Catch")) return false;
    if (!nextTokenIs(b, KW_CATCH)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, CATCH, null);
    r = consumeTokens(b, 0, KW_CATCH, OP_PAR_LEFT);
    r = r && CatchParameter(b, l + 1);
    p = r; // pin = 3
    r = r && report_error_(b, consumeToken(b, OP_PAR_RIGHT));
    r = p && Statement(b, l + 1) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // BasicType Identifier?
  public static boolean CatchParameter(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CatchParameter")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CATCH_PARAMETER, "<catch parameter>");
    r = BasicType(b, l + 1);
    r = r && CatchParameter_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // Identifier?
  private static boolean CatchParameter_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CatchParameter_1")) return false;
    Identifier(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // Catch Catch*//todo simplify
  //      | LastCatch
  public static boolean Catches(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Catches")) return false;
    if (!nextTokenIs(b, KW_CATCH)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Catches_0(b, l + 1);
    if (!r) r = LastCatch(b, l + 1);
    exit_section_(b, m, CATCHES, r);
    return r;
  }

  // Catch Catch*
  private static boolean Catches_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Catches_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Catch(b, l + 1);
    r = r && Catches_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // Catch*
  private static boolean Catches_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Catches_0_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!Catch(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "Catches_0_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  /* ********************************************************** */
  // '(' ArgumentList? ')'
  public static boolean ClassArguments(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ClassArguments")) return false;
    if (!nextTokenIs(b, OP_PAR_LEFT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OP_PAR_LEFT);
    r = r && ClassArguments_1(b, l + 1);
    r = r && consumeToken(b, OP_PAR_RIGHT);
    exit_section_(b, m, CLASS_ARGUMENTS, r);
    return r;
  }

  // ArgumentList?
  private static boolean ClassArguments_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ClassArguments_1")) return false;
    ArgumentList(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // 'class' Identifier ';'
  //     | 'class' Identifier BaseClassList? AggregateBody
  //     | ClassTemplateDeclaration
  public static boolean ClassDeclaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ClassDeclaration")) return false;
    if (!nextTokenIs(b, KW_CLASS)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ClassDeclaration_0(b, l + 1);
    if (!r) r = ClassDeclaration_1(b, l + 1);
    if (!r) r = ClassTemplateDeclaration(b, l + 1);
    exit_section_(b, m, CLASS_DECLARATION, r);
    return r;
  }

  // 'class' Identifier ';'
  private static boolean ClassDeclaration_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ClassDeclaration_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, KW_CLASS);
    r = r && Identifier(b, l + 1);
    r = r && consumeToken(b, OP_SCOLON);
    exit_section_(b, m, null, r);
    return r;
  }

  // 'class' Identifier BaseClassList? AggregateBody
  private static boolean ClassDeclaration_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ClassDeclaration_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, KW_CLASS);
    r = r && Identifier(b, l + 1);
    r = r && ClassDeclaration_1_2(b, l + 1);
    r = r && AggregateBody(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // BaseClassList?
  private static boolean ClassDeclaration_1_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ClassDeclaration_1_2")) return false;
    BaseClassList(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // 'class' Identifier TemplateParameters Constraint? BaseClassList? AggregateBody
  //     | 'class' Identifier TemplateParameters BaseClassList Constraint AggregateBody{
  // //    pin(".*") = 3
  //     }
  public static boolean ClassTemplateDeclaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ClassTemplateDeclaration")) return false;
    if (!nextTokenIs(b, KW_CLASS)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ClassTemplateDeclaration_0(b, l + 1);
    if (!r) r = ClassTemplateDeclaration_1(b, l + 1);
    exit_section_(b, m, CLASS_TEMPLATE_DECLARATION, r);
    return r;
  }

  // 'class' Identifier TemplateParameters Constraint? BaseClassList? AggregateBody
  private static boolean ClassTemplateDeclaration_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ClassTemplateDeclaration_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, KW_CLASS);
    r = r && Identifier(b, l + 1);
    r = r && TemplateParameters(b, l + 1);
    r = r && ClassTemplateDeclaration_0_3(b, l + 1);
    r = r && ClassTemplateDeclaration_0_4(b, l + 1);
    r = r && AggregateBody(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // Constraint?
  private static boolean ClassTemplateDeclaration_0_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ClassTemplateDeclaration_0_3")) return false;
    Constraint(b, l + 1);
    return true;
  }

  // BaseClassList?
  private static boolean ClassTemplateDeclaration_0_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ClassTemplateDeclaration_0_4")) return false;
    BaseClassList(b, l + 1);
    return true;
  }

  // 'class' Identifier TemplateParameters BaseClassList Constraint AggregateBody{
  // //    pin(".*") = 3
  //     }
  private static boolean ClassTemplateDeclaration_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ClassTemplateDeclaration_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, KW_CLASS);
    r = r && Identifier(b, l + 1);
    r = r && TemplateParameters(b, l + 1);
    r = r && BaseClassList(b, l + 1);
    r = r && Constraint(b, l + 1);
    r = r && AggregateBody(b, l + 1);
    r = r && ClassTemplateDeclaration_1_6(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // {
  // //    pin(".*") = 3
  //     }
  private static boolean ClassTemplateDeclaration_1_6(PsiBuilder b, int l) {
    return true;
  }

  /* ********************************************************** */
  // ShiftExpression
  //     | EqualExpression
  //     | IdentityExpression
  //     | RelExpression
  //     | InExpression
  static boolean CmpExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CmpExpression")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ShiftExpression(b, l + 1);
    if (!r) r = EqualExpression(b, l + 1);
    if (!r) r = IdentityExpression(b, l + 1);
    if (!r) r = RelExpression(b, l + 1);
    if (!r) r = InExpression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // AssignExpression (',' AssignExpression)*
  public static boolean CommaExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CommaExpression")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, COMMA_EXPRESSION, "<comma expression>");
    r = AssignExpression(b, l + 1);
    r = r && CommaExpression_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (',' AssignExpression)*
  private static boolean CommaExpression_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CommaExpression_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!CommaExpression_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "CommaExpression_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // ',' AssignExpression
  private static boolean CommaExpression_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CommaExpression_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OP_COMMA);
    r = r && AssignExpression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // VersionCondition
  //     | DebugCondition
  //     | StaticIfCondition
  public static boolean Condition(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Condition")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CONDITION, "<condition>");
    r = VersionCondition(b, l + 1);
    if (!r) r = DebugCondition(b, l + 1);
    if (!r) r = StaticIfCondition(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // Condition DeclarationBlock 'else' ':' DeclDefs?//must be on top
  //     | Condition DeclarationBlock ('else' DeclarationBlock)?
  //     | Condition ':' DeclDefs?
  public static boolean ConditionalDeclaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ConditionalDeclaration")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CONDITIONAL_DECLARATION, "<conditional declaration>");
    r = ConditionalDeclaration_0(b, l + 1);
    if (!r) r = ConditionalDeclaration_1(b, l + 1);
    if (!r) r = ConditionalDeclaration_2(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // Condition DeclarationBlock 'else' ':' DeclDefs?
  private static boolean ConditionalDeclaration_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ConditionalDeclaration_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Condition(b, l + 1);
    r = r && DeclarationBlock(b, l + 1);
    r = r && consumeTokens(b, 0, KW_ELSE, OP_COLON);
    r = r && ConditionalDeclaration_0_4(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // DeclDefs?
  private static boolean ConditionalDeclaration_0_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ConditionalDeclaration_0_4")) return false;
    DeclDefs(b, l + 1);
    return true;
  }

  // Condition DeclarationBlock ('else' DeclarationBlock)?
  private static boolean ConditionalDeclaration_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ConditionalDeclaration_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Condition(b, l + 1);
    r = r && DeclarationBlock(b, l + 1);
    r = r && ConditionalDeclaration_1_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ('else' DeclarationBlock)?
  private static boolean ConditionalDeclaration_1_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ConditionalDeclaration_1_2")) return false;
    ConditionalDeclaration_1_2_0(b, l + 1);
    return true;
  }

  // 'else' DeclarationBlock
  private static boolean ConditionalDeclaration_1_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ConditionalDeclaration_1_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, KW_ELSE);
    r = r && DeclarationBlock(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // Condition ':' DeclDefs?
  private static boolean ConditionalDeclaration_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ConditionalDeclaration_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Condition(b, l + 1);
    r = r && consumeToken(b, OP_COLON);
    r = r && ConditionalDeclaration_2_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // DeclDefs?
  private static boolean ConditionalDeclaration_2_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ConditionalDeclaration_2_2")) return false;
    DeclDefs(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // OrOrExpression_ [ConditionalExpression_]
  static boolean ConditionalExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ConditionalExpression")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = OrOrExpression_(b, l + 1);
    r = r && ConditionalExpression_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [ConditionalExpression_]
  private static boolean ConditionalExpression_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ConditionalExpression_1")) return false;
    ConditionalExpression_(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // '?' Expression ':' ConditionalExpression
  public static boolean ConditionalExpression_(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ConditionalExpression_")) return false;
    if (!nextTokenIs(b, OP_QUEST)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OP_QUEST);
    r = r && Expression(b, l + 1);
    r = r && consumeToken(b, OP_COLON);
    r = r && ConditionalExpression(b, l + 1);
    exit_section_(b, m, CONDITIONAL_EXPRESSION_, r);
    return r;
  }

  /* ********************************************************** */
  // Condition (Statement | BlockStatement | DeclarationBlock) ('else' (Statement | DeclarationBlock))?
  public static boolean ConditionalStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ConditionalStatement")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CONDITIONAL_STATEMENT, "<conditional statement>");
    r = Condition(b, l + 1);
    r = r && ConditionalStatement_1(b, l + 1);
    r = r && ConditionalStatement_2(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // Statement | BlockStatement | DeclarationBlock
  private static boolean ConditionalStatement_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ConditionalStatement_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Statement(b, l + 1);
    if (!r) r = BlockStatement(b, l + 1);
    if (!r) r = DeclarationBlock(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ('else' (Statement | DeclarationBlock))?
  private static boolean ConditionalStatement_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ConditionalStatement_2")) return false;
    ConditionalStatement_2_0(b, l + 1);
    return true;
  }

  // 'else' (Statement | DeclarationBlock)
  private static boolean ConditionalStatement_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ConditionalStatement_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, KW_ELSE);
    r = r && ConditionalStatement_2_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // Statement | DeclarationBlock
  private static boolean ConditionalStatement_2_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ConditionalStatement_2_0_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Statement(b, l + 1);
    if (!r) r = DeclarationBlock(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // 'if' '(' Expression ')'
  public static boolean Constraint(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Constraint")) return false;
    if (!nextTokenIs(b, KW_IF)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, CONSTRAINT, null);
    r = consumeTokens(b, 1, KW_IF, OP_PAR_LEFT);
    p = r; // pin = 1
    r = r && report_error_(b, Expression(b, l + 1));
    r = p && consumeToken(b, OP_PAR_RIGHT) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // 'this' Parameters MemberFunctionAttributes? ';'
  //     | 'this' Parameters MemberFunctionAttributes? FunctionBody
  //     | ConstructorTemplate
  public static boolean Constructor(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Constructor")) return false;
    if (!nextTokenIs(b, KW_THIS)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Constructor_0(b, l + 1);
    if (!r) r = Constructor_1(b, l + 1);
    if (!r) r = ConstructorTemplate(b, l + 1);
    exit_section_(b, m, CONSTRUCTOR, r);
    return r;
  }

  // 'this' Parameters MemberFunctionAttributes? ';'
  private static boolean Constructor_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Constructor_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, KW_THIS);
    r = r && Parameters(b, l + 1);
    r = r && Constructor_0_2(b, l + 1);
    r = r && consumeToken(b, OP_SCOLON);
    exit_section_(b, m, null, r);
    return r;
  }

  // MemberFunctionAttributes?
  private static boolean Constructor_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Constructor_0_2")) return false;
    MemberFunctionAttributes(b, l + 1);
    return true;
  }

  // 'this' Parameters MemberFunctionAttributes? FunctionBody
  private static boolean Constructor_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Constructor_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, KW_THIS);
    r = r && Parameters(b, l + 1);
    r = r && Constructor_1_2(b, l + 1);
    r = r && FunctionBody(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // MemberFunctionAttributes?
  private static boolean Constructor_1_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Constructor_1_2")) return false;
    MemberFunctionAttributes(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // 'this' TemplateParameters Parameters MemberFunctionAttributes? Constraint? ';'
  //     | 'this' TemplateParameters Parameters MemberFunctionAttributes? Constraint? FunctionBody{
  //     //pin(".*") = 1
  //     }
  public static boolean ConstructorTemplate(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ConstructorTemplate")) return false;
    if (!nextTokenIs(b, KW_THIS)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ConstructorTemplate_0(b, l + 1);
    if (!r) r = ConstructorTemplate_1(b, l + 1);
    exit_section_(b, m, CONSTRUCTOR_TEMPLATE, r);
    return r;
  }

  // 'this' TemplateParameters Parameters MemberFunctionAttributes? Constraint? ';'
  private static boolean ConstructorTemplate_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ConstructorTemplate_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, KW_THIS);
    r = r && TemplateParameters(b, l + 1);
    r = r && Parameters(b, l + 1);
    r = r && ConstructorTemplate_0_3(b, l + 1);
    r = r && ConstructorTemplate_0_4(b, l + 1);
    r = r && consumeToken(b, OP_SCOLON);
    exit_section_(b, m, null, r);
    return r;
  }

  // MemberFunctionAttributes?
  private static boolean ConstructorTemplate_0_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ConstructorTemplate_0_3")) return false;
    MemberFunctionAttributes(b, l + 1);
    return true;
  }

  // Constraint?
  private static boolean ConstructorTemplate_0_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ConstructorTemplate_0_4")) return false;
    Constraint(b, l + 1);
    return true;
  }

  // 'this' TemplateParameters Parameters MemberFunctionAttributes? Constraint? FunctionBody{
  //     //pin(".*") = 1
  //     }
  private static boolean ConstructorTemplate_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ConstructorTemplate_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, KW_THIS);
    r = r && TemplateParameters(b, l + 1);
    r = r && Parameters(b, l + 1);
    r = r && ConstructorTemplate_1_3(b, l + 1);
    r = r && ConstructorTemplate_1_4(b, l + 1);
    r = r && FunctionBody(b, l + 1);
    r = r && ConstructorTemplate_1_6(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // MemberFunctionAttributes?
  private static boolean ConstructorTemplate_1_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ConstructorTemplate_1_3")) return false;
    MemberFunctionAttributes(b, l + 1);
    return true;
  }

  // Constraint?
  private static boolean ConstructorTemplate_1_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ConstructorTemplate_1_4")) return false;
    Constraint(b, l + 1);
    return true;
  }

  // {
  //     //pin(".*") = 1
  //     }
  private static boolean ConstructorTemplate_1_6(PsiBuilder b, int l) {
    return true;
  }

  /* ********************************************************** */
  // 'continue' Identifier? ';'
  public static boolean ContinueStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ContinueStatement")) return false;
    if (!nextTokenIs(b, KW_CONTINUE)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, CONTINUE_STATEMENT, null);
    r = consumeToken(b, KW_CONTINUE);
    p = r; // pin = 1
    r = r && report_error_(b, ContinueStatement_1(b, l + 1));
    r = p && consumeToken(b, OP_SCOLON) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // Identifier?
  private static boolean ContinueStatement_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ContinueStatement_1")) return false;
    Identifier(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // 'delete' Parameters ';'
  //     | 'delete' Parameters FunctionBody
  public static boolean Deallocator(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Deallocator")) return false;
    if (!nextTokenIs(b, KW_DELETE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Deallocator_0(b, l + 1);
    if (!r) r = Deallocator_1(b, l + 1);
    exit_section_(b, m, DEALLOCATOR, r);
    return r;
  }

  // 'delete' Parameters ';'
  private static boolean Deallocator_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Deallocator_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, KW_DELETE);
    r = r && Parameters(b, l + 1);
    r = r && consumeToken(b, OP_SCOLON);
    exit_section_(b, m, null, r);
    return r;
  }

  // 'delete' Parameters FunctionBody
  private static boolean Deallocator_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Deallocator_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, KW_DELETE);
    r = r && Parameters(b, l + 1);
    r = r && FunctionBody(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // 'debug' ('(' (INTEGER_LITERAL | Identifier) ')')?
  public static boolean DebugCondition(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DebugCondition")) return false;
    if (!nextTokenIs(b, KW_DEBUG)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, DEBUG_CONDITION, null);
    r = consumeToken(b, KW_DEBUG);
    p = r; // pin = 1
    r = r && DebugCondition_1(b, l + 1);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // ('(' (INTEGER_LITERAL | Identifier) ')')?
  private static boolean DebugCondition_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DebugCondition_1")) return false;
    DebugCondition_1_0(b, l + 1);
    return true;
  }

  // '(' (INTEGER_LITERAL | Identifier) ')'
  private static boolean DebugCondition_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DebugCondition_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OP_PAR_LEFT);
    r = r && DebugCondition_1_0_1(b, l + 1);
    r = r && consumeToken(b, OP_PAR_RIGHT);
    exit_section_(b, m, null, r);
    return r;
  }

  // INTEGER_LITERAL | Identifier
  private static boolean DebugCondition_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DebugCondition_1_0_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, INTEGER_LITERAL);
    if (!r) r = Identifier(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // 'debug' '=' (Identifier | INTEGER_LITERAL) ';'
  public static boolean DebugSpecification(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DebugSpecification")) return false;
    if (!nextTokenIs(b, KW_DEBUG)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, DEBUG_SPECIFICATION, null);
    r = consumeTokens(b, 2, KW_DEBUG, OP_EQ);
    p = r; // pin = 2
    r = r && report_error_(b, DebugSpecification_2(b, l + 1));
    r = p && consumeToken(b, OP_SCOLON) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // Identifier | INTEGER_LITERAL
  private static boolean DebugSpecification_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DebugSpecification_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Identifier(b, l + 1);
    if (!r) r = consumeToken(b, INTEGER_LITERAL);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // AttributeSpecifier
  //     | Declaration
  //     | Postblit
  //     | Constructor
  //     | Destructor
  //     | Allocator
  //     | Deallocator
  //     | Invariant
  //     | UnitTesting
  //     | AliasThis
  //     | StaticConstructor
  //     | StaticDestructor
  //     | SharedStaticConstructor
  //     | SharedStaticDestructor
  //     | ConditionalDeclaration
  //     | DebugSpecification
  //     | VersionSpecification
  //     | StaticAssert
  //     | TemplateDeclaration
  //     | TemplateMixinDeclaration
  //     | TemplateMixin
  //     | MixinDeclaration
  //     | StaticIfCondition
  //     | StaticElseCondition
  //     | ';'
  public static boolean DeclDef(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DeclDef")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, DECL_DEF, "<decl def>");
    r = AttributeSpecifier(b, l + 1);
    if (!r) r = Declaration(b, l + 1);
    if (!r) r = Postblit(b, l + 1);
    if (!r) r = Constructor(b, l + 1);
    if (!r) r = Destructor(b, l + 1);
    if (!r) r = Allocator(b, l + 1);
    if (!r) r = Deallocator(b, l + 1);
    if (!r) r = Invariant(b, l + 1);
    if (!r) r = UnitTesting(b, l + 1);
    if (!r) r = AliasThis(b, l + 1);
    if (!r) r = StaticConstructor(b, l + 1);
    if (!r) r = StaticDestructor(b, l + 1);
    if (!r) r = SharedStaticConstructor(b, l + 1);
    if (!r) r = SharedStaticDestructor(b, l + 1);
    if (!r) r = ConditionalDeclaration(b, l + 1);
    if (!r) r = DebugSpecification(b, l + 1);
    if (!r) r = VersionSpecification(b, l + 1);
    if (!r) r = StaticAssert(b, l + 1);
    if (!r) r = TemplateDeclaration(b, l + 1);
    if (!r) r = TemplateMixinDeclaration(b, l + 1);
    if (!r) r = TemplateMixin(b, l + 1);
    if (!r) r = MixinDeclaration(b, l + 1);
    if (!r) r = StaticIfCondition(b, l + 1);
    if (!r) r = StaticElseCondition(b, l + 1);
    if (!r) r = consumeToken(b, OP_SCOLON);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // DeclDef DeclDef*
  public static boolean DeclDefs(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DeclDefs")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, DECL_DEFS, "<decl defs>");
    r = DeclDef(b, l + 1);
    p = r; // pin = 1
    r = r && DeclDefs_1(b, l + 1);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // DeclDef*
  private static boolean DeclDefs_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DeclDefs_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!DeclDef(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "DeclDefs_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  /* ********************************************************** */
  // EnumFuncDeclaration
  //    | FuncDeclaration
  //    | EnumDeclaration
  //    | VarDeclarations //must come before alias decleration
  //    | AliasDeclaration
  //    | AggregateDeclaration
  //    | ImportDeclaration
  //    | TemplateDeclaration
  public static boolean Declaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Declaration")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, DECLARATION, "<declaration>");
    r = EnumFuncDeclaration(b, l + 1);
    if (!r) r = FuncDeclaration(b, l + 1);
    if (!r) r = EnumDeclaration(b, l + 1);
    if (!r) r = VarDeclarations(b, l + 1);
    if (!r) r = AliasDeclaration(b, l + 1);
    if (!r) r = AggregateDeclaration(b, l + 1);
    if (!r) r = ImportDeclaration(b, l + 1);
    if (!r) r = TemplateDeclaration(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // DeclDef
  //     | '{' DeclDefs? '}'
  public static boolean DeclarationBlock(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DeclarationBlock")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, DECLARATION_BLOCK, "<declaration block>");
    r = DeclDef(b, l + 1);
    if (!r) r = DeclarationBlock_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // '{' DeclDefs? '}'
  private static boolean DeclarationBlock_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DeclarationBlock_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OP_BRACES_LEFT);
    r = r && DeclarationBlock_1_1(b, l + 1);
    r = r && consumeToken(b, OP_BRACES_RIGHT);
    exit_section_(b, m, null, r);
    return r;
  }

  // DeclDefs?
  private static boolean DeclarationBlock_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DeclarationBlock_1_1")) return false;
    DeclDefs(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // StorageClasses? Declaration
  public static boolean DeclarationStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DeclarationStatement")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, DECLARATION_STATEMENT, "<declaration statement>");
    r = DeclarationStatement_0(b, l + 1);
    r = r && Declaration(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // StorageClasses?
  private static boolean DeclarationStatement_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DeclarationStatement_0")) return false;
    StorageClasses(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // VarDeclarator
  //     | AltDeclarator
  public static boolean Declarator(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Declarator")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, DECLARATOR, "<declarator>");
    r = VarDeclarator(b, l + 1);
    if (!r) r = AltDeclarator(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // VarDeclaratorIdentifier
  //     | AltDeclaratorIdentifier
  public static boolean DeclaratorIdentifier(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DeclaratorIdentifier")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, DECLARATOR_IDENTIFIER, "<declarator identifier>");
    r = VarDeclaratorIdentifier(b, l + 1);
    if (!r) r = AltDeclaratorIdentifier(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // DeclaratorIdentifier [',' DeclaratorIdentifierList]
  public static boolean DeclaratorIdentifierList(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DeclaratorIdentifierList")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, DECLARATOR_IDENTIFIER_LIST, "<declarator identifier list>");
    r = DeclaratorIdentifier(b, l + 1);
    r = r && DeclaratorIdentifierList_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // [',' DeclaratorIdentifierList]
  private static boolean DeclaratorIdentifierList_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DeclaratorIdentifierList_1")) return false;
    DeclaratorIdentifierList_1_0(b, l + 1);
    return true;
  }

  // ',' DeclaratorIdentifierList
  private static boolean DeclaratorIdentifierList_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DeclaratorIdentifierList_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OP_COMMA);
    r = r && DeclaratorIdentifierList(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // AltDeclarator ('=' Initializer)?
  //     | VarDeclarator (TemplateParameters? '=' Initializer)?
  public static boolean DeclaratorInitializer(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DeclaratorInitializer")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, DECLARATOR_INITIALIZER, "<declarator initializer>");
    r = DeclaratorInitializer_0(b, l + 1);
    if (!r) r = DeclaratorInitializer_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // AltDeclarator ('=' Initializer)?
  private static boolean DeclaratorInitializer_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DeclaratorInitializer_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = AltDeclarator(b, l + 1);
    r = r && DeclaratorInitializer_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ('=' Initializer)?
  private static boolean DeclaratorInitializer_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DeclaratorInitializer_0_1")) return false;
    DeclaratorInitializer_0_1_0(b, l + 1);
    return true;
  }

  // '=' Initializer
  private static boolean DeclaratorInitializer_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DeclaratorInitializer_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OP_EQ);
    r = r && Initializer(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // VarDeclarator (TemplateParameters? '=' Initializer)?
  private static boolean DeclaratorInitializer_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DeclaratorInitializer_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = VarDeclarator(b, l + 1);
    r = r && DeclaratorInitializer_1_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (TemplateParameters? '=' Initializer)?
  private static boolean DeclaratorInitializer_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DeclaratorInitializer_1_1")) return false;
    DeclaratorInitializer_1_1_0(b, l + 1);
    return true;
  }

  // TemplateParameters? '=' Initializer
  private static boolean DeclaratorInitializer_1_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DeclaratorInitializer_1_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = DeclaratorInitializer_1_1_0_0(b, l + 1);
    r = r && consumeToken(b, OP_EQ);
    r = r && Initializer(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // TemplateParameters?
  private static boolean DeclaratorInitializer_1_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DeclaratorInitializer_1_1_0_0")) return false;
    TemplateParameters(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // DeclaratorInitializer (',' DeclaratorIdentifierList)?
  public static boolean Declarators(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Declarators")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, DECLARATORS, "<declarators>");
    r = DeclaratorInitializer(b, l + 1);
    r = r && Declarators_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (',' DeclaratorIdentifierList)?
  private static boolean Declarators_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Declarators_1")) return false;
    Declarators_1_0(b, l + 1);
    return true;
  }

  // ',' DeclaratorIdentifierList
  private static boolean Declarators_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Declarators_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OP_COMMA);
    r = r && DeclaratorIdentifierList(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // 'default' ':' ScopeStatementList?
  public static boolean DefaultStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DefaultStatement")) return false;
    if (!nextTokenIs(b, KW_DEFAULT)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, DEFAULT_STATEMENT, null);
    r = consumeTokens(b, 1, KW_DEFAULT, OP_COLON);
    p = r; // pin = 1
    r = r && DefaultStatement_2(b, l + 1);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // ScopeStatementList?
  private static boolean DefaultStatement_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DefaultStatement_2")) return false;
    ScopeStatementList(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // 'delete' UnaryExpression{
  // //        pin = 2
  //     }
  public static boolean DeleteExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DeleteExpression")) return false;
    if (!nextTokenIs(b, KW_DELETE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, KW_DELETE);
    r = r && UnaryExpression(b, l + 1);
    r = r && DeleteExpression_2(b, l + 1);
    exit_section_(b, m, DELETE_EXPRESSION, r);
    return r;
  }

  // {
  // //        pin = 2
  //     }
  private static boolean DeleteExpression_2(PsiBuilder b, int l) {
    return true;
  }

  /* ********************************************************** */
  // 'deprecated' ('(' AssignExpression')')?
  public static boolean DeprecatedAttribute(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DeprecatedAttribute")) return false;
    if (!nextTokenIs(b, KW_DEPRECATED)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, DEPRECATED_ATTRIBUTE, null);
    r = consumeToken(b, KW_DEPRECATED);
    p = r; // pin = 1
    r = r && DeprecatedAttribute_1(b, l + 1);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // ('(' AssignExpression')')?
  private static boolean DeprecatedAttribute_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DeprecatedAttribute_1")) return false;
    DeprecatedAttribute_1_0(b, l + 1);
    return true;
  }

  // '(' AssignExpression')'
  private static boolean DeprecatedAttribute_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DeprecatedAttribute_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OP_PAR_LEFT);
    r = r && AssignExpression(b, l + 1);
    r = r && consumeToken(b, OP_PAR_RIGHT);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // '~' 'this' '(' ')' MemberFunctionAttributes? ';'
  //     | '~' 'this' '(' ')' MemberFunctionAttributes? FunctionBody
  public static boolean Destructor(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Destructor")) return false;
    if (!nextTokenIs(b, OP_TILDA)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Destructor_0(b, l + 1);
    if (!r) r = Destructor_1(b, l + 1);
    exit_section_(b, m, DESTRUCTOR, r);
    return r;
  }

  // '~' 'this' '(' ')' MemberFunctionAttributes? ';'
  private static boolean Destructor_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Destructor_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, OP_TILDA, KW_THIS, OP_PAR_LEFT, OP_PAR_RIGHT);
    r = r && Destructor_0_4(b, l + 1);
    r = r && consumeToken(b, OP_SCOLON);
    exit_section_(b, m, null, r);
    return r;
  }

  // MemberFunctionAttributes?
  private static boolean Destructor_0_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Destructor_0_4")) return false;
    MemberFunctionAttributes(b, l + 1);
    return true;
  }

  // '~' 'this' '(' ')' MemberFunctionAttributes? FunctionBody
  private static boolean Destructor_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Destructor_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, OP_TILDA, KW_THIS, OP_PAR_LEFT, OP_PAR_RIGHT);
    r = r && Destructor_1_4(b, l + 1);
    r = r && FunctionBody(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // MemberFunctionAttributes?
  private static boolean Destructor_1_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Destructor_1_4")) return false;
    MemberFunctionAttributes(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // 'do' ScopeStatement 'while' '(' Expression ')' ';'
  public static boolean DoStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DoStatement")) return false;
    if (!nextTokenIs(b, KW_DO)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, DO_STATEMENT, null);
    r = consumeToken(b, KW_DO);
    p = r; // pin = 1
    r = r && report_error_(b, ScopeStatement(b, l + 1));
    r = p && report_error_(b, consumeTokens(b, -1, KW_WHILE, OP_PAR_LEFT)) && r;
    r = p && report_error_(b, Expression(b, l + 1)) && r;
    r = p && report_error_(b, consumeTokens(b, -1, OP_PAR_RIGHT, OP_SCOLON)) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // Identifier ['.' DotIdentifier]
  public static boolean DotIdentifier(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DotIdentifier")) return false;
    if (!nextTokenIs(b, ID)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Identifier(b, l + 1);
    r = r && DotIdentifier_1(b, l + 1);
    exit_section_(b, m, DOT_IDENTIFIER, r);
    return r;
  }

  // ['.' DotIdentifier]
  private static boolean DotIdentifier_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DotIdentifier_1")) return false;
    DotIdentifier_1_0(b, l + 1);
    return true;
  }

  // '.' DotIdentifier
  private static boolean DotIdentifier_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DotIdentifier_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OP_DOT);
    r = r && DotIdentifier(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // ScopeStatement
  public static boolean ElseStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ElseStatement")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ELSE_STATEMENT, "<else statement>");
    r = ScopeStatement(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // Type
  public static boolean EnumBaseType(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "EnumBaseType")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ENUM_BASE_TYPE, "<enum base type>");
    r = Type(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // '{' EnumMembers ','? '}'
  public static boolean EnumBody(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "EnumBody")) return false;
    if (!nextTokenIs(b, OP_BRACES_LEFT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OP_BRACES_LEFT);
    r = r && EnumMembers(b, l + 1);
    r = r && EnumBody_2(b, l + 1);
    r = r && consumeToken(b, OP_BRACES_RIGHT);
    exit_section_(b, m, ENUM_BODY, r);
    return r;
  }

  // ','?
  private static boolean EnumBody_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "EnumBody_2")) return false;
    consumeToken(b, OP_COMMA);
    return true;
  }

  /* ********************************************************** */
  // 'enum' Identifier (':' EnumBaseType)? EnumBody
  //     | AnonymousEnumDeclaration
  public static boolean EnumDeclaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "EnumDeclaration")) return false;
    if (!nextTokenIs(b, KW_ENUM)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = EnumDeclaration_0(b, l + 1);
    if (!r) r = AnonymousEnumDeclaration(b, l + 1);
    exit_section_(b, m, ENUM_DECLARATION, r);
    return r;
  }

  // 'enum' Identifier (':' EnumBaseType)? EnumBody
  private static boolean EnumDeclaration_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "EnumDeclaration_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, KW_ENUM);
    r = r && Identifier(b, l + 1);
    r = r && EnumDeclaration_0_2(b, l + 1);
    r = r && EnumBody(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (':' EnumBaseType)?
  private static boolean EnumDeclaration_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "EnumDeclaration_0_2")) return false;
    EnumDeclaration_0_2_0(b, l + 1);
    return true;
  }

  // ':' EnumBaseType
  private static boolean EnumDeclaration_0_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "EnumDeclaration_0_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OP_COLON);
    r = r && EnumBaseType(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // (('enum'|'auto'|Type) FuncDeclarator '=' AssignExpression ';')
  //     | (('enum'|'auto'|Type) BasicType FuncDeclarator '=' AssignExpression ';')
  public static boolean EnumFuncDeclaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "EnumFuncDeclaration")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ENUM_FUNC_DECLARATION, "<enum func declaration>");
    r = EnumFuncDeclaration_0(b, l + 1);
    if (!r) r = EnumFuncDeclaration_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ('enum'|'auto'|Type) FuncDeclarator '=' AssignExpression ';'
  private static boolean EnumFuncDeclaration_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "EnumFuncDeclaration_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = EnumFuncDeclaration_0_0(b, l + 1);
    r = r && FuncDeclarator(b, l + 1);
    r = r && consumeToken(b, OP_EQ);
    r = r && AssignExpression(b, l + 1);
    r = r && consumeToken(b, OP_SCOLON);
    exit_section_(b, m, null, r);
    return r;
  }

  // 'enum'|'auto'|Type
  private static boolean EnumFuncDeclaration_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "EnumFuncDeclaration_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, KW_ENUM);
    if (!r) r = consumeToken(b, KW_AUTO);
    if (!r) r = Type(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ('enum'|'auto'|Type) BasicType FuncDeclarator '=' AssignExpression ';'
  private static boolean EnumFuncDeclaration_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "EnumFuncDeclaration_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = EnumFuncDeclaration_1_0(b, l + 1);
    r = r && BasicType(b, l + 1);
    r = r && FuncDeclarator(b, l + 1);
    r = r && consumeToken(b, OP_EQ);
    r = r && AssignExpression(b, l + 1);
    r = r && consumeToken(b, OP_SCOLON);
    exit_section_(b, m, null, r);
    return r;
  }

  // 'enum'|'auto'|Type
  private static boolean EnumFuncDeclaration_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "EnumFuncDeclaration_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, KW_ENUM);
    if (!r) r = consumeToken(b, KW_AUTO);
    if (!r) r = Type(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // Identifier ('=' AssignExpression)? | Type Identifier '=' AssignExpression
  public static boolean EnumMember(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "EnumMember")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ENUM_MEMBER, "<enum member>");
    r = EnumMember_0(b, l + 1);
    if (!r) r = EnumMember_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // Identifier ('=' AssignExpression)?
  private static boolean EnumMember_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "EnumMember_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Identifier(b, l + 1);
    r = r && EnumMember_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ('=' AssignExpression)?
  private static boolean EnumMember_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "EnumMember_0_1")) return false;
    EnumMember_0_1_0(b, l + 1);
    return true;
  }

  // '=' AssignExpression
  private static boolean EnumMember_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "EnumMember_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OP_EQ);
    r = r && AssignExpression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // Type Identifier '=' AssignExpression
  private static boolean EnumMember_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "EnumMember_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Type(b, l + 1);
    r = r && Identifier(b, l + 1);
    r = r && consumeToken(b, OP_EQ);
    r = r && AssignExpression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // EnumMember (',' EnumMember)*
  public static boolean EnumMembers(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "EnumMembers")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ENUM_MEMBERS, "<enum members>");
    r = EnumMember(b, l + 1);
    r = r && EnumMembers_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (',' EnumMember)*
  private static boolean EnumMembers_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "EnumMembers_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!EnumMembers_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "EnumMembers_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // ',' EnumMember
  private static boolean EnumMembers_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "EnumMembers_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OP_COMMA);
    r = r && EnumMember(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // ('==' | '!=') [ShiftExpression]
  public static boolean EqualExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "EqualExpression")) return false;
    if (!nextTokenIs(b, "<equal expression>", OP_NOT_EQ, OP_EQ_EQ)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, EQUAL_EXPRESSION, "<equal expression>");
    r = EqualExpression_0(b, l + 1);
    p = r; // pin = 1
    r = r && EqualExpression_1(b, l + 1);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // '==' | '!='
  private static boolean EqualExpression_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "EqualExpression_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OP_EQ_EQ);
    if (!r) r = consumeToken(b, OP_NOT_EQ);
    exit_section_(b, m, null, r);
    return r;
  }

  // [ShiftExpression]
  private static boolean EqualExpression_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "EqualExpression_1")) return false;
    ShiftExpression(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // CommaExpression
  static boolean Expression(PsiBuilder b, int l) {
    return CommaExpression(b, l + 1);
  }

  /* ********************************************************** */
  // Expression ';'?
  public static boolean ExpressionStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ExpressionStatement")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, EXPRESSION_STATEMENT, "<expression statement>");
    r = Expression(b, l + 1);
    r = r && ExpressionStatement_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ';'?
  private static boolean ExpressionStatement_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ExpressionStatement_1")) return false;
    consumeToken(b, OP_SCOLON);
    return true;
  }

  /* ********************************************************** */
  // 'final' 'switch' '(' Expression ')' ScopeStatement
  public static boolean FinalSwitchStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FinalSwitchStatement")) return false;
    if (!nextTokenIs(b, KW_FINAL)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, FINAL_SWITCH_STATEMENT, null);
    r = consumeTokens(b, 2, KW_FINAL, KW_SWITCH, OP_PAR_LEFT);
    p = r; // pin = 2
    r = r && report_error_(b, Expression(b, l + 1));
    r = p && report_error_(b, consumeToken(b, OP_PAR_RIGHT)) && r;
    r = p && ScopeStatement(b, l + 1) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // 'finally' Statement
  public static boolean FinallyStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FinallyStatement")) return false;
    if (!nextTokenIs(b, KW_FINALLY)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, FINALLY_STATEMENT, null);
    r = consumeToken(b, KW_FINALLY);
    p = r; // pin = 1
    r = r && Statement(b, l + 1);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // AssignExpression
  public static boolean FirstExp(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FirstExp")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, FIRST_EXP, "<first exp>");
    r = AssignExpression(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // 'for' '(' Initialize Test? ';' Increment? ')' ScopeStatement
  public static boolean ForStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ForStatement")) return false;
    if (!nextTokenIs(b, KW_FOR)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, FOR_STATEMENT, null);
    r = consumeTokens(b, 1, KW_FOR, OP_PAR_LEFT);
    p = r; // pin = 1
    r = r && report_error_(b, Initialize(b, l + 1));
    r = p && report_error_(b, ForStatement_3(b, l + 1)) && r;
    r = p && report_error_(b, consumeToken(b, OP_SCOLON)) && r;
    r = p && report_error_(b, ForStatement_5(b, l + 1)) && r;
    r = p && report_error_(b, consumeToken(b, OP_PAR_RIGHT)) && r;
    r = p && ScopeStatement(b, l + 1) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // Test?
  private static boolean ForStatement_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ForStatement_3")) return false;
    Test(b, l + 1);
    return true;
  }

  // Increment?
  private static boolean ForStatement_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ForStatement_5")) return false;
    Increment(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // 'foreach'
  //     | 'foreach_reverse'
  public static boolean Foreach(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Foreach")) return false;
    if (!nextTokenIs(b, "<foreach>", KW_FOREACH, KW_FOREACH_REVERSE)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, FOREACH, "<foreach>");
    r = consumeToken(b, KW_FOREACH);
    if (!r) r = consumeToken(b, KW_FOREACH_REVERSE);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // Expression
  public static boolean ForeachAggregate(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ForeachAggregate")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, FOREACH_AGGREGATE, "<foreach aggregate>");
    r = Expression(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // Foreach '(' ForeachType ';' LwrExpression '..' UprExpression ')' ScopeStatement
  public static boolean ForeachRangeStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ForeachRangeStatement")) return false;
    if (!nextTokenIs(b, "<foreach range statement>", KW_FOREACH, KW_FOREACH_REVERSE)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, FOREACH_RANGE_STATEMENT, "<foreach range statement>");
    r = Foreach(b, l + 1);
    r = r && consumeToken(b, OP_PAR_LEFT);
    r = r && ForeachType(b, l + 1);
    r = r && consumeToken(b, OP_SCOLON);
    r = r && LwrExpression(b, l + 1);
    r = r && consumeToken(b, OP_DDOT);
    r = r && UprExpression(b, l + 1);
    r = r && consumeToken(b, OP_PAR_RIGHT);
    r = r && ScopeStatement(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // Foreach '(' ForeachTypeList ';' ForeachAggregate ')' Statement
  public static boolean ForeachStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ForeachStatement")) return false;
    if (!nextTokenIs(b, "<foreach statement>", KW_FOREACH, KW_FOREACH_REVERSE)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, FOREACH_STATEMENT, "<foreach statement>");
    r = Foreach(b, l + 1);
    r = r && consumeToken(b, OP_PAR_LEFT);
    r = r && ForeachTypeList(b, l + 1);
    r = r && consumeToken(b, OP_SCOLON);
    r = r && ForeachAggregate(b, l + 1);
    r = r && consumeToken(b, OP_PAR_RIGHT);
    r = r && Statement(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // ForeachTypeAttributes? Type? Identifier // this needs to be above for ForeachTypeAttributes? Type? Identifier
  //    | ForeachTypeAttribute Identifier
  //    | Type? ForeachTypeAttributes? Identifier
  //    | Identifier
  public static boolean ForeachType(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ForeachType")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, FOREACH_TYPE, "<foreach type>");
    r = ForeachType_0(b, l + 1);
    if (!r) r = ForeachType_1(b, l + 1);
    if (!r) r = ForeachType_2(b, l + 1);
    if (!r) r = Identifier(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ForeachTypeAttributes? Type? Identifier
  private static boolean ForeachType_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ForeachType_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ForeachType_0_0(b, l + 1);
    r = r && ForeachType_0_1(b, l + 1);
    r = r && Identifier(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ForeachTypeAttributes?
  private static boolean ForeachType_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ForeachType_0_0")) return false;
    ForeachTypeAttributes(b, l + 1);
    return true;
  }

  // Type?
  private static boolean ForeachType_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ForeachType_0_1")) return false;
    Type(b, l + 1);
    return true;
  }

  // ForeachTypeAttribute Identifier
  private static boolean ForeachType_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ForeachType_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ForeachTypeAttribute(b, l + 1);
    r = r && Identifier(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // Type? ForeachTypeAttributes? Identifier
  private static boolean ForeachType_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ForeachType_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ForeachType_2_0(b, l + 1);
    r = r && ForeachType_2_1(b, l + 1);
    r = r && Identifier(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // Type?
  private static boolean ForeachType_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ForeachType_2_0")) return false;
    Type(b, l + 1);
    return true;
  }

  // ForeachTypeAttributes?
  private static boolean ForeachType_2_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ForeachType_2_1")) return false;
    ForeachTypeAttributes(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // 'ref'
  //     | TypeCtor
  public static boolean ForeachTypeAttribute(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ForeachTypeAttribute")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, FOREACH_TYPE_ATTRIBUTE, "<foreach type attribute>");
    r = consumeToken(b, KW_REF);
    if (!r) r = TypeCtor(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // ForeachTypeAttribute [ForeachTypeAttributes]
  public static boolean ForeachTypeAttributes(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ForeachTypeAttributes")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, FOREACH_TYPE_ATTRIBUTES, "<foreach type attributes>");
    r = ForeachTypeAttribute(b, l + 1);
    r = r && ForeachTypeAttributes_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // [ForeachTypeAttributes]
  private static boolean ForeachTypeAttributes_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ForeachTypeAttributes_1")) return false;
    ForeachTypeAttributes(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // ForeachType (',' ForeachType)*
  public static boolean ForeachTypeList(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ForeachTypeList")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, FOREACH_TYPE_LIST, "<foreach type list>");
    r = ForeachType(b, l + 1);
    r = r && ForeachTypeList_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (',' ForeachType)*
  private static boolean ForeachTypeList_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ForeachTypeList_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!ForeachTypeList_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "ForeachTypeList_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // ',' ForeachType
  private static boolean ForeachTypeList_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ForeachTypeList_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OP_COMMA);
    r = r && ForeachType(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // StorageClasses? BasicType FuncDeclarator (FunctionBody |';' )?
  //     | AutoFuncDeclaration
  public static boolean FuncDeclaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FuncDeclaration")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, FUNC_DECLARATION, "<func declaration>");
    r = FuncDeclaration_0(b, l + 1);
    if (!r) r = AutoFuncDeclaration(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // StorageClasses? BasicType FuncDeclarator (FunctionBody |';' )?
  private static boolean FuncDeclaration_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FuncDeclaration_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = FuncDeclaration_0_0(b, l + 1);
    r = r && BasicType(b, l + 1);
    r = r && FuncDeclarator(b, l + 1);
    r = r && FuncDeclaration_0_3(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // StorageClasses?
  private static boolean FuncDeclaration_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FuncDeclaration_0_0")) return false;
    StorageClasses(b, l + 1);
    return true;
  }

  // (FunctionBody |';' )?
  private static boolean FuncDeclaration_0_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FuncDeclaration_0_3")) return false;
    FuncDeclaration_0_3_0(b, l + 1);
    return true;
  }

  // FunctionBody |';'
  private static boolean FuncDeclaration_0_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FuncDeclaration_0_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = FunctionBody(b, l + 1);
    if (!r) r = consumeToken(b, OP_SCOLON);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // BasicType2? Identifier FuncDeclaratorSuffix
  static boolean FuncDeclarator(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FuncDeclarator")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = FuncDeclarator_0(b, l + 1);
    r = r && Identifier(b, l + 1);
    r = r && FuncDeclaratorSuffix(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // BasicType2?
  private static boolean FuncDeclarator_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FuncDeclarator_0")) return false;
    BasicType2(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // TemplateParameters? Parameters MemberFunctionAttributes? Constraint?
  //      | Parameters MemberFunctionAttributes?
  public static boolean FuncDeclaratorSuffix(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FuncDeclaratorSuffix")) return false;
    if (!nextTokenIs(b, OP_PAR_LEFT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = FuncDeclaratorSuffix_0(b, l + 1);
    if (!r) r = FuncDeclaratorSuffix_1(b, l + 1);
    exit_section_(b, m, FUNC_DECLARATOR_SUFFIX, r);
    return r;
  }

  // TemplateParameters? Parameters MemberFunctionAttributes? Constraint?
  private static boolean FuncDeclaratorSuffix_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FuncDeclaratorSuffix_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = FuncDeclaratorSuffix_0_0(b, l + 1);
    r = r && Parameters(b, l + 1);
    r = r && FuncDeclaratorSuffix_0_2(b, l + 1);
    r = r && FuncDeclaratorSuffix_0_3(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // TemplateParameters?
  private static boolean FuncDeclaratorSuffix_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FuncDeclaratorSuffix_0_0")) return false;
    TemplateParameters(b, l + 1);
    return true;
  }

  // MemberFunctionAttributes?
  private static boolean FuncDeclaratorSuffix_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FuncDeclaratorSuffix_0_2")) return false;
    MemberFunctionAttributes(b, l + 1);
    return true;
  }

  // Constraint?
  private static boolean FuncDeclaratorSuffix_0_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FuncDeclaratorSuffix_0_3")) return false;
    Constraint(b, l + 1);
    return true;
  }

  // Parameters MemberFunctionAttributes?
  private static boolean FuncDeclaratorSuffix_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FuncDeclaratorSuffix_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Parameters(b, l + 1);
    r = r && FuncDeclaratorSuffix_1_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // MemberFunctionAttributes?
  private static boolean FuncDeclaratorSuffix_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FuncDeclaratorSuffix_1_1")) return false;
    MemberFunctionAttributes(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // 'nothrow'
  //     | 'pure'
  //     | Property
  public static boolean FunctionAttribute(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunctionAttribute")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, FUNCTION_ATTRIBUTE, "<function attribute>");
    r = consumeToken(b, KW_NOTHROW);
    if (!r) r = consumeToken(b, KW_PURE);
    if (!r) r = Property(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // FunctionAttribute FunctionAttribute*
  public static boolean FunctionAttributes(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunctionAttributes")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, FUNCTION_ATTRIBUTES, "<function attributes>");
    r = FunctionAttribute(b, l + 1);
    r = r && FunctionAttributes_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // FunctionAttribute*
  private static boolean FunctionAttributes_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunctionAttributes_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!FunctionAttribute(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "FunctionAttributes_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  /* ********************************************************** */
  // BlockStatement
  //    | FunctionContracts? BodyStatement
  public static boolean FunctionBody(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunctionBody")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, FUNCTION_BODY, "<function body>");
    r = BlockStatement(b, l + 1);
    if (!r) r = FunctionBody_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // FunctionContracts? BodyStatement
  private static boolean FunctionBody_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunctionBody_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = FunctionBody_1_0(b, l + 1);
    r = r && BodyStatement(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // FunctionContracts?
  private static boolean FunctionBody_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunctionBody_1_0")) return false;
    FunctionContracts(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // InStatement OutStatement?
  //     | OutStatement InStatement?
  public static boolean FunctionContracts(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunctionContracts")) return false;
    if (!nextTokenIs(b, "<function contracts>", KW_IN, KW_OUT)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, FUNCTION_CONTRACTS, "<function contracts>");
    r = FunctionContracts_0(b, l + 1);
    if (!r) r = FunctionContracts_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // InStatement OutStatement?
  private static boolean FunctionContracts_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunctionContracts_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = InStatement(b, l + 1);
    r = r && FunctionContracts_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // OutStatement?
  private static boolean FunctionContracts_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunctionContracts_0_1")) return false;
    OutStatement(b, l + 1);
    return true;
  }

  // OutStatement InStatement?
  private static boolean FunctionContracts_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunctionContracts_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = OutStatement(b, l + 1);
    r = r && FunctionContracts_1_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // InStatement?
  private static boolean FunctionContracts_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunctionContracts_1_1")) return false;
    InStatement(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // 'function' Type? ParameterAttributes? FunctionLiteralBody?
  //     | 'delegate' Type? ParameterMemberAttributes? FunctionLiteralBody?
  //     | ParameterMemberAttributes FunctionLiteralBody?
  //     | FunctionLiteralBody
  //     | Lambda
  public static boolean FunctionLiteral(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunctionLiteral")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, FUNCTION_LITERAL, "<function literal>");
    r = FunctionLiteral_0(b, l + 1);
    if (!r) r = FunctionLiteral_1(b, l + 1);
    if (!r) r = FunctionLiteral_2(b, l + 1);
    if (!r) r = FunctionLiteralBody(b, l + 1);
    if (!r) r = Lambda(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // 'function' Type? ParameterAttributes? FunctionLiteralBody?
  private static boolean FunctionLiteral_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunctionLiteral_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, KW_FUNCTION);
    r = r && FunctionLiteral_0_1(b, l + 1);
    r = r && FunctionLiteral_0_2(b, l + 1);
    r = r && FunctionLiteral_0_3(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // Type?
  private static boolean FunctionLiteral_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunctionLiteral_0_1")) return false;
    Type(b, l + 1);
    return true;
  }

  // ParameterAttributes?
  private static boolean FunctionLiteral_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunctionLiteral_0_2")) return false;
    ParameterAttributes(b, l + 1);
    return true;
  }

  // FunctionLiteralBody?
  private static boolean FunctionLiteral_0_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunctionLiteral_0_3")) return false;
    FunctionLiteralBody(b, l + 1);
    return true;
  }

  // 'delegate' Type? ParameterMemberAttributes? FunctionLiteralBody?
  private static boolean FunctionLiteral_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunctionLiteral_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, KW_DELEGATE);
    r = r && FunctionLiteral_1_1(b, l + 1);
    r = r && FunctionLiteral_1_2(b, l + 1);
    r = r && FunctionLiteral_1_3(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // Type?
  private static boolean FunctionLiteral_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunctionLiteral_1_1")) return false;
    Type(b, l + 1);
    return true;
  }

  // ParameterMemberAttributes?
  private static boolean FunctionLiteral_1_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunctionLiteral_1_2")) return false;
    ParameterMemberAttributes(b, l + 1);
    return true;
  }

  // FunctionLiteralBody?
  private static boolean FunctionLiteral_1_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunctionLiteral_1_3")) return false;
    FunctionLiteralBody(b, l + 1);
    return true;
  }

  // ParameterMemberAttributes FunctionLiteralBody?
  private static boolean FunctionLiteral_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunctionLiteral_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ParameterMemberAttributes(b, l + 1);
    r = r && FunctionLiteral_2_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // FunctionLiteralBody?
  private static boolean FunctionLiteral_2_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunctionLiteral_2_1")) return false;
    FunctionLiteralBody(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // Property* BlockStatement |
  //     FunctionContracts BodyStatement?
  public static boolean FunctionLiteralBody(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunctionLiteralBody")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, FUNCTION_LITERAL_BODY, "<function literal body>");
    r = FunctionLiteralBody_0(b, l + 1);
    if (!r) r = FunctionLiteralBody_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // Property* BlockStatement
  private static boolean FunctionLiteralBody_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunctionLiteralBody_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = FunctionLiteralBody_0_0(b, l + 1);
    r = r && BlockStatement(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // Property*
  private static boolean FunctionLiteralBody_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunctionLiteralBody_0_0")) return false;
    int c = current_position_(b);
    while (true) {
      if (!Property(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "FunctionLiteralBody_0_0", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // FunctionContracts BodyStatement?
  private static boolean FunctionLiteralBody_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunctionLiteralBody_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = FunctionContracts(b, l + 1);
    r = r && FunctionLiteralBody_1_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // BodyStatement?
  private static boolean FunctionLiteralBody_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunctionLiteralBody_1_1")) return false;
    BodyStatement(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // 'goto' Identifier ';'
  //     | 'goto' 'default' ';'
  //     | 'goto' 'case' ';'
  //     | 'goto' 'case' Expression ';'
  public static boolean GotoStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "GotoStatement")) return false;
    if (!nextTokenIs(b, KW_GOTO)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = GotoStatement_0(b, l + 1);
    if (!r) r = parseTokens(b, 0, KW_GOTO, KW_DEFAULT, OP_SCOLON);
    if (!r) r = parseTokens(b, 0, KW_GOTO, KW_CASE, OP_SCOLON);
    if (!r) r = GotoStatement_3(b, l + 1);
    exit_section_(b, m, GOTO_STATEMENT, r);
    return r;
  }

  // 'goto' Identifier ';'
  private static boolean GotoStatement_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "GotoStatement_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, KW_GOTO);
    r = r && Identifier(b, l + 1);
    r = r && consumeToken(b, OP_SCOLON);
    exit_section_(b, m, null, r);
    return r;
  }

  // 'goto' 'case' Expression ';'
  private static boolean GotoStatement_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "GotoStatement_3")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, KW_GOTO, KW_CASE);
    r = r && Expression(b, l + 1);
    r = r && consumeToken(b, OP_SCOLON);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // ID
  public static boolean Identifier(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Identifier")) return false;
    if (!nextTokenIs(b, ID)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ID);
    exit_section_(b, m, IDENTIFIER, r);
    return r;
  }

  /* ********************************************************** */
  // Identifier TemplateInstance? ['.' IdentifierList]
  //     |  Identifier '[' AssignExpression ']' '.' IdentifierList
  public static boolean IdentifierList(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "IdentifierList")) return false;
    if (!nextTokenIs(b, ID)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = IdentifierList_0(b, l + 1);
    if (!r) r = IdentifierList_1(b, l + 1);
    exit_section_(b, m, IDENTIFIER_LIST, r);
    return r;
  }

  // Identifier TemplateInstance? ['.' IdentifierList]
  private static boolean IdentifierList_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "IdentifierList_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Identifier(b, l + 1);
    r = r && IdentifierList_0_1(b, l + 1);
    r = r && IdentifierList_0_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // TemplateInstance?
  private static boolean IdentifierList_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "IdentifierList_0_1")) return false;
    TemplateInstance(b, l + 1);
    return true;
  }

  // ['.' IdentifierList]
  private static boolean IdentifierList_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "IdentifierList_0_2")) return false;
    IdentifierList_0_2_0(b, l + 1);
    return true;
  }

  // '.' IdentifierList
  private static boolean IdentifierList_0_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "IdentifierList_0_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OP_DOT);
    r = r && IdentifierList(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // Identifier '[' AssignExpression ']' '.' IdentifierList
  private static boolean IdentifierList_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "IdentifierList_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Identifier(b, l + 1);
    r = r && consumeToken(b, OP_BRACKET_LEFT);
    r = r && AssignExpression(b, l + 1);
    r = r && consumeTokens(b, 0, OP_BRACKET_RIGHT, OP_DOT);
    r = r && IdentifierList(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // ('is'|'!is') (ShiftExpression | AssignExpression)
  public static boolean IdentityExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "IdentityExpression")) return false;
    if (!nextTokenIs(b, "<identity expression>", KW_NOT_IS, KW_IS)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, IDENTITY_EXPRESSION, "<identity expression>");
    r = IdentityExpression_0(b, l + 1);
    p = r; // pin = 1
    r = r && IdentityExpression_1(b, l + 1);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // 'is'|'!is'
  private static boolean IdentityExpression_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "IdentityExpression_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, KW_IS);
    if (!r) r = consumeToken(b, KW_NOT_IS);
    exit_section_(b, m, null, r);
    return r;
  }

  // ShiftExpression | AssignExpression
  private static boolean IdentityExpression_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "IdentityExpression_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ShiftExpression(b, l + 1);
    if (!r) r = AssignExpression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // Expression
  //     | 'auto' Identifier '=' Expression
  //     | TypeCtors Identifier '=' Expression
  //     | TypeCtors? BasicType Declarator '=' Expression
  public static boolean IfCondition(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "IfCondition")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, IF_CONDITION, "<if condition>");
    r = Expression(b, l + 1);
    if (!r) r = IfCondition_1(b, l + 1);
    if (!r) r = IfCondition_2(b, l + 1);
    if (!r) r = IfCondition_3(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // 'auto' Identifier '=' Expression
  private static boolean IfCondition_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "IfCondition_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, KW_AUTO);
    r = r && Identifier(b, l + 1);
    r = r && consumeToken(b, OP_EQ);
    r = r && Expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // TypeCtors Identifier '=' Expression
  private static boolean IfCondition_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "IfCondition_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = TypeCtors(b, l + 1);
    r = r && Identifier(b, l + 1);
    r = r && consumeToken(b, OP_EQ);
    r = r && Expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // TypeCtors? BasicType Declarator '=' Expression
  private static boolean IfCondition_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "IfCondition_3")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = IfCondition_3_0(b, l + 1);
    r = r && BasicType(b, l + 1);
    r = r && Declarator(b, l + 1);
    r = r && consumeToken(b, OP_EQ);
    r = r && Expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // TypeCtors?
  private static boolean IfCondition_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "IfCondition_3_0")) return false;
    TypeCtors(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // 'if' '(' IfCondition ')' ThenStatement ('else' ElseStatement)?
  public static boolean IfStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "IfStatement")) return false;
    if (!nextTokenIs(b, KW_IF)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, IF_STATEMENT, null);
    r = consumeTokens(b, 1, KW_IF, OP_PAR_LEFT);
    p = r; // pin = 1
    r = r && report_error_(b, IfCondition(b, l + 1));
    r = p && report_error_(b, consumeToken(b, OP_PAR_RIGHT)) && r;
    r = p && report_error_(b, ThenStatement(b, l + 1)) && r;
    r = p && IfStatement_5(b, l + 1) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // ('else' ElseStatement)?
  private static boolean IfStatement_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "IfStatement_5")) return false;
    IfStatement_5_0(b, l + 1);
    return true;
  }

  // 'else' ElseStatement
  private static boolean IfStatement_5_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "IfStatement_5_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, KW_ELSE);
    r = r && ElseStatement(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // (Identifier '=')? ModuleFullyQualifiedName
  public static boolean Import(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Import")) return false;
    if (!nextTokenIs(b, ID)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Import_0(b, l + 1);
    r = r && ModuleFullyQualifiedName(b, l + 1);
    exit_section_(b, m, IMPORT, r);
    return r;
  }

  // (Identifier '=')?
  private static boolean Import_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Import_0")) return false;
    Import_0_0(b, l + 1);
    return true;
  }

  // Identifier '='
  private static boolean Import_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Import_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Identifier(b, l + 1);
    r = r && consumeToken(b, OP_EQ);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // Identifier ('=' Identifier)?
  public static boolean ImportBind(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ImportBind")) return false;
    if (!nextTokenIs(b, ID)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Identifier(b, l + 1);
    r = r && ImportBind_1(b, l + 1);
    exit_section_(b, m, IMPORT_BIND, r);
    return r;
  }

  // ('=' Identifier)?
  private static boolean ImportBind_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ImportBind_1")) return false;
    ImportBind_1_0(b, l + 1);
    return true;
  }

  // '=' Identifier
  private static boolean ImportBind_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ImportBind_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OP_EQ);
    r = r && Identifier(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // ImportBind (',' ImportBindList)?
  public static boolean ImportBindList(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ImportBindList")) return false;
    if (!nextTokenIs(b, ID)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ImportBind(b, l + 1);
    r = r && ImportBindList_1(b, l + 1);
    exit_section_(b, m, IMPORT_BIND_LIST, r);
    return r;
  }

  // (',' ImportBindList)?
  private static boolean ImportBindList_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ImportBindList_1")) return false;
    ImportBindList_1_0(b, l + 1);
    return true;
  }

  // ',' ImportBindList
  private static boolean ImportBindList_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ImportBindList_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OP_COMMA);
    r = r && ImportBindList(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // RegularImport |
  //     StaticImport
  public static boolean ImportDeclaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ImportDeclaration")) return false;
    if (!nextTokenIs(b, "<import declaration>", KW_IMPORT, KW_STATIC)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, IMPORT_DECLARATION, "<import declaration>");
    r = RegularImport(b, l + 1);
    if (!r) r = StaticImport(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // 'import' '(' AssignExpression ')'
  public static boolean ImportExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ImportExpression")) return false;
    if (!nextTokenIs(b, KW_IMPORT)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, IMPORT_EXPRESSION, null);
    r = consumeTokens(b, 1, KW_IMPORT, OP_PAR_LEFT);
    p = r; // pin = 1
    r = r && report_error_(b, AssignExpression(b, l + 1));
    r = p && consumeToken(b, OP_PAR_RIGHT) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // Import (':' ImportBindList | ',' ImportList)?
  public static boolean ImportList(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ImportList")) return false;
    if (!nextTokenIs(b, ID)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Import(b, l + 1);
    r = r && ImportList_1(b, l + 1);
    exit_section_(b, m, IMPORT_LIST, r);
    return r;
  }

  // (':' ImportBindList | ',' ImportList)?
  private static boolean ImportList_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ImportList_1")) return false;
    ImportList_1_0(b, l + 1);
    return true;
  }

  // ':' ImportBindList | ',' ImportList
  private static boolean ImportList_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ImportList_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ImportList_1_0_0(b, l + 1);
    if (!r) r = ImportList_1_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ':' ImportBindList
  private static boolean ImportList_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ImportList_1_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OP_COLON);
    r = r && ImportBindList(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ',' ImportList
  private static boolean ImportList_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ImportList_1_0_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OP_COMMA);
    r = r && ImportList(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // ('in'| ('!''in')) ShiftExpression
  public static boolean InExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "InExpression")) return false;
    if (!nextTokenIs(b, "<in expression>", OP_NOT, KW_IN)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, IN_EXPRESSION, "<in expression>");
    r = InExpression_0(b, l + 1);
    p = r; // pin = 1
    r = r && ShiftExpression(b, l + 1);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // 'in'| ('!''in')
  private static boolean InExpression_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "InExpression_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, KW_IN);
    if (!r) r = InExpression_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // '!''in'
  private static boolean InExpression_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "InExpression_0_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, OP_NOT, KW_IN);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // InOutX InOutX*
  public static boolean InOut(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "InOut")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, IN_OUT, "<in out>");
    r = InOutX(b, l + 1);
    r = r && InOut_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // InOutX*
  private static boolean InOut_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "InOut_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!InOutX(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "InOut_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  /* ********************************************************** */
  // 'auto'
  //     | TypeCtor
  //     | 'final'
  //     | 'in'
  //     | 'lazy'
  //     | 'out'
  //     | 'ref'
  //     | 'scope'
  //     | ('return' 'ref')
  //     | 'return'
  public static boolean InOutX(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "InOutX")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, IN_OUT_X, "<in out x>");
    r = consumeToken(b, KW_AUTO);
    if (!r) r = TypeCtor(b, l + 1);
    if (!r) r = consumeToken(b, KW_FINAL);
    if (!r) r = consumeToken(b, KW_IN);
    if (!r) r = consumeToken(b, KW_LAZY);
    if (!r) r = consumeToken(b, KW_OUT);
    if (!r) r = consumeToken(b, KW_REF);
    if (!r) r = consumeToken(b, KW_SCOPE);
    if (!r) r = InOutX_8(b, l + 1);
    if (!r) r = consumeToken(b, KW_RETURN);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // 'return' 'ref'
  private static boolean InOutX_8(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "InOutX_8")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, KW_RETURN, KW_REF);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // 'in' BlockStatement
  public static boolean InStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "InStatement")) return false;
    if (!nextTokenIs(b, KW_IN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, KW_IN);
    r = r && BlockStatement(b, l + 1);
    exit_section_(b, m, IN_STATEMENT, r);
    return r;
  }

  /* ********************************************************** */
  // Expression
  public static boolean Increment(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Increment")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, INCREMENT, "<increment>");
    r = Expression(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // '[' ArgumentList ']' [PostfixExpression]
  public static boolean IndexExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "IndexExpression")) return false;
    if (!nextTokenIs(b, OP_BRACKET_LEFT)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, INDEX_EXPRESSION, null);
    r = consumeToken(b, OP_BRACKET_LEFT);
    r = r && ArgumentList(b, l + 1);
    r = r && consumeToken(b, OP_BRACKET_RIGHT);
    p = r; // pin = 3
    r = r && IndexExpression_3(b, l + 1);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // [PostfixExpression]
  private static boolean IndexExpression_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "IndexExpression_3")) return false;
    PostfixExpression(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // Statement
  //    | ';'
  public static boolean Initialize(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Initialize")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, INITIALIZE, "<initialize>");
    r = Statement(b, l + 1);
    if (!r) r = consumeToken(b, OP_SCOLON);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // VoidInitializer
  //     | NonVoidInitializer
  public static boolean Initializer(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Initializer")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, INITIALIZER, "<initializer>");
    r = VoidInitializer(b, l + 1);
    if (!r) r = NonVoidInitializer(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // INTEGER_LITERAL
  //    |  Identifier
  public static boolean IntegerExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "IntegerExpression")) return false;
    if (!nextTokenIs(b, "<integer expression>", ID, INTEGER_LITERAL)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, INTEGER_EXPRESSION, "<integer expression>");
    r = consumeToken(b, INTEGER_LITERAL);
    if (!r) r = Identifier(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // BasicType
  public static boolean Interface(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Interface")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, INTERFACE, "<interface>");
    r = BasicType(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // 'interface' Identifier ';'
  //     | InterfaceTemplateDeclaration
  //     | 'interface' Identifier BaseInterfaceList? AggregateBody?
  public static boolean InterfaceDeclaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "InterfaceDeclaration")) return false;
    if (!nextTokenIs(b, KW_INTERFACE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = InterfaceDeclaration_0(b, l + 1);
    if (!r) r = InterfaceTemplateDeclaration(b, l + 1);
    if (!r) r = InterfaceDeclaration_2(b, l + 1);
    exit_section_(b, m, INTERFACE_DECLARATION, r);
    return r;
  }

  // 'interface' Identifier ';'
  private static boolean InterfaceDeclaration_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "InterfaceDeclaration_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, KW_INTERFACE);
    r = r && Identifier(b, l + 1);
    r = r && consumeToken(b, OP_SCOLON);
    exit_section_(b, m, null, r);
    return r;
  }

  // 'interface' Identifier BaseInterfaceList? AggregateBody?
  private static boolean InterfaceDeclaration_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "InterfaceDeclaration_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, KW_INTERFACE);
    r = r && Identifier(b, l + 1);
    r = r && InterfaceDeclaration_2_2(b, l + 1);
    r = r && InterfaceDeclaration_2_3(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // BaseInterfaceList?
  private static boolean InterfaceDeclaration_2_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "InterfaceDeclaration_2_2")) return false;
    BaseInterfaceList(b, l + 1);
    return true;
  }

  // AggregateBody?
  private static boolean InterfaceDeclaration_2_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "InterfaceDeclaration_2_3")) return false;
    AggregateBody(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // 'interface' Identifier TemplateParameters Constraint? BaseInterfaceList? AggregateBody{
  //       //pin(".*") = 1
  //       }
  public static boolean InterfaceTemplateDeclaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "InterfaceTemplateDeclaration")) return false;
    if (!nextTokenIs(b, KW_INTERFACE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, KW_INTERFACE);
    r = r && Identifier(b, l + 1);
    r = r && TemplateParameters(b, l + 1);
    r = r && InterfaceTemplateDeclaration_3(b, l + 1);
    r = r && InterfaceTemplateDeclaration_4(b, l + 1);
    r = r && AggregateBody(b, l + 1);
    r = r && InterfaceTemplateDeclaration_6(b, l + 1);
    exit_section_(b, m, INTERFACE_TEMPLATE_DECLARATION, r);
    return r;
  }

  // Constraint?
  private static boolean InterfaceTemplateDeclaration_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "InterfaceTemplateDeclaration_3")) return false;
    Constraint(b, l + 1);
    return true;
  }

  // BaseInterfaceList?
  private static boolean InterfaceTemplateDeclaration_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "InterfaceTemplateDeclaration_4")) return false;
    BaseInterfaceList(b, l + 1);
    return true;
  }

  // {
  //       //pin(".*") = 1
  //       }
  private static boolean InterfaceTemplateDeclaration_6(PsiBuilder b, int l) {
    return true;
  }

  /* ********************************************************** */
  // Interface (',' Interfaces)?
  public static boolean Interfaces(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Interfaces")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, INTERFACES, "<interfaces>");
    r = Interface(b, l + 1);
    r = r && Interfaces_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (',' Interfaces)?
  private static boolean Interfaces_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Interfaces_1")) return false;
    Interfaces_1_0(b, l + 1);
    return true;
  }

  // ',' Interfaces
  private static boolean Interfaces_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Interfaces_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OP_COMMA);
    r = r && Interfaces(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // InvariantWithParen
  //     | InvariantWithoutParen
  public static boolean Invariant(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Invariant")) return false;
    if (!nextTokenIs(b, KW_INVARIANT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = InvariantWithParen(b, l + 1);
    if (!r) r = InvariantWithoutParen(b, l + 1);
    exit_section_(b, m, INVARIANT, r);
    return r;
  }

  /* ********************************************************** */
  // 'invariant' '(' ')' BlockStatement
  static boolean InvariantWithParen(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "InvariantWithParen")) return false;
    if (!nextTokenIs(b, KW_INVARIANT)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_);
    r = consumeTokens(b, 2, KW_INVARIANT, OP_PAR_LEFT, OP_PAR_RIGHT);
    p = r; // pin = 2
    r = r && BlockStatement(b, l + 1);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // 'invariant' BlockStatement
  static boolean InvariantWithoutParen(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "InvariantWithoutParen")) return false;
    if (!nextTokenIs(b, KW_INVARIANT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, KW_INVARIANT);
    r = r && BlockStatement(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // ('is' | '!is') IsExpressionSuffix
  public static boolean IsExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "IsExpression")) return false;
    if (!nextTokenIs(b, "<is expression>", KW_NOT_IS, KW_IS)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, IS_EXPRESSION, "<is expression>");
    r = IsExpression_0(b, l + 1);
    r = r && IsExpressionSuffix(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // 'is' | '!is'
  private static boolean IsExpression_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "IsExpression_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, KW_IS);
    if (!r) r = consumeToken(b, KW_NOT_IS);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // '(' Type ')'
  //     | '(' Type ':' TypeSpecialization ')'
  //     | '(' Type '==' TypeSpecialization ')'
  //     | '(' Type ':' TypeSpecialization ',' TemplateParameterList ')'
  //     | '(' Type '==' TypeSpecialization ',' TemplateParameterList ')'
  //     | '(' Type Identifier ')'
  //     | '(' Type Identifier ':' TypeSpecialization ')'
  //     | '(' Type Identifier '==' TypeSpecialization ')'
  //     | '(' Type Identifier ':' TypeSpecialization ',' TemplateParameterList ')'
  //     | '(' Type Identifier '==' TypeSpecialization ',' TemplateParameterList ')'
  static boolean IsExpressionSuffix(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "IsExpressionSuffix")) return false;
    if (!nextTokenIs(b, OP_PAR_LEFT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = IsExpressionSuffix_0(b, l + 1);
    if (!r) r = IsExpressionSuffix_1(b, l + 1);
    if (!r) r = IsExpressionSuffix_2(b, l + 1);
    if (!r) r = IsExpressionSuffix_3(b, l + 1);
    if (!r) r = IsExpressionSuffix_4(b, l + 1);
    if (!r) r = IsExpressionSuffix_5(b, l + 1);
    if (!r) r = IsExpressionSuffix_6(b, l + 1);
    if (!r) r = IsExpressionSuffix_7(b, l + 1);
    if (!r) r = IsExpressionSuffix_8(b, l + 1);
    if (!r) r = IsExpressionSuffix_9(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // '(' Type ')'
  private static boolean IsExpressionSuffix_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "IsExpressionSuffix_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OP_PAR_LEFT);
    r = r && Type(b, l + 1);
    r = r && consumeToken(b, OP_PAR_RIGHT);
    exit_section_(b, m, null, r);
    return r;
  }

  // '(' Type ':' TypeSpecialization ')'
  private static boolean IsExpressionSuffix_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "IsExpressionSuffix_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OP_PAR_LEFT);
    r = r && Type(b, l + 1);
    r = r && consumeToken(b, OP_COLON);
    r = r && TypeSpecialization(b, l + 1);
    r = r && consumeToken(b, OP_PAR_RIGHT);
    exit_section_(b, m, null, r);
    return r;
  }

  // '(' Type '==' TypeSpecialization ')'
  private static boolean IsExpressionSuffix_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "IsExpressionSuffix_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OP_PAR_LEFT);
    r = r && Type(b, l + 1);
    r = r && consumeToken(b, OP_EQ_EQ);
    r = r && TypeSpecialization(b, l + 1);
    r = r && consumeToken(b, OP_PAR_RIGHT);
    exit_section_(b, m, null, r);
    return r;
  }

  // '(' Type ':' TypeSpecialization ',' TemplateParameterList ')'
  private static boolean IsExpressionSuffix_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "IsExpressionSuffix_3")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OP_PAR_LEFT);
    r = r && Type(b, l + 1);
    r = r && consumeToken(b, OP_COLON);
    r = r && TypeSpecialization(b, l + 1);
    r = r && consumeToken(b, OP_COMMA);
    r = r && TemplateParameterList(b, l + 1);
    r = r && consumeToken(b, OP_PAR_RIGHT);
    exit_section_(b, m, null, r);
    return r;
  }

  // '(' Type '==' TypeSpecialization ',' TemplateParameterList ')'
  private static boolean IsExpressionSuffix_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "IsExpressionSuffix_4")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OP_PAR_LEFT);
    r = r && Type(b, l + 1);
    r = r && consumeToken(b, OP_EQ_EQ);
    r = r && TypeSpecialization(b, l + 1);
    r = r && consumeToken(b, OP_COMMA);
    r = r && TemplateParameterList(b, l + 1);
    r = r && consumeToken(b, OP_PAR_RIGHT);
    exit_section_(b, m, null, r);
    return r;
  }

  // '(' Type Identifier ')'
  private static boolean IsExpressionSuffix_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "IsExpressionSuffix_5")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OP_PAR_LEFT);
    r = r && Type(b, l + 1);
    r = r && Identifier(b, l + 1);
    r = r && consumeToken(b, OP_PAR_RIGHT);
    exit_section_(b, m, null, r);
    return r;
  }

  // '(' Type Identifier ':' TypeSpecialization ')'
  private static boolean IsExpressionSuffix_6(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "IsExpressionSuffix_6")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OP_PAR_LEFT);
    r = r && Type(b, l + 1);
    r = r && Identifier(b, l + 1);
    r = r && consumeToken(b, OP_COLON);
    r = r && TypeSpecialization(b, l + 1);
    r = r && consumeToken(b, OP_PAR_RIGHT);
    exit_section_(b, m, null, r);
    return r;
  }

  // '(' Type Identifier '==' TypeSpecialization ')'
  private static boolean IsExpressionSuffix_7(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "IsExpressionSuffix_7")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OP_PAR_LEFT);
    r = r && Type(b, l + 1);
    r = r && Identifier(b, l + 1);
    r = r && consumeToken(b, OP_EQ_EQ);
    r = r && TypeSpecialization(b, l + 1);
    r = r && consumeToken(b, OP_PAR_RIGHT);
    exit_section_(b, m, null, r);
    return r;
  }

  // '(' Type Identifier ':' TypeSpecialization ',' TemplateParameterList ')'
  private static boolean IsExpressionSuffix_8(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "IsExpressionSuffix_8")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OP_PAR_LEFT);
    r = r && Type(b, l + 1);
    r = r && Identifier(b, l + 1);
    r = r && consumeToken(b, OP_COLON);
    r = r && TypeSpecialization(b, l + 1);
    r = r && consumeToken(b, OP_COMMA);
    r = r && TemplateParameterList(b, l + 1);
    r = r && consumeToken(b, OP_PAR_RIGHT);
    exit_section_(b, m, null, r);
    return r;
  }

  // '(' Type Identifier '==' TypeSpecialization ',' TemplateParameterList ')'
  private static boolean IsExpressionSuffix_9(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "IsExpressionSuffix_9")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OP_PAR_LEFT);
    r = r && Type(b, l + 1);
    r = r && Identifier(b, l + 1);
    r = r && consumeToken(b, OP_EQ_EQ);
    r = r && TypeSpecialization(b, l + 1);
    r = r && consumeToken(b, OP_COMMA);
    r = r && TemplateParameterList(b, l + 1);
    r = r && consumeToken(b, OP_PAR_RIGHT);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // AssignExpression ':' AssignExpression
  public static boolean KeyValuePair(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "KeyValuePair")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, KEY_VALUE_PAIR, "<key value pair>");
    r = AssignExpression(b, l + 1);
    r = r && consumeToken(b, OP_COLON);
    r = r && AssignExpression(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // KeyValuePair ((',') KeyValuePair)*
  public static boolean KeyValuePairs(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "KeyValuePairs")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, KEY_VALUE_PAIRS, "<key value pairs>");
    r = KeyValuePair(b, l + 1);
    r = r && KeyValuePairs_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ((',') KeyValuePair)*
  private static boolean KeyValuePairs_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "KeyValuePairs_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!KeyValuePairs_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "KeyValuePairs_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // (',') KeyValuePair
  private static boolean KeyValuePairs_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "KeyValuePairs_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OP_COMMA);
    r = r && KeyValuePair(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // Identifier ':' Statement?
  public static boolean LabeledStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "LabeledStatement")) return false;
    if (!nextTokenIs(b, ID)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, LABELED_STATEMENT, null);
    r = Identifier(b, l + 1);
    r = r && consumeToken(b, OP_COLON);
    p = r; // pin = 2
    r = r && LabeledStatement_2(b, l + 1);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // Statement?
  private static boolean LabeledStatement_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "LabeledStatement_2")) return false;
    Statement(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // 'function' Type? ParameterAttributes '=>' AssignExpression
  //     | 'delegate' Type? ParameterMemberAttributes '=>' AssignExpression
  //     | ParameterMemberAttributes '=>' AssignExpression
  //     | Identifier? '=>' AssignExpression
  public static boolean Lambda(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Lambda")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, LAMBDA, "<lambda>");
    r = Lambda_0(b, l + 1);
    if (!r) r = Lambda_1(b, l + 1);
    if (!r) r = Lambda_2(b, l + 1);
    if (!r) r = Lambda_3(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // 'function' Type? ParameterAttributes '=>' AssignExpression
  private static boolean Lambda_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Lambda_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, KW_FUNCTION);
    r = r && Lambda_0_1(b, l + 1);
    r = r && ParameterAttributes(b, l + 1);
    r = r && consumeToken(b, OP_LAMBDA_ARROW);
    r = r && AssignExpression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // Type?
  private static boolean Lambda_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Lambda_0_1")) return false;
    Type(b, l + 1);
    return true;
  }

  // 'delegate' Type? ParameterMemberAttributes '=>' AssignExpression
  private static boolean Lambda_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Lambda_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, KW_DELEGATE);
    r = r && Lambda_1_1(b, l + 1);
    r = r && ParameterMemberAttributes(b, l + 1);
    r = r && consumeToken(b, OP_LAMBDA_ARROW);
    r = r && AssignExpression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // Type?
  private static boolean Lambda_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Lambda_1_1")) return false;
    Type(b, l + 1);
    return true;
  }

  // ParameterMemberAttributes '=>' AssignExpression
  private static boolean Lambda_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Lambda_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ParameterMemberAttributes(b, l + 1);
    r = r && consumeToken(b, OP_LAMBDA_ARROW);
    r = r && AssignExpression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // Identifier? '=>' AssignExpression
  private static boolean Lambda_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Lambda_3")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Lambda_3_0(b, l + 1);
    r = r && consumeToken(b, OP_LAMBDA_ARROW);
    r = r && AssignExpression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // Identifier?
  private static boolean Lambda_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Lambda_3_0")) return false;
    Identifier(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // 'catch' Statement
  public static boolean LastCatch(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "LastCatch")) return false;
    if (!nextTokenIs(b, KW_CATCH)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, KW_CATCH);
    r = r && Statement(b, l + 1);
    exit_section_(b, m, LAST_CATCH, r);
    return r;
  }

  /* ********************************************************** */
  // AssignExpression
  public static boolean LastExp(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "LastExp")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, LAST_EXP, "<last exp>");
    r = AssignExpression(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // 'extern' '(' LinkageType ')'
  //     | 'extern' '(' Identifier '++' (',' IdentifierList)? ')'{
  // //    pin(".*") = 2
  //     }
  public static boolean LinkageAttribute(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "LinkageAttribute")) return false;
    if (!nextTokenIs(b, KW_EXTERN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = LinkageAttribute_0(b, l + 1);
    if (!r) r = LinkageAttribute_1(b, l + 1);
    exit_section_(b, m, LINKAGE_ATTRIBUTE, r);
    return r;
  }

  // 'extern' '(' LinkageType ')'
  private static boolean LinkageAttribute_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "LinkageAttribute_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, KW_EXTERN, OP_PAR_LEFT);
    r = r && LinkageType(b, l + 1);
    r = r && consumeToken(b, OP_PAR_RIGHT);
    exit_section_(b, m, null, r);
    return r;
  }

  // 'extern' '(' Identifier '++' (',' IdentifierList)? ')'{
  // //    pin(".*") = 2
  //     }
  private static boolean LinkageAttribute_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "LinkageAttribute_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, KW_EXTERN, OP_PAR_LEFT);
    r = r && Identifier(b, l + 1);
    r = r && consumeToken(b, OP_PLUS_PLUS);
    r = r && LinkageAttribute_1_4(b, l + 1);
    r = r && consumeToken(b, OP_PAR_RIGHT);
    r = r && LinkageAttribute_1_6(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (',' IdentifierList)?
  private static boolean LinkageAttribute_1_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "LinkageAttribute_1_4")) return false;
    LinkageAttribute_1_4_0(b, l + 1);
    return true;
  }

  // ',' IdentifierList
  private static boolean LinkageAttribute_1_4_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "LinkageAttribute_1_4_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OP_COMMA);
    r = r && IdentifierList(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // {
  // //    pin(".*") = 2
  //     }
  private static boolean LinkageAttribute_1_6(PsiBuilder b, int l) {
    return true;
  }

  /* ********************************************************** */
  // 'C'
  //     | Identifier '++'
  //     | 'D'
  //     | 'Windows'
  //     | 'Pascal'
  //     | 'System'
  //     | 'Objective-C'
  public static boolean LinkageType(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "LinkageType")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, LINKAGE_TYPE, "<linkage type>");
    r = consumeToken(b, "C");
    if (!r) r = LinkageType_1(b, l + 1);
    if (!r) r = consumeToken(b, "D");
    if (!r) r = consumeToken(b, "Windows");
    if (!r) r = consumeToken(b, "Pascal");
    if (!r) r = consumeToken(b, "System");
    if (!r) r = consumeToken(b, "Objective-C");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // Identifier '++'
  private static boolean LinkageType_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "LinkageType_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Identifier(b, l + 1);
    r = r && consumeToken(b, OP_PLUS_PLUS);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // Expression
  public static boolean LwrExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "LwrExpression")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, LWR_EXPRESSION, "<lwr expression>");
    r = Expression(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // 'const'
  //     | 'immutable'
  //     | 'inout'
  //     | 'shared'
  //     | 'return'
  //     | FunctionAttribute
  public static boolean MemberFunctionAttribute(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MemberFunctionAttribute")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, MEMBER_FUNCTION_ATTRIBUTE, "<member function attribute>");
    r = consumeToken(b, KW_CONST);
    if (!r) r = consumeToken(b, KW_IMMUTABLE);
    if (!r) r = consumeToken(b, KW_INOUT);
    if (!r) r = consumeToken(b, KW_SHARED);
    if (!r) r = consumeToken(b, KW_RETURN);
    if (!r) r = FunctionAttribute(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // MemberFunctionAttribute MemberFunctionAttribute*
  public static boolean MemberFunctionAttributes(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MemberFunctionAttributes")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, MEMBER_FUNCTION_ATTRIBUTES, "<member function attributes>");
    r = MemberFunctionAttribute(b, l + 1);
    r = r && MemberFunctionAttributes_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // MemberFunctionAttribute*
  private static boolean MemberFunctionAttributes_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MemberFunctionAttributes_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!MemberFunctionAttribute(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "MemberFunctionAttributes_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  /* ********************************************************** */
  // 'mixin' '(' ((TemplateInstance AssignExpression?)| AssignExpression) ')' ';'
  public static boolean MixinDeclaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MixinDeclaration")) return false;
    if (!nextTokenIs(b, KW_MIXIN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, KW_MIXIN, OP_PAR_LEFT);
    r = r && MixinDeclaration_2(b, l + 1);
    r = r && consumeTokens(b, 0, OP_PAR_RIGHT, OP_SCOLON);
    exit_section_(b, m, MIXIN_DECLARATION, r);
    return r;
  }

  // (TemplateInstance AssignExpression?)| AssignExpression
  private static boolean MixinDeclaration_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MixinDeclaration_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = MixinDeclaration_2_0(b, l + 1);
    if (!r) r = AssignExpression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // TemplateInstance AssignExpression?
  private static boolean MixinDeclaration_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MixinDeclaration_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = TemplateInstance(b, l + 1);
    r = r && MixinDeclaration_2_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // AssignExpression?
  private static boolean MixinDeclaration_2_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MixinDeclaration_2_0_1")) return false;
    AssignExpression(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // 'mixin' '(' ( AssignExpression) ')'
  public static boolean MixinExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MixinExpression")) return false;
    if (!nextTokenIs(b, KW_MIXIN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, KW_MIXIN, OP_PAR_LEFT);
    r = r && MixinExpression_2(b, l + 1);
    r = r && consumeToken(b, OP_PAR_RIGHT);
    exit_section_(b, m, MIXIN_EXPRESSION, r);
    return r;
  }

  // ( AssignExpression)
  private static boolean MixinExpression_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MixinExpression_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = AssignExpression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // 'mixin' '(' ( AssignExpression) ')' ';'
  public static boolean MixinStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MixinStatement")) return false;
    if (!nextTokenIs(b, KW_MIXIN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, KW_MIXIN, OP_PAR_LEFT);
    r = r && MixinStatement_2(b, l + 1);
    r = r && consumeTokens(b, 0, OP_PAR_RIGHT, OP_SCOLON);
    exit_section_(b, m, MIXIN_STATEMENT, r);
    return r;
  }

  // ( AssignExpression)
  private static boolean MixinStatement_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MixinStatement_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = AssignExpression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // Typeof? '.'? QualifiedIdentifierList
  public static boolean MixinTemplateName(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MixinTemplateName")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, MIXIN_TEMPLATE_NAME, "<mixin template name>");
    r = MixinTemplateName_0(b, l + 1);
    r = r && MixinTemplateName_1(b, l + 1);
    r = r && QualifiedIdentifierList(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // Typeof?
  private static boolean MixinTemplateName_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MixinTemplateName_0")) return false;
    Typeof(b, l + 1);
    return true;
  }

  // '.'?
  private static boolean MixinTemplateName_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MixinTemplateName_1")) return false;
    consumeToken(b, OP_DOT);
    return true;
  }

  /* ********************************************************** */
  // Attribute? 'module' ModuleFullyQualifiedName ';'
  public static boolean ModuleDeclaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ModuleDeclaration")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, MODULE_DECLARATION, "<module declaration>");
    r = ModuleDeclaration_0(b, l + 1);
    r = r && consumeToken(b, KW_MODULE);
    p = r; // pin = 2
    r = r && report_error_(b, ModuleFullyQualifiedName(b, l + 1));
    r = p && consumeToken(b, OP_SCOLON) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // Attribute?
  private static boolean ModuleDeclaration_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ModuleDeclaration_0")) return false;
    Attribute(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // Identifier ['.' ModuleFullyQualifiedName]
  public static boolean ModuleFullyQualifiedName(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ModuleFullyQualifiedName")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, MODULE_FULLY_QUALIFIED_NAME, "<module fully qualified name>");
    r = Identifier(b, l + 1);
    p = r; // pin = 1
    r = r && ModuleFullyQualifiedName_1(b, l + 1);
    exit_section_(b, l, m, r, p, module_name_recover_parser_);
    return r || p;
  }

  // ['.' ModuleFullyQualifiedName]
  private static boolean ModuleFullyQualifiedName_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ModuleFullyQualifiedName_1")) return false;
    ModuleFullyQualifiedName_1_0(b, l + 1);
    return true;
  }

  // '.' ModuleFullyQualifiedName
  private static boolean ModuleFullyQualifiedName_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ModuleFullyQualifiedName_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OP_DOT);
    r = r && ModuleFullyQualifiedName(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // UnaryExpression [ MulExpression_ ]
  static boolean MulExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MulExpression")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = UnaryExpression(b, l + 1);
    r = r && MulExpression_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [ MulExpression_ ]
  private static boolean MulExpression_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MulExpression_1")) return false;
    MulExpression_(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // ('*' | '/' | '%') MulExpression
  public static boolean MulExpression_(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MulExpression_")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _COLLAPSE_, MUL_EXPRESSION_, "<mul expression>");
    r = MulExpression__0(b, l + 1);
    r = r && MulExpression(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // '*' | '/' | '%'
  private static boolean MulExpression__0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MulExpression__0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OP_ASTERISK);
    if (!r) r = consumeToken(b, OP_DIV);
    if (!r) r = consumeToken(b, OP_MOD);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // ((( (AssignExpression '..')) AssignExpression) | AssignExpression) [',' MultipleAssign ]
  public static boolean MultipleAssign(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MultipleAssign")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, MULTIPLE_ASSIGN, "<multiple assign>");
    r = MultipleAssign_0(b, l + 1);
    r = r && MultipleAssign_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (( (AssignExpression '..')) AssignExpression) | AssignExpression
  private static boolean MultipleAssign_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MultipleAssign_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = MultipleAssign_0_0(b, l + 1);
    if (!r) r = AssignExpression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( (AssignExpression '..')) AssignExpression
  private static boolean MultipleAssign_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MultipleAssign_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = MultipleAssign_0_0_0(b, l + 1);
    r = r && AssignExpression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // AssignExpression '..'
  private static boolean MultipleAssign_0_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MultipleAssign_0_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = AssignExpression(b, l + 1);
    r = r && consumeToken(b, OP_DDOT);
    exit_section_(b, m, null, r);
    return r;
  }

  // [',' MultipleAssign ]
  private static boolean MultipleAssign_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MultipleAssign_1")) return false;
    MultipleAssign_1_0(b, l + 1);
    return true;
  }

  // ',' MultipleAssign
  private static boolean MultipleAssign_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MultipleAssign_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OP_COMMA);
    r = r && MultipleAssign(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // 'new' AllocatorArguments? 'class' ClassArguments? SuperClass? Interfaces? AggregateBody
  public static boolean NewAnonClassExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "NewAnonClassExpression")) return false;
    if (!nextTokenIs(b, KW_NEW)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, NEW_ANON_CLASS_EXPRESSION, null);
    r = consumeToken(b, KW_NEW);
    p = r; // pin = 1
    r = r && report_error_(b, NewAnonClassExpression_1(b, l + 1));
    r = p && report_error_(b, consumeToken(b, KW_CLASS)) && r;
    r = p && report_error_(b, NewAnonClassExpression_3(b, l + 1)) && r;
    r = p && report_error_(b, NewAnonClassExpression_4(b, l + 1)) && r;
    r = p && report_error_(b, NewAnonClassExpression_5(b, l + 1)) && r;
    r = p && AggregateBody(b, l + 1) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // AllocatorArguments?
  private static boolean NewAnonClassExpression_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "NewAnonClassExpression_1")) return false;
    AllocatorArguments(b, l + 1);
    return true;
  }

  // ClassArguments?
  private static boolean NewAnonClassExpression_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "NewAnonClassExpression_3")) return false;
    ClassArguments(b, l + 1);
    return true;
  }

  // SuperClass?
  private static boolean NewAnonClassExpression_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "NewAnonClassExpression_4")) return false;
    SuperClass(b, l + 1);
    return true;
  }

  // Interfaces?
  private static boolean NewAnonClassExpression_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "NewAnonClassExpression_5")) return false;
    Interfaces(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // 'new' AllocatorArguments? Type
  //     | NewExpressionWithArgs
  public static boolean NewExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "NewExpression")) return false;
    if (!nextTokenIs(b, KW_NEW)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = NewExpression_0(b, l + 1);
    if (!r) r = NewExpressionWithArgs(b, l + 1);
    exit_section_(b, m, NEW_EXPRESSION, r);
    return r;
  }

  // 'new' AllocatorArguments? Type
  private static boolean NewExpression_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "NewExpression_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, KW_NEW);
    r = r && NewExpression_0_1(b, l + 1);
    r = r && Type(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // AllocatorArguments?
  private static boolean NewExpression_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "NewExpression_0_1")) return false;
    AllocatorArguments(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // 'new' AllocatorArguments? Type '[' AssignExpression ']'
  //    | 'new' AllocatorArguments? Type ('(' ArgumentList? ')')?
  //    | NewAnonClassExpression
  public static boolean NewExpressionWithArgs(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "NewExpressionWithArgs")) return false;
    if (!nextTokenIs(b, KW_NEW)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = NewExpressionWithArgs_0(b, l + 1);
    if (!r) r = NewExpressionWithArgs_1(b, l + 1);
    if (!r) r = NewAnonClassExpression(b, l + 1);
    exit_section_(b, m, NEW_EXPRESSION_WITH_ARGS, r);
    return r;
  }

  // 'new' AllocatorArguments? Type '[' AssignExpression ']'
  private static boolean NewExpressionWithArgs_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "NewExpressionWithArgs_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, KW_NEW);
    r = r && NewExpressionWithArgs_0_1(b, l + 1);
    r = r && Type(b, l + 1);
    r = r && consumeToken(b, OP_BRACKET_LEFT);
    r = r && AssignExpression(b, l + 1);
    r = r && consumeToken(b, OP_BRACKET_RIGHT);
    exit_section_(b, m, null, r);
    return r;
  }

  // AllocatorArguments?
  private static boolean NewExpressionWithArgs_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "NewExpressionWithArgs_0_1")) return false;
    AllocatorArguments(b, l + 1);
    return true;
  }

  // 'new' AllocatorArguments? Type ('(' ArgumentList? ')')?
  private static boolean NewExpressionWithArgs_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "NewExpressionWithArgs_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, KW_NEW);
    r = r && NewExpressionWithArgs_1_1(b, l + 1);
    r = r && Type(b, l + 1);
    r = r && NewExpressionWithArgs_1_3(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // AllocatorArguments?
  private static boolean NewExpressionWithArgs_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "NewExpressionWithArgs_1_1")) return false;
    AllocatorArguments(b, l + 1);
    return true;
  }

  // ('(' ArgumentList? ')')?
  private static boolean NewExpressionWithArgs_1_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "NewExpressionWithArgs_1_3")) return false;
    NewExpressionWithArgs_1_3_0(b, l + 1);
    return true;
  }

  // '(' ArgumentList? ')'
  private static boolean NewExpressionWithArgs_1_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "NewExpressionWithArgs_1_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OP_PAR_LEFT);
    r = r && NewExpressionWithArgs_1_3_0_1(b, l + 1);
    r = r && consumeToken(b, OP_PAR_RIGHT);
    exit_section_(b, m, null, r);
    return r;
  }

  // ArgumentList?
  private static boolean NewExpressionWithArgs_1_3_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "NewExpressionWithArgs_1_3_0_1")) return false;
    ArgumentList(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // NonEmptyStatementNoCaseNoDefault
  //     | CaseRangeStatement//must be above case statement because pin on case statement will detect a case statement, where there is a case range statement
  //     | CaseStatement
  //     | DefaultStatement
  public static boolean NonEmptyStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "NonEmptyStatement")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, NON_EMPTY_STATEMENT, "<non empty statement>");
    r = NonEmptyStatementNoCaseNoDefault(b, l + 1);
    if (!r) r = CaseRangeStatement(b, l + 1);
    if (!r) r = CaseStatement(b, l + 1);
    if (!r) r = DefaultStatement(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // LabeledStatement
  //     | DeclarationStatement
  //     | Declaration
  //     | BlockStatement // must be above expression statement
  //     | IfStatement
  //     | WhileStatement
  //     | DoStatement
  //     | ForStatement
  //     | ForeachStatement
  //     | SwitchStatement
  //     | FinalSwitchStatement
  //     | ContinueStatement
  //     | BreakStatement
  //     | ReturnStatement
  //     | GotoStatement
  //     | WithStatement
  //     | SynchronizedStatement
  //     | TryStatement
  //     | ScopeGuardStatement
  //     | ThrowStatement
  //     | AsmStatement
  //     | PragmaStatement
  //     | MixinStatement
  //     | ForeachRangeStatement
  //     | ConditionalStatement
  //     | StaticAssert
  //     | TemplateMixin
  //     | ImportDeclaration
  //     | ExpressionStatement
  public static boolean NonEmptyStatementNoCaseNoDefault(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "NonEmptyStatementNoCaseNoDefault")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, NON_EMPTY_STATEMENT_NO_CASE_NO_DEFAULT, "<non empty statement no case no default>");
    r = LabeledStatement(b, l + 1);
    if (!r) r = DeclarationStatement(b, l + 1);
    if (!r) r = Declaration(b, l + 1);
    if (!r) r = BlockStatement(b, l + 1);
    if (!r) r = IfStatement(b, l + 1);
    if (!r) r = WhileStatement(b, l + 1);
    if (!r) r = DoStatement(b, l + 1);
    if (!r) r = ForStatement(b, l + 1);
    if (!r) r = ForeachStatement(b, l + 1);
    if (!r) r = SwitchStatement(b, l + 1);
    if (!r) r = FinalSwitchStatement(b, l + 1);
    if (!r) r = ContinueStatement(b, l + 1);
    if (!r) r = BreakStatement(b, l + 1);
    if (!r) r = ReturnStatement(b, l + 1);
    if (!r) r = GotoStatement(b, l + 1);
    if (!r) r = WithStatement(b, l + 1);
    if (!r) r = SynchronizedStatement(b, l + 1);
    if (!r) r = TryStatement(b, l + 1);
    if (!r) r = ScopeGuardStatement(b, l + 1);
    if (!r) r = ThrowStatement(b, l + 1);
    if (!r) r = AsmStatement(b, l + 1);
    if (!r) r = PragmaStatement(b, l + 1);
    if (!r) r = MixinStatement(b, l + 1);
    if (!r) r = ForeachRangeStatement(b, l + 1);
    if (!r) r = ConditionalStatement(b, l + 1);
    if (!r) r = StaticAssert(b, l + 1);
    if (!r) r = TemplateMixin(b, l + 1);
    if (!r) r = ImportDeclaration(b, l + 1);
    if (!r) r = ExpressionStatement(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // AssignExpression
  //     | ArrayInitializer
  //     | StructInitializer
  public static boolean NonVoidInitializer(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "NonVoidInitializer")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, NON_VOID_INITIALIZER, "<non void initializer>");
    r = AssignExpression(b, l + 1);
    if (!r) r = ArrayInitializer(b, l + 1);
    if (!r) r = StructInitializer(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // 'aaa'
  // | 'aad'
  // | 'aam'
  // | 'aas'
  // | 'adc'
  // | 'add'
  // | 'addpd'
  // | 'addps'
  // | 'addsd'
  // | 'addss'
  // | 'and'
  // | 'andnpd'
  // | 'andnps'
  // | 'andpd'
  // | 'andps'
  // | 'arpl'
  // | 'bound'
  // | 'bsf'
  // | 'bsr'
  // | 'bswap'
  // | 'bt'
  // | 'btc'
  // | 'btr'
  // | 'bts'
  // | 'call'
  // | 'cbw'
  // | 'cdq'
  // | 'clc'
  // | 'cld'
  // | 'clflush'
  // | 'cli'
  // | 'clts'
  // | 'cmc'
  // | 'cmova'
  // | 'cmovae'
  // | 'cmovb'
  // | 'cmovbe'
  // | 'cmovc'
  // | 'cmove'
  // | 'cmovg'
  // | 'cmovge'
  // | 'cmovl'
  // | 'cmovle'
  // | 'cmovna'
  // | 'cmovnae'
  // | 'cmovnb'
  // | 'cmovnbe'
  // | 'cmovnc'
  // | 'cmovne'
  // | 'cmovng'
  // | 'cmovnge'
  // | 'cmovnl'
  // | 'cmovnle'
  // | 'cmovno'
  // | 'cmovnp'
  // | 'cmovns'
  // | 'cmovnz'
  // | 'cmovo'
  // | 'cmovp'
  // | 'cmovpe'
  // | 'cmovpo'
  // | 'cmovs'
  // | 'cmovz'
  // | 'cmp'
  // | 'cmppd'
  // | 'cmpps'
  // | 'cmps'
  // | 'cmpsb'
  // | 'cmpsd'
  // | 'cmpss'
  // | 'cmpsw'
  // | 'cmpxchg'
  // | 'cmpxchg8b'
  // | 'cmpxchg16b'
  // | 'comisd'
  // | 'comiss'
  // | 'cpuid'
  // | 'cvtdq2pd'
  // | 'cvtdq2ps'
  // | 'cvtpd2dq'
  // | 'cvtpd2pi'
  // | 'cvtpd2ps'
  // | 'cvtpi2pd'
  // | 'cvtpi2ps'
  // | 'cvtps2dq'
  // | 'cvtps2pd'
  // | 'cvtps2pi'
  // | 'cvtsd2si'
  // | 'cvtsd2ss'
  // | 'cvtsi2sd'
  // | 'cvtsi2ss'
  // | 'cvtss2sd'
  // | 'cvtss2si'
  // | 'cvttpd2dq'
  // | 'cvttpd2pi'
  // | 'cvttps2dq'
  // | 'cvttps2pi'
  // | 'cvttsd2si'
  // | 'cvttss2si'
  // | 'cwd'
  // | 'cwde'
  // | 'da'
  // | 'daa'
  // | 'das'
  // | 'db'
  // | 'dd'
  // | 'de'
  // | 'dec'
  // | 'df'
  // | 'di'
  // | 'div'
  // | 'divpd'
  // | 'divps'
  // | 'divsd'
  // | 'divss'
  // | 'dl'
  // | 'dq'
  // | 'ds'
  // | 'dt'
  // | 'dw'
  // | 'emms'
  // | 'enter'
  // | 'f2xm1'
  // | 'fabs'
  // | 'fadd'
  // | 'faddp'
  // | 'fbld'
  // | 'fbstp'
  // | 'fchs'
  // | 'fclex'
  // | 'fcmovb'
  // | 'fcmovbe'
  // | 'fcmove'
  // | 'fcmovnb'
  // | 'fcmovnbe'
  // | 'fcmovne'
  // | 'fcmovnu'
  // | 'fcmovu'
  // | 'fcom'
  // | 'fcomi'
  // | 'fcomip'
  // | 'fcomp'
  // | 'fcompp'
  // | 'fcos'
  // | 'fdecstp'
  // | 'fdisi'
  // | 'fdiv'
  // | 'fdivp'
  // | 'fdivr'
  // | 'fdivrp'
  // | 'feni'
  // | 'ffree'
  // | 'fiadd'
  // | 'ficom'
  // | 'ficomp'
  // | 'fidiv'
  // | 'fidivr'
  // | 'fild'
  // | 'fimul'
  // | 'fincstp'
  // | 'finit'
  // | 'fist'
  // | 'fistp'
  // | 'fisub'
  // | 'fisubr'
  // | 'fld'
  // | 'fld1'
  // | 'fldcw'
  // | 'fldenv'
  // | 'fldl2e'
  // | 'fldl2t'
  // | 'fldlg2'
  // | 'fldln2'
  // | 'fldpi'
  // | 'fldz'
  // | 'fmul'
  // | 'fmulp'
  // | 'fnclex'
  // | 'fndisi'
  // | 'fneni'
  // | 'fninit'
  // | 'fnop'
  // | 'fnsave'
  // | 'fnstcw'
  // | 'fnstenv'
  // | 'fnstsw'
  // | 'fpatan'
  // | 'fprem'
  // | 'fprem1'
  // | 'fptan'
  // | 'frndint'
  // | 'frstor'
  // | 'fsave'
  // | 'fscale'
  // | 'fsetpm'
  // | 'fsin'
  // | 'fsincos'
  // | 'fsqrt'
  // | 'fst'
  // | 'fstcw'
  // | 'fstenv'
  // | 'fstp'
  // | 'fstsw'
  // | 'fsub'
  // | 'fsubp'
  // | 'fsubr'
  // | 'fsubrp'
  // | 'ftst'
  // | 'fucom'
  // | 'fucomi'
  // | 'fucomip'
  // | 'fucomp'
  // | 'fucompp'
  // | 'fwait'
  // | 'fxam'
  // | 'fxch'
  // | 'fxrstor'
  // | 'fxsave'
  // | 'fxtract'
  // | 'fyl2x'
  // | 'fyl2xp1'
  // | 'hlt'
  // | 'idiv'
  // | 'imul'
  // | 'in'
  // | 'inc'
  // | 'ins'
  // | 'insb'
  // | 'insd'
  // | 'insw'
  // | 'int'
  // | 'into'
  // | 'invd'
  // | 'invlpg'
  // | 'iret'
  // | 'iretd'
  // | 'ja'
  // | 'jae'
  // | 'jb'
  // | 'jbe'
  // | 'jc'
  // | 'jcxz'
  // | 'je'
  // | 'jecxz'
  // | 'jg'
  // | 'jge'
  // | 'jl'
  // | 'jle'
  // | 'jmp'
  // | 'jna'
  // | 'jnae'
  // | 'jnb'
  // | 'jnbe'
  // | 'jnc'
  // | 'jne'
  // | 'jng'
  // | 'jnge'
  // | 'jnl'
  // | 'jnle'
  // | 'jno'
  // | 'jnp'
  // | 'jns'
  // | 'jnz'
  // | 'jo'
  // | 'jp'
  // | 'jpe'
  // | 'jpo'
  // | 'js'
  // | 'jz'
  // | 'lahf'
  // | 'lar'
  // | 'ldmxcsr'
  // | 'lds'
  // | 'lea'
  // | 'leave'
  // | 'les'
  // | 'lfence'
  // | 'lfs'
  // | 'lgdt'
  // | 'lgs'
  // | 'lidt'
  // | 'lldt'
  // | 'lmsw'
  // | 'lock'
  // | 'lods'
  // | 'lodsb'
  // | 'lodsd'
  // | 'lodsw'
  // | 'loop'
  // | 'loope'
  // | 'loopne'
  // | 'loopnz'
  // | 'loopz'
  // | 'lsl'
  // | 'lss'
  // | 'ltr'
  // | 'maskmovdqu'
  // | 'maskmovq'
  // | 'maxpd'
  // | 'maxps'
  // | 'maxsd'
  // | 'maxss'
  // | 'mfence'
  // | 'minpd'
  // | 'minps'
  // | 'minsd'
  // | 'minss'
  // | 'mov'
  // | 'movapd'
  // | 'movaps'
  // | 'movd'
  // | 'movdq2q'
  // | 'movdqa'
  // | 'movdqu'
  // | 'movhlps'
  // | 'movhpd'
  // | 'movhps'
  // | 'movlhps'
  // | 'movlpd'
  // | 'movlps'
  // | 'movmskpd'
  // | 'movmskps'
  // | 'movntdq'
  // | 'movnti'
  // | 'movntpd'
  // | 'movntps'
  // | 'movntq'
  // | 'movq'
  // | 'movq2dq'
  // | 'movs'
  // | 'movsb'
  // | 'movsd'
  // | 'movss'
  // | 'movsw'
  // | 'movsx'
  // | 'movupd'
  // | 'movups'
  // | 'movzx'
  // | 'mul'
  // | 'mulpd'
  // | 'mulps'
  // | 'mulsd'
  // | 'mulss'
  // | 'neg'
  // | 'nop'
  // | 'not'
  // | 'or'
  // | 'orpd'
  // | 'orps'
  // | 'out'
  // | 'outs'
  // | 'outsb'
  // | 'outsd'
  // | 'outsw'
  // | 'packssdw'
  // | 'packsswb'
  // | 'packuswb'
  // | 'paddb'
  // | 'paddd'
  // | 'paddq'
  // | 'paddsb'
  // | 'paddsw'
  // | 'paddusb'
  // | 'paddusw'
  // | 'paddw'
  // | 'pand'
  // | 'pandn'
  // | 'pavgb'
  // | 'pavgw'
  // | 'pcmpeqb'
  // | 'pcmpeqd'
  // | 'pcmpeqw'
  // | 'pcmpgtb'
  // | 'pcmpgtd'
  // | 'pcmpgtw'
  // | 'pextrw'
  // | 'pinsrw'
  // | 'pmaddwd'
  // | 'pmaxsw'
  // | 'pmaxub'
  // | 'pminsw'
  // | 'pminub'
  // | 'pmovmskb'
  // | 'pmulhuw'
  // | 'pmulhw'
  // | 'pmullw'
  // | 'pmuludq'
  // | 'pop'
  // | 'popa'
  // | 'popad'
  // | 'popf'
  // | 'popfd'
  // | 'por'
  // | 'prefetchnta'
  // | 'prefetcht0'
  // | 'prefetcht1'
  // | 'prefetcht2'
  // | 'psadbw'
  // | 'pshufd'
  // | 'pshufhw'
  // | 'pshuflw'
  // | 'pshufw'
  // | 'pslld'
  // | 'pslldq'
  // | 'psllq'
  // | 'psllw'
  // | 'psrad'
  // | 'psraw'
  // | 'psrld'
  // | 'psrldq'
  // | 'psrlq'
  // | 'psrlw'
  // | 'psubb'
  // | 'psubd'
  // | 'psubq'
  // | 'psubsb'
  // | 'psubsw'
  // | 'psubusb'
  // | 'psubusw'
  // | 'psubw'
  // | 'punpckhbw'
  // | 'punpckhdq'
  // | 'punpckhqdq'
  // | 'punpckhwd'
  // | 'punpcklbw'
  // | 'punpckldq'
  // | 'punpcklqdq'
  // | 'punpcklwd'
  // | 'push'
  // | 'pusha'
  // | 'pushad'
  // | 'pushf'
  // | 'pushfd'
  // | 'pxor'
  // | 'rcl'
  // | 'rcpps'
  // | 'rcpss'
  // | 'rcr'
  // | 'rdmsr'
  // | 'rdpmc'
  // | 'rdtsc'
  // | 'rep'
  // | 'repe'
  // | 'repne'
  // | 'repnz'
  // | 'repz'
  // | 'ret'
  // | 'retf'
  // | 'rol'
  // | 'ror'
  // | 'rsm'
  // | 'rsqrtps'
  // | 'rsqrtss'
  // | 'sahf'
  // | 'sal'
  // | 'sar'
  // | 'sbb'
  // | 'scas'
  // | 'scasb'
  // | 'scasd'
  // | 'scasw'
  // | 'seta'
  // | 'setae'
  // | 'setb'
  // | 'setbe'
  // | 'setc'
  // | 'sete'
  // | 'setg'
  // | 'setge'
  // | 'setl'
  // | 'setle'
  // | 'setna'
  // | 'setnae'
  // | 'setnb'
  // | 'setnbe'
  // | 'setnc'
  // | 'setne'
  // | 'setng'
  // | 'setnge'
  // | 'setnl'
  // | 'setnle'
  // | 'setno'
  // | 'setnp'
  // | 'setns'
  // | 'setnz'
  // | 'seto'
  // | 'setp'
  // | 'setpe'
  // | 'setpo'
  // | 'sets'
  // | 'setz'
  // | 'sfence'
  // | 'sgdt'
  // | 'shl'
  // | 'shld'
  // | 'shr'
  // | 'shrd'
  // | 'shufpd'
  // | 'shufps'
  // | 'sidt'
  // | 'sldt'
  // | 'smsw'
  // | 'sqrtpd'
  // | 'sqrtps'
  // | 'sqrtsd'
  // | 'sqrtss'
  // | 'stc'
  // | 'std'
  // | 'sti'
  // | 'stmxcsr'
  // | 'stos'
  // | 'stosb'
  // | 'stosd'
  // | 'stosw'
  // | 'str'
  // | 'sub'
  // | 'subpd'
  // | 'subps'
  // | 'subsd'
  // | 'subss'
  // | 'sysenter'
  // | 'sysexit'
  // | 'test'
  // | 'ucomisd'
  // | 'ucomiss'
  // | 'ud2'
  // | 'unpckhpd'
  // | 'unpckhps'
  // | 'unpcklpd'
  // | 'unpcklps'
  // | 'verr'
  // | 'verw'
  // | 'wait'
  // | 'wbinvd'
  // | 'wrmsr'
  // | 'xadd'
  // | 'xchg'
  // | 'xlat'
  // | 'xlatb'
  // | 'xor'
  // | 'xorpd'
  // | 'xorps'
  // | 'addsubpd'
  // | 'addsubps'
  // | 'fisttp'
  // | 'haddpd'
  // | 'haddps'
  // | 'hsubpd'
  // | 'hsubps'
  // | 'lddqu'
  // | 'monitor'
  // | 'movddup'
  // | 'movshdup'
  // | 'movsldup'
  // | 'mwait'
  // | 'pavgusb'
  // | 'pf2id'
  // | 'pfacc'
  // | 'pfadd'
  // | 'pfcmpeq'
  // | 'pfcmpge'
  // | 'pfcmpgt'
  // | 'pfmax'
  // | 'pfmin'
  // | 'pfmul'
  // | 'pfnacc'
  // | 'pfpnacc'
  // | 'pfrcp'
  // | 'pfrcpit1'
  // | 'pfrcpit2'
  // | 'pfrsqit1'
  // | 'pfrsqrt'
  // | 'pfsub'
  // | 'pfsubr'
  // | 'pi2fd'
  // | 'pmulhrw'
  // | 'pswapd'
  public static boolean Opcode(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Opcode")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, OPCODE, "<opcode>");
    r = consumeToken(b, "aaa");
    if (!r) r = consumeToken(b, "aad");
    if (!r) r = consumeToken(b, "aam");
    if (!r) r = consumeToken(b, "aas");
    if (!r) r = consumeToken(b, "adc");
    if (!r) r = consumeToken(b, "add");
    if (!r) r = consumeToken(b, "addpd");
    if (!r) r = consumeToken(b, "addps");
    if (!r) r = consumeToken(b, "addsd");
    if (!r) r = consumeToken(b, "addss");
    if (!r) r = consumeToken(b, "and");
    if (!r) r = consumeToken(b, "andnpd");
    if (!r) r = consumeToken(b, "andnps");
    if (!r) r = consumeToken(b, "andpd");
    if (!r) r = consumeToken(b, "andps");
    if (!r) r = consumeToken(b, "arpl");
    if (!r) r = consumeToken(b, "bound");
    if (!r) r = consumeToken(b, "bsf");
    if (!r) r = consumeToken(b, "bsr");
    if (!r) r = consumeToken(b, "bswap");
    if (!r) r = consumeToken(b, "bt");
    if (!r) r = consumeToken(b, "btc");
    if (!r) r = consumeToken(b, "btr");
    if (!r) r = consumeToken(b, "bts");
    if (!r) r = consumeToken(b, "call");
    if (!r) r = consumeToken(b, "cbw");
    if (!r) r = consumeToken(b, "cdq");
    if (!r) r = consumeToken(b, "clc");
    if (!r) r = consumeToken(b, "cld");
    if (!r) r = consumeToken(b, "clflush");
    if (!r) r = consumeToken(b, "cli");
    if (!r) r = consumeToken(b, "clts");
    if (!r) r = consumeToken(b, "cmc");
    if (!r) r = consumeToken(b, "cmova");
    if (!r) r = consumeToken(b, "cmovae");
    if (!r) r = consumeToken(b, "cmovb");
    if (!r) r = consumeToken(b, "cmovbe");
    if (!r) r = consumeToken(b, "cmovc");
    if (!r) r = consumeToken(b, "cmove");
    if (!r) r = consumeToken(b, "cmovg");
    if (!r) r = consumeToken(b, "cmovge");
    if (!r) r = consumeToken(b, "cmovl");
    if (!r) r = consumeToken(b, "cmovle");
    if (!r) r = consumeToken(b, "cmovna");
    if (!r) r = consumeToken(b, "cmovnae");
    if (!r) r = consumeToken(b, "cmovnb");
    if (!r) r = consumeToken(b, "cmovnbe");
    if (!r) r = consumeToken(b, "cmovnc");
    if (!r) r = consumeToken(b, "cmovne");
    if (!r) r = consumeToken(b, "cmovng");
    if (!r) r = consumeToken(b, "cmovnge");
    if (!r) r = consumeToken(b, "cmovnl");
    if (!r) r = consumeToken(b, "cmovnle");
    if (!r) r = consumeToken(b, "cmovno");
    if (!r) r = consumeToken(b, "cmovnp");
    if (!r) r = consumeToken(b, "cmovns");
    if (!r) r = consumeToken(b, "cmovnz");
    if (!r) r = consumeToken(b, "cmovo");
    if (!r) r = consumeToken(b, "cmovp");
    if (!r) r = consumeToken(b, "cmovpe");
    if (!r) r = consumeToken(b, "cmovpo");
    if (!r) r = consumeToken(b, "cmovs");
    if (!r) r = consumeToken(b, "cmovz");
    if (!r) r = consumeToken(b, "cmp");
    if (!r) r = consumeToken(b, "cmppd");
    if (!r) r = consumeToken(b, "cmpps");
    if (!r) r = consumeToken(b, "cmps");
    if (!r) r = consumeToken(b, "cmpsb");
    if (!r) r = consumeToken(b, "cmpsd");
    if (!r) r = consumeToken(b, "cmpss");
    if (!r) r = consumeToken(b, "cmpsw");
    if (!r) r = consumeToken(b, "cmpxchg");
    if (!r) r = consumeToken(b, "cmpxchg8b");
    if (!r) r = consumeToken(b, "cmpxchg16b");
    if (!r) r = consumeToken(b, "comisd");
    if (!r) r = consumeToken(b, "comiss");
    if (!r) r = consumeToken(b, "cpuid");
    if (!r) r = consumeToken(b, "cvtdq2pd");
    if (!r) r = consumeToken(b, "cvtdq2ps");
    if (!r) r = consumeToken(b, "cvtpd2dq");
    if (!r) r = consumeToken(b, "cvtpd2pi");
    if (!r) r = consumeToken(b, "cvtpd2ps");
    if (!r) r = consumeToken(b, "cvtpi2pd");
    if (!r) r = consumeToken(b, "cvtpi2ps");
    if (!r) r = consumeToken(b, "cvtps2dq");
    if (!r) r = consumeToken(b, "cvtps2pd");
    if (!r) r = consumeToken(b, "cvtps2pi");
    if (!r) r = consumeToken(b, "cvtsd2si");
    if (!r) r = consumeToken(b, "cvtsd2ss");
    if (!r) r = consumeToken(b, "cvtsi2sd");
    if (!r) r = consumeToken(b, "cvtsi2ss");
    if (!r) r = consumeToken(b, "cvtss2sd");
    if (!r) r = consumeToken(b, "cvtss2si");
    if (!r) r = consumeToken(b, "cvttpd2dq");
    if (!r) r = consumeToken(b, "cvttpd2pi");
    if (!r) r = consumeToken(b, "cvttps2dq");
    if (!r) r = consumeToken(b, "cvttps2pi");
    if (!r) r = consumeToken(b, "cvttsd2si");
    if (!r) r = consumeToken(b, "cvttss2si");
    if (!r) r = consumeToken(b, "cwd");
    if (!r) r = consumeToken(b, "cwde");
    if (!r) r = consumeToken(b, "da");
    if (!r) r = consumeToken(b, "daa");
    if (!r) r = consumeToken(b, "das");
    if (!r) r = consumeToken(b, "db");
    if (!r) r = consumeToken(b, "dd");
    if (!r) r = consumeToken(b, "de");
    if (!r) r = consumeToken(b, "dec");
    if (!r) r = consumeToken(b, "df");
    if (!r) r = consumeToken(b, "di");
    if (!r) r = consumeToken(b, "div");
    if (!r) r = consumeToken(b, "divpd");
    if (!r) r = consumeToken(b, "divps");
    if (!r) r = consumeToken(b, "divsd");
    if (!r) r = consumeToken(b, "divss");
    if (!r) r = consumeToken(b, "dl");
    if (!r) r = consumeToken(b, "dq");
    if (!r) r = consumeToken(b, "ds");
    if (!r) r = consumeToken(b, "dt");
    if (!r) r = consumeToken(b, "dw");
    if (!r) r = consumeToken(b, "emms");
    if (!r) r = consumeToken(b, "enter");
    if (!r) r = consumeToken(b, "f2xm1");
    if (!r) r = consumeToken(b, "fabs");
    if (!r) r = consumeToken(b, "fadd");
    if (!r) r = consumeToken(b, "faddp");
    if (!r) r = consumeToken(b, "fbld");
    if (!r) r = consumeToken(b, "fbstp");
    if (!r) r = consumeToken(b, "fchs");
    if (!r) r = consumeToken(b, "fclex");
    if (!r) r = consumeToken(b, "fcmovb");
    if (!r) r = consumeToken(b, "fcmovbe");
    if (!r) r = consumeToken(b, "fcmove");
    if (!r) r = consumeToken(b, "fcmovnb");
    if (!r) r = consumeToken(b, "fcmovnbe");
    if (!r) r = consumeToken(b, "fcmovne");
    if (!r) r = consumeToken(b, "fcmovnu");
    if (!r) r = consumeToken(b, "fcmovu");
    if (!r) r = consumeToken(b, "fcom");
    if (!r) r = consumeToken(b, "fcomi");
    if (!r) r = consumeToken(b, "fcomip");
    if (!r) r = consumeToken(b, "fcomp");
    if (!r) r = consumeToken(b, "fcompp");
    if (!r) r = consumeToken(b, "fcos");
    if (!r) r = consumeToken(b, "fdecstp");
    if (!r) r = consumeToken(b, "fdisi");
    if (!r) r = consumeToken(b, "fdiv");
    if (!r) r = consumeToken(b, "fdivp");
    if (!r) r = consumeToken(b, "fdivr");
    if (!r) r = consumeToken(b, "fdivrp");
    if (!r) r = consumeToken(b, "feni");
    if (!r) r = consumeToken(b, "ffree");
    if (!r) r = consumeToken(b, "fiadd");
    if (!r) r = consumeToken(b, "ficom");
    if (!r) r = consumeToken(b, "ficomp");
    if (!r) r = consumeToken(b, "fidiv");
    if (!r) r = consumeToken(b, "fidivr");
    if (!r) r = consumeToken(b, "fild");
    if (!r) r = consumeToken(b, "fimul");
    if (!r) r = consumeToken(b, "fincstp");
    if (!r) r = consumeToken(b, "finit");
    if (!r) r = consumeToken(b, "fist");
    if (!r) r = consumeToken(b, "fistp");
    if (!r) r = consumeToken(b, "fisub");
    if (!r) r = consumeToken(b, "fisubr");
    if (!r) r = consumeToken(b, "fld");
    if (!r) r = consumeToken(b, "fld1");
    if (!r) r = consumeToken(b, "fldcw");
    if (!r) r = consumeToken(b, "fldenv");
    if (!r) r = consumeToken(b, "fldl2e");
    if (!r) r = consumeToken(b, "fldl2t");
    if (!r) r = consumeToken(b, "fldlg2");
    if (!r) r = consumeToken(b, "fldln2");
    if (!r) r = consumeToken(b, "fldpi");
    if (!r) r = consumeToken(b, "fldz");
    if (!r) r = consumeToken(b, "fmul");
    if (!r) r = consumeToken(b, "fmulp");
    if (!r) r = consumeToken(b, "fnclex");
    if (!r) r = consumeToken(b, "fndisi");
    if (!r) r = consumeToken(b, "fneni");
    if (!r) r = consumeToken(b, "fninit");
    if (!r) r = consumeToken(b, "fnop");
    if (!r) r = consumeToken(b, "fnsave");
    if (!r) r = consumeToken(b, "fnstcw");
    if (!r) r = consumeToken(b, "fnstenv");
    if (!r) r = consumeToken(b, "fnstsw");
    if (!r) r = consumeToken(b, "fpatan");
    if (!r) r = consumeToken(b, "fprem");
    if (!r) r = consumeToken(b, "fprem1");
    if (!r) r = consumeToken(b, "fptan");
    if (!r) r = consumeToken(b, "frndint");
    if (!r) r = consumeToken(b, "frstor");
    if (!r) r = consumeToken(b, "fsave");
    if (!r) r = consumeToken(b, "fscale");
    if (!r) r = consumeToken(b, "fsetpm");
    if (!r) r = consumeToken(b, "fsin");
    if (!r) r = consumeToken(b, "fsincos");
    if (!r) r = consumeToken(b, "fsqrt");
    if (!r) r = consumeToken(b, "fst");
    if (!r) r = consumeToken(b, "fstcw");
    if (!r) r = consumeToken(b, "fstenv");
    if (!r) r = consumeToken(b, "fstp");
    if (!r) r = consumeToken(b, "fstsw");
    if (!r) r = consumeToken(b, "fsub");
    if (!r) r = consumeToken(b, "fsubp");
    if (!r) r = consumeToken(b, "fsubr");
    if (!r) r = consumeToken(b, "fsubrp");
    if (!r) r = consumeToken(b, "ftst");
    if (!r) r = consumeToken(b, "fucom");
    if (!r) r = consumeToken(b, "fucomi");
    if (!r) r = consumeToken(b, "fucomip");
    if (!r) r = consumeToken(b, "fucomp");
    if (!r) r = consumeToken(b, "fucompp");
    if (!r) r = consumeToken(b, "fwait");
    if (!r) r = consumeToken(b, "fxam");
    if (!r) r = consumeToken(b, "fxch");
    if (!r) r = consumeToken(b, "fxrstor");
    if (!r) r = consumeToken(b, "fxsave");
    if (!r) r = consumeToken(b, "fxtract");
    if (!r) r = consumeToken(b, "fyl2x");
    if (!r) r = consumeToken(b, "fyl2xp1");
    if (!r) r = consumeToken(b, "hlt");
    if (!r) r = consumeToken(b, "idiv");
    if (!r) r = consumeToken(b, "imul");
    if (!r) r = consumeToken(b, KW_IN);
    if (!r) r = consumeToken(b, "inc");
    if (!r) r = consumeToken(b, "ins");
    if (!r) r = consumeToken(b, "insb");
    if (!r) r = consumeToken(b, "insd");
    if (!r) r = consumeToken(b, "insw");
    if (!r) r = consumeToken(b, KW_INT);
    if (!r) r = consumeToken(b, "into");
    if (!r) r = consumeToken(b, "invd");
    if (!r) r = consumeToken(b, "invlpg");
    if (!r) r = consumeToken(b, "iret");
    if (!r) r = consumeToken(b, "iretd");
    if (!r) r = consumeToken(b, "ja");
    if (!r) r = consumeToken(b, "jae");
    if (!r) r = consumeToken(b, "jb");
    if (!r) r = consumeToken(b, "jbe");
    if (!r) r = consumeToken(b, "jc");
    if (!r) r = consumeToken(b, "jcxz");
    if (!r) r = consumeToken(b, "je");
    if (!r) r = consumeToken(b, "jecxz");
    if (!r) r = consumeToken(b, "jg");
    if (!r) r = consumeToken(b, "jge");
    if (!r) r = consumeToken(b, "jl");
    if (!r) r = consumeToken(b, "jle");
    if (!r) r = consumeToken(b, "jmp");
    if (!r) r = consumeToken(b, "jna");
    if (!r) r = consumeToken(b, "jnae");
    if (!r) r = consumeToken(b, "jnb");
    if (!r) r = consumeToken(b, "jnbe");
    if (!r) r = consumeToken(b, "jnc");
    if (!r) r = consumeToken(b, "jne");
    if (!r) r = consumeToken(b, "jng");
    if (!r) r = consumeToken(b, "jnge");
    if (!r) r = consumeToken(b, "jnl");
    if (!r) r = consumeToken(b, "jnle");
    if (!r) r = consumeToken(b, "jno");
    if (!r) r = consumeToken(b, "jnp");
    if (!r) r = consumeToken(b, "jns");
    if (!r) r = consumeToken(b, "jnz");
    if (!r) r = consumeToken(b, "jo");
    if (!r) r = consumeToken(b, "jp");
    if (!r) r = consumeToken(b, "jpe");
    if (!r) r = consumeToken(b, "jpo");
    if (!r) r = consumeToken(b, "js");
    if (!r) r = consumeToken(b, "jz");
    if (!r) r = consumeToken(b, "lahf");
    if (!r) r = consumeToken(b, "lar");
    if (!r) r = consumeToken(b, "ldmxcsr");
    if (!r) r = consumeToken(b, "lds");
    if (!r) r = consumeToken(b, "lea");
    if (!r) r = consumeToken(b, "leave");
    if (!r) r = consumeToken(b, "les");
    if (!r) r = consumeToken(b, "lfence");
    if (!r) r = consumeToken(b, "lfs");
    if (!r) r = consumeToken(b, "lgdt");
    if (!r) r = consumeToken(b, "lgs");
    if (!r) r = consumeToken(b, "lidt");
    if (!r) r = consumeToken(b, "lldt");
    if (!r) r = consumeToken(b, "lmsw");
    if (!r) r = consumeToken(b, "lock");
    if (!r) r = consumeToken(b, "lods");
    if (!r) r = consumeToken(b, "lodsb");
    if (!r) r = consumeToken(b, "lodsd");
    if (!r) r = consumeToken(b, "lodsw");
    if (!r) r = consumeToken(b, "loop");
    if (!r) r = consumeToken(b, "loope");
    if (!r) r = consumeToken(b, "loopne");
    if (!r) r = consumeToken(b, "loopnz");
    if (!r) r = consumeToken(b, "loopz");
    if (!r) r = consumeToken(b, "lsl");
    if (!r) r = consumeToken(b, "lss");
    if (!r) r = consumeToken(b, "ltr");
    if (!r) r = consumeToken(b, "maskmovdqu");
    if (!r) r = consumeToken(b, "maskmovq");
    if (!r) r = consumeToken(b, "maxpd");
    if (!r) r = consumeToken(b, "maxps");
    if (!r) r = consumeToken(b, "maxsd");
    if (!r) r = consumeToken(b, "maxss");
    if (!r) r = consumeToken(b, "mfence");
    if (!r) r = consumeToken(b, "minpd");
    if (!r) r = consumeToken(b, "minps");
    if (!r) r = consumeToken(b, "minsd");
    if (!r) r = consumeToken(b, "minss");
    if (!r) r = consumeToken(b, "mov");
    if (!r) r = consumeToken(b, "movapd");
    if (!r) r = consumeToken(b, "movaps");
    if (!r) r = consumeToken(b, "movd");
    if (!r) r = consumeToken(b, "movdq2q");
    if (!r) r = consumeToken(b, "movdqa");
    if (!r) r = consumeToken(b, "movdqu");
    if (!r) r = consumeToken(b, "movhlps");
    if (!r) r = consumeToken(b, "movhpd");
    if (!r) r = consumeToken(b, "movhps");
    if (!r) r = consumeToken(b, "movlhps");
    if (!r) r = consumeToken(b, "movlpd");
    if (!r) r = consumeToken(b, "movlps");
    if (!r) r = consumeToken(b, "movmskpd");
    if (!r) r = consumeToken(b, "movmskps");
    if (!r) r = consumeToken(b, "movntdq");
    if (!r) r = consumeToken(b, "movnti");
    if (!r) r = consumeToken(b, "movntpd");
    if (!r) r = consumeToken(b, "movntps");
    if (!r) r = consumeToken(b, "movntq");
    if (!r) r = consumeToken(b, "movq");
    if (!r) r = consumeToken(b, "movq2dq");
    if (!r) r = consumeToken(b, "movs");
    if (!r) r = consumeToken(b, "movsb");
    if (!r) r = consumeToken(b, "movsd");
    if (!r) r = consumeToken(b, "movss");
    if (!r) r = consumeToken(b, "movsw");
    if (!r) r = consumeToken(b, "movsx");
    if (!r) r = consumeToken(b, "movupd");
    if (!r) r = consumeToken(b, "movups");
    if (!r) r = consumeToken(b, "movzx");
    if (!r) r = consumeToken(b, "mul");
    if (!r) r = consumeToken(b, "mulpd");
    if (!r) r = consumeToken(b, "mulps");
    if (!r) r = consumeToken(b, "mulsd");
    if (!r) r = consumeToken(b, "mulss");
    if (!r) r = consumeToken(b, "neg");
    if (!r) r = consumeToken(b, "nop");
    if (!r) r = consumeToken(b, "not");
    if (!r) r = consumeToken(b, "or");
    if (!r) r = consumeToken(b, "orpd");
    if (!r) r = consumeToken(b, "orps");
    if (!r) r = consumeToken(b, KW_OUT);
    if (!r) r = consumeToken(b, "outs");
    if (!r) r = consumeToken(b, "outsb");
    if (!r) r = consumeToken(b, "outsd");
    if (!r) r = consumeToken(b, "outsw");
    if (!r) r = consumeToken(b, "packssdw");
    if (!r) r = consumeToken(b, "packsswb");
    if (!r) r = consumeToken(b, "packuswb");
    if (!r) r = consumeToken(b, "paddb");
    if (!r) r = consumeToken(b, "paddd");
    if (!r) r = consumeToken(b, "paddq");
    if (!r) r = consumeToken(b, "paddsb");
    if (!r) r = consumeToken(b, "paddsw");
    if (!r) r = consumeToken(b, "paddusb");
    if (!r) r = consumeToken(b, "paddusw");
    if (!r) r = consumeToken(b, "paddw");
    if (!r) r = consumeToken(b, "pand");
    if (!r) r = consumeToken(b, "pandn");
    if (!r) r = consumeToken(b, "pavgb");
    if (!r) r = consumeToken(b, "pavgw");
    if (!r) r = consumeToken(b, "pcmpeqb");
    if (!r) r = consumeToken(b, "pcmpeqd");
    if (!r) r = consumeToken(b, "pcmpeqw");
    if (!r) r = consumeToken(b, "pcmpgtb");
    if (!r) r = consumeToken(b, "pcmpgtd");
    if (!r) r = consumeToken(b, "pcmpgtw");
    if (!r) r = consumeToken(b, "pextrw");
    if (!r) r = consumeToken(b, "pinsrw");
    if (!r) r = consumeToken(b, "pmaddwd");
    if (!r) r = consumeToken(b, "pmaxsw");
    if (!r) r = consumeToken(b, "pmaxub");
    if (!r) r = consumeToken(b, "pminsw");
    if (!r) r = consumeToken(b, "pminub");
    if (!r) r = consumeToken(b, "pmovmskb");
    if (!r) r = consumeToken(b, "pmulhuw");
    if (!r) r = consumeToken(b, "pmulhw");
    if (!r) r = consumeToken(b, "pmullw");
    if (!r) r = consumeToken(b, "pmuludq");
    if (!r) r = consumeToken(b, "pop");
    if (!r) r = consumeToken(b, "popa");
    if (!r) r = consumeToken(b, "popad");
    if (!r) r = consumeToken(b, "popf");
    if (!r) r = consumeToken(b, "popfd");
    if (!r) r = consumeToken(b, "por");
    if (!r) r = consumeToken(b, "prefetchnta");
    if (!r) r = consumeToken(b, "prefetcht0");
    if (!r) r = consumeToken(b, "prefetcht1");
    if (!r) r = consumeToken(b, "prefetcht2");
    if (!r) r = consumeToken(b, "psadbw");
    if (!r) r = consumeToken(b, "pshufd");
    if (!r) r = consumeToken(b, "pshufhw");
    if (!r) r = consumeToken(b, "pshuflw");
    if (!r) r = consumeToken(b, "pshufw");
    if (!r) r = consumeToken(b, "pslld");
    if (!r) r = consumeToken(b, "pslldq");
    if (!r) r = consumeToken(b, "psllq");
    if (!r) r = consumeToken(b, "psllw");
    if (!r) r = consumeToken(b, "psrad");
    if (!r) r = consumeToken(b, "psraw");
    if (!r) r = consumeToken(b, "psrld");
    if (!r) r = consumeToken(b, "psrldq");
    if (!r) r = consumeToken(b, "psrlq");
    if (!r) r = consumeToken(b, "psrlw");
    if (!r) r = consumeToken(b, "psubb");
    if (!r) r = consumeToken(b, "psubd");
    if (!r) r = consumeToken(b, "psubq");
    if (!r) r = consumeToken(b, "psubsb");
    if (!r) r = consumeToken(b, "psubsw");
    if (!r) r = consumeToken(b, "psubusb");
    if (!r) r = consumeToken(b, "psubusw");
    if (!r) r = consumeToken(b, "psubw");
    if (!r) r = consumeToken(b, "punpckhbw");
    if (!r) r = consumeToken(b, "punpckhdq");
    if (!r) r = consumeToken(b, "punpckhqdq");
    if (!r) r = consumeToken(b, "punpckhwd");
    if (!r) r = consumeToken(b, "punpcklbw");
    if (!r) r = consumeToken(b, "punpckldq");
    if (!r) r = consumeToken(b, "punpcklqdq");
    if (!r) r = consumeToken(b, "punpcklwd");
    if (!r) r = consumeToken(b, "push");
    if (!r) r = consumeToken(b, "pusha");
    if (!r) r = consumeToken(b, "pushad");
    if (!r) r = consumeToken(b, "pushf");
    if (!r) r = consumeToken(b, "pushfd");
    if (!r) r = consumeToken(b, "pxor");
    if (!r) r = consumeToken(b, "rcl");
    if (!r) r = consumeToken(b, "rcpps");
    if (!r) r = consumeToken(b, "rcpss");
    if (!r) r = consumeToken(b, "rcr");
    if (!r) r = consumeToken(b, "rdmsr");
    if (!r) r = consumeToken(b, "rdpmc");
    if (!r) r = consumeToken(b, "rdtsc");
    if (!r) r = consumeToken(b, "rep");
    if (!r) r = consumeToken(b, "repe");
    if (!r) r = consumeToken(b, "repne");
    if (!r) r = consumeToken(b, "repnz");
    if (!r) r = consumeToken(b, "repz");
    if (!r) r = consumeToken(b, "ret");
    if (!r) r = consumeToken(b, "retf");
    if (!r) r = consumeToken(b, "rol");
    if (!r) r = consumeToken(b, "ror");
    if (!r) r = consumeToken(b, "rsm");
    if (!r) r = consumeToken(b, "rsqrtps");
    if (!r) r = consumeToken(b, "rsqrtss");
    if (!r) r = consumeToken(b, "sahf");
    if (!r) r = consumeToken(b, "sal");
    if (!r) r = consumeToken(b, "sar");
    if (!r) r = consumeToken(b, "sbb");
    if (!r) r = consumeToken(b, "scas");
    if (!r) r = consumeToken(b, "scasb");
    if (!r) r = consumeToken(b, "scasd");
    if (!r) r = consumeToken(b, "scasw");
    if (!r) r = consumeToken(b, "seta");
    if (!r) r = consumeToken(b, "setae");
    if (!r) r = consumeToken(b, "setb");
    if (!r) r = consumeToken(b, "setbe");
    if (!r) r = consumeToken(b, "setc");
    if (!r) r = consumeToken(b, "sete");
    if (!r) r = consumeToken(b, "setg");
    if (!r) r = consumeToken(b, "setge");
    if (!r) r = consumeToken(b, "setl");
    if (!r) r = consumeToken(b, "setle");
    if (!r) r = consumeToken(b, "setna");
    if (!r) r = consumeToken(b, "setnae");
    if (!r) r = consumeToken(b, "setnb");
    if (!r) r = consumeToken(b, "setnbe");
    if (!r) r = consumeToken(b, "setnc");
    if (!r) r = consumeToken(b, "setne");
    if (!r) r = consumeToken(b, "setng");
    if (!r) r = consumeToken(b, "setnge");
    if (!r) r = consumeToken(b, "setnl");
    if (!r) r = consumeToken(b, "setnle");
    if (!r) r = consumeToken(b, "setno");
    if (!r) r = consumeToken(b, "setnp");
    if (!r) r = consumeToken(b, "setns");
    if (!r) r = consumeToken(b, "setnz");
    if (!r) r = consumeToken(b, "seto");
    if (!r) r = consumeToken(b, "setp");
    if (!r) r = consumeToken(b, "setpe");
    if (!r) r = consumeToken(b, "setpo");
    if (!r) r = consumeToken(b, "sets");
    if (!r) r = consumeToken(b, "setz");
    if (!r) r = consumeToken(b, "sfence");
    if (!r) r = consumeToken(b, "sgdt");
    if (!r) r = consumeToken(b, "shl");
    if (!r) r = consumeToken(b, "shld");
    if (!r) r = consumeToken(b, "shr");
    if (!r) r = consumeToken(b, "shrd");
    if (!r) r = consumeToken(b, "shufpd");
    if (!r) r = consumeToken(b, "shufps");
    if (!r) r = consumeToken(b, "sidt");
    if (!r) r = consumeToken(b, "sldt");
    if (!r) r = consumeToken(b, "smsw");
    if (!r) r = consumeToken(b, "sqrtpd");
    if (!r) r = consumeToken(b, "sqrtps");
    if (!r) r = consumeToken(b, "sqrtsd");
    if (!r) r = consumeToken(b, "sqrtss");
    if (!r) r = consumeToken(b, "stc");
    if (!r) r = consumeToken(b, "std");
    if (!r) r = consumeToken(b, "sti");
    if (!r) r = consumeToken(b, "stmxcsr");
    if (!r) r = consumeToken(b, "stos");
    if (!r) r = consumeToken(b, "stosb");
    if (!r) r = consumeToken(b, "stosd");
    if (!r) r = consumeToken(b, "stosw");
    if (!r) r = consumeToken(b, "str");
    if (!r) r = consumeToken(b, "sub");
    if (!r) r = consumeToken(b, "subpd");
    if (!r) r = consumeToken(b, "subps");
    if (!r) r = consumeToken(b, "subsd");
    if (!r) r = consumeToken(b, "subss");
    if (!r) r = consumeToken(b, "sysenter");
    if (!r) r = consumeToken(b, "sysexit");
    if (!r) r = consumeToken(b, "test");
    if (!r) r = consumeToken(b, "ucomisd");
    if (!r) r = consumeToken(b, "ucomiss");
    if (!r) r = consumeToken(b, "ud2");
    if (!r) r = consumeToken(b, "unpckhpd");
    if (!r) r = consumeToken(b, "unpckhps");
    if (!r) r = consumeToken(b, "unpcklpd");
    if (!r) r = consumeToken(b, "unpcklps");
    if (!r) r = consumeToken(b, "verr");
    if (!r) r = consumeToken(b, "verw");
    if (!r) r = consumeToken(b, "wait");
    if (!r) r = consumeToken(b, "wbinvd");
    if (!r) r = consumeToken(b, "wrmsr");
    if (!r) r = consumeToken(b, "xadd");
    if (!r) r = consumeToken(b, "xchg");
    if (!r) r = consumeToken(b, "xlat");
    if (!r) r = consumeToken(b, "xlatb");
    if (!r) r = consumeToken(b, "xor");
    if (!r) r = consumeToken(b, "xorpd");
    if (!r) r = consumeToken(b, "xorps");
    if (!r) r = consumeToken(b, "addsubpd");
    if (!r) r = consumeToken(b, "addsubps");
    if (!r) r = consumeToken(b, "fisttp");
    if (!r) r = consumeToken(b, "haddpd");
    if (!r) r = consumeToken(b, "haddps");
    if (!r) r = consumeToken(b, "hsubpd");
    if (!r) r = consumeToken(b, "hsubps");
    if (!r) r = consumeToken(b, "lddqu");
    if (!r) r = consumeToken(b, "monitor");
    if (!r) r = consumeToken(b, "movddup");
    if (!r) r = consumeToken(b, "movshdup");
    if (!r) r = consumeToken(b, "movsldup");
    if (!r) r = consumeToken(b, "mwait");
    if (!r) r = consumeToken(b, "pavgusb");
    if (!r) r = consumeToken(b, "pf2id");
    if (!r) r = consumeToken(b, "pfacc");
    if (!r) r = consumeToken(b, "pfadd");
    if (!r) r = consumeToken(b, "pfcmpeq");
    if (!r) r = consumeToken(b, "pfcmpge");
    if (!r) r = consumeToken(b, "pfcmpgt");
    if (!r) r = consumeToken(b, "pfmax");
    if (!r) r = consumeToken(b, "pfmin");
    if (!r) r = consumeToken(b, "pfmul");
    if (!r) r = consumeToken(b, "pfnacc");
    if (!r) r = consumeToken(b, "pfpnacc");
    if (!r) r = consumeToken(b, "pfrcp");
    if (!r) r = consumeToken(b, "pfrcpit1");
    if (!r) r = consumeToken(b, "pfrcpit2");
    if (!r) r = consumeToken(b, "pfrsqit1");
    if (!r) r = consumeToken(b, "pfrsqrt");
    if (!r) r = consumeToken(b, "pfsub");
    if (!r) r = consumeToken(b, "pfsubr");
    if (!r) r = consumeToken(b, "pi2fd");
    if (!r) r = consumeToken(b, "pmulhrw");
    if (!r) r = consumeToken(b, "pswapd");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // AsmExp
  public static boolean Operand(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Operand")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, OPERAND, "<operand>");
    r = AsmExp(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // Operand [',' Operands]
  public static boolean Operands(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Operands")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, OPERANDS, "<operands>");
    r = Operand(b, l + 1);
    r = r && Operands_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // [',' Operands]
  private static boolean Operands_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Operands_1")) return false;
    Operands_1_0(b, l + 1);
    return true;
  }

  // ',' Operands
  private static boolean Operands_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Operands_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OP_COMMA);
    r = r && Operands(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // XorExpression [OrExpression]
  static boolean OrExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "OrExpression")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = XorExpression(b, l + 1);
    r = r && OrExpression_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [OrExpression]
  private static boolean OrExpression_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "OrExpression_1")) return false;
    OrExpression(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // '||' OrOrExpression_
  public static boolean OrOrExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "OrOrExpression")) return false;
    if (!nextTokenIs(b, OP_BOOL_OR)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OP_BOOL_OR);
    r = r && OrOrExpression_(b, l + 1);
    exit_section_(b, m, OR_OR_EXPRESSION, r);
    return r;
  }

  /* ********************************************************** */
  // AndAndExpression [ OrOrExpression]
  static boolean OrOrExpression_(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "OrOrExpression_")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = AndAndExpression(b, l + 1);
    r = r && OrOrExpression__1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [ OrOrExpression]
  private static boolean OrOrExpression__1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "OrOrExpression__1")) return false;
    OrOrExpression(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // 'out' BlockStatement
  //     | 'out' '(' Identifier ')' BlockStatement{
  //     //pin(".*") = 1
  //     }
  public static boolean OutStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "OutStatement")) return false;
    if (!nextTokenIs(b, KW_OUT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = OutStatement_0(b, l + 1);
    if (!r) r = OutStatement_1(b, l + 1);
    exit_section_(b, m, OUT_STATEMENT, r);
    return r;
  }

  // 'out' BlockStatement
  private static boolean OutStatement_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "OutStatement_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, KW_OUT);
    r = r && BlockStatement(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // 'out' '(' Identifier ')' BlockStatement{
  //     //pin(".*") = 1
  //     }
  private static boolean OutStatement_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "OutStatement_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, KW_OUT, OP_PAR_LEFT);
    r = r && Identifier(b, l + 1);
    r = r && consumeToken(b, OP_PAR_RIGHT);
    r = r && BlockStatement(b, l + 1);
    r = r && OutStatement_1_5(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // {
  //     //pin(".*") = 1
  //     }
  private static boolean OutStatement_1_5(PsiBuilder b, int l) {
    return true;
  }

  /* ********************************************************** */
  // InOut? BasicType Declarator (('...' | '=') AssignExpression?)?
  //        | InOut? Type '=' AssignExpression
  //        | InOut? 'alias' Identifier '=' AssignExpression
  //        | InOut? Type ('...')?
  public static boolean Parameter(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Parameter")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, PARAMETER, "<parameter>");
    r = Parameter_0(b, l + 1);
    if (!r) r = Parameter_1(b, l + 1);
    if (!r) r = Parameter_2(b, l + 1);
    if (!r) r = Parameter_3(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // InOut? BasicType Declarator (('...' | '=') AssignExpression?)?
  private static boolean Parameter_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Parameter_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Parameter_0_0(b, l + 1);
    r = r && BasicType(b, l + 1);
    r = r && Declarator(b, l + 1);
    r = r && Parameter_0_3(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // InOut?
  private static boolean Parameter_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Parameter_0_0")) return false;
    InOut(b, l + 1);
    return true;
  }

  // (('...' | '=') AssignExpression?)?
  private static boolean Parameter_0_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Parameter_0_3")) return false;
    Parameter_0_3_0(b, l + 1);
    return true;
  }

  // ('...' | '=') AssignExpression?
  private static boolean Parameter_0_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Parameter_0_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Parameter_0_3_0_0(b, l + 1);
    r = r && Parameter_0_3_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // '...' | '='
  private static boolean Parameter_0_3_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Parameter_0_3_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OP_TRIPLEDOT);
    if (!r) r = consumeToken(b, OP_EQ);
    exit_section_(b, m, null, r);
    return r;
  }

  // AssignExpression?
  private static boolean Parameter_0_3_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Parameter_0_3_0_1")) return false;
    AssignExpression(b, l + 1);
    return true;
  }

  // InOut? Type '=' AssignExpression
  private static boolean Parameter_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Parameter_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Parameter_1_0(b, l + 1);
    r = r && Type(b, l + 1);
    r = r && consumeToken(b, OP_EQ);
    r = r && AssignExpression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // InOut?
  private static boolean Parameter_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Parameter_1_0")) return false;
    InOut(b, l + 1);
    return true;
  }

  // InOut? 'alias' Identifier '=' AssignExpression
  private static boolean Parameter_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Parameter_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Parameter_2_0(b, l + 1);
    r = r && consumeToken(b, KW_ALIAS);
    r = r && Identifier(b, l + 1);
    r = r && consumeToken(b, OP_EQ);
    r = r && AssignExpression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // InOut?
  private static boolean Parameter_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Parameter_2_0")) return false;
    InOut(b, l + 1);
    return true;
  }

  // InOut? Type ('...')?
  private static boolean Parameter_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Parameter_3")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Parameter_3_0(b, l + 1);
    r = r && Type(b, l + 1);
    r = r && Parameter_3_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // InOut?
  private static boolean Parameter_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Parameter_3_0")) return false;
    InOut(b, l + 1);
    return true;
  }

  // ('...')?
  private static boolean Parameter_3_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Parameter_3_2")) return false;
    consumeToken(b, OP_TRIPLEDOT);
    return true;
  }

  /* ********************************************************** */
  // Parameters FunctionAttributes?
  public static boolean ParameterAttributes(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ParameterAttributes")) return false;
    if (!nextTokenIs(b, OP_PAR_LEFT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Parameters(b, l + 1);
    r = r && ParameterAttributes_1(b, l + 1);
    exit_section_(b, m, PARAMETER_ATTRIBUTES, r);
    return r;
  }

  // FunctionAttributes?
  private static boolean ParameterAttributes_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ParameterAttributes_1")) return false;
    FunctionAttributes(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // Parameter (',' Parameter)* ','? '...'?
  //     | '...'
  public static boolean ParameterList(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ParameterList")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, PARAMETER_LIST, "<parameter list>");
    r = ParameterList_0(b, l + 1);
    if (!r) r = consumeToken(b, OP_TRIPLEDOT);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // Parameter (',' Parameter)* ','? '...'?
  private static boolean ParameterList_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ParameterList_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Parameter(b, l + 1);
    r = r && ParameterList_0_1(b, l + 1);
    r = r && ParameterList_0_2(b, l + 1);
    r = r && ParameterList_0_3(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (',' Parameter)*
  private static boolean ParameterList_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ParameterList_0_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!ParameterList_0_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "ParameterList_0_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // ',' Parameter
  private static boolean ParameterList_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ParameterList_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OP_COMMA);
    r = r && Parameter(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ','?
  private static boolean ParameterList_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ParameterList_0_2")) return false;
    consumeToken(b, OP_COMMA);
    return true;
  }

  // '...'?
  private static boolean ParameterList_0_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ParameterList_0_3")) return false;
    consumeToken(b, OP_TRIPLEDOT);
    return true;
  }

  /* ********************************************************** */
  // Parameters MemberFunctionAttributes?
  public static boolean ParameterMemberAttributes(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ParameterMemberAttributes")) return false;
    if (!nextTokenIs(b, OP_PAR_LEFT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Parameters(b, l + 1);
    r = r && ParameterMemberAttributes_1(b, l + 1);
    exit_section_(b, m, PARAMETER_MEMBER_ATTRIBUTES, r);
    return r;
  }

  // MemberFunctionAttributes?
  private static boolean ParameterMemberAttributes_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ParameterMemberAttributes_1")) return false;
    MemberFunctionAttributes(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // '(' ParameterList? ')'
  public static boolean Parameters(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Parameters")) return false;
    if (!nextTokenIs(b, OP_PAR_LEFT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OP_PAR_LEFT);
    r = r && Parameters_1(b, l + 1);
    r = r && consumeToken(b, OP_PAR_RIGHT);
    exit_section_(b, m, PARAMETERS, r);
    return r;
  }

  // ParameterList?
  private static boolean Parameters_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Parameters_1")) return false;
    ParameterList(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // 'this' '(' 'this' ')' MemberFunctionAttributes? ';'
  //     | 'this' '(' 'this' ')' MemberFunctionAttributes? FunctionBody{
  //     //pin(".*") = 1
  //     }
  public static boolean Postblit(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Postblit")) return false;
    if (!nextTokenIs(b, KW_THIS)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Postblit_0(b, l + 1);
    if (!r) r = Postblit_1(b, l + 1);
    exit_section_(b, m, POSTBLIT, r);
    return r;
  }

  // 'this' '(' 'this' ')' MemberFunctionAttributes? ';'
  private static boolean Postblit_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Postblit_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, KW_THIS, OP_PAR_LEFT, KW_THIS, OP_PAR_RIGHT);
    r = r && Postblit_0_4(b, l + 1);
    r = r && consumeToken(b, OP_SCOLON);
    exit_section_(b, m, null, r);
    return r;
  }

  // MemberFunctionAttributes?
  private static boolean Postblit_0_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Postblit_0_4")) return false;
    MemberFunctionAttributes(b, l + 1);
    return true;
  }

  // 'this' '(' 'this' ')' MemberFunctionAttributes? FunctionBody{
  //     //pin(".*") = 1
  //     }
  private static boolean Postblit_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Postblit_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, KW_THIS, OP_PAR_LEFT, KW_THIS, OP_PAR_RIGHT);
    r = r && Postblit_1_4(b, l + 1);
    r = r && FunctionBody(b, l + 1);
    r = r && Postblit_1_6(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // MemberFunctionAttributes?
  private static boolean Postblit_1_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Postblit_1_4")) return false;
    MemberFunctionAttributes(b, l + 1);
    return true;
  }

  // {
  //     //pin(".*") = 1
  //     }
  private static boolean Postblit_1_6(PsiBuilder b, int l) {
    return true;
  }

  /* ********************************************************** */
  // PrimaryExpression
  //     | '.' Identifier [PostfixExpression]
  //     | '.' TemplateInstance [PostfixExpression]
  //     | '.' NewExpression [PostfixExpression]
  //     | '++' [PostfixExpression]
  //     |  '--' [PostfixExpression]
  //     | '(' ArgumentList? ')' [PostfixExpression]
  //     | TypeCtors? BasicType '(' ArgumentList? ')' [PostfixExpression]
  //     | IndexExpression
  //     | SliceExpression
  public static boolean PostfixExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PostfixExpression")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, POSTFIX_EXPRESSION, "<postfix expression>");
    r = PrimaryExpression(b, l + 1);
    if (!r) r = PostfixExpression_1(b, l + 1);
    if (!r) r = PostfixExpression_2(b, l + 1);
    if (!r) r = PostfixExpression_3(b, l + 1);
    if (!r) r = PostfixExpression_4(b, l + 1);
    if (!r) r = PostfixExpression_5(b, l + 1);
    if (!r) r = PostfixExpression_6(b, l + 1);
    if (!r) r = PostfixExpression_7(b, l + 1);
    if (!r) r = IndexExpression(b, l + 1);
    if (!r) r = SliceExpression(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // '.' Identifier [PostfixExpression]
  private static boolean PostfixExpression_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PostfixExpression_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OP_DOT);
    r = r && Identifier(b, l + 1);
    r = r && PostfixExpression_1_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [PostfixExpression]
  private static boolean PostfixExpression_1_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PostfixExpression_1_2")) return false;
    PostfixExpression(b, l + 1);
    return true;
  }

  // '.' TemplateInstance [PostfixExpression]
  private static boolean PostfixExpression_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PostfixExpression_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OP_DOT);
    r = r && TemplateInstance(b, l + 1);
    r = r && PostfixExpression_2_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [PostfixExpression]
  private static boolean PostfixExpression_2_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PostfixExpression_2_2")) return false;
    PostfixExpression(b, l + 1);
    return true;
  }

  // '.' NewExpression [PostfixExpression]
  private static boolean PostfixExpression_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PostfixExpression_3")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OP_DOT);
    r = r && NewExpression(b, l + 1);
    r = r && PostfixExpression_3_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [PostfixExpression]
  private static boolean PostfixExpression_3_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PostfixExpression_3_2")) return false;
    PostfixExpression(b, l + 1);
    return true;
  }

  // '++' [PostfixExpression]
  private static boolean PostfixExpression_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PostfixExpression_4")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OP_PLUS_PLUS);
    r = r && PostfixExpression_4_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [PostfixExpression]
  private static boolean PostfixExpression_4_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PostfixExpression_4_1")) return false;
    PostfixExpression(b, l + 1);
    return true;
  }

  // '--' [PostfixExpression]
  private static boolean PostfixExpression_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PostfixExpression_5")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OP_MINUS_MINUS);
    r = r && PostfixExpression_5_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [PostfixExpression]
  private static boolean PostfixExpression_5_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PostfixExpression_5_1")) return false;
    PostfixExpression(b, l + 1);
    return true;
  }

  // '(' ArgumentList? ')' [PostfixExpression]
  private static boolean PostfixExpression_6(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PostfixExpression_6")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OP_PAR_LEFT);
    r = r && PostfixExpression_6_1(b, l + 1);
    r = r && consumeToken(b, OP_PAR_RIGHT);
    r = r && PostfixExpression_6_3(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ArgumentList?
  private static boolean PostfixExpression_6_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PostfixExpression_6_1")) return false;
    ArgumentList(b, l + 1);
    return true;
  }

  // [PostfixExpression]
  private static boolean PostfixExpression_6_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PostfixExpression_6_3")) return false;
    PostfixExpression(b, l + 1);
    return true;
  }

  // TypeCtors? BasicType '(' ArgumentList? ')' [PostfixExpression]
  private static boolean PostfixExpression_7(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PostfixExpression_7")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = PostfixExpression_7_0(b, l + 1);
    r = r && BasicType(b, l + 1);
    r = r && consumeToken(b, OP_PAR_LEFT);
    r = r && PostfixExpression_7_3(b, l + 1);
    r = r && consumeToken(b, OP_PAR_RIGHT);
    r = r && PostfixExpression_7_5(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // TypeCtors?
  private static boolean PostfixExpression_7_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PostfixExpression_7_0")) return false;
    TypeCtors(b, l + 1);
    return true;
  }

  // ArgumentList?
  private static boolean PostfixExpression_7_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PostfixExpression_7_3")) return false;
    ArgumentList(b, l + 1);
    return true;
  }

  // [PostfixExpression]
  private static boolean PostfixExpression_7_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PostfixExpression_7_5")) return false;
    PostfixExpression(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // PostfixExpression [PowExpression_]
  static boolean PowExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PowExpression")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = PostfixExpression(b, l + 1);
    r = r && PowExpression_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [PowExpression_]
  private static boolean PowExpression_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PowExpression_1")) return false;
    PowExpression_(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // '^^' UnaryExpression PowExpression
  public static boolean PowExpression_(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PowExpression_")) return false;
    if (!nextTokenIs(b, OP_POW)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OP_POW);
    r = r && UnaryExpression(b, l + 1);
    r = r && PowExpression(b, l + 1);
    exit_section_(b, m, POW_EXPRESSION_, r);
    return r;
  }

  /* ********************************************************** */
  // 'pragma' '(' Identifier (',' ArgumentList)? ')'
  public static boolean Pragma(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Pragma")) return false;
    if (!nextTokenIs(b, KW_PRAGMA)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, PRAGMA, null);
    r = consumeTokens(b, 1, KW_PRAGMA, OP_PAR_LEFT);
    p = r; // pin = 1
    r = r && report_error_(b, Identifier(b, l + 1));
    r = p && report_error_(b, Pragma_3(b, l + 1)) && r;
    r = p && consumeToken(b, OP_PAR_RIGHT) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // (',' ArgumentList)?
  private static boolean Pragma_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Pragma_3")) return false;
    Pragma_3_0(b, l + 1);
    return true;
  }

  // ',' ArgumentList
  private static boolean Pragma_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Pragma_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OP_COMMA);
    r = r && ArgumentList(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // Pragma Statement
  public static boolean PragmaStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PragmaStatement")) return false;
    if (!nextTokenIs(b, KW_PRAGMA)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, PRAGMA_STATEMENT, null);
    r = Pragma(b, l + 1);
    p = r; // pin = 1
    r = r && Statement(b, l + 1);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // ('.')? (TemplateInstance | Identifier)
  //     | Type
  //     | 'this'
  //     | 'super'
  //     | 'null'
  //     | 'true'
  //     | 'false'
  //     | '$'
  //     | INTEGER_LITERAL
  //     | FLOAT_LITERAL
  //     | CHARACTER_LITERAL
  //     | StringLiterals
  //     | ArrayLiteral
  //     | AssocArrayLiteral
  //     | FunctionLiteral
  //     | AssertExpression
  //     | MixinExpression
  //     | ImportExpression
  //     | NewExpressionWithArgs
  //     | BasicTypeX '.' Identifier
  //     | Typeof
  //     | TypeidExpression
  //     | IsExpression
  //     | '(' Expression ')'
  //     | TraitsExpression
  //     | SpecialKeyword
  public static boolean PrimaryExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PrimaryExpression")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, PRIMARY_EXPRESSION, "<primary expression>");
    r = PrimaryExpression_0(b, l + 1);
    if (!r) r = Type(b, l + 1);
    if (!r) r = consumeToken(b, KW_THIS);
    if (!r) r = consumeToken(b, KW_SUPER);
    if (!r) r = consumeToken(b, KW_NULL);
    if (!r) r = consumeToken(b, KW_TRUE);
    if (!r) r = consumeToken(b, KW_FALSE);
    if (!r) r = consumeToken(b, OP_DOLLAR);
    if (!r) r = consumeToken(b, INTEGER_LITERAL);
    if (!r) r = consumeToken(b, FLOAT_LITERAL);
    if (!r) r = consumeToken(b, CHARACTER_LITERAL);
    if (!r) r = StringLiterals(b, l + 1);
    if (!r) r = ArrayLiteral(b, l + 1);
    if (!r) r = AssocArrayLiteral(b, l + 1);
    if (!r) r = FunctionLiteral(b, l + 1);
    if (!r) r = AssertExpression(b, l + 1);
    if (!r) r = MixinExpression(b, l + 1);
    if (!r) r = ImportExpression(b, l + 1);
    if (!r) r = NewExpressionWithArgs(b, l + 1);
    if (!r) r = PrimaryExpression_19(b, l + 1);
    if (!r) r = Typeof(b, l + 1);
    if (!r) r = TypeidExpression(b, l + 1);
    if (!r) r = IsExpression(b, l + 1);
    if (!r) r = PrimaryExpression_23(b, l + 1);
    if (!r) r = TraitsExpression(b, l + 1);
    if (!r) r = SpecialKeyword(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ('.')? (TemplateInstance | Identifier)
  private static boolean PrimaryExpression_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PrimaryExpression_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = PrimaryExpression_0_0(b, l + 1);
    r = r && PrimaryExpression_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ('.')?
  private static boolean PrimaryExpression_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PrimaryExpression_0_0")) return false;
    consumeToken(b, OP_DOT);
    return true;
  }

  // TemplateInstance | Identifier
  private static boolean PrimaryExpression_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PrimaryExpression_0_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = TemplateInstance(b, l + 1);
    if (!r) r = Identifier(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // BasicTypeX '.' Identifier
  private static boolean PrimaryExpression_19(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PrimaryExpression_19")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = BasicTypeX(b, l + 1);
    r = r && consumeToken(b, OP_DOT);
    r = r && Identifier(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // '(' Expression ')'
  private static boolean PrimaryExpression_23(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PrimaryExpression_23")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OP_PAR_LEFT);
    r = r && Expression(b, l + 1);
    r = r && consumeToken(b, OP_PAR_RIGHT);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // BuiltInProperty
  //     | UserDefinedAttribute
  public static boolean Property(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Property")) return false;
    if (!nextTokenIs(b, OP_AT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = BuiltInProperty(b, l + 1);
    if (!r) r = UserDefinedAttribute(b, l + 1);
    exit_section_(b, m, PROPERTY, r);
    return r;
  }

  /* ********************************************************** */
  // 'property'
  //     | 'safe'
  //     | 'trusted'
  //     | 'system'
  //     | 'disable'
  //     | 'nogc'
  public static boolean PropertyIdentifier(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PropertyIdentifier")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, PROPERTY_IDENTIFIER, "<property identifier>");
    r = consumeToken(b, "property");
    if (!r) r = consumeToken(b, "safe");
    if (!r) r = consumeToken(b, "trusted");
    if (!r) r = consumeToken(b, "system");
    if (!r) r = consumeToken(b, "disable");
    if (!r) r = consumeToken(b, "nogc");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // 'private'
  //     | 'package' '(' IdentifierList ')'
  //     | 'package'
  //     | 'protected'
  //     | 'public'
  //     | 'export'
  public static boolean ProtectionAttribute(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ProtectionAttribute")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, PROTECTION_ATTRIBUTE, "<protection attribute>");
    r = consumeToken(b, KW_PRIVATE);
    if (!r) r = ProtectionAttribute_1(b, l + 1);
    if (!r) r = consumeToken(b, KW_PACKAGE);
    if (!r) r = consumeToken(b, KW_PROTECTED);
    if (!r) r = consumeToken(b, KW_PUBLIC);
    if (!r) r = consumeToken(b, KW_EXPORT);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // 'package' '(' IdentifierList ')'
  private static boolean ProtectionAttribute_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ProtectionAttribute_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, KW_PACKAGE, OP_PAR_LEFT);
    r = r && IdentifierList(b, l + 1);
    r = r && consumeToken(b, OP_PAR_RIGHT);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // (Identifier | TemplateInstance) ( '.' (Identifier | TemplateInstance) )*
  public static boolean QualifiedIdentifierList(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "QualifiedIdentifierList")) return false;
    if (!nextTokenIs(b, "<qualified identifier list>", OP_NOT, ID)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, QUALIFIED_IDENTIFIER_LIST, "<qualified identifier list>");
    r = QualifiedIdentifierList_0(b, l + 1);
    r = r && QualifiedIdentifierList_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // Identifier | TemplateInstance
  private static boolean QualifiedIdentifierList_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "QualifiedIdentifierList_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Identifier(b, l + 1);
    if (!r) r = TemplateInstance(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( '.' (Identifier | TemplateInstance) )*
  private static boolean QualifiedIdentifierList_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "QualifiedIdentifierList_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!QualifiedIdentifierList_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "QualifiedIdentifierList_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // '.' (Identifier | TemplateInstance)
  private static boolean QualifiedIdentifierList_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "QualifiedIdentifierList_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OP_DOT);
    r = r && QualifiedIdentifierList_1_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // Identifier | TemplateInstance
  private static boolean QualifiedIdentifierList_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "QualifiedIdentifierList_1_0_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Identifier(b, l + 1);
    if (!r) r = TemplateInstance(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // 'AL' 'AH' 'AX' 'EAX'
  //     | 'BL' 'BH' 'BX' 'EBX'
  //     | 'CL' 'CH' 'CX' 'ECX'
  //     | 'DL' 'DH' 'DX' 'EDX'
  //     | 'BP' 'EBP'
  //     | 'SP' 'ESP'
  //     | 'DI' 'EDI'
  //     | 'SI' 'ESI'
  //     | 'ES' 'CS SS DS GS FS'
  //     | 'CR0' 'CR2' 'CR3' 'CR4'
  //     | 'DR0' 'DR1' 'DR2' 'DR3' 'DR6' 'DR7'
  //     | 'TR3' 'TR4' 'TR5' 'TR6' 'TR7'
  //     | 'ST'
  //     | 'ST(0)' 'ST(1)' 'ST(2)' 'ST(3)' 'ST(4)' 'ST(5)' 'ST(6)' 'ST(7)'
  //     | 'MM0'  'MM1'  'MM2'  'MM3'  'MM4'  'MM5'  'MM6'  'MM7'
  //     | 'XMM0' 'XMM1' 'XMM2' 'XMM3' 'XMM4' 'XMM5' 'XMM6' 'XMM7'
  //     | 'AL' | 'AH' | 'AX' | 'EAX'
  //     | 'BL' | 'BH' | 'BX' | 'EBX'
  //     | 'CL' | 'CH' | 'CX' | 'ECX'
  //     | 'DL' | 'DH' | 'DX' | 'EDX'
  //     | 'BP' | 'EBP'
  //     | 'SP' | 'ESP'
  //     | 'DI' | 'EDI'
  //     | 'SI' | 'ESI'
  //     | 'ES' | 'CS SS DS GS FS'
  //     | 'CR0' | 'CR2' | 'CR3' | 'CR4'
  //     | 'DR0' | 'DR1' | 'DR2' | 'DR3' | 'DR6' | 'DR7'
  //     | 'TR3' | 'TR4' | 'TR5' | 'TR6' | 'TR7'
  //     | 'ST(0)' | 'ST(1)' | 'ST(2)' | 'ST(3)' | 'ST(4)' | 'ST(5)' | 'ST(6)' | 'ST(7)'
  //     | 'MM0' | 'MM1' | 'MM2' | 'MM3' | 'MM4' | 'MM5' | 'MM6' | 'MM7'
  //     | 'XMM0' | 'XMM1' | 'XMM2' | 'XMM3' | 'XMM4' | 'XMM5' | 'XMM6' | 'XMM7'
  public static boolean Register(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Register")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, REGISTER, "<register>");
    r = Register_0(b, l + 1);
    if (!r) r = Register_1(b, l + 1);
    if (!r) r = Register_2(b, l + 1);
    if (!r) r = Register_3(b, l + 1);
    if (!r) r = Register_4(b, l + 1);
    if (!r) r = Register_5(b, l + 1);
    if (!r) r = Register_6(b, l + 1);
    if (!r) r = Register_7(b, l + 1);
    if (!r) r = Register_8(b, l + 1);
    if (!r) r = Register_9(b, l + 1);
    if (!r) r = Register_10(b, l + 1);
    if (!r) r = Register_11(b, l + 1);
    if (!r) r = consumeToken(b, "ST");
    if (!r) r = Register_13(b, l + 1);
    if (!r) r = Register_14(b, l + 1);
    if (!r) r = Register_15(b, l + 1);
    if (!r) r = consumeToken(b, "AL");
    if (!r) r = consumeToken(b, "AH");
    if (!r) r = consumeToken(b, "AX");
    if (!r) r = consumeToken(b, "EAX");
    if (!r) r = consumeToken(b, "BL");
    if (!r) r = consumeToken(b, "BH");
    if (!r) r = consumeToken(b, "BX");
    if (!r) r = consumeToken(b, "EBX");
    if (!r) r = consumeToken(b, "CL");
    if (!r) r = consumeToken(b, "CH");
    if (!r) r = consumeToken(b, "CX");
    if (!r) r = consumeToken(b, "ECX");
    if (!r) r = consumeToken(b, "DL");
    if (!r) r = consumeToken(b, "DH");
    if (!r) r = consumeToken(b, "DX");
    if (!r) r = consumeToken(b, "EDX");
    if (!r) r = consumeToken(b, "BP");
    if (!r) r = consumeToken(b, "EBP");
    if (!r) r = consumeToken(b, "SP");
    if (!r) r = consumeToken(b, "ESP");
    if (!r) r = consumeToken(b, "DI");
    if (!r) r = consumeToken(b, "EDI");
    if (!r) r = consumeToken(b, "SI");
    if (!r) r = consumeToken(b, "ESI");
    if (!r) r = consumeToken(b, "ES");
    if (!r) r = consumeToken(b, "CS SS DS GS FS");
    if (!r) r = consumeToken(b, "CR0");
    if (!r) r = consumeToken(b, "CR2");
    if (!r) r = consumeToken(b, "CR3");
    if (!r) r = consumeToken(b, "CR4");
    if (!r) r = consumeToken(b, "DR0");
    if (!r) r = consumeToken(b, "DR1");
    if (!r) r = consumeToken(b, "DR2");
    if (!r) r = consumeToken(b, "DR3");
    if (!r) r = consumeToken(b, "DR6");
    if (!r) r = consumeToken(b, "DR7");
    if (!r) r = consumeToken(b, "TR3");
    if (!r) r = consumeToken(b, "TR4");
    if (!r) r = consumeToken(b, "TR5");
    if (!r) r = consumeToken(b, "TR6");
    if (!r) r = consumeToken(b, "TR7");
    if (!r) r = consumeToken(b, "ST(0)");
    if (!r) r = consumeToken(b, "ST(1)");
    if (!r) r = consumeToken(b, "ST(2)");
    if (!r) r = consumeToken(b, "ST(3)");
    if (!r) r = consumeToken(b, "ST(4)");
    if (!r) r = consumeToken(b, "ST(5)");
    if (!r) r = consumeToken(b, "ST(6)");
    if (!r) r = consumeToken(b, "ST(7)");
    if (!r) r = consumeToken(b, "MM0");
    if (!r) r = consumeToken(b, "MM1");
    if (!r) r = consumeToken(b, "MM2");
    if (!r) r = consumeToken(b, "MM3");
    if (!r) r = consumeToken(b, "MM4");
    if (!r) r = consumeToken(b, "MM5");
    if (!r) r = consumeToken(b, "MM6");
    if (!r) r = consumeToken(b, "MM7");
    if (!r) r = consumeToken(b, "XMM0");
    if (!r) r = consumeToken(b, "XMM1");
    if (!r) r = consumeToken(b, "XMM2");
    if (!r) r = consumeToken(b, "XMM3");
    if (!r) r = consumeToken(b, "XMM4");
    if (!r) r = consumeToken(b, "XMM5");
    if (!r) r = consumeToken(b, "XMM6");
    if (!r) r = consumeToken(b, "XMM7");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // 'AL' 'AH' 'AX' 'EAX'
  private static boolean Register_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Register_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "AL");
    r = r && consumeToken(b, "AH");
    r = r && consumeToken(b, "AX");
    r = r && consumeToken(b, "EAX");
    exit_section_(b, m, null, r);
    return r;
  }

  // 'BL' 'BH' 'BX' 'EBX'
  private static boolean Register_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Register_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "BL");
    r = r && consumeToken(b, "BH");
    r = r && consumeToken(b, "BX");
    r = r && consumeToken(b, "EBX");
    exit_section_(b, m, null, r);
    return r;
  }

  // 'CL' 'CH' 'CX' 'ECX'
  private static boolean Register_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Register_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "CL");
    r = r && consumeToken(b, "CH");
    r = r && consumeToken(b, "CX");
    r = r && consumeToken(b, "ECX");
    exit_section_(b, m, null, r);
    return r;
  }

  // 'DL' 'DH' 'DX' 'EDX'
  private static boolean Register_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Register_3")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "DL");
    r = r && consumeToken(b, "DH");
    r = r && consumeToken(b, "DX");
    r = r && consumeToken(b, "EDX");
    exit_section_(b, m, null, r);
    return r;
  }

  // 'BP' 'EBP'
  private static boolean Register_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Register_4")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "BP");
    r = r && consumeToken(b, "EBP");
    exit_section_(b, m, null, r);
    return r;
  }

  // 'SP' 'ESP'
  private static boolean Register_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Register_5")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "SP");
    r = r && consumeToken(b, "ESP");
    exit_section_(b, m, null, r);
    return r;
  }

  // 'DI' 'EDI'
  private static boolean Register_6(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Register_6")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "DI");
    r = r && consumeToken(b, "EDI");
    exit_section_(b, m, null, r);
    return r;
  }

  // 'SI' 'ESI'
  private static boolean Register_7(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Register_7")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "SI");
    r = r && consumeToken(b, "ESI");
    exit_section_(b, m, null, r);
    return r;
  }

  // 'ES' 'CS SS DS GS FS'
  private static boolean Register_8(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Register_8")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "ES");
    r = r && consumeToken(b, "CS SS DS GS FS");
    exit_section_(b, m, null, r);
    return r;
  }

  // 'CR0' 'CR2' 'CR3' 'CR4'
  private static boolean Register_9(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Register_9")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "CR0");
    r = r && consumeToken(b, "CR2");
    r = r && consumeToken(b, "CR3");
    r = r && consumeToken(b, "CR4");
    exit_section_(b, m, null, r);
    return r;
  }

  // 'DR0' 'DR1' 'DR2' 'DR3' 'DR6' 'DR7'
  private static boolean Register_10(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Register_10")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "DR0");
    r = r && consumeToken(b, "DR1");
    r = r && consumeToken(b, "DR2");
    r = r && consumeToken(b, "DR3");
    r = r && consumeToken(b, "DR6");
    r = r && consumeToken(b, "DR7");
    exit_section_(b, m, null, r);
    return r;
  }

  // 'TR3' 'TR4' 'TR5' 'TR6' 'TR7'
  private static boolean Register_11(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Register_11")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "TR3");
    r = r && consumeToken(b, "TR4");
    r = r && consumeToken(b, "TR5");
    r = r && consumeToken(b, "TR6");
    r = r && consumeToken(b, "TR7");
    exit_section_(b, m, null, r);
    return r;
  }

  // 'ST(0)' 'ST(1)' 'ST(2)' 'ST(3)' 'ST(4)' 'ST(5)' 'ST(6)' 'ST(7)'
  private static boolean Register_13(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Register_13")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "ST(0)");
    r = r && consumeToken(b, "ST(1)");
    r = r && consumeToken(b, "ST(2)");
    r = r && consumeToken(b, "ST(3)");
    r = r && consumeToken(b, "ST(4)");
    r = r && consumeToken(b, "ST(5)");
    r = r && consumeToken(b, "ST(6)");
    r = r && consumeToken(b, "ST(7)");
    exit_section_(b, m, null, r);
    return r;
  }

  // 'MM0'  'MM1'  'MM2'  'MM3'  'MM4'  'MM5'  'MM6'  'MM7'
  private static boolean Register_14(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Register_14")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "MM0");
    r = r && consumeToken(b, "MM1");
    r = r && consumeToken(b, "MM2");
    r = r && consumeToken(b, "MM3");
    r = r && consumeToken(b, "MM4");
    r = r && consumeToken(b, "MM5");
    r = r && consumeToken(b, "MM6");
    r = r && consumeToken(b, "MM7");
    exit_section_(b, m, null, r);
    return r;
  }

  // 'XMM0' 'XMM1' 'XMM2' 'XMM3' 'XMM4' 'XMM5' 'XMM6' 'XMM7'
  private static boolean Register_15(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Register_15")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "XMM0");
    r = r && consumeToken(b, "XMM1");
    r = r && consumeToken(b, "XMM2");
    r = r && consumeToken(b, "XMM3");
    r = r && consumeToken(b, "XMM4");
    r = r && consumeToken(b, "XMM5");
    r = r && consumeToken(b, "XMM6");
    r = r && consumeToken(b, "XMM7");
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // 'RAX'  'RBX'  'RCX'  'RDX'
  //     | 'BPL'  'RBP'
  //     | 'SPL'  'RSP'
  //     | 'DIL'  'RDI'
  //     | 'SIL'  'RSI'
  //     | 'R8B'  'R8W'  'R8D'  'R8'
  //     | 'R9B'  'R9W'  'R9D'  'R9'
  //     | 'R10B' 'R10W' 'R10D' 'R10'
  //     | 'R11B' 'R11W' 'R11D' 'R11'
  //     | 'R12B' 'R12W' 'R12D' 'R12'
  //     | 'R13B' 'R13W' 'R13D' 'R13'
  //     | 'R14B' 'R14W' 'R14D' 'R14'
  //     | 'R15B' 'R15W' 'R15D' 'R15'
  //     | 'XMM8' 'XMM9' 'XMM10' 'XMM11' 'XMM12' 'XMM13' 'XMM14' 'XMM15'
  //     | 'YMM0' 'YMM1' 'YMM2' 'YMM3' 'YMM4' 'YMM5' 'YMM6' 'YMM7'
  //     | 'YMM8' 'YMM9' 'YMM10' 'YMM11' 'YMM12' 'YMM13' 'YMM14' 'YMM15'
  public static boolean Register64(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Register64")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, REGISTER_64, "<register 64>");
    r = Register64_0(b, l + 1);
    if (!r) r = Register64_1(b, l + 1);
    if (!r) r = Register64_2(b, l + 1);
    if (!r) r = Register64_3(b, l + 1);
    if (!r) r = Register64_4(b, l + 1);
    if (!r) r = Register64_5(b, l + 1);
    if (!r) r = Register64_6(b, l + 1);
    if (!r) r = Register64_7(b, l + 1);
    if (!r) r = Register64_8(b, l + 1);
    if (!r) r = Register64_9(b, l + 1);
    if (!r) r = Register64_10(b, l + 1);
    if (!r) r = Register64_11(b, l + 1);
    if (!r) r = Register64_12(b, l + 1);
    if (!r) r = Register64_13(b, l + 1);
    if (!r) r = Register64_14(b, l + 1);
    if (!r) r = Register64_15(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // 'RAX'  'RBX'  'RCX'  'RDX'
  private static boolean Register64_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Register64_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "RAX");
    r = r && consumeToken(b, "RBX");
    r = r && consumeToken(b, "RCX");
    r = r && consumeToken(b, "RDX");
    exit_section_(b, m, null, r);
    return r;
  }

  // 'BPL'  'RBP'
  private static boolean Register64_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Register64_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "BPL");
    r = r && consumeToken(b, "RBP");
    exit_section_(b, m, null, r);
    return r;
  }

  // 'SPL'  'RSP'
  private static boolean Register64_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Register64_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "SPL");
    r = r && consumeToken(b, "RSP");
    exit_section_(b, m, null, r);
    return r;
  }

  // 'DIL'  'RDI'
  private static boolean Register64_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Register64_3")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "DIL");
    r = r && consumeToken(b, "RDI");
    exit_section_(b, m, null, r);
    return r;
  }

  // 'SIL'  'RSI'
  private static boolean Register64_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Register64_4")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "SIL");
    r = r && consumeToken(b, "RSI");
    exit_section_(b, m, null, r);
    return r;
  }

  // 'R8B'  'R8W'  'R8D'  'R8'
  private static boolean Register64_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Register64_5")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "R8B");
    r = r && consumeToken(b, "R8W");
    r = r && consumeToken(b, "R8D");
    r = r && consumeToken(b, "R8");
    exit_section_(b, m, null, r);
    return r;
  }

  // 'R9B'  'R9W'  'R9D'  'R9'
  private static boolean Register64_6(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Register64_6")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "R9B");
    r = r && consumeToken(b, "R9W");
    r = r && consumeToken(b, "R9D");
    r = r && consumeToken(b, "R9");
    exit_section_(b, m, null, r);
    return r;
  }

  // 'R10B' 'R10W' 'R10D' 'R10'
  private static boolean Register64_7(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Register64_7")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "R10B");
    r = r && consumeToken(b, "R10W");
    r = r && consumeToken(b, "R10D");
    r = r && consumeToken(b, "R10");
    exit_section_(b, m, null, r);
    return r;
  }

  // 'R11B' 'R11W' 'R11D' 'R11'
  private static boolean Register64_8(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Register64_8")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "R11B");
    r = r && consumeToken(b, "R11W");
    r = r && consumeToken(b, "R11D");
    r = r && consumeToken(b, "R11");
    exit_section_(b, m, null, r);
    return r;
  }

  // 'R12B' 'R12W' 'R12D' 'R12'
  private static boolean Register64_9(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Register64_9")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "R12B");
    r = r && consumeToken(b, "R12W");
    r = r && consumeToken(b, "R12D");
    r = r && consumeToken(b, "R12");
    exit_section_(b, m, null, r);
    return r;
  }

  // 'R13B' 'R13W' 'R13D' 'R13'
  private static boolean Register64_10(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Register64_10")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "R13B");
    r = r && consumeToken(b, "R13W");
    r = r && consumeToken(b, "R13D");
    r = r && consumeToken(b, "R13");
    exit_section_(b, m, null, r);
    return r;
  }

  // 'R14B' 'R14W' 'R14D' 'R14'
  private static boolean Register64_11(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Register64_11")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "R14B");
    r = r && consumeToken(b, "R14W");
    r = r && consumeToken(b, "R14D");
    r = r && consumeToken(b, "R14");
    exit_section_(b, m, null, r);
    return r;
  }

  // 'R15B' 'R15W' 'R15D' 'R15'
  private static boolean Register64_12(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Register64_12")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "R15B");
    r = r && consumeToken(b, "R15W");
    r = r && consumeToken(b, "R15D");
    r = r && consumeToken(b, "R15");
    exit_section_(b, m, null, r);
    return r;
  }

  // 'XMM8' 'XMM9' 'XMM10' 'XMM11' 'XMM12' 'XMM13' 'XMM14' 'XMM15'
  private static boolean Register64_13(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Register64_13")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "XMM8");
    r = r && consumeToken(b, "XMM9");
    r = r && consumeToken(b, "XMM10");
    r = r && consumeToken(b, "XMM11");
    r = r && consumeToken(b, "XMM12");
    r = r && consumeToken(b, "XMM13");
    r = r && consumeToken(b, "XMM14");
    r = r && consumeToken(b, "XMM15");
    exit_section_(b, m, null, r);
    return r;
  }

  // 'YMM0' 'YMM1' 'YMM2' 'YMM3' 'YMM4' 'YMM5' 'YMM6' 'YMM7'
  private static boolean Register64_14(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Register64_14")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "YMM0");
    r = r && consumeToken(b, "YMM1");
    r = r && consumeToken(b, "YMM2");
    r = r && consumeToken(b, "YMM3");
    r = r && consumeToken(b, "YMM4");
    r = r && consumeToken(b, "YMM5");
    r = r && consumeToken(b, "YMM6");
    r = r && consumeToken(b, "YMM7");
    exit_section_(b, m, null, r);
    return r;
  }

  // 'YMM8' 'YMM9' 'YMM10' 'YMM11' 'YMM12' 'YMM13' 'YMM14' 'YMM15'
  private static boolean Register64_15(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Register64_15")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "YMM8");
    r = r && consumeToken(b, "YMM9");
    r = r && consumeToken(b, "YMM10");
    r = r && consumeToken(b, "YMM11");
    r = r && consumeToken(b, "YMM12");
    r = r && consumeToken(b, "YMM13");
    r = r && consumeToken(b, "YMM14");
    r = r && consumeToken(b, "YMM15");
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // 'import' ImportList ';'
  static boolean RegularImport(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RegularImport")) return false;
    if (!nextTokenIs(b, KW_IMPORT)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_);
    r = consumeToken(b, KW_IMPORT);
    p = r; // pin = 1
    r = r && report_error_(b, ImportList(b, l + 1));
    r = p && consumeToken(b, OP_SCOLON) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // ('<' | '<=' | '>' | '>=' | '!<>=' | '!<>' | '<>' | '<>=' | '!>' | '!>=' | '!<' | '!<=') ShiftExpression
  public static boolean RelExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RelExpression")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, REL_EXPRESSION, "<rel expression>");
    r = RelExpression_0(b, l + 1);
    p = r; // pin = 1
    r = r && ShiftExpression(b, l + 1);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // '<' | '<=' | '>' | '>=' | '!<>=' | '!<>' | '<>' | '<>=' | '!>' | '!>=' | '!<' | '!<='
  private static boolean RelExpression_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RelExpression_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OP_LESS);
    if (!r) r = consumeToken(b, OP_LESS_EQ);
    if (!r) r = consumeToken(b, OP_GT);
    if (!r) r = consumeToken(b, OP_GT_EQ);
    if (!r) r = consumeToken(b, OP_UNORD);
    if (!r) r = consumeToken(b, OP_UNORD_EQ);
    if (!r) r = consumeToken(b, OP_LESS_GR);
    if (!r) r = consumeToken(b, OP_LESS_GR_EQ);
    if (!r) r = consumeToken(b, OP_NOT_GR);
    if (!r) r = consumeToken(b, OP_NOT_GR_EQ);
    if (!r) r = consumeToken(b, OP_NOT_LESS);
    if (!r) r = consumeToken(b, OP_NOT_LESS_EQ);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // 'return' Expression? ';'
  public static boolean ReturnStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ReturnStatement")) return false;
    if (!nextTokenIs(b, KW_RETURN)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, RETURN_STATEMENT, null);
    r = consumeToken(b, KW_RETURN);
    p = r; // pin = 1
    r = r && report_error_(b, ReturnStatement_1(b, l + 1));
    r = p && consumeToken(b, OP_SCOLON) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // Expression?
  private static boolean ReturnStatement_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ReturnStatement_1")) return false;
    Expression(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // '(' 'exit' ')' Statement
  static boolean ScopeExit(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ScopeExit")) return false;
    if (!nextTokenIs(b, OP_PAR_LEFT)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_);
    r = consumeToken(b, OP_PAR_LEFT);
    r = r && consumeToken(b, "exit");
    p = r; // pin = 2
    r = r && report_error_(b, consumeToken(b, OP_PAR_RIGHT));
    r = p && Statement(b, l + 1) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // '(' 'success' ')' Statement
  static boolean ScopeFailure(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ScopeFailure")) return false;
    if (!nextTokenIs(b, OP_PAR_LEFT)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_);
    r = consumeToken(b, OP_PAR_LEFT);
    r = r && consumeToken(b, "success");
    p = r; // pin = 2
    r = r && report_error_(b, consumeToken(b, OP_PAR_RIGHT));
    r = p && Statement(b, l + 1) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // 'scope' (ScopeExit|ScopeFailure|ScopeSuccess)
  public static boolean ScopeGuardStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ScopeGuardStatement")) return false;
    if (!nextTokenIs(b, KW_SCOPE)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, SCOPE_GUARD_STATEMENT, null);
    r = consumeToken(b, KW_SCOPE);
    p = r; // pin = 1
    r = r && ScopeGuardStatement_1(b, l + 1);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // ScopeExit|ScopeFailure|ScopeSuccess
  private static boolean ScopeGuardStatement_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ScopeGuardStatement_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ScopeExit(b, l + 1);
    if (!r) r = ScopeFailure(b, l + 1);
    if (!r) r = ScopeSuccess(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // NonEmptyStatement
  //     | BlockStatement
  public static boolean ScopeStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ScopeStatement")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, SCOPE_STATEMENT, "<scope statement>");
    r = NonEmptyStatement(b, l + 1);
    if (!r) r = BlockStatement(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // StatementListNoCaseNoDefault
  public static boolean ScopeStatementList(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ScopeStatementList")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, SCOPE_STATEMENT_LIST, "<scope statement list>");
    r = StatementListNoCaseNoDefault(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // '(' 'failure' ')' Statement
  static boolean ScopeSuccess(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ScopeSuccess")) return false;
    if (!nextTokenIs(b, OP_PAR_LEFT)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_);
    r = consumeToken(b, OP_PAR_LEFT);
    r = r && consumeToken(b, "failure");
    p = r; // pin = 2
    r = r && report_error_(b, consumeToken(b, OP_PAR_RIGHT));
    r = p && Statement(b, l + 1) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // 'shared' 'static' 'this' '(' ')' ';'
  //     | 'shared' 'static' 'this' '(' ')' FunctionBody
  public static boolean SharedStaticConstructor(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SharedStaticConstructor")) return false;
    if (!nextTokenIs(b, KW_SHARED)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = parseTokens(b, 5, KW_SHARED, KW_STATIC, KW_THIS, OP_PAR_LEFT, OP_PAR_RIGHT, OP_SCOLON);
    if (!r) r = SharedStaticConstructor_1(b, l + 1);
    exit_section_(b, m, SHARED_STATIC_CONSTRUCTOR, r);
    return r;
  }

  // 'shared' 'static' 'this' '(' ')' FunctionBody
  private static boolean SharedStaticConstructor_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SharedStaticConstructor_1")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_);
    r = consumeTokens(b, 5, KW_SHARED, KW_STATIC, KW_THIS, OP_PAR_LEFT, OP_PAR_RIGHT);
    p = r; // pin = 5
    r = r && FunctionBody(b, l + 1);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // 'shared' 'static' '~' 'this' '(' ')' MemberFunctionAttributes? ';'
  //     | 'shared' 'static' '~' 'this' '(' ')' MemberFunctionAttributes? FunctionBody
  public static boolean SharedStaticDestructor(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SharedStaticDestructor")) return false;
    if (!nextTokenIs(b, KW_SHARED)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = SharedStaticDestructor_0(b, l + 1);
    if (!r) r = SharedStaticDestructor_1(b, l + 1);
    exit_section_(b, m, SHARED_STATIC_DESTRUCTOR, r);
    return r;
  }

  // 'shared' 'static' '~' 'this' '(' ')' MemberFunctionAttributes? ';'
  private static boolean SharedStaticDestructor_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SharedStaticDestructor_0")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_);
    r = consumeTokens(b, 6, KW_SHARED, KW_STATIC, OP_TILDA, KW_THIS, OP_PAR_LEFT, OP_PAR_RIGHT);
    p = r; // pin = 6
    r = r && report_error_(b, SharedStaticDestructor_0_6(b, l + 1));
    r = p && consumeToken(b, OP_SCOLON) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // MemberFunctionAttributes?
  private static boolean SharedStaticDestructor_0_6(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SharedStaticDestructor_0_6")) return false;
    MemberFunctionAttributes(b, l + 1);
    return true;
  }

  // 'shared' 'static' '~' 'this' '(' ')' MemberFunctionAttributes? FunctionBody
  private static boolean SharedStaticDestructor_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SharedStaticDestructor_1")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_);
    r = consumeTokens(b, 6, KW_SHARED, KW_STATIC, OP_TILDA, KW_THIS, OP_PAR_LEFT, OP_PAR_RIGHT);
    p = r; // pin = 6
    r = r && report_error_(b, SharedStaticDestructor_1_6(b, l + 1));
    r = p && FunctionBody(b, l + 1) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // MemberFunctionAttributes?
  private static boolean SharedStaticDestructor_1_6(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SharedStaticDestructor_1_6")) return false;
    MemberFunctionAttributes(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // AddExpression [ShiftExpression_]
  static boolean ShiftExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ShiftExpression")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = AddExpression(b, l + 1);
    r = r && ShiftExpression_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [ShiftExpression_]
  private static boolean ShiftExpression_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ShiftExpression_1")) return false;
    ShiftExpression_(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // ('<<' | '>>' | '>>>') ShiftExpression
  public static boolean ShiftExpression_(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ShiftExpression_")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _COLLAPSE_, SHIFT_EXPRESSION_, "<shift expression>");
    r = ShiftExpression__0(b, l + 1);
    r = r && ShiftExpression(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // '<<' | '>>' | '>>>'
  private static boolean ShiftExpression__0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ShiftExpression__0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OP_SH_LEFT);
    if (!r) r = consumeToken(b, OP_SH_RIGHT);
    if (!r) r = consumeToken(b, OP_USH_RIGHT);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // '[' ']' [PostfixExpression]
  //     |  '[' MultipleAssign ']' [PostfixExpression]
  public static boolean SliceExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SliceExpression")) return false;
    if (!nextTokenIs(b, OP_BRACKET_LEFT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = SliceExpression_0(b, l + 1);
    if (!r) r = SliceExpression_1(b, l + 1);
    exit_section_(b, m, SLICE_EXPRESSION, r);
    return r;
  }

  // '[' ']' [PostfixExpression]
  private static boolean SliceExpression_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SliceExpression_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, OP_BRACKET_LEFT, OP_BRACKET_RIGHT);
    r = r && SliceExpression_0_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [PostfixExpression]
  private static boolean SliceExpression_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SliceExpression_0_2")) return false;
    PostfixExpression(b, l + 1);
    return true;
  }

  // '[' MultipleAssign ']' [PostfixExpression]
  private static boolean SliceExpression_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SliceExpression_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OP_BRACKET_LEFT);
    r = r && MultipleAssign(b, l + 1);
    r = r && consumeToken(b, OP_BRACKET_RIGHT);
    r = r && SliceExpression_1_3(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [PostfixExpression]
  private static boolean SliceExpression_1_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SliceExpression_1_3")) return false;
    PostfixExpression(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // '__FILE__'
  //     | '__MODULE__'
  //     | '__LINE__'
  //     | '__FUNCTION__'
  //     | '__PRETTY_FUNCTION__'
  public static boolean SpecialKeyword(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SpecialKeyword")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, SPECIAL_KEYWORD, "<special keyword>");
    r = consumeToken(b, KW___FILE__);
    if (!r) r = consumeToken(b, KW___MODULE__);
    if (!r) r = consumeToken(b, KW___LINE__);
    if (!r) r = consumeToken(b, KW___FUNCTION__);
    if (!r) r = consumeToken(b, KW___PRETTY_FUNCTION__);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // ';'
  //     | NonEmptyStatement
  //     | BlockStatement
  public static boolean Statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Statement")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, STATEMENT, "<statement>");
    r = consumeToken(b, OP_SCOLON);
    if (!r) r = NonEmptyStatement(b, l + 1);
    if (!r) r = BlockStatement(b, l + 1);
    exit_section_(b, l, m, r, false, statement_recover_parser_);
    return r;
  }

  /* ********************************************************** */
  // Statement Statement*{
  //         //recoverWhile= statement_list_recover
  //     }
  public static boolean StatementList(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "StatementList")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, STATEMENT_LIST, "<statement list>");
    r = Statement(b, l + 1);
    r = r && StatementList_1(b, l + 1);
    r = r && StatementList_2(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // Statement*
  private static boolean StatementList_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "StatementList_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!Statement(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "StatementList_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // {
  //         //recoverWhile= statement_list_recover
  //     }
  private static boolean StatementList_2(PsiBuilder b, int l) {
    return true;
  }

  /* ********************************************************** */
  // StatementNoCaseNoDefault StatementNoCaseNoDefault*
  public static boolean StatementListNoCaseNoDefault(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "StatementListNoCaseNoDefault")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, STATEMENT_LIST_NO_CASE_NO_DEFAULT, "<statement list no case no default>");
    r = StatementNoCaseNoDefault(b, l + 1);
    r = r && StatementListNoCaseNoDefault_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // StatementNoCaseNoDefault*
  private static boolean StatementListNoCaseNoDefault_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "StatementListNoCaseNoDefault_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!StatementNoCaseNoDefault(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "StatementListNoCaseNoDefault_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  /* ********************************************************** */
  // NonEmptyStatementNoCaseNoDefault
  //     | BlockStatement
  public static boolean StatementNoCaseNoDefault(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "StatementNoCaseNoDefault")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, STATEMENT_NO_CASE_NO_DEFAULT, "<statement no case no default>");
    r = NonEmptyStatementNoCaseNoDefault(b, l + 1);
    if (!r) r = BlockStatement(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // 'static' 'assert' '(' AssignExpression (',' AssignExpression)? ')' ';'
  public static boolean StaticAssert(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "StaticAssert")) return false;
    if (!nextTokenIs(b, KW_STATIC)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, STATIC_ASSERT, null);
    r = consumeTokens(b, 3, KW_STATIC, KW_ASSERT, OP_PAR_LEFT);
    p = r; // pin = 3
    r = r && report_error_(b, AssignExpression(b, l + 1));
    r = p && report_error_(b, StaticAssert_4(b, l + 1)) && r;
    r = p && report_error_(b, consumeTokens(b, -1, OP_PAR_RIGHT, OP_SCOLON)) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // (',' AssignExpression)?
  private static boolean StaticAssert_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "StaticAssert_4")) return false;
    StaticAssert_4_0(b, l + 1);
    return true;
  }

  // ',' AssignExpression
  private static boolean StaticAssert_4_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "StaticAssert_4_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OP_COMMA);
    r = r && AssignExpression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // 'static' 'this' '(' ')' ';'
  //     | 'static' 'this' '(' ')' FunctionBody
  public static boolean StaticConstructor(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "StaticConstructor")) return false;
    if (!nextTokenIs(b, KW_STATIC)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = parseTokens(b, 4, KW_STATIC, KW_THIS, OP_PAR_LEFT, OP_PAR_RIGHT, OP_SCOLON);
    if (!r) r = StaticConstructor_1(b, l + 1);
    exit_section_(b, m, STATIC_CONSTRUCTOR, r);
    return r;
  }

  // 'static' 'this' '(' ')' FunctionBody
  private static boolean StaticConstructor_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "StaticConstructor_1")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_);
    r = consumeTokens(b, 4, KW_STATIC, KW_THIS, OP_PAR_LEFT, OP_PAR_RIGHT);
    p = r; // pin = 4
    r = r && FunctionBody(b, l + 1);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // 'static' '~' 'this' '(' ')' MemberFunctionAttributes? ';'
  //     | 'static' '~' 'this' '(' ')' MemberFunctionAttributes? FunctionBody
  public static boolean StaticDestructor(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "StaticDestructor")) return false;
    if (!nextTokenIs(b, KW_STATIC)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = StaticDestructor_0(b, l + 1);
    if (!r) r = StaticDestructor_1(b, l + 1);
    exit_section_(b, m, STATIC_DESTRUCTOR, r);
    return r;
  }

  // 'static' '~' 'this' '(' ')' MemberFunctionAttributes? ';'
  private static boolean StaticDestructor_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "StaticDestructor_0")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_);
    r = consumeTokens(b, 5, KW_STATIC, OP_TILDA, KW_THIS, OP_PAR_LEFT, OP_PAR_RIGHT);
    p = r; // pin = 5
    r = r && report_error_(b, StaticDestructor_0_5(b, l + 1));
    r = p && consumeToken(b, OP_SCOLON) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // MemberFunctionAttributes?
  private static boolean StaticDestructor_0_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "StaticDestructor_0_5")) return false;
    MemberFunctionAttributes(b, l + 1);
    return true;
  }

  // 'static' '~' 'this' '(' ')' MemberFunctionAttributes? FunctionBody
  private static boolean StaticDestructor_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "StaticDestructor_1")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_);
    r = consumeTokens(b, 5, KW_STATIC, OP_TILDA, KW_THIS, OP_PAR_LEFT, OP_PAR_RIGHT);
    p = r; // pin = 5
    r = r && report_error_(b, StaticDestructor_1_5(b, l + 1));
    r = p && FunctionBody(b, l + 1) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // MemberFunctionAttributes?
  private static boolean StaticDestructor_1_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "StaticDestructor_1_5")) return false;
    MemberFunctionAttributes(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // 'else' DeclarationBlock
  public static boolean StaticElseCondition(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "StaticElseCondition")) return false;
    if (!nextTokenIs(b, KW_ELSE)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, STATIC_ELSE_CONDITION, null);
    r = consumeToken(b, KW_ELSE);
    p = r; // pin = 1
    r = r && DeclarationBlock(b, l + 1);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // 'static' 'if' '(' AssignExpression ')'
  public static boolean StaticIfCondition(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "StaticIfCondition")) return false;
    if (!nextTokenIs(b, KW_STATIC)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, STATIC_IF_CONDITION, null);
    r = consumeTokens(b, 3, KW_STATIC, KW_IF, OP_PAR_LEFT);
    p = r; // pin = 3
    r = r && report_error_(b, AssignExpression(b, l + 1));
    r = p && consumeToken(b, OP_PAR_RIGHT) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // 'static' 'import' ImportList ';'
  static boolean StaticImport(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "StaticImport")) return false;
    if (!nextTokenIs(b, KW_STATIC)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_);
    r = consumeTokens(b, 2, KW_STATIC, KW_IMPORT);
    p = r; // pin = 2
    r = r && report_error_(b, ImportList(b, l + 1));
    r = p && consumeToken(b, OP_SCOLON) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // LinkageAttribute
  //     | AlignAttribute
  //     | 'deprecated'
  //     | 'enum'
  //     | 'static'
  //     | 'extern'
  //     | 'abstract'
  //     | 'final'
  //     | 'override'
  //     | 'synchronized'
  //     | 'auto'
  //     | 'scope'
  //     | 'const'
  //     | 'immutable'
  //     | 'inout'
  //     | 'shared'
  //     | '__gshared'
  //     | Property
  //     | 'nothrow'
  //     | 'pure'
  //     | 'ref'
  public static boolean StorageClass(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "StorageClass")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, STORAGE_CLASS, "<storage class>");
    r = LinkageAttribute(b, l + 1);
    if (!r) r = AlignAttribute(b, l + 1);
    if (!r) r = consumeToken(b, KW_DEPRECATED);
    if (!r) r = consumeToken(b, KW_ENUM);
    if (!r) r = consumeToken(b, KW_STATIC);
    if (!r) r = consumeToken(b, KW_EXTERN);
    if (!r) r = consumeToken(b, KW_ABSTRACT);
    if (!r) r = consumeToken(b, KW_FINAL);
    if (!r) r = consumeToken(b, KW_OVERRIDE);
    if (!r) r = consumeToken(b, KW_SYNCHRONIZED);
    if (!r) r = consumeToken(b, KW_AUTO);
    if (!r) r = consumeToken(b, KW_SCOPE);
    if (!r) r = consumeToken(b, KW_CONST);
    if (!r) r = consumeToken(b, KW_IMMUTABLE);
    if (!r) r = consumeToken(b, KW_INOUT);
    if (!r) r = consumeToken(b, KW_SHARED);
    if (!r) r = consumeToken(b, KW___GSHARED);
    if (!r) r = Property(b, l + 1);
    if (!r) r = consumeToken(b, KW_NOTHROW);
    if (!r) r = consumeToken(b, KW_PURE);
    if (!r) r = consumeToken(b, KW_REF);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // StorageClass StorageClass*
  public static boolean StorageClasses(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "StorageClasses")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, STORAGE_CLASSES, "<storage classes>");
    r = StorageClass(b, l + 1);
    r = r && StorageClasses_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // StorageClass*
  private static boolean StorageClasses_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "StorageClasses_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!StorageClass(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "StorageClasses_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  /* ********************************************************** */
  // WYSIWYG_STRING|ALTERNATE_WYSIWYG_STRING|DOUBLE_QUOTED_STRING|HEX_STRING|DELIMITED_STRING| (TOKEN_STRING TOKEN_STRING*)
  public static boolean StringLiteral(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "StringLiteral")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, STRING_LITERAL, "<string literal>");
    r = consumeToken(b, WYSIWYG_STRING);
    if (!r) r = consumeToken(b, ALTERNATE_WYSIWYG_STRING);
    if (!r) r = consumeToken(b, DOUBLE_QUOTED_STRING);
    if (!r) r = consumeToken(b, HEX_STRING);
    if (!r) r = consumeToken(b, DELIMITED_STRING);
    if (!r) r = StringLiteral_5(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // TOKEN_STRING TOKEN_STRING*
  private static boolean StringLiteral_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "StringLiteral_5")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, TOKEN_STRING);
    r = r && StringLiteral_5_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // TOKEN_STRING*
  private static boolean StringLiteral_5_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "StringLiteral_5_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, TOKEN_STRING)) break;
      if (!empty_element_parsed_guard_(b, "StringLiteral_5_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  /* ********************************************************** */
  // StringLiteral [StringLiterals]
  public static boolean StringLiterals(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "StringLiterals")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, STRING_LITERALS, "<string literals>");
    r = StringLiteral(b, l + 1);
    r = r && StringLiterals_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // [StringLiterals]
  private static boolean StringLiterals_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "StringLiterals_1")) return false;
    StringLiterals(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // 'struct' Identifier? TemplateParameters? Constraint? (AggregateBody | ';')?
  public static boolean StructDeclaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "StructDeclaration")) return false;
    if (!nextTokenIs(b, KW_STRUCT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, KW_STRUCT);
    r = r && StructDeclaration_1(b, l + 1);
    r = r && StructDeclaration_2(b, l + 1);
    r = r && StructDeclaration_3(b, l + 1);
    r = r && StructDeclaration_4(b, l + 1);
    exit_section_(b, m, STRUCT_DECLARATION, r);
    return r;
  }

  // Identifier?
  private static boolean StructDeclaration_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "StructDeclaration_1")) return false;
    Identifier(b, l + 1);
    return true;
  }

  // TemplateParameters?
  private static boolean StructDeclaration_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "StructDeclaration_2")) return false;
    TemplateParameters(b, l + 1);
    return true;
  }

  // Constraint?
  private static boolean StructDeclaration_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "StructDeclaration_3")) return false;
    Constraint(b, l + 1);
    return true;
  }

  // (AggregateBody | ';')?
  private static boolean StructDeclaration_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "StructDeclaration_4")) return false;
    StructDeclaration_4_0(b, l + 1);
    return true;
  }

  // AggregateBody | ';'
  private static boolean StructDeclaration_4_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "StructDeclaration_4_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = AggregateBody(b, l + 1);
    if (!r) r = consumeToken(b, OP_SCOLON);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // '{' StructMemberInitializers? ','? '}'
  public static boolean StructInitializer(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "StructInitializer")) return false;
    if (!nextTokenIs(b, OP_BRACES_LEFT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OP_BRACES_LEFT);
    r = r && StructInitializer_1(b, l + 1);
    r = r && StructInitializer_2(b, l + 1);
    r = r && consumeToken(b, OP_BRACES_RIGHT);
    exit_section_(b, m, STRUCT_INITIALIZER, r);
    return r;
  }

  // StructMemberInitializers?
  private static boolean StructInitializer_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "StructInitializer_1")) return false;
    StructMemberInitializers(b, l + 1);
    return true;
  }

  // ','?
  private static boolean StructInitializer_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "StructInitializer_2")) return false;
    consumeToken(b, OP_COMMA);
    return true;
  }

  /* ********************************************************** */
  // NonVoidInitializer [':' NonVoidInitializer]
  public static boolean StructMemberInitializer(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "StructMemberInitializer")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, STRUCT_MEMBER_INITIALIZER, "<struct member initializer>");
    r = NonVoidInitializer(b, l + 1);
    r = r && StructMemberInitializer_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // [':' NonVoidInitializer]
  private static boolean StructMemberInitializer_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "StructMemberInitializer_1")) return false;
    StructMemberInitializer_1_0(b, l + 1);
    return true;
  }

  // ':' NonVoidInitializer
  private static boolean StructMemberInitializer_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "StructMemberInitializer_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OP_COLON);
    r = r && NonVoidInitializer(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // StructMemberInitializer (',' StructMemberInitializer)*
  public static boolean StructMemberInitializers(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "StructMemberInitializers")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, STRUCT_MEMBER_INITIALIZERS, "<struct member initializers>");
    r = StructMemberInitializer(b, l + 1);
    r = r && StructMemberInitializers_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (',' StructMemberInitializer)*
  private static boolean StructMemberInitializers_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "StructMemberInitializers_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!StructMemberInitializers_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "StructMemberInitializers_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // ',' StructMemberInitializer
  private static boolean StructMemberInitializers_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "StructMemberInitializers_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OP_COMMA);
    r = r && StructMemberInitializer(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // BasicType
  public static boolean SuperClass(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SuperClass")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, SUPER_CLASS, "<super class>");
    r = BasicType(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // 'switch' '(' Expression ')' ScopeStatement
  public static boolean SwitchStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SwitchStatement")) return false;
    if (!nextTokenIs(b, KW_SWITCH)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, SWITCH_STATEMENT, null);
    r = consumeTokens(b, 1, KW_SWITCH, OP_PAR_LEFT);
    p = r; // pin = 1
    r = r && report_error_(b, Expression(b, l + 1));
    r = p && report_error_(b, consumeToken(b, OP_PAR_RIGHT)) && r;
    r = p && ScopeStatement(b, l + 1) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // ('.')? SymbolTail
  public static boolean Symbol(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Symbol")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, SYMBOL, "<symbol>");
    r = Symbol_0(b, l + 1);
    r = r && SymbolTail(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ('.')?
  private static boolean Symbol_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Symbol_0")) return false;
    consumeToken(b, OP_DOT);
    return true;
  }

  /* ********************************************************** */
  // (Identifier | TemplateInstance) ('.' (Identifier | TemplateInstance))*
  public static boolean SymbolTail(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SymbolTail")) return false;
    if (!nextTokenIs(b, "<symbol tail>", OP_NOT, ID)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, SYMBOL_TAIL, "<symbol tail>");
    r = SymbolTail_0(b, l + 1);
    r = r && SymbolTail_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // Identifier | TemplateInstance
  private static boolean SymbolTail_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SymbolTail_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Identifier(b, l + 1);
    if (!r) r = TemplateInstance(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ('.' (Identifier | TemplateInstance))*
  private static boolean SymbolTail_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SymbolTail_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!SymbolTail_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "SymbolTail_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // '.' (Identifier | TemplateInstance)
  private static boolean SymbolTail_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SymbolTail_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OP_DOT);
    r = r && SymbolTail_1_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // Identifier | TemplateInstance
  private static boolean SymbolTail_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SymbolTail_1_0_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Identifier(b, l + 1);
    if (!r) r = TemplateInstance(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // SynchronizedStatementWithExpression
  //     | SynchronizedStatementWithoutExpression
  public static boolean SynchronizedStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SynchronizedStatement")) return false;
    if (!nextTokenIs(b, KW_SYNCHRONIZED)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = SynchronizedStatementWithExpression(b, l + 1);
    if (!r) r = SynchronizedStatementWithoutExpression(b, l + 1);
    exit_section_(b, m, SYNCHRONIZED_STATEMENT, r);
    return r;
  }

  /* ********************************************************** */
  // 'synchronized' '(' Expression ')' ScopeStatement
  static boolean SynchronizedStatementWithExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SynchronizedStatementWithExpression")) return false;
    if (!nextTokenIs(b, KW_SYNCHRONIZED)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_);
    r = consumeTokens(b, 2, KW_SYNCHRONIZED, OP_PAR_LEFT);
    p = r; // pin = 2
    r = r && report_error_(b, Expression(b, l + 1));
    r = p && report_error_(b, consumeToken(b, OP_PAR_RIGHT)) && r;
    r = p && ScopeStatement(b, l + 1) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // 'synchronized' ScopeStatement
  static boolean SynchronizedStatementWithoutExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SynchronizedStatementWithoutExpression")) return false;
    if (!nextTokenIs(b, KW_SYNCHRONIZED)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, KW_SYNCHRONIZED);
    r = r && ScopeStatement(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // 'alias' Type? Identifier? (':' (Type | AssignExpression))? ('=' (Type | AssignExpression))?
  public static boolean TemplateAliasParameter(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TemplateAliasParameter")) return false;
    if (!nextTokenIs(b, KW_ALIAS)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, KW_ALIAS);
    r = r && TemplateAliasParameter_1(b, l + 1);
    r = r && TemplateAliasParameter_2(b, l + 1);
    r = r && TemplateAliasParameter_3(b, l + 1);
    r = r && TemplateAliasParameter_4(b, l + 1);
    exit_section_(b, m, TEMPLATE_ALIAS_PARAMETER, r);
    return r;
  }

  // Type?
  private static boolean TemplateAliasParameter_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TemplateAliasParameter_1")) return false;
    Type(b, l + 1);
    return true;
  }

  // Identifier?
  private static boolean TemplateAliasParameter_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TemplateAliasParameter_2")) return false;
    Identifier(b, l + 1);
    return true;
  }

  // (':' (Type | AssignExpression))?
  private static boolean TemplateAliasParameter_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TemplateAliasParameter_3")) return false;
    TemplateAliasParameter_3_0(b, l + 1);
    return true;
  }

  // ':' (Type | AssignExpression)
  private static boolean TemplateAliasParameter_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TemplateAliasParameter_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OP_COLON);
    r = r && TemplateAliasParameter_3_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // Type | AssignExpression
  private static boolean TemplateAliasParameter_3_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TemplateAliasParameter_3_0_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Type(b, l + 1);
    if (!r) r = AssignExpression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ('=' (Type | AssignExpression))?
  private static boolean TemplateAliasParameter_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TemplateAliasParameter_4")) return false;
    TemplateAliasParameter_4_0(b, l + 1);
    return true;
  }

  // '=' (Type | AssignExpression)
  private static boolean TemplateAliasParameter_4_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TemplateAliasParameter_4_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OP_EQ);
    r = r && TemplateAliasParameter_4_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // Type | AssignExpression
  private static boolean TemplateAliasParameter_4_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TemplateAliasParameter_4_0_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Type(b, l + 1);
    if (!r) r = AssignExpression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // Lambda //must be above assign expression
  //     | AssignExpression
  //     | Type //this branch should be deprecated  since anything matched by Type is in theory matched by assignexpression
  //     | Symbol
  public static boolean TemplateArgument(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TemplateArgument")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, TEMPLATE_ARGUMENT, "<template argument>");
    r = Lambda(b, l + 1);
    if (!r) r = AssignExpression(b, l + 1);
    if (!r) r = Type(b, l + 1);
    if (!r) r = Symbol(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // TemplateArgument (',' TemplateArgumentList?)?
  public static boolean TemplateArgumentList(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TemplateArgumentList")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, TEMPLATE_ARGUMENT_LIST, "<template argument list>");
    r = TemplateArgument(b, l + 1);
    r = r && TemplateArgumentList_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (',' TemplateArgumentList?)?
  private static boolean TemplateArgumentList_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TemplateArgumentList_1")) return false;
    TemplateArgumentList_1_0(b, l + 1);
    return true;
  }

  // ',' TemplateArgumentList?
  private static boolean TemplateArgumentList_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TemplateArgumentList_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OP_COMMA);
    r = r && TemplateArgumentList_1_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // TemplateArgumentList?
  private static boolean TemplateArgumentList_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TemplateArgumentList_1_0_1")) return false;
    TemplateArgumentList(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // TemplateArgumentsWithParen
  //      | TemplateArgumentsWithoutParen
  public static boolean TemplateArguments(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TemplateArguments")) return false;
    if (!nextTokenIs(b, OP_NOT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = TemplateArgumentsWithParen(b, l + 1);
    if (!r) r = TemplateArgumentsWithoutParen(b, l + 1);
    exit_section_(b, m, TEMPLATE_ARGUMENTS, r);
    return r;
  }

  /* ********************************************************** */
  // '!' '(' TemplateArgumentList? ')'
  static boolean TemplateArgumentsWithParen(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TemplateArgumentsWithParen")) return false;
    if (!nextTokenIs(b, OP_NOT)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_);
    r = consumeTokens(b, 2, OP_NOT, OP_PAR_LEFT);
    p = r; // pin = 2
    r = r && report_error_(b, TemplateArgumentsWithParen_2(b, l + 1));
    r = p && consumeToken(b, OP_PAR_RIGHT) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // TemplateArgumentList?
  private static boolean TemplateArgumentsWithParen_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TemplateArgumentsWithParen_2")) return false;
    TemplateArgumentList(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // '!' TemplateSingleArgument
  static boolean TemplateArgumentsWithoutParen(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TemplateArgumentsWithoutParen")) return false;
    if (!nextTokenIs(b, OP_NOT)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_);
    r = consumeToken(b, OP_NOT);
    p = r; // pin = 1
    r = r && TemplateSingleArgument(b, l + 1);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // 'template' Identifier TemplateParameters Constraint? '{' DeclDefs? '}'
  public static boolean TemplateDeclaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TemplateDeclaration")) return false;
    if (!nextTokenIs(b, KW_TEMPLATE)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, TEMPLATE_DECLARATION, null);
    r = consumeToken(b, KW_TEMPLATE);
    r = r && Identifier(b, l + 1);
    p = r; // pin = 2
    r = r && report_error_(b, TemplateParameters(b, l + 1));
    r = p && report_error_(b, TemplateDeclaration_3(b, l + 1)) && r;
    r = p && report_error_(b, consumeToken(b, OP_BRACES_LEFT)) && r;
    r = p && report_error_(b, TemplateDeclaration_5(b, l + 1)) && r;
    r = p && consumeToken(b, OP_BRACES_RIGHT) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // Constraint?
  private static boolean TemplateDeclaration_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TemplateDeclaration_3")) return false;
    Constraint(b, l + 1);
    return true;
  }

  // DeclDefs?
  private static boolean TemplateDeclaration_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TemplateDeclaration_5")) return false;
    DeclDefs(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // Identifier? TemplateArguments
  public static boolean TemplateInstance(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TemplateInstance")) return false;
    if (!nextTokenIs(b, "<template instance>", OP_NOT, ID)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, TEMPLATE_INSTANCE, "<template instance>");
    r = TemplateInstance_0(b, l + 1);
    r = r && TemplateArguments(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // Identifier?
  private static boolean TemplateInstance_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TemplateInstance_0")) return false;
    Identifier(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // 'mixin' MixinTemplateName TemplateArguments? Identifier? ';'
  public static boolean TemplateMixin(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TemplateMixin")) return false;
    if (!nextTokenIs(b, KW_MIXIN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, KW_MIXIN);
    r = r && MixinTemplateName(b, l + 1);
    r = r && TemplateMixin_2(b, l + 1);
    r = r && TemplateMixin_3(b, l + 1);
    r = r && consumeToken(b, OP_SCOLON);
    exit_section_(b, m, TEMPLATE_MIXIN, r);
    return r;
  }

  // TemplateArguments?
  private static boolean TemplateMixin_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TemplateMixin_2")) return false;
    TemplateArguments(b, l + 1);
    return true;
  }

  // Identifier?
  private static boolean TemplateMixin_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TemplateMixin_3")) return false;
    Identifier(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // 'mixin' 'template' Identifier TemplateParameters Constraint? '{' DeclDefs? '}'
  public static boolean TemplateMixinDeclaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TemplateMixinDeclaration")) return false;
    if (!nextTokenIs(b, KW_MIXIN)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, TEMPLATE_MIXIN_DECLARATION, null);
    r = consumeTokens(b, 0, KW_MIXIN, KW_TEMPLATE);
    r = r && Identifier(b, l + 1);
    p = r; // pin = 3
    r = r && report_error_(b, TemplateParameters(b, l + 1));
    r = p && report_error_(b, TemplateMixinDeclaration_4(b, l + 1)) && r;
    r = p && report_error_(b, consumeToken(b, OP_BRACES_LEFT)) && r;
    r = p && report_error_(b, TemplateMixinDeclaration_6(b, l + 1)) && r;
    r = p && consumeToken(b, OP_BRACES_RIGHT) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // Constraint?
  private static boolean TemplateMixinDeclaration_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TemplateMixinDeclaration_4")) return false;
    Constraint(b, l + 1);
    return true;
  }

  // DeclDefs?
  private static boolean TemplateMixinDeclaration_6(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TemplateMixinDeclaration_6")) return false;
    DeclDefs(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // TemplateValueParameter
  //      | TemplateTypeParameter
  //      | TemplateAliasParameter
  //      | TemplateTupleParameter
  //      | TemplateThisParameter
  public static boolean TemplateParameter(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TemplateParameter")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, TEMPLATE_PARAMETER, "<template parameter>");
    r = TemplateValueParameter(b, l + 1);
    if (!r) r = TemplateTypeParameter(b, l + 1);
    if (!r) r = TemplateAliasParameter(b, l + 1);
    if (!r) r = TemplateTupleParameter(b, l + 1);
    if (!r) r = TemplateThisParameter(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // TemplateParameter (',' TemplateParameter)*
  public static boolean TemplateParameterList(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TemplateParameterList")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, TEMPLATE_PARAMETER_LIST, "<template parameter list>");
    r = TemplateParameter(b, l + 1);
    r = r && TemplateParameterList_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (',' TemplateParameter)*
  private static boolean TemplateParameterList_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TemplateParameterList_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!TemplateParameterList_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "TemplateParameterList_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // ',' TemplateParameter
  private static boolean TemplateParameterList_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TemplateParameterList_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OP_COMMA);
    r = r && TemplateParameter(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // '(' TemplateParameterList? ')'
  public static boolean TemplateParameters(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TemplateParameters")) return false;
    if (!nextTokenIs(b, OP_PAR_LEFT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OP_PAR_LEFT);
    r = r && TemplateParameters_1(b, l + 1);
    r = r && consumeToken(b, OP_PAR_RIGHT);
    exit_section_(b, m, TEMPLATE_PARAMETERS, r);
    return r;
  }

  // TemplateParameterList?
  private static boolean TemplateParameters_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TemplateParameters_1")) return false;
    TemplateParameterList(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // IdentifierList
  //     | BasicTypeX
  //     | CHARACTER_LITERAL
  //     | StringLiteral
  //     | INTEGER_LITERAL
  //     | FLOAT_LITERAL
  //     | 'true'
  //     | 'false'
  //     | 'null'
  //     | 'this'
  //     | SpecialKeyword
  //     | AssignExpression
  public static boolean TemplateSingleArgument(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TemplateSingleArgument")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, TEMPLATE_SINGLE_ARGUMENT, "<template single argument>");
    r = IdentifierList(b, l + 1);
    if (!r) r = BasicTypeX(b, l + 1);
    if (!r) r = consumeToken(b, CHARACTER_LITERAL);
    if (!r) r = StringLiteral(b, l + 1);
    if (!r) r = consumeToken(b, INTEGER_LITERAL);
    if (!r) r = consumeToken(b, FLOAT_LITERAL);
    if (!r) r = consumeToken(b, KW_TRUE);
    if (!r) r = consumeToken(b, KW_FALSE);
    if (!r) r = consumeToken(b, KW_NULL);
    if (!r) r = consumeToken(b, KW_THIS);
    if (!r) r = SpecialKeyword(b, l + 1);
    if (!r) r = AssignExpression(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // 'this' TemplateTypeParameter
  public static boolean TemplateThisParameter(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TemplateThisParameter")) return false;
    if (!nextTokenIs(b, KW_THIS)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, KW_THIS);
    r = r && TemplateTypeParameter(b, l + 1);
    exit_section_(b, m, TEMPLATE_THIS_PARAMETER, r);
    return r;
  }

  /* ********************************************************** */
  // Identifier '...'
  public static boolean TemplateTupleParameter(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TemplateTupleParameter")) return false;
    if (!nextTokenIs(b, ID)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Identifier(b, l + 1);
    r = r && consumeToken(b, OP_TRIPLEDOT);
    exit_section_(b, m, TEMPLATE_TUPLE_PARAMETER, r);
    return r;
  }

  /* ********************************************************** */
  // Type Identifier? '...'? (':' Type)? ('=' Type)? (':' AssignExpression)? TemplateValueParameterDefault?
  public static boolean TemplateTypeParameter(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TemplateTypeParameter")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, TEMPLATE_TYPE_PARAMETER, "<template type parameter>");
    r = Type(b, l + 1);
    r = r && TemplateTypeParameter_1(b, l + 1);
    r = r && TemplateTypeParameter_2(b, l + 1);
    r = r && TemplateTypeParameter_3(b, l + 1);
    r = r && TemplateTypeParameter_4(b, l + 1);
    r = r && TemplateTypeParameter_5(b, l + 1);
    r = r && TemplateTypeParameter_6(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // Identifier?
  private static boolean TemplateTypeParameter_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TemplateTypeParameter_1")) return false;
    Identifier(b, l + 1);
    return true;
  }

  // '...'?
  private static boolean TemplateTypeParameter_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TemplateTypeParameter_2")) return false;
    consumeToken(b, OP_TRIPLEDOT);
    return true;
  }

  // (':' Type)?
  private static boolean TemplateTypeParameter_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TemplateTypeParameter_3")) return false;
    TemplateTypeParameter_3_0(b, l + 1);
    return true;
  }

  // ':' Type
  private static boolean TemplateTypeParameter_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TemplateTypeParameter_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OP_COLON);
    r = r && Type(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ('=' Type)?
  private static boolean TemplateTypeParameter_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TemplateTypeParameter_4")) return false;
    TemplateTypeParameter_4_0(b, l + 1);
    return true;
  }

  // '=' Type
  private static boolean TemplateTypeParameter_4_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TemplateTypeParameter_4_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OP_EQ);
    r = r && Type(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (':' AssignExpression)?
  private static boolean TemplateTypeParameter_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TemplateTypeParameter_5")) return false;
    TemplateTypeParameter_5_0(b, l + 1);
    return true;
  }

  // ':' AssignExpression
  private static boolean TemplateTypeParameter_5_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TemplateTypeParameter_5_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OP_COLON);
    r = r && AssignExpression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // TemplateValueParameterDefault?
  private static boolean TemplateTypeParameter_6(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TemplateTypeParameter_6")) return false;
    TemplateValueParameterDefault(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // BasicType Declarator ('=' (AssignExpression | SpecialKeyword))
  //        | BasicType Declarator TemplateValueParameterSpecialization TemplateValueParameterDefault?
  public static boolean TemplateValueParameter(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TemplateValueParameter")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, TEMPLATE_VALUE_PARAMETER, "<template value parameter>");
    r = TemplateValueParameter_0(b, l + 1);
    if (!r) r = TemplateValueParameter_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // BasicType Declarator ('=' (AssignExpression | SpecialKeyword))
  private static boolean TemplateValueParameter_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TemplateValueParameter_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = BasicType(b, l + 1);
    r = r && Declarator(b, l + 1);
    r = r && TemplateValueParameter_0_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // '=' (AssignExpression | SpecialKeyword)
  private static boolean TemplateValueParameter_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TemplateValueParameter_0_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OP_EQ);
    r = r && TemplateValueParameter_0_2_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // AssignExpression | SpecialKeyword
  private static boolean TemplateValueParameter_0_2_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TemplateValueParameter_0_2_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = AssignExpression(b, l + 1);
    if (!r) r = SpecialKeyword(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // BasicType Declarator TemplateValueParameterSpecialization TemplateValueParameterDefault?
  private static boolean TemplateValueParameter_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TemplateValueParameter_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = BasicType(b, l + 1);
    r = r && Declarator(b, l + 1);
    r = r && TemplateValueParameterSpecialization(b, l + 1);
    r = r && TemplateValueParameter_1_3(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // TemplateValueParameterDefault?
  private static boolean TemplateValueParameter_1_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TemplateValueParameter_1_3")) return false;
    TemplateValueParameterDefault(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // '=' ( AssignExpression | SpecialKeyword)
  public static boolean TemplateValueParameterDefault(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TemplateValueParameterDefault")) return false;
    if (!nextTokenIs(b, OP_EQ)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OP_EQ);
    r = r && TemplateValueParameterDefault_1(b, l + 1);
    exit_section_(b, m, TEMPLATE_VALUE_PARAMETER_DEFAULT, r);
    return r;
  }

  // AssignExpression | SpecialKeyword
  private static boolean TemplateValueParameterDefault_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TemplateValueParameterDefault_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = AssignExpression(b, l + 1);
    if (!r) r = SpecialKeyword(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // ConditionalExpression
  static boolean TemplateValueParameterSpecialization(PsiBuilder b, int l) {
    return ConditionalExpression(b, l + 1);
  }

  /* ********************************************************** */
  // Expression
  public static boolean Test(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Test")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, TEST, "<test>");
    r = Expression(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // ScopeStatement
  public static boolean ThenStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ThenStatement")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, THEN_STATEMENT, "<then statement>");
    r = ScopeStatement(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // 'throw' Expression ';'
  public static boolean ThrowStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ThrowStatement")) return false;
    if (!nextTokenIs(b, KW_THROW)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, THROW_STATEMENT, null);
    r = consumeToken(b, KW_THROW);
    p = r; // pin = 1
    r = r && report_error_(b, Expression(b, l + 1));
    r = p && consumeToken(b, OP_SCOLON) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // AssignExpression
  //     | Type
  public static boolean TraitsArgument(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TraitsArgument")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, TRAITS_ARGUMENT, "<traits argument>");
    r = AssignExpression(b, l + 1);
    if (!r) r = Type(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // TraitsArgument (',' TraitsArguments)*
  public static boolean TraitsArguments(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TraitsArguments")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, TRAITS_ARGUMENTS, "<traits arguments>");
    r = TraitsArgument(b, l + 1);
    r = r && TraitsArguments_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (',' TraitsArguments)*
  private static boolean TraitsArguments_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TraitsArguments_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!TraitsArguments_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "TraitsArguments_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // ',' TraitsArguments
  private static boolean TraitsArguments_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TraitsArguments_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OP_COMMA);
    r = r && TraitsArguments(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // '__traits' ('(' TraitsKeyword ',' TraitsArguments ')')?
  public static boolean TraitsExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TraitsExpression")) return false;
    if (!nextTokenIs(b, KW___TRAITS)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, TRAITS_EXPRESSION, null);
    r = consumeToken(b, KW___TRAITS);
    p = r; // pin = 1
    r = r && TraitsExpression_1(b, l + 1);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // ('(' TraitsKeyword ',' TraitsArguments ')')?
  private static boolean TraitsExpression_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TraitsExpression_1")) return false;
    TraitsExpression_1_0(b, l + 1);
    return true;
  }

  // '(' TraitsKeyword ',' TraitsArguments ')'
  private static boolean TraitsExpression_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TraitsExpression_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OP_PAR_LEFT);
    r = r && TraitsKeyword(b, l + 1);
    r = r && consumeToken(b, OP_COMMA);
    r = r && TraitsArguments(b, l + 1);
    r = r && consumeToken(b, OP_PAR_RIGHT);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // 'isAbstractClass'
  //     | 'isTemplate'
  //     | 'isArithmetic'
  //     | 'isAssociativeArray'
  //     | 'isFinalClass'
  //     | 'isPOD'
  //     | 'isNested'
  //     | 'isFloating'
  //     | 'isIntegral'
  //     | 'isScalar'
  //     | 'isStaticArray'
  //     | 'isUnsigned'
  //     | 'isVirtualFunction'
  //     | 'isVirtualMethod'
  //     | 'isAbstractFunction'
  //     | 'isFinalFunction'
  //     | 'isStaticFunction'
  //     | 'isOverrideFunction'
  //     | 'isRef'
  //     | 'isOut'
  //     | 'isLazy'
  //     | 'hasMember'
  //     | 'identifier'
  //     | 'getAliasThis'
  //     | 'getAttributes'
  //     | 'getFunctionAttributes'
  //     | 'getMember'
  //     | 'getOverloads'
  //     | 'getProtection'
  //     | 'getPointerBitmap'
  //     | 'isSomeVisibility'
  //     | 'getVirtualFunctions'
  //     | 'getVirtualMethods'
  //     | 'getUnitTests'
  //     | 'parent'
  //     | 'classInstanceSize'
  //     | 'getVirtualIndex'
  //     | 'allMembers'
  //     | 'derivedMembers'
  //     | 'isSame'
  //     | 'compiles'
  public static boolean TraitsKeyword(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TraitsKeyword")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, TRAITS_KEYWORD, "<traits keyword>");
    r = consumeToken(b, "isAbstractClass");
    if (!r) r = consumeToken(b, "isTemplate");
    if (!r) r = consumeToken(b, "isArithmetic");
    if (!r) r = consumeToken(b, "isAssociativeArray");
    if (!r) r = consumeToken(b, "isFinalClass");
    if (!r) r = consumeToken(b, "isPOD");
    if (!r) r = consumeToken(b, "isNested");
    if (!r) r = consumeToken(b, "isFloating");
    if (!r) r = consumeToken(b, "isIntegral");
    if (!r) r = consumeToken(b, "isScalar");
    if (!r) r = consumeToken(b, "isStaticArray");
    if (!r) r = consumeToken(b, "isUnsigned");
    if (!r) r = consumeToken(b, "isVirtualFunction");
    if (!r) r = consumeToken(b, "isVirtualMethod");
    if (!r) r = consumeToken(b, "isAbstractFunction");
    if (!r) r = consumeToken(b, "isFinalFunction");
    if (!r) r = consumeToken(b, "isStaticFunction");
    if (!r) r = consumeToken(b, "isOverrideFunction");
    if (!r) r = consumeToken(b, "isRef");
    if (!r) r = consumeToken(b, "isOut");
    if (!r) r = consumeToken(b, "isLazy");
    if (!r) r = consumeToken(b, "hasMember");
    if (!r) r = consumeToken(b, "identifier");
    if (!r) r = consumeToken(b, "getAliasThis");
    if (!r) r = consumeToken(b, "getAttributes");
    if (!r) r = consumeToken(b, "getFunctionAttributes");
    if (!r) r = consumeToken(b, "getMember");
    if (!r) r = consumeToken(b, "getOverloads");
    if (!r) r = consumeToken(b, "getProtection");
    if (!r) r = consumeToken(b, "getPointerBitmap");
    if (!r) r = consumeToken(b, "isSomeVisibility");
    if (!r) r = consumeToken(b, "getVirtualFunctions");
    if (!r) r = consumeToken(b, "getVirtualMethods");
    if (!r) r = consumeToken(b, "getUnitTests");
    if (!r) r = consumeToken(b, "parent");
    if (!r) r = consumeToken(b, "classInstanceSize");
    if (!r) r = consumeToken(b, "getVirtualIndex");
    if (!r) r = consumeToken(b, "allMembers");
    if (!r) r = consumeToken(b, "derivedMembers");
    if (!r) r = consumeToken(b, "isSame");
    if (!r) r = consumeToken(b, "compiles");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // 'try' ScopeStatement Catches
  //     | 'try' ScopeStatement Catches FinallyStatement
  //     | 'try' ScopeStatement FinallyStatement
  public static boolean TryStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TryStatement")) return false;
    if (!nextTokenIs(b, KW_TRY)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = TryStatement_0(b, l + 1);
    if (!r) r = TryStatement_1(b, l + 1);
    if (!r) r = TryStatement_2(b, l + 1);
    exit_section_(b, m, TRY_STATEMENT, r);
    return r;
  }

  // 'try' ScopeStatement Catches
  private static boolean TryStatement_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TryStatement_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, KW_TRY);
    r = r && ScopeStatement(b, l + 1);
    r = r && Catches(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // 'try' ScopeStatement Catches FinallyStatement
  private static boolean TryStatement_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TryStatement_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, KW_TRY);
    r = r && ScopeStatement(b, l + 1);
    r = r && Catches(b, l + 1);
    r = r && FinallyStatement(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // 'try' ScopeStatement FinallyStatement
  private static boolean TryStatement_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TryStatement_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, KW_TRY);
    r = r && ScopeStatement(b, l + 1);
    r = r && FinallyStatement(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // TypeCtors? BasicType BasicType2?
  public static boolean Type(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Type")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, TYPE, "<type>");
    r = Type_0(b, l + 1);
    r = r && BasicType(b, l + 1);
    r = r && Type_2(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // TypeCtors?
  private static boolean Type_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Type_0")) return false;
    TypeCtors(b, l + 1);
    return true;
  }

  // BasicType2?
  private static boolean Type_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Type_2")) return false;
    BasicType2(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // 'const'
  //     | 'immutable'
  //     | 'inout'
  //     | 'shared'
  public static boolean TypeCtor(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TypeCtor")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, TYPE_CTOR, "<type ctor>");
    r = consumeToken(b, KW_CONST);
    if (!r) r = consumeToken(b, KW_IMMUTABLE);
    if (!r) r = consumeToken(b, KW_INOUT);
    if (!r) r = consumeToken(b, KW_SHARED);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // TypeCtor [TypeCtors]
  public static boolean TypeCtors(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TypeCtors")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, TYPE_CTORS, "<type ctors>");
    r = TypeCtor(b, l + 1);
    r = r && TypeCtors_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // [TypeCtors]
  private static boolean TypeCtors_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TypeCtors_1")) return false;
    TypeCtors(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // TypeVector
  //     | Type
  //     | 'struct'
  //     | 'union'
  //     | 'class'
  //     | 'interface'
  //     | 'enum'
  //     | 'function'
  //     | 'delegate'
  //     | 'super'
  //     | 'const'
  //     | 'immutable'
  //     | 'inout'
  //     | 'shared'
  //     | 'return'
  //     | '__parameters'
  public static boolean TypeSpecialization(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TypeSpecialization")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, TYPE_SPECIALIZATION, "<type specialization>");
    r = TypeVector(b, l + 1);
    if (!r) r = Type(b, l + 1);
    if (!r) r = consumeToken(b, KW_STRUCT);
    if (!r) r = consumeToken(b, KW_UNION);
    if (!r) r = consumeToken(b, KW_CLASS);
    if (!r) r = consumeToken(b, KW_INTERFACE);
    if (!r) r = consumeToken(b, KW_ENUM);
    if (!r) r = consumeToken(b, KW_FUNCTION);
    if (!r) r = consumeToken(b, KW_DELEGATE);
    if (!r) r = consumeToken(b, KW_SUPER);
    if (!r) r = consumeToken(b, KW_CONST);
    if (!r) r = consumeToken(b, KW_IMMUTABLE);
    if (!r) r = consumeToken(b, KW_INOUT);
    if (!r) r = consumeToken(b, KW_SHARED);
    if (!r) r = consumeToken(b, KW_RETURN);
    if (!r) r = consumeToken(b, KW___PARAMETERS);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // '__vector' '(' Type')'
  public static boolean TypeVector(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TypeVector")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, TYPE_VECTOR, "<type vector>");
    r = consumeToken(b, "__vector");
    p = r; // pin = 1
    r = r && report_error_(b, consumeToken(b, OP_PAR_LEFT));
    r = p && report_error_(b, Type(b, l + 1)) && r;
    r = p && consumeToken(b, OP_PAR_RIGHT) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // TypeidExpressionType
  //     | TypeidExpressionExpression
  public static boolean TypeidExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TypeidExpression")) return false;
    if (!nextTokenIs(b, KW_TYPEID)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = TypeidExpressionType(b, l + 1);
    if (!r) r = TypeidExpressionExpression(b, l + 1);
    exit_section_(b, m, TYPEID_EXPRESSION, r);
    return r;
  }

  /* ********************************************************** */
  // 'typeid' '(' Expression ')'
  static boolean TypeidExpressionExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TypeidExpressionExpression")) return false;
    if (!nextTokenIs(b, KW_TYPEID)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_);
    r = consumeTokens(b, 0, KW_TYPEID, OP_PAR_LEFT);
    r = r && Expression(b, l + 1);
    p = r; // pin = 3
    r = r && consumeToken(b, OP_PAR_RIGHT);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // 'typeid' '(' Type ')'
  static boolean TypeidExpressionType(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TypeidExpressionType")) return false;
    if (!nextTokenIs(b, KW_TYPEID)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, KW_TYPEID, OP_PAR_LEFT);
    r = r && Type(b, l + 1);
    r = r && consumeToken(b, OP_PAR_RIGHT);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // 'typeof' '(' (Expression | 'return') ')'
  public static boolean Typeof(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Typeof")) return false;
    if (!nextTokenIs(b, KW_TYPEOF)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, TYPEOF, null);
    r = consumeTokens(b, 1, KW_TYPEOF, OP_PAR_LEFT);
    p = r; // pin = 1
    r = r && report_error_(b, Typeof_2(b, l + 1));
    r = p && consumeToken(b, OP_PAR_RIGHT) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // Expression | 'return'
  private static boolean Typeof_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Typeof_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Expression(b, l + 1);
    if (!r) r = consumeToken(b, KW_RETURN);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // ('&'
  //     | '++'
  //     | '|'
  //     | '^^'
  //     | '--'
  //     | '*'
  //     | '-'
  //     | '+'
  //     | '!'
  //     | '~') [UnaryExpression]
  //     | TypeCtor? '(' Type ')' '.' Identifier
  //     | TypeCtor? '(' Type ')' '.' TemplateInstance
  //     | DeleteExpression
  //     | CastExpression
  //     | PowExpression
  static boolean UnaryExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "UnaryExpression")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = UnaryExpression_0(b, l + 1);
    if (!r) r = UnaryExpression_1(b, l + 1);
    if (!r) r = UnaryExpression_2(b, l + 1);
    if (!r) r = DeleteExpression(b, l + 1);
    if (!r) r = CastExpression(b, l + 1);
    if (!r) r = PowExpression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ('&'
  //     | '++'
  //     | '|'
  //     | '^^'
  //     | '--'
  //     | '*'
  //     | '-'
  //     | '+'
  //     | '!'
  //     | '~') [UnaryExpression]
  private static boolean UnaryExpression_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "UnaryExpression_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = UnaryExpression_0_0(b, l + 1);
    r = r && UnaryExpression_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // '&'
  //     | '++'
  //     | '|'
  //     | '^^'
  //     | '--'
  //     | '*'
  //     | '-'
  //     | '+'
  //     | '!'
  //     | '~'
  private static boolean UnaryExpression_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "UnaryExpression_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OP_AND);
    if (!r) r = consumeToken(b, OP_PLUS_PLUS);
    if (!r) r = consumeToken(b, OP_OR);
    if (!r) r = consumeToken(b, OP_POW);
    if (!r) r = consumeToken(b, OP_MINUS_MINUS);
    if (!r) r = consumeToken(b, OP_ASTERISK);
    if (!r) r = consumeToken(b, OP_MINUS);
    if (!r) r = consumeToken(b, OP_PLUS);
    if (!r) r = consumeToken(b, OP_NOT);
    if (!r) r = consumeToken(b, OP_TILDA);
    exit_section_(b, m, null, r);
    return r;
  }

  // [UnaryExpression]
  private static boolean UnaryExpression_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "UnaryExpression_0_1")) return false;
    UnaryExpression(b, l + 1);
    return true;
  }

  // TypeCtor? '(' Type ')' '.' Identifier
  private static boolean UnaryExpression_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "UnaryExpression_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = UnaryExpression_1_0(b, l + 1);
    r = r && consumeToken(b, OP_PAR_LEFT);
    r = r && Type(b, l + 1);
    r = r && consumeTokens(b, 0, OP_PAR_RIGHT, OP_DOT);
    r = r && Identifier(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // TypeCtor?
  private static boolean UnaryExpression_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "UnaryExpression_1_0")) return false;
    TypeCtor(b, l + 1);
    return true;
  }

  // TypeCtor? '(' Type ')' '.' TemplateInstance
  private static boolean UnaryExpression_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "UnaryExpression_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = UnaryExpression_2_0(b, l + 1);
    r = r && consumeToken(b, OP_PAR_LEFT);
    r = r && Type(b, l + 1);
    r = r && consumeTokens(b, 0, OP_PAR_RIGHT, OP_DOT);
    r = r && TemplateInstance(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // TypeCtor?
  private static boolean UnaryExpression_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "UnaryExpression_2_0")) return false;
    TypeCtor(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // 'union' Identifier ';'
  //     | 'union' Identifier AggregateBody
  //     | UnionTemplateDeclaration
  //     | AnonUnionDeclaration
  public static boolean UnionDeclaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "UnionDeclaration")) return false;
    if (!nextTokenIs(b, KW_UNION)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = UnionDeclaration_0(b, l + 1);
    if (!r) r = UnionDeclaration_1(b, l + 1);
    if (!r) r = UnionTemplateDeclaration(b, l + 1);
    if (!r) r = AnonUnionDeclaration(b, l + 1);
    exit_section_(b, m, UNION_DECLARATION, r);
    return r;
  }

  // 'union' Identifier ';'
  private static boolean UnionDeclaration_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "UnionDeclaration_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, KW_UNION);
    r = r && Identifier(b, l + 1);
    r = r && consumeToken(b, OP_SCOLON);
    exit_section_(b, m, null, r);
    return r;
  }

  // 'union' Identifier AggregateBody
  private static boolean UnionDeclaration_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "UnionDeclaration_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, KW_UNION);
    r = r && Identifier(b, l + 1);
    r = r && AggregateBody(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // 'union' Identifier TemplateParameters Constraint? AggregateBody
  public static boolean UnionTemplateDeclaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "UnionTemplateDeclaration")) return false;
    if (!nextTokenIs(b, KW_UNION)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, UNION_TEMPLATE_DECLARATION, null);
    r = consumeToken(b, KW_UNION);
    r = r && Identifier(b, l + 1);
    p = r; // pin = 2
    r = r && report_error_(b, TemplateParameters(b, l + 1));
    r = p && report_error_(b, UnionTemplateDeclaration_3(b, l + 1)) && r;
    r = p && AggregateBody(b, l + 1) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // Constraint?
  private static boolean UnionTemplateDeclaration_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "UnionTemplateDeclaration_3")) return false;
    Constraint(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // 'unittest' BlockStatement
  public static boolean UnitTesting(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "UnitTesting")) return false;
    if (!nextTokenIs(b, KW_UNITTEST)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, UNIT_TESTING, null);
    r = consumeToken(b, KW_UNITTEST);
    p = r; // pin = 1
    r = r && BlockStatement(b, l + 1);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // Expression
  public static boolean UprExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "UprExpression")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, UPR_EXPRESSION, "<upr expression>");
    r = Expression(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // UserDefinedAttributeArgumentOnly
  //     | UserDefinedAttributeWithTemplateInstance //must be above with identifier, becuae the pin on with Identifier will falsely match templates todo
  //     | UserDefinedAttributeWithIdentifier
  public static boolean UserDefinedAttribute(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "UserDefinedAttribute")) return false;
    if (!nextTokenIs(b, OP_AT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = UserDefinedAttributeArgumentOnly(b, l + 1);
    if (!r) r = UserDefinedAttributeWithTemplateInstance(b, l + 1);
    if (!r) r = UserDefinedAttributeWithIdentifier(b, l + 1);
    exit_section_(b, m, USER_DEFINED_ATTRIBUTE, r);
    return r;
  }

  /* ********************************************************** */
  // '@' '(' ArgumentList ')'
  static boolean UserDefinedAttributeArgumentOnly(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "UserDefinedAttributeArgumentOnly")) return false;
    if (!nextTokenIs(b, OP_AT)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_);
    r = consumeTokens(b, 2, OP_AT, OP_PAR_LEFT);
    p = r; // pin = 2
    r = r && report_error_(b, ArgumentList(b, l + 1));
    r = p && consumeToken(b, OP_PAR_RIGHT) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // '@' Identifier ('(' ArgumentList? ')')?
  static boolean UserDefinedAttributeWithIdentifier(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "UserDefinedAttributeWithIdentifier")) return false;
    if (!nextTokenIs(b, OP_AT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OP_AT);
    r = r && Identifier(b, l + 1);
    r = r && UserDefinedAttributeWithIdentifier_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ('(' ArgumentList? ')')?
  private static boolean UserDefinedAttributeWithIdentifier_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "UserDefinedAttributeWithIdentifier_2")) return false;
    UserDefinedAttributeWithIdentifier_2_0(b, l + 1);
    return true;
  }

  // '(' ArgumentList? ')'
  private static boolean UserDefinedAttributeWithIdentifier_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "UserDefinedAttributeWithIdentifier_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OP_PAR_LEFT);
    r = r && UserDefinedAttributeWithIdentifier_2_0_1(b, l + 1);
    r = r && consumeToken(b, OP_PAR_RIGHT);
    exit_section_(b, m, null, r);
    return r;
  }

  // ArgumentList?
  private static boolean UserDefinedAttributeWithIdentifier_2_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "UserDefinedAttributeWithIdentifier_2_0_1")) return false;
    ArgumentList(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // '@' TemplateInstance ('(' ArgumentList? ')')?
  static boolean UserDefinedAttributeWithTemplateInstance(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "UserDefinedAttributeWithTemplateInstance")) return false;
    if (!nextTokenIs(b, OP_AT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OP_AT);
    r = r && TemplateInstance(b, l + 1);
    r = r && UserDefinedAttributeWithTemplateInstance_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ('(' ArgumentList? ')')?
  private static boolean UserDefinedAttributeWithTemplateInstance_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "UserDefinedAttributeWithTemplateInstance_2")) return false;
    UserDefinedAttributeWithTemplateInstance_2_0(b, l + 1);
    return true;
  }

  // '(' ArgumentList? ')'
  private static boolean UserDefinedAttributeWithTemplateInstance_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "UserDefinedAttributeWithTemplateInstance_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OP_PAR_LEFT);
    r = r && UserDefinedAttributeWithTemplateInstance_2_0_1(b, l + 1);
    r = r && consumeToken(b, OP_PAR_RIGHT);
    exit_section_(b, m, null, r);
    return r;
  }

  // ArgumentList?
  private static boolean UserDefinedAttributeWithTemplateInstance_2_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "UserDefinedAttributeWithTemplateInstance_2_0_1")) return false;
    ArgumentList(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // StorageClasses BasicType Declarators ';'
  //     | StorageClasses? BasicType? Declarators ';'
  //     | AutoDeclaration
  public static boolean VarDeclarations(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "VarDeclarations")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, VAR_DECLARATIONS, "<var declarations>");
    r = VarDeclarations_0(b, l + 1);
    if (!r) r = VarDeclarations_1(b, l + 1);
    if (!r) r = AutoDeclaration(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // StorageClasses BasicType Declarators ';'
  private static boolean VarDeclarations_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "VarDeclarations_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = StorageClasses(b, l + 1);
    r = r && BasicType(b, l + 1);
    r = r && Declarators(b, l + 1);
    r = r && consumeToken(b, OP_SCOLON);
    exit_section_(b, m, null, r);
    return r;
  }

  // StorageClasses? BasicType? Declarators ';'
  private static boolean VarDeclarations_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "VarDeclarations_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = VarDeclarations_1_0(b, l + 1);
    r = r && VarDeclarations_1_1(b, l + 1);
    r = r && Declarators(b, l + 1);
    r = r && consumeToken(b, OP_SCOLON);
    exit_section_(b, m, null, r);
    return r;
  }

  // StorageClasses?
  private static boolean VarDeclarations_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "VarDeclarations_1_0")) return false;
    StorageClasses(b, l + 1);
    return true;
  }

  // BasicType?
  private static boolean VarDeclarations_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "VarDeclarations_1_1")) return false;
    BasicType(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // BasicType2? Identifier
  public static boolean VarDeclarator(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "VarDeclarator")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, VAR_DECLARATOR, "<var declarator>");
    r = VarDeclarator_0(b, l + 1);
    r = r && Identifier(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // BasicType2?
  private static boolean VarDeclarator_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "VarDeclarator_0")) return false;
    BasicType2(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // Identifier TemplateParameters? '=' Initializer
  public static boolean VarDeclaratorIdentifier(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "VarDeclaratorIdentifier")) return false;
    if (!nextTokenIs(b, ID)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Identifier(b, l + 1);
    r = r && VarDeclaratorIdentifier_1(b, l + 1);
    r = r && consumeToken(b, OP_EQ);
    r = r && Initializer(b, l + 1);
    exit_section_(b, m, VAR_DECLARATOR_IDENTIFIER, r);
    return r;
  }

  // TemplateParameters?
  private static boolean VarDeclaratorIdentifier_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "VarDeclaratorIdentifier_1")) return false;
    TemplateParameters(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // 'version' '(' (INTEGER_LITERAL | Identifier | 'unittest' | 'assert') ')'
  public static boolean VersionCondition(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "VersionCondition")) return false;
    if (!nextTokenIs(b, KW_VERSION)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, VERSION_CONDITION, null);
    r = consumeTokens(b, 2, KW_VERSION, OP_PAR_LEFT);
    p = r; // pin = 2
    r = r && report_error_(b, VersionCondition_2(b, l + 1));
    r = p && consumeToken(b, OP_PAR_RIGHT) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // INTEGER_LITERAL | Identifier | 'unittest' | 'assert'
  private static boolean VersionCondition_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "VersionCondition_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, INTEGER_LITERAL);
    if (!r) r = Identifier(b, l + 1);
    if (!r) r = consumeToken(b, KW_UNITTEST);
    if (!r) r = consumeToken(b, KW_ASSERT);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // 'version' '=' (Identifier | INTEGER_LITERAL) ';'
  public static boolean VersionSpecification(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "VersionSpecification")) return false;
    if (!nextTokenIs(b, KW_VERSION)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, VERSION_SPECIFICATION, null);
    r = consumeTokens(b, 2, KW_VERSION, OP_EQ);
    p = r; // pin = 2
    r = r && report_error_(b, VersionSpecification_2(b, l + 1));
    r = p && consumeToken(b, OP_SCOLON) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // Identifier | INTEGER_LITERAL
  private static boolean VersionSpecification_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "VersionSpecification_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Identifier(b, l + 1);
    if (!r) r = consumeToken(b, INTEGER_LITERAL);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // 'void'
  public static boolean VoidInitializer(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "VoidInitializer")) return false;
    if (!nextTokenIs(b, KW_VOID)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, KW_VOID);
    exit_section_(b, m, VOID_INITIALIZER, r);
    return r;
  }

  /* ********************************************************** */
  // 'while' '(' Expression ')' ScopeStatement
  public static boolean WhileStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "WhileStatement")) return false;
    if (!nextTokenIs(b, KW_WHILE)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, WHILE_STATEMENT, null);
    r = consumeTokens(b, 1, KW_WHILE, OP_PAR_LEFT);
    p = r; // pin = 1
    r = r && report_error_(b, Expression(b, l + 1));
    r = p && report_error_(b, consumeToken(b, OP_PAR_RIGHT)) && r;
    r = p && ScopeStatement(b, l + 1) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // WithStatementExpression
  //     | WithStatementSymbol
  //     | WithStatementTemplateInstance
  public static boolean WithStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "WithStatement")) return false;
    if (!nextTokenIs(b, KW_WITH)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = WithStatementExpression(b, l + 1);
    if (!r) r = WithStatementSymbol(b, l + 1);
    if (!r) r = WithStatementTemplateInstance(b, l + 1);
    exit_section_(b, m, WITH_STATEMENT, r);
    return r;
  }

  /* ********************************************************** */
  // 'with' '(' Expression ')' ScopeStatement
  static boolean WithStatementExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "WithStatementExpression")) return false;
    if (!nextTokenIs(b, KW_WITH)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_);
    r = consumeTokens(b, 0, KW_WITH, OP_PAR_LEFT);
    r = r && Expression(b, l + 1);
    p = r; // pin = 3
    r = r && report_error_(b, consumeToken(b, OP_PAR_RIGHT));
    r = p && ScopeStatement(b, l + 1) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // 'with' '(' Symbol ')' ScopeStatement
  static boolean WithStatementSymbol(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "WithStatementSymbol")) return false;
    if (!nextTokenIs(b, KW_WITH)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_);
    r = consumeTokens(b, 0, KW_WITH, OP_PAR_LEFT);
    r = r && Symbol(b, l + 1);
    p = r; // pin = 3
    r = r && report_error_(b, consumeToken(b, OP_PAR_RIGHT));
    r = p && ScopeStatement(b, l + 1) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // 'with' '(' TemplateInstance ')' ScopeStatement
  static boolean WithStatementTemplateInstance(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "WithStatementTemplateInstance")) return false;
    if (!nextTokenIs(b, KW_WITH)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_);
    r = consumeTokens(b, 0, KW_WITH, OP_PAR_LEFT);
    r = r && TemplateInstance(b, l + 1);
    p = r; // pin = 3
    r = r && report_error_(b, consumeToken(b, OP_PAR_RIGHT));
    r = p && ScopeStatement(b, l + 1) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // AndExpression [ XorExpression_ ]
  static boolean XorExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "XorExpression")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = AndExpression(b, l + 1);
    r = r && XorExpression_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [ XorExpression_ ]
  private static boolean XorExpression_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "XorExpression_1")) return false;
    XorExpression_(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // '^' XorExpression
  public static boolean XorExpression_(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "XorExpression_")) return false;
    if (!nextTokenIs(b, OP_XOR)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OP_XOR);
    r = r && XorExpression(b, l + 1);
    exit_section_(b, m, XOR_EXPRESSION_, r);
    return r;
  }

  /* ********************************************************** */
  // item_*
  static boolean dFile(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "dFile")) return false;
    int c = current_position_(b);
    while (true) {
      if (!item_(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "dFile", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  /* ********************************************************** */
  // ModuleDeclaration | DeclDefs | Statement | SHEBANG
  static boolean item_(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "item_")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_);
    r = ModuleDeclaration(b, l + 1);
    if (!r) r = DeclDefs(b, l + 1);
    if (!r) r = Statement(b, l + 1);
    if (!r) r = consumeToken(b, SHEBANG);
    exit_section_(b, l, m, r, false, item_recover_parser_);
    return r;
  }

  /* ********************************************************** */
  // !( ModuleDeclaration | DeclDefs | Statement | SHEBANG )
  static boolean item_recover(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "item_recover")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NOT_);
    r = !item_recover_0(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ModuleDeclaration | DeclDefs | Statement | SHEBANG
  private static boolean item_recover_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "item_recover_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ModuleDeclaration(b, l + 1);
    if (!r) r = DeclDefs(b, l + 1);
    if (!r) r = Statement(b, l + 1);
    if (!r) r = consumeToken(b, SHEBANG);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // !(/*Identifier*/ ':' | ',' |  ';')
  static boolean module_name_recover(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "module_name_recover")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NOT_);
    r = !module_name_recover_0(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ':' | ',' |  ';'
  private static boolean module_name_recover_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "module_name_recover_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OP_COLON);
    if (!r) r = consumeToken(b, OP_COMMA);
    if (!r) r = consumeToken(b, OP_SCOLON);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // !('else' | Statement | '}' | DeclDef | ModuleDeclaration | 'catch' | 'finally' | ':' | ','| 'foreach' | SHEBANG | <<eof>>)
  static boolean statement_recover(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "statement_recover")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NOT_);
    r = !statement_recover_0(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // 'else' | Statement | '}' | DeclDef | ModuleDeclaration | 'catch' | 'finally' | ':' | ','| 'foreach' | SHEBANG | <<eof>>
  private static boolean statement_recover_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "statement_recover_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, KW_ELSE);
    if (!r) r = Statement(b, l + 1);
    if (!r) r = consumeToken(b, OP_BRACES_RIGHT);
    if (!r) r = DeclDef(b, l + 1);
    if (!r) r = ModuleDeclaration(b, l + 1);
    if (!r) r = consumeToken(b, KW_CATCH);
    if (!r) r = consumeToken(b, KW_FINALLY);
    if (!r) r = consumeToken(b, OP_COLON);
    if (!r) r = consumeToken(b, OP_COMMA);
    if (!r) r = consumeToken(b, KW_FOREACH);
    if (!r) r = consumeToken(b, SHEBANG);
    if (!r) r = eof(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  final static Parser item_recover_parser_ = new Parser() {
    public boolean parse(PsiBuilder b, int l) {
      return item_recover(b, l + 1);
    }
  };
  final static Parser module_name_recover_parser_ = new Parser() {
    public boolean parse(PsiBuilder b, int l) {
      return module_name_recover(b, l + 1);
    }
  };
  final static Parser statement_recover_parser_ = new Parser() {
    public boolean parse(PsiBuilder b, int l) {
      return statement_recover(b, l + 1);
    }
  };
}
