package org.xtext.example.mydsl_sql.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.mydsl_sql.services.SQLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalSQLParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "MINUTE_MICROSECOND", "SECOND_MICROSECOND", "HOUR_MICROSECOND", "DAY_MICROSECOND", "MINUTE_SECOND", "STRAIGHT_JOIN", "HOUR_MINUTE", "HOUR_SECOND", "MICROSECOND", "DAY_MINUTE", "DAY_SECOND", "YEAR_MONTH", "BETWEEN_4", "KW_FOLLOWING", "INTERSECT", "PARTITION", "PRECEDING", "UNBOUNDED", "BETWEEN_2", "NOTEQUAL", "BETWEEN_3", "GREATER_1", "DAY_HOUR", "DISTINCT", "SIBLINGS", "BETWEEN_1", "GREATER", "BETWEEN", "CURRENT", "EXCLUDE", "EXTRACT", "INCLUDE", "NATURAL", "PERCENT", "QUARTER", "UNPIVOT", "EXCEPT", "EXISTS", "HAVING", "MINUTE", "OFFSET", "SECOND", "SELECT", "VALUES", "EQUAL", "LESS_1", "NOTIN", "CAST", "CROSS", "FETCH", "FIRST", "GROUP", "INNER", "LIMIT", "MINUS", "MONTH", "NULLS", "ORDER", "OUTER", "PIVOT", "RANGE", "RIGHT", "UNION", "USING", "WHERE", "LESS", "CASE", "DESC", "ELSE", "FROM", "FULL", "HOUR", "JOIN", "LAST", "LEFT", "LIKE", "NOT_1", "NULL", "ONLY", "OVER", "ROWS", "SOME", "THEN", "TIES", "WEEK", "WHEN", "WITH", "YEAR", "LeftParenthesisPlusSignRightParenthesis", "ALL", "AND", "ANY", "ASC", "DAY", "END", "FOR", "NOT", "ROW", "TOP", "XML", "IN_1", "ExclamationMarkEqualsSign", "X", "LessThanSignEqualsSign", "LessThanSignGreaterThanSign", "GreaterThanSignEqualsSign", "AS", "BY", "IN", "IS", "ON", "OR", "CircumflexAccentEqualsSign", "VerticalLineVerticalLine", "LeftParenthesis", "RightParenthesis", "PlusSign", "Comma", "HyphenMinus", "FullStop", "Solidus", "LessThanSign", "EqualsSign", "GreaterThanSign", "VerticalLine", "RightCurlyBracket", "RULE_JRPARAM", "RULE_JRNPARAM", "RULE_STAR", "RULE_UNSIGNED", "RULE_INT", "RULE_SIGNED_DOUBLE", "RULE_DATE", "RULE_TIME", "RULE_TIMESTAMP", "RULE_STRING_CORE", "RULE_STRING_", "RULE_STRING", "RULE_DBNAME", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER"
    };
    public static final int LessThanSignGreaterThanSign=108;
    public static final int MONTH=59;
    public static final int JOIN=76;
    public static final int BETWEEN=31;
    public static final int LessThanSign=125;
    public static final int MINUS=58;
    public static final int LeftParenthesisPlusSignRightParenthesis=92;
    public static final int WHEN=89;
    public static final int QUARTER=38;
    public static final int LeftParenthesis=118;
    public static final int YEAR=91;
    public static final int ELSE=72;
    public static final int RULE_TIME=137;
    public static final int HOUR_MINUTE=10;
    public static final int PARTITION=19;
    public static final int INCLUDE=35;
    public static final int DAY_MINUTE=13;
    public static final int INNER=56;
    public static final int CAST=51;
    public static final int GreaterThanSign=127;
    public static final int LEFT=78;
    public static final int RULE_ID=143;
    public static final int IN=112;
    public static final int DISTINCT=27;
    public static final int IS=113;
    public static final int WHERE=68;
    public static final int CASE=70;
    public static final int GreaterThanSignEqualsSign=109;
    public static final int AS=110;
    public static final int RULE_DATE=136;
    public static final int TOP=102;
    public static final int VerticalLine=128;
    public static final int PlusSign=120;
    public static final int RULE_INT=134;
    public static final int RULE_ML_COMMENT=144;
    public static final int THEN=86;
    public static final int UNPIVOT=39;
    public static final int RULE_JRPARAM=130;
    public static final int MICROSECOND=12;
    public static final int VerticalLineVerticalLine=117;
    public static final int DAY_HOUR=26;
    public static final int RULE_DBNAME=142;
    public static final int GROUP=55;
    public static final int ORDER=61;
    public static final int ASC=96;
    public static final int Comma=121;
    public static final int HyphenMinus=122;
    public static final int STRAIGHT_JOIN=9;
    public static final int BY=111;
    public static final int X=106;
    public static final int OFFSET=44;
    public static final int RIGHT=65;
    public static final int VALUES=47;
    public static final int LessThanSignEqualsSign=107;
    public static final int Solidus=124;
    public static final int RightCurlyBracket=129;
    public static final int RULE_SIGNED_DOUBLE=135;
    public static final int FETCH=53;
    public static final int FullStop=123;
    public static final int RULE_UNSIGNED=133;
    public static final int SIBLINGS=28;
    public static final int GREATER=30;
    public static final int NOTIN=50;
    public static final int SECOND_MICROSECOND=5;
    public static final int FIRST=54;
    public static final int RULE_STRING_=140;
    public static final int SELECT=46;
    public static final int PRECEDING=20;
    public static final int RULE_JRNPARAM=131;
    public static final int PERCENT=37;
    public static final int ExclamationMarkEqualsSign=105;
    public static final int UNION=66;
    public static final int DAY=97;
    public static final int ALL=93;
    public static final int ONLY=82;
    public static final int FROM=73;
    public static final int DESC=71;
    public static final int MINUTE_MICROSECOND=4;
    public static final int UNBOUNDED=21;
    public static final int KW_FOLLOWING=17;
    public static final int MINUTE=43;
    public static final int RULE_STAR=132;
    public static final int HOUR_MICROSECOND=6;
    public static final int EXTRACT=34;
    public static final int NULL=81;
    public static final int DAY_MICROSECOND=7;
    public static final int LESS_1=49;
    public static final int FOR=99;
    public static final int RightParenthesis=119;
    public static final int PIVOT=63;
    public static final int EXCEPT=40;
    public static final int CURRENT=32;
    public static final int FULL=74;
    public static final int NOTEQUAL=23;
    public static final int USING=67;
    public static final int NOT=100;
    public static final int LIKE=79;
    public static final int LAST=77;
    public static final int IN_1=104;
    public static final int EXCLUDE=33;
    public static final int AND=94;
    public static final int CircumflexAccentEqualsSign=116;
    public static final int MINUTE_SECOND=8;
    public static final int YEAR_MONTH=15;
    public static final int LESS=69;
    public static final int END=98;
    public static final int ROW=101;
    public static final int HAVING=42;
    public static final int DAY_SECOND=14;
    public static final int RANGE=64;
    public static final int TIES=87;
    public static final int HOUR=75;
    public static final int LIMIT=57;
    public static final int RULE_STRING=141;
    public static final int ANY=95;
    public static final int RULE_SL_COMMENT=145;
    public static final int NATURAL=36;
    public static final int EqualsSign=126;
    public static final int SOME=85;
    public static final int NOT_1=80;
    public static final int BETWEEN_2=22;
    public static final int GREATER_1=25;
    public static final int BETWEEN_1=29;
    public static final int OUTER=62;
    public static final int WEEK=88;
    public static final int EOF=-1;
    public static final int BETWEEN_4=16;
    public static final int NULLS=60;
    public static final int BETWEEN_3=24;
    public static final int ON=114;
    public static final int OR=115;
    public static final int EXISTS=41;
    public static final int RULE_WS=146;
    public static final int EQUAL=48;
    public static final int RULE_ANY_OTHER=147;
    public static final int INTERSECT=18;
    public static final int WITH=90;
    public static final int OVER=83;
    public static final int CROSS=52;
    public static final int XML=103;
    public static final int SECOND=45;
    public static final int RULE_STRING_CORE=139;
    public static final int HOUR_SECOND=11;
    public static final int RULE_TIMESTAMP=138;
    public static final int ROWS=84;

    // delegates
    // delegators


        public InternalSQLParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalSQLParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalSQLParser.tokenNames; }
    public String getGrammarFileName() { return "InternalSQLParser.g"; }



    /*
      This grammar contains a lot of empty actions to work around a bug in ANTLR.
      Otherwise the ANTLR tool will create synpreds that cannot be compiled in some rare cases.
    */

     	private SQLGrammarAccess grammarAccess;

        public InternalSQLParser(TokenStream input, SQLGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Model";
       	}

       	@Override
       	protected SQLGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleModel"
    // InternalSQLParser.g:64:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalSQLParser.g:64:46: (iv_ruleModel= ruleModel EOF )
            // InternalSQLParser.g:65:2: iv_ruleModel= ruleModel EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getModelRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleModel=ruleModel();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleModel; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalSQLParser.g:71:1: ruleModel returns [EObject current=null] : ( (this_JRNPARAM_0= RULE_JRNPARAM )? ( (lv_wq_1_0= ruleWithQuery ) )? ( (lv_query_2_0= ruleSelectQuery ) ) ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        Token this_JRNPARAM_0=null;
        EObject lv_wq_1_0 = null;

        EObject lv_query_2_0 = null;



        	enterRule();

        try {
            // InternalSQLParser.g:77:2: ( ( (this_JRNPARAM_0= RULE_JRNPARAM )? ( (lv_wq_1_0= ruleWithQuery ) )? ( (lv_query_2_0= ruleSelectQuery ) ) ) )
            // InternalSQLParser.g:78:2: ( (this_JRNPARAM_0= RULE_JRNPARAM )? ( (lv_wq_1_0= ruleWithQuery ) )? ( (lv_query_2_0= ruleSelectQuery ) ) )
            {
            // InternalSQLParser.g:78:2: ( (this_JRNPARAM_0= RULE_JRNPARAM )? ( (lv_wq_1_0= ruleWithQuery ) )? ( (lv_query_2_0= ruleSelectQuery ) ) )
            // InternalSQLParser.g:79:3: (this_JRNPARAM_0= RULE_JRNPARAM )? ( (lv_wq_1_0= ruleWithQuery ) )? ( (lv_query_2_0= ruleSelectQuery ) )
            {
            // InternalSQLParser.g:79:3: (this_JRNPARAM_0= RULE_JRNPARAM )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_JRNPARAM) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalSQLParser.g:80:4: this_JRNPARAM_0= RULE_JRNPARAM
                    {
                    this_JRNPARAM_0=(Token)match(input,RULE_JRNPARAM,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_JRNPARAM_0, grammarAccess.getModelAccess().getJRNPARAMTerminalRuleCall_0());
                      			
                    }

                    }
                    break;

            }

            // InternalSQLParser.g:85:3: ( (lv_wq_1_0= ruleWithQuery ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==WITH) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalSQLParser.g:86:4: (lv_wq_1_0= ruleWithQuery )
                    {
                    // InternalSQLParser.g:86:4: (lv_wq_1_0= ruleWithQuery )
                    // InternalSQLParser.g:87:5: lv_wq_1_0= ruleWithQuery
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getModelAccess().getWqWithQueryParserRuleCall_1_0());
                      				
                    }
                    pushFollow(FOLLOW_3);
                    lv_wq_1_0=ruleWithQuery();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getModelRule());
                      					}
                      					set(
                      						current,
                      						"wq",
                      						lv_wq_1_0,
                      						"org.xtext.example.mydsl_sql.SQL.WithQuery");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalSQLParser.g:104:3: ( (lv_query_2_0= ruleSelectQuery ) )
            // InternalSQLParser.g:105:4: (lv_query_2_0= ruleSelectQuery )
            {
            // InternalSQLParser.g:105:4: (lv_query_2_0= ruleSelectQuery )
            // InternalSQLParser.g:106:5: lv_query_2_0= ruleSelectQuery
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getModelAccess().getQuerySelectQueryParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_query_2_0=ruleSelectQuery();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getModelRule());
              					}
              					set(
              						current,
              						"query",
              						lv_query_2_0,
              						"org.xtext.example.mydsl_sql.SQL.SelectQuery");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleWithQuery"
    // InternalSQLParser.g:127:1: entryRuleWithQuery returns [EObject current=null] : iv_ruleWithQuery= ruleWithQuery EOF ;
    public final EObject entryRuleWithQuery() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWithQuery = null;


        try {
            // InternalSQLParser.g:127:50: (iv_ruleWithQuery= ruleWithQuery EOF )
            // InternalSQLParser.g:128:2: iv_ruleWithQuery= ruleWithQuery EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getWithQueryRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleWithQuery=ruleWithQuery();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleWithQuery; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleWithQuery"


    // $ANTLR start "ruleWithQuery"
    // InternalSQLParser.g:134:1: ruleWithQuery returns [EObject current=null] : ( ( (lv_w_0_0= WITH ) ) ( (lv_wname_1_0= ruleDbObjectName ) ) ( (lv_withCols_2_0= ruleWithColumns ) )? otherlv_3= AS otherlv_4= LeftParenthesis ( (lv_query_5_0= ruleSelectQuery ) ) otherlv_6= RightParenthesis (otherlv_7= Comma ( (lv_additionalWname_8_0= ruleDbObjectName ) ) ( (lv_additionalWithCols_9_0= ruleWithColumns ) )? otherlv_10= AS otherlv_11= LeftParenthesis ( (lv_additionalQueries_12_0= ruleSelectQuery ) ) otherlv_13= RightParenthesis )* ) ;
    public final EObject ruleWithQuery() throws RecognitionException {
        EObject current = null;

        Token lv_w_0_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        EObject lv_wname_1_0 = null;

        EObject lv_withCols_2_0 = null;

        EObject lv_query_5_0 = null;

        EObject lv_additionalWname_8_0 = null;

        EObject lv_additionalWithCols_9_0 = null;

        EObject lv_additionalQueries_12_0 = null;



        	enterRule();

        try {
            // InternalSQLParser.g:140:2: ( ( ( (lv_w_0_0= WITH ) ) ( (lv_wname_1_0= ruleDbObjectName ) ) ( (lv_withCols_2_0= ruleWithColumns ) )? otherlv_3= AS otherlv_4= LeftParenthesis ( (lv_query_5_0= ruleSelectQuery ) ) otherlv_6= RightParenthesis (otherlv_7= Comma ( (lv_additionalWname_8_0= ruleDbObjectName ) ) ( (lv_additionalWithCols_9_0= ruleWithColumns ) )? otherlv_10= AS otherlv_11= LeftParenthesis ( (lv_additionalQueries_12_0= ruleSelectQuery ) ) otherlv_13= RightParenthesis )* ) )
            // InternalSQLParser.g:141:2: ( ( (lv_w_0_0= WITH ) ) ( (lv_wname_1_0= ruleDbObjectName ) ) ( (lv_withCols_2_0= ruleWithColumns ) )? otherlv_3= AS otherlv_4= LeftParenthesis ( (lv_query_5_0= ruleSelectQuery ) ) otherlv_6= RightParenthesis (otherlv_7= Comma ( (lv_additionalWname_8_0= ruleDbObjectName ) ) ( (lv_additionalWithCols_9_0= ruleWithColumns ) )? otherlv_10= AS otherlv_11= LeftParenthesis ( (lv_additionalQueries_12_0= ruleSelectQuery ) ) otherlv_13= RightParenthesis )* )
            {
            // InternalSQLParser.g:141:2: ( ( (lv_w_0_0= WITH ) ) ( (lv_wname_1_0= ruleDbObjectName ) ) ( (lv_withCols_2_0= ruleWithColumns ) )? otherlv_3= AS otherlv_4= LeftParenthesis ( (lv_query_5_0= ruleSelectQuery ) ) otherlv_6= RightParenthesis (otherlv_7= Comma ( (lv_additionalWname_8_0= ruleDbObjectName ) ) ( (lv_additionalWithCols_9_0= ruleWithColumns ) )? otherlv_10= AS otherlv_11= LeftParenthesis ( (lv_additionalQueries_12_0= ruleSelectQuery ) ) otherlv_13= RightParenthesis )* )
            // InternalSQLParser.g:142:3: ( (lv_w_0_0= WITH ) ) ( (lv_wname_1_0= ruleDbObjectName ) ) ( (lv_withCols_2_0= ruleWithColumns ) )? otherlv_3= AS otherlv_4= LeftParenthesis ( (lv_query_5_0= ruleSelectQuery ) ) otherlv_6= RightParenthesis (otherlv_7= Comma ( (lv_additionalWname_8_0= ruleDbObjectName ) ) ( (lv_additionalWithCols_9_0= ruleWithColumns ) )? otherlv_10= AS otherlv_11= LeftParenthesis ( (lv_additionalQueries_12_0= ruleSelectQuery ) ) otherlv_13= RightParenthesis )*
            {
            // InternalSQLParser.g:142:3: ( (lv_w_0_0= WITH ) )
            // InternalSQLParser.g:143:4: (lv_w_0_0= WITH )
            {
            // InternalSQLParser.g:143:4: (lv_w_0_0= WITH )
            // InternalSQLParser.g:144:5: lv_w_0_0= WITH
            {
            lv_w_0_0=(Token)match(input,WITH,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_w_0_0, grammarAccess.getWithQueryAccess().getWWITHKeyword_0_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getWithQueryRule());
              					}
              					setWithLastConsumed(current, "w", lv_w_0_0, "WITH");
              				
            }

            }


            }

            // InternalSQLParser.g:156:3: ( (lv_wname_1_0= ruleDbObjectName ) )
            // InternalSQLParser.g:157:4: (lv_wname_1_0= ruleDbObjectName )
            {
            // InternalSQLParser.g:157:4: (lv_wname_1_0= ruleDbObjectName )
            // InternalSQLParser.g:158:5: lv_wname_1_0= ruleDbObjectName
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getWithQueryAccess().getWnameDbObjectNameParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_5);
            lv_wname_1_0=ruleDbObjectName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getWithQueryRule());
              					}
              					set(
              						current,
              						"wname",
              						lv_wname_1_0,
              						"org.xtext.example.mydsl_sql.SQL.DbObjectName");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalSQLParser.g:175:3: ( (lv_withCols_2_0= ruleWithColumns ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==LeftParenthesis) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalSQLParser.g:176:4: (lv_withCols_2_0= ruleWithColumns )
                    {
                    // InternalSQLParser.g:176:4: (lv_withCols_2_0= ruleWithColumns )
                    // InternalSQLParser.g:177:5: lv_withCols_2_0= ruleWithColumns
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getWithQueryAccess().getWithColsWithColumnsParserRuleCall_2_0());
                      				
                    }
                    pushFollow(FOLLOW_6);
                    lv_withCols_2_0=ruleWithColumns();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getWithQueryRule());
                      					}
                      					set(
                      						current,
                      						"withCols",
                      						lv_withCols_2_0,
                      						"org.xtext.example.mydsl_sql.SQL.WithColumns");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,AS,FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getWithQueryAccess().getASKeyword_3());
              		
            }
            otherlv_4=(Token)match(input,LeftParenthesis,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getWithQueryAccess().getLeftParenthesisKeyword_4());
              		
            }
            // InternalSQLParser.g:202:3: ( (lv_query_5_0= ruleSelectQuery ) )
            // InternalSQLParser.g:203:4: (lv_query_5_0= ruleSelectQuery )
            {
            // InternalSQLParser.g:203:4: (lv_query_5_0= ruleSelectQuery )
            // InternalSQLParser.g:204:5: lv_query_5_0= ruleSelectQuery
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getWithQueryAccess().getQuerySelectQueryParserRuleCall_5_0());
              				
            }
            pushFollow(FOLLOW_8);
            lv_query_5_0=ruleSelectQuery();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getWithQueryRule());
              					}
              					set(
              						current,
              						"query",
              						lv_query_5_0,
              						"org.xtext.example.mydsl_sql.SQL.SelectQuery");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_6=(Token)match(input,RightParenthesis,FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getWithQueryAccess().getRightParenthesisKeyword_6());
              		
            }
            // InternalSQLParser.g:225:3: (otherlv_7= Comma ( (lv_additionalWname_8_0= ruleDbObjectName ) ) ( (lv_additionalWithCols_9_0= ruleWithColumns ) )? otherlv_10= AS otherlv_11= LeftParenthesis ( (lv_additionalQueries_12_0= ruleSelectQuery ) ) otherlv_13= RightParenthesis )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==Comma) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalSQLParser.g:226:4: otherlv_7= Comma ( (lv_additionalWname_8_0= ruleDbObjectName ) ) ( (lv_additionalWithCols_9_0= ruleWithColumns ) )? otherlv_10= AS otherlv_11= LeftParenthesis ( (lv_additionalQueries_12_0= ruleSelectQuery ) ) otherlv_13= RightParenthesis
            	    {
            	    otherlv_7=(Token)match(input,Comma,FOLLOW_4); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_7, grammarAccess.getWithQueryAccess().getCommaKeyword_7_0());
            	      			
            	    }
            	    // InternalSQLParser.g:230:4: ( (lv_additionalWname_8_0= ruleDbObjectName ) )
            	    // InternalSQLParser.g:231:5: (lv_additionalWname_8_0= ruleDbObjectName )
            	    {
            	    // InternalSQLParser.g:231:5: (lv_additionalWname_8_0= ruleDbObjectName )
            	    // InternalSQLParser.g:232:6: lv_additionalWname_8_0= ruleDbObjectName
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getWithQueryAccess().getAdditionalWnameDbObjectNameParserRuleCall_7_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_5);
            	    lv_additionalWname_8_0=ruleDbObjectName();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getWithQueryRule());
            	      						}
            	      						add(
            	      							current,
            	      							"additionalWname",
            	      							lv_additionalWname_8_0,
            	      							"org.xtext.example.mydsl_sql.SQL.DbObjectName");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }

            	    // InternalSQLParser.g:249:4: ( (lv_additionalWithCols_9_0= ruleWithColumns ) )?
            	    int alt4=2;
            	    int LA4_0 = input.LA(1);

            	    if ( (LA4_0==LeftParenthesis) ) {
            	        alt4=1;
            	    }
            	    switch (alt4) {
            	        case 1 :
            	            // InternalSQLParser.g:250:5: (lv_additionalWithCols_9_0= ruleWithColumns )
            	            {
            	            // InternalSQLParser.g:250:5: (lv_additionalWithCols_9_0= ruleWithColumns )
            	            // InternalSQLParser.g:251:6: lv_additionalWithCols_9_0= ruleWithColumns
            	            {
            	            if ( state.backtracking==0 ) {

            	              						newCompositeNode(grammarAccess.getWithQueryAccess().getAdditionalWithColsWithColumnsParserRuleCall_7_2_0());
            	              					
            	            }
            	            pushFollow(FOLLOW_6);
            	            lv_additionalWithCols_9_0=ruleWithColumns();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              						if (current==null) {
            	              							current = createModelElementForParent(grammarAccess.getWithQueryRule());
            	              						}
            	              						add(
            	              							current,
            	              							"additionalWithCols",
            	              							lv_additionalWithCols_9_0,
            	              							"org.xtext.example.mydsl_sql.SQL.WithColumns");
            	              						afterParserOrEnumRuleCall();
            	              					
            	            }

            	            }


            	            }
            	            break;

            	    }

            	    otherlv_10=(Token)match(input,AS,FOLLOW_7); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_10, grammarAccess.getWithQueryAccess().getASKeyword_7_3());
            	      			
            	    }
            	    otherlv_11=(Token)match(input,LeftParenthesis,FOLLOW_3); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_11, grammarAccess.getWithQueryAccess().getLeftParenthesisKeyword_7_4());
            	      			
            	    }
            	    // InternalSQLParser.g:276:4: ( (lv_additionalQueries_12_0= ruleSelectQuery ) )
            	    // InternalSQLParser.g:277:5: (lv_additionalQueries_12_0= ruleSelectQuery )
            	    {
            	    // InternalSQLParser.g:277:5: (lv_additionalQueries_12_0= ruleSelectQuery )
            	    // InternalSQLParser.g:278:6: lv_additionalQueries_12_0= ruleSelectQuery
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getWithQueryAccess().getAdditionalQueriesSelectQueryParserRuleCall_7_5_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_8);
            	    lv_additionalQueries_12_0=ruleSelectQuery();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getWithQueryRule());
            	      						}
            	      						add(
            	      							current,
            	      							"additionalQueries",
            	      							lv_additionalQueries_12_0,
            	      							"org.xtext.example.mydsl_sql.SQL.SelectQuery");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }

            	    otherlv_13=(Token)match(input,RightParenthesis,FOLLOW_9); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_13, grammarAccess.getWithQueryAccess().getRightParenthesisKeyword_7_6());
            	      			
            	    }

            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleWithQuery"


    // $ANTLR start "entryRuleWithColumns"
    // InternalSQLParser.g:304:1: entryRuleWithColumns returns [EObject current=null] : iv_ruleWithColumns= ruleWithColumns EOF ;
    public final EObject entryRuleWithColumns() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWithColumns = null;


        try {
            // InternalSQLParser.g:304:52: (iv_ruleWithColumns= ruleWithColumns EOF )
            // InternalSQLParser.g:305:2: iv_ruleWithColumns= ruleWithColumns EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getWithColumnsRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleWithColumns=ruleWithColumns();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleWithColumns; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleWithColumns"


    // $ANTLR start "ruleWithColumns"
    // InternalSQLParser.g:311:1: ruleWithColumns returns [EObject current=null] : (otherlv_0= LeftParenthesis this_UsingCols_1= ruleUsingCols otherlv_2= RightParenthesis ) ;
    public final EObject ruleWithColumns() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject this_UsingCols_1 = null;



        	enterRule();

        try {
            // InternalSQLParser.g:317:2: ( (otherlv_0= LeftParenthesis this_UsingCols_1= ruleUsingCols otherlv_2= RightParenthesis ) )
            // InternalSQLParser.g:318:2: (otherlv_0= LeftParenthesis this_UsingCols_1= ruleUsingCols otherlv_2= RightParenthesis )
            {
            // InternalSQLParser.g:318:2: (otherlv_0= LeftParenthesis this_UsingCols_1= ruleUsingCols otherlv_2= RightParenthesis )
            // InternalSQLParser.g:319:3: otherlv_0= LeftParenthesis this_UsingCols_1= ruleUsingCols otherlv_2= RightParenthesis
            {
            otherlv_0=(Token)match(input,LeftParenthesis,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getWithColumnsAccess().getLeftParenthesisKeyword_0());
              		
            }
            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getWithColumnsAccess().getUsingColsParserRuleCall_1());
              		
            }
            pushFollow(FOLLOW_8);
            this_UsingCols_1=ruleUsingCols();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_UsingCols_1;
              			afterParserOrEnumRuleCall();
              		
            }
            otherlv_2=(Token)match(input,RightParenthesis,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getWithColumnsAccess().getRightParenthesisKeyword_2());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleWithColumns"


    // $ANTLR start "entryRuleFetchFirst"
    // InternalSQLParser.g:342:1: entryRuleFetchFirst returns [EObject current=null] : iv_ruleFetchFirst= ruleFetchFirst EOF ;
    public final EObject entryRuleFetchFirst() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFetchFirst = null;


        try {
            // InternalSQLParser.g:342:51: (iv_ruleFetchFirst= ruleFetchFirst EOF )
            // InternalSQLParser.g:343:2: iv_ruleFetchFirst= ruleFetchFirst EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFetchFirstRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleFetchFirst=ruleFetchFirst();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFetchFirst; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFetchFirst"


    // $ANTLR start "ruleFetchFirst"
    // InternalSQLParser.g:349:1: ruleFetchFirst returns [EObject current=null] : ( ( (lv_fetchFirst_0_0= ruleUnsignedValue ) ) ( ( (lv_row_1_1= ROW | lv_row_1_2= ROWS ) ) ) otherlv_2= ONLY ) ;
    public final EObject ruleFetchFirst() throws RecognitionException {
        EObject current = null;

        Token lv_row_1_1=null;
        Token lv_row_1_2=null;
        Token otherlv_2=null;
        EObject lv_fetchFirst_0_0 = null;



        	enterRule();

        try {
            // InternalSQLParser.g:355:2: ( ( ( (lv_fetchFirst_0_0= ruleUnsignedValue ) ) ( ( (lv_row_1_1= ROW | lv_row_1_2= ROWS ) ) ) otherlv_2= ONLY ) )
            // InternalSQLParser.g:356:2: ( ( (lv_fetchFirst_0_0= ruleUnsignedValue ) ) ( ( (lv_row_1_1= ROW | lv_row_1_2= ROWS ) ) ) otherlv_2= ONLY )
            {
            // InternalSQLParser.g:356:2: ( ( (lv_fetchFirst_0_0= ruleUnsignedValue ) ) ( ( (lv_row_1_1= ROW | lv_row_1_2= ROWS ) ) ) otherlv_2= ONLY )
            // InternalSQLParser.g:357:3: ( (lv_fetchFirst_0_0= ruleUnsignedValue ) ) ( ( (lv_row_1_1= ROW | lv_row_1_2= ROWS ) ) ) otherlv_2= ONLY
            {
            // InternalSQLParser.g:357:3: ( (lv_fetchFirst_0_0= ruleUnsignedValue ) )
            // InternalSQLParser.g:358:4: (lv_fetchFirst_0_0= ruleUnsignedValue )
            {
            // InternalSQLParser.g:358:4: (lv_fetchFirst_0_0= ruleUnsignedValue )
            // InternalSQLParser.g:359:5: lv_fetchFirst_0_0= ruleUnsignedValue
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getFetchFirstAccess().getFetchFirstUnsignedValueParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_10);
            lv_fetchFirst_0_0=ruleUnsignedValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getFetchFirstRule());
              					}
              					set(
              						current,
              						"fetchFirst",
              						lv_fetchFirst_0_0,
              						"org.xtext.example.mydsl_sql.SQL.UnsignedValue");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalSQLParser.g:376:3: ( ( (lv_row_1_1= ROW | lv_row_1_2= ROWS ) ) )
            // InternalSQLParser.g:377:4: ( (lv_row_1_1= ROW | lv_row_1_2= ROWS ) )
            {
            // InternalSQLParser.g:377:4: ( (lv_row_1_1= ROW | lv_row_1_2= ROWS ) )
            // InternalSQLParser.g:378:5: (lv_row_1_1= ROW | lv_row_1_2= ROWS )
            {
            // InternalSQLParser.g:378:5: (lv_row_1_1= ROW | lv_row_1_2= ROWS )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==ROW) ) {
                alt6=1;
            }
            else if ( (LA6_0==ROWS) ) {
                alt6=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalSQLParser.g:379:6: lv_row_1_1= ROW
                    {
                    lv_row_1_1=(Token)match(input,ROW,FOLLOW_11); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_row_1_1, grammarAccess.getFetchFirstAccess().getRowROWKeyword_1_0_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getFetchFirstRule());
                      						}
                      						setWithLastConsumed(current, "row", lv_row_1_1, null);
                      					
                    }

                    }
                    break;
                case 2 :
                    // InternalSQLParser.g:390:6: lv_row_1_2= ROWS
                    {
                    lv_row_1_2=(Token)match(input,ROWS,FOLLOW_11); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_row_1_2, grammarAccess.getFetchFirstAccess().getRowROWSKeyword_1_0_1());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getFetchFirstRule());
                      						}
                      						setWithLastConsumed(current, "row", lv_row_1_2, null);
                      					
                    }

                    }
                    break;

            }


            }


            }

            otherlv_2=(Token)match(input,ONLY,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getFetchFirstAccess().getONLYKeyword_2());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFetchFirst"


    // $ANTLR start "entryRuleOffset"
    // InternalSQLParser.g:411:1: entryRuleOffset returns [EObject current=null] : iv_ruleOffset= ruleOffset EOF ;
    public final EObject entryRuleOffset() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOffset = null;


        try {
            // InternalSQLParser.g:411:47: (iv_ruleOffset= ruleOffset EOF )
            // InternalSQLParser.g:412:2: iv_ruleOffset= ruleOffset EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOffsetRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleOffset=ruleOffset();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOffset; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOffset"


    // $ANTLR start "ruleOffset"
    // InternalSQLParser.g:418:1: ruleOffset returns [EObject current=null] : ( (lv_offset_0_0= RULE_INT ) ) ;
    public final EObject ruleOffset() throws RecognitionException {
        EObject current = null;

        Token lv_offset_0_0=null;


        	enterRule();

        try {
            // InternalSQLParser.g:424:2: ( ( (lv_offset_0_0= RULE_INT ) ) )
            // InternalSQLParser.g:425:2: ( (lv_offset_0_0= RULE_INT ) )
            {
            // InternalSQLParser.g:425:2: ( (lv_offset_0_0= RULE_INT ) )
            // InternalSQLParser.g:426:3: (lv_offset_0_0= RULE_INT )
            {
            // InternalSQLParser.g:426:3: (lv_offset_0_0= RULE_INT )
            // InternalSQLParser.g:427:4: lv_offset_0_0= RULE_INT
            {
            lv_offset_0_0=(Token)match(input,RULE_INT,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(lv_offset_0_0, grammarAccess.getOffsetAccess().getOffsetINTTerminalRuleCall_0());
              			
            }
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElement(grammarAccess.getOffsetRule());
              				}
              				setWithLastConsumed(
              					current,
              					"offset",
              					lv_offset_0_0,
              					"org.xtext.example.mydsl_sql.SQL.INT");
              			
            }

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOffset"


    // $ANTLR start "entryRuleLimit"
    // InternalSQLParser.g:446:1: entryRuleLimit returns [EObject current=null] : iv_ruleLimit= ruleLimit EOF ;
    public final EObject entryRuleLimit() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLimit = null;


        try {
            // InternalSQLParser.g:446:46: (iv_ruleLimit= ruleLimit EOF )
            // InternalSQLParser.g:447:2: iv_ruleLimit= ruleLimit EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLimitRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleLimit=ruleLimit();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLimit; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLimit"


    // $ANTLR start "ruleLimit"
    // InternalSQLParser.g:453:1: ruleLimit returns [EObject current=null] : ( ( () otherlv_1= ALL ) | ( ( (lv_l1_2_0= RULE_UNSIGNED ) ) (otherlv_3= Comma ( (lv_l2_4_0= RULE_UNSIGNED ) ) )? ) ) ;
    public final EObject ruleLimit() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_l1_2_0=null;
        Token otherlv_3=null;
        Token lv_l2_4_0=null;


        	enterRule();

        try {
            // InternalSQLParser.g:459:2: ( ( ( () otherlv_1= ALL ) | ( ( (lv_l1_2_0= RULE_UNSIGNED ) ) (otherlv_3= Comma ( (lv_l2_4_0= RULE_UNSIGNED ) ) )? ) ) )
            // InternalSQLParser.g:460:2: ( ( () otherlv_1= ALL ) | ( ( (lv_l1_2_0= RULE_UNSIGNED ) ) (otherlv_3= Comma ( (lv_l2_4_0= RULE_UNSIGNED ) ) )? ) )
            {
            // InternalSQLParser.g:460:2: ( ( () otherlv_1= ALL ) | ( ( (lv_l1_2_0= RULE_UNSIGNED ) ) (otherlv_3= Comma ( (lv_l2_4_0= RULE_UNSIGNED ) ) )? ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==ALL) ) {
                alt8=1;
            }
            else if ( (LA8_0==RULE_UNSIGNED) ) {
                alt8=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalSQLParser.g:461:3: ( () otherlv_1= ALL )
                    {
                    // InternalSQLParser.g:461:3: ( () otherlv_1= ALL )
                    // InternalSQLParser.g:462:4: () otherlv_1= ALL
                    {
                    // InternalSQLParser.g:462:4: ()
                    // InternalSQLParser.g:463:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					/* */
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getLimitAccess().getLimitAction_0_0(),
                      						current);
                      				
                    }

                    }

                    otherlv_1=(Token)match(input,ALL,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getLimitAccess().getALLKeyword_0_1());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalSQLParser.g:478:3: ( ( (lv_l1_2_0= RULE_UNSIGNED ) ) (otherlv_3= Comma ( (lv_l2_4_0= RULE_UNSIGNED ) ) )? )
                    {
                    // InternalSQLParser.g:478:3: ( ( (lv_l1_2_0= RULE_UNSIGNED ) ) (otherlv_3= Comma ( (lv_l2_4_0= RULE_UNSIGNED ) ) )? )
                    // InternalSQLParser.g:479:4: ( (lv_l1_2_0= RULE_UNSIGNED ) ) (otherlv_3= Comma ( (lv_l2_4_0= RULE_UNSIGNED ) ) )?
                    {
                    // InternalSQLParser.g:479:4: ( (lv_l1_2_0= RULE_UNSIGNED ) )
                    // InternalSQLParser.g:480:5: (lv_l1_2_0= RULE_UNSIGNED )
                    {
                    // InternalSQLParser.g:480:5: (lv_l1_2_0= RULE_UNSIGNED )
                    // InternalSQLParser.g:481:6: lv_l1_2_0= RULE_UNSIGNED
                    {
                    lv_l1_2_0=(Token)match(input,RULE_UNSIGNED,FOLLOW_9); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_l1_2_0, grammarAccess.getLimitAccess().getL1UNSIGNEDTerminalRuleCall_1_0_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getLimitRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"l1",
                      							lv_l1_2_0,
                      							"org.xtext.example.mydsl_sql.SQL.UNSIGNED");
                      					
                    }

                    }


                    }

                    // InternalSQLParser.g:497:4: (otherlv_3= Comma ( (lv_l2_4_0= RULE_UNSIGNED ) ) )?
                    int alt7=2;
                    int LA7_0 = input.LA(1);

                    if ( (LA7_0==Comma) ) {
                        alt7=1;
                    }
                    switch (alt7) {
                        case 1 :
                            // InternalSQLParser.g:498:5: otherlv_3= Comma ( (lv_l2_4_0= RULE_UNSIGNED ) )
                            {
                            otherlv_3=(Token)match(input,Comma,FOLLOW_12); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_3, grammarAccess.getLimitAccess().getCommaKeyword_1_1_0());
                              				
                            }
                            // InternalSQLParser.g:502:5: ( (lv_l2_4_0= RULE_UNSIGNED ) )
                            // InternalSQLParser.g:503:6: (lv_l2_4_0= RULE_UNSIGNED )
                            {
                            // InternalSQLParser.g:503:6: (lv_l2_4_0= RULE_UNSIGNED )
                            // InternalSQLParser.g:504:7: lv_l2_4_0= RULE_UNSIGNED
                            {
                            lv_l2_4_0=(Token)match(input,RULE_UNSIGNED,FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							newLeafNode(lv_l2_4_0, grammarAccess.getLimitAccess().getL2UNSIGNEDTerminalRuleCall_1_1_1_0());
                              						
                            }
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElement(grammarAccess.getLimitRule());
                              							}
                              							setWithLastConsumed(
                              								current,
                              								"l2",
                              								lv_l2_4_0,
                              								"org.xtext.example.mydsl_sql.SQL.UNSIGNED");
                              						
                            }

                            }


                            }


                            }
                            break;

                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLimit"


    // $ANTLR start "entryRuleSelectQuery"
    // InternalSQLParser.g:526:1: entryRuleSelectQuery returns [EObject current=null] : iv_ruleSelectQuery= ruleSelectQuery EOF ;
    public final EObject entryRuleSelectQuery() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSelectQuery = null;


        try {
            // InternalSQLParser.g:526:52: (iv_ruleSelectQuery= ruleSelectQuery EOF )
            // InternalSQLParser.g:527:2: iv_ruleSelectQuery= ruleSelectQuery EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSelectQueryRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleSelectQuery=ruleSelectQuery();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSelectQuery; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSelectQuery"


    // $ANTLR start "ruleSelectQuery"
    // InternalSQLParser.g:533:1: ruleSelectQuery returns [EObject current=null] : (this_Select_0= ruleSelect ( (lv_op_1_0= ruleSelectSubSet ) )* ) ;
    public final EObject ruleSelectQuery() throws RecognitionException {
        EObject current = null;

        EObject this_Select_0 = null;

        EObject lv_op_1_0 = null;



        	enterRule();

        try {
            // InternalSQLParser.g:539:2: ( (this_Select_0= ruleSelect ( (lv_op_1_0= ruleSelectSubSet ) )* ) )
            // InternalSQLParser.g:540:2: (this_Select_0= ruleSelect ( (lv_op_1_0= ruleSelectSubSet ) )* )
            {
            // InternalSQLParser.g:540:2: (this_Select_0= ruleSelect ( (lv_op_1_0= ruleSelectSubSet ) )* )
            // InternalSQLParser.g:541:3: this_Select_0= ruleSelect ( (lv_op_1_0= ruleSelectSubSet ) )*
            {
            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getSelectQueryAccess().getSelectParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_13);
            this_Select_0=ruleSelect();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_Select_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalSQLParser.g:552:3: ( (lv_op_1_0= ruleSelectSubSet ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==INTERSECT||LA9_0==EXCEPT||LA9_0==MINUS||LA9_0==UNION) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalSQLParser.g:553:4: (lv_op_1_0= ruleSelectSubSet )
            	    {
            	    // InternalSQLParser.g:553:4: (lv_op_1_0= ruleSelectSubSet )
            	    // InternalSQLParser.g:554:5: lv_op_1_0= ruleSelectSubSet
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getSelectQueryAccess().getOpSelectSubSetParserRuleCall_1_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_13);
            	    lv_op_1_0=ruleSelectSubSet();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getSelectQueryRule());
            	      					}
            	      					add(
            	      						current,
            	      						"op",
            	      						lv_op_1_0,
            	      						"org.xtext.example.mydsl_sql.SQL.SelectSubSet");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSelectQuery"


    // $ANTLR start "entryRuleSelectSubSet"
    // InternalSQLParser.g:575:1: entryRuleSelectSubSet returns [EObject current=null] : iv_ruleSelectSubSet= ruleSelectSubSet EOF ;
    public final EObject entryRuleSelectSubSet() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSelectSubSet = null;


        try {
            // InternalSQLParser.g:575:53: (iv_ruleSelectSubSet= ruleSelectSubSet EOF )
            // InternalSQLParser.g:576:2: iv_ruleSelectSubSet= ruleSelectSubSet EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSelectSubSetRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleSelectSubSet=ruleSelectSubSet();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSelectSubSet; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSelectSubSet"


    // $ANTLR start "ruleSelectSubSet"
    // InternalSQLParser.g:582:1: ruleSelectSubSet returns [EObject current=null] : ( ( ( (lv_op_0_1= UNION | lv_op_0_2= INTERSECT | lv_op_0_3= MINUS | lv_op_0_4= EXCEPT ) ) ) ( (lv_all_1_0= ALL ) )? ( (lv_query_2_0= ruleSelect ) ) ) ;
    public final EObject ruleSelectSubSet() throws RecognitionException {
        EObject current = null;

        Token lv_op_0_1=null;
        Token lv_op_0_2=null;
        Token lv_op_0_3=null;
        Token lv_op_0_4=null;
        Token lv_all_1_0=null;
        EObject lv_query_2_0 = null;



        	enterRule();

        try {
            // InternalSQLParser.g:588:2: ( ( ( ( (lv_op_0_1= UNION | lv_op_0_2= INTERSECT | lv_op_0_3= MINUS | lv_op_0_4= EXCEPT ) ) ) ( (lv_all_1_0= ALL ) )? ( (lv_query_2_0= ruleSelect ) ) ) )
            // InternalSQLParser.g:589:2: ( ( ( (lv_op_0_1= UNION | lv_op_0_2= INTERSECT | lv_op_0_3= MINUS | lv_op_0_4= EXCEPT ) ) ) ( (lv_all_1_0= ALL ) )? ( (lv_query_2_0= ruleSelect ) ) )
            {
            // InternalSQLParser.g:589:2: ( ( ( (lv_op_0_1= UNION | lv_op_0_2= INTERSECT | lv_op_0_3= MINUS | lv_op_0_4= EXCEPT ) ) ) ( (lv_all_1_0= ALL ) )? ( (lv_query_2_0= ruleSelect ) ) )
            // InternalSQLParser.g:590:3: ( ( (lv_op_0_1= UNION | lv_op_0_2= INTERSECT | lv_op_0_3= MINUS | lv_op_0_4= EXCEPT ) ) ) ( (lv_all_1_0= ALL ) )? ( (lv_query_2_0= ruleSelect ) )
            {
            // InternalSQLParser.g:590:3: ( ( (lv_op_0_1= UNION | lv_op_0_2= INTERSECT | lv_op_0_3= MINUS | lv_op_0_4= EXCEPT ) ) )
            // InternalSQLParser.g:591:4: ( (lv_op_0_1= UNION | lv_op_0_2= INTERSECT | lv_op_0_3= MINUS | lv_op_0_4= EXCEPT ) )
            {
            // InternalSQLParser.g:591:4: ( (lv_op_0_1= UNION | lv_op_0_2= INTERSECT | lv_op_0_3= MINUS | lv_op_0_4= EXCEPT ) )
            // InternalSQLParser.g:592:5: (lv_op_0_1= UNION | lv_op_0_2= INTERSECT | lv_op_0_3= MINUS | lv_op_0_4= EXCEPT )
            {
            // InternalSQLParser.g:592:5: (lv_op_0_1= UNION | lv_op_0_2= INTERSECT | lv_op_0_3= MINUS | lv_op_0_4= EXCEPT )
            int alt10=4;
            switch ( input.LA(1) ) {
            case UNION:
                {
                alt10=1;
                }
                break;
            case INTERSECT:
                {
                alt10=2;
                }
                break;
            case MINUS:
                {
                alt10=3;
                }
                break;
            case EXCEPT:
                {
                alt10=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // InternalSQLParser.g:593:6: lv_op_0_1= UNION
                    {
                    lv_op_0_1=(Token)match(input,UNION,FOLLOW_14); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_op_0_1, grammarAccess.getSelectSubSetAccess().getOpUNIONKeyword_0_0_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getSelectSubSetRule());
                      						}
                      						setWithLastConsumed(current, "op", lv_op_0_1, null);
                      					
                    }

                    }
                    break;
                case 2 :
                    // InternalSQLParser.g:604:6: lv_op_0_2= INTERSECT
                    {
                    lv_op_0_2=(Token)match(input,INTERSECT,FOLLOW_14); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_op_0_2, grammarAccess.getSelectSubSetAccess().getOpINTERSECTKeyword_0_0_1());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getSelectSubSetRule());
                      						}
                      						setWithLastConsumed(current, "op", lv_op_0_2, null);
                      					
                    }

                    }
                    break;
                case 3 :
                    // InternalSQLParser.g:615:6: lv_op_0_3= MINUS
                    {
                    lv_op_0_3=(Token)match(input,MINUS,FOLLOW_14); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_op_0_3, grammarAccess.getSelectSubSetAccess().getOpMINUSKeyword_0_0_2());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getSelectSubSetRule());
                      						}
                      						setWithLastConsumed(current, "op", lv_op_0_3, null);
                      					
                    }

                    }
                    break;
                case 4 :
                    // InternalSQLParser.g:626:6: lv_op_0_4= EXCEPT
                    {
                    lv_op_0_4=(Token)match(input,EXCEPT,FOLLOW_14); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_op_0_4, grammarAccess.getSelectSubSetAccess().getOpEXCEPTKeyword_0_0_3());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getSelectSubSetRule());
                      						}
                      						setWithLastConsumed(current, "op", lv_op_0_4, null);
                      					
                    }

                    }
                    break;

            }


            }


            }

            // InternalSQLParser.g:639:3: ( (lv_all_1_0= ALL ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==ALL) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalSQLParser.g:640:4: (lv_all_1_0= ALL )
                    {
                    // InternalSQLParser.g:640:4: (lv_all_1_0= ALL )
                    // InternalSQLParser.g:641:5: lv_all_1_0= ALL
                    {
                    lv_all_1_0=(Token)match(input,ALL,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_all_1_0, grammarAccess.getSelectSubSetAccess().getAllALLKeyword_1_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getSelectSubSetRule());
                      					}
                      					setWithLastConsumed(current, "all", lv_all_1_0, "ALL");
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalSQLParser.g:653:3: ( (lv_query_2_0= ruleSelect ) )
            // InternalSQLParser.g:654:4: (lv_query_2_0= ruleSelect )
            {
            // InternalSQLParser.g:654:4: (lv_query_2_0= ruleSelect )
            // InternalSQLParser.g:655:5: lv_query_2_0= ruleSelect
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getSelectSubSetAccess().getQuerySelectParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_query_2_0=ruleSelect();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getSelectSubSetRule());
              					}
              					set(
              						current,
              						"query",
              						lv_query_2_0,
              						"org.xtext.example.mydsl_sql.SQL.Select");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSelectSubSet"


    // $ANTLR start "entryRuleSelect"
    // InternalSQLParser.g:676:1: entryRuleSelect returns [EObject current=null] : iv_ruleSelect= ruleSelect EOF ;
    public final EObject entryRuleSelect() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSelect = null;


        try {
            // InternalSQLParser.g:676:47: (iv_ruleSelect= ruleSelect EOF )
            // InternalSQLParser.g:677:2: iv_ruleSelect= ruleSelect EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSelectRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleSelect=ruleSelect();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSelect; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSelect"


    // $ANTLR start "ruleSelect"
    // InternalSQLParser.g:683:1: ruleSelect returns [EObject current=null] : ( ( (lv_select_0_0= SELECT ) ) (otherlv_1= DISTINCT )? (otherlv_2= TOP (this_INT_3= RULE_INT | this_SIGNED_DOUBLE_4= RULE_SIGNED_DOUBLE ) (otherlv_5= PERCENT )? (otherlv_6= WITH otherlv_7= TIES )? )? ( (lv_cols_8_0= ruleColumns ) ) otherlv_9= FROM ( (lv_tbl_10_0= ruleTables ) ) (otherlv_11= WHERE ( (lv_whereExpression_12_0= ruleFullExpression ) ) )? (otherlv_13= GROUP otherlv_14= BY ( (lv_groupByEntry_15_0= ruleGroupByColumns ) ) )? (otherlv_16= HAVING ( (lv_havingEntry_17_0= ruleFullExpression ) ) )? (otherlv_18= ORDER otherlv_19= BY ( (lv_orderByEntry_20_0= ruleOrderByColumns ) ) )? (otherlv_21= LIMIT ( (lv_lim_22_0= ruleLimit ) ) )? (otherlv_23= OFFSET ( (lv_offset_24_0= ruleOffset ) ) )? (otherlv_25= FETCH otherlv_26= FIRST ( (lv_fetchFirst_27_0= ruleFetchFirst ) ) )? ) ;
    public final EObject ruleSelect() throws RecognitionException {
        EObject current = null;

        Token lv_select_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token this_INT_3=null;
        Token this_SIGNED_DOUBLE_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        Token otherlv_23=null;
        Token otherlv_25=null;
        Token otherlv_26=null;
        EObject lv_cols_8_0 = null;

        EObject lv_tbl_10_0 = null;

        EObject lv_whereExpression_12_0 = null;

        EObject lv_groupByEntry_15_0 = null;

        EObject lv_havingEntry_17_0 = null;

        EObject lv_orderByEntry_20_0 = null;

        EObject lv_lim_22_0 = null;

        EObject lv_offset_24_0 = null;

        EObject lv_fetchFirst_27_0 = null;



        	enterRule();

        try {
            // InternalSQLParser.g:689:2: ( ( ( (lv_select_0_0= SELECT ) ) (otherlv_1= DISTINCT )? (otherlv_2= TOP (this_INT_3= RULE_INT | this_SIGNED_DOUBLE_4= RULE_SIGNED_DOUBLE ) (otherlv_5= PERCENT )? (otherlv_6= WITH otherlv_7= TIES )? )? ( (lv_cols_8_0= ruleColumns ) ) otherlv_9= FROM ( (lv_tbl_10_0= ruleTables ) ) (otherlv_11= WHERE ( (lv_whereExpression_12_0= ruleFullExpression ) ) )? (otherlv_13= GROUP otherlv_14= BY ( (lv_groupByEntry_15_0= ruleGroupByColumns ) ) )? (otherlv_16= HAVING ( (lv_havingEntry_17_0= ruleFullExpression ) ) )? (otherlv_18= ORDER otherlv_19= BY ( (lv_orderByEntry_20_0= ruleOrderByColumns ) ) )? (otherlv_21= LIMIT ( (lv_lim_22_0= ruleLimit ) ) )? (otherlv_23= OFFSET ( (lv_offset_24_0= ruleOffset ) ) )? (otherlv_25= FETCH otherlv_26= FIRST ( (lv_fetchFirst_27_0= ruleFetchFirst ) ) )? ) )
            // InternalSQLParser.g:690:2: ( ( (lv_select_0_0= SELECT ) ) (otherlv_1= DISTINCT )? (otherlv_2= TOP (this_INT_3= RULE_INT | this_SIGNED_DOUBLE_4= RULE_SIGNED_DOUBLE ) (otherlv_5= PERCENT )? (otherlv_6= WITH otherlv_7= TIES )? )? ( (lv_cols_8_0= ruleColumns ) ) otherlv_9= FROM ( (lv_tbl_10_0= ruleTables ) ) (otherlv_11= WHERE ( (lv_whereExpression_12_0= ruleFullExpression ) ) )? (otherlv_13= GROUP otherlv_14= BY ( (lv_groupByEntry_15_0= ruleGroupByColumns ) ) )? (otherlv_16= HAVING ( (lv_havingEntry_17_0= ruleFullExpression ) ) )? (otherlv_18= ORDER otherlv_19= BY ( (lv_orderByEntry_20_0= ruleOrderByColumns ) ) )? (otherlv_21= LIMIT ( (lv_lim_22_0= ruleLimit ) ) )? (otherlv_23= OFFSET ( (lv_offset_24_0= ruleOffset ) ) )? (otherlv_25= FETCH otherlv_26= FIRST ( (lv_fetchFirst_27_0= ruleFetchFirst ) ) )? )
            {
            // InternalSQLParser.g:690:2: ( ( (lv_select_0_0= SELECT ) ) (otherlv_1= DISTINCT )? (otherlv_2= TOP (this_INT_3= RULE_INT | this_SIGNED_DOUBLE_4= RULE_SIGNED_DOUBLE ) (otherlv_5= PERCENT )? (otherlv_6= WITH otherlv_7= TIES )? )? ( (lv_cols_8_0= ruleColumns ) ) otherlv_9= FROM ( (lv_tbl_10_0= ruleTables ) ) (otherlv_11= WHERE ( (lv_whereExpression_12_0= ruleFullExpression ) ) )? (otherlv_13= GROUP otherlv_14= BY ( (lv_groupByEntry_15_0= ruleGroupByColumns ) ) )? (otherlv_16= HAVING ( (lv_havingEntry_17_0= ruleFullExpression ) ) )? (otherlv_18= ORDER otherlv_19= BY ( (lv_orderByEntry_20_0= ruleOrderByColumns ) ) )? (otherlv_21= LIMIT ( (lv_lim_22_0= ruleLimit ) ) )? (otherlv_23= OFFSET ( (lv_offset_24_0= ruleOffset ) ) )? (otherlv_25= FETCH otherlv_26= FIRST ( (lv_fetchFirst_27_0= ruleFetchFirst ) ) )? )
            // InternalSQLParser.g:691:3: ( (lv_select_0_0= SELECT ) ) (otherlv_1= DISTINCT )? (otherlv_2= TOP (this_INT_3= RULE_INT | this_SIGNED_DOUBLE_4= RULE_SIGNED_DOUBLE ) (otherlv_5= PERCENT )? (otherlv_6= WITH otherlv_7= TIES )? )? ( (lv_cols_8_0= ruleColumns ) ) otherlv_9= FROM ( (lv_tbl_10_0= ruleTables ) ) (otherlv_11= WHERE ( (lv_whereExpression_12_0= ruleFullExpression ) ) )? (otherlv_13= GROUP otherlv_14= BY ( (lv_groupByEntry_15_0= ruleGroupByColumns ) ) )? (otherlv_16= HAVING ( (lv_havingEntry_17_0= ruleFullExpression ) ) )? (otherlv_18= ORDER otherlv_19= BY ( (lv_orderByEntry_20_0= ruleOrderByColumns ) ) )? (otherlv_21= LIMIT ( (lv_lim_22_0= ruleLimit ) ) )? (otherlv_23= OFFSET ( (lv_offset_24_0= ruleOffset ) ) )? (otherlv_25= FETCH otherlv_26= FIRST ( (lv_fetchFirst_27_0= ruleFetchFirst ) ) )?
            {
            // InternalSQLParser.g:691:3: ( (lv_select_0_0= SELECT ) )
            // InternalSQLParser.g:692:4: (lv_select_0_0= SELECT )
            {
            // InternalSQLParser.g:692:4: (lv_select_0_0= SELECT )
            // InternalSQLParser.g:693:5: lv_select_0_0= SELECT
            {
            lv_select_0_0=(Token)match(input,SELECT,FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_select_0_0, grammarAccess.getSelectAccess().getSelectSELECTKeyword_0_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getSelectRule());
              					}
              					setWithLastConsumed(current, "select", lv_select_0_0, "SELECT");
              				
            }

            }


            }

            // InternalSQLParser.g:705:3: (otherlv_1= DISTINCT )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==DISTINCT) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalSQLParser.g:706:4: otherlv_1= DISTINCT
                    {
                    otherlv_1=(Token)match(input,DISTINCT,FOLLOW_15); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getSelectAccess().getDISTINCTKeyword_1());
                      			
                    }

                    }
                    break;

            }

            // InternalSQLParser.g:711:3: (otherlv_2= TOP (this_INT_3= RULE_INT | this_SIGNED_DOUBLE_4= RULE_SIGNED_DOUBLE ) (otherlv_5= PERCENT )? (otherlv_6= WITH otherlv_7= TIES )? )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==TOP) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalSQLParser.g:712:4: otherlv_2= TOP (this_INT_3= RULE_INT | this_SIGNED_DOUBLE_4= RULE_SIGNED_DOUBLE ) (otherlv_5= PERCENT )? (otherlv_6= WITH otherlv_7= TIES )?
                    {
                    otherlv_2=(Token)match(input,TOP,FOLLOW_16); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getSelectAccess().getTOPKeyword_2_0());
                      			
                    }
                    // InternalSQLParser.g:716:4: (this_INT_3= RULE_INT | this_SIGNED_DOUBLE_4= RULE_SIGNED_DOUBLE )
                    int alt13=2;
                    int LA13_0 = input.LA(1);

                    if ( (LA13_0==RULE_INT) ) {
                        alt13=1;
                    }
                    else if ( (LA13_0==RULE_SIGNED_DOUBLE) ) {
                        alt13=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 13, 0, input);

                        throw nvae;
                    }
                    switch (alt13) {
                        case 1 :
                            // InternalSQLParser.g:717:5: this_INT_3= RULE_INT
                            {
                            this_INT_3=(Token)match(input,RULE_INT,FOLLOW_17); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(this_INT_3, grammarAccess.getSelectAccess().getINTTerminalRuleCall_2_1_0());
                              				
                            }

                            }
                            break;
                        case 2 :
                            // InternalSQLParser.g:722:5: this_SIGNED_DOUBLE_4= RULE_SIGNED_DOUBLE
                            {
                            this_SIGNED_DOUBLE_4=(Token)match(input,RULE_SIGNED_DOUBLE,FOLLOW_17); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(this_SIGNED_DOUBLE_4, grammarAccess.getSelectAccess().getSIGNED_DOUBLETerminalRuleCall_2_1_1());
                              				
                            }

                            }
                            break;

                    }

                    // InternalSQLParser.g:727:4: (otherlv_5= PERCENT )?
                    int alt14=2;
                    int LA14_0 = input.LA(1);

                    if ( (LA14_0==PERCENT) ) {
                        alt14=1;
                    }
                    switch (alt14) {
                        case 1 :
                            // InternalSQLParser.g:728:5: otherlv_5= PERCENT
                            {
                            otherlv_5=(Token)match(input,PERCENT,FOLLOW_18); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_5, grammarAccess.getSelectAccess().getPERCENTKeyword_2_2());
                              				
                            }

                            }
                            break;

                    }

                    // InternalSQLParser.g:733:4: (otherlv_6= WITH otherlv_7= TIES )?
                    int alt15=2;
                    int LA15_0 = input.LA(1);

                    if ( (LA15_0==WITH) ) {
                        alt15=1;
                    }
                    switch (alt15) {
                        case 1 :
                            // InternalSQLParser.g:734:5: otherlv_6= WITH otherlv_7= TIES
                            {
                            otherlv_6=(Token)match(input,WITH,FOLLOW_19); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_6, grammarAccess.getSelectAccess().getWITHKeyword_2_3_0());
                              				
                            }
                            otherlv_7=(Token)match(input,TIES,FOLLOW_15); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_7, grammarAccess.getSelectAccess().getTIESKeyword_2_3_1());
                              				
                            }

                            }
                            break;

                    }


                    }
                    break;

            }

            // InternalSQLParser.g:744:3: ( (lv_cols_8_0= ruleColumns ) )
            // InternalSQLParser.g:745:4: (lv_cols_8_0= ruleColumns )
            {
            // InternalSQLParser.g:745:4: (lv_cols_8_0= ruleColumns )
            // InternalSQLParser.g:746:5: lv_cols_8_0= ruleColumns
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getSelectAccess().getColsColumnsParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_20);
            lv_cols_8_0=ruleColumns();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getSelectRule());
              					}
              					set(
              						current,
              						"cols",
              						lv_cols_8_0,
              						"org.xtext.example.mydsl_sql.SQL.Columns");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_9=(Token)match(input,FROM,FOLLOW_21); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_9, grammarAccess.getSelectAccess().getFROMKeyword_4());
              		
            }
            // InternalSQLParser.g:767:3: ( (lv_tbl_10_0= ruleTables ) )
            // InternalSQLParser.g:768:4: (lv_tbl_10_0= ruleTables )
            {
            // InternalSQLParser.g:768:4: (lv_tbl_10_0= ruleTables )
            // InternalSQLParser.g:769:5: lv_tbl_10_0= ruleTables
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getSelectAccess().getTblTablesParserRuleCall_5_0());
              				
            }
            pushFollow(FOLLOW_22);
            lv_tbl_10_0=ruleTables();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getSelectRule());
              					}
              					set(
              						current,
              						"tbl",
              						lv_tbl_10_0,
              						"org.xtext.example.mydsl_sql.SQL.Tables");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalSQLParser.g:786:3: (otherlv_11= WHERE ( (lv_whereExpression_12_0= ruleFullExpression ) ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==WHERE) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalSQLParser.g:787:4: otherlv_11= WHERE ( (lv_whereExpression_12_0= ruleFullExpression ) )
                    {
                    otherlv_11=(Token)match(input,WHERE,FOLLOW_23); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_11, grammarAccess.getSelectAccess().getWHEREKeyword_6_0());
                      			
                    }
                    // InternalSQLParser.g:791:4: ( (lv_whereExpression_12_0= ruleFullExpression ) )
                    // InternalSQLParser.g:792:5: (lv_whereExpression_12_0= ruleFullExpression )
                    {
                    // InternalSQLParser.g:792:5: (lv_whereExpression_12_0= ruleFullExpression )
                    // InternalSQLParser.g:793:6: lv_whereExpression_12_0= ruleFullExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getSelectAccess().getWhereExpressionFullExpressionParserRuleCall_6_1_0());
                      					
                    }
                    pushFollow(FOLLOW_24);
                    lv_whereExpression_12_0=ruleFullExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getSelectRule());
                      						}
                      						set(
                      							current,
                      							"whereExpression",
                      							lv_whereExpression_12_0,
                      							"org.xtext.example.mydsl_sql.SQL.FullExpression");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            // InternalSQLParser.g:811:3: (otherlv_13= GROUP otherlv_14= BY ( (lv_groupByEntry_15_0= ruleGroupByColumns ) ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==GROUP) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalSQLParser.g:812:4: otherlv_13= GROUP otherlv_14= BY ( (lv_groupByEntry_15_0= ruleGroupByColumns ) )
                    {
                    otherlv_13=(Token)match(input,GROUP,FOLLOW_25); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_13, grammarAccess.getSelectAccess().getGROUPKeyword_7_0());
                      			
                    }
                    otherlv_14=(Token)match(input,BY,FOLLOW_26); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_14, grammarAccess.getSelectAccess().getBYKeyword_7_1());
                      			
                    }
                    // InternalSQLParser.g:820:4: ( (lv_groupByEntry_15_0= ruleGroupByColumns ) )
                    // InternalSQLParser.g:821:5: (lv_groupByEntry_15_0= ruleGroupByColumns )
                    {
                    // InternalSQLParser.g:821:5: (lv_groupByEntry_15_0= ruleGroupByColumns )
                    // InternalSQLParser.g:822:6: lv_groupByEntry_15_0= ruleGroupByColumns
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getSelectAccess().getGroupByEntryGroupByColumnsParserRuleCall_7_2_0());
                      					
                    }
                    pushFollow(FOLLOW_27);
                    lv_groupByEntry_15_0=ruleGroupByColumns();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getSelectRule());
                      						}
                      						set(
                      							current,
                      							"groupByEntry",
                      							lv_groupByEntry_15_0,
                      							"org.xtext.example.mydsl_sql.SQL.GroupByColumns");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            // InternalSQLParser.g:840:3: (otherlv_16= HAVING ( (lv_havingEntry_17_0= ruleFullExpression ) ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==HAVING) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalSQLParser.g:841:4: otherlv_16= HAVING ( (lv_havingEntry_17_0= ruleFullExpression ) )
                    {
                    otherlv_16=(Token)match(input,HAVING,FOLLOW_23); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_16, grammarAccess.getSelectAccess().getHAVINGKeyword_8_0());
                      			
                    }
                    // InternalSQLParser.g:845:4: ( (lv_havingEntry_17_0= ruleFullExpression ) )
                    // InternalSQLParser.g:846:5: (lv_havingEntry_17_0= ruleFullExpression )
                    {
                    // InternalSQLParser.g:846:5: (lv_havingEntry_17_0= ruleFullExpression )
                    // InternalSQLParser.g:847:6: lv_havingEntry_17_0= ruleFullExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getSelectAccess().getHavingEntryFullExpressionParserRuleCall_8_1_0());
                      					
                    }
                    pushFollow(FOLLOW_28);
                    lv_havingEntry_17_0=ruleFullExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getSelectRule());
                      						}
                      						set(
                      							current,
                      							"havingEntry",
                      							lv_havingEntry_17_0,
                      							"org.xtext.example.mydsl_sql.SQL.FullExpression");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            // InternalSQLParser.g:865:3: (otherlv_18= ORDER otherlv_19= BY ( (lv_orderByEntry_20_0= ruleOrderByColumns ) ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==ORDER) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalSQLParser.g:866:4: otherlv_18= ORDER otherlv_19= BY ( (lv_orderByEntry_20_0= ruleOrderByColumns ) )
                    {
                    otherlv_18=(Token)match(input,ORDER,FOLLOW_25); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_18, grammarAccess.getSelectAccess().getORDERKeyword_9_0());
                      			
                    }
                    otherlv_19=(Token)match(input,BY,FOLLOW_26); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_19, grammarAccess.getSelectAccess().getBYKeyword_9_1());
                      			
                    }
                    // InternalSQLParser.g:874:4: ( (lv_orderByEntry_20_0= ruleOrderByColumns ) )
                    // InternalSQLParser.g:875:5: (lv_orderByEntry_20_0= ruleOrderByColumns )
                    {
                    // InternalSQLParser.g:875:5: (lv_orderByEntry_20_0= ruleOrderByColumns )
                    // InternalSQLParser.g:876:6: lv_orderByEntry_20_0= ruleOrderByColumns
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getSelectAccess().getOrderByEntryOrderByColumnsParserRuleCall_9_2_0());
                      					
                    }
                    pushFollow(FOLLOW_29);
                    lv_orderByEntry_20_0=ruleOrderByColumns();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getSelectRule());
                      						}
                      						set(
                      							current,
                      							"orderByEntry",
                      							lv_orderByEntry_20_0,
                      							"org.xtext.example.mydsl_sql.SQL.OrderByColumns");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            // InternalSQLParser.g:894:3: (otherlv_21= LIMIT ( (lv_lim_22_0= ruleLimit ) ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==LIMIT) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalSQLParser.g:895:4: otherlv_21= LIMIT ( (lv_lim_22_0= ruleLimit ) )
                    {
                    otherlv_21=(Token)match(input,LIMIT,FOLLOW_30); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_21, grammarAccess.getSelectAccess().getLIMITKeyword_10_0());
                      			
                    }
                    // InternalSQLParser.g:899:4: ( (lv_lim_22_0= ruleLimit ) )
                    // InternalSQLParser.g:900:5: (lv_lim_22_0= ruleLimit )
                    {
                    // InternalSQLParser.g:900:5: (lv_lim_22_0= ruleLimit )
                    // InternalSQLParser.g:901:6: lv_lim_22_0= ruleLimit
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getSelectAccess().getLimLimitParserRuleCall_10_1_0());
                      					
                    }
                    pushFollow(FOLLOW_31);
                    lv_lim_22_0=ruleLimit();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getSelectRule());
                      						}
                      						set(
                      							current,
                      							"lim",
                      							lv_lim_22_0,
                      							"org.xtext.example.mydsl_sql.SQL.Limit");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            // InternalSQLParser.g:919:3: (otherlv_23= OFFSET ( (lv_offset_24_0= ruleOffset ) ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==OFFSET) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalSQLParser.g:920:4: otherlv_23= OFFSET ( (lv_offset_24_0= ruleOffset ) )
                    {
                    otherlv_23=(Token)match(input,OFFSET,FOLLOW_32); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_23, grammarAccess.getSelectAccess().getOFFSETKeyword_11_0());
                      			
                    }
                    // InternalSQLParser.g:924:4: ( (lv_offset_24_0= ruleOffset ) )
                    // InternalSQLParser.g:925:5: (lv_offset_24_0= ruleOffset )
                    {
                    // InternalSQLParser.g:925:5: (lv_offset_24_0= ruleOffset )
                    // InternalSQLParser.g:926:6: lv_offset_24_0= ruleOffset
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getSelectAccess().getOffsetOffsetParserRuleCall_11_1_0());
                      					
                    }
                    pushFollow(FOLLOW_33);
                    lv_offset_24_0=ruleOffset();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getSelectRule());
                      						}
                      						set(
                      							current,
                      							"offset",
                      							lv_offset_24_0,
                      							"org.xtext.example.mydsl_sql.SQL.Offset");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            // InternalSQLParser.g:944:3: (otherlv_25= FETCH otherlv_26= FIRST ( (lv_fetchFirst_27_0= ruleFetchFirst ) ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==FETCH) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalSQLParser.g:945:4: otherlv_25= FETCH otherlv_26= FIRST ( (lv_fetchFirst_27_0= ruleFetchFirst ) )
                    {
                    otherlv_25=(Token)match(input,FETCH,FOLLOW_34); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_25, grammarAccess.getSelectAccess().getFETCHKeyword_12_0());
                      			
                    }
                    otherlv_26=(Token)match(input,FIRST,FOLLOW_12); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_26, grammarAccess.getSelectAccess().getFIRSTKeyword_12_1());
                      			
                    }
                    // InternalSQLParser.g:953:4: ( (lv_fetchFirst_27_0= ruleFetchFirst ) )
                    // InternalSQLParser.g:954:5: (lv_fetchFirst_27_0= ruleFetchFirst )
                    {
                    // InternalSQLParser.g:954:5: (lv_fetchFirst_27_0= ruleFetchFirst )
                    // InternalSQLParser.g:955:6: lv_fetchFirst_27_0= ruleFetchFirst
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getSelectAccess().getFetchFirstFetchFirstParserRuleCall_12_2_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_fetchFirst_27_0=ruleFetchFirst();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getSelectRule());
                      						}
                      						set(
                      							current,
                      							"fetchFirst",
                      							lv_fetchFirst_27_0,
                      							"org.xtext.example.mydsl_sql.SQL.FetchFirst");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSelect"


    // $ANTLR start "entryRuleColumns"
    // InternalSQLParser.g:977:1: entryRuleColumns returns [EObject current=null] : iv_ruleColumns= ruleColumns EOF ;
    public final EObject entryRuleColumns() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleColumns = null;


        try {
            // InternalSQLParser.g:977:48: (iv_ruleColumns= ruleColumns EOF )
            // InternalSQLParser.g:978:2: iv_ruleColumns= ruleColumns EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getColumnsRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleColumns=ruleColumns();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleColumns; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleColumns"


    // $ANTLR start "ruleColumns"
    // InternalSQLParser.g:984:1: ruleColumns returns [EObject current=null] : (this_ColumnOrAlias_0= ruleColumnOrAlias ( () (otherlv_2= Comma ( (lv_entries_3_0= ruleColumnOrAlias ) ) )+ )? ) ;
    public final EObject ruleColumns() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_ColumnOrAlias_0 = null;

        EObject lv_entries_3_0 = null;



        	enterRule();

        try {
            // InternalSQLParser.g:990:2: ( (this_ColumnOrAlias_0= ruleColumnOrAlias ( () (otherlv_2= Comma ( (lv_entries_3_0= ruleColumnOrAlias ) ) )+ )? ) )
            // InternalSQLParser.g:991:2: (this_ColumnOrAlias_0= ruleColumnOrAlias ( () (otherlv_2= Comma ( (lv_entries_3_0= ruleColumnOrAlias ) ) )+ )? )
            {
            // InternalSQLParser.g:991:2: (this_ColumnOrAlias_0= ruleColumnOrAlias ( () (otherlv_2= Comma ( (lv_entries_3_0= ruleColumnOrAlias ) ) )+ )? )
            // InternalSQLParser.g:992:3: this_ColumnOrAlias_0= ruleColumnOrAlias ( () (otherlv_2= Comma ( (lv_entries_3_0= ruleColumnOrAlias ) ) )+ )?
            {
            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getColumnsAccess().getColumnOrAliasParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_9);
            this_ColumnOrAlias_0=ruleColumnOrAlias();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_ColumnOrAlias_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalSQLParser.g:1003:3: ( () (otherlv_2= Comma ( (lv_entries_3_0= ruleColumnOrAlias ) ) )+ )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==Comma) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalSQLParser.g:1004:4: () (otherlv_2= Comma ( (lv_entries_3_0= ruleColumnOrAlias ) ) )+
                    {
                    // InternalSQLParser.g:1004:4: ()
                    // InternalSQLParser.g:1005:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					/* */
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElementAndAdd(
                      						grammarAccess.getColumnsAccess().getOrColumnEntriesAction_1_0(),
                      						current);
                      				
                    }

                    }

                    // InternalSQLParser.g:1014:4: (otherlv_2= Comma ( (lv_entries_3_0= ruleColumnOrAlias ) ) )+
                    int cnt24=0;
                    loop24:
                    do {
                        int alt24=2;
                        int LA24_0 = input.LA(1);

                        if ( (LA24_0==Comma) ) {
                            alt24=1;
                        }


                        switch (alt24) {
                    	case 1 :
                    	    // InternalSQLParser.g:1015:5: otherlv_2= Comma ( (lv_entries_3_0= ruleColumnOrAlias ) )
                    	    {
                    	    otherlv_2=(Token)match(input,Comma,FOLLOW_15); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_2, grammarAccess.getColumnsAccess().getCommaKeyword_1_1_0());
                    	      				
                    	    }
                    	    // InternalSQLParser.g:1019:5: ( (lv_entries_3_0= ruleColumnOrAlias ) )
                    	    // InternalSQLParser.g:1020:6: (lv_entries_3_0= ruleColumnOrAlias )
                    	    {
                    	    // InternalSQLParser.g:1020:6: (lv_entries_3_0= ruleColumnOrAlias )
                    	    // InternalSQLParser.g:1021:7: lv_entries_3_0= ruleColumnOrAlias
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getColumnsAccess().getEntriesColumnOrAliasParserRuleCall_1_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_9);
                    	    lv_entries_3_0=ruleColumnOrAlias();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getColumnsRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"entries",
                    	      								lv_entries_3_0,
                    	      								"org.xtext.example.mydsl_sql.SQL.ColumnOrAlias");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt24 >= 1 ) break loop24;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(24, input);
                                throw eee;
                        }
                        cnt24++;
                    } while (true);


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleColumns"


    // $ANTLR start "entryRuleColumnOrAlias"
    // InternalSQLParser.g:1044:1: entryRuleColumnOrAlias returns [EObject current=null] : iv_ruleColumnOrAlias= ruleColumnOrAlias EOF ;
    public final EObject entryRuleColumnOrAlias() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleColumnOrAlias = null;


        try {
            // InternalSQLParser.g:1044:54: (iv_ruleColumnOrAlias= ruleColumnOrAlias EOF )
            // InternalSQLParser.g:1045:2: iv_ruleColumnOrAlias= ruleColumnOrAlias EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getColumnOrAliasRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleColumnOrAlias=ruleColumnOrAlias();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleColumnOrAlias; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleColumnOrAlias"


    // $ANTLR start "ruleColumnOrAlias"
    // InternalSQLParser.g:1051:1: ruleColumnOrAlias returns [EObject current=null] : ( ( ( (lv_ce_0_0= ruleOperandGroup ) ) ( (lv_alias_1_0= AS ) )? ( (lv_colAlias_2_0= ruleDbObjectName ) )? ) | ( (lv_allCols_3_0= RULE_STAR ) ) | ( (lv_dbAllCols_4_0= ruleDbObjectNameAll ) ) ) ;
    public final EObject ruleColumnOrAlias() throws RecognitionException {
        EObject current = null;

        Token lv_alias_1_0=null;
        Token lv_allCols_3_0=null;
        EObject lv_ce_0_0 = null;

        EObject lv_colAlias_2_0 = null;

        EObject lv_dbAllCols_4_0 = null;



        	enterRule();

        try {
            // InternalSQLParser.g:1057:2: ( ( ( ( (lv_ce_0_0= ruleOperandGroup ) ) ( (lv_alias_1_0= AS ) )? ( (lv_colAlias_2_0= ruleDbObjectName ) )? ) | ( (lv_allCols_3_0= RULE_STAR ) ) | ( (lv_dbAllCols_4_0= ruleDbObjectNameAll ) ) ) )
            // InternalSQLParser.g:1058:2: ( ( ( (lv_ce_0_0= ruleOperandGroup ) ) ( (lv_alias_1_0= AS ) )? ( (lv_colAlias_2_0= ruleDbObjectName ) )? ) | ( (lv_allCols_3_0= RULE_STAR ) ) | ( (lv_dbAllCols_4_0= ruleDbObjectNameAll ) ) )
            {
            // InternalSQLParser.g:1058:2: ( ( ( (lv_ce_0_0= ruleOperandGroup ) ) ( (lv_alias_1_0= AS ) )? ( (lv_colAlias_2_0= ruleDbObjectName ) )? ) | ( (lv_allCols_3_0= RULE_STAR ) ) | ( (lv_dbAllCols_4_0= ruleDbObjectNameAll ) ) )
            int alt28=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                int LA28_1 = input.LA(2);

                if ( (LA28_1==EOF||LA28_1==FROM||LA28_1==LeftParenthesisPlusSignRightParenthesis||LA28_1==AS||(LA28_1>=VerticalLineVerticalLine && LA28_1<=HyphenMinus)||LA28_1==Solidus||LA28_1==RULE_STAR||(LA28_1>=RULE_STRING && LA28_1<=RULE_ID)) ) {
                    alt28=1;
                }
                else if ( (LA28_1==FullStop) ) {
                    int LA28_6 = input.LA(3);

                    if ( ((LA28_6>=RULE_STRING && LA28_6<=RULE_ID)) ) {
                        alt28=1;
                    }
                    else if ( (LA28_6==RULE_STAR) ) {
                        alt28=3;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 28, 6, input);

                        throw nvae;
                    }
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 28, 1, input);

                    throw nvae;
                }
                }
                break;
            case RULE_DBNAME:
                {
                int LA28_2 = input.LA(2);

                if ( (LA28_2==FullStop) ) {
                    int LA28_6 = input.LA(3);

                    if ( ((LA28_6>=RULE_STRING && LA28_6<=RULE_ID)) ) {
                        alt28=1;
                    }
                    else if ( (LA28_6==RULE_STAR) ) {
                        alt28=3;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 28, 6, input);

                        throw nvae;
                    }
                }
                else if ( (LA28_2==EOF||LA28_2==FROM||LA28_2==LeftParenthesisPlusSignRightParenthesis||LA28_2==AS||LA28_2==VerticalLineVerticalLine||(LA28_2>=RightParenthesis && LA28_2<=HyphenMinus)||LA28_2==Solidus||LA28_2==RULE_STAR||(LA28_2>=RULE_STRING && LA28_2<=RULE_ID)) ) {
                    alt28=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 28, 2, input);

                    throw nvae;
                }
                }
                break;
            case RULE_STRING:
                {
                int LA28_3 = input.LA(2);

                if ( (LA28_3==FullStop) ) {
                    int LA28_6 = input.LA(3);

                    if ( ((LA28_6>=RULE_STRING && LA28_6<=RULE_ID)) ) {
                        alt28=1;
                    }
                    else if ( (LA28_6==RULE_STAR) ) {
                        alt28=3;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 28, 6, input);

                        throw nvae;
                    }
                }
                else if ( (LA28_3==EOF||LA28_3==FROM||LA28_3==LeftParenthesisPlusSignRightParenthesis||LA28_3==AS||LA28_3==VerticalLineVerticalLine||(LA28_3>=RightParenthesis && LA28_3<=HyphenMinus)||LA28_3==Solidus||LA28_3==RULE_STAR||(LA28_3>=RULE_STRING && LA28_3<=RULE_ID)) ) {
                    alt28=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 28, 3, input);

                    throw nvae;
                }
                }
                break;
            case EXTRACT:
            case CAST:
            case CASE:
            case LeftParenthesis:
            case RULE_JRPARAM:
            case RULE_JRNPARAM:
            case RULE_UNSIGNED:
            case RULE_INT:
            case RULE_SIGNED_DOUBLE:
            case RULE_STRING_:
                {
                alt28=1;
                }
                break;
            case RULE_STAR:
                {
                alt28=2;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }

            switch (alt28) {
                case 1 :
                    // InternalSQLParser.g:1059:3: ( ( (lv_ce_0_0= ruleOperandGroup ) ) ( (lv_alias_1_0= AS ) )? ( (lv_colAlias_2_0= ruleDbObjectName ) )? )
                    {
                    // InternalSQLParser.g:1059:3: ( ( (lv_ce_0_0= ruleOperandGroup ) ) ( (lv_alias_1_0= AS ) )? ( (lv_colAlias_2_0= ruleDbObjectName ) )? )
                    // InternalSQLParser.g:1060:4: ( (lv_ce_0_0= ruleOperandGroup ) ) ( (lv_alias_1_0= AS ) )? ( (lv_colAlias_2_0= ruleDbObjectName ) )?
                    {
                    // InternalSQLParser.g:1060:4: ( (lv_ce_0_0= ruleOperandGroup ) )
                    // InternalSQLParser.g:1061:5: (lv_ce_0_0= ruleOperandGroup )
                    {
                    // InternalSQLParser.g:1061:5: (lv_ce_0_0= ruleOperandGroup )
                    // InternalSQLParser.g:1062:6: lv_ce_0_0= ruleOperandGroup
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getColumnOrAliasAccess().getCeOperandGroupParserRuleCall_0_0_0());
                      					
                    }
                    pushFollow(FOLLOW_35);
                    lv_ce_0_0=ruleOperandGroup();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getColumnOrAliasRule());
                      						}
                      						set(
                      							current,
                      							"ce",
                      							lv_ce_0_0,
                      							"org.xtext.example.mydsl_sql.SQL.OperandGroup");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalSQLParser.g:1079:4: ( (lv_alias_1_0= AS ) )?
                    int alt26=2;
                    int LA26_0 = input.LA(1);

                    if ( (LA26_0==AS) ) {
                        alt26=1;
                    }
                    switch (alt26) {
                        case 1 :
                            // InternalSQLParser.g:1080:5: (lv_alias_1_0= AS )
                            {
                            // InternalSQLParser.g:1080:5: (lv_alias_1_0= AS )
                            // InternalSQLParser.g:1081:6: lv_alias_1_0= AS
                            {
                            lv_alias_1_0=(Token)match(input,AS,FOLLOW_36); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(lv_alias_1_0, grammarAccess.getColumnOrAliasAccess().getAliasASKeyword_0_1_0());
                              					
                            }
                            if ( state.backtracking==0 ) {

                              						if (current==null) {
                              							current = createModelElement(grammarAccess.getColumnOrAliasRule());
                              						}
                              						setWithLastConsumed(current, "alias", lv_alias_1_0, "AS");
                              					
                            }

                            }


                            }
                            break;

                    }

                    // InternalSQLParser.g:1093:4: ( (lv_colAlias_2_0= ruleDbObjectName ) )?
                    int alt27=2;
                    int LA27_0 = input.LA(1);

                    if ( ((LA27_0>=RULE_STRING && LA27_0<=RULE_ID)) ) {
                        alt27=1;
                    }
                    switch (alt27) {
                        case 1 :
                            // InternalSQLParser.g:1094:5: (lv_colAlias_2_0= ruleDbObjectName )
                            {
                            // InternalSQLParser.g:1094:5: (lv_colAlias_2_0= ruleDbObjectName )
                            // InternalSQLParser.g:1095:6: lv_colAlias_2_0= ruleDbObjectName
                            {
                            if ( state.backtracking==0 ) {

                              						newCompositeNode(grammarAccess.getColumnOrAliasAccess().getColAliasDbObjectNameParserRuleCall_0_2_0());
                              					
                            }
                            pushFollow(FOLLOW_2);
                            lv_colAlias_2_0=ruleDbObjectName();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						if (current==null) {
                              							current = createModelElementForParent(grammarAccess.getColumnOrAliasRule());
                              						}
                              						set(
                              							current,
                              							"colAlias",
                              							lv_colAlias_2_0,
                              							"org.xtext.example.mydsl_sql.SQL.DbObjectName");
                              						afterParserOrEnumRuleCall();
                              					
                            }

                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalSQLParser.g:1114:3: ( (lv_allCols_3_0= RULE_STAR ) )
                    {
                    // InternalSQLParser.g:1114:3: ( (lv_allCols_3_0= RULE_STAR ) )
                    // InternalSQLParser.g:1115:4: (lv_allCols_3_0= RULE_STAR )
                    {
                    // InternalSQLParser.g:1115:4: (lv_allCols_3_0= RULE_STAR )
                    // InternalSQLParser.g:1116:5: lv_allCols_3_0= RULE_STAR
                    {
                    lv_allCols_3_0=(Token)match(input,RULE_STAR,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_allCols_3_0, grammarAccess.getColumnOrAliasAccess().getAllColsSTARTerminalRuleCall_1_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getColumnOrAliasRule());
                      					}
                      					setWithLastConsumed(
                      						current,
                      						"allCols",
                      						lv_allCols_3_0,
                      						"org.xtext.example.mydsl_sql.SQL.STAR");
                      				
                    }

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalSQLParser.g:1133:3: ( (lv_dbAllCols_4_0= ruleDbObjectNameAll ) )
                    {
                    // InternalSQLParser.g:1133:3: ( (lv_dbAllCols_4_0= ruleDbObjectNameAll ) )
                    // InternalSQLParser.g:1134:4: (lv_dbAllCols_4_0= ruleDbObjectNameAll )
                    {
                    // InternalSQLParser.g:1134:4: (lv_dbAllCols_4_0= ruleDbObjectNameAll )
                    // InternalSQLParser.g:1135:5: lv_dbAllCols_4_0= ruleDbObjectNameAll
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getColumnOrAliasAccess().getDbAllColsDbObjectNameAllParserRuleCall_2_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_dbAllCols_4_0=ruleDbObjectNameAll();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getColumnOrAliasRule());
                      					}
                      					set(
                      						current,
                      						"dbAllCols",
                      						lv_dbAllCols_4_0,
                      						"org.xtext.example.mydsl_sql.SQL.DbObjectNameAll");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleColumnOrAlias"


    // $ANTLR start "entryRuleColumnFull"
    // InternalSQLParser.g:1156:1: entryRuleColumnFull returns [EObject current=null] : iv_ruleColumnFull= ruleColumnFull EOF ;
    public final EObject entryRuleColumnFull() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleColumnFull = null;


        try {
            // InternalSQLParser.g:1156:51: (iv_ruleColumnFull= ruleColumnFull EOF )
            // InternalSQLParser.g:1157:2: iv_ruleColumnFull= ruleColumnFull EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getColumnFullRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleColumnFull=ruleColumnFull();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleColumnFull; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleColumnFull"


    // $ANTLR start "ruleColumnFull"
    // InternalSQLParser.g:1163:1: ruleColumnFull returns [EObject current=null] : (this_DbObjectName_0= ruleDbObjectName ( () (otherlv_2= FullStop ( (lv_entries_3_0= ruleDbObjectName ) ) )+ )? ) ;
    public final EObject ruleColumnFull() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_DbObjectName_0 = null;

        EObject lv_entries_3_0 = null;



        	enterRule();

        try {
            // InternalSQLParser.g:1169:2: ( (this_DbObjectName_0= ruleDbObjectName ( () (otherlv_2= FullStop ( (lv_entries_3_0= ruleDbObjectName ) ) )+ )? ) )
            // InternalSQLParser.g:1170:2: (this_DbObjectName_0= ruleDbObjectName ( () (otherlv_2= FullStop ( (lv_entries_3_0= ruleDbObjectName ) ) )+ )? )
            {
            // InternalSQLParser.g:1170:2: (this_DbObjectName_0= ruleDbObjectName ( () (otherlv_2= FullStop ( (lv_entries_3_0= ruleDbObjectName ) ) )+ )? )
            // InternalSQLParser.g:1171:3: this_DbObjectName_0= ruleDbObjectName ( () (otherlv_2= FullStop ( (lv_entries_3_0= ruleDbObjectName ) ) )+ )?
            {
            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getColumnFullAccess().getDbObjectNameParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_37);
            this_DbObjectName_0=ruleDbObjectName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_DbObjectName_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalSQLParser.g:1182:3: ( () (otherlv_2= FullStop ( (lv_entries_3_0= ruleDbObjectName ) ) )+ )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==FullStop) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalSQLParser.g:1183:4: () (otherlv_2= FullStop ( (lv_entries_3_0= ruleDbObjectName ) ) )+
                    {
                    // InternalSQLParser.g:1183:4: ()
                    // InternalSQLParser.g:1184:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					/* */
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElementAndAdd(
                      						grammarAccess.getColumnFullAccess().getColEntriesAction_1_0(),
                      						current);
                      				
                    }

                    }

                    // InternalSQLParser.g:1193:4: (otherlv_2= FullStop ( (lv_entries_3_0= ruleDbObjectName ) ) )+
                    int cnt29=0;
                    loop29:
                    do {
                        int alt29=2;
                        int LA29_0 = input.LA(1);

                        if ( (LA29_0==FullStop) ) {
                            alt29=1;
                        }


                        switch (alt29) {
                    	case 1 :
                    	    // InternalSQLParser.g:1194:5: otherlv_2= FullStop ( (lv_entries_3_0= ruleDbObjectName ) )
                    	    {
                    	    otherlv_2=(Token)match(input,FullStop,FOLLOW_4); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_2, grammarAccess.getColumnFullAccess().getFullStopKeyword_1_1_0());
                    	      				
                    	    }
                    	    // InternalSQLParser.g:1198:5: ( (lv_entries_3_0= ruleDbObjectName ) )
                    	    // InternalSQLParser.g:1199:6: (lv_entries_3_0= ruleDbObjectName )
                    	    {
                    	    // InternalSQLParser.g:1199:6: (lv_entries_3_0= ruleDbObjectName )
                    	    // InternalSQLParser.g:1200:7: lv_entries_3_0= ruleDbObjectName
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getColumnFullAccess().getEntriesDbObjectNameParserRuleCall_1_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_37);
                    	    lv_entries_3_0=ruleDbObjectName();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getColumnFullRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"entries",
                    	      								lv_entries_3_0,
                    	      								"org.xtext.example.mydsl_sql.SQL.DbObjectName");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt29 >= 1 ) break loop29;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(29, input);
                                throw eee;
                        }
                        cnt29++;
                    } while (true);


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleColumnFull"


    // $ANTLR start "entryRuleTables"
    // InternalSQLParser.g:1223:1: entryRuleTables returns [EObject current=null] : iv_ruleTables= ruleTables EOF ;
    public final EObject entryRuleTables() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTables = null;


        try {
            // InternalSQLParser.g:1223:47: (iv_ruleTables= ruleTables EOF )
            // InternalSQLParser.g:1224:2: iv_ruleTables= ruleTables EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTablesRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleTables=ruleTables();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTables; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTables"


    // $ANTLR start "ruleTables"
    // InternalSQLParser.g:1230:1: ruleTables returns [EObject current=null] : (this_FromTable_0= ruleFromTable ( () (otherlv_2= Comma ( (lv_entries_3_0= ruleFromTable ) ) )+ )? ) ;
    public final EObject ruleTables() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_FromTable_0 = null;

        EObject lv_entries_3_0 = null;



        	enterRule();

        try {
            // InternalSQLParser.g:1236:2: ( (this_FromTable_0= ruleFromTable ( () (otherlv_2= Comma ( (lv_entries_3_0= ruleFromTable ) ) )+ )? ) )
            // InternalSQLParser.g:1237:2: (this_FromTable_0= ruleFromTable ( () (otherlv_2= Comma ( (lv_entries_3_0= ruleFromTable ) ) )+ )? )
            {
            // InternalSQLParser.g:1237:2: (this_FromTable_0= ruleFromTable ( () (otherlv_2= Comma ( (lv_entries_3_0= ruleFromTable ) ) )+ )? )
            // InternalSQLParser.g:1238:3: this_FromTable_0= ruleFromTable ( () (otherlv_2= Comma ( (lv_entries_3_0= ruleFromTable ) ) )+ )?
            {
            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getTablesAccess().getFromTableParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_9);
            this_FromTable_0=ruleFromTable();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_FromTable_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalSQLParser.g:1249:3: ( () (otherlv_2= Comma ( (lv_entries_3_0= ruleFromTable ) ) )+ )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==Comma) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalSQLParser.g:1250:4: () (otherlv_2= Comma ( (lv_entries_3_0= ruleFromTable ) ) )+
                    {
                    // InternalSQLParser.g:1250:4: ()
                    // InternalSQLParser.g:1251:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					/* */
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElementAndAdd(
                      						grammarAccess.getTablesAccess().getOrTableEntriesAction_1_0(),
                      						current);
                      				
                    }

                    }

                    // InternalSQLParser.g:1260:4: (otherlv_2= Comma ( (lv_entries_3_0= ruleFromTable ) ) )+
                    int cnt31=0;
                    loop31:
                    do {
                        int alt31=2;
                        int LA31_0 = input.LA(1);

                        if ( (LA31_0==Comma) ) {
                            alt31=1;
                        }


                        switch (alt31) {
                    	case 1 :
                    	    // InternalSQLParser.g:1261:5: otherlv_2= Comma ( (lv_entries_3_0= ruleFromTable ) )
                    	    {
                    	    otherlv_2=(Token)match(input,Comma,FOLLOW_21); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_2, grammarAccess.getTablesAccess().getCommaKeyword_1_1_0());
                    	      				
                    	    }
                    	    // InternalSQLParser.g:1265:5: ( (lv_entries_3_0= ruleFromTable ) )
                    	    // InternalSQLParser.g:1266:6: (lv_entries_3_0= ruleFromTable )
                    	    {
                    	    // InternalSQLParser.g:1266:6: (lv_entries_3_0= ruleFromTable )
                    	    // InternalSQLParser.g:1267:7: lv_entries_3_0= ruleFromTable
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getTablesAccess().getEntriesFromTableParserRuleCall_1_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_9);
                    	    lv_entries_3_0=ruleFromTable();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getTablesRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"entries",
                    	      								lv_entries_3_0,
                    	      								"org.xtext.example.mydsl_sql.SQL.FromTable");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt31 >= 1 ) break loop31;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(31, input);
                                throw eee;
                        }
                        cnt31++;
                    } while (true);


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTables"


    // $ANTLR start "entryRuleFromTable"
    // InternalSQLParser.g:1290:1: entryRuleFromTable returns [EObject current=null] : iv_ruleFromTable= ruleFromTable EOF ;
    public final EObject entryRuleFromTable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFromTable = null;


        try {
            // InternalSQLParser.g:1290:50: (iv_ruleFromTable= ruleFromTable EOF )
            // InternalSQLParser.g:1291:2: iv_ruleFromTable= ruleFromTable EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFromTableRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleFromTable=ruleFromTable();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFromTable; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFromTable"


    // $ANTLR start "ruleFromTable"
    // InternalSQLParser.g:1297:1: ruleFromTable returns [EObject current=null] : ( ( (lv_table_0_0= ruleTableOrAlias ) ) ( (lv_fjoin_1_0= ruleFromTableJoin ) )* ) ;
    public final EObject ruleFromTable() throws RecognitionException {
        EObject current = null;

        EObject lv_table_0_0 = null;

        EObject lv_fjoin_1_0 = null;



        	enterRule();

        try {
            // InternalSQLParser.g:1303:2: ( ( ( (lv_table_0_0= ruleTableOrAlias ) ) ( (lv_fjoin_1_0= ruleFromTableJoin ) )* ) )
            // InternalSQLParser.g:1304:2: ( ( (lv_table_0_0= ruleTableOrAlias ) ) ( (lv_fjoin_1_0= ruleFromTableJoin ) )* )
            {
            // InternalSQLParser.g:1304:2: ( ( (lv_table_0_0= ruleTableOrAlias ) ) ( (lv_fjoin_1_0= ruleFromTableJoin ) )* )
            // InternalSQLParser.g:1305:3: ( (lv_table_0_0= ruleTableOrAlias ) ) ( (lv_fjoin_1_0= ruleFromTableJoin ) )*
            {
            // InternalSQLParser.g:1305:3: ( (lv_table_0_0= ruleTableOrAlias ) )
            // InternalSQLParser.g:1306:4: (lv_table_0_0= ruleTableOrAlias )
            {
            // InternalSQLParser.g:1306:4: (lv_table_0_0= ruleTableOrAlias )
            // InternalSQLParser.g:1307:5: lv_table_0_0= ruleTableOrAlias
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getFromTableAccess().getTableTableOrAliasParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_38);
            lv_table_0_0=ruleTableOrAlias();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getFromTableRule());
              					}
              					set(
              						current,
              						"table",
              						lv_table_0_0,
              						"org.xtext.example.mydsl_sql.SQL.TableOrAlias");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalSQLParser.g:1324:3: ( (lv_fjoin_1_0= ruleFromTableJoin ) )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==STRAIGHT_JOIN||LA33_0==NATURAL||LA33_0==CROSS||LA33_0==INNER||LA33_0==RIGHT||LA33_0==FULL||LA33_0==JOIN||LA33_0==LEFT) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // InternalSQLParser.g:1325:4: (lv_fjoin_1_0= ruleFromTableJoin )
            	    {
            	    // InternalSQLParser.g:1325:4: (lv_fjoin_1_0= ruleFromTableJoin )
            	    // InternalSQLParser.g:1326:5: lv_fjoin_1_0= ruleFromTableJoin
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getFromTableAccess().getFjoinFromTableJoinParserRuleCall_1_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_38);
            	    lv_fjoin_1_0=ruleFromTableJoin();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getFromTableRule());
            	      					}
            	      					add(
            	      						current,
            	      						"fjoin",
            	      						lv_fjoin_1_0,
            	      						"org.xtext.example.mydsl_sql.SQL.FromTableJoin");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop33;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFromTable"


    // $ANTLR start "entryRuleFromTableJoin"
    // InternalSQLParser.g:1347:1: entryRuleFromTableJoin returns [EObject current=null] : iv_ruleFromTableJoin= ruleFromTableJoin EOF ;
    public final EObject entryRuleFromTableJoin() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFromTableJoin = null;


        try {
            // InternalSQLParser.g:1347:54: (iv_ruleFromTableJoin= ruleFromTableJoin EOF )
            // InternalSQLParser.g:1348:2: iv_ruleFromTableJoin= ruleFromTableJoin EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFromTableJoinRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleFromTableJoin=ruleFromTableJoin();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFromTableJoin; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFromTableJoin"


    // $ANTLR start "ruleFromTableJoin"
    // InternalSQLParser.g:1354:1: ruleFromTableJoin returns [EObject current=null] : ( ( (lv_join_0_0= ruleJoinType ) ) ( (lv_onTable_1_0= ruleTableOrAlias ) ) ( (otherlv_2= ON ( (lv_joinExpr_3_0= ruleFullExpression ) ) ) | ( (lv_joinCond_4_0= ruleJoinCondition ) ) ) ) ;
    public final EObject ruleFromTableJoin() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_join_0_0 = null;

        EObject lv_onTable_1_0 = null;

        EObject lv_joinExpr_3_0 = null;

        EObject lv_joinCond_4_0 = null;



        	enterRule();

        try {
            // InternalSQLParser.g:1360:2: ( ( ( (lv_join_0_0= ruleJoinType ) ) ( (lv_onTable_1_0= ruleTableOrAlias ) ) ( (otherlv_2= ON ( (lv_joinExpr_3_0= ruleFullExpression ) ) ) | ( (lv_joinCond_4_0= ruleJoinCondition ) ) ) ) )
            // InternalSQLParser.g:1361:2: ( ( (lv_join_0_0= ruleJoinType ) ) ( (lv_onTable_1_0= ruleTableOrAlias ) ) ( (otherlv_2= ON ( (lv_joinExpr_3_0= ruleFullExpression ) ) ) | ( (lv_joinCond_4_0= ruleJoinCondition ) ) ) )
            {
            // InternalSQLParser.g:1361:2: ( ( (lv_join_0_0= ruleJoinType ) ) ( (lv_onTable_1_0= ruleTableOrAlias ) ) ( (otherlv_2= ON ( (lv_joinExpr_3_0= ruleFullExpression ) ) ) | ( (lv_joinCond_4_0= ruleJoinCondition ) ) ) )
            // InternalSQLParser.g:1362:3: ( (lv_join_0_0= ruleJoinType ) ) ( (lv_onTable_1_0= ruleTableOrAlias ) ) ( (otherlv_2= ON ( (lv_joinExpr_3_0= ruleFullExpression ) ) ) | ( (lv_joinCond_4_0= ruleJoinCondition ) ) )
            {
            // InternalSQLParser.g:1362:3: ( (lv_join_0_0= ruleJoinType ) )
            // InternalSQLParser.g:1363:4: (lv_join_0_0= ruleJoinType )
            {
            // InternalSQLParser.g:1363:4: (lv_join_0_0= ruleJoinType )
            // InternalSQLParser.g:1364:5: lv_join_0_0= ruleJoinType
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getFromTableJoinAccess().getJoinJoinTypeParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_21);
            lv_join_0_0=ruleJoinType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getFromTableJoinRule());
              					}
              					set(
              						current,
              						"join",
              						lv_join_0_0,
              						"org.xtext.example.mydsl_sql.SQL.JoinType");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalSQLParser.g:1381:3: ( (lv_onTable_1_0= ruleTableOrAlias ) )
            // InternalSQLParser.g:1382:4: (lv_onTable_1_0= ruleTableOrAlias )
            {
            // InternalSQLParser.g:1382:4: (lv_onTable_1_0= ruleTableOrAlias )
            // InternalSQLParser.g:1383:5: lv_onTable_1_0= ruleTableOrAlias
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getFromTableJoinAccess().getOnTableTableOrAliasParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_39);
            lv_onTable_1_0=ruleTableOrAlias();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getFromTableJoinRule());
              					}
              					set(
              						current,
              						"onTable",
              						lv_onTable_1_0,
              						"org.xtext.example.mydsl_sql.SQL.TableOrAlias");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalSQLParser.g:1400:3: ( (otherlv_2= ON ( (lv_joinExpr_3_0= ruleFullExpression ) ) ) | ( (lv_joinCond_4_0= ruleJoinCondition ) ) )
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==ON) ) {
                alt34=1;
            }
            else if ( (LA34_0==USING) ) {
                alt34=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 34, 0, input);

                throw nvae;
            }
            switch (alt34) {
                case 1 :
                    // InternalSQLParser.g:1401:4: (otherlv_2= ON ( (lv_joinExpr_3_0= ruleFullExpression ) ) )
                    {
                    // InternalSQLParser.g:1401:4: (otherlv_2= ON ( (lv_joinExpr_3_0= ruleFullExpression ) ) )
                    // InternalSQLParser.g:1402:5: otherlv_2= ON ( (lv_joinExpr_3_0= ruleFullExpression ) )
                    {
                    otherlv_2=(Token)match(input,ON,FOLLOW_23); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_2, grammarAccess.getFromTableJoinAccess().getONKeyword_2_0_0());
                      				
                    }
                    // InternalSQLParser.g:1406:5: ( (lv_joinExpr_3_0= ruleFullExpression ) )
                    // InternalSQLParser.g:1407:6: (lv_joinExpr_3_0= ruleFullExpression )
                    {
                    // InternalSQLParser.g:1407:6: (lv_joinExpr_3_0= ruleFullExpression )
                    // InternalSQLParser.g:1408:7: lv_joinExpr_3_0= ruleFullExpression
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getFromTableJoinAccess().getJoinExprFullExpressionParserRuleCall_2_0_1_0());
                      						
                    }
                    pushFollow(FOLLOW_2);
                    lv_joinExpr_3_0=ruleFullExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElementForParent(grammarAccess.getFromTableJoinRule());
                      							}
                      							set(
                      								current,
                      								"joinExpr",
                      								lv_joinExpr_3_0,
                      								"org.xtext.example.mydsl_sql.SQL.FullExpression");
                      							afterParserOrEnumRuleCall();
                      						
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalSQLParser.g:1427:4: ( (lv_joinCond_4_0= ruleJoinCondition ) )
                    {
                    // InternalSQLParser.g:1427:4: ( (lv_joinCond_4_0= ruleJoinCondition ) )
                    // InternalSQLParser.g:1428:5: (lv_joinCond_4_0= ruleJoinCondition )
                    {
                    // InternalSQLParser.g:1428:5: (lv_joinCond_4_0= ruleJoinCondition )
                    // InternalSQLParser.g:1429:6: lv_joinCond_4_0= ruleJoinCondition
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getFromTableJoinAccess().getJoinCondJoinConditionParserRuleCall_2_1_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_joinCond_4_0=ruleJoinCondition();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getFromTableJoinRule());
                      						}
                      						set(
                      							current,
                      							"joinCond",
                      							lv_joinCond_4_0,
                      							"org.xtext.example.mydsl_sql.SQL.JoinCondition");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFromTableJoin"


    // $ANTLR start "entryRuleJoinCondition"
    // InternalSQLParser.g:1451:1: entryRuleJoinCondition returns [EObject current=null] : iv_ruleJoinCondition= ruleJoinCondition EOF ;
    public final EObject entryRuleJoinCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJoinCondition = null;


        try {
            // InternalSQLParser.g:1451:54: (iv_ruleJoinCondition= ruleJoinCondition EOF )
            // InternalSQLParser.g:1452:2: iv_ruleJoinCondition= ruleJoinCondition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJoinConditionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleJoinCondition=ruleJoinCondition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJoinCondition; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleJoinCondition"


    // $ANTLR start "ruleJoinCondition"
    // InternalSQLParser.g:1458:1: ruleJoinCondition returns [EObject current=null] : (otherlv_0= USING otherlv_1= LeftParenthesis ( (lv_useCols_2_0= ruleUsingCols ) ) otherlv_3= RightParenthesis ) ;
    public final EObject ruleJoinCondition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_useCols_2_0 = null;



        	enterRule();

        try {
            // InternalSQLParser.g:1464:2: ( (otherlv_0= USING otherlv_1= LeftParenthesis ( (lv_useCols_2_0= ruleUsingCols ) ) otherlv_3= RightParenthesis ) )
            // InternalSQLParser.g:1465:2: (otherlv_0= USING otherlv_1= LeftParenthesis ( (lv_useCols_2_0= ruleUsingCols ) ) otherlv_3= RightParenthesis )
            {
            // InternalSQLParser.g:1465:2: (otherlv_0= USING otherlv_1= LeftParenthesis ( (lv_useCols_2_0= ruleUsingCols ) ) otherlv_3= RightParenthesis )
            // InternalSQLParser.g:1466:3: otherlv_0= USING otherlv_1= LeftParenthesis ( (lv_useCols_2_0= ruleUsingCols ) ) otherlv_3= RightParenthesis
            {
            otherlv_0=(Token)match(input,USING,FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getJoinConditionAccess().getUSINGKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,LeftParenthesis,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getJoinConditionAccess().getLeftParenthesisKeyword_1());
              		
            }
            // InternalSQLParser.g:1474:3: ( (lv_useCols_2_0= ruleUsingCols ) )
            // InternalSQLParser.g:1475:4: (lv_useCols_2_0= ruleUsingCols )
            {
            // InternalSQLParser.g:1475:4: (lv_useCols_2_0= ruleUsingCols )
            // InternalSQLParser.g:1476:5: lv_useCols_2_0= ruleUsingCols
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getJoinConditionAccess().getUseColsUsingColsParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_8);
            lv_useCols_2_0=ruleUsingCols();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getJoinConditionRule());
              					}
              					set(
              						current,
              						"useCols",
              						lv_useCols_2_0,
              						"org.xtext.example.mydsl_sql.SQL.UsingCols");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_3=(Token)match(input,RightParenthesis,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getJoinConditionAccess().getRightParenthesisKeyword_3());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleJoinCondition"


    // $ANTLR start "entryRuleUsingCols"
    // InternalSQLParser.g:1501:1: entryRuleUsingCols returns [EObject current=null] : iv_ruleUsingCols= ruleUsingCols EOF ;
    public final EObject entryRuleUsingCols() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUsingCols = null;


        try {
            // InternalSQLParser.g:1501:50: (iv_ruleUsingCols= ruleUsingCols EOF )
            // InternalSQLParser.g:1502:2: iv_ruleUsingCols= ruleUsingCols EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getUsingColsRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleUsingCols=ruleUsingCols();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleUsingCols; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleUsingCols"


    // $ANTLR start "ruleUsingCols"
    // InternalSQLParser.g:1508:1: ruleUsingCols returns [EObject current=null] : (this_DbObjectName_0= ruleDbObjectName ( () (otherlv_2= Comma ( (lv_entries_3_0= ruleDbObjectName ) ) )+ )? ) ;
    public final EObject ruleUsingCols() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_DbObjectName_0 = null;

        EObject lv_entries_3_0 = null;



        	enterRule();

        try {
            // InternalSQLParser.g:1514:2: ( (this_DbObjectName_0= ruleDbObjectName ( () (otherlv_2= Comma ( (lv_entries_3_0= ruleDbObjectName ) ) )+ )? ) )
            // InternalSQLParser.g:1515:2: (this_DbObjectName_0= ruleDbObjectName ( () (otherlv_2= Comma ( (lv_entries_3_0= ruleDbObjectName ) ) )+ )? )
            {
            // InternalSQLParser.g:1515:2: (this_DbObjectName_0= ruleDbObjectName ( () (otherlv_2= Comma ( (lv_entries_3_0= ruleDbObjectName ) ) )+ )? )
            // InternalSQLParser.g:1516:3: this_DbObjectName_0= ruleDbObjectName ( () (otherlv_2= Comma ( (lv_entries_3_0= ruleDbObjectName ) ) )+ )?
            {
            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getUsingColsAccess().getDbObjectNameParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_9);
            this_DbObjectName_0=ruleDbObjectName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_DbObjectName_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalSQLParser.g:1527:3: ( () (otherlv_2= Comma ( (lv_entries_3_0= ruleDbObjectName ) ) )+ )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==Comma) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalSQLParser.g:1528:4: () (otherlv_2= Comma ( (lv_entries_3_0= ruleDbObjectName ) ) )+
                    {
                    // InternalSQLParser.g:1528:4: ()
                    // InternalSQLParser.g:1529:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					/* */
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElementAndAdd(
                      						grammarAccess.getUsingColsAccess().getUsingColsEntriesAction_1_0(),
                      						current);
                      				
                    }

                    }

                    // InternalSQLParser.g:1538:4: (otherlv_2= Comma ( (lv_entries_3_0= ruleDbObjectName ) ) )+
                    int cnt35=0;
                    loop35:
                    do {
                        int alt35=2;
                        int LA35_0 = input.LA(1);

                        if ( (LA35_0==Comma) ) {
                            alt35=1;
                        }


                        switch (alt35) {
                    	case 1 :
                    	    // InternalSQLParser.g:1539:5: otherlv_2= Comma ( (lv_entries_3_0= ruleDbObjectName ) )
                    	    {
                    	    otherlv_2=(Token)match(input,Comma,FOLLOW_4); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_2, grammarAccess.getUsingColsAccess().getCommaKeyword_1_1_0());
                    	      				
                    	    }
                    	    // InternalSQLParser.g:1543:5: ( (lv_entries_3_0= ruleDbObjectName ) )
                    	    // InternalSQLParser.g:1544:6: (lv_entries_3_0= ruleDbObjectName )
                    	    {
                    	    // InternalSQLParser.g:1544:6: (lv_entries_3_0= ruleDbObjectName )
                    	    // InternalSQLParser.g:1545:7: lv_entries_3_0= ruleDbObjectName
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getUsingColsAccess().getEntriesDbObjectNameParserRuleCall_1_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_9);
                    	    lv_entries_3_0=ruleDbObjectName();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getUsingColsRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"entries",
                    	      								lv_entries_3_0,
                    	      								"org.xtext.example.mydsl_sql.SQL.DbObjectName");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt35 >= 1 ) break loop35;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(35, input);
                                throw eee;
                        }
                        cnt35++;
                    } while (true);


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleUsingCols"


    // $ANTLR start "entryRuleTableOrAlias"
    // InternalSQLParser.g:1568:1: entryRuleTableOrAlias returns [EObject current=null] : iv_ruleTableOrAlias= ruleTableOrAlias EOF ;
    public final EObject entryRuleTableOrAlias() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTableOrAlias = null;


        try {
            // InternalSQLParser.g:1568:53: (iv_ruleTableOrAlias= ruleTableOrAlias EOF )
            // InternalSQLParser.g:1569:2: iv_ruleTableOrAlias= ruleTableOrAlias EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTableOrAliasRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleTableOrAlias=ruleTableOrAlias();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTableOrAlias; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTableOrAlias"


    // $ANTLR start "ruleTableOrAlias"
    // InternalSQLParser.g:1575:1: ruleTableOrAlias returns [EObject current=null] : ( ( ( (lv_tfull_0_0= ruleTableFull ) ) | ( (lv_sq_1_0= ruleSubQueryOperand ) ) | ( (lv_values_2_0= ruleFromValues ) ) ) ( ( (lv_pivot_3_0= rulePivotTable ) ) | ( (lv_unpivot_4_0= ruleUnpivotTable ) ) )? ( (lv_alias_5_0= AS ) )? ( (lv_tblAlias_6_0= ruleDbObjectName ) )? ) ;
    public final EObject ruleTableOrAlias() throws RecognitionException {
        EObject current = null;

        Token lv_alias_5_0=null;
        EObject lv_tfull_0_0 = null;

        EObject lv_sq_1_0 = null;

        EObject lv_values_2_0 = null;

        EObject lv_pivot_3_0 = null;

        EObject lv_unpivot_4_0 = null;

        EObject lv_tblAlias_6_0 = null;



        	enterRule();

        try {
            // InternalSQLParser.g:1581:2: ( ( ( ( (lv_tfull_0_0= ruleTableFull ) ) | ( (lv_sq_1_0= ruleSubQueryOperand ) ) | ( (lv_values_2_0= ruleFromValues ) ) ) ( ( (lv_pivot_3_0= rulePivotTable ) ) | ( (lv_unpivot_4_0= ruleUnpivotTable ) ) )? ( (lv_alias_5_0= AS ) )? ( (lv_tblAlias_6_0= ruleDbObjectName ) )? ) )
            // InternalSQLParser.g:1582:2: ( ( ( (lv_tfull_0_0= ruleTableFull ) ) | ( (lv_sq_1_0= ruleSubQueryOperand ) ) | ( (lv_values_2_0= ruleFromValues ) ) ) ( ( (lv_pivot_3_0= rulePivotTable ) ) | ( (lv_unpivot_4_0= ruleUnpivotTable ) ) )? ( (lv_alias_5_0= AS ) )? ( (lv_tblAlias_6_0= ruleDbObjectName ) )? )
            {
            // InternalSQLParser.g:1582:2: ( ( ( (lv_tfull_0_0= ruleTableFull ) ) | ( (lv_sq_1_0= ruleSubQueryOperand ) ) | ( (lv_values_2_0= ruleFromValues ) ) ) ( ( (lv_pivot_3_0= rulePivotTable ) ) | ( (lv_unpivot_4_0= ruleUnpivotTable ) ) )? ( (lv_alias_5_0= AS ) )? ( (lv_tblAlias_6_0= ruleDbObjectName ) )? )
            // InternalSQLParser.g:1583:3: ( ( (lv_tfull_0_0= ruleTableFull ) ) | ( (lv_sq_1_0= ruleSubQueryOperand ) ) | ( (lv_values_2_0= ruleFromValues ) ) ) ( ( (lv_pivot_3_0= rulePivotTable ) ) | ( (lv_unpivot_4_0= ruleUnpivotTable ) ) )? ( (lv_alias_5_0= AS ) )? ( (lv_tblAlias_6_0= ruleDbObjectName ) )?
            {
            // InternalSQLParser.g:1583:3: ( ( (lv_tfull_0_0= ruleTableFull ) ) | ( (lv_sq_1_0= ruleSubQueryOperand ) ) | ( (lv_values_2_0= ruleFromValues ) ) )
            int alt37=3;
            int LA37_0 = input.LA(1);

            if ( ((LA37_0>=RULE_STRING && LA37_0<=RULE_ID)) ) {
                alt37=1;
            }
            else if ( (LA37_0==LeftParenthesis) ) {
                int LA37_2 = input.LA(2);

                if ( (LA37_2==SELECT) ) {
                    alt37=2;
                }
                else if ( (LA37_2==VALUES) ) {
                    alt37=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 37, 2, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 37, 0, input);

                throw nvae;
            }
            switch (alt37) {
                case 1 :
                    // InternalSQLParser.g:1584:4: ( (lv_tfull_0_0= ruleTableFull ) )
                    {
                    // InternalSQLParser.g:1584:4: ( (lv_tfull_0_0= ruleTableFull ) )
                    // InternalSQLParser.g:1585:5: (lv_tfull_0_0= ruleTableFull )
                    {
                    // InternalSQLParser.g:1585:5: (lv_tfull_0_0= ruleTableFull )
                    // InternalSQLParser.g:1586:6: lv_tfull_0_0= ruleTableFull
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getTableOrAliasAccess().getTfullTableFullParserRuleCall_0_0_0());
                      					
                    }
                    pushFollow(FOLLOW_40);
                    lv_tfull_0_0=ruleTableFull();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getTableOrAliasRule());
                      						}
                      						set(
                      							current,
                      							"tfull",
                      							lv_tfull_0_0,
                      							"org.xtext.example.mydsl_sql.SQL.TableFull");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalSQLParser.g:1604:4: ( (lv_sq_1_0= ruleSubQueryOperand ) )
                    {
                    // InternalSQLParser.g:1604:4: ( (lv_sq_1_0= ruleSubQueryOperand ) )
                    // InternalSQLParser.g:1605:5: (lv_sq_1_0= ruleSubQueryOperand )
                    {
                    // InternalSQLParser.g:1605:5: (lv_sq_1_0= ruleSubQueryOperand )
                    // InternalSQLParser.g:1606:6: lv_sq_1_0= ruleSubQueryOperand
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getTableOrAliasAccess().getSqSubQueryOperandParserRuleCall_0_1_0());
                      					
                    }
                    pushFollow(FOLLOW_40);
                    lv_sq_1_0=ruleSubQueryOperand();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getTableOrAliasRule());
                      						}
                      						set(
                      							current,
                      							"sq",
                      							lv_sq_1_0,
                      							"org.xtext.example.mydsl_sql.SQL.SubQueryOperand");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalSQLParser.g:1624:4: ( (lv_values_2_0= ruleFromValues ) )
                    {
                    // InternalSQLParser.g:1624:4: ( (lv_values_2_0= ruleFromValues ) )
                    // InternalSQLParser.g:1625:5: (lv_values_2_0= ruleFromValues )
                    {
                    // InternalSQLParser.g:1625:5: (lv_values_2_0= ruleFromValues )
                    // InternalSQLParser.g:1626:6: lv_values_2_0= ruleFromValues
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getTableOrAliasAccess().getValuesFromValuesParserRuleCall_0_2_0());
                      					
                    }
                    pushFollow(FOLLOW_40);
                    lv_values_2_0=ruleFromValues();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getTableOrAliasRule());
                      						}
                      						set(
                      							current,
                      							"values",
                      							lv_values_2_0,
                      							"org.xtext.example.mydsl_sql.SQL.FromValues");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            // InternalSQLParser.g:1644:3: ( ( (lv_pivot_3_0= rulePivotTable ) ) | ( (lv_unpivot_4_0= ruleUnpivotTable ) ) )?
            int alt38=3;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==PIVOT) ) {
                alt38=1;
            }
            else if ( (LA38_0==UNPIVOT) ) {
                alt38=2;
            }
            switch (alt38) {
                case 1 :
                    // InternalSQLParser.g:1645:4: ( (lv_pivot_3_0= rulePivotTable ) )
                    {
                    // InternalSQLParser.g:1645:4: ( (lv_pivot_3_0= rulePivotTable ) )
                    // InternalSQLParser.g:1646:5: (lv_pivot_3_0= rulePivotTable )
                    {
                    // InternalSQLParser.g:1646:5: (lv_pivot_3_0= rulePivotTable )
                    // InternalSQLParser.g:1647:6: lv_pivot_3_0= rulePivotTable
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getTableOrAliasAccess().getPivotPivotTableParserRuleCall_1_0_0());
                      					
                    }
                    pushFollow(FOLLOW_35);
                    lv_pivot_3_0=rulePivotTable();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getTableOrAliasRule());
                      						}
                      						set(
                      							current,
                      							"pivot",
                      							lv_pivot_3_0,
                      							"org.xtext.example.mydsl_sql.SQL.PivotTable");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalSQLParser.g:1665:4: ( (lv_unpivot_4_0= ruleUnpivotTable ) )
                    {
                    // InternalSQLParser.g:1665:4: ( (lv_unpivot_4_0= ruleUnpivotTable ) )
                    // InternalSQLParser.g:1666:5: (lv_unpivot_4_0= ruleUnpivotTable )
                    {
                    // InternalSQLParser.g:1666:5: (lv_unpivot_4_0= ruleUnpivotTable )
                    // InternalSQLParser.g:1667:6: lv_unpivot_4_0= ruleUnpivotTable
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getTableOrAliasAccess().getUnpivotUnpivotTableParserRuleCall_1_1_0());
                      					
                    }
                    pushFollow(FOLLOW_35);
                    lv_unpivot_4_0=ruleUnpivotTable();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getTableOrAliasRule());
                      						}
                      						set(
                      							current,
                      							"unpivot",
                      							lv_unpivot_4_0,
                      							"org.xtext.example.mydsl_sql.SQL.UnpivotTable");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            // InternalSQLParser.g:1685:3: ( (lv_alias_5_0= AS ) )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==AS) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalSQLParser.g:1686:4: (lv_alias_5_0= AS )
                    {
                    // InternalSQLParser.g:1686:4: (lv_alias_5_0= AS )
                    // InternalSQLParser.g:1687:5: lv_alias_5_0= AS
                    {
                    lv_alias_5_0=(Token)match(input,AS,FOLLOW_36); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_alias_5_0, grammarAccess.getTableOrAliasAccess().getAliasASKeyword_2_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getTableOrAliasRule());
                      					}
                      					setWithLastConsumed(current, "alias", lv_alias_5_0, "AS");
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalSQLParser.g:1699:3: ( (lv_tblAlias_6_0= ruleDbObjectName ) )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( ((LA40_0>=RULE_STRING && LA40_0<=RULE_ID)) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalSQLParser.g:1700:4: (lv_tblAlias_6_0= ruleDbObjectName )
                    {
                    // InternalSQLParser.g:1700:4: (lv_tblAlias_6_0= ruleDbObjectName )
                    // InternalSQLParser.g:1701:5: lv_tblAlias_6_0= ruleDbObjectName
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getTableOrAliasAccess().getTblAliasDbObjectNameParserRuleCall_3_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_tblAlias_6_0=ruleDbObjectName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getTableOrAliasRule());
                      					}
                      					set(
                      						current,
                      						"tblAlias",
                      						lv_tblAlias_6_0,
                      						"org.xtext.example.mydsl_sql.SQL.DbObjectName");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTableOrAlias"


    // $ANTLR start "entryRuleFromValues"
    // InternalSQLParser.g:1722:1: entryRuleFromValues returns [EObject current=null] : iv_ruleFromValues= ruleFromValues EOF ;
    public final EObject entryRuleFromValues() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFromValues = null;


        try {
            // InternalSQLParser.g:1722:51: (iv_ruleFromValues= ruleFromValues EOF )
            // InternalSQLParser.g:1723:2: iv_ruleFromValues= ruleFromValues EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFromValuesRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleFromValues=ruleFromValues();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFromValues; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFromValues"


    // $ANTLR start "ruleFromValues"
    // InternalSQLParser.g:1729:1: ruleFromValues returns [EObject current=null] : ( ( (lv_values_0_0= ruleValues ) ) ( (lv_c_1_0= ruleFromValuesColumns ) )? ) ;
    public final EObject ruleFromValues() throws RecognitionException {
        EObject current = null;

        EObject lv_values_0_0 = null;

        EObject lv_c_1_0 = null;



        	enterRule();

        try {
            // InternalSQLParser.g:1735:2: ( ( ( (lv_values_0_0= ruleValues ) ) ( (lv_c_1_0= ruleFromValuesColumns ) )? ) )
            // InternalSQLParser.g:1736:2: ( ( (lv_values_0_0= ruleValues ) ) ( (lv_c_1_0= ruleFromValuesColumns ) )? )
            {
            // InternalSQLParser.g:1736:2: ( ( (lv_values_0_0= ruleValues ) ) ( (lv_c_1_0= ruleFromValuesColumns ) )? )
            // InternalSQLParser.g:1737:3: ( (lv_values_0_0= ruleValues ) ) ( (lv_c_1_0= ruleFromValuesColumns ) )?
            {
            // InternalSQLParser.g:1737:3: ( (lv_values_0_0= ruleValues ) )
            // InternalSQLParser.g:1738:4: (lv_values_0_0= ruleValues )
            {
            // InternalSQLParser.g:1738:4: (lv_values_0_0= ruleValues )
            // InternalSQLParser.g:1739:5: lv_values_0_0= ruleValues
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getFromValuesAccess().getValuesValuesParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_41);
            lv_values_0_0=ruleValues();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getFromValuesRule());
              					}
              					set(
              						current,
              						"values",
              						lv_values_0_0,
              						"org.xtext.example.mydsl_sql.SQL.Values");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalSQLParser.g:1756:3: ( (lv_c_1_0= ruleFromValuesColumns ) )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==RULE_ID) ) {
                int LA41_1 = input.LA(2);

                if ( (LA41_1==LeftParenthesis) ) {
                    alt41=1;
                }
            }
            switch (alt41) {
                case 1 :
                    // InternalSQLParser.g:1757:4: (lv_c_1_0= ruleFromValuesColumns )
                    {
                    // InternalSQLParser.g:1757:4: (lv_c_1_0= ruleFromValuesColumns )
                    // InternalSQLParser.g:1758:5: lv_c_1_0= ruleFromValuesColumns
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getFromValuesAccess().getCFromValuesColumnsParserRuleCall_1_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_c_1_0=ruleFromValuesColumns();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getFromValuesRule());
                      					}
                      					set(
                      						current,
                      						"c",
                      						lv_c_1_0,
                      						"org.xtext.example.mydsl_sql.SQL.FromValuesColumns");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFromValues"


    // $ANTLR start "entryRuleFromValuesColumns"
    // InternalSQLParser.g:1779:1: entryRuleFromValuesColumns returns [EObject current=null] : iv_ruleFromValuesColumns= ruleFromValuesColumns EOF ;
    public final EObject entryRuleFromValuesColumns() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFromValuesColumns = null;


        try {
            // InternalSQLParser.g:1779:58: (iv_ruleFromValuesColumns= ruleFromValuesColumns EOF )
            // InternalSQLParser.g:1780:2: iv_ruleFromValuesColumns= ruleFromValuesColumns EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFromValuesColumnsRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleFromValuesColumns=ruleFromValuesColumns();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFromValuesColumns; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFromValuesColumns"


    // $ANTLR start "ruleFromValuesColumns"
    // InternalSQLParser.g:1786:1: ruleFromValuesColumns returns [EObject current=null] : (this_ID_0= RULE_ID otherlv_1= LeftParenthesis ( (lv_fvCols_2_0= ruleFromValuesColumnNames ) ) otherlv_3= RightParenthesis ) ;
    public final EObject ruleFromValuesColumns() throws RecognitionException {
        EObject current = null;

        Token this_ID_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_fvCols_2_0 = null;



        	enterRule();

        try {
            // InternalSQLParser.g:1792:2: ( (this_ID_0= RULE_ID otherlv_1= LeftParenthesis ( (lv_fvCols_2_0= ruleFromValuesColumnNames ) ) otherlv_3= RightParenthesis ) )
            // InternalSQLParser.g:1793:2: (this_ID_0= RULE_ID otherlv_1= LeftParenthesis ( (lv_fvCols_2_0= ruleFromValuesColumnNames ) ) otherlv_3= RightParenthesis )
            {
            // InternalSQLParser.g:1793:2: (this_ID_0= RULE_ID otherlv_1= LeftParenthesis ( (lv_fvCols_2_0= ruleFromValuesColumnNames ) ) otherlv_3= RightParenthesis )
            // InternalSQLParser.g:1794:3: this_ID_0= RULE_ID otherlv_1= LeftParenthesis ( (lv_fvCols_2_0= ruleFromValuesColumnNames ) ) otherlv_3= RightParenthesis
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_ID_0, grammarAccess.getFromValuesColumnsAccess().getIDTerminalRuleCall_0());
              		
            }
            otherlv_1=(Token)match(input,LeftParenthesis,FOLLOW_42); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getFromValuesColumnsAccess().getLeftParenthesisKeyword_1());
              		
            }
            // InternalSQLParser.g:1802:3: ( (lv_fvCols_2_0= ruleFromValuesColumnNames ) )
            // InternalSQLParser.g:1803:4: (lv_fvCols_2_0= ruleFromValuesColumnNames )
            {
            // InternalSQLParser.g:1803:4: (lv_fvCols_2_0= ruleFromValuesColumnNames )
            // InternalSQLParser.g:1804:5: lv_fvCols_2_0= ruleFromValuesColumnNames
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getFromValuesColumnsAccess().getFvColsFromValuesColumnNamesParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_8);
            lv_fvCols_2_0=ruleFromValuesColumnNames();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getFromValuesColumnsRule());
              					}
              					set(
              						current,
              						"fvCols",
              						lv_fvCols_2_0,
              						"org.xtext.example.mydsl_sql.SQL.FromValuesColumnNames");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_3=(Token)match(input,RightParenthesis,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getFromValuesColumnsAccess().getRightParenthesisKeyword_3());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFromValuesColumns"


    // $ANTLR start "entryRuleFromValuesColumnNames"
    // InternalSQLParser.g:1829:1: entryRuleFromValuesColumnNames returns [EObject current=null] : iv_ruleFromValuesColumnNames= ruleFromValuesColumnNames EOF ;
    public final EObject entryRuleFromValuesColumnNames() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFromValuesColumnNames = null;


        try {
            // InternalSQLParser.g:1829:62: (iv_ruleFromValuesColumnNames= ruleFromValuesColumnNames EOF )
            // InternalSQLParser.g:1830:2: iv_ruleFromValuesColumnNames= ruleFromValuesColumnNames EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFromValuesColumnNamesRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleFromValuesColumnNames=ruleFromValuesColumnNames();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFromValuesColumnNames; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFromValuesColumnNames"


    // $ANTLR start "ruleFromValuesColumnNames"
    // InternalSQLParser.g:1836:1: ruleFromValuesColumnNames returns [EObject current=null] : (this_ColumnName_0= ruleColumnName ( () (otherlv_2= Comma ( (lv_entries_3_0= ruleColumnName ) ) )+ )? ) ;
    public final EObject ruleFromValuesColumnNames() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_ColumnName_0 = null;

        EObject lv_entries_3_0 = null;



        	enterRule();

        try {
            // InternalSQLParser.g:1842:2: ( (this_ColumnName_0= ruleColumnName ( () (otherlv_2= Comma ( (lv_entries_3_0= ruleColumnName ) ) )+ )? ) )
            // InternalSQLParser.g:1843:2: (this_ColumnName_0= ruleColumnName ( () (otherlv_2= Comma ( (lv_entries_3_0= ruleColumnName ) ) )+ )? )
            {
            // InternalSQLParser.g:1843:2: (this_ColumnName_0= ruleColumnName ( () (otherlv_2= Comma ( (lv_entries_3_0= ruleColumnName ) ) )+ )? )
            // InternalSQLParser.g:1844:3: this_ColumnName_0= ruleColumnName ( () (otherlv_2= Comma ( (lv_entries_3_0= ruleColumnName ) ) )+ )?
            {
            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getFromValuesColumnNamesAccess().getColumnNameParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_9);
            this_ColumnName_0=ruleColumnName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_ColumnName_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalSQLParser.g:1855:3: ( () (otherlv_2= Comma ( (lv_entries_3_0= ruleColumnName ) ) )+ )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==Comma) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalSQLParser.g:1856:4: () (otherlv_2= Comma ( (lv_entries_3_0= ruleColumnName ) ) )+
                    {
                    // InternalSQLParser.g:1856:4: ()
                    // InternalSQLParser.g:1857:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					/* */
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElementAndAdd(
                      						grammarAccess.getFromValuesColumnNamesAccess().getAbcEntriesAction_1_0(),
                      						current);
                      				
                    }

                    }

                    // InternalSQLParser.g:1866:4: (otherlv_2= Comma ( (lv_entries_3_0= ruleColumnName ) ) )+
                    int cnt42=0;
                    loop42:
                    do {
                        int alt42=2;
                        int LA42_0 = input.LA(1);

                        if ( (LA42_0==Comma) ) {
                            alt42=1;
                        }


                        switch (alt42) {
                    	case 1 :
                    	    // InternalSQLParser.g:1867:5: otherlv_2= Comma ( (lv_entries_3_0= ruleColumnName ) )
                    	    {
                    	    otherlv_2=(Token)match(input,Comma,FOLLOW_42); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_2, grammarAccess.getFromValuesColumnNamesAccess().getCommaKeyword_1_1_0());
                    	      				
                    	    }
                    	    // InternalSQLParser.g:1871:5: ( (lv_entries_3_0= ruleColumnName ) )
                    	    // InternalSQLParser.g:1872:6: (lv_entries_3_0= ruleColumnName )
                    	    {
                    	    // InternalSQLParser.g:1872:6: (lv_entries_3_0= ruleColumnName )
                    	    // InternalSQLParser.g:1873:7: lv_entries_3_0= ruleColumnName
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getFromValuesColumnNamesAccess().getEntriesColumnNameParserRuleCall_1_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_9);
                    	    lv_entries_3_0=ruleColumnName();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getFromValuesColumnNamesRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"entries",
                    	      								lv_entries_3_0,
                    	      								"org.xtext.example.mydsl_sql.SQL.ColumnName");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt42 >= 1 ) break loop42;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(42, input);
                                throw eee;
                        }
                        cnt42++;
                    } while (true);


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFromValuesColumnNames"


    // $ANTLR start "entryRuleColumnName"
    // InternalSQLParser.g:1896:1: entryRuleColumnName returns [EObject current=null] : iv_ruleColumnName= ruleColumnName EOF ;
    public final EObject entryRuleColumnName() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleColumnName = null;


        try {
            // InternalSQLParser.g:1896:51: (iv_ruleColumnName= ruleColumnName EOF )
            // InternalSQLParser.g:1897:2: iv_ruleColumnName= ruleColumnName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getColumnNameRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleColumnName=ruleColumnName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleColumnName; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleColumnName"


    // $ANTLR start "ruleColumnName"
    // InternalSQLParser.g:1903:1: ruleColumnName returns [EObject current=null] : ( (lv_colName_0_0= RULE_STRING ) ) ;
    public final EObject ruleColumnName() throws RecognitionException {
        EObject current = null;

        Token lv_colName_0_0=null;


        	enterRule();

        try {
            // InternalSQLParser.g:1909:2: ( ( (lv_colName_0_0= RULE_STRING ) ) )
            // InternalSQLParser.g:1910:2: ( (lv_colName_0_0= RULE_STRING ) )
            {
            // InternalSQLParser.g:1910:2: ( (lv_colName_0_0= RULE_STRING ) )
            // InternalSQLParser.g:1911:3: (lv_colName_0_0= RULE_STRING )
            {
            // InternalSQLParser.g:1911:3: (lv_colName_0_0= RULE_STRING )
            // InternalSQLParser.g:1912:4: lv_colName_0_0= RULE_STRING
            {
            lv_colName_0_0=(Token)match(input,RULE_STRING,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(lv_colName_0_0, grammarAccess.getColumnNameAccess().getColNameSTRINGTerminalRuleCall_0());
              			
            }
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElement(grammarAccess.getColumnNameRule());
              				}
              				setWithLastConsumed(
              					current,
              					"colName",
              					lv_colName_0_0,
              					"org.xtext.example.mydsl_sql.SQL.STRING");
              			
            }

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleColumnName"


    // $ANTLR start "entryRuleValues"
    // InternalSQLParser.g:1931:1: entryRuleValues returns [EObject current=null] : iv_ruleValues= ruleValues EOF ;
    public final EObject entryRuleValues() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValues = null;


        try {
            // InternalSQLParser.g:1931:47: (iv_ruleValues= ruleValues EOF )
            // InternalSQLParser.g:1932:2: iv_ruleValues= ruleValues EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getValuesRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleValues=ruleValues();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleValues; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleValues"


    // $ANTLR start "ruleValues"
    // InternalSQLParser.g:1938:1: ruleValues returns [EObject current=null] : (otherlv_0= LeftParenthesis otherlv_1= VALUES ( (lv_rows_2_0= ruleRows ) ) otherlv_3= RightParenthesis ) ;
    public final EObject ruleValues() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_rows_2_0 = null;



        	enterRule();

        try {
            // InternalSQLParser.g:1944:2: ( (otherlv_0= LeftParenthesis otherlv_1= VALUES ( (lv_rows_2_0= ruleRows ) ) otherlv_3= RightParenthesis ) )
            // InternalSQLParser.g:1945:2: (otherlv_0= LeftParenthesis otherlv_1= VALUES ( (lv_rows_2_0= ruleRows ) ) otherlv_3= RightParenthesis )
            {
            // InternalSQLParser.g:1945:2: (otherlv_0= LeftParenthesis otherlv_1= VALUES ( (lv_rows_2_0= ruleRows ) ) otherlv_3= RightParenthesis )
            // InternalSQLParser.g:1946:3: otherlv_0= LeftParenthesis otherlv_1= VALUES ( (lv_rows_2_0= ruleRows ) ) otherlv_3= RightParenthesis
            {
            otherlv_0=(Token)match(input,LeftParenthesis,FOLLOW_43); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getValuesAccess().getLeftParenthesisKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,VALUES,FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getValuesAccess().getVALUESKeyword_1());
              		
            }
            // InternalSQLParser.g:1954:3: ( (lv_rows_2_0= ruleRows ) )
            // InternalSQLParser.g:1955:4: (lv_rows_2_0= ruleRows )
            {
            // InternalSQLParser.g:1955:4: (lv_rows_2_0= ruleRows )
            // InternalSQLParser.g:1956:5: lv_rows_2_0= ruleRows
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getValuesAccess().getRowsRowsParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_8);
            lv_rows_2_0=ruleRows();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getValuesRule());
              					}
              					set(
              						current,
              						"rows",
              						lv_rows_2_0,
              						"org.xtext.example.mydsl_sql.SQL.Rows");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_3=(Token)match(input,RightParenthesis,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getValuesAccess().getRightParenthesisKeyword_3());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleValues"


    // $ANTLR start "entryRuleRows"
    // InternalSQLParser.g:1981:1: entryRuleRows returns [EObject current=null] : iv_ruleRows= ruleRows EOF ;
    public final EObject entryRuleRows() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRows = null;


        try {
            // InternalSQLParser.g:1981:45: (iv_ruleRows= ruleRows EOF )
            // InternalSQLParser.g:1982:2: iv_ruleRows= ruleRows EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRowsRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleRows=ruleRows();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRows; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRows"


    // $ANTLR start "ruleRows"
    // InternalSQLParser.g:1988:1: ruleRows returns [EObject current=null] : (this_Row_0= ruleRow ( () (otherlv_2= Comma ( (lv_entries_3_0= ruleRow ) ) )+ )? ) ;
    public final EObject ruleRows() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_Row_0 = null;

        EObject lv_entries_3_0 = null;



        	enterRule();

        try {
            // InternalSQLParser.g:1994:2: ( (this_Row_0= ruleRow ( () (otherlv_2= Comma ( (lv_entries_3_0= ruleRow ) ) )+ )? ) )
            // InternalSQLParser.g:1995:2: (this_Row_0= ruleRow ( () (otherlv_2= Comma ( (lv_entries_3_0= ruleRow ) ) )+ )? )
            {
            // InternalSQLParser.g:1995:2: (this_Row_0= ruleRow ( () (otherlv_2= Comma ( (lv_entries_3_0= ruleRow ) ) )+ )? )
            // InternalSQLParser.g:1996:3: this_Row_0= ruleRow ( () (otherlv_2= Comma ( (lv_entries_3_0= ruleRow ) ) )+ )?
            {
            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getRowsAccess().getRowParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_9);
            this_Row_0=ruleRow();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_Row_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalSQLParser.g:2007:3: ( () (otherlv_2= Comma ( (lv_entries_3_0= ruleRow ) ) )+ )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==Comma) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalSQLParser.g:2008:4: () (otherlv_2= Comma ( (lv_entries_3_0= ruleRow ) ) )+
                    {
                    // InternalSQLParser.g:2008:4: ()
                    // InternalSQLParser.g:2009:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					/* */
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElementAndAdd(
                      						grammarAccess.getRowsAccess().getRowsEntriesAction_1_0(),
                      						current);
                      				
                    }

                    }

                    // InternalSQLParser.g:2018:4: (otherlv_2= Comma ( (lv_entries_3_0= ruleRow ) ) )+
                    int cnt44=0;
                    loop44:
                    do {
                        int alt44=2;
                        int LA44_0 = input.LA(1);

                        if ( (LA44_0==Comma) ) {
                            alt44=1;
                        }


                        switch (alt44) {
                    	case 1 :
                    	    // InternalSQLParser.g:2019:5: otherlv_2= Comma ( (lv_entries_3_0= ruleRow ) )
                    	    {
                    	    otherlv_2=(Token)match(input,Comma,FOLLOW_7); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_2, grammarAccess.getRowsAccess().getCommaKeyword_1_1_0());
                    	      				
                    	    }
                    	    // InternalSQLParser.g:2023:5: ( (lv_entries_3_0= ruleRow ) )
                    	    // InternalSQLParser.g:2024:6: (lv_entries_3_0= ruleRow )
                    	    {
                    	    // InternalSQLParser.g:2024:6: (lv_entries_3_0= ruleRow )
                    	    // InternalSQLParser.g:2025:7: lv_entries_3_0= ruleRow
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getRowsAccess().getEntriesRowParserRuleCall_1_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_9);
                    	    lv_entries_3_0=ruleRow();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getRowsRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"entries",
                    	      								lv_entries_3_0,
                    	      								"org.xtext.example.mydsl_sql.SQL.Row");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt44 >= 1 ) break loop44;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(44, input);
                                throw eee;
                        }
                        cnt44++;
                    } while (true);


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRows"


    // $ANTLR start "entryRuleRow"
    // InternalSQLParser.g:2048:1: entryRuleRow returns [EObject current=null] : iv_ruleRow= ruleRow EOF ;
    public final EObject entryRuleRow() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRow = null;


        try {
            // InternalSQLParser.g:2048:44: (iv_ruleRow= ruleRow EOF )
            // InternalSQLParser.g:2049:2: iv_ruleRow= ruleRow EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRowRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleRow=ruleRow();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRow; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRow"


    // $ANTLR start "ruleRow"
    // InternalSQLParser.g:2055:1: ruleRow returns [EObject current=null] : (otherlv_0= LeftParenthesis ( (lv_rowValues_1_0= ruleRowValues ) ) otherlv_2= RightParenthesis ) ;
    public final EObject ruleRow() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_rowValues_1_0 = null;



        	enterRule();

        try {
            // InternalSQLParser.g:2061:2: ( (otherlv_0= LeftParenthesis ( (lv_rowValues_1_0= ruleRowValues ) ) otherlv_2= RightParenthesis ) )
            // InternalSQLParser.g:2062:2: (otherlv_0= LeftParenthesis ( (lv_rowValues_1_0= ruleRowValues ) ) otherlv_2= RightParenthesis )
            {
            // InternalSQLParser.g:2062:2: (otherlv_0= LeftParenthesis ( (lv_rowValues_1_0= ruleRowValues ) ) otherlv_2= RightParenthesis )
            // InternalSQLParser.g:2063:3: otherlv_0= LeftParenthesis ( (lv_rowValues_1_0= ruleRowValues ) ) otherlv_2= RightParenthesis
            {
            otherlv_0=(Token)match(input,LeftParenthesis,FOLLOW_44); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getRowAccess().getLeftParenthesisKeyword_0());
              		
            }
            // InternalSQLParser.g:2067:3: ( (lv_rowValues_1_0= ruleRowValues ) )
            // InternalSQLParser.g:2068:4: (lv_rowValues_1_0= ruleRowValues )
            {
            // InternalSQLParser.g:2068:4: (lv_rowValues_1_0= ruleRowValues )
            // InternalSQLParser.g:2069:5: lv_rowValues_1_0= ruleRowValues
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getRowAccess().getRowValuesRowValuesParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_8);
            lv_rowValues_1_0=ruleRowValues();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getRowRule());
              					}
              					set(
              						current,
              						"rowValues",
              						lv_rowValues_1_0,
              						"org.xtext.example.mydsl_sql.SQL.RowValues");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_2=(Token)match(input,RightParenthesis,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getRowAccess().getRightParenthesisKeyword_2());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRow"


    // $ANTLR start "entryRuleRowValues"
    // InternalSQLParser.g:2094:1: entryRuleRowValues returns [EObject current=null] : iv_ruleRowValues= ruleRowValues EOF ;
    public final EObject entryRuleRowValues() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRowValues = null;


        try {
            // InternalSQLParser.g:2094:50: (iv_ruleRowValues= ruleRowValues EOF )
            // InternalSQLParser.g:2095:2: iv_ruleRowValues= ruleRowValues EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRowValuesRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleRowValues=ruleRowValues();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRowValues; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRowValues"


    // $ANTLR start "ruleRowValues"
    // InternalSQLParser.g:2101:1: ruleRowValues returns [EObject current=null] : (this_RowValue_0= ruleRowValue ( () (otherlv_2= Comma ( (lv_entries_3_0= ruleRowValue ) ) )+ )? ) ;
    public final EObject ruleRowValues() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_RowValue_0 = null;

        EObject lv_entries_3_0 = null;



        	enterRule();

        try {
            // InternalSQLParser.g:2107:2: ( (this_RowValue_0= ruleRowValue ( () (otherlv_2= Comma ( (lv_entries_3_0= ruleRowValue ) ) )+ )? ) )
            // InternalSQLParser.g:2108:2: (this_RowValue_0= ruleRowValue ( () (otherlv_2= Comma ( (lv_entries_3_0= ruleRowValue ) ) )+ )? )
            {
            // InternalSQLParser.g:2108:2: (this_RowValue_0= ruleRowValue ( () (otherlv_2= Comma ( (lv_entries_3_0= ruleRowValue ) ) )+ )? )
            // InternalSQLParser.g:2109:3: this_RowValue_0= ruleRowValue ( () (otherlv_2= Comma ( (lv_entries_3_0= ruleRowValue ) ) )+ )?
            {
            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getRowValuesAccess().getRowValueParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_9);
            this_RowValue_0=ruleRowValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_RowValue_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalSQLParser.g:2120:3: ( () (otherlv_2= Comma ( (lv_entries_3_0= ruleRowValue ) ) )+ )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==Comma) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // InternalSQLParser.g:2121:4: () (otherlv_2= Comma ( (lv_entries_3_0= ruleRowValue ) ) )+
                    {
                    // InternalSQLParser.g:2121:4: ()
                    // InternalSQLParser.g:2122:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					/* */
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElementAndAdd(
                      						grammarAccess.getRowValuesAccess().getRowValuesEntriesAction_1_0(),
                      						current);
                      				
                    }

                    }

                    // InternalSQLParser.g:2131:4: (otherlv_2= Comma ( (lv_entries_3_0= ruleRowValue ) ) )+
                    int cnt46=0;
                    loop46:
                    do {
                        int alt46=2;
                        int LA46_0 = input.LA(1);

                        if ( (LA46_0==Comma) ) {
                            alt46=1;
                        }


                        switch (alt46) {
                    	case 1 :
                    	    // InternalSQLParser.g:2132:5: otherlv_2= Comma ( (lv_entries_3_0= ruleRowValue ) )
                    	    {
                    	    otherlv_2=(Token)match(input,Comma,FOLLOW_44); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_2, grammarAccess.getRowValuesAccess().getCommaKeyword_1_1_0());
                    	      				
                    	    }
                    	    // InternalSQLParser.g:2136:5: ( (lv_entries_3_0= ruleRowValue ) )
                    	    // InternalSQLParser.g:2137:6: (lv_entries_3_0= ruleRowValue )
                    	    {
                    	    // InternalSQLParser.g:2137:6: (lv_entries_3_0= ruleRowValue )
                    	    // InternalSQLParser.g:2138:7: lv_entries_3_0= ruleRowValue
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getRowValuesAccess().getEntriesRowValueParserRuleCall_1_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_9);
                    	    lv_entries_3_0=ruleRowValue();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getRowValuesRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"entries",
                    	      								lv_entries_3_0,
                    	      								"org.xtext.example.mydsl_sql.SQL.RowValue");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt46 >= 1 ) break loop46;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(46, input);
                                throw eee;
                        }
                        cnt46++;
                    } while (true);


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRowValues"


    // $ANTLR start "entryRuleRowValue"
    // InternalSQLParser.g:2161:1: entryRuleRowValue returns [EObject current=null] : iv_ruleRowValue= ruleRowValue EOF ;
    public final EObject entryRuleRowValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRowValue = null;


        try {
            // InternalSQLParser.g:2161:49: (iv_ruleRowValue= ruleRowValue EOF )
            // InternalSQLParser.g:2162:2: iv_ruleRowValue= ruleRowValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRowValueRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleRowValue=ruleRowValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRowValue; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRowValue"


    // $ANTLR start "ruleRowValue"
    // InternalSQLParser.g:2168:1: ruleRowValue returns [EObject current=null] : (this_ScalarNumberOperand_0= ruleScalarNumberOperand | ( (lv_null_1_0= NULL ) ) ) ;
    public final EObject ruleRowValue() throws RecognitionException {
        EObject current = null;

        Token lv_null_1_0=null;
        EObject this_ScalarNumberOperand_0 = null;



        	enterRule();

        try {
            // InternalSQLParser.g:2174:2: ( (this_ScalarNumberOperand_0= ruleScalarNumberOperand | ( (lv_null_1_0= NULL ) ) ) )
            // InternalSQLParser.g:2175:2: (this_ScalarNumberOperand_0= ruleScalarNumberOperand | ( (lv_null_1_0= NULL ) ) )
            {
            // InternalSQLParser.g:2175:2: (this_ScalarNumberOperand_0= ruleScalarNumberOperand | ( (lv_null_1_0= NULL ) ) )
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( ((LA48_0>=RULE_UNSIGNED && LA48_0<=RULE_SIGNED_DOUBLE)||LA48_0==RULE_STRING_) ) {
                alt48=1;
            }
            else if ( (LA48_0==NULL) ) {
                alt48=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 48, 0, input);

                throw nvae;
            }
            switch (alt48) {
                case 1 :
                    // InternalSQLParser.g:2176:3: this_ScalarNumberOperand_0= ruleScalarNumberOperand
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getRowValueAccess().getScalarNumberOperandParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_ScalarNumberOperand_0=ruleScalarNumberOperand();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_ScalarNumberOperand_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalSQLParser.g:2188:3: ( (lv_null_1_0= NULL ) )
                    {
                    // InternalSQLParser.g:2188:3: ( (lv_null_1_0= NULL ) )
                    // InternalSQLParser.g:2189:4: (lv_null_1_0= NULL )
                    {
                    // InternalSQLParser.g:2189:4: (lv_null_1_0= NULL )
                    // InternalSQLParser.g:2190:5: lv_null_1_0= NULL
                    {
                    lv_null_1_0=(Token)match(input,NULL,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_null_1_0, grammarAccess.getRowValueAccess().getNullNULLKeyword_1_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getRowValueRule());
                      					}
                      					setWithLastConsumed(current, "null", lv_null_1_0, "NULL");
                      				
                    }

                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRowValue"


    // $ANTLR start "entryRulePivotTable"
    // InternalSQLParser.g:2206:1: entryRulePivotTable returns [EObject current=null] : iv_rulePivotTable= rulePivotTable EOF ;
    public final EObject entryRulePivotTable() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePivotTable = null;


        try {
            // InternalSQLParser.g:2206:51: (iv_rulePivotTable= rulePivotTable EOF )
            // InternalSQLParser.g:2207:2: iv_rulePivotTable= rulePivotTable EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPivotTableRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulePivotTable=rulePivotTable();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePivotTable; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePivotTable"


    // $ANTLR start "rulePivotTable"
    // InternalSQLParser.g:2213:1: rulePivotTable returns [EObject current=null] : (otherlv_0= PIVOT (otherlv_1= XML )? otherlv_2= LeftParenthesis ( (lv_pfun_3_0= rulePivotFunctions ) ) ( (lv_pfor_4_0= rulePivotForClause ) ) ( (lv_pin_5_0= rulePivotInClause ) ) otherlv_6= RightParenthesis ) ;
    public final EObject rulePivotTable() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_6=null;
        EObject lv_pfun_3_0 = null;

        EObject lv_pfor_4_0 = null;

        EObject lv_pin_5_0 = null;



        	enterRule();

        try {
            // InternalSQLParser.g:2219:2: ( (otherlv_0= PIVOT (otherlv_1= XML )? otherlv_2= LeftParenthesis ( (lv_pfun_3_0= rulePivotFunctions ) ) ( (lv_pfor_4_0= rulePivotForClause ) ) ( (lv_pin_5_0= rulePivotInClause ) ) otherlv_6= RightParenthesis ) )
            // InternalSQLParser.g:2220:2: (otherlv_0= PIVOT (otherlv_1= XML )? otherlv_2= LeftParenthesis ( (lv_pfun_3_0= rulePivotFunctions ) ) ( (lv_pfor_4_0= rulePivotForClause ) ) ( (lv_pin_5_0= rulePivotInClause ) ) otherlv_6= RightParenthesis )
            {
            // InternalSQLParser.g:2220:2: (otherlv_0= PIVOT (otherlv_1= XML )? otherlv_2= LeftParenthesis ( (lv_pfun_3_0= rulePivotFunctions ) ) ( (lv_pfor_4_0= rulePivotForClause ) ) ( (lv_pin_5_0= rulePivotInClause ) ) otherlv_6= RightParenthesis )
            // InternalSQLParser.g:2221:3: otherlv_0= PIVOT (otherlv_1= XML )? otherlv_2= LeftParenthesis ( (lv_pfun_3_0= rulePivotFunctions ) ) ( (lv_pfor_4_0= rulePivotForClause ) ) ( (lv_pin_5_0= rulePivotInClause ) ) otherlv_6= RightParenthesis
            {
            otherlv_0=(Token)match(input,PIVOT,FOLLOW_45); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getPivotTableAccess().getPIVOTKeyword_0());
              		
            }
            // InternalSQLParser.g:2225:3: (otherlv_1= XML )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==XML) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // InternalSQLParser.g:2226:4: otherlv_1= XML
                    {
                    otherlv_1=(Token)match(input,XML,FOLLOW_7); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getPivotTableAccess().getXMLKeyword_1());
                      			
                    }

                    }
                    break;

            }

            otherlv_2=(Token)match(input,LeftParenthesis,FOLLOW_46); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getPivotTableAccess().getLeftParenthesisKeyword_2());
              		
            }
            // InternalSQLParser.g:2235:3: ( (lv_pfun_3_0= rulePivotFunctions ) )
            // InternalSQLParser.g:2236:4: (lv_pfun_3_0= rulePivotFunctions )
            {
            // InternalSQLParser.g:2236:4: (lv_pfun_3_0= rulePivotFunctions )
            // InternalSQLParser.g:2237:5: lv_pfun_3_0= rulePivotFunctions
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getPivotTableAccess().getPfunPivotFunctionsParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_47);
            lv_pfun_3_0=rulePivotFunctions();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getPivotTableRule());
              					}
              					set(
              						current,
              						"pfun",
              						lv_pfun_3_0,
              						"org.xtext.example.mydsl_sql.SQL.PivotFunctions");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalSQLParser.g:2254:3: ( (lv_pfor_4_0= rulePivotForClause ) )
            // InternalSQLParser.g:2255:4: (lv_pfor_4_0= rulePivotForClause )
            {
            // InternalSQLParser.g:2255:4: (lv_pfor_4_0= rulePivotForClause )
            // InternalSQLParser.g:2256:5: lv_pfor_4_0= rulePivotForClause
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getPivotTableAccess().getPforPivotForClauseParserRuleCall_4_0());
              				
            }
            pushFollow(FOLLOW_48);
            lv_pfor_4_0=rulePivotForClause();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getPivotTableRule());
              					}
              					set(
              						current,
              						"pfor",
              						lv_pfor_4_0,
              						"org.xtext.example.mydsl_sql.SQL.PivotForClause");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalSQLParser.g:2273:3: ( (lv_pin_5_0= rulePivotInClause ) )
            // InternalSQLParser.g:2274:4: (lv_pin_5_0= rulePivotInClause )
            {
            // InternalSQLParser.g:2274:4: (lv_pin_5_0= rulePivotInClause )
            // InternalSQLParser.g:2275:5: lv_pin_5_0= rulePivotInClause
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getPivotTableAccess().getPinPivotInClauseParserRuleCall_5_0());
              				
            }
            pushFollow(FOLLOW_8);
            lv_pin_5_0=rulePivotInClause();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getPivotTableRule());
              					}
              					set(
              						current,
              						"pin",
              						lv_pin_5_0,
              						"org.xtext.example.mydsl_sql.SQL.PivotInClause");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_6=(Token)match(input,RightParenthesis,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getPivotTableAccess().getRightParenthesisKeyword_6());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePivotTable"


    // $ANTLR start "entryRulePivotFunctions"
    // InternalSQLParser.g:2300:1: entryRulePivotFunctions returns [EObject current=null] : iv_rulePivotFunctions= rulePivotFunctions EOF ;
    public final EObject entryRulePivotFunctions() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePivotFunctions = null;


        try {
            // InternalSQLParser.g:2300:55: (iv_rulePivotFunctions= rulePivotFunctions EOF )
            // InternalSQLParser.g:2301:2: iv_rulePivotFunctions= rulePivotFunctions EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPivotFunctionsRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulePivotFunctions=rulePivotFunctions();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePivotFunctions; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePivotFunctions"


    // $ANTLR start "rulePivotFunctions"
    // InternalSQLParser.g:2307:1: rulePivotFunctions returns [EObject current=null] : ( (lv_abc_0_0= RULE_ID ) ) ;
    public final EObject rulePivotFunctions() throws RecognitionException {
        EObject current = null;

        Token lv_abc_0_0=null;


        	enterRule();

        try {
            // InternalSQLParser.g:2313:2: ( ( (lv_abc_0_0= RULE_ID ) ) )
            // InternalSQLParser.g:2314:2: ( (lv_abc_0_0= RULE_ID ) )
            {
            // InternalSQLParser.g:2314:2: ( (lv_abc_0_0= RULE_ID ) )
            // InternalSQLParser.g:2315:3: (lv_abc_0_0= RULE_ID )
            {
            // InternalSQLParser.g:2315:3: (lv_abc_0_0= RULE_ID )
            // InternalSQLParser.g:2316:4: lv_abc_0_0= RULE_ID
            {
            lv_abc_0_0=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(lv_abc_0_0, grammarAccess.getPivotFunctionsAccess().getAbcIDTerminalRuleCall_0());
              			
            }
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElement(grammarAccess.getPivotFunctionsRule());
              				}
              				setWithLastConsumed(
              					current,
              					"abc",
              					lv_abc_0_0,
              					"org.xtext.example.mydsl_sql.SQL.ID");
              			
            }

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePivotFunctions"


    // $ANTLR start "entryRulePivotInClause"
    // InternalSQLParser.g:2335:1: entryRulePivotInClause returns [EObject current=null] : iv_rulePivotInClause= rulePivotInClause EOF ;
    public final EObject entryRulePivotInClause() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePivotInClause = null;


        try {
            // InternalSQLParser.g:2335:54: (iv_rulePivotInClause= rulePivotInClause EOF )
            // InternalSQLParser.g:2336:2: iv_rulePivotInClause= rulePivotInClause EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPivotInClauseRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulePivotInClause=rulePivotInClause();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePivotInClause; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePivotInClause"


    // $ANTLR start "rulePivotInClause"
    // InternalSQLParser.g:2342:1: rulePivotInClause returns [EObject current=null] : (otherlv_0= IN otherlv_1= LeftParenthesis ( ( (lv_sq_2_0= ruleSubQueryOperand ) ) | ( (lv_args_3_0= ruleUnpivotInClauseArgs ) ) | ( (lv_pinany_4_0= rulePivotInClauseAny ) ) ) otherlv_5= RightParenthesis ) ;
    public final EObject rulePivotInClause() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_5=null;
        EObject lv_sq_2_0 = null;

        EObject lv_args_3_0 = null;

        AntlrDatatypeRuleToken lv_pinany_4_0 = null;



        	enterRule();

        try {
            // InternalSQLParser.g:2348:2: ( (otherlv_0= IN otherlv_1= LeftParenthesis ( ( (lv_sq_2_0= ruleSubQueryOperand ) ) | ( (lv_args_3_0= ruleUnpivotInClauseArgs ) ) | ( (lv_pinany_4_0= rulePivotInClauseAny ) ) ) otherlv_5= RightParenthesis ) )
            // InternalSQLParser.g:2349:2: (otherlv_0= IN otherlv_1= LeftParenthesis ( ( (lv_sq_2_0= ruleSubQueryOperand ) ) | ( (lv_args_3_0= ruleUnpivotInClauseArgs ) ) | ( (lv_pinany_4_0= rulePivotInClauseAny ) ) ) otherlv_5= RightParenthesis )
            {
            // InternalSQLParser.g:2349:2: (otherlv_0= IN otherlv_1= LeftParenthesis ( ( (lv_sq_2_0= ruleSubQueryOperand ) ) | ( (lv_args_3_0= ruleUnpivotInClauseArgs ) ) | ( (lv_pinany_4_0= rulePivotInClauseAny ) ) ) otherlv_5= RightParenthesis )
            // InternalSQLParser.g:2350:3: otherlv_0= IN otherlv_1= LeftParenthesis ( ( (lv_sq_2_0= ruleSubQueryOperand ) ) | ( (lv_args_3_0= ruleUnpivotInClauseArgs ) ) | ( (lv_pinany_4_0= rulePivotInClauseAny ) ) ) otherlv_5= RightParenthesis
            {
            otherlv_0=(Token)match(input,IN,FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getPivotInClauseAccess().getINKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,LeftParenthesis,FOLLOW_49); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getPivotInClauseAccess().getLeftParenthesisKeyword_1());
              		
            }
            // InternalSQLParser.g:2358:3: ( ( (lv_sq_2_0= ruleSubQueryOperand ) ) | ( (lv_args_3_0= ruleUnpivotInClauseArgs ) ) | ( (lv_pinany_4_0= rulePivotInClauseAny ) ) )
            int alt50=3;
            switch ( input.LA(1) ) {
            case LeftParenthesis:
                {
                int LA50_1 = input.LA(2);

                if ( ((LA50_1>=RULE_STRING && LA50_1<=RULE_ID)) ) {
                    alt50=2;
                }
                else if ( (LA50_1==SELECT) ) {
                    alt50=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 50, 1, input);

                    throw nvae;
                }
                }
                break;
            case RULE_STRING:
            case RULE_DBNAME:
            case RULE_ID:
                {
                alt50=2;
                }
                break;
            case ANY:
                {
                alt50=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 50, 0, input);

                throw nvae;
            }

            switch (alt50) {
                case 1 :
                    // InternalSQLParser.g:2359:4: ( (lv_sq_2_0= ruleSubQueryOperand ) )
                    {
                    // InternalSQLParser.g:2359:4: ( (lv_sq_2_0= ruleSubQueryOperand ) )
                    // InternalSQLParser.g:2360:5: (lv_sq_2_0= ruleSubQueryOperand )
                    {
                    // InternalSQLParser.g:2360:5: (lv_sq_2_0= ruleSubQueryOperand )
                    // InternalSQLParser.g:2361:6: lv_sq_2_0= ruleSubQueryOperand
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getPivotInClauseAccess().getSqSubQueryOperandParserRuleCall_2_0_0());
                      					
                    }
                    pushFollow(FOLLOW_8);
                    lv_sq_2_0=ruleSubQueryOperand();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getPivotInClauseRule());
                      						}
                      						set(
                      							current,
                      							"sq",
                      							lv_sq_2_0,
                      							"org.xtext.example.mydsl_sql.SQL.SubQueryOperand");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalSQLParser.g:2379:4: ( (lv_args_3_0= ruleUnpivotInClauseArgs ) )
                    {
                    // InternalSQLParser.g:2379:4: ( (lv_args_3_0= ruleUnpivotInClauseArgs ) )
                    // InternalSQLParser.g:2380:5: (lv_args_3_0= ruleUnpivotInClauseArgs )
                    {
                    // InternalSQLParser.g:2380:5: (lv_args_3_0= ruleUnpivotInClauseArgs )
                    // InternalSQLParser.g:2381:6: lv_args_3_0= ruleUnpivotInClauseArgs
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getPivotInClauseAccess().getArgsUnpivotInClauseArgsParserRuleCall_2_1_0());
                      					
                    }
                    pushFollow(FOLLOW_8);
                    lv_args_3_0=ruleUnpivotInClauseArgs();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getPivotInClauseRule());
                      						}
                      						set(
                      							current,
                      							"args",
                      							lv_args_3_0,
                      							"org.xtext.example.mydsl_sql.SQL.UnpivotInClauseArgs");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalSQLParser.g:2399:4: ( (lv_pinany_4_0= rulePivotInClauseAny ) )
                    {
                    // InternalSQLParser.g:2399:4: ( (lv_pinany_4_0= rulePivotInClauseAny ) )
                    // InternalSQLParser.g:2400:5: (lv_pinany_4_0= rulePivotInClauseAny )
                    {
                    // InternalSQLParser.g:2400:5: (lv_pinany_4_0= rulePivotInClauseAny )
                    // InternalSQLParser.g:2401:6: lv_pinany_4_0= rulePivotInClauseAny
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getPivotInClauseAccess().getPinanyPivotInClauseAnyParserRuleCall_2_2_0());
                      					
                    }
                    pushFollow(FOLLOW_8);
                    lv_pinany_4_0=rulePivotInClauseAny();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getPivotInClauseRule());
                      						}
                      						set(
                      							current,
                      							"pinany",
                      							lv_pinany_4_0,
                      							"org.xtext.example.mydsl_sql.SQL.PivotInClauseAny");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,RightParenthesis,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getPivotInClauseAccess().getRightParenthesisKeyword_3());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePivotInClause"


    // $ANTLR start "entryRulePivotInClauseAny"
    // InternalSQLParser.g:2427:1: entryRulePivotInClauseAny returns [String current=null] : iv_rulePivotInClauseAny= rulePivotInClauseAny EOF ;
    public final String entryRulePivotInClauseAny() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePivotInClauseAny = null;


        try {
            // InternalSQLParser.g:2427:56: (iv_rulePivotInClauseAny= rulePivotInClauseAny EOF )
            // InternalSQLParser.g:2428:2: iv_rulePivotInClauseAny= rulePivotInClauseAny EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPivotInClauseAnyRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulePivotInClauseAny=rulePivotInClauseAny();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePivotInClauseAny.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePivotInClauseAny"


    // $ANTLR start "rulePivotInClauseAny"
    // InternalSQLParser.g:2434:1: rulePivotInClauseAny returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= ANY (kw= Comma kw= ANY )* ) ;
    public final AntlrDatatypeRuleToken rulePivotInClauseAny() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalSQLParser.g:2440:2: ( (kw= ANY (kw= Comma kw= ANY )* ) )
            // InternalSQLParser.g:2441:2: (kw= ANY (kw= Comma kw= ANY )* )
            {
            // InternalSQLParser.g:2441:2: (kw= ANY (kw= Comma kw= ANY )* )
            // InternalSQLParser.g:2442:3: kw= ANY (kw= Comma kw= ANY )*
            {
            kw=(Token)match(input,ANY,FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getPivotInClauseAnyAccess().getANYKeyword_0());
              		
            }
            // InternalSQLParser.g:2447:3: (kw= Comma kw= ANY )*
            loop51:
            do {
                int alt51=2;
                int LA51_0 = input.LA(1);

                if ( (LA51_0==Comma) ) {
                    alt51=1;
                }


                switch (alt51) {
            	case 1 :
            	    // InternalSQLParser.g:2448:4: kw= Comma kw= ANY
            	    {
            	    kw=(Token)match(input,Comma,FOLLOW_50); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(kw);
            	      				newLeafNode(kw, grammarAccess.getPivotInClauseAnyAccess().getCommaKeyword_1_0());
            	      			
            	    }
            	    kw=(Token)match(input,ANY,FOLLOW_9); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(kw);
            	      				newLeafNode(kw, grammarAccess.getPivotInClauseAnyAccess().getANYKeyword_1_1());
            	      			
            	    }

            	    }
            	    break;

            	default :
            	    break loop51;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePivotInClauseAny"


    // $ANTLR start "entryRuleUnpivotTable"
    // InternalSQLParser.g:2463:1: entryRuleUnpivotTable returns [EObject current=null] : iv_ruleUnpivotTable= ruleUnpivotTable EOF ;
    public final EObject entryRuleUnpivotTable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnpivotTable = null;


        try {
            // InternalSQLParser.g:2463:53: (iv_ruleUnpivotTable= ruleUnpivotTable EOF )
            // InternalSQLParser.g:2464:2: iv_ruleUnpivotTable= ruleUnpivotTable EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getUnpivotTableRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleUnpivotTable=ruleUnpivotTable();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleUnpivotTable; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleUnpivotTable"


    // $ANTLR start "ruleUnpivotTable"
    // InternalSQLParser.g:2470:1: ruleUnpivotTable returns [EObject current=null] : (otherlv_0= UNPIVOT ( (otherlv_1= INCLUDE | otherlv_2= EXCLUDE ) otherlv_3= NULLS )? otherlv_4= LeftParenthesis ( (lv_pcols_5_0= rulePivotColumns ) ) ( (lv_pfor_6_0= rulePivotForClause ) ) ( (lv_inop_7_0= ruleUnpivotInClause ) ) otherlv_8= RightParenthesis ) ;
    public final EObject ruleUnpivotTable() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_8=null;
        EObject lv_pcols_5_0 = null;

        EObject lv_pfor_6_0 = null;

        EObject lv_inop_7_0 = null;



        	enterRule();

        try {
            // InternalSQLParser.g:2476:2: ( (otherlv_0= UNPIVOT ( (otherlv_1= INCLUDE | otherlv_2= EXCLUDE ) otherlv_3= NULLS )? otherlv_4= LeftParenthesis ( (lv_pcols_5_0= rulePivotColumns ) ) ( (lv_pfor_6_0= rulePivotForClause ) ) ( (lv_inop_7_0= ruleUnpivotInClause ) ) otherlv_8= RightParenthesis ) )
            // InternalSQLParser.g:2477:2: (otherlv_0= UNPIVOT ( (otherlv_1= INCLUDE | otherlv_2= EXCLUDE ) otherlv_3= NULLS )? otherlv_4= LeftParenthesis ( (lv_pcols_5_0= rulePivotColumns ) ) ( (lv_pfor_6_0= rulePivotForClause ) ) ( (lv_inop_7_0= ruleUnpivotInClause ) ) otherlv_8= RightParenthesis )
            {
            // InternalSQLParser.g:2477:2: (otherlv_0= UNPIVOT ( (otherlv_1= INCLUDE | otherlv_2= EXCLUDE ) otherlv_3= NULLS )? otherlv_4= LeftParenthesis ( (lv_pcols_5_0= rulePivotColumns ) ) ( (lv_pfor_6_0= rulePivotForClause ) ) ( (lv_inop_7_0= ruleUnpivotInClause ) ) otherlv_8= RightParenthesis )
            // InternalSQLParser.g:2478:3: otherlv_0= UNPIVOT ( (otherlv_1= INCLUDE | otherlv_2= EXCLUDE ) otherlv_3= NULLS )? otherlv_4= LeftParenthesis ( (lv_pcols_5_0= rulePivotColumns ) ) ( (lv_pfor_6_0= rulePivotForClause ) ) ( (lv_inop_7_0= ruleUnpivotInClause ) ) otherlv_8= RightParenthesis
            {
            otherlv_0=(Token)match(input,UNPIVOT,FOLLOW_51); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getUnpivotTableAccess().getUNPIVOTKeyword_0());
              		
            }
            // InternalSQLParser.g:2482:3: ( (otherlv_1= INCLUDE | otherlv_2= EXCLUDE ) otherlv_3= NULLS )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==EXCLUDE||LA53_0==INCLUDE) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // InternalSQLParser.g:2483:4: (otherlv_1= INCLUDE | otherlv_2= EXCLUDE ) otherlv_3= NULLS
                    {
                    // InternalSQLParser.g:2483:4: (otherlv_1= INCLUDE | otherlv_2= EXCLUDE )
                    int alt52=2;
                    int LA52_0 = input.LA(1);

                    if ( (LA52_0==INCLUDE) ) {
                        alt52=1;
                    }
                    else if ( (LA52_0==EXCLUDE) ) {
                        alt52=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 52, 0, input);

                        throw nvae;
                    }
                    switch (alt52) {
                        case 1 :
                            // InternalSQLParser.g:2484:5: otherlv_1= INCLUDE
                            {
                            otherlv_1=(Token)match(input,INCLUDE,FOLLOW_52); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_1, grammarAccess.getUnpivotTableAccess().getINCLUDEKeyword_1_0_0());
                              				
                            }

                            }
                            break;
                        case 2 :
                            // InternalSQLParser.g:2489:5: otherlv_2= EXCLUDE
                            {
                            otherlv_2=(Token)match(input,EXCLUDE,FOLLOW_52); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_2, grammarAccess.getUnpivotTableAccess().getEXCLUDEKeyword_1_0_1());
                              				
                            }

                            }
                            break;

                    }

                    otherlv_3=(Token)match(input,NULLS,FOLLOW_7); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getUnpivotTableAccess().getNULLSKeyword_1_1());
                      			
                    }

                    }
                    break;

            }

            otherlv_4=(Token)match(input,LeftParenthesis,FOLLOW_21); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getUnpivotTableAccess().getLeftParenthesisKeyword_2());
              		
            }
            // InternalSQLParser.g:2503:3: ( (lv_pcols_5_0= rulePivotColumns ) )
            // InternalSQLParser.g:2504:4: (lv_pcols_5_0= rulePivotColumns )
            {
            // InternalSQLParser.g:2504:4: (lv_pcols_5_0= rulePivotColumns )
            // InternalSQLParser.g:2505:5: lv_pcols_5_0= rulePivotColumns
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getUnpivotTableAccess().getPcolsPivotColumnsParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_47);
            lv_pcols_5_0=rulePivotColumns();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getUnpivotTableRule());
              					}
              					set(
              						current,
              						"pcols",
              						lv_pcols_5_0,
              						"org.xtext.example.mydsl_sql.SQL.PivotColumns");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalSQLParser.g:2522:3: ( (lv_pfor_6_0= rulePivotForClause ) )
            // InternalSQLParser.g:2523:4: (lv_pfor_6_0= rulePivotForClause )
            {
            // InternalSQLParser.g:2523:4: (lv_pfor_6_0= rulePivotForClause )
            // InternalSQLParser.g:2524:5: lv_pfor_6_0= rulePivotForClause
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getUnpivotTableAccess().getPforPivotForClauseParserRuleCall_4_0());
              				
            }
            pushFollow(FOLLOW_48);
            lv_pfor_6_0=rulePivotForClause();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getUnpivotTableRule());
              					}
              					set(
              						current,
              						"pfor",
              						lv_pfor_6_0,
              						"org.xtext.example.mydsl_sql.SQL.PivotForClause");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalSQLParser.g:2541:3: ( (lv_inop_7_0= ruleUnpivotInClause ) )
            // InternalSQLParser.g:2542:4: (lv_inop_7_0= ruleUnpivotInClause )
            {
            // InternalSQLParser.g:2542:4: (lv_inop_7_0= ruleUnpivotInClause )
            // InternalSQLParser.g:2543:5: lv_inop_7_0= ruleUnpivotInClause
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getUnpivotTableAccess().getInopUnpivotInClauseParserRuleCall_5_0());
              				
            }
            pushFollow(FOLLOW_8);
            lv_inop_7_0=ruleUnpivotInClause();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getUnpivotTableRule());
              					}
              					set(
              						current,
              						"inop",
              						lv_inop_7_0,
              						"org.xtext.example.mydsl_sql.SQL.UnpivotInClause");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_8=(Token)match(input,RightParenthesis,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_8, grammarAccess.getUnpivotTableAccess().getRightParenthesisKeyword_6());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleUnpivotTable"


    // $ANTLR start "entryRuleUnpivotInClause"
    // InternalSQLParser.g:2568:1: entryRuleUnpivotInClause returns [EObject current=null] : iv_ruleUnpivotInClause= ruleUnpivotInClause EOF ;
    public final EObject entryRuleUnpivotInClause() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnpivotInClause = null;


        try {
            // InternalSQLParser.g:2568:56: (iv_ruleUnpivotInClause= ruleUnpivotInClause EOF )
            // InternalSQLParser.g:2569:2: iv_ruleUnpivotInClause= ruleUnpivotInClause EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getUnpivotInClauseRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleUnpivotInClause=ruleUnpivotInClause();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleUnpivotInClause; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleUnpivotInClause"


    // $ANTLR start "ruleUnpivotInClause"
    // InternalSQLParser.g:2575:1: ruleUnpivotInClause returns [EObject current=null] : ( () ( (lv_op_1_0= IN ) ) otherlv_2= LeftParenthesis ( (lv_args_3_0= ruleUnpivotInClauseArgs ) ) otherlv_4= RightParenthesis ) ;
    public final EObject ruleUnpivotInClause() throws RecognitionException {
        EObject current = null;

        Token lv_op_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_args_3_0 = null;



        	enterRule();

        try {
            // InternalSQLParser.g:2581:2: ( ( () ( (lv_op_1_0= IN ) ) otherlv_2= LeftParenthesis ( (lv_args_3_0= ruleUnpivotInClauseArgs ) ) otherlv_4= RightParenthesis ) )
            // InternalSQLParser.g:2582:2: ( () ( (lv_op_1_0= IN ) ) otherlv_2= LeftParenthesis ( (lv_args_3_0= ruleUnpivotInClauseArgs ) ) otherlv_4= RightParenthesis )
            {
            // InternalSQLParser.g:2582:2: ( () ( (lv_op_1_0= IN ) ) otherlv_2= LeftParenthesis ( (lv_args_3_0= ruleUnpivotInClauseArgs ) ) otherlv_4= RightParenthesis )
            // InternalSQLParser.g:2583:3: () ( (lv_op_1_0= IN ) ) otherlv_2= LeftParenthesis ( (lv_args_3_0= ruleUnpivotInClauseArgs ) ) otherlv_4= RightParenthesis
            {
            // InternalSQLParser.g:2583:3: ()
            // InternalSQLParser.g:2584:4: 
            {
            if ( state.backtracking==0 ) {

              				/* */
              			
            }
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getUnpivotInClauseAccess().getUnipivotInClauseAction_0(),
              					current);
              			
            }

            }

            // InternalSQLParser.g:2593:3: ( (lv_op_1_0= IN ) )
            // InternalSQLParser.g:2594:4: (lv_op_1_0= IN )
            {
            // InternalSQLParser.g:2594:4: (lv_op_1_0= IN )
            // InternalSQLParser.g:2595:5: lv_op_1_0= IN
            {
            lv_op_1_0=(Token)match(input,IN,FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_op_1_0, grammarAccess.getUnpivotInClauseAccess().getOpINKeyword_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getUnpivotInClauseRule());
              					}
              					setWithLastConsumed(current, "op", lv_op_1_0, "IN");
              				
            }

            }


            }

            otherlv_2=(Token)match(input,LeftParenthesis,FOLLOW_21); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getUnpivotInClauseAccess().getLeftParenthesisKeyword_2());
              		
            }
            // InternalSQLParser.g:2611:3: ( (lv_args_3_0= ruleUnpivotInClauseArgs ) )
            // InternalSQLParser.g:2612:4: (lv_args_3_0= ruleUnpivotInClauseArgs )
            {
            // InternalSQLParser.g:2612:4: (lv_args_3_0= ruleUnpivotInClauseArgs )
            // InternalSQLParser.g:2613:5: lv_args_3_0= ruleUnpivotInClauseArgs
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getUnpivotInClauseAccess().getArgsUnpivotInClauseArgsParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_8);
            lv_args_3_0=ruleUnpivotInClauseArgs();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getUnpivotInClauseRule());
              					}
              					set(
              						current,
              						"args",
              						lv_args_3_0,
              						"org.xtext.example.mydsl_sql.SQL.UnpivotInClauseArgs");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_4=(Token)match(input,RightParenthesis,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getUnpivotInClauseAccess().getRightParenthesisKeyword_4());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleUnpivotInClause"


    // $ANTLR start "entryRuleUnpivotInClauseArgs"
    // InternalSQLParser.g:2638:1: entryRuleUnpivotInClauseArgs returns [EObject current=null] : iv_ruleUnpivotInClauseArgs= ruleUnpivotInClauseArgs EOF ;
    public final EObject entryRuleUnpivotInClauseArgs() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnpivotInClauseArgs = null;


        try {
            // InternalSQLParser.g:2638:60: (iv_ruleUnpivotInClauseArgs= ruleUnpivotInClauseArgs EOF )
            // InternalSQLParser.g:2639:2: iv_ruleUnpivotInClauseArgs= ruleUnpivotInClauseArgs EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getUnpivotInClauseArgsRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleUnpivotInClauseArgs=ruleUnpivotInClauseArgs();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleUnpivotInClauseArgs; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleUnpivotInClauseArgs"


    // $ANTLR start "ruleUnpivotInClauseArgs"
    // InternalSQLParser.g:2645:1: ruleUnpivotInClauseArgs returns [EObject current=null] : (this_UnpivotInClauseArg_0= ruleUnpivotInClauseArg ( () (otherlv_2= Comma ( (lv_entries_3_0= ruleUnpivotInClauseArg ) ) )+ )? ) ;
    public final EObject ruleUnpivotInClauseArgs() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_UnpivotInClauseArg_0 = null;

        EObject lv_entries_3_0 = null;



        	enterRule();

        try {
            // InternalSQLParser.g:2651:2: ( (this_UnpivotInClauseArg_0= ruleUnpivotInClauseArg ( () (otherlv_2= Comma ( (lv_entries_3_0= ruleUnpivotInClauseArg ) ) )+ )? ) )
            // InternalSQLParser.g:2652:2: (this_UnpivotInClauseArg_0= ruleUnpivotInClauseArg ( () (otherlv_2= Comma ( (lv_entries_3_0= ruleUnpivotInClauseArg ) ) )+ )? )
            {
            // InternalSQLParser.g:2652:2: (this_UnpivotInClauseArg_0= ruleUnpivotInClauseArg ( () (otherlv_2= Comma ( (lv_entries_3_0= ruleUnpivotInClauseArg ) ) )+ )? )
            // InternalSQLParser.g:2653:3: this_UnpivotInClauseArg_0= ruleUnpivotInClauseArg ( () (otherlv_2= Comma ( (lv_entries_3_0= ruleUnpivotInClauseArg ) ) )+ )?
            {
            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getUnpivotInClauseArgsAccess().getUnpivotInClauseArgParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_9);
            this_UnpivotInClauseArg_0=ruleUnpivotInClauseArg();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_UnpivotInClauseArg_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalSQLParser.g:2664:3: ( () (otherlv_2= Comma ( (lv_entries_3_0= ruleUnpivotInClauseArg ) ) )+ )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==Comma) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // InternalSQLParser.g:2665:4: () (otherlv_2= Comma ( (lv_entries_3_0= ruleUnpivotInClauseArg ) ) )+
                    {
                    // InternalSQLParser.g:2665:4: ()
                    // InternalSQLParser.g:2666:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					/* */
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElementAndAdd(
                      						grammarAccess.getUnpivotInClauseArgsAccess().getUicargsEntriesAction_1_0(),
                      						current);
                      				
                    }

                    }

                    // InternalSQLParser.g:2675:4: (otherlv_2= Comma ( (lv_entries_3_0= ruleUnpivotInClauseArg ) ) )+
                    int cnt54=0;
                    loop54:
                    do {
                        int alt54=2;
                        int LA54_0 = input.LA(1);

                        if ( (LA54_0==Comma) ) {
                            alt54=1;
                        }


                        switch (alt54) {
                    	case 1 :
                    	    // InternalSQLParser.g:2676:5: otherlv_2= Comma ( (lv_entries_3_0= ruleUnpivotInClauseArg ) )
                    	    {
                    	    otherlv_2=(Token)match(input,Comma,FOLLOW_21); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_2, grammarAccess.getUnpivotInClauseArgsAccess().getCommaKeyword_1_1_0());
                    	      				
                    	    }
                    	    // InternalSQLParser.g:2680:5: ( (lv_entries_3_0= ruleUnpivotInClauseArg ) )
                    	    // InternalSQLParser.g:2681:6: (lv_entries_3_0= ruleUnpivotInClauseArg )
                    	    {
                    	    // InternalSQLParser.g:2681:6: (lv_entries_3_0= ruleUnpivotInClauseArg )
                    	    // InternalSQLParser.g:2682:7: lv_entries_3_0= ruleUnpivotInClauseArg
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getUnpivotInClauseArgsAccess().getEntriesUnpivotInClauseArgParserRuleCall_1_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_9);
                    	    lv_entries_3_0=ruleUnpivotInClauseArg();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getUnpivotInClauseArgsRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"entries",
                    	      								lv_entries_3_0,
                    	      								"org.xtext.example.mydsl_sql.SQL.UnpivotInClauseArg");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt54 >= 1 ) break loop54;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(54, input);
                                throw eee;
                        }
                        cnt54++;
                    } while (true);


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleUnpivotInClauseArgs"


    // $ANTLR start "entryRuleUnpivotInClauseArg"
    // InternalSQLParser.g:2705:1: entryRuleUnpivotInClauseArg returns [EObject current=null] : iv_ruleUnpivotInClauseArg= ruleUnpivotInClauseArg EOF ;
    public final EObject entryRuleUnpivotInClauseArg() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnpivotInClauseArg = null;


        try {
            // InternalSQLParser.g:2705:59: (iv_ruleUnpivotInClauseArg= ruleUnpivotInClauseArg EOF )
            // InternalSQLParser.g:2706:2: iv_ruleUnpivotInClauseArg= ruleUnpivotInClauseArg EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getUnpivotInClauseArgRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleUnpivotInClauseArg=ruleUnpivotInClauseArg();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleUnpivotInClauseArg; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleUnpivotInClauseArg"


    // $ANTLR start "ruleUnpivotInClauseArg"
    // InternalSQLParser.g:2712:1: ruleUnpivotInClauseArg returns [EObject current=null] : ( ( (lv_pcols_0_0= rulePivotColumns ) ) (otherlv_1= AS ( (lv_cfuls_2_0= rulePivotColumns ) ) )? ) ;
    public final EObject ruleUnpivotInClauseArg() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_pcols_0_0 = null;

        EObject lv_cfuls_2_0 = null;



        	enterRule();

        try {
            // InternalSQLParser.g:2718:2: ( ( ( (lv_pcols_0_0= rulePivotColumns ) ) (otherlv_1= AS ( (lv_cfuls_2_0= rulePivotColumns ) ) )? ) )
            // InternalSQLParser.g:2719:2: ( ( (lv_pcols_0_0= rulePivotColumns ) ) (otherlv_1= AS ( (lv_cfuls_2_0= rulePivotColumns ) ) )? )
            {
            // InternalSQLParser.g:2719:2: ( ( (lv_pcols_0_0= rulePivotColumns ) ) (otherlv_1= AS ( (lv_cfuls_2_0= rulePivotColumns ) ) )? )
            // InternalSQLParser.g:2720:3: ( (lv_pcols_0_0= rulePivotColumns ) ) (otherlv_1= AS ( (lv_cfuls_2_0= rulePivotColumns ) ) )?
            {
            // InternalSQLParser.g:2720:3: ( (lv_pcols_0_0= rulePivotColumns ) )
            // InternalSQLParser.g:2721:4: (lv_pcols_0_0= rulePivotColumns )
            {
            // InternalSQLParser.g:2721:4: (lv_pcols_0_0= rulePivotColumns )
            // InternalSQLParser.g:2722:5: lv_pcols_0_0= rulePivotColumns
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getUnpivotInClauseArgAccess().getPcolsPivotColumnsParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_53);
            lv_pcols_0_0=rulePivotColumns();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getUnpivotInClauseArgRule());
              					}
              					set(
              						current,
              						"pcols",
              						lv_pcols_0_0,
              						"org.xtext.example.mydsl_sql.SQL.PivotColumns");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalSQLParser.g:2739:3: (otherlv_1= AS ( (lv_cfuls_2_0= rulePivotColumns ) ) )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==AS) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // InternalSQLParser.g:2740:4: otherlv_1= AS ( (lv_cfuls_2_0= rulePivotColumns ) )
                    {
                    otherlv_1=(Token)match(input,AS,FOLLOW_21); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getUnpivotInClauseArgAccess().getASKeyword_1_0());
                      			
                    }
                    // InternalSQLParser.g:2744:4: ( (lv_cfuls_2_0= rulePivotColumns ) )
                    // InternalSQLParser.g:2745:5: (lv_cfuls_2_0= rulePivotColumns )
                    {
                    // InternalSQLParser.g:2745:5: (lv_cfuls_2_0= rulePivotColumns )
                    // InternalSQLParser.g:2746:6: lv_cfuls_2_0= rulePivotColumns
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getUnpivotInClauseArgAccess().getCfulsPivotColumnsParserRuleCall_1_1_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_cfuls_2_0=rulePivotColumns();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getUnpivotInClauseArgRule());
                      						}
                      						set(
                      							current,
                      							"cfuls",
                      							lv_cfuls_2_0,
                      							"org.xtext.example.mydsl_sql.SQL.PivotColumns");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleUnpivotInClauseArg"


    // $ANTLR start "entryRulePivotForClause"
    // InternalSQLParser.g:2768:1: entryRulePivotForClause returns [EObject current=null] : iv_rulePivotForClause= rulePivotForClause EOF ;
    public final EObject entryRulePivotForClause() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePivotForClause = null;


        try {
            // InternalSQLParser.g:2768:55: (iv_rulePivotForClause= rulePivotForClause EOF )
            // InternalSQLParser.g:2769:2: iv_rulePivotForClause= rulePivotForClause EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPivotForClauseRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulePivotForClause=rulePivotForClause();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePivotForClause; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePivotForClause"


    // $ANTLR start "rulePivotForClause"
    // InternalSQLParser.g:2775:1: rulePivotForClause returns [EObject current=null] : (otherlv_0= FOR (this_ColumnFull_1= ruleColumnFull | (otherlv_2= LeftParenthesis this_Columns_3= ruleColumns otherlv_4= RightParenthesis ) ) ) ;
    public final EObject rulePivotForClause() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_ColumnFull_1 = null;

        EObject this_Columns_3 = null;



        	enterRule();

        try {
            // InternalSQLParser.g:2781:2: ( (otherlv_0= FOR (this_ColumnFull_1= ruleColumnFull | (otherlv_2= LeftParenthesis this_Columns_3= ruleColumns otherlv_4= RightParenthesis ) ) ) )
            // InternalSQLParser.g:2782:2: (otherlv_0= FOR (this_ColumnFull_1= ruleColumnFull | (otherlv_2= LeftParenthesis this_Columns_3= ruleColumns otherlv_4= RightParenthesis ) ) )
            {
            // InternalSQLParser.g:2782:2: (otherlv_0= FOR (this_ColumnFull_1= ruleColumnFull | (otherlv_2= LeftParenthesis this_Columns_3= ruleColumns otherlv_4= RightParenthesis ) ) )
            // InternalSQLParser.g:2783:3: otherlv_0= FOR (this_ColumnFull_1= ruleColumnFull | (otherlv_2= LeftParenthesis this_Columns_3= ruleColumns otherlv_4= RightParenthesis ) )
            {
            otherlv_0=(Token)match(input,FOR,FOLLOW_21); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getPivotForClauseAccess().getFORKeyword_0());
              		
            }
            // InternalSQLParser.g:2787:3: (this_ColumnFull_1= ruleColumnFull | (otherlv_2= LeftParenthesis this_Columns_3= ruleColumns otherlv_4= RightParenthesis ) )
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( ((LA57_0>=RULE_STRING && LA57_0<=RULE_ID)) ) {
                alt57=1;
            }
            else if ( (LA57_0==LeftParenthesis) ) {
                alt57=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 57, 0, input);

                throw nvae;
            }
            switch (alt57) {
                case 1 :
                    // InternalSQLParser.g:2788:4: this_ColumnFull_1= ruleColumnFull
                    {
                    if ( state.backtracking==0 ) {

                      				/* */
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getPivotForClauseAccess().getColumnFullParserRuleCall_1_0());
                      			
                    }
                    pushFollow(FOLLOW_2);
                    this_ColumnFull_1=ruleColumnFull();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_ColumnFull_1;
                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }
                    break;
                case 2 :
                    // InternalSQLParser.g:2800:4: (otherlv_2= LeftParenthesis this_Columns_3= ruleColumns otherlv_4= RightParenthesis )
                    {
                    // InternalSQLParser.g:2800:4: (otherlv_2= LeftParenthesis this_Columns_3= ruleColumns otherlv_4= RightParenthesis )
                    // InternalSQLParser.g:2801:5: otherlv_2= LeftParenthesis this_Columns_3= ruleColumns otherlv_4= RightParenthesis
                    {
                    otherlv_2=(Token)match(input,LeftParenthesis,FOLLOW_15); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_2, grammarAccess.getPivotForClauseAccess().getLeftParenthesisKeyword_1_1_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					/* */
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getPivotForClauseAccess().getColumnsParserRuleCall_1_1_1());
                      				
                    }
                    pushFollow(FOLLOW_8);
                    this_Columns_3=ruleColumns();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					current = this_Columns_3;
                      					afterParserOrEnumRuleCall();
                      				
                    }
                    otherlv_4=(Token)match(input,RightParenthesis,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_4, grammarAccess.getPivotForClauseAccess().getRightParenthesisKeyword_1_1_2());
                      				
                    }

                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePivotForClause"


    // $ANTLR start "entryRulePivotColumns"
    // InternalSQLParser.g:2826:1: entryRulePivotColumns returns [EObject current=null] : iv_rulePivotColumns= rulePivotColumns EOF ;
    public final EObject entryRulePivotColumns() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePivotColumns = null;


        try {
            // InternalSQLParser.g:2826:53: (iv_rulePivotColumns= rulePivotColumns EOF )
            // InternalSQLParser.g:2827:2: iv_rulePivotColumns= rulePivotColumns EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPivotColumnsRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulePivotColumns=rulePivotColumns();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePivotColumns; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePivotColumns"


    // $ANTLR start "rulePivotColumns"
    // InternalSQLParser.g:2833:1: rulePivotColumns returns [EObject current=null] : (this_PivotCol_0= rulePivotCol | (otherlv_1= LeftParenthesis this_PivotCols_2= rulePivotCols otherlv_3= RightParenthesis ) ) ;
    public final EObject rulePivotColumns() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject this_PivotCol_0 = null;

        EObject this_PivotCols_2 = null;



        	enterRule();

        try {
            // InternalSQLParser.g:2839:2: ( (this_PivotCol_0= rulePivotCol | (otherlv_1= LeftParenthesis this_PivotCols_2= rulePivotCols otherlv_3= RightParenthesis ) ) )
            // InternalSQLParser.g:2840:2: (this_PivotCol_0= rulePivotCol | (otherlv_1= LeftParenthesis this_PivotCols_2= rulePivotCols otherlv_3= RightParenthesis ) )
            {
            // InternalSQLParser.g:2840:2: (this_PivotCol_0= rulePivotCol | (otherlv_1= LeftParenthesis this_PivotCols_2= rulePivotCols otherlv_3= RightParenthesis ) )
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( ((LA58_0>=RULE_STRING && LA58_0<=RULE_ID)) ) {
                alt58=1;
            }
            else if ( (LA58_0==LeftParenthesis) ) {
                alt58=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 58, 0, input);

                throw nvae;
            }
            switch (alt58) {
                case 1 :
                    // InternalSQLParser.g:2841:3: this_PivotCol_0= rulePivotCol
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getPivotColumnsAccess().getPivotColParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_PivotCol_0=rulePivotCol();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_PivotCol_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalSQLParser.g:2853:3: (otherlv_1= LeftParenthesis this_PivotCols_2= rulePivotCols otherlv_3= RightParenthesis )
                    {
                    // InternalSQLParser.g:2853:3: (otherlv_1= LeftParenthesis this_PivotCols_2= rulePivotCols otherlv_3= RightParenthesis )
                    // InternalSQLParser.g:2854:4: otherlv_1= LeftParenthesis this_PivotCols_2= rulePivotCols otherlv_3= RightParenthesis
                    {
                    otherlv_1=(Token)match(input,LeftParenthesis,FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getPivotColumnsAccess().getLeftParenthesisKeyword_1_0());
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				/* */
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getPivotColumnsAccess().getPivotColsParserRuleCall_1_1());
                      			
                    }
                    pushFollow(FOLLOW_8);
                    this_PivotCols_2=rulePivotCols();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_PivotCols_2;
                      				afterParserOrEnumRuleCall();
                      			
                    }
                    otherlv_3=(Token)match(input,RightParenthesis,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getPivotColumnsAccess().getRightParenthesisKeyword_1_2());
                      			
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePivotColumns"


    // $ANTLR start "entryRulePivotCols"
    // InternalSQLParser.g:2878:1: entryRulePivotCols returns [EObject current=null] : iv_rulePivotCols= rulePivotCols EOF ;
    public final EObject entryRulePivotCols() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePivotCols = null;


        try {
            // InternalSQLParser.g:2878:50: (iv_rulePivotCols= rulePivotCols EOF )
            // InternalSQLParser.g:2879:2: iv_rulePivotCols= rulePivotCols EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPivotColsRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulePivotCols=rulePivotCols();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePivotCols; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePivotCols"


    // $ANTLR start "rulePivotCols"
    // InternalSQLParser.g:2885:1: rulePivotCols returns [EObject current=null] : (this_PivotCol_0= rulePivotCol ( () (otherlv_2= Comma ( (lv_entries_3_0= rulePivotCol ) ) )+ )? ) ;
    public final EObject rulePivotCols() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_PivotCol_0 = null;

        EObject lv_entries_3_0 = null;



        	enterRule();

        try {
            // InternalSQLParser.g:2891:2: ( (this_PivotCol_0= rulePivotCol ( () (otherlv_2= Comma ( (lv_entries_3_0= rulePivotCol ) ) )+ )? ) )
            // InternalSQLParser.g:2892:2: (this_PivotCol_0= rulePivotCol ( () (otherlv_2= Comma ( (lv_entries_3_0= rulePivotCol ) ) )+ )? )
            {
            // InternalSQLParser.g:2892:2: (this_PivotCol_0= rulePivotCol ( () (otherlv_2= Comma ( (lv_entries_3_0= rulePivotCol ) ) )+ )? )
            // InternalSQLParser.g:2893:3: this_PivotCol_0= rulePivotCol ( () (otherlv_2= Comma ( (lv_entries_3_0= rulePivotCol ) ) )+ )?
            {
            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getPivotColsAccess().getPivotColParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_9);
            this_PivotCol_0=rulePivotCol();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_PivotCol_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalSQLParser.g:2904:3: ( () (otherlv_2= Comma ( (lv_entries_3_0= rulePivotCol ) ) )+ )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==Comma) ) {
                alt60=1;
            }
            switch (alt60) {
                case 1 :
                    // InternalSQLParser.g:2905:4: () (otherlv_2= Comma ( (lv_entries_3_0= rulePivotCol ) ) )+
                    {
                    // InternalSQLParser.g:2905:4: ()
                    // InternalSQLParser.g:2906:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					/* */
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElementAndAdd(
                      						grammarAccess.getPivotColsAccess().getPvcsEntriesAction_1_0(),
                      						current);
                      				
                    }

                    }

                    // InternalSQLParser.g:2915:4: (otherlv_2= Comma ( (lv_entries_3_0= rulePivotCol ) ) )+
                    int cnt59=0;
                    loop59:
                    do {
                        int alt59=2;
                        int LA59_0 = input.LA(1);

                        if ( (LA59_0==Comma) ) {
                            alt59=1;
                        }


                        switch (alt59) {
                    	case 1 :
                    	    // InternalSQLParser.g:2916:5: otherlv_2= Comma ( (lv_entries_3_0= rulePivotCol ) )
                    	    {
                    	    otherlv_2=(Token)match(input,Comma,FOLLOW_4); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_2, grammarAccess.getPivotColsAccess().getCommaKeyword_1_1_0());
                    	      				
                    	    }
                    	    // InternalSQLParser.g:2920:5: ( (lv_entries_3_0= rulePivotCol ) )
                    	    // InternalSQLParser.g:2921:6: (lv_entries_3_0= rulePivotCol )
                    	    {
                    	    // InternalSQLParser.g:2921:6: (lv_entries_3_0= rulePivotCol )
                    	    // InternalSQLParser.g:2922:7: lv_entries_3_0= rulePivotCol
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getPivotColsAccess().getEntriesPivotColParserRuleCall_1_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_9);
                    	    lv_entries_3_0=rulePivotCol();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getPivotColsRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"entries",
                    	      								lv_entries_3_0,
                    	      								"org.xtext.example.mydsl_sql.SQL.PivotCol");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt59 >= 1 ) break loop59;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(59, input);
                                throw eee;
                        }
                        cnt59++;
                    } while (true);


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePivotCols"


    // $ANTLR start "entryRulePivotCol"
    // InternalSQLParser.g:2945:1: entryRulePivotCol returns [EObject current=null] : iv_rulePivotCol= rulePivotCol EOF ;
    public final EObject entryRulePivotCol() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePivotCol = null;


        try {
            // InternalSQLParser.g:2945:49: (iv_rulePivotCol= rulePivotCol EOF )
            // InternalSQLParser.g:2946:2: iv_rulePivotCol= rulePivotCol EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPivotColRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulePivotCol=rulePivotCol();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePivotCol; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePivotCol"


    // $ANTLR start "rulePivotCol"
    // InternalSQLParser.g:2952:1: rulePivotCol returns [EObject current=null] : (this_DbObjectName_0= ruleDbObjectName ( () (otherlv_2= FullStop ( (lv_entries_3_0= ruleDbObjectName ) ) )+ )? ) ;
    public final EObject rulePivotCol() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_DbObjectName_0 = null;

        EObject lv_entries_3_0 = null;



        	enterRule();

        try {
            // InternalSQLParser.g:2958:2: ( (this_DbObjectName_0= ruleDbObjectName ( () (otherlv_2= FullStop ( (lv_entries_3_0= ruleDbObjectName ) ) )+ )? ) )
            // InternalSQLParser.g:2959:2: (this_DbObjectName_0= ruleDbObjectName ( () (otherlv_2= FullStop ( (lv_entries_3_0= ruleDbObjectName ) ) )+ )? )
            {
            // InternalSQLParser.g:2959:2: (this_DbObjectName_0= ruleDbObjectName ( () (otherlv_2= FullStop ( (lv_entries_3_0= ruleDbObjectName ) ) )+ )? )
            // InternalSQLParser.g:2960:3: this_DbObjectName_0= ruleDbObjectName ( () (otherlv_2= FullStop ( (lv_entries_3_0= ruleDbObjectName ) ) )+ )?
            {
            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getPivotColAccess().getDbObjectNameParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_37);
            this_DbObjectName_0=ruleDbObjectName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_DbObjectName_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalSQLParser.g:2971:3: ( () (otherlv_2= FullStop ( (lv_entries_3_0= ruleDbObjectName ) ) )+ )?
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==FullStop) ) {
                alt62=1;
            }
            switch (alt62) {
                case 1 :
                    // InternalSQLParser.g:2972:4: () (otherlv_2= FullStop ( (lv_entries_3_0= ruleDbObjectName ) ) )+
                    {
                    // InternalSQLParser.g:2972:4: ()
                    // InternalSQLParser.g:2973:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					/* */
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElementAndAdd(
                      						grammarAccess.getPivotColAccess().getPcolsEntriesAction_1_0(),
                      						current);
                      				
                    }

                    }

                    // InternalSQLParser.g:2982:4: (otherlv_2= FullStop ( (lv_entries_3_0= ruleDbObjectName ) ) )+
                    int cnt61=0;
                    loop61:
                    do {
                        int alt61=2;
                        int LA61_0 = input.LA(1);

                        if ( (LA61_0==FullStop) ) {
                            alt61=1;
                        }


                        switch (alt61) {
                    	case 1 :
                    	    // InternalSQLParser.g:2983:5: otherlv_2= FullStop ( (lv_entries_3_0= ruleDbObjectName ) )
                    	    {
                    	    otherlv_2=(Token)match(input,FullStop,FOLLOW_4); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_2, grammarAccess.getPivotColAccess().getFullStopKeyword_1_1_0());
                    	      				
                    	    }
                    	    // InternalSQLParser.g:2987:5: ( (lv_entries_3_0= ruleDbObjectName ) )
                    	    // InternalSQLParser.g:2988:6: (lv_entries_3_0= ruleDbObjectName )
                    	    {
                    	    // InternalSQLParser.g:2988:6: (lv_entries_3_0= ruleDbObjectName )
                    	    // InternalSQLParser.g:2989:7: lv_entries_3_0= ruleDbObjectName
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getPivotColAccess().getEntriesDbObjectNameParserRuleCall_1_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_37);
                    	    lv_entries_3_0=ruleDbObjectName();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getPivotColRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"entries",
                    	      								lv_entries_3_0,
                    	      								"org.xtext.example.mydsl_sql.SQL.DbObjectName");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt61 >= 1 ) break loop61;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(61, input);
                                throw eee;
                        }
                        cnt61++;
                    } while (true);


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePivotCol"


    // $ANTLR start "entryRuleTableFull"
    // InternalSQLParser.g:3012:1: entryRuleTableFull returns [EObject current=null] : iv_ruleTableFull= ruleTableFull EOF ;
    public final EObject entryRuleTableFull() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTableFull = null;


        try {
            // InternalSQLParser.g:3012:50: (iv_ruleTableFull= ruleTableFull EOF )
            // InternalSQLParser.g:3013:2: iv_ruleTableFull= ruleTableFull EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTableFullRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleTableFull=ruleTableFull();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTableFull; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTableFull"


    // $ANTLR start "ruleTableFull"
    // InternalSQLParser.g:3019:1: ruleTableFull returns [EObject current=null] : (this_DbObjectName_0= ruleDbObjectName ( () (otherlv_2= FullStop ( (lv_entries_3_0= ruleDbObjectName ) ) )+ )? ) ;
    public final EObject ruleTableFull() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_DbObjectName_0 = null;

        EObject lv_entries_3_0 = null;



        	enterRule();

        try {
            // InternalSQLParser.g:3025:2: ( (this_DbObjectName_0= ruleDbObjectName ( () (otherlv_2= FullStop ( (lv_entries_3_0= ruleDbObjectName ) ) )+ )? ) )
            // InternalSQLParser.g:3026:2: (this_DbObjectName_0= ruleDbObjectName ( () (otherlv_2= FullStop ( (lv_entries_3_0= ruleDbObjectName ) ) )+ )? )
            {
            // InternalSQLParser.g:3026:2: (this_DbObjectName_0= ruleDbObjectName ( () (otherlv_2= FullStop ( (lv_entries_3_0= ruleDbObjectName ) ) )+ )? )
            // InternalSQLParser.g:3027:3: this_DbObjectName_0= ruleDbObjectName ( () (otherlv_2= FullStop ( (lv_entries_3_0= ruleDbObjectName ) ) )+ )?
            {
            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getTableFullAccess().getDbObjectNameParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_37);
            this_DbObjectName_0=ruleDbObjectName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_DbObjectName_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalSQLParser.g:3038:3: ( () (otherlv_2= FullStop ( (lv_entries_3_0= ruleDbObjectName ) ) )+ )?
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( (LA64_0==FullStop) ) {
                alt64=1;
            }
            switch (alt64) {
                case 1 :
                    // InternalSQLParser.g:3039:4: () (otherlv_2= FullStop ( (lv_entries_3_0= ruleDbObjectName ) ) )+
                    {
                    // InternalSQLParser.g:3039:4: ()
                    // InternalSQLParser.g:3040:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					/* */
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElementAndAdd(
                      						grammarAccess.getTableFullAccess().getTblsEntriesAction_1_0(),
                      						current);
                      				
                    }

                    }

                    // InternalSQLParser.g:3049:4: (otherlv_2= FullStop ( (lv_entries_3_0= ruleDbObjectName ) ) )+
                    int cnt63=0;
                    loop63:
                    do {
                        int alt63=2;
                        int LA63_0 = input.LA(1);

                        if ( (LA63_0==FullStop) ) {
                            alt63=1;
                        }


                        switch (alt63) {
                    	case 1 :
                    	    // InternalSQLParser.g:3050:5: otherlv_2= FullStop ( (lv_entries_3_0= ruleDbObjectName ) )
                    	    {
                    	    otherlv_2=(Token)match(input,FullStop,FOLLOW_4); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_2, grammarAccess.getTableFullAccess().getFullStopKeyword_1_1_0());
                    	      				
                    	    }
                    	    // InternalSQLParser.g:3054:5: ( (lv_entries_3_0= ruleDbObjectName ) )
                    	    // InternalSQLParser.g:3055:6: (lv_entries_3_0= ruleDbObjectName )
                    	    {
                    	    // InternalSQLParser.g:3055:6: (lv_entries_3_0= ruleDbObjectName )
                    	    // InternalSQLParser.g:3056:7: lv_entries_3_0= ruleDbObjectName
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getTableFullAccess().getEntriesDbObjectNameParserRuleCall_1_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_37);
                    	    lv_entries_3_0=ruleDbObjectName();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getTableFullRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"entries",
                    	      								lv_entries_3_0,
                    	      								"org.xtext.example.mydsl_sql.SQL.DbObjectName");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt63 >= 1 ) break loop63;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(63, input);
                                throw eee;
                        }
                        cnt63++;
                    } while (true);


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTableFull"


    // $ANTLR start "entryRuleDbObjectNameAll"
    // InternalSQLParser.g:3079:1: entryRuleDbObjectNameAll returns [EObject current=null] : iv_ruleDbObjectNameAll= ruleDbObjectNameAll EOF ;
    public final EObject entryRuleDbObjectNameAll() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDbObjectNameAll = null;


        try {
            // InternalSQLParser.g:3079:56: (iv_ruleDbObjectNameAll= ruleDbObjectNameAll EOF )
            // InternalSQLParser.g:3080:2: iv_ruleDbObjectNameAll= ruleDbObjectNameAll EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDbObjectNameAllRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDbObjectNameAll=ruleDbObjectNameAll();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDbObjectNameAll; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDbObjectNameAll"


    // $ANTLR start "ruleDbObjectNameAll"
    // InternalSQLParser.g:3086:1: ruleDbObjectNameAll returns [EObject current=null] : ( ( (lv_dbname_0_0= ruleDBID ) ) otherlv_1= FullStop this_STAR_2= RULE_STAR ) ;
    public final EObject ruleDbObjectNameAll() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token this_STAR_2=null;
        AntlrDatatypeRuleToken lv_dbname_0_0 = null;



        	enterRule();

        try {
            // InternalSQLParser.g:3092:2: ( ( ( (lv_dbname_0_0= ruleDBID ) ) otherlv_1= FullStop this_STAR_2= RULE_STAR ) )
            // InternalSQLParser.g:3093:2: ( ( (lv_dbname_0_0= ruleDBID ) ) otherlv_1= FullStop this_STAR_2= RULE_STAR )
            {
            // InternalSQLParser.g:3093:2: ( ( (lv_dbname_0_0= ruleDBID ) ) otherlv_1= FullStop this_STAR_2= RULE_STAR )
            // InternalSQLParser.g:3094:3: ( (lv_dbname_0_0= ruleDBID ) ) otherlv_1= FullStop this_STAR_2= RULE_STAR
            {
            // InternalSQLParser.g:3094:3: ( (lv_dbname_0_0= ruleDBID ) )
            // InternalSQLParser.g:3095:4: (lv_dbname_0_0= ruleDBID )
            {
            // InternalSQLParser.g:3095:4: (lv_dbname_0_0= ruleDBID )
            // InternalSQLParser.g:3096:5: lv_dbname_0_0= ruleDBID
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getDbObjectNameAllAccess().getDbnameDBIDParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_54);
            lv_dbname_0_0=ruleDBID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getDbObjectNameAllRule());
              					}
              					set(
              						current,
              						"dbname",
              						lv_dbname_0_0,
              						"org.xtext.example.mydsl_sql.SQL.DBID");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_1=(Token)match(input,FullStop,FOLLOW_55); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getDbObjectNameAllAccess().getFullStopKeyword_1());
              		
            }
            this_STAR_2=(Token)match(input,RULE_STAR,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_STAR_2, grammarAccess.getDbObjectNameAllAccess().getSTARTerminalRuleCall_2());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDbObjectNameAll"


    // $ANTLR start "entryRuleDbObjectName"
    // InternalSQLParser.g:3125:1: entryRuleDbObjectName returns [EObject current=null] : iv_ruleDbObjectName= ruleDbObjectName EOF ;
    public final EObject entryRuleDbObjectName() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDbObjectName = null;


        try {
            // InternalSQLParser.g:3125:53: (iv_ruleDbObjectName= ruleDbObjectName EOF )
            // InternalSQLParser.g:3126:2: iv_ruleDbObjectName= ruleDbObjectName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDbObjectNameRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDbObjectName=ruleDbObjectName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDbObjectName; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDbObjectName"


    // $ANTLR start "ruleDbObjectName"
    // InternalSQLParser.g:3132:1: ruleDbObjectName returns [EObject current=null] : ( (lv_dbname_0_0= ruleDBID ) ) ;
    public final EObject ruleDbObjectName() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_dbname_0_0 = null;



        	enterRule();

        try {
            // InternalSQLParser.g:3138:2: ( ( (lv_dbname_0_0= ruleDBID ) ) )
            // InternalSQLParser.g:3139:2: ( (lv_dbname_0_0= ruleDBID ) )
            {
            // InternalSQLParser.g:3139:2: ( (lv_dbname_0_0= ruleDBID ) )
            // InternalSQLParser.g:3140:3: (lv_dbname_0_0= ruleDBID )
            {
            // InternalSQLParser.g:3140:3: (lv_dbname_0_0= ruleDBID )
            // InternalSQLParser.g:3141:4: lv_dbname_0_0= ruleDBID
            {
            if ( state.backtracking==0 ) {

              				newCompositeNode(grammarAccess.getDbObjectNameAccess().getDbnameDBIDParserRuleCall_0());
              			
            }
            pushFollow(FOLLOW_2);
            lv_dbname_0_0=ruleDBID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElementForParent(grammarAccess.getDbObjectNameRule());
              				}
              				set(
              					current,
              					"dbname",
              					lv_dbname_0_0,
              					"org.xtext.example.mydsl_sql.SQL.DBID");
              				afterParserOrEnumRuleCall();
              			
            }

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDbObjectName"


    // $ANTLR start "entryRuleOrderByColumns"
    // InternalSQLParser.g:3161:1: entryRuleOrderByColumns returns [EObject current=null] : iv_ruleOrderByColumns= ruleOrderByColumns EOF ;
    public final EObject entryRuleOrderByColumns() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrderByColumns = null;


        try {
            // InternalSQLParser.g:3161:55: (iv_ruleOrderByColumns= ruleOrderByColumns EOF )
            // InternalSQLParser.g:3162:2: iv_ruleOrderByColumns= ruleOrderByColumns EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOrderByColumnsRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleOrderByColumns=ruleOrderByColumns();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOrderByColumns; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOrderByColumns"


    // $ANTLR start "ruleOrderByColumns"
    // InternalSQLParser.g:3168:1: ruleOrderByColumns returns [EObject current=null] : (this_OrderByColumnFull_0= ruleOrderByColumnFull ( () (otherlv_2= Comma ( (lv_entries_3_0= ruleOrderByColumnFull ) ) )+ )? ) ;
    public final EObject ruleOrderByColumns() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_OrderByColumnFull_0 = null;

        EObject lv_entries_3_0 = null;



        	enterRule();

        try {
            // InternalSQLParser.g:3174:2: ( (this_OrderByColumnFull_0= ruleOrderByColumnFull ( () (otherlv_2= Comma ( (lv_entries_3_0= ruleOrderByColumnFull ) ) )+ )? ) )
            // InternalSQLParser.g:3175:2: (this_OrderByColumnFull_0= ruleOrderByColumnFull ( () (otherlv_2= Comma ( (lv_entries_3_0= ruleOrderByColumnFull ) ) )+ )? )
            {
            // InternalSQLParser.g:3175:2: (this_OrderByColumnFull_0= ruleOrderByColumnFull ( () (otherlv_2= Comma ( (lv_entries_3_0= ruleOrderByColumnFull ) ) )+ )? )
            // InternalSQLParser.g:3176:3: this_OrderByColumnFull_0= ruleOrderByColumnFull ( () (otherlv_2= Comma ( (lv_entries_3_0= ruleOrderByColumnFull ) ) )+ )?
            {
            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getOrderByColumnsAccess().getOrderByColumnFullParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_9);
            this_OrderByColumnFull_0=ruleOrderByColumnFull();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_OrderByColumnFull_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalSQLParser.g:3187:3: ( () (otherlv_2= Comma ( (lv_entries_3_0= ruleOrderByColumnFull ) ) )+ )?
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==Comma) ) {
                alt66=1;
            }
            switch (alt66) {
                case 1 :
                    // InternalSQLParser.g:3188:4: () (otherlv_2= Comma ( (lv_entries_3_0= ruleOrderByColumnFull ) ) )+
                    {
                    // InternalSQLParser.g:3188:4: ()
                    // InternalSQLParser.g:3189:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					/* */
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElementAndAdd(
                      						grammarAccess.getOrderByColumnsAccess().getOrOrderByColumnEntriesAction_1_0(),
                      						current);
                      				
                    }

                    }

                    // InternalSQLParser.g:3198:4: (otherlv_2= Comma ( (lv_entries_3_0= ruleOrderByColumnFull ) ) )+
                    int cnt65=0;
                    loop65:
                    do {
                        int alt65=2;
                        int LA65_0 = input.LA(1);

                        if ( (LA65_0==Comma) ) {
                            alt65=1;
                        }


                        switch (alt65) {
                    	case 1 :
                    	    // InternalSQLParser.g:3199:5: otherlv_2= Comma ( (lv_entries_3_0= ruleOrderByColumnFull ) )
                    	    {
                    	    otherlv_2=(Token)match(input,Comma,FOLLOW_26); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_2, grammarAccess.getOrderByColumnsAccess().getCommaKeyword_1_1_0());
                    	      				
                    	    }
                    	    // InternalSQLParser.g:3203:5: ( (lv_entries_3_0= ruleOrderByColumnFull ) )
                    	    // InternalSQLParser.g:3204:6: (lv_entries_3_0= ruleOrderByColumnFull )
                    	    {
                    	    // InternalSQLParser.g:3204:6: (lv_entries_3_0= ruleOrderByColumnFull )
                    	    // InternalSQLParser.g:3205:7: lv_entries_3_0= ruleOrderByColumnFull
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getOrderByColumnsAccess().getEntriesOrderByColumnFullParserRuleCall_1_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_9);
                    	    lv_entries_3_0=ruleOrderByColumnFull();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getOrderByColumnsRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"entries",
                    	      								lv_entries_3_0,
                    	      								"org.xtext.example.mydsl_sql.SQL.OrderByColumnFull");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt65 >= 1 ) break loop65;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(65, input);
                                throw eee;
                        }
                        cnt65++;
                    } while (true);


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOrderByColumns"


    // $ANTLR start "entryRuleOrderByColumnFull"
    // InternalSQLParser.g:3228:1: entryRuleOrderByColumnFull returns [EObject current=null] : iv_ruleOrderByColumnFull= ruleOrderByColumnFull EOF ;
    public final EObject entryRuleOrderByColumnFull() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrderByColumnFull = null;


        try {
            // InternalSQLParser.g:3228:58: (iv_ruleOrderByColumnFull= ruleOrderByColumnFull EOF )
            // InternalSQLParser.g:3229:2: iv_ruleOrderByColumnFull= ruleOrderByColumnFull EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOrderByColumnFullRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleOrderByColumnFull=ruleOrderByColumnFull();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOrderByColumnFull; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOrderByColumnFull"


    // $ANTLR start "ruleOrderByColumnFull"
    // InternalSQLParser.g:3235:1: ruleOrderByColumnFull returns [EObject current=null] : ( ( ( (lv_colOrder_0_0= ruleColumnFull ) ) | ( (lv_colOrderInt_1_0= RULE_UNSIGNED ) ) ) ( ( (lv_direction_2_1= ASC | lv_direction_2_2= DESC ) ) )? ) ;
    public final EObject ruleOrderByColumnFull() throws RecognitionException {
        EObject current = null;

        Token lv_colOrderInt_1_0=null;
        Token lv_direction_2_1=null;
        Token lv_direction_2_2=null;
        EObject lv_colOrder_0_0 = null;



        	enterRule();

        try {
            // InternalSQLParser.g:3241:2: ( ( ( ( (lv_colOrder_0_0= ruleColumnFull ) ) | ( (lv_colOrderInt_1_0= RULE_UNSIGNED ) ) ) ( ( (lv_direction_2_1= ASC | lv_direction_2_2= DESC ) ) )? ) )
            // InternalSQLParser.g:3242:2: ( ( ( (lv_colOrder_0_0= ruleColumnFull ) ) | ( (lv_colOrderInt_1_0= RULE_UNSIGNED ) ) ) ( ( (lv_direction_2_1= ASC | lv_direction_2_2= DESC ) ) )? )
            {
            // InternalSQLParser.g:3242:2: ( ( ( (lv_colOrder_0_0= ruleColumnFull ) ) | ( (lv_colOrderInt_1_0= RULE_UNSIGNED ) ) ) ( ( (lv_direction_2_1= ASC | lv_direction_2_2= DESC ) ) )? )
            // InternalSQLParser.g:3243:3: ( ( (lv_colOrder_0_0= ruleColumnFull ) ) | ( (lv_colOrderInt_1_0= RULE_UNSIGNED ) ) ) ( ( (lv_direction_2_1= ASC | lv_direction_2_2= DESC ) ) )?
            {
            // InternalSQLParser.g:3243:3: ( ( (lv_colOrder_0_0= ruleColumnFull ) ) | ( (lv_colOrderInt_1_0= RULE_UNSIGNED ) ) )
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( ((LA67_0>=RULE_STRING && LA67_0<=RULE_ID)) ) {
                alt67=1;
            }
            else if ( (LA67_0==RULE_UNSIGNED) ) {
                alt67=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 67, 0, input);

                throw nvae;
            }
            switch (alt67) {
                case 1 :
                    // InternalSQLParser.g:3244:4: ( (lv_colOrder_0_0= ruleColumnFull ) )
                    {
                    // InternalSQLParser.g:3244:4: ( (lv_colOrder_0_0= ruleColumnFull ) )
                    // InternalSQLParser.g:3245:5: (lv_colOrder_0_0= ruleColumnFull )
                    {
                    // InternalSQLParser.g:3245:5: (lv_colOrder_0_0= ruleColumnFull )
                    // InternalSQLParser.g:3246:6: lv_colOrder_0_0= ruleColumnFull
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getOrderByColumnFullAccess().getColOrderColumnFullParserRuleCall_0_0_0());
                      					
                    }
                    pushFollow(FOLLOW_56);
                    lv_colOrder_0_0=ruleColumnFull();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getOrderByColumnFullRule());
                      						}
                      						set(
                      							current,
                      							"colOrder",
                      							lv_colOrder_0_0,
                      							"org.xtext.example.mydsl_sql.SQL.ColumnFull");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalSQLParser.g:3264:4: ( (lv_colOrderInt_1_0= RULE_UNSIGNED ) )
                    {
                    // InternalSQLParser.g:3264:4: ( (lv_colOrderInt_1_0= RULE_UNSIGNED ) )
                    // InternalSQLParser.g:3265:5: (lv_colOrderInt_1_0= RULE_UNSIGNED )
                    {
                    // InternalSQLParser.g:3265:5: (lv_colOrderInt_1_0= RULE_UNSIGNED )
                    // InternalSQLParser.g:3266:6: lv_colOrderInt_1_0= RULE_UNSIGNED
                    {
                    lv_colOrderInt_1_0=(Token)match(input,RULE_UNSIGNED,FOLLOW_56); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_colOrderInt_1_0, grammarAccess.getOrderByColumnFullAccess().getColOrderIntUNSIGNEDTerminalRuleCall_0_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getOrderByColumnFullRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"colOrderInt",
                      							lv_colOrderInt_1_0,
                      							"org.xtext.example.mydsl_sql.SQL.UNSIGNED");
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            // InternalSQLParser.g:3283:3: ( ( (lv_direction_2_1= ASC | lv_direction_2_2= DESC ) ) )?
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( (LA69_0==DESC||LA69_0==ASC) ) {
                alt69=1;
            }
            switch (alt69) {
                case 1 :
                    // InternalSQLParser.g:3284:4: ( (lv_direction_2_1= ASC | lv_direction_2_2= DESC ) )
                    {
                    // InternalSQLParser.g:3284:4: ( (lv_direction_2_1= ASC | lv_direction_2_2= DESC ) )
                    // InternalSQLParser.g:3285:5: (lv_direction_2_1= ASC | lv_direction_2_2= DESC )
                    {
                    // InternalSQLParser.g:3285:5: (lv_direction_2_1= ASC | lv_direction_2_2= DESC )
                    int alt68=2;
                    int LA68_0 = input.LA(1);

                    if ( (LA68_0==ASC) ) {
                        alt68=1;
                    }
                    else if ( (LA68_0==DESC) ) {
                        alt68=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 68, 0, input);

                        throw nvae;
                    }
                    switch (alt68) {
                        case 1 :
                            // InternalSQLParser.g:3286:6: lv_direction_2_1= ASC
                            {
                            lv_direction_2_1=(Token)match(input,ASC,FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(lv_direction_2_1, grammarAccess.getOrderByColumnFullAccess().getDirectionASCKeyword_1_0_0());
                              					
                            }
                            if ( state.backtracking==0 ) {

                              						if (current==null) {
                              							current = createModelElement(grammarAccess.getOrderByColumnFullRule());
                              						}
                              						setWithLastConsumed(current, "direction", lv_direction_2_1, null);
                              					
                            }

                            }
                            break;
                        case 2 :
                            // InternalSQLParser.g:3297:6: lv_direction_2_2= DESC
                            {
                            lv_direction_2_2=(Token)match(input,DESC,FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(lv_direction_2_2, grammarAccess.getOrderByColumnFullAccess().getDirectionDESCKeyword_1_0_1());
                              					
                            }
                            if ( state.backtracking==0 ) {

                              						if (current==null) {
                              							current = createModelElement(grammarAccess.getOrderByColumnFullRule());
                              						}
                              						setWithLastConsumed(current, "direction", lv_direction_2_2, null);
                              					
                            }

                            }
                            break;

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOrderByColumnFull"


    // $ANTLR start "entryRuleGroupByColumns"
    // InternalSQLParser.g:3314:1: entryRuleGroupByColumns returns [EObject current=null] : iv_ruleGroupByColumns= ruleGroupByColumns EOF ;
    public final EObject entryRuleGroupByColumns() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGroupByColumns = null;


        try {
            // InternalSQLParser.g:3314:55: (iv_ruleGroupByColumns= ruleGroupByColumns EOF )
            // InternalSQLParser.g:3315:2: iv_ruleGroupByColumns= ruleGroupByColumns EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGroupByColumnsRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleGroupByColumns=ruleGroupByColumns();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGroupByColumns; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGroupByColumns"


    // $ANTLR start "ruleGroupByColumns"
    // InternalSQLParser.g:3321:1: ruleGroupByColumns returns [EObject current=null] : (this_GroupByColumnFull_0= ruleGroupByColumnFull ( () (otherlv_2= Comma ( (lv_entries_3_0= ruleGroupByColumnFull ) ) )+ )? ) ;
    public final EObject ruleGroupByColumns() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_GroupByColumnFull_0 = null;

        EObject lv_entries_3_0 = null;



        	enterRule();

        try {
            // InternalSQLParser.g:3327:2: ( (this_GroupByColumnFull_0= ruleGroupByColumnFull ( () (otherlv_2= Comma ( (lv_entries_3_0= ruleGroupByColumnFull ) ) )+ )? ) )
            // InternalSQLParser.g:3328:2: (this_GroupByColumnFull_0= ruleGroupByColumnFull ( () (otherlv_2= Comma ( (lv_entries_3_0= ruleGroupByColumnFull ) ) )+ )? )
            {
            // InternalSQLParser.g:3328:2: (this_GroupByColumnFull_0= ruleGroupByColumnFull ( () (otherlv_2= Comma ( (lv_entries_3_0= ruleGroupByColumnFull ) ) )+ )? )
            // InternalSQLParser.g:3329:3: this_GroupByColumnFull_0= ruleGroupByColumnFull ( () (otherlv_2= Comma ( (lv_entries_3_0= ruleGroupByColumnFull ) ) )+ )?
            {
            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getGroupByColumnsAccess().getGroupByColumnFullParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_9);
            this_GroupByColumnFull_0=ruleGroupByColumnFull();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_GroupByColumnFull_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalSQLParser.g:3340:3: ( () (otherlv_2= Comma ( (lv_entries_3_0= ruleGroupByColumnFull ) ) )+ )?
            int alt71=2;
            int LA71_0 = input.LA(1);

            if ( (LA71_0==Comma) ) {
                alt71=1;
            }
            switch (alt71) {
                case 1 :
                    // InternalSQLParser.g:3341:4: () (otherlv_2= Comma ( (lv_entries_3_0= ruleGroupByColumnFull ) ) )+
                    {
                    // InternalSQLParser.g:3341:4: ()
                    // InternalSQLParser.g:3342:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					/* */
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElementAndAdd(
                      						grammarAccess.getGroupByColumnsAccess().getOrGroupByColumnEntriesAction_1_0(),
                      						current);
                      				
                    }

                    }

                    // InternalSQLParser.g:3351:4: (otherlv_2= Comma ( (lv_entries_3_0= ruleGroupByColumnFull ) ) )+
                    int cnt70=0;
                    loop70:
                    do {
                        int alt70=2;
                        int LA70_0 = input.LA(1);

                        if ( (LA70_0==Comma) ) {
                            alt70=1;
                        }


                        switch (alt70) {
                    	case 1 :
                    	    // InternalSQLParser.g:3352:5: otherlv_2= Comma ( (lv_entries_3_0= ruleGroupByColumnFull ) )
                    	    {
                    	    otherlv_2=(Token)match(input,Comma,FOLLOW_26); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_2, grammarAccess.getGroupByColumnsAccess().getCommaKeyword_1_1_0());
                    	      				
                    	    }
                    	    // InternalSQLParser.g:3356:5: ( (lv_entries_3_0= ruleGroupByColumnFull ) )
                    	    // InternalSQLParser.g:3357:6: (lv_entries_3_0= ruleGroupByColumnFull )
                    	    {
                    	    // InternalSQLParser.g:3357:6: (lv_entries_3_0= ruleGroupByColumnFull )
                    	    // InternalSQLParser.g:3358:7: lv_entries_3_0= ruleGroupByColumnFull
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getGroupByColumnsAccess().getEntriesGroupByColumnFullParserRuleCall_1_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_9);
                    	    lv_entries_3_0=ruleGroupByColumnFull();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getGroupByColumnsRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"entries",
                    	      								lv_entries_3_0,
                    	      								"org.xtext.example.mydsl_sql.SQL.GroupByColumnFull");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt70 >= 1 ) break loop70;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(70, input);
                                throw eee;
                        }
                        cnt70++;
                    } while (true);


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGroupByColumns"


    // $ANTLR start "entryRuleGroupByColumnFull"
    // InternalSQLParser.g:3381:1: entryRuleGroupByColumnFull returns [EObject current=null] : iv_ruleGroupByColumnFull= ruleGroupByColumnFull EOF ;
    public final EObject entryRuleGroupByColumnFull() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGroupByColumnFull = null;


        try {
            // InternalSQLParser.g:3381:58: (iv_ruleGroupByColumnFull= ruleGroupByColumnFull EOF )
            // InternalSQLParser.g:3382:2: iv_ruleGroupByColumnFull= ruleGroupByColumnFull EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGroupByColumnFullRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleGroupByColumnFull=ruleGroupByColumnFull();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGroupByColumnFull; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGroupByColumnFull"


    // $ANTLR start "ruleGroupByColumnFull"
    // InternalSQLParser.g:3388:1: ruleGroupByColumnFull returns [EObject current=null] : ( ( (lv_colGrBy_0_0= ruleColumnFull ) ) | ( (lv_gbFunction_1_0= ruleOperandFunction ) ) | ( (lv_grByInt_2_0= RULE_UNSIGNED ) ) ) ;
    public final EObject ruleGroupByColumnFull() throws RecognitionException {
        EObject current = null;

        Token lv_grByInt_2_0=null;
        EObject lv_colGrBy_0_0 = null;

        EObject lv_gbFunction_1_0 = null;



        	enterRule();

        try {
            // InternalSQLParser.g:3394:2: ( ( ( (lv_colGrBy_0_0= ruleColumnFull ) ) | ( (lv_gbFunction_1_0= ruleOperandFunction ) ) | ( (lv_grByInt_2_0= RULE_UNSIGNED ) ) ) )
            // InternalSQLParser.g:3395:2: ( ( (lv_colGrBy_0_0= ruleColumnFull ) ) | ( (lv_gbFunction_1_0= ruleOperandFunction ) ) | ( (lv_grByInt_2_0= RULE_UNSIGNED ) ) )
            {
            // InternalSQLParser.g:3395:2: ( ( (lv_colGrBy_0_0= ruleColumnFull ) ) | ( (lv_gbFunction_1_0= ruleOperandFunction ) ) | ( (lv_grByInt_2_0= RULE_UNSIGNED ) ) )
            int alt72=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                int LA72_1 = input.LA(2);

                if ( (LA72_1==LeftParenthesis) ) {
                    alt72=2;
                }
                else if ( (LA72_1==EOF||LA72_1==INTERSECT||LA72_1==EXCEPT||LA72_1==HAVING||LA72_1==OFFSET||LA72_1==FETCH||(LA72_1>=LIMIT && LA72_1<=MINUS)||LA72_1==ORDER||LA72_1==UNION||LA72_1==RightParenthesis||LA72_1==Comma||LA72_1==FullStop) ) {
                    alt72=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 72, 1, input);

                    throw nvae;
                }
                }
                break;
            case RULE_STRING:
            case RULE_DBNAME:
                {
                alt72=1;
                }
                break;
            case RULE_UNSIGNED:
                {
                alt72=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 72, 0, input);

                throw nvae;
            }

            switch (alt72) {
                case 1 :
                    // InternalSQLParser.g:3396:3: ( (lv_colGrBy_0_0= ruleColumnFull ) )
                    {
                    // InternalSQLParser.g:3396:3: ( (lv_colGrBy_0_0= ruleColumnFull ) )
                    // InternalSQLParser.g:3397:4: (lv_colGrBy_0_0= ruleColumnFull )
                    {
                    // InternalSQLParser.g:3397:4: (lv_colGrBy_0_0= ruleColumnFull )
                    // InternalSQLParser.g:3398:5: lv_colGrBy_0_0= ruleColumnFull
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getGroupByColumnFullAccess().getColGrByColumnFullParserRuleCall_0_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_colGrBy_0_0=ruleColumnFull();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getGroupByColumnFullRule());
                      					}
                      					set(
                      						current,
                      						"colGrBy",
                      						lv_colGrBy_0_0,
                      						"org.xtext.example.mydsl_sql.SQL.ColumnFull");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalSQLParser.g:3416:3: ( (lv_gbFunction_1_0= ruleOperandFunction ) )
                    {
                    // InternalSQLParser.g:3416:3: ( (lv_gbFunction_1_0= ruleOperandFunction ) )
                    // InternalSQLParser.g:3417:4: (lv_gbFunction_1_0= ruleOperandFunction )
                    {
                    // InternalSQLParser.g:3417:4: (lv_gbFunction_1_0= ruleOperandFunction )
                    // InternalSQLParser.g:3418:5: lv_gbFunction_1_0= ruleOperandFunction
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getGroupByColumnFullAccess().getGbFunctionOperandFunctionParserRuleCall_1_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_gbFunction_1_0=ruleOperandFunction();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getGroupByColumnFullRule());
                      					}
                      					set(
                      						current,
                      						"gbFunction",
                      						lv_gbFunction_1_0,
                      						"org.xtext.example.mydsl_sql.SQL.OperandFunction");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalSQLParser.g:3436:3: ( (lv_grByInt_2_0= RULE_UNSIGNED ) )
                    {
                    // InternalSQLParser.g:3436:3: ( (lv_grByInt_2_0= RULE_UNSIGNED ) )
                    // InternalSQLParser.g:3437:4: (lv_grByInt_2_0= RULE_UNSIGNED )
                    {
                    // InternalSQLParser.g:3437:4: (lv_grByInt_2_0= RULE_UNSIGNED )
                    // InternalSQLParser.g:3438:5: lv_grByInt_2_0= RULE_UNSIGNED
                    {
                    lv_grByInt_2_0=(Token)match(input,RULE_UNSIGNED,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_grByInt_2_0, grammarAccess.getGroupByColumnFullAccess().getGrByIntUNSIGNEDTerminalRuleCall_2_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getGroupByColumnFullRule());
                      					}
                      					setWithLastConsumed(
                      						current,
                      						"grByInt",
                      						lv_grByInt_2_0,
                      						"org.xtext.example.mydsl_sql.SQL.UNSIGNED");
                      				
                    }

                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGroupByColumnFull"


    // $ANTLR start "entryRuleFullExpression"
    // InternalSQLParser.g:3458:1: entryRuleFullExpression returns [EObject current=null] : iv_ruleFullExpression= ruleFullExpression EOF ;
    public final EObject entryRuleFullExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFullExpression = null;


        try {
            // InternalSQLParser.g:3458:55: (iv_ruleFullExpression= ruleFullExpression EOF )
            // InternalSQLParser.g:3459:2: iv_ruleFullExpression= ruleFullExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFullExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleFullExpression=ruleFullExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFullExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFullExpression"


    // $ANTLR start "ruleFullExpression"
    // InternalSQLParser.g:3465:1: ruleFullExpression returns [EObject current=null] : (this_ExpressionFragment_0= ruleExpressionFragment ( () ( (lv_entries_2_0= ruleExpressionFragmentSecond ) )+ )? ) ;
    public final EObject ruleFullExpression() throws RecognitionException {
        EObject current = null;

        EObject this_ExpressionFragment_0 = null;

        EObject lv_entries_2_0 = null;



        	enterRule();

        try {
            // InternalSQLParser.g:3471:2: ( (this_ExpressionFragment_0= ruleExpressionFragment ( () ( (lv_entries_2_0= ruleExpressionFragmentSecond ) )+ )? ) )
            // InternalSQLParser.g:3472:2: (this_ExpressionFragment_0= ruleExpressionFragment ( () ( (lv_entries_2_0= ruleExpressionFragmentSecond ) )+ )? )
            {
            // InternalSQLParser.g:3472:2: (this_ExpressionFragment_0= ruleExpressionFragment ( () ( (lv_entries_2_0= ruleExpressionFragmentSecond ) )+ )? )
            // InternalSQLParser.g:3473:3: this_ExpressionFragment_0= ruleExpressionFragment ( () ( (lv_entries_2_0= ruleExpressionFragmentSecond ) )+ )?
            {
            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getFullExpressionAccess().getExpressionFragmentParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_57);
            this_ExpressionFragment_0=ruleExpressionFragment();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_ExpressionFragment_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalSQLParser.g:3484:3: ( () ( (lv_entries_2_0= ruleExpressionFragmentSecond ) )+ )?
            int alt74=2;
            int LA74_0 = input.LA(1);

            if ( (LA74_0==AND||LA74_0==OR||LA74_0==RULE_JRNPARAM) ) {
                alt74=1;
            }
            switch (alt74) {
                case 1 :
                    // InternalSQLParser.g:3485:4: () ( (lv_entries_2_0= ruleExpressionFragmentSecond ) )+
                    {
                    // InternalSQLParser.g:3485:4: ()
                    // InternalSQLParser.g:3486:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					/* */
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElementAndAdd(
                      						grammarAccess.getFullExpressionAccess().getOrExprEntriesAction_1_0(),
                      						current);
                      				
                    }

                    }

                    // InternalSQLParser.g:3495:4: ( (lv_entries_2_0= ruleExpressionFragmentSecond ) )+
                    int cnt73=0;
                    loop73:
                    do {
                        int alt73=2;
                        int LA73_0 = input.LA(1);

                        if ( (LA73_0==AND||LA73_0==OR||LA73_0==RULE_JRNPARAM) ) {
                            alt73=1;
                        }


                        switch (alt73) {
                    	case 1 :
                    	    // InternalSQLParser.g:3496:5: (lv_entries_2_0= ruleExpressionFragmentSecond )
                    	    {
                    	    // InternalSQLParser.g:3496:5: (lv_entries_2_0= ruleExpressionFragmentSecond )
                    	    // InternalSQLParser.g:3497:6: lv_entries_2_0= ruleExpressionFragmentSecond
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      						newCompositeNode(grammarAccess.getFullExpressionAccess().getEntriesExpressionFragmentSecondParserRuleCall_1_1_0());
                    	      					
                    	    }
                    	    pushFollow(FOLLOW_57);
                    	    lv_entries_2_0=ruleExpressionFragmentSecond();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      						if (current==null) {
                    	      							current = createModelElementForParent(grammarAccess.getFullExpressionRule());
                    	      						}
                    	      						add(
                    	      							current,
                    	      							"entries",
                    	      							lv_entries_2_0,
                    	      							"org.xtext.example.mydsl_sql.SQL.ExpressionFragmentSecond");
                    	      						afterParserOrEnumRuleCall();
                    	      					
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt73 >= 1 ) break loop73;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(73, input);
                                throw eee;
                        }
                        cnt73++;
                    } while (true);


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFullExpression"


    // $ANTLR start "entryRuleExpressionFragmentSecond"
    // InternalSQLParser.g:3519:1: entryRuleExpressionFragmentSecond returns [EObject current=null] : iv_ruleExpressionFragmentSecond= ruleExpressionFragmentSecond EOF ;
    public final EObject entryRuleExpressionFragmentSecond() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpressionFragmentSecond = null;


        try {
            // InternalSQLParser.g:3519:65: (iv_ruleExpressionFragmentSecond= ruleExpressionFragmentSecond EOF )
            // InternalSQLParser.g:3520:2: iv_ruleExpressionFragmentSecond= ruleExpressionFragmentSecond EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpressionFragmentSecondRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleExpressionFragmentSecond=ruleExpressionFragmentSecond();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpressionFragmentSecond; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExpressionFragmentSecond"


    // $ANTLR start "ruleExpressionFragmentSecond"
    // InternalSQLParser.g:3526:1: ruleExpressionFragmentSecond returns [EObject current=null] : ( ( ( ( (lv_c_0_1= AND | lv_c_0_2= OR ) ) ) ( (lv_efrag_1_0= ruleExpressionFragment ) ) ) | ( (lv_notPrm_2_0= RULE_JRNPARAM ) ) ) ;
    public final EObject ruleExpressionFragmentSecond() throws RecognitionException {
        EObject current = null;

        Token lv_c_0_1=null;
        Token lv_c_0_2=null;
        Token lv_notPrm_2_0=null;
        EObject lv_efrag_1_0 = null;



        	enterRule();

        try {
            // InternalSQLParser.g:3532:2: ( ( ( ( ( (lv_c_0_1= AND | lv_c_0_2= OR ) ) ) ( (lv_efrag_1_0= ruleExpressionFragment ) ) ) | ( (lv_notPrm_2_0= RULE_JRNPARAM ) ) ) )
            // InternalSQLParser.g:3533:2: ( ( ( ( (lv_c_0_1= AND | lv_c_0_2= OR ) ) ) ( (lv_efrag_1_0= ruleExpressionFragment ) ) ) | ( (lv_notPrm_2_0= RULE_JRNPARAM ) ) )
            {
            // InternalSQLParser.g:3533:2: ( ( ( ( (lv_c_0_1= AND | lv_c_0_2= OR ) ) ) ( (lv_efrag_1_0= ruleExpressionFragment ) ) ) | ( (lv_notPrm_2_0= RULE_JRNPARAM ) ) )
            int alt76=2;
            int LA76_0 = input.LA(1);

            if ( (LA76_0==AND||LA76_0==OR) ) {
                alt76=1;
            }
            else if ( (LA76_0==RULE_JRNPARAM) ) {
                alt76=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 76, 0, input);

                throw nvae;
            }
            switch (alt76) {
                case 1 :
                    // InternalSQLParser.g:3534:3: ( ( ( (lv_c_0_1= AND | lv_c_0_2= OR ) ) ) ( (lv_efrag_1_0= ruleExpressionFragment ) ) )
                    {
                    // InternalSQLParser.g:3534:3: ( ( ( (lv_c_0_1= AND | lv_c_0_2= OR ) ) ) ( (lv_efrag_1_0= ruleExpressionFragment ) ) )
                    // InternalSQLParser.g:3535:4: ( ( (lv_c_0_1= AND | lv_c_0_2= OR ) ) ) ( (lv_efrag_1_0= ruleExpressionFragment ) )
                    {
                    // InternalSQLParser.g:3535:4: ( ( (lv_c_0_1= AND | lv_c_0_2= OR ) ) )
                    // InternalSQLParser.g:3536:5: ( (lv_c_0_1= AND | lv_c_0_2= OR ) )
                    {
                    // InternalSQLParser.g:3536:5: ( (lv_c_0_1= AND | lv_c_0_2= OR ) )
                    // InternalSQLParser.g:3537:6: (lv_c_0_1= AND | lv_c_0_2= OR )
                    {
                    // InternalSQLParser.g:3537:6: (lv_c_0_1= AND | lv_c_0_2= OR )
                    int alt75=2;
                    int LA75_0 = input.LA(1);

                    if ( (LA75_0==AND) ) {
                        alt75=1;
                    }
                    else if ( (LA75_0==OR) ) {
                        alt75=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 75, 0, input);

                        throw nvae;
                    }
                    switch (alt75) {
                        case 1 :
                            // InternalSQLParser.g:3538:7: lv_c_0_1= AND
                            {
                            lv_c_0_1=(Token)match(input,AND,FOLLOW_23); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							newLeafNode(lv_c_0_1, grammarAccess.getExpressionFragmentSecondAccess().getCANDKeyword_0_0_0_0());
                              						
                            }
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElement(grammarAccess.getExpressionFragmentSecondRule());
                              							}
                              							setWithLastConsumed(current, "c", lv_c_0_1, null);
                              						
                            }

                            }
                            break;
                        case 2 :
                            // InternalSQLParser.g:3549:7: lv_c_0_2= OR
                            {
                            lv_c_0_2=(Token)match(input,OR,FOLLOW_23); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							newLeafNode(lv_c_0_2, grammarAccess.getExpressionFragmentSecondAccess().getCORKeyword_0_0_0_1());
                              						
                            }
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElement(grammarAccess.getExpressionFragmentSecondRule());
                              							}
                              							setWithLastConsumed(current, "c", lv_c_0_2, null);
                              						
                            }

                            }
                            break;

                    }


                    }


                    }

                    // InternalSQLParser.g:3562:4: ( (lv_efrag_1_0= ruleExpressionFragment ) )
                    // InternalSQLParser.g:3563:5: (lv_efrag_1_0= ruleExpressionFragment )
                    {
                    // InternalSQLParser.g:3563:5: (lv_efrag_1_0= ruleExpressionFragment )
                    // InternalSQLParser.g:3564:6: lv_efrag_1_0= ruleExpressionFragment
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getExpressionFragmentSecondAccess().getEfragExpressionFragmentParserRuleCall_0_1_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_efrag_1_0=ruleExpressionFragment();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getExpressionFragmentSecondRule());
                      						}
                      						set(
                      							current,
                      							"efrag",
                      							lv_efrag_1_0,
                      							"org.xtext.example.mydsl_sql.SQL.ExpressionFragment");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalSQLParser.g:3583:3: ( (lv_notPrm_2_0= RULE_JRNPARAM ) )
                    {
                    // InternalSQLParser.g:3583:3: ( (lv_notPrm_2_0= RULE_JRNPARAM ) )
                    // InternalSQLParser.g:3584:4: (lv_notPrm_2_0= RULE_JRNPARAM )
                    {
                    // InternalSQLParser.g:3584:4: (lv_notPrm_2_0= RULE_JRNPARAM )
                    // InternalSQLParser.g:3585:5: lv_notPrm_2_0= RULE_JRNPARAM
                    {
                    lv_notPrm_2_0=(Token)match(input,RULE_JRNPARAM,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_notPrm_2_0, grammarAccess.getExpressionFragmentSecondAccess().getNotPrmJRNPARAMTerminalRuleCall_1_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getExpressionFragmentSecondRule());
                      					}
                      					setWithLastConsumed(
                      						current,
                      						"notPrm",
                      						lv_notPrm_2_0,
                      						"org.xtext.example.mydsl_sql.SQL.JRNPARAM");
                      				
                    }

                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExpressionFragmentSecond"


    // $ANTLR start "entryRuleExpressionFragment"
    // InternalSQLParser.g:3605:1: entryRuleExpressionFragment returns [EObject current=null] : iv_ruleExpressionFragment= ruleExpressionFragment EOF ;
    public final EObject entryRuleExpressionFragment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpressionFragment = null;


        try {
            // InternalSQLParser.g:3605:59: (iv_ruleExpressionFragment= ruleExpressionFragment EOF )
            // InternalSQLParser.g:3606:2: iv_ruleExpressionFragment= ruleExpressionFragment EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpressionFragmentRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleExpressionFragment=ruleExpressionFragment();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpressionFragment; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExpressionFragment"


    // $ANTLR start "ruleExpressionFragment"
    // InternalSQLParser.g:3612:1: ruleExpressionFragment returns [EObject current=null] : ( ( (lv_expgroup_0_0= ruleExpressionGroup ) ) | ( (lv_exp_1_0= ruleExpression ) ) | ( ( (lv_xexp_2_1= ruleXExpression | lv_xexp_2_2= ruleXExpression_ ) ) ) | ( (lv_notPrm_3_0= RULE_JRNPARAM ) ) | ( (lv_in_4_0= ruleInOperator ) ) | ( (lv_exists_5_0= ruleExistsOperator ) ) ) ;
    public final EObject ruleExpressionFragment() throws RecognitionException {
        EObject current = null;

        Token lv_notPrm_3_0=null;
        EObject lv_expgroup_0_0 = null;

        EObject lv_exp_1_0 = null;

        EObject lv_xexp_2_1 = null;

        EObject lv_xexp_2_2 = null;

        EObject lv_in_4_0 = null;

        EObject lv_exists_5_0 = null;



        	enterRule();

        try {
            // InternalSQLParser.g:3618:2: ( ( ( (lv_expgroup_0_0= ruleExpressionGroup ) ) | ( (lv_exp_1_0= ruleExpression ) ) | ( ( (lv_xexp_2_1= ruleXExpression | lv_xexp_2_2= ruleXExpression_ ) ) ) | ( (lv_notPrm_3_0= RULE_JRNPARAM ) ) | ( (lv_in_4_0= ruleInOperator ) ) | ( (lv_exists_5_0= ruleExistsOperator ) ) ) )
            // InternalSQLParser.g:3619:2: ( ( (lv_expgroup_0_0= ruleExpressionGroup ) ) | ( (lv_exp_1_0= ruleExpression ) ) | ( ( (lv_xexp_2_1= ruleXExpression | lv_xexp_2_2= ruleXExpression_ ) ) ) | ( (lv_notPrm_3_0= RULE_JRNPARAM ) ) | ( (lv_in_4_0= ruleInOperator ) ) | ( (lv_exists_5_0= ruleExistsOperator ) ) )
            {
            // InternalSQLParser.g:3619:2: ( ( (lv_expgroup_0_0= ruleExpressionGroup ) ) | ( (lv_exp_1_0= ruleExpression ) ) | ( ( (lv_xexp_2_1= ruleXExpression | lv_xexp_2_2= ruleXExpression_ ) ) ) | ( (lv_notPrm_3_0= RULE_JRNPARAM ) ) | ( (lv_in_4_0= ruleInOperator ) ) | ( (lv_exists_5_0= ruleExistsOperator ) ) )
            int alt78=6;
            alt78 = dfa78.predict(input);
            switch (alt78) {
                case 1 :
                    // InternalSQLParser.g:3620:3: ( (lv_expgroup_0_0= ruleExpressionGroup ) )
                    {
                    // InternalSQLParser.g:3620:3: ( (lv_expgroup_0_0= ruleExpressionGroup ) )
                    // InternalSQLParser.g:3621:4: (lv_expgroup_0_0= ruleExpressionGroup )
                    {
                    // InternalSQLParser.g:3621:4: (lv_expgroup_0_0= ruleExpressionGroup )
                    // InternalSQLParser.g:3622:5: lv_expgroup_0_0= ruleExpressionGroup
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getExpressionFragmentAccess().getExpgroupExpressionGroupParserRuleCall_0_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_expgroup_0_0=ruleExpressionGroup();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getExpressionFragmentRule());
                      					}
                      					set(
                      						current,
                      						"expgroup",
                      						lv_expgroup_0_0,
                      						"org.xtext.example.mydsl_sql.SQL.ExpressionGroup");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalSQLParser.g:3640:3: ( (lv_exp_1_0= ruleExpression ) )
                    {
                    // InternalSQLParser.g:3640:3: ( (lv_exp_1_0= ruleExpression ) )
                    // InternalSQLParser.g:3641:4: (lv_exp_1_0= ruleExpression )
                    {
                    // InternalSQLParser.g:3641:4: (lv_exp_1_0= ruleExpression )
                    // InternalSQLParser.g:3642:5: lv_exp_1_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getExpressionFragmentAccess().getExpExpressionParserRuleCall_1_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_exp_1_0=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getExpressionFragmentRule());
                      					}
                      					set(
                      						current,
                      						"exp",
                      						lv_exp_1_0,
                      						"org.xtext.example.mydsl_sql.SQL.Expression");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalSQLParser.g:3660:3: ( ( (lv_xexp_2_1= ruleXExpression | lv_xexp_2_2= ruleXExpression_ ) ) )
                    {
                    // InternalSQLParser.g:3660:3: ( ( (lv_xexp_2_1= ruleXExpression | lv_xexp_2_2= ruleXExpression_ ) ) )
                    // InternalSQLParser.g:3661:4: ( (lv_xexp_2_1= ruleXExpression | lv_xexp_2_2= ruleXExpression_ ) )
                    {
                    // InternalSQLParser.g:3661:4: ( (lv_xexp_2_1= ruleXExpression | lv_xexp_2_2= ruleXExpression_ ) )
                    // InternalSQLParser.g:3662:5: (lv_xexp_2_1= ruleXExpression | lv_xexp_2_2= ruleXExpression_ )
                    {
                    // InternalSQLParser.g:3662:5: (lv_xexp_2_1= ruleXExpression | lv_xexp_2_2= ruleXExpression_ )
                    int alt77=2;
                    alt77 = dfa77.predict(input);
                    switch (alt77) {
                        case 1 :
                            // InternalSQLParser.g:3663:6: lv_xexp_2_1= ruleXExpression
                            {
                            if ( state.backtracking==0 ) {

                              						newCompositeNode(grammarAccess.getExpressionFragmentAccess().getXexpXExpressionParserRuleCall_2_0_0());
                              					
                            }
                            pushFollow(FOLLOW_2);
                            lv_xexp_2_1=ruleXExpression();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						if (current==null) {
                              							current = createModelElementForParent(grammarAccess.getExpressionFragmentRule());
                              						}
                              						set(
                              							current,
                              							"xexp",
                              							lv_xexp_2_1,
                              							"org.xtext.example.mydsl_sql.SQL.XExpression");
                              						afterParserOrEnumRuleCall();
                              					
                            }

                            }
                            break;
                        case 2 :
                            // InternalSQLParser.g:3679:6: lv_xexp_2_2= ruleXExpression_
                            {
                            if ( state.backtracking==0 ) {

                              						newCompositeNode(grammarAccess.getExpressionFragmentAccess().getXexpXExpression_ParserRuleCall_2_0_1());
                              					
                            }
                            pushFollow(FOLLOW_2);
                            lv_xexp_2_2=ruleXExpression_();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						if (current==null) {
                              							current = createModelElementForParent(grammarAccess.getExpressionFragmentRule());
                              						}
                              						set(
                              							current,
                              							"xexp",
                              							lv_xexp_2_2,
                              							"org.xtext.example.mydsl_sql.SQL.XExpression_");
                              						afterParserOrEnumRuleCall();
                              					
                            }

                            }
                            break;

                    }


                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalSQLParser.g:3698:3: ( (lv_notPrm_3_0= RULE_JRNPARAM ) )
                    {
                    // InternalSQLParser.g:3698:3: ( (lv_notPrm_3_0= RULE_JRNPARAM ) )
                    // InternalSQLParser.g:3699:4: (lv_notPrm_3_0= RULE_JRNPARAM )
                    {
                    // InternalSQLParser.g:3699:4: (lv_notPrm_3_0= RULE_JRNPARAM )
                    // InternalSQLParser.g:3700:5: lv_notPrm_3_0= RULE_JRNPARAM
                    {
                    lv_notPrm_3_0=(Token)match(input,RULE_JRNPARAM,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_notPrm_3_0, grammarAccess.getExpressionFragmentAccess().getNotPrmJRNPARAMTerminalRuleCall_3_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getExpressionFragmentRule());
                      					}
                      					setWithLastConsumed(
                      						current,
                      						"notPrm",
                      						lv_notPrm_3_0,
                      						"org.xtext.example.mydsl_sql.SQL.JRNPARAM");
                      				
                    }

                    }


                    }


                    }
                    break;
                case 5 :
                    // InternalSQLParser.g:3717:3: ( (lv_in_4_0= ruleInOperator ) )
                    {
                    // InternalSQLParser.g:3717:3: ( (lv_in_4_0= ruleInOperator ) )
                    // InternalSQLParser.g:3718:4: (lv_in_4_0= ruleInOperator )
                    {
                    // InternalSQLParser.g:3718:4: (lv_in_4_0= ruleInOperator )
                    // InternalSQLParser.g:3719:5: lv_in_4_0= ruleInOperator
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getExpressionFragmentAccess().getInInOperatorParserRuleCall_4_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_in_4_0=ruleInOperator();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getExpressionFragmentRule());
                      					}
                      					set(
                      						current,
                      						"in",
                      						lv_in_4_0,
                      						"org.xtext.example.mydsl_sql.SQL.InOperator");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }


                    }
                    break;
                case 6 :
                    // InternalSQLParser.g:3737:3: ( (lv_exists_5_0= ruleExistsOperator ) )
                    {
                    // InternalSQLParser.g:3737:3: ( (lv_exists_5_0= ruleExistsOperator ) )
                    // InternalSQLParser.g:3738:4: (lv_exists_5_0= ruleExistsOperator )
                    {
                    // InternalSQLParser.g:3738:4: (lv_exists_5_0= ruleExistsOperator )
                    // InternalSQLParser.g:3739:5: lv_exists_5_0= ruleExistsOperator
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getExpressionFragmentAccess().getExistsExistsOperatorParserRuleCall_5_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_exists_5_0=ruleExistsOperator();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getExpressionFragmentRule());
                      					}
                      					set(
                      						current,
                      						"exists",
                      						lv_exists_5_0,
                      						"org.xtext.example.mydsl_sql.SQL.ExistsOperator");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExpressionFragment"


    // $ANTLR start "entryRuleExpressionGroup"
    // InternalSQLParser.g:3760:1: entryRuleExpressionGroup returns [EObject current=null] : iv_ruleExpressionGroup= ruleExpressionGroup EOF ;
    public final EObject entryRuleExpressionGroup() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpressionGroup = null;


        try {
            // InternalSQLParser.g:3760:56: (iv_ruleExpressionGroup= ruleExpressionGroup EOF )
            // InternalSQLParser.g:3761:2: iv_ruleExpressionGroup= ruleExpressionGroup EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpressionGroupRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleExpressionGroup=ruleExpressionGroup();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpressionGroup; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExpressionGroup"


    // $ANTLR start "ruleExpressionGroup"
    // InternalSQLParser.g:3767:1: ruleExpressionGroup returns [EObject current=null] : ( () ( ( (lv_isnot_1_1= NOT | lv_isnot_1_2= NOT_1 ) ) )? otherlv_2= LeftParenthesis ( (lv_expr_3_0= ruleFullExpression ) ) otherlv_4= RightParenthesis ) ;
    public final EObject ruleExpressionGroup() throws RecognitionException {
        EObject current = null;

        Token lv_isnot_1_1=null;
        Token lv_isnot_1_2=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_expr_3_0 = null;



        	enterRule();

        try {
            // InternalSQLParser.g:3773:2: ( ( () ( ( (lv_isnot_1_1= NOT | lv_isnot_1_2= NOT_1 ) ) )? otherlv_2= LeftParenthesis ( (lv_expr_3_0= ruleFullExpression ) ) otherlv_4= RightParenthesis ) )
            // InternalSQLParser.g:3774:2: ( () ( ( (lv_isnot_1_1= NOT | lv_isnot_1_2= NOT_1 ) ) )? otherlv_2= LeftParenthesis ( (lv_expr_3_0= ruleFullExpression ) ) otherlv_4= RightParenthesis )
            {
            // InternalSQLParser.g:3774:2: ( () ( ( (lv_isnot_1_1= NOT | lv_isnot_1_2= NOT_1 ) ) )? otherlv_2= LeftParenthesis ( (lv_expr_3_0= ruleFullExpression ) ) otherlv_4= RightParenthesis )
            // InternalSQLParser.g:3775:3: () ( ( (lv_isnot_1_1= NOT | lv_isnot_1_2= NOT_1 ) ) )? otherlv_2= LeftParenthesis ( (lv_expr_3_0= ruleFullExpression ) ) otherlv_4= RightParenthesis
            {
            // InternalSQLParser.g:3775:3: ()
            // InternalSQLParser.g:3776:4: 
            {
            if ( state.backtracking==0 ) {

              				/* */
              			
            }
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getExpressionGroupAccess().getExprGroupAction_0(),
              					current);
              			
            }

            }

            // InternalSQLParser.g:3785:3: ( ( (lv_isnot_1_1= NOT | lv_isnot_1_2= NOT_1 ) ) )?
            int alt80=2;
            int LA80_0 = input.LA(1);

            if ( (LA80_0==NOT_1||LA80_0==NOT) ) {
                alt80=1;
            }
            switch (alt80) {
                case 1 :
                    // InternalSQLParser.g:3786:4: ( (lv_isnot_1_1= NOT | lv_isnot_1_2= NOT_1 ) )
                    {
                    // InternalSQLParser.g:3786:4: ( (lv_isnot_1_1= NOT | lv_isnot_1_2= NOT_1 ) )
                    // InternalSQLParser.g:3787:5: (lv_isnot_1_1= NOT | lv_isnot_1_2= NOT_1 )
                    {
                    // InternalSQLParser.g:3787:5: (lv_isnot_1_1= NOT | lv_isnot_1_2= NOT_1 )
                    int alt79=2;
                    int LA79_0 = input.LA(1);

                    if ( (LA79_0==NOT) ) {
                        alt79=1;
                    }
                    else if ( (LA79_0==NOT_1) ) {
                        alt79=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 79, 0, input);

                        throw nvae;
                    }
                    switch (alt79) {
                        case 1 :
                            // InternalSQLParser.g:3788:6: lv_isnot_1_1= NOT
                            {
                            lv_isnot_1_1=(Token)match(input,NOT,FOLLOW_7); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(lv_isnot_1_1, grammarAccess.getExpressionGroupAccess().getIsnotNOTKeyword_1_0_0());
                              					
                            }
                            if ( state.backtracking==0 ) {

                              						if (current==null) {
                              							current = createModelElement(grammarAccess.getExpressionGroupRule());
                              						}
                              						setWithLastConsumed(current, "isnot", lv_isnot_1_1, null);
                              					
                            }

                            }
                            break;
                        case 2 :
                            // InternalSQLParser.g:3799:6: lv_isnot_1_2= NOT_1
                            {
                            lv_isnot_1_2=(Token)match(input,NOT_1,FOLLOW_7); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(lv_isnot_1_2, grammarAccess.getExpressionGroupAccess().getIsnotNOTKeyword_1_0_1());
                              					
                            }
                            if ( state.backtracking==0 ) {

                              						if (current==null) {
                              							current = createModelElement(grammarAccess.getExpressionGroupRule());
                              						}
                              						setWithLastConsumed(current, "isnot", lv_isnot_1_2, null);
                              					
                            }

                            }
                            break;

                    }


                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,LeftParenthesis,FOLLOW_23); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getExpressionGroupAccess().getLeftParenthesisKeyword_2());
              		
            }
            // InternalSQLParser.g:3816:3: ( (lv_expr_3_0= ruleFullExpression ) )
            // InternalSQLParser.g:3817:4: (lv_expr_3_0= ruleFullExpression )
            {
            // InternalSQLParser.g:3817:4: (lv_expr_3_0= ruleFullExpression )
            // InternalSQLParser.g:3818:5: lv_expr_3_0= ruleFullExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getExpressionGroupAccess().getExprFullExpressionParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_8);
            lv_expr_3_0=ruleFullExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getExpressionGroupRule());
              					}
              					set(
              						current,
              						"expr",
              						lv_expr_3_0,
              						"org.xtext.example.mydsl_sql.SQL.FullExpression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_4=(Token)match(input,RightParenthesis,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getExpressionGroupAccess().getRightParenthesisKeyword_4());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExpressionGroup"


    // $ANTLR start "entryRuleXExpression"
    // InternalSQLParser.g:3843:1: entryRuleXExpression returns [EObject current=null] : iv_ruleXExpression= ruleXExpression EOF ;
    public final EObject entryRuleXExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXExpression = null;


        try {
            // InternalSQLParser.g:3843:52: (iv_ruleXExpression= ruleXExpression EOF )
            // InternalSQLParser.g:3844:2: iv_ruleXExpression= ruleXExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleXExpression=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXExpression"


    // $ANTLR start "ruleXExpression"
    // InternalSQLParser.g:3850:1: ruleXExpression returns [EObject current=null] : (otherlv_0= X () ( (lv_xf_2_0= ruleXFunction ) ) otherlv_3= Comma ( (lv_col_4_0= ruleOperandGroup ) ) (otherlv_5= Comma ( (lv_prm_6_0= ruleXExpressionParams ) ) )? otherlv_7= RightCurlyBracket ) ;
    public final EObject ruleXExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Enumerator lv_xf_2_0 = null;

        EObject lv_col_4_0 = null;

        EObject lv_prm_6_0 = null;



        	enterRule();

        try {
            // InternalSQLParser.g:3856:2: ( (otherlv_0= X () ( (lv_xf_2_0= ruleXFunction ) ) otherlv_3= Comma ( (lv_col_4_0= ruleOperandGroup ) ) (otherlv_5= Comma ( (lv_prm_6_0= ruleXExpressionParams ) ) )? otherlv_7= RightCurlyBracket ) )
            // InternalSQLParser.g:3857:2: (otherlv_0= X () ( (lv_xf_2_0= ruleXFunction ) ) otherlv_3= Comma ( (lv_col_4_0= ruleOperandGroup ) ) (otherlv_5= Comma ( (lv_prm_6_0= ruleXExpressionParams ) ) )? otherlv_7= RightCurlyBracket )
            {
            // InternalSQLParser.g:3857:2: (otherlv_0= X () ( (lv_xf_2_0= ruleXFunction ) ) otherlv_3= Comma ( (lv_col_4_0= ruleOperandGroup ) ) (otherlv_5= Comma ( (lv_prm_6_0= ruleXExpressionParams ) ) )? otherlv_7= RightCurlyBracket )
            // InternalSQLParser.g:3858:3: otherlv_0= X () ( (lv_xf_2_0= ruleXFunction ) ) otherlv_3= Comma ( (lv_col_4_0= ruleOperandGroup ) ) (otherlv_5= Comma ( (lv_prm_6_0= ruleXExpressionParams ) ) )? otherlv_7= RightCurlyBracket
            {
            otherlv_0=(Token)match(input,X,FOLLOW_58); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getXExpressionAccess().getXKeyword_0());
              		
            }
            // InternalSQLParser.g:3862:3: ()
            // InternalSQLParser.g:3863:4: 
            {
            if ( state.backtracking==0 ) {

              				/* */
              			
            }
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getXExpressionAccess().getXExprAction_1(),
              					current);
              			
            }

            }

            // InternalSQLParser.g:3872:3: ( (lv_xf_2_0= ruleXFunction ) )
            // InternalSQLParser.g:3873:4: (lv_xf_2_0= ruleXFunction )
            {
            // InternalSQLParser.g:3873:4: (lv_xf_2_0= ruleXFunction )
            // InternalSQLParser.g:3874:5: lv_xf_2_0= ruleXFunction
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getXExpressionAccess().getXfXFunctionEnumRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_59);
            lv_xf_2_0=ruleXFunction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getXExpressionRule());
              					}
              					set(
              						current,
              						"xf",
              						lv_xf_2_0,
              						"org.xtext.example.mydsl_sql.SQL.XFunction");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_3=(Token)match(input,Comma,FOLLOW_60); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getXExpressionAccess().getCommaKeyword_3());
              		
            }
            // InternalSQLParser.g:3895:3: ( (lv_col_4_0= ruleOperandGroup ) )
            // InternalSQLParser.g:3896:4: (lv_col_4_0= ruleOperandGroup )
            {
            // InternalSQLParser.g:3896:4: (lv_col_4_0= ruleOperandGroup )
            // InternalSQLParser.g:3897:5: lv_col_4_0= ruleOperandGroup
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getXExpressionAccess().getColOperandGroupParserRuleCall_4_0());
              				
            }
            pushFollow(FOLLOW_61);
            lv_col_4_0=ruleOperandGroup();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getXExpressionRule());
              					}
              					set(
              						current,
              						"col",
              						lv_col_4_0,
              						"org.xtext.example.mydsl_sql.SQL.OperandGroup");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalSQLParser.g:3914:3: (otherlv_5= Comma ( (lv_prm_6_0= ruleXExpressionParams ) ) )?
            int alt81=2;
            int LA81_0 = input.LA(1);

            if ( (LA81_0==Comma) ) {
                alt81=1;
            }
            switch (alt81) {
                case 1 :
                    // InternalSQLParser.g:3915:4: otherlv_5= Comma ( (lv_prm_6_0= ruleXExpressionParams ) )
                    {
                    otherlv_5=(Token)match(input,Comma,FOLLOW_46); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_5, grammarAccess.getXExpressionAccess().getCommaKeyword_5_0());
                      			
                    }
                    // InternalSQLParser.g:3919:4: ( (lv_prm_6_0= ruleXExpressionParams ) )
                    // InternalSQLParser.g:3920:5: (lv_prm_6_0= ruleXExpressionParams )
                    {
                    // InternalSQLParser.g:3920:5: (lv_prm_6_0= ruleXExpressionParams )
                    // InternalSQLParser.g:3921:6: lv_prm_6_0= ruleXExpressionParams
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getXExpressionAccess().getPrmXExpressionParamsParserRuleCall_5_1_0());
                      					
                    }
                    pushFollow(FOLLOW_62);
                    lv_prm_6_0=ruleXExpressionParams();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getXExpressionRule());
                      						}
                      						set(
                      							current,
                      							"prm",
                      							lv_prm_6_0,
                      							"org.xtext.example.mydsl_sql.SQL.XExpressionParams");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,RightCurlyBracket,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getXExpressionAccess().getRightCurlyBracketKeyword_6());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXExpression"


    // $ANTLR start "entryRuleXExpression_"
    // InternalSQLParser.g:3947:1: entryRuleXExpression_ returns [EObject current=null] : iv_ruleXExpression_= ruleXExpression_ EOF ;
    public final EObject entryRuleXExpression_() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXExpression_ = null;


        try {
            // InternalSQLParser.g:3947:53: (iv_ruleXExpression_= ruleXExpression_ EOF )
            // InternalSQLParser.g:3948:2: iv_ruleXExpression_= ruleXExpression_ EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXExpression_Rule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleXExpression_=ruleXExpression_();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXExpression_; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXExpression_"


    // $ANTLR start "ruleXExpression_"
    // InternalSQLParser.g:3954:1: ruleXExpression_ returns [EObject current=null] : (otherlv_0= X () ( (lv_xf_2_0= ruleXFunction ) ) otherlv_3= VerticalLine ( (lv_col_4_0= ruleOperandGroup ) ) (otherlv_5= VerticalLine ( (lv_prm_6_0= ruleXExpressionParams ) ) )? otherlv_7= RightCurlyBracket ) ;
    public final EObject ruleXExpression_() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Enumerator lv_xf_2_0 = null;

        EObject lv_col_4_0 = null;

        EObject lv_prm_6_0 = null;



        	enterRule();

        try {
            // InternalSQLParser.g:3960:2: ( (otherlv_0= X () ( (lv_xf_2_0= ruleXFunction ) ) otherlv_3= VerticalLine ( (lv_col_4_0= ruleOperandGroup ) ) (otherlv_5= VerticalLine ( (lv_prm_6_0= ruleXExpressionParams ) ) )? otherlv_7= RightCurlyBracket ) )
            // InternalSQLParser.g:3961:2: (otherlv_0= X () ( (lv_xf_2_0= ruleXFunction ) ) otherlv_3= VerticalLine ( (lv_col_4_0= ruleOperandGroup ) ) (otherlv_5= VerticalLine ( (lv_prm_6_0= ruleXExpressionParams ) ) )? otherlv_7= RightCurlyBracket )
            {
            // InternalSQLParser.g:3961:2: (otherlv_0= X () ( (lv_xf_2_0= ruleXFunction ) ) otherlv_3= VerticalLine ( (lv_col_4_0= ruleOperandGroup ) ) (otherlv_5= VerticalLine ( (lv_prm_6_0= ruleXExpressionParams ) ) )? otherlv_7= RightCurlyBracket )
            // InternalSQLParser.g:3962:3: otherlv_0= X () ( (lv_xf_2_0= ruleXFunction ) ) otherlv_3= VerticalLine ( (lv_col_4_0= ruleOperandGroup ) ) (otherlv_5= VerticalLine ( (lv_prm_6_0= ruleXExpressionParams ) ) )? otherlv_7= RightCurlyBracket
            {
            otherlv_0=(Token)match(input,X,FOLLOW_58); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getXExpression_Access().getXKeyword_0());
              		
            }
            // InternalSQLParser.g:3966:3: ()
            // InternalSQLParser.g:3967:4: 
            {
            if ( state.backtracking==0 ) {

              				/* */
              			
            }
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getXExpression_Access().getXExprAction_1(),
              					current);
              			
            }

            }

            // InternalSQLParser.g:3976:3: ( (lv_xf_2_0= ruleXFunction ) )
            // InternalSQLParser.g:3977:4: (lv_xf_2_0= ruleXFunction )
            {
            // InternalSQLParser.g:3977:4: (lv_xf_2_0= ruleXFunction )
            // InternalSQLParser.g:3978:5: lv_xf_2_0= ruleXFunction
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getXExpression_Access().getXfXFunctionEnumRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_63);
            lv_xf_2_0=ruleXFunction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getXExpression_Rule());
              					}
              					set(
              						current,
              						"xf",
              						lv_xf_2_0,
              						"org.xtext.example.mydsl_sql.SQL.XFunction");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_3=(Token)match(input,VerticalLine,FOLLOW_60); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getXExpression_Access().getVerticalLineKeyword_3());
              		
            }
            // InternalSQLParser.g:3999:3: ( (lv_col_4_0= ruleOperandGroup ) )
            // InternalSQLParser.g:4000:4: (lv_col_4_0= ruleOperandGroup )
            {
            // InternalSQLParser.g:4000:4: (lv_col_4_0= ruleOperandGroup )
            // InternalSQLParser.g:4001:5: lv_col_4_0= ruleOperandGroup
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getXExpression_Access().getColOperandGroupParserRuleCall_4_0());
              				
            }
            pushFollow(FOLLOW_64);
            lv_col_4_0=ruleOperandGroup();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getXExpression_Rule());
              					}
              					set(
              						current,
              						"col",
              						lv_col_4_0,
              						"org.xtext.example.mydsl_sql.SQL.OperandGroup");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalSQLParser.g:4018:3: (otherlv_5= VerticalLine ( (lv_prm_6_0= ruleXExpressionParams ) ) )?
            int alt82=2;
            int LA82_0 = input.LA(1);

            if ( (LA82_0==VerticalLine) ) {
                alt82=1;
            }
            switch (alt82) {
                case 1 :
                    // InternalSQLParser.g:4019:4: otherlv_5= VerticalLine ( (lv_prm_6_0= ruleXExpressionParams ) )
                    {
                    otherlv_5=(Token)match(input,VerticalLine,FOLLOW_46); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_5, grammarAccess.getXExpression_Access().getVerticalLineKeyword_5_0());
                      			
                    }
                    // InternalSQLParser.g:4023:4: ( (lv_prm_6_0= ruleXExpressionParams ) )
                    // InternalSQLParser.g:4024:5: (lv_prm_6_0= ruleXExpressionParams )
                    {
                    // InternalSQLParser.g:4024:5: (lv_prm_6_0= ruleXExpressionParams )
                    // InternalSQLParser.g:4025:6: lv_prm_6_0= ruleXExpressionParams
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getXExpression_Access().getPrmXExpressionParamsParserRuleCall_5_1_0());
                      					
                    }
                    pushFollow(FOLLOW_62);
                    lv_prm_6_0=ruleXExpressionParams();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getXExpression_Rule());
                      						}
                      						set(
                      							current,
                      							"prm",
                      							lv_prm_6_0,
                      							"org.xtext.example.mydsl_sql.SQL.XExpressionParams");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,RightCurlyBracket,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getXExpression_Access().getRightCurlyBracketKeyword_6());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXExpression_"


    // $ANTLR start "entryRuleXExpressionParams"
    // InternalSQLParser.g:4051:1: entryRuleXExpressionParams returns [EObject current=null] : iv_ruleXExpressionParams= ruleXExpressionParams EOF ;
    public final EObject entryRuleXExpressionParams() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXExpressionParams = null;


        try {
            // InternalSQLParser.g:4051:58: (iv_ruleXExpressionParams= ruleXExpressionParams EOF )
            // InternalSQLParser.g:4052:2: iv_ruleXExpressionParams= ruleXExpressionParams EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXExpressionParamsRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleXExpressionParams=ruleXExpressionParams();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXExpressionParams; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXExpressionParams"


    // $ANTLR start "ruleXExpressionParams"
    // InternalSQLParser.g:4058:1: ruleXExpressionParams returns [EObject current=null] : (this_JRParameter_0= ruleJRParameter ( () (otherlv_2= Comma ( (lv_entries_3_0= ruleJRParameter ) ) )+ )? ) ;
    public final EObject ruleXExpressionParams() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_JRParameter_0 = null;

        EObject lv_entries_3_0 = null;



        	enterRule();

        try {
            // InternalSQLParser.g:4064:2: ( (this_JRParameter_0= ruleJRParameter ( () (otherlv_2= Comma ( (lv_entries_3_0= ruleJRParameter ) ) )+ )? ) )
            // InternalSQLParser.g:4065:2: (this_JRParameter_0= ruleJRParameter ( () (otherlv_2= Comma ( (lv_entries_3_0= ruleJRParameter ) ) )+ )? )
            {
            // InternalSQLParser.g:4065:2: (this_JRParameter_0= ruleJRParameter ( () (otherlv_2= Comma ( (lv_entries_3_0= ruleJRParameter ) ) )+ )? )
            // InternalSQLParser.g:4066:3: this_JRParameter_0= ruleJRParameter ( () (otherlv_2= Comma ( (lv_entries_3_0= ruleJRParameter ) ) )+ )?
            {
            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getXExpressionParamsAccess().getJRParameterParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_9);
            this_JRParameter_0=ruleJRParameter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_JRParameter_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalSQLParser.g:4077:3: ( () (otherlv_2= Comma ( (lv_entries_3_0= ruleJRParameter ) ) )+ )?
            int alt84=2;
            int LA84_0 = input.LA(1);

            if ( (LA84_0==Comma) ) {
                alt84=1;
            }
            switch (alt84) {
                case 1 :
                    // InternalSQLParser.g:4078:4: () (otherlv_2= Comma ( (lv_entries_3_0= ruleJRParameter ) ) )+
                    {
                    // InternalSQLParser.g:4078:4: ()
                    // InternalSQLParser.g:4079:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					/* */
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElementAndAdd(
                      						grammarAccess.getXExpressionParamsAccess().getPrmsEntriesAction_1_0(),
                      						current);
                      				
                    }

                    }

                    // InternalSQLParser.g:4088:4: (otherlv_2= Comma ( (lv_entries_3_0= ruleJRParameter ) ) )+
                    int cnt83=0;
                    loop83:
                    do {
                        int alt83=2;
                        int LA83_0 = input.LA(1);

                        if ( (LA83_0==Comma) ) {
                            alt83=1;
                        }


                        switch (alt83) {
                    	case 1 :
                    	    // InternalSQLParser.g:4089:5: otherlv_2= Comma ( (lv_entries_3_0= ruleJRParameter ) )
                    	    {
                    	    otherlv_2=(Token)match(input,Comma,FOLLOW_46); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_2, grammarAccess.getXExpressionParamsAccess().getCommaKeyword_1_1_0());
                    	      				
                    	    }
                    	    // InternalSQLParser.g:4093:5: ( (lv_entries_3_0= ruleJRParameter ) )
                    	    // InternalSQLParser.g:4094:6: (lv_entries_3_0= ruleJRParameter )
                    	    {
                    	    // InternalSQLParser.g:4094:6: (lv_entries_3_0= ruleJRParameter )
                    	    // InternalSQLParser.g:4095:7: lv_entries_3_0= ruleJRParameter
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getXExpressionParamsAccess().getEntriesJRParameterParserRuleCall_1_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_9);
                    	    lv_entries_3_0=ruleJRParameter();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getXExpressionParamsRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"entries",
                    	      								lv_entries_3_0,
                    	      								"org.xtext.example.mydsl_sql.SQL.JRParameter");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt83 >= 1 ) break loop83;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(83, input);
                                throw eee;
                        }
                        cnt83++;
                    } while (true);


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXExpressionParams"


    // $ANTLR start "entryRuleJRParameter"
    // InternalSQLParser.g:4118:1: entryRuleJRParameter returns [EObject current=null] : iv_ruleJRParameter= ruleJRParameter EOF ;
    public final EObject entryRuleJRParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJRParameter = null;


        try {
            // InternalSQLParser.g:4118:52: (iv_ruleJRParameter= ruleJRParameter EOF )
            // InternalSQLParser.g:4119:2: iv_ruleJRParameter= ruleJRParameter EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJRParameterRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleJRParameter=ruleJRParameter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJRParameter; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleJRParameter"


    // $ANTLR start "ruleJRParameter"
    // InternalSQLParser.g:4125:1: ruleJRParameter returns [EObject current=null] : ( (lv_jrprm_0_0= RULE_ID ) ) ;
    public final EObject ruleJRParameter() throws RecognitionException {
        EObject current = null;

        Token lv_jrprm_0_0=null;


        	enterRule();

        try {
            // InternalSQLParser.g:4131:2: ( ( (lv_jrprm_0_0= RULE_ID ) ) )
            // InternalSQLParser.g:4132:2: ( (lv_jrprm_0_0= RULE_ID ) )
            {
            // InternalSQLParser.g:4132:2: ( (lv_jrprm_0_0= RULE_ID ) )
            // InternalSQLParser.g:4133:3: (lv_jrprm_0_0= RULE_ID )
            {
            // InternalSQLParser.g:4133:3: (lv_jrprm_0_0= RULE_ID )
            // InternalSQLParser.g:4134:4: lv_jrprm_0_0= RULE_ID
            {
            lv_jrprm_0_0=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(lv_jrprm_0_0, grammarAccess.getJRParameterAccess().getJrprmIDTerminalRuleCall_0());
              			
            }
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElement(grammarAccess.getJRParameterRule());
              				}
              				setWithLastConsumed(
              					current,
              					"jrprm",
              					lv_jrprm_0_0,
              					"org.xtext.example.mydsl_sql.SQL.ID");
              			
            }

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleJRParameter"


    // $ANTLR start "entryRuleExpression"
    // InternalSQLParser.g:4153:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // InternalSQLParser.g:4153:51: (iv_ruleExpression= ruleExpression EOF )
            // InternalSQLParser.g:4154:2: iv_ruleExpression= ruleExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleExpression=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExpression"


    // $ANTLR start "ruleExpression"
    // InternalSQLParser.g:4160:1: ruleExpression returns [EObject current=null] : ( ( (lv_op1_0_0= ruleOperand ) ) ( ( (lv_isnull_1_0= ruleIsNullValue ) ) | ( (lv_in_2_0= ruleInOperator ) ) | ( (lv_exists_3_0= ruleExistsOperator ) ) | ( (lv_between_4_0= ruleBetween ) ) | ( (lv_like_5_0= ruleLike ) ) | ( (lv_comp_6_0= ruleComparison ) ) ) ) ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject lv_op1_0_0 = null;

        AntlrDatatypeRuleToken lv_isnull_1_0 = null;

        EObject lv_in_2_0 = null;

        EObject lv_exists_3_0 = null;

        EObject lv_between_4_0 = null;

        EObject lv_like_5_0 = null;

        EObject lv_comp_6_0 = null;



        	enterRule();

        try {
            // InternalSQLParser.g:4166:2: ( ( ( (lv_op1_0_0= ruleOperand ) ) ( ( (lv_isnull_1_0= ruleIsNullValue ) ) | ( (lv_in_2_0= ruleInOperator ) ) | ( (lv_exists_3_0= ruleExistsOperator ) ) | ( (lv_between_4_0= ruleBetween ) ) | ( (lv_like_5_0= ruleLike ) ) | ( (lv_comp_6_0= ruleComparison ) ) ) ) )
            // InternalSQLParser.g:4167:2: ( ( (lv_op1_0_0= ruleOperand ) ) ( ( (lv_isnull_1_0= ruleIsNullValue ) ) | ( (lv_in_2_0= ruleInOperator ) ) | ( (lv_exists_3_0= ruleExistsOperator ) ) | ( (lv_between_4_0= ruleBetween ) ) | ( (lv_like_5_0= ruleLike ) ) | ( (lv_comp_6_0= ruleComparison ) ) ) )
            {
            // InternalSQLParser.g:4167:2: ( ( (lv_op1_0_0= ruleOperand ) ) ( ( (lv_isnull_1_0= ruleIsNullValue ) ) | ( (lv_in_2_0= ruleInOperator ) ) | ( (lv_exists_3_0= ruleExistsOperator ) ) | ( (lv_between_4_0= ruleBetween ) ) | ( (lv_like_5_0= ruleLike ) ) | ( (lv_comp_6_0= ruleComparison ) ) ) )
            // InternalSQLParser.g:4168:3: ( (lv_op1_0_0= ruleOperand ) ) ( ( (lv_isnull_1_0= ruleIsNullValue ) ) | ( (lv_in_2_0= ruleInOperator ) ) | ( (lv_exists_3_0= ruleExistsOperator ) ) | ( (lv_between_4_0= ruleBetween ) ) | ( (lv_like_5_0= ruleLike ) ) | ( (lv_comp_6_0= ruleComparison ) ) )
            {
            // InternalSQLParser.g:4168:3: ( (lv_op1_0_0= ruleOperand ) )
            // InternalSQLParser.g:4169:4: (lv_op1_0_0= ruleOperand )
            {
            // InternalSQLParser.g:4169:4: (lv_op1_0_0= ruleOperand )
            // InternalSQLParser.g:4170:5: lv_op1_0_0= ruleOperand
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getExpressionAccess().getOp1OperandParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_65);
            lv_op1_0_0=ruleOperand();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getExpressionRule());
              					}
              					set(
              						current,
              						"op1",
              						lv_op1_0_0,
              						"org.xtext.example.mydsl_sql.SQL.Operand");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalSQLParser.g:4187:3: ( ( (lv_isnull_1_0= ruleIsNullValue ) ) | ( (lv_in_2_0= ruleInOperator ) ) | ( (lv_exists_3_0= ruleExistsOperator ) ) | ( (lv_between_4_0= ruleBetween ) ) | ( (lv_like_5_0= ruleLike ) ) | ( (lv_comp_6_0= ruleComparison ) ) )
            int alt85=6;
            switch ( input.LA(1) ) {
            case IS:
                {
                alt85=1;
                }
                break;
            case NOT:
                {
                switch ( input.LA(2) ) {
                case EXISTS:
                    {
                    alt85=3;
                    }
                    break;
                case LIKE:
                    {
                    alt85=5;
                    }
                    break;
                case IN:
                    {
                    alt85=2;
                    }
                    break;
                case BETWEEN:
                    {
                    alt85=4;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 85, 2, input);

                    throw nvae;
                }

                }
                break;
            case IN:
                {
                alt85=2;
                }
                break;
            case EXISTS:
                {
                alt85=3;
                }
                break;
            case BETWEEN:
                {
                alt85=4;
                }
                break;
            case LIKE:
                {
                alt85=5;
                }
                break;
            case ExclamationMarkEqualsSign:
            case LessThanSignEqualsSign:
            case LessThanSignGreaterThanSign:
            case GreaterThanSignEqualsSign:
            case CircumflexAccentEqualsSign:
            case LessThanSign:
            case EqualsSign:
            case GreaterThanSign:
                {
                alt85=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 85, 0, input);

                throw nvae;
            }

            switch (alt85) {
                case 1 :
                    // InternalSQLParser.g:4188:4: ( (lv_isnull_1_0= ruleIsNullValue ) )
                    {
                    // InternalSQLParser.g:4188:4: ( (lv_isnull_1_0= ruleIsNullValue ) )
                    // InternalSQLParser.g:4189:5: (lv_isnull_1_0= ruleIsNullValue )
                    {
                    // InternalSQLParser.g:4189:5: (lv_isnull_1_0= ruleIsNullValue )
                    // InternalSQLParser.g:4190:6: lv_isnull_1_0= ruleIsNullValue
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getExpressionAccess().getIsnullIsNullValueParserRuleCall_1_0_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_isnull_1_0=ruleIsNullValue();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getExpressionRule());
                      						}
                      						set(
                      							current,
                      							"isnull",
                      							lv_isnull_1_0,
                      							"org.xtext.example.mydsl_sql.SQL.IsNullValue");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalSQLParser.g:4208:4: ( (lv_in_2_0= ruleInOperator ) )
                    {
                    // InternalSQLParser.g:4208:4: ( (lv_in_2_0= ruleInOperator ) )
                    // InternalSQLParser.g:4209:5: (lv_in_2_0= ruleInOperator )
                    {
                    // InternalSQLParser.g:4209:5: (lv_in_2_0= ruleInOperator )
                    // InternalSQLParser.g:4210:6: lv_in_2_0= ruleInOperator
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getExpressionAccess().getInInOperatorParserRuleCall_1_1_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_in_2_0=ruleInOperator();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getExpressionRule());
                      						}
                      						set(
                      							current,
                      							"in",
                      							lv_in_2_0,
                      							"org.xtext.example.mydsl_sql.SQL.InOperator");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalSQLParser.g:4228:4: ( (lv_exists_3_0= ruleExistsOperator ) )
                    {
                    // InternalSQLParser.g:4228:4: ( (lv_exists_3_0= ruleExistsOperator ) )
                    // InternalSQLParser.g:4229:5: (lv_exists_3_0= ruleExistsOperator )
                    {
                    // InternalSQLParser.g:4229:5: (lv_exists_3_0= ruleExistsOperator )
                    // InternalSQLParser.g:4230:6: lv_exists_3_0= ruleExistsOperator
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getExpressionAccess().getExistsExistsOperatorParserRuleCall_1_2_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_exists_3_0=ruleExistsOperator();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getExpressionRule());
                      						}
                      						set(
                      							current,
                      							"exists",
                      							lv_exists_3_0,
                      							"org.xtext.example.mydsl_sql.SQL.ExistsOperator");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalSQLParser.g:4248:4: ( (lv_between_4_0= ruleBetween ) )
                    {
                    // InternalSQLParser.g:4248:4: ( (lv_between_4_0= ruleBetween ) )
                    // InternalSQLParser.g:4249:5: (lv_between_4_0= ruleBetween )
                    {
                    // InternalSQLParser.g:4249:5: (lv_between_4_0= ruleBetween )
                    // InternalSQLParser.g:4250:6: lv_between_4_0= ruleBetween
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getExpressionAccess().getBetweenBetweenParserRuleCall_1_3_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_between_4_0=ruleBetween();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getExpressionRule());
                      						}
                      						set(
                      							current,
                      							"between",
                      							lv_between_4_0,
                      							"org.xtext.example.mydsl_sql.SQL.Between");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;
                case 5 :
                    // InternalSQLParser.g:4268:4: ( (lv_like_5_0= ruleLike ) )
                    {
                    // InternalSQLParser.g:4268:4: ( (lv_like_5_0= ruleLike ) )
                    // InternalSQLParser.g:4269:5: (lv_like_5_0= ruleLike )
                    {
                    // InternalSQLParser.g:4269:5: (lv_like_5_0= ruleLike )
                    // InternalSQLParser.g:4270:6: lv_like_5_0= ruleLike
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getExpressionAccess().getLikeLikeParserRuleCall_1_4_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_like_5_0=ruleLike();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getExpressionRule());
                      						}
                      						set(
                      							current,
                      							"like",
                      							lv_like_5_0,
                      							"org.xtext.example.mydsl_sql.SQL.Like");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;
                case 6 :
                    // InternalSQLParser.g:4288:4: ( (lv_comp_6_0= ruleComparison ) )
                    {
                    // InternalSQLParser.g:4288:4: ( (lv_comp_6_0= ruleComparison ) )
                    // InternalSQLParser.g:4289:5: (lv_comp_6_0= ruleComparison )
                    {
                    // InternalSQLParser.g:4289:5: (lv_comp_6_0= ruleComparison )
                    // InternalSQLParser.g:4290:6: lv_comp_6_0= ruleComparison
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getExpressionAccess().getCompComparisonParserRuleCall_1_5_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_comp_6_0=ruleComparison();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getExpressionRule());
                      						}
                      						set(
                      							current,
                      							"comp",
                      							lv_comp_6_0,
                      							"org.xtext.example.mydsl_sql.SQL.Comparison");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleIsNullValue"
    // InternalSQLParser.g:4312:1: entryRuleIsNullValue returns [String current=null] : iv_ruleIsNullValue= ruleIsNullValue EOF ;
    public final String entryRuleIsNullValue() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleIsNullValue = null;


        try {
            // InternalSQLParser.g:4312:51: (iv_ruleIsNullValue= ruleIsNullValue EOF )
            // InternalSQLParser.g:4313:2: iv_ruleIsNullValue= ruleIsNullValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIsNullValueRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleIsNullValue=ruleIsNullValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIsNullValue.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIsNullValue"


    // $ANTLR start "ruleIsNullValue"
    // InternalSQLParser.g:4319:1: ruleIsNullValue returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= IS (kw= NOT )? kw= NULL ) ;
    public final AntlrDatatypeRuleToken ruleIsNullValue() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalSQLParser.g:4325:2: ( (kw= IS (kw= NOT )? kw= NULL ) )
            // InternalSQLParser.g:4326:2: (kw= IS (kw= NOT )? kw= NULL )
            {
            // InternalSQLParser.g:4326:2: (kw= IS (kw= NOT )? kw= NULL )
            // InternalSQLParser.g:4327:3: kw= IS (kw= NOT )? kw= NULL
            {
            kw=(Token)match(input,IS,FOLLOW_66); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getIsNullValueAccess().getISKeyword_0());
              		
            }
            // InternalSQLParser.g:4332:3: (kw= NOT )?
            int alt86=2;
            int LA86_0 = input.LA(1);

            if ( (LA86_0==NOT) ) {
                alt86=1;
            }
            switch (alt86) {
                case 1 :
                    // InternalSQLParser.g:4333:4: kw= NOT
                    {
                    kw=(Token)match(input,NOT,FOLLOW_67); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getIsNullValueAccess().getNOTKeyword_1());
                      			
                    }

                    }
                    break;

            }

            kw=(Token)match(input,NULL,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getIsNullValueAccess().getNULLKeyword_2());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIsNullValue"


    // $ANTLR start "entryRuleComparison"
    // InternalSQLParser.g:4348:1: entryRuleComparison returns [EObject current=null] : iv_ruleComparison= ruleComparison EOF ;
    public final EObject entryRuleComparison() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComparison = null;


        try {
            // InternalSQLParser.g:4348:51: (iv_ruleComparison= ruleComparison EOF )
            // InternalSQLParser.g:4349:2: iv_ruleComparison= ruleComparison EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getComparisonRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleComparison=ruleComparison();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleComparison; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleComparison"


    // $ANTLR start "ruleComparison"
    // InternalSQLParser.g:4355:1: ruleComparison returns [EObject current=null] : ( ( ( (lv_operator_0_1= GreaterThanSign | lv_operator_0_2= GreaterThanSignEqualsSign | lv_operator_0_3= LessThanSign | lv_operator_0_4= LessThanSignEqualsSign | lv_operator_0_5= EqualsSign | lv_operator_0_6= LessThanSignGreaterThanSign | lv_operator_0_7= ExclamationMarkEqualsSign | lv_operator_0_8= CircumflexAccentEqualsSign ) ) ) ( ( (lv_subOperator_1_1= ANY | lv_subOperator_1_2= ALL | lv_subOperator_1_3= SOME ) ) )? ( (lv_op2_2_0= ruleOperand ) ) ) ;
    public final EObject ruleComparison() throws RecognitionException {
        EObject current = null;

        Token lv_operator_0_1=null;
        Token lv_operator_0_2=null;
        Token lv_operator_0_3=null;
        Token lv_operator_0_4=null;
        Token lv_operator_0_5=null;
        Token lv_operator_0_6=null;
        Token lv_operator_0_7=null;
        Token lv_operator_0_8=null;
        Token lv_subOperator_1_1=null;
        Token lv_subOperator_1_2=null;
        Token lv_subOperator_1_3=null;
        EObject lv_op2_2_0 = null;



        	enterRule();

        try {
            // InternalSQLParser.g:4361:2: ( ( ( ( (lv_operator_0_1= GreaterThanSign | lv_operator_0_2= GreaterThanSignEqualsSign | lv_operator_0_3= LessThanSign | lv_operator_0_4= LessThanSignEqualsSign | lv_operator_0_5= EqualsSign | lv_operator_0_6= LessThanSignGreaterThanSign | lv_operator_0_7= ExclamationMarkEqualsSign | lv_operator_0_8= CircumflexAccentEqualsSign ) ) ) ( ( (lv_subOperator_1_1= ANY | lv_subOperator_1_2= ALL | lv_subOperator_1_3= SOME ) ) )? ( (lv_op2_2_0= ruleOperand ) ) ) )
            // InternalSQLParser.g:4362:2: ( ( ( (lv_operator_0_1= GreaterThanSign | lv_operator_0_2= GreaterThanSignEqualsSign | lv_operator_0_3= LessThanSign | lv_operator_0_4= LessThanSignEqualsSign | lv_operator_0_5= EqualsSign | lv_operator_0_6= LessThanSignGreaterThanSign | lv_operator_0_7= ExclamationMarkEqualsSign | lv_operator_0_8= CircumflexAccentEqualsSign ) ) ) ( ( (lv_subOperator_1_1= ANY | lv_subOperator_1_2= ALL | lv_subOperator_1_3= SOME ) ) )? ( (lv_op2_2_0= ruleOperand ) ) )
            {
            // InternalSQLParser.g:4362:2: ( ( ( (lv_operator_0_1= GreaterThanSign | lv_operator_0_2= GreaterThanSignEqualsSign | lv_operator_0_3= LessThanSign | lv_operator_0_4= LessThanSignEqualsSign | lv_operator_0_5= EqualsSign | lv_operator_0_6= LessThanSignGreaterThanSign | lv_operator_0_7= ExclamationMarkEqualsSign | lv_operator_0_8= CircumflexAccentEqualsSign ) ) ) ( ( (lv_subOperator_1_1= ANY | lv_subOperator_1_2= ALL | lv_subOperator_1_3= SOME ) ) )? ( (lv_op2_2_0= ruleOperand ) ) )
            // InternalSQLParser.g:4363:3: ( ( (lv_operator_0_1= GreaterThanSign | lv_operator_0_2= GreaterThanSignEqualsSign | lv_operator_0_3= LessThanSign | lv_operator_0_4= LessThanSignEqualsSign | lv_operator_0_5= EqualsSign | lv_operator_0_6= LessThanSignGreaterThanSign | lv_operator_0_7= ExclamationMarkEqualsSign | lv_operator_0_8= CircumflexAccentEqualsSign ) ) ) ( ( (lv_subOperator_1_1= ANY | lv_subOperator_1_2= ALL | lv_subOperator_1_3= SOME ) ) )? ( (lv_op2_2_0= ruleOperand ) )
            {
            // InternalSQLParser.g:4363:3: ( ( (lv_operator_0_1= GreaterThanSign | lv_operator_0_2= GreaterThanSignEqualsSign | lv_operator_0_3= LessThanSign | lv_operator_0_4= LessThanSignEqualsSign | lv_operator_0_5= EqualsSign | lv_operator_0_6= LessThanSignGreaterThanSign | lv_operator_0_7= ExclamationMarkEqualsSign | lv_operator_0_8= CircumflexAccentEqualsSign ) ) )
            // InternalSQLParser.g:4364:4: ( (lv_operator_0_1= GreaterThanSign | lv_operator_0_2= GreaterThanSignEqualsSign | lv_operator_0_3= LessThanSign | lv_operator_0_4= LessThanSignEqualsSign | lv_operator_0_5= EqualsSign | lv_operator_0_6= LessThanSignGreaterThanSign | lv_operator_0_7= ExclamationMarkEqualsSign | lv_operator_0_8= CircumflexAccentEqualsSign ) )
            {
            // InternalSQLParser.g:4364:4: ( (lv_operator_0_1= GreaterThanSign | lv_operator_0_2= GreaterThanSignEqualsSign | lv_operator_0_3= LessThanSign | lv_operator_0_4= LessThanSignEqualsSign | lv_operator_0_5= EqualsSign | lv_operator_0_6= LessThanSignGreaterThanSign | lv_operator_0_7= ExclamationMarkEqualsSign | lv_operator_0_8= CircumflexAccentEqualsSign ) )
            // InternalSQLParser.g:4365:5: (lv_operator_0_1= GreaterThanSign | lv_operator_0_2= GreaterThanSignEqualsSign | lv_operator_0_3= LessThanSign | lv_operator_0_4= LessThanSignEqualsSign | lv_operator_0_5= EqualsSign | lv_operator_0_6= LessThanSignGreaterThanSign | lv_operator_0_7= ExclamationMarkEqualsSign | lv_operator_0_8= CircumflexAccentEqualsSign )
            {
            // InternalSQLParser.g:4365:5: (lv_operator_0_1= GreaterThanSign | lv_operator_0_2= GreaterThanSignEqualsSign | lv_operator_0_3= LessThanSign | lv_operator_0_4= LessThanSignEqualsSign | lv_operator_0_5= EqualsSign | lv_operator_0_6= LessThanSignGreaterThanSign | lv_operator_0_7= ExclamationMarkEqualsSign | lv_operator_0_8= CircumflexAccentEqualsSign )
            int alt87=8;
            switch ( input.LA(1) ) {
            case GreaterThanSign:
                {
                alt87=1;
                }
                break;
            case GreaterThanSignEqualsSign:
                {
                alt87=2;
                }
                break;
            case LessThanSign:
                {
                alt87=3;
                }
                break;
            case LessThanSignEqualsSign:
                {
                alt87=4;
                }
                break;
            case EqualsSign:
                {
                alt87=5;
                }
                break;
            case LessThanSignGreaterThanSign:
                {
                alt87=6;
                }
                break;
            case ExclamationMarkEqualsSign:
                {
                alt87=7;
                }
                break;
            case CircumflexAccentEqualsSign:
                {
                alt87=8;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 87, 0, input);

                throw nvae;
            }

            switch (alt87) {
                case 1 :
                    // InternalSQLParser.g:4366:6: lv_operator_0_1= GreaterThanSign
                    {
                    lv_operator_0_1=(Token)match(input,GreaterThanSign,FOLLOW_68); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_operator_0_1, grammarAccess.getComparisonAccess().getOperatorGreaterThanSignKeyword_0_0_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getComparisonRule());
                      						}
                      						setWithLastConsumed(current, "operator", lv_operator_0_1, null);
                      					
                    }

                    }
                    break;
                case 2 :
                    // InternalSQLParser.g:4377:6: lv_operator_0_2= GreaterThanSignEqualsSign
                    {
                    lv_operator_0_2=(Token)match(input,GreaterThanSignEqualsSign,FOLLOW_68); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_operator_0_2, grammarAccess.getComparisonAccess().getOperatorGreaterThanSignEqualsSignKeyword_0_0_1());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getComparisonRule());
                      						}
                      						setWithLastConsumed(current, "operator", lv_operator_0_2, null);
                      					
                    }

                    }
                    break;
                case 3 :
                    // InternalSQLParser.g:4388:6: lv_operator_0_3= LessThanSign
                    {
                    lv_operator_0_3=(Token)match(input,LessThanSign,FOLLOW_68); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_operator_0_3, grammarAccess.getComparisonAccess().getOperatorLessThanSignKeyword_0_0_2());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getComparisonRule());
                      						}
                      						setWithLastConsumed(current, "operator", lv_operator_0_3, null);
                      					
                    }

                    }
                    break;
                case 4 :
                    // InternalSQLParser.g:4399:6: lv_operator_0_4= LessThanSignEqualsSign
                    {
                    lv_operator_0_4=(Token)match(input,LessThanSignEqualsSign,FOLLOW_68); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_operator_0_4, grammarAccess.getComparisonAccess().getOperatorLessThanSignEqualsSignKeyword_0_0_3());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getComparisonRule());
                      						}
                      						setWithLastConsumed(current, "operator", lv_operator_0_4, null);
                      					
                    }

                    }
                    break;
                case 5 :
                    // InternalSQLParser.g:4410:6: lv_operator_0_5= EqualsSign
                    {
                    lv_operator_0_5=(Token)match(input,EqualsSign,FOLLOW_68); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_operator_0_5, grammarAccess.getComparisonAccess().getOperatorEqualsSignKeyword_0_0_4());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getComparisonRule());
                      						}
                      						setWithLastConsumed(current, "operator", lv_operator_0_5, null);
                      					
                    }

                    }
                    break;
                case 6 :
                    // InternalSQLParser.g:4421:6: lv_operator_0_6= LessThanSignGreaterThanSign
                    {
                    lv_operator_0_6=(Token)match(input,LessThanSignGreaterThanSign,FOLLOW_68); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_operator_0_6, grammarAccess.getComparisonAccess().getOperatorLessThanSignGreaterThanSignKeyword_0_0_5());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getComparisonRule());
                      						}
                      						setWithLastConsumed(current, "operator", lv_operator_0_6, null);
                      					
                    }

                    }
                    break;
                case 7 :
                    // InternalSQLParser.g:4432:6: lv_operator_0_7= ExclamationMarkEqualsSign
                    {
                    lv_operator_0_7=(Token)match(input,ExclamationMarkEqualsSign,FOLLOW_68); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_operator_0_7, grammarAccess.getComparisonAccess().getOperatorExclamationMarkEqualsSignKeyword_0_0_6());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getComparisonRule());
                      						}
                      						setWithLastConsumed(current, "operator", lv_operator_0_7, null);
                      					
                    }

                    }
                    break;
                case 8 :
                    // InternalSQLParser.g:4443:6: lv_operator_0_8= CircumflexAccentEqualsSign
                    {
                    lv_operator_0_8=(Token)match(input,CircumflexAccentEqualsSign,FOLLOW_68); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_operator_0_8, grammarAccess.getComparisonAccess().getOperatorCircumflexAccentEqualsSignKeyword_0_0_7());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getComparisonRule());
                      						}
                      						setWithLastConsumed(current, "operator", lv_operator_0_8, null);
                      					
                    }

                    }
                    break;

            }


            }


            }

            // InternalSQLParser.g:4456:3: ( ( (lv_subOperator_1_1= ANY | lv_subOperator_1_2= ALL | lv_subOperator_1_3= SOME ) ) )?
            int alt89=2;
            int LA89_0 = input.LA(1);

            if ( (LA89_0==SOME||LA89_0==ALL||LA89_0==ANY) ) {
                alt89=1;
            }
            switch (alt89) {
                case 1 :
                    // InternalSQLParser.g:4457:4: ( (lv_subOperator_1_1= ANY | lv_subOperator_1_2= ALL | lv_subOperator_1_3= SOME ) )
                    {
                    // InternalSQLParser.g:4457:4: ( (lv_subOperator_1_1= ANY | lv_subOperator_1_2= ALL | lv_subOperator_1_3= SOME ) )
                    // InternalSQLParser.g:4458:5: (lv_subOperator_1_1= ANY | lv_subOperator_1_2= ALL | lv_subOperator_1_3= SOME )
                    {
                    // InternalSQLParser.g:4458:5: (lv_subOperator_1_1= ANY | lv_subOperator_1_2= ALL | lv_subOperator_1_3= SOME )
                    int alt88=3;
                    switch ( input.LA(1) ) {
                    case ANY:
                        {
                        alt88=1;
                        }
                        break;
                    case ALL:
                        {
                        alt88=2;
                        }
                        break;
                    case SOME:
                        {
                        alt88=3;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 88, 0, input);

                        throw nvae;
                    }

                    switch (alt88) {
                        case 1 :
                            // InternalSQLParser.g:4459:6: lv_subOperator_1_1= ANY
                            {
                            lv_subOperator_1_1=(Token)match(input,ANY,FOLLOW_60); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(lv_subOperator_1_1, grammarAccess.getComparisonAccess().getSubOperatorANYKeyword_1_0_0());
                              					
                            }
                            if ( state.backtracking==0 ) {

                              						if (current==null) {
                              							current = createModelElement(grammarAccess.getComparisonRule());
                              						}
                              						setWithLastConsumed(current, "subOperator", lv_subOperator_1_1, null);
                              					
                            }

                            }
                            break;
                        case 2 :
                            // InternalSQLParser.g:4470:6: lv_subOperator_1_2= ALL
                            {
                            lv_subOperator_1_2=(Token)match(input,ALL,FOLLOW_60); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(lv_subOperator_1_2, grammarAccess.getComparisonAccess().getSubOperatorALLKeyword_1_0_1());
                              					
                            }
                            if ( state.backtracking==0 ) {

                              						if (current==null) {
                              							current = createModelElement(grammarAccess.getComparisonRule());
                              						}
                              						setWithLastConsumed(current, "subOperator", lv_subOperator_1_2, null);
                              					
                            }

                            }
                            break;
                        case 3 :
                            // InternalSQLParser.g:4481:6: lv_subOperator_1_3= SOME
                            {
                            lv_subOperator_1_3=(Token)match(input,SOME,FOLLOW_60); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(lv_subOperator_1_3, grammarAccess.getComparisonAccess().getSubOperatorSOMEKeyword_1_0_2());
                              					
                            }
                            if ( state.backtracking==0 ) {

                              						if (current==null) {
                              							current = createModelElement(grammarAccess.getComparisonRule());
                              						}
                              						setWithLastConsumed(current, "subOperator", lv_subOperator_1_3, null);
                              					
                            }

                            }
                            break;

                    }


                    }


                    }
                    break;

            }

            // InternalSQLParser.g:4494:3: ( (lv_op2_2_0= ruleOperand ) )
            // InternalSQLParser.g:4495:4: (lv_op2_2_0= ruleOperand )
            {
            // InternalSQLParser.g:4495:4: (lv_op2_2_0= ruleOperand )
            // InternalSQLParser.g:4496:5: lv_op2_2_0= ruleOperand
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getComparisonAccess().getOp2OperandParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_op2_2_0=ruleOperand();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getComparisonRule());
              					}
              					set(
              						current,
              						"op2",
              						lv_op2_2_0,
              						"org.xtext.example.mydsl_sql.SQL.Operand");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleComparison"


    // $ANTLR start "entryRuleLike"
    // InternalSQLParser.g:4517:1: entryRuleLike returns [EObject current=null] : iv_ruleLike= ruleLike EOF ;
    public final EObject entryRuleLike() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLike = null;


        try {
            // InternalSQLParser.g:4517:45: (iv_ruleLike= ruleLike EOF )
            // InternalSQLParser.g:4518:2: iv_ruleLike= ruleLike EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLikeRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleLike=ruleLike();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLike; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLike"


    // $ANTLR start "ruleLike"
    // InternalSQLParser.g:4524:1: ruleLike returns [EObject current=null] : ( ( (lv_opLike_0_0= ruleLikeValue ) ) ( (lv_op2_1_0= ruleLikeOperand ) ) ) ;
    public final EObject ruleLike() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_opLike_0_0 = null;

        EObject lv_op2_1_0 = null;



        	enterRule();

        try {
            // InternalSQLParser.g:4530:2: ( ( ( (lv_opLike_0_0= ruleLikeValue ) ) ( (lv_op2_1_0= ruleLikeOperand ) ) ) )
            // InternalSQLParser.g:4531:2: ( ( (lv_opLike_0_0= ruleLikeValue ) ) ( (lv_op2_1_0= ruleLikeOperand ) ) )
            {
            // InternalSQLParser.g:4531:2: ( ( (lv_opLike_0_0= ruleLikeValue ) ) ( (lv_op2_1_0= ruleLikeOperand ) ) )
            // InternalSQLParser.g:4532:3: ( (lv_opLike_0_0= ruleLikeValue ) ) ( (lv_op2_1_0= ruleLikeOperand ) )
            {
            // InternalSQLParser.g:4532:3: ( (lv_opLike_0_0= ruleLikeValue ) )
            // InternalSQLParser.g:4533:4: (lv_opLike_0_0= ruleLikeValue )
            {
            // InternalSQLParser.g:4533:4: (lv_opLike_0_0= ruleLikeValue )
            // InternalSQLParser.g:4534:5: lv_opLike_0_0= ruleLikeValue
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getLikeAccess().getOpLikeLikeValueParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_69);
            lv_opLike_0_0=ruleLikeValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getLikeRule());
              					}
              					set(
              						current,
              						"opLike",
              						lv_opLike_0_0,
              						"org.xtext.example.mydsl_sql.SQL.LikeValue");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalSQLParser.g:4551:3: ( (lv_op2_1_0= ruleLikeOperand ) )
            // InternalSQLParser.g:4552:4: (lv_op2_1_0= ruleLikeOperand )
            {
            // InternalSQLParser.g:4552:4: (lv_op2_1_0= ruleLikeOperand )
            // InternalSQLParser.g:4553:5: lv_op2_1_0= ruleLikeOperand
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getLikeAccess().getOp2LikeOperandParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_op2_1_0=ruleLikeOperand();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getLikeRule());
              					}
              					set(
              						current,
              						"op2",
              						lv_op2_1_0,
              						"org.xtext.example.mydsl_sql.SQL.LikeOperand");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLike"


    // $ANTLR start "entryRuleLikeValue"
    // InternalSQLParser.g:4574:1: entryRuleLikeValue returns [String current=null] : iv_ruleLikeValue= ruleLikeValue EOF ;
    public final String entryRuleLikeValue() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleLikeValue = null;


        try {
            // InternalSQLParser.g:4574:49: (iv_ruleLikeValue= ruleLikeValue EOF )
            // InternalSQLParser.g:4575:2: iv_ruleLikeValue= ruleLikeValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLikeValueRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleLikeValue=ruleLikeValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLikeValue.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLikeValue"


    // $ANTLR start "ruleLikeValue"
    // InternalSQLParser.g:4581:1: ruleLikeValue returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= NOT )? kw= LIKE ) ;
    public final AntlrDatatypeRuleToken ruleLikeValue() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalSQLParser.g:4587:2: ( ( (kw= NOT )? kw= LIKE ) )
            // InternalSQLParser.g:4588:2: ( (kw= NOT )? kw= LIKE )
            {
            // InternalSQLParser.g:4588:2: ( (kw= NOT )? kw= LIKE )
            // InternalSQLParser.g:4589:3: (kw= NOT )? kw= LIKE
            {
            // InternalSQLParser.g:4589:3: (kw= NOT )?
            int alt90=2;
            int LA90_0 = input.LA(1);

            if ( (LA90_0==NOT) ) {
                alt90=1;
            }
            switch (alt90) {
                case 1 :
                    // InternalSQLParser.g:4590:4: kw= NOT
                    {
                    kw=(Token)match(input,NOT,FOLLOW_70); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getLikeValueAccess().getNOTKeyword_0());
                      			
                    }

                    }
                    break;

            }

            kw=(Token)match(input,LIKE,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getLikeValueAccess().getLIKEKeyword_1());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLikeValue"


    // $ANTLR start "entryRuleLikeOperand"
    // InternalSQLParser.g:4605:1: entryRuleLikeOperand returns [EObject current=null] : iv_ruleLikeOperand= ruleLikeOperand EOF ;
    public final EObject entryRuleLikeOperand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLikeOperand = null;


        try {
            // InternalSQLParser.g:4605:52: (iv_ruleLikeOperand= ruleLikeOperand EOF )
            // InternalSQLParser.g:4606:2: iv_ruleLikeOperand= ruleLikeOperand EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLikeOperandRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleLikeOperand=ruleLikeOperand();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLikeOperand; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLikeOperand"


    // $ANTLR start "ruleLikeOperand"
    // InternalSQLParser.g:4612:1: ruleLikeOperand returns [EObject current=null] : ( ( (lv_op2_0_0= ruleStringOperand ) ) | ( (lv_fop2_1_0= ruleOperandFunction ) ) | ( (lv_fcast_2_0= ruleOpFunctionCast ) ) | ( (lv_fparam_3_0= ruleParameterOperand ) ) ) ;
    public final EObject ruleLikeOperand() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_op2_0_0 = null;

        EObject lv_fop2_1_0 = null;

        EObject lv_fcast_2_0 = null;

        EObject lv_fparam_3_0 = null;



        	enterRule();

        try {
            // InternalSQLParser.g:4618:2: ( ( ( (lv_op2_0_0= ruleStringOperand ) ) | ( (lv_fop2_1_0= ruleOperandFunction ) ) | ( (lv_fcast_2_0= ruleOpFunctionCast ) ) | ( (lv_fparam_3_0= ruleParameterOperand ) ) ) )
            // InternalSQLParser.g:4619:2: ( ( (lv_op2_0_0= ruleStringOperand ) ) | ( (lv_fop2_1_0= ruleOperandFunction ) ) | ( (lv_fcast_2_0= ruleOpFunctionCast ) ) | ( (lv_fparam_3_0= ruleParameterOperand ) ) )
            {
            // InternalSQLParser.g:4619:2: ( ( (lv_op2_0_0= ruleStringOperand ) ) | ( (lv_fop2_1_0= ruleOperandFunction ) ) | ( (lv_fcast_2_0= ruleOpFunctionCast ) ) | ( (lv_fparam_3_0= ruleParameterOperand ) ) )
            int alt91=4;
            switch ( input.LA(1) ) {
            case RULE_STRING_:
                {
                alt91=1;
                }
                break;
            case RULE_ID:
                {
                alt91=2;
                }
                break;
            case CAST:
                {
                alt91=3;
                }
                break;
            case RULE_JRPARAM:
                {
                alt91=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 91, 0, input);

                throw nvae;
            }

            switch (alt91) {
                case 1 :
                    // InternalSQLParser.g:4620:3: ( (lv_op2_0_0= ruleStringOperand ) )
                    {
                    // InternalSQLParser.g:4620:3: ( (lv_op2_0_0= ruleStringOperand ) )
                    // InternalSQLParser.g:4621:4: (lv_op2_0_0= ruleStringOperand )
                    {
                    // InternalSQLParser.g:4621:4: (lv_op2_0_0= ruleStringOperand )
                    // InternalSQLParser.g:4622:5: lv_op2_0_0= ruleStringOperand
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getLikeOperandAccess().getOp2StringOperandParserRuleCall_0_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_op2_0_0=ruleStringOperand();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getLikeOperandRule());
                      					}
                      					set(
                      						current,
                      						"op2",
                      						lv_op2_0_0,
                      						"org.xtext.example.mydsl_sql.SQL.StringOperand");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalSQLParser.g:4640:3: ( (lv_fop2_1_0= ruleOperandFunction ) )
                    {
                    // InternalSQLParser.g:4640:3: ( (lv_fop2_1_0= ruleOperandFunction ) )
                    // InternalSQLParser.g:4641:4: (lv_fop2_1_0= ruleOperandFunction )
                    {
                    // InternalSQLParser.g:4641:4: (lv_fop2_1_0= ruleOperandFunction )
                    // InternalSQLParser.g:4642:5: lv_fop2_1_0= ruleOperandFunction
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getLikeOperandAccess().getFop2OperandFunctionParserRuleCall_1_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_fop2_1_0=ruleOperandFunction();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getLikeOperandRule());
                      					}
                      					set(
                      						current,
                      						"fop2",
                      						lv_fop2_1_0,
                      						"org.xtext.example.mydsl_sql.SQL.OperandFunction");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalSQLParser.g:4660:3: ( (lv_fcast_2_0= ruleOpFunctionCast ) )
                    {
                    // InternalSQLParser.g:4660:3: ( (lv_fcast_2_0= ruleOpFunctionCast ) )
                    // InternalSQLParser.g:4661:4: (lv_fcast_2_0= ruleOpFunctionCast )
                    {
                    // InternalSQLParser.g:4661:4: (lv_fcast_2_0= ruleOpFunctionCast )
                    // InternalSQLParser.g:4662:5: lv_fcast_2_0= ruleOpFunctionCast
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getLikeOperandAccess().getFcastOpFunctionCastParserRuleCall_2_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_fcast_2_0=ruleOpFunctionCast();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getLikeOperandRule());
                      					}
                      					set(
                      						current,
                      						"fcast",
                      						lv_fcast_2_0,
                      						"org.xtext.example.mydsl_sql.SQL.OpFunctionCast");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalSQLParser.g:4680:3: ( (lv_fparam_3_0= ruleParameterOperand ) )
                    {
                    // InternalSQLParser.g:4680:3: ( (lv_fparam_3_0= ruleParameterOperand ) )
                    // InternalSQLParser.g:4681:4: (lv_fparam_3_0= ruleParameterOperand )
                    {
                    // InternalSQLParser.g:4681:4: (lv_fparam_3_0= ruleParameterOperand )
                    // InternalSQLParser.g:4682:5: lv_fparam_3_0= ruleParameterOperand
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getLikeOperandAccess().getFparamParameterOperandParserRuleCall_3_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_fparam_3_0=ruleParameterOperand();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getLikeOperandRule());
                      					}
                      					set(
                      						current,
                      						"fparam",
                      						lv_fparam_3_0,
                      						"org.xtext.example.mydsl_sql.SQL.ParameterOperand");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLikeOperand"


    // $ANTLR start "entryRuleBetween"
    // InternalSQLParser.g:4703:1: entryRuleBetween returns [EObject current=null] : iv_ruleBetween= ruleBetween EOF ;
    public final EObject entryRuleBetween() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBetween = null;


        try {
            // InternalSQLParser.g:4703:48: (iv_ruleBetween= ruleBetween EOF )
            // InternalSQLParser.g:4704:2: iv_ruleBetween= ruleBetween EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBetweenRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleBetween=ruleBetween();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBetween; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBetween"


    // $ANTLR start "ruleBetween"
    // InternalSQLParser.g:4710:1: ruleBetween returns [EObject current=null] : ( ( (lv_opBetween_0_0= ruleBetweenValue ) ) ( (lv_op2_1_0= ruleOperandGroup ) ) otherlv_2= AND ( (lv_op3_3_0= ruleOperandGroup ) ) ) ;
    public final EObject ruleBetween() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_opBetween_0_0 = null;

        EObject lv_op2_1_0 = null;

        EObject lv_op3_3_0 = null;



        	enterRule();

        try {
            // InternalSQLParser.g:4716:2: ( ( ( (lv_opBetween_0_0= ruleBetweenValue ) ) ( (lv_op2_1_0= ruleOperandGroup ) ) otherlv_2= AND ( (lv_op3_3_0= ruleOperandGroup ) ) ) )
            // InternalSQLParser.g:4717:2: ( ( (lv_opBetween_0_0= ruleBetweenValue ) ) ( (lv_op2_1_0= ruleOperandGroup ) ) otherlv_2= AND ( (lv_op3_3_0= ruleOperandGroup ) ) )
            {
            // InternalSQLParser.g:4717:2: ( ( (lv_opBetween_0_0= ruleBetweenValue ) ) ( (lv_op2_1_0= ruleOperandGroup ) ) otherlv_2= AND ( (lv_op3_3_0= ruleOperandGroup ) ) )
            // InternalSQLParser.g:4718:3: ( (lv_opBetween_0_0= ruleBetweenValue ) ) ( (lv_op2_1_0= ruleOperandGroup ) ) otherlv_2= AND ( (lv_op3_3_0= ruleOperandGroup ) )
            {
            // InternalSQLParser.g:4718:3: ( (lv_opBetween_0_0= ruleBetweenValue ) )
            // InternalSQLParser.g:4719:4: (lv_opBetween_0_0= ruleBetweenValue )
            {
            // InternalSQLParser.g:4719:4: (lv_opBetween_0_0= ruleBetweenValue )
            // InternalSQLParser.g:4720:5: lv_opBetween_0_0= ruleBetweenValue
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getBetweenAccess().getOpBetweenBetweenValueParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_60);
            lv_opBetween_0_0=ruleBetweenValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getBetweenRule());
              					}
              					set(
              						current,
              						"opBetween",
              						lv_opBetween_0_0,
              						"org.xtext.example.mydsl_sql.SQL.BetweenValue");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalSQLParser.g:4737:3: ( (lv_op2_1_0= ruleOperandGroup ) )
            // InternalSQLParser.g:4738:4: (lv_op2_1_0= ruleOperandGroup )
            {
            // InternalSQLParser.g:4738:4: (lv_op2_1_0= ruleOperandGroup )
            // InternalSQLParser.g:4739:5: lv_op2_1_0= ruleOperandGroup
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getBetweenAccess().getOp2OperandGroupParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_71);
            lv_op2_1_0=ruleOperandGroup();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getBetweenRule());
              					}
              					set(
              						current,
              						"op2",
              						lv_op2_1_0,
              						"org.xtext.example.mydsl_sql.SQL.OperandGroup");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_2=(Token)match(input,AND,FOLLOW_60); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getBetweenAccess().getANDKeyword_2());
              		
            }
            // InternalSQLParser.g:4760:3: ( (lv_op3_3_0= ruleOperandGroup ) )
            // InternalSQLParser.g:4761:4: (lv_op3_3_0= ruleOperandGroup )
            {
            // InternalSQLParser.g:4761:4: (lv_op3_3_0= ruleOperandGroup )
            // InternalSQLParser.g:4762:5: lv_op3_3_0= ruleOperandGroup
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getBetweenAccess().getOp3OperandGroupParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_op3_3_0=ruleOperandGroup();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getBetweenRule());
              					}
              					set(
              						current,
              						"op3",
              						lv_op3_3_0,
              						"org.xtext.example.mydsl_sql.SQL.OperandGroup");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBetween"


    // $ANTLR start "entryRuleBetweenValue"
    // InternalSQLParser.g:4783:1: entryRuleBetweenValue returns [String current=null] : iv_ruleBetweenValue= ruleBetweenValue EOF ;
    public final String entryRuleBetweenValue() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBetweenValue = null;


        try {
            // InternalSQLParser.g:4783:52: (iv_ruleBetweenValue= ruleBetweenValue EOF )
            // InternalSQLParser.g:4784:2: iv_ruleBetweenValue= ruleBetweenValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBetweenValueRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleBetweenValue=ruleBetweenValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBetweenValue.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBetweenValue"


    // $ANTLR start "ruleBetweenValue"
    // InternalSQLParser.g:4790:1: ruleBetweenValue returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= NOT )? kw= BETWEEN ) ;
    public final AntlrDatatypeRuleToken ruleBetweenValue() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalSQLParser.g:4796:2: ( ( (kw= NOT )? kw= BETWEEN ) )
            // InternalSQLParser.g:4797:2: ( (kw= NOT )? kw= BETWEEN )
            {
            // InternalSQLParser.g:4797:2: ( (kw= NOT )? kw= BETWEEN )
            // InternalSQLParser.g:4798:3: (kw= NOT )? kw= BETWEEN
            {
            // InternalSQLParser.g:4798:3: (kw= NOT )?
            int alt92=2;
            int LA92_0 = input.LA(1);

            if ( (LA92_0==NOT) ) {
                alt92=1;
            }
            switch (alt92) {
                case 1 :
                    // InternalSQLParser.g:4799:4: kw= NOT
                    {
                    kw=(Token)match(input,NOT,FOLLOW_72); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getBetweenValueAccess().getNOTKeyword_0());
                      			
                    }

                    }
                    break;

            }

            kw=(Token)match(input,BETWEEN,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getBetweenValueAccess().getBETWEENKeyword_1());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBetweenValue"


    // $ANTLR start "entryRuleInOperator"
    // InternalSQLParser.g:4814:1: entryRuleInOperator returns [EObject current=null] : iv_ruleInOperator= ruleInOperator EOF ;
    public final EObject entryRuleInOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInOperator = null;


        try {
            // InternalSQLParser.g:4814:51: (iv_ruleInOperator= ruleInOperator EOF )
            // InternalSQLParser.g:4815:2: iv_ruleInOperator= ruleInOperator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInOperatorRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleInOperator=ruleInOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInOperator; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInOperator"


    // $ANTLR start "ruleInOperator"
    // InternalSQLParser.g:4821:1: ruleInOperator returns [EObject current=null] : ( () ( (lv_op_1_0= ruleInValue ) ) ( ( (lv_subquery_2_0= ruleSubQueryOperand ) ) | ( (lv_opList_3_0= ruleOperandListGroup ) ) ) ) ;
    public final EObject ruleInOperator() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_op_1_0 = null;

        EObject lv_subquery_2_0 = null;

        EObject lv_opList_3_0 = null;



        	enterRule();

        try {
            // InternalSQLParser.g:4827:2: ( ( () ( (lv_op_1_0= ruleInValue ) ) ( ( (lv_subquery_2_0= ruleSubQueryOperand ) ) | ( (lv_opList_3_0= ruleOperandListGroup ) ) ) ) )
            // InternalSQLParser.g:4828:2: ( () ( (lv_op_1_0= ruleInValue ) ) ( ( (lv_subquery_2_0= ruleSubQueryOperand ) ) | ( (lv_opList_3_0= ruleOperandListGroup ) ) ) )
            {
            // InternalSQLParser.g:4828:2: ( () ( (lv_op_1_0= ruleInValue ) ) ( ( (lv_subquery_2_0= ruleSubQueryOperand ) ) | ( (lv_opList_3_0= ruleOperandListGroup ) ) ) )
            // InternalSQLParser.g:4829:3: () ( (lv_op_1_0= ruleInValue ) ) ( ( (lv_subquery_2_0= ruleSubQueryOperand ) ) | ( (lv_opList_3_0= ruleOperandListGroup ) ) )
            {
            // InternalSQLParser.g:4829:3: ()
            // InternalSQLParser.g:4830:4: 
            {
            if ( state.backtracking==0 ) {

              				/* */
              			
            }
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getInOperatorAccess().getInOperAction_0(),
              					current);
              			
            }

            }

            // InternalSQLParser.g:4839:3: ( (lv_op_1_0= ruleInValue ) )
            // InternalSQLParser.g:4840:4: (lv_op_1_0= ruleInValue )
            {
            // InternalSQLParser.g:4840:4: (lv_op_1_0= ruleInValue )
            // InternalSQLParser.g:4841:5: lv_op_1_0= ruleInValue
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getInOperatorAccess().getOpInValueParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_7);
            lv_op_1_0=ruleInValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getInOperatorRule());
              					}
              					set(
              						current,
              						"op",
              						lv_op_1_0,
              						"org.xtext.example.mydsl_sql.SQL.InValue");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalSQLParser.g:4858:3: ( ( (lv_subquery_2_0= ruleSubQueryOperand ) ) | ( (lv_opList_3_0= ruleOperandListGroup ) ) )
            int alt93=2;
            int LA93_0 = input.LA(1);

            if ( (LA93_0==LeftParenthesis) ) {
                int LA93_1 = input.LA(2);

                if ( (LA93_1==SELECT) ) {
                    alt93=1;
                }
                else if ( ((LA93_1>=RULE_SIGNED_DOUBLE && LA93_1<=RULE_TIMESTAMP)||LA93_1==RULE_STRING_) ) {
                    alt93=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 93, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 93, 0, input);

                throw nvae;
            }
            switch (alt93) {
                case 1 :
                    // InternalSQLParser.g:4859:4: ( (lv_subquery_2_0= ruleSubQueryOperand ) )
                    {
                    // InternalSQLParser.g:4859:4: ( (lv_subquery_2_0= ruleSubQueryOperand ) )
                    // InternalSQLParser.g:4860:5: (lv_subquery_2_0= ruleSubQueryOperand )
                    {
                    // InternalSQLParser.g:4860:5: (lv_subquery_2_0= ruleSubQueryOperand )
                    // InternalSQLParser.g:4861:6: lv_subquery_2_0= ruleSubQueryOperand
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getInOperatorAccess().getSubquerySubQueryOperandParserRuleCall_2_0_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_subquery_2_0=ruleSubQueryOperand();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getInOperatorRule());
                      						}
                      						set(
                      							current,
                      							"subquery",
                      							lv_subquery_2_0,
                      							"org.xtext.example.mydsl_sql.SQL.SubQueryOperand");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalSQLParser.g:4879:4: ( (lv_opList_3_0= ruleOperandListGroup ) )
                    {
                    // InternalSQLParser.g:4879:4: ( (lv_opList_3_0= ruleOperandListGroup ) )
                    // InternalSQLParser.g:4880:5: (lv_opList_3_0= ruleOperandListGroup )
                    {
                    // InternalSQLParser.g:4880:5: (lv_opList_3_0= ruleOperandListGroup )
                    // InternalSQLParser.g:4881:6: lv_opList_3_0= ruleOperandListGroup
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getInOperatorAccess().getOpListOperandListGroupParserRuleCall_2_1_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_opList_3_0=ruleOperandListGroup();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getInOperatorRule());
                      						}
                      						set(
                      							current,
                      							"opList",
                      							lv_opList_3_0,
                      							"org.xtext.example.mydsl_sql.SQL.OperandListGroup");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInOperator"


    // $ANTLR start "entryRuleInValue"
    // InternalSQLParser.g:4903:1: entryRuleInValue returns [String current=null] : iv_ruleInValue= ruleInValue EOF ;
    public final String entryRuleInValue() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleInValue = null;


        try {
            // InternalSQLParser.g:4903:47: (iv_ruleInValue= ruleInValue EOF )
            // InternalSQLParser.g:4904:2: iv_ruleInValue= ruleInValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInValueRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleInValue=ruleInValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInValue.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInValue"


    // $ANTLR start "ruleInValue"
    // InternalSQLParser.g:4910:1: ruleInValue returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= NOT )? kw= IN ) ;
    public final AntlrDatatypeRuleToken ruleInValue() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalSQLParser.g:4916:2: ( ( (kw= NOT )? kw= IN ) )
            // InternalSQLParser.g:4917:2: ( (kw= NOT )? kw= IN )
            {
            // InternalSQLParser.g:4917:2: ( (kw= NOT )? kw= IN )
            // InternalSQLParser.g:4918:3: (kw= NOT )? kw= IN
            {
            // InternalSQLParser.g:4918:3: (kw= NOT )?
            int alt94=2;
            int LA94_0 = input.LA(1);

            if ( (LA94_0==NOT) ) {
                alt94=1;
            }
            switch (alt94) {
                case 1 :
                    // InternalSQLParser.g:4919:4: kw= NOT
                    {
                    kw=(Token)match(input,NOT,FOLLOW_48); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getInValueAccess().getNOTKeyword_0());
                      			
                    }

                    }
                    break;

            }

            kw=(Token)match(input,IN,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getInValueAccess().getINKeyword_1());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInValue"


    // $ANTLR start "entryRuleExistsOperator"
    // InternalSQLParser.g:4934:1: entryRuleExistsOperator returns [EObject current=null] : iv_ruleExistsOperator= ruleExistsOperator EOF ;
    public final EObject entryRuleExistsOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExistsOperator = null;


        try {
            // InternalSQLParser.g:4934:55: (iv_ruleExistsOperator= ruleExistsOperator EOF )
            // InternalSQLParser.g:4935:2: iv_ruleExistsOperator= ruleExistsOperator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExistsOperatorRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleExistsOperator=ruleExistsOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExistsOperator; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExistsOperator"


    // $ANTLR start "ruleExistsOperator"
    // InternalSQLParser.g:4941:1: ruleExistsOperator returns [EObject current=null] : ( () ( (lv_op_1_0= ruleExistsValue ) ) ( ( (lv_subquery_2_0= ruleSubQueryOperand ) ) | ( (lv_opList_3_0= ruleOperandListGroup ) ) ) ) ;
    public final EObject ruleExistsOperator() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_op_1_0 = null;

        EObject lv_subquery_2_0 = null;

        EObject lv_opList_3_0 = null;



        	enterRule();

        try {
            // InternalSQLParser.g:4947:2: ( ( () ( (lv_op_1_0= ruleExistsValue ) ) ( ( (lv_subquery_2_0= ruleSubQueryOperand ) ) | ( (lv_opList_3_0= ruleOperandListGroup ) ) ) ) )
            // InternalSQLParser.g:4948:2: ( () ( (lv_op_1_0= ruleExistsValue ) ) ( ( (lv_subquery_2_0= ruleSubQueryOperand ) ) | ( (lv_opList_3_0= ruleOperandListGroup ) ) ) )
            {
            // InternalSQLParser.g:4948:2: ( () ( (lv_op_1_0= ruleExistsValue ) ) ( ( (lv_subquery_2_0= ruleSubQueryOperand ) ) | ( (lv_opList_3_0= ruleOperandListGroup ) ) ) )
            // InternalSQLParser.g:4949:3: () ( (lv_op_1_0= ruleExistsValue ) ) ( ( (lv_subquery_2_0= ruleSubQueryOperand ) ) | ( (lv_opList_3_0= ruleOperandListGroup ) ) )
            {
            // InternalSQLParser.g:4949:3: ()
            // InternalSQLParser.g:4950:4: 
            {
            if ( state.backtracking==0 ) {

              				/* */
              			
            }
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getExistsOperatorAccess().getExistsOperAction_0(),
              					current);
              			
            }

            }

            // InternalSQLParser.g:4959:3: ( (lv_op_1_0= ruleExistsValue ) )
            // InternalSQLParser.g:4960:4: (lv_op_1_0= ruleExistsValue )
            {
            // InternalSQLParser.g:4960:4: (lv_op_1_0= ruleExistsValue )
            // InternalSQLParser.g:4961:5: lv_op_1_0= ruleExistsValue
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getExistsOperatorAccess().getOpExistsValueParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_7);
            lv_op_1_0=ruleExistsValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getExistsOperatorRule());
              					}
              					set(
              						current,
              						"op",
              						lv_op_1_0,
              						"org.xtext.example.mydsl_sql.SQL.ExistsValue");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalSQLParser.g:4978:3: ( ( (lv_subquery_2_0= ruleSubQueryOperand ) ) | ( (lv_opList_3_0= ruleOperandListGroup ) ) )
            int alt95=2;
            int LA95_0 = input.LA(1);

            if ( (LA95_0==LeftParenthesis) ) {
                int LA95_1 = input.LA(2);

                if ( (LA95_1==SELECT) ) {
                    alt95=1;
                }
                else if ( ((LA95_1>=RULE_SIGNED_DOUBLE && LA95_1<=RULE_TIMESTAMP)||LA95_1==RULE_STRING_) ) {
                    alt95=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 95, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 95, 0, input);

                throw nvae;
            }
            switch (alt95) {
                case 1 :
                    // InternalSQLParser.g:4979:4: ( (lv_subquery_2_0= ruleSubQueryOperand ) )
                    {
                    // InternalSQLParser.g:4979:4: ( (lv_subquery_2_0= ruleSubQueryOperand ) )
                    // InternalSQLParser.g:4980:5: (lv_subquery_2_0= ruleSubQueryOperand )
                    {
                    // InternalSQLParser.g:4980:5: (lv_subquery_2_0= ruleSubQueryOperand )
                    // InternalSQLParser.g:4981:6: lv_subquery_2_0= ruleSubQueryOperand
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getExistsOperatorAccess().getSubquerySubQueryOperandParserRuleCall_2_0_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_subquery_2_0=ruleSubQueryOperand();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getExistsOperatorRule());
                      						}
                      						set(
                      							current,
                      							"subquery",
                      							lv_subquery_2_0,
                      							"org.xtext.example.mydsl_sql.SQL.SubQueryOperand");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalSQLParser.g:4999:4: ( (lv_opList_3_0= ruleOperandListGroup ) )
                    {
                    // InternalSQLParser.g:4999:4: ( (lv_opList_3_0= ruleOperandListGroup ) )
                    // InternalSQLParser.g:5000:5: (lv_opList_3_0= ruleOperandListGroup )
                    {
                    // InternalSQLParser.g:5000:5: (lv_opList_3_0= ruleOperandListGroup )
                    // InternalSQLParser.g:5001:6: lv_opList_3_0= ruleOperandListGroup
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getExistsOperatorAccess().getOpListOperandListGroupParserRuleCall_2_1_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_opList_3_0=ruleOperandListGroup();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getExistsOperatorRule());
                      						}
                      						set(
                      							current,
                      							"opList",
                      							lv_opList_3_0,
                      							"org.xtext.example.mydsl_sql.SQL.OperandListGroup");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExistsOperator"


    // $ANTLR start "entryRuleExistsValue"
    // InternalSQLParser.g:5023:1: entryRuleExistsValue returns [String current=null] : iv_ruleExistsValue= ruleExistsValue EOF ;
    public final String entryRuleExistsValue() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleExistsValue = null;


        try {
            // InternalSQLParser.g:5023:51: (iv_ruleExistsValue= ruleExistsValue EOF )
            // InternalSQLParser.g:5024:2: iv_ruleExistsValue= ruleExistsValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExistsValueRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleExistsValue=ruleExistsValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExistsValue.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExistsValue"


    // $ANTLR start "ruleExistsValue"
    // InternalSQLParser.g:5030:1: ruleExistsValue returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= NOT )? kw= EXISTS ) ;
    public final AntlrDatatypeRuleToken ruleExistsValue() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalSQLParser.g:5036:2: ( ( (kw= NOT )? kw= EXISTS ) )
            // InternalSQLParser.g:5037:2: ( (kw= NOT )? kw= EXISTS )
            {
            // InternalSQLParser.g:5037:2: ( (kw= NOT )? kw= EXISTS )
            // InternalSQLParser.g:5038:3: (kw= NOT )? kw= EXISTS
            {
            // InternalSQLParser.g:5038:3: (kw= NOT )?
            int alt96=2;
            int LA96_0 = input.LA(1);

            if ( (LA96_0==NOT) ) {
                alt96=1;
            }
            switch (alt96) {
                case 1 :
                    // InternalSQLParser.g:5039:4: kw= NOT
                    {
                    kw=(Token)match(input,NOT,FOLLOW_73); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getExistsValueAccess().getNOTKeyword_0());
                      			
                    }

                    }
                    break;

            }

            kw=(Token)match(input,EXISTS,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getExistsValueAccess().getEXISTSKeyword_1());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExistsValue"


    // $ANTLR start "entryRuleOperandListGroup"
    // InternalSQLParser.g:5054:1: entryRuleOperandListGroup returns [EObject current=null] : iv_ruleOperandListGroup= ruleOperandListGroup EOF ;
    public final EObject entryRuleOperandListGroup() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperandListGroup = null;


        try {
            // InternalSQLParser.g:5054:57: (iv_ruleOperandListGroup= ruleOperandListGroup EOF )
            // InternalSQLParser.g:5055:2: iv_ruleOperandListGroup= ruleOperandListGroup EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOperandListGroupRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleOperandListGroup=ruleOperandListGroup();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOperandListGroup; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOperandListGroup"


    // $ANTLR start "ruleOperandListGroup"
    // InternalSQLParser.g:5061:1: ruleOperandListGroup returns [EObject current=null] : (otherlv_0= LeftParenthesis ( (lv_opGroup_1_0= ruleOperandList ) ) otherlv_2= RightParenthesis ) ;
    public final EObject ruleOperandListGroup() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_opGroup_1_0 = null;



        	enterRule();

        try {
            // InternalSQLParser.g:5067:2: ( (otherlv_0= LeftParenthesis ( (lv_opGroup_1_0= ruleOperandList ) ) otherlv_2= RightParenthesis ) )
            // InternalSQLParser.g:5068:2: (otherlv_0= LeftParenthesis ( (lv_opGroup_1_0= ruleOperandList ) ) otherlv_2= RightParenthesis )
            {
            // InternalSQLParser.g:5068:2: (otherlv_0= LeftParenthesis ( (lv_opGroup_1_0= ruleOperandList ) ) otherlv_2= RightParenthesis )
            // InternalSQLParser.g:5069:3: otherlv_0= LeftParenthesis ( (lv_opGroup_1_0= ruleOperandList ) ) otherlv_2= RightParenthesis
            {
            otherlv_0=(Token)match(input,LeftParenthesis,FOLLOW_74); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getOperandListGroupAccess().getLeftParenthesisKeyword_0());
              		
            }
            // InternalSQLParser.g:5073:3: ( (lv_opGroup_1_0= ruleOperandList ) )
            // InternalSQLParser.g:5074:4: (lv_opGroup_1_0= ruleOperandList )
            {
            // InternalSQLParser.g:5074:4: (lv_opGroup_1_0= ruleOperandList )
            // InternalSQLParser.g:5075:5: lv_opGroup_1_0= ruleOperandList
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getOperandListGroupAccess().getOpGroupOperandListParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_8);
            lv_opGroup_1_0=ruleOperandList();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getOperandListGroupRule());
              					}
              					set(
              						current,
              						"opGroup",
              						lv_opGroup_1_0,
              						"org.xtext.example.mydsl_sql.SQL.OperandList");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_2=(Token)match(input,RightParenthesis,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getOperandListGroupAccess().getRightParenthesisKeyword_2());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOperandListGroup"


    // $ANTLR start "entryRuleOperandList"
    // InternalSQLParser.g:5100:1: entryRuleOperandList returns [EObject current=null] : iv_ruleOperandList= ruleOperandList EOF ;
    public final EObject entryRuleOperandList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperandList = null;


        try {
            // InternalSQLParser.g:5100:52: (iv_ruleOperandList= ruleOperandList EOF )
            // InternalSQLParser.g:5101:2: iv_ruleOperandList= ruleOperandList EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOperandListRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleOperandList=ruleOperandList();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOperandList; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOperandList"


    // $ANTLR start "ruleOperandList"
    // InternalSQLParser.g:5107:1: ruleOperandList returns [EObject current=null] : (this_ScalarOperand_0= ruleScalarOperand ( () (otherlv_2= Comma ( (lv_entries_3_0= ruleScalarOperand ) ) )+ )? ) ;
    public final EObject ruleOperandList() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_ScalarOperand_0 = null;

        EObject lv_entries_3_0 = null;



        	enterRule();

        try {
            // InternalSQLParser.g:5113:2: ( (this_ScalarOperand_0= ruleScalarOperand ( () (otherlv_2= Comma ( (lv_entries_3_0= ruleScalarOperand ) ) )+ )? ) )
            // InternalSQLParser.g:5114:2: (this_ScalarOperand_0= ruleScalarOperand ( () (otherlv_2= Comma ( (lv_entries_3_0= ruleScalarOperand ) ) )+ )? )
            {
            // InternalSQLParser.g:5114:2: (this_ScalarOperand_0= ruleScalarOperand ( () (otherlv_2= Comma ( (lv_entries_3_0= ruleScalarOperand ) ) )+ )? )
            // InternalSQLParser.g:5115:3: this_ScalarOperand_0= ruleScalarOperand ( () (otherlv_2= Comma ( (lv_entries_3_0= ruleScalarOperand ) ) )+ )?
            {
            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getOperandListAccess().getScalarOperandParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_9);
            this_ScalarOperand_0=ruleScalarOperand();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_ScalarOperand_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalSQLParser.g:5126:3: ( () (otherlv_2= Comma ( (lv_entries_3_0= ruleScalarOperand ) ) )+ )?
            int alt98=2;
            int LA98_0 = input.LA(1);

            if ( (LA98_0==Comma) ) {
                alt98=1;
            }
            switch (alt98) {
                case 1 :
                    // InternalSQLParser.g:5127:4: () (otherlv_2= Comma ( (lv_entries_3_0= ruleScalarOperand ) ) )+
                    {
                    // InternalSQLParser.g:5127:4: ()
                    // InternalSQLParser.g:5128:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					/* */
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElementAndAdd(
                      						grammarAccess.getOperandListAccess().getOpListEntriesAction_1_0(),
                      						current);
                      				
                    }

                    }

                    // InternalSQLParser.g:5137:4: (otherlv_2= Comma ( (lv_entries_3_0= ruleScalarOperand ) ) )+
                    int cnt97=0;
                    loop97:
                    do {
                        int alt97=2;
                        int LA97_0 = input.LA(1);

                        if ( (LA97_0==Comma) ) {
                            alt97=1;
                        }


                        switch (alt97) {
                    	case 1 :
                    	    // InternalSQLParser.g:5138:5: otherlv_2= Comma ( (lv_entries_3_0= ruleScalarOperand ) )
                    	    {
                    	    otherlv_2=(Token)match(input,Comma,FOLLOW_74); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_2, grammarAccess.getOperandListAccess().getCommaKeyword_1_1_0());
                    	      				
                    	    }
                    	    // InternalSQLParser.g:5142:5: ( (lv_entries_3_0= ruleScalarOperand ) )
                    	    // InternalSQLParser.g:5143:6: (lv_entries_3_0= ruleScalarOperand )
                    	    {
                    	    // InternalSQLParser.g:5143:6: (lv_entries_3_0= ruleScalarOperand )
                    	    // InternalSQLParser.g:5144:7: lv_entries_3_0= ruleScalarOperand
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getOperandListAccess().getEntriesScalarOperandParserRuleCall_1_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_9);
                    	    lv_entries_3_0=ruleScalarOperand();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getOperandListRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"entries",
                    	      								lv_entries_3_0,
                    	      								"org.xtext.example.mydsl_sql.SQL.ScalarOperand");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt97 >= 1 ) break loop97;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(97, input);
                                throw eee;
                        }
                        cnt97++;
                    } while (true);


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOperandList"


    // $ANTLR start "entryRuleOperandGroup"
    // InternalSQLParser.g:5167:1: entryRuleOperandGroup returns [EObject current=null] : iv_ruleOperandGroup= ruleOperandGroup EOF ;
    public final EObject entryRuleOperandGroup() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperandGroup = null;


        try {
            // InternalSQLParser.g:5167:53: (iv_ruleOperandGroup= ruleOperandGroup EOF )
            // InternalSQLParser.g:5168:2: iv_ruleOperandGroup= ruleOperandGroup EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOperandGroupRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleOperandGroup=ruleOperandGroup();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOperandGroup; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOperandGroup"


    // $ANTLR start "ruleOperandGroup"
    // InternalSQLParser.g:5174:1: ruleOperandGroup returns [EObject current=null] : (this_Operand_0= ruleOperand | (otherlv_1= LeftParenthesis this_Operand_2= ruleOperand otherlv_3= RightParenthesis ) ) ;
    public final EObject ruleOperandGroup() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject this_Operand_0 = null;

        EObject this_Operand_2 = null;



        	enterRule();

        try {
            // InternalSQLParser.g:5180:2: ( (this_Operand_0= ruleOperand | (otherlv_1= LeftParenthesis this_Operand_2= ruleOperand otherlv_3= RightParenthesis ) ) )
            // InternalSQLParser.g:5181:2: (this_Operand_0= ruleOperand | (otherlv_1= LeftParenthesis this_Operand_2= ruleOperand otherlv_3= RightParenthesis ) )
            {
            // InternalSQLParser.g:5181:2: (this_Operand_0= ruleOperand | (otherlv_1= LeftParenthesis this_Operand_2= ruleOperand otherlv_3= RightParenthesis ) )
            int alt99=2;
            int LA99_0 = input.LA(1);

            if ( (LA99_0==EXTRACT||LA99_0==CAST||LA99_0==CASE||(LA99_0>=RULE_JRPARAM && LA99_0<=RULE_JRNPARAM)||(LA99_0>=RULE_UNSIGNED && LA99_0<=RULE_SIGNED_DOUBLE)||(LA99_0>=RULE_STRING_ && LA99_0<=RULE_ID)) ) {
                alt99=1;
            }
            else if ( (LA99_0==LeftParenthesis) ) {
                int LA99_2 = input.LA(2);

                if ( (LA99_2==SELECT) ) {
                    alt99=1;
                }
                else if ( (LA99_2==EXTRACT||LA99_2==CAST||LA99_2==CASE||LA99_2==LeftParenthesis||(LA99_2>=RULE_JRPARAM && LA99_2<=RULE_JRNPARAM)||(LA99_2>=RULE_UNSIGNED && LA99_2<=RULE_SIGNED_DOUBLE)||(LA99_2>=RULE_STRING_ && LA99_2<=RULE_ID)) ) {
                    alt99=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 99, 2, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 99, 0, input);

                throw nvae;
            }
            switch (alt99) {
                case 1 :
                    // InternalSQLParser.g:5182:3: this_Operand_0= ruleOperand
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getOperandGroupAccess().getOperandParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Operand_0=ruleOperand();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Operand_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalSQLParser.g:5194:3: (otherlv_1= LeftParenthesis this_Operand_2= ruleOperand otherlv_3= RightParenthesis )
                    {
                    // InternalSQLParser.g:5194:3: (otherlv_1= LeftParenthesis this_Operand_2= ruleOperand otherlv_3= RightParenthesis )
                    // InternalSQLParser.g:5195:4: otherlv_1= LeftParenthesis this_Operand_2= ruleOperand otherlv_3= RightParenthesis
                    {
                    otherlv_1=(Token)match(input,LeftParenthesis,FOLLOW_60); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getOperandGroupAccess().getLeftParenthesisKeyword_1_0());
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				/* */
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getOperandGroupAccess().getOperandParserRuleCall_1_1());
                      			
                    }
                    pushFollow(FOLLOW_8);
                    this_Operand_2=ruleOperand();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_Operand_2;
                      				afterParserOrEnumRuleCall();
                      			
                    }
                    otherlv_3=(Token)match(input,RightParenthesis,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getOperandGroupAccess().getRightParenthesisKeyword_1_2());
                      			
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOperandGroup"


    // $ANTLR start "entryRuleOperand"
    // InternalSQLParser.g:5219:1: entryRuleOperand returns [EObject current=null] : iv_ruleOperand= ruleOperand EOF ;
    public final EObject entryRuleOperand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperand = null;


        try {
            // InternalSQLParser.g:5219:48: (iv_ruleOperand= ruleOperand EOF )
            // InternalSQLParser.g:5220:2: iv_ruleOperand= ruleOperand EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOperandRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleOperand=ruleOperand();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOperand; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOperand"


    // $ANTLR start "ruleOperand"
    // InternalSQLParser.g:5226:1: ruleOperand returns [EObject current=null] : ( ( (lv_op1_0_0= ruleOperandFragment ) ) ( ( ( () otherlv_2= PlusSign ) | ( () otherlv_4= HyphenMinus ) | ( () otherlv_6= VerticalLineVerticalLine ) | ( () this_STAR_8= RULE_STAR ) | ( () otherlv_10= Solidus ) ) ( (lv_right_11_0= ruleOperandFragment ) ) )* ) ;
    public final EObject ruleOperand() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token this_STAR_8=null;
        Token otherlv_10=null;
        EObject lv_op1_0_0 = null;

        EObject lv_right_11_0 = null;



        	enterRule();

        try {
            // InternalSQLParser.g:5232:2: ( ( ( (lv_op1_0_0= ruleOperandFragment ) ) ( ( ( () otherlv_2= PlusSign ) | ( () otherlv_4= HyphenMinus ) | ( () otherlv_6= VerticalLineVerticalLine ) | ( () this_STAR_8= RULE_STAR ) | ( () otherlv_10= Solidus ) ) ( (lv_right_11_0= ruleOperandFragment ) ) )* ) )
            // InternalSQLParser.g:5233:2: ( ( (lv_op1_0_0= ruleOperandFragment ) ) ( ( ( () otherlv_2= PlusSign ) | ( () otherlv_4= HyphenMinus ) | ( () otherlv_6= VerticalLineVerticalLine ) | ( () this_STAR_8= RULE_STAR ) | ( () otherlv_10= Solidus ) ) ( (lv_right_11_0= ruleOperandFragment ) ) )* )
            {
            // InternalSQLParser.g:5233:2: ( ( (lv_op1_0_0= ruleOperandFragment ) ) ( ( ( () otherlv_2= PlusSign ) | ( () otherlv_4= HyphenMinus ) | ( () otherlv_6= VerticalLineVerticalLine ) | ( () this_STAR_8= RULE_STAR ) | ( () otherlv_10= Solidus ) ) ( (lv_right_11_0= ruleOperandFragment ) ) )* )
            // InternalSQLParser.g:5234:3: ( (lv_op1_0_0= ruleOperandFragment ) ) ( ( ( () otherlv_2= PlusSign ) | ( () otherlv_4= HyphenMinus ) | ( () otherlv_6= VerticalLineVerticalLine ) | ( () this_STAR_8= RULE_STAR ) | ( () otherlv_10= Solidus ) ) ( (lv_right_11_0= ruleOperandFragment ) ) )*
            {
            // InternalSQLParser.g:5234:3: ( (lv_op1_0_0= ruleOperandFragment ) )
            // InternalSQLParser.g:5235:4: (lv_op1_0_0= ruleOperandFragment )
            {
            // InternalSQLParser.g:5235:4: (lv_op1_0_0= ruleOperandFragment )
            // InternalSQLParser.g:5236:5: lv_op1_0_0= ruleOperandFragment
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getOperandAccess().getOp1OperandFragmentParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_75);
            lv_op1_0_0=ruleOperandFragment();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getOperandRule());
              					}
              					set(
              						current,
              						"op1",
              						lv_op1_0_0,
              						"org.xtext.example.mydsl_sql.SQL.OperandFragment");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalSQLParser.g:5253:3: ( ( ( () otherlv_2= PlusSign ) | ( () otherlv_4= HyphenMinus ) | ( () otherlv_6= VerticalLineVerticalLine ) | ( () this_STAR_8= RULE_STAR ) | ( () otherlv_10= Solidus ) ) ( (lv_right_11_0= ruleOperandFragment ) ) )*
            loop101:
            do {
                int alt101=2;
                int LA101_0 = input.LA(1);

                if ( (LA101_0==VerticalLineVerticalLine||LA101_0==PlusSign||LA101_0==HyphenMinus||LA101_0==Solidus||LA101_0==RULE_STAR) ) {
                    alt101=1;
                }


                switch (alt101) {
            	case 1 :
            	    // InternalSQLParser.g:5254:4: ( ( () otherlv_2= PlusSign ) | ( () otherlv_4= HyphenMinus ) | ( () otherlv_6= VerticalLineVerticalLine ) | ( () this_STAR_8= RULE_STAR ) | ( () otherlv_10= Solidus ) ) ( (lv_right_11_0= ruleOperandFragment ) )
            	    {
            	    // InternalSQLParser.g:5254:4: ( ( () otherlv_2= PlusSign ) | ( () otherlv_4= HyphenMinus ) | ( () otherlv_6= VerticalLineVerticalLine ) | ( () this_STAR_8= RULE_STAR ) | ( () otherlv_10= Solidus ) )
            	    int alt100=5;
            	    switch ( input.LA(1) ) {
            	    case PlusSign:
            	        {
            	        alt100=1;
            	        }
            	        break;
            	    case HyphenMinus:
            	        {
            	        alt100=2;
            	        }
            	        break;
            	    case VerticalLineVerticalLine:
            	        {
            	        alt100=3;
            	        }
            	        break;
            	    case RULE_STAR:
            	        {
            	        alt100=4;
            	        }
            	        break;
            	    case Solidus:
            	        {
            	        alt100=5;
            	        }
            	        break;
            	    default:
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 100, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt100) {
            	        case 1 :
            	            // InternalSQLParser.g:5255:5: ( () otherlv_2= PlusSign )
            	            {
            	            // InternalSQLParser.g:5255:5: ( () otherlv_2= PlusSign )
            	            // InternalSQLParser.g:5256:6: () otherlv_2= PlusSign
            	            {
            	            // InternalSQLParser.g:5256:6: ()
            	            // InternalSQLParser.g:5257:7: 
            	            {
            	            if ( state.backtracking==0 ) {

            	              							/* */
            	              						
            	            }
            	            if ( state.backtracking==0 ) {

            	              							current = forceCreateModelElementAndSet(
            	              								grammarAccess.getOperandAccess().getPlusLeftAction_1_0_0_0(),
            	              								current);
            	              						
            	            }

            	            }

            	            otherlv_2=(Token)match(input,PlusSign,FOLLOW_60); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              						newLeafNode(otherlv_2, grammarAccess.getOperandAccess().getPlusSignKeyword_1_0_0_1());
            	              					
            	            }

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalSQLParser.g:5272:5: ( () otherlv_4= HyphenMinus )
            	            {
            	            // InternalSQLParser.g:5272:5: ( () otherlv_4= HyphenMinus )
            	            // InternalSQLParser.g:5273:6: () otherlv_4= HyphenMinus
            	            {
            	            // InternalSQLParser.g:5273:6: ()
            	            // InternalSQLParser.g:5274:7: 
            	            {
            	            if ( state.backtracking==0 ) {

            	              							/* */
            	              						
            	            }
            	            if ( state.backtracking==0 ) {

            	              							current = forceCreateModelElementAndSet(
            	              								grammarAccess.getOperandAccess().getMinusLeftAction_1_0_1_0(),
            	              								current);
            	              						
            	            }

            	            }

            	            otherlv_4=(Token)match(input,HyphenMinus,FOLLOW_60); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              						newLeafNode(otherlv_4, grammarAccess.getOperandAccess().getHyphenMinusKeyword_1_0_1_1());
            	              					
            	            }

            	            }


            	            }
            	            break;
            	        case 3 :
            	            // InternalSQLParser.g:5289:5: ( () otherlv_6= VerticalLineVerticalLine )
            	            {
            	            // InternalSQLParser.g:5289:5: ( () otherlv_6= VerticalLineVerticalLine )
            	            // InternalSQLParser.g:5290:6: () otherlv_6= VerticalLineVerticalLine
            	            {
            	            // InternalSQLParser.g:5290:6: ()
            	            // InternalSQLParser.g:5291:7: 
            	            {
            	            if ( state.backtracking==0 ) {

            	              							/* */
            	              						
            	            }
            	            if ( state.backtracking==0 ) {

            	              							current = forceCreateModelElementAndSet(
            	              								grammarAccess.getOperandAccess().getConcatLeftAction_1_0_2_0(),
            	              								current);
            	              						
            	            }

            	            }

            	            otherlv_6=(Token)match(input,VerticalLineVerticalLine,FOLLOW_60); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              						newLeafNode(otherlv_6, grammarAccess.getOperandAccess().getVerticalLineVerticalLineKeyword_1_0_2_1());
            	              					
            	            }

            	            }


            	            }
            	            break;
            	        case 4 :
            	            // InternalSQLParser.g:5306:5: ( () this_STAR_8= RULE_STAR )
            	            {
            	            // InternalSQLParser.g:5306:5: ( () this_STAR_8= RULE_STAR )
            	            // InternalSQLParser.g:5307:6: () this_STAR_8= RULE_STAR
            	            {
            	            // InternalSQLParser.g:5307:6: ()
            	            // InternalSQLParser.g:5308:7: 
            	            {
            	            if ( state.backtracking==0 ) {

            	              							/* */
            	              						
            	            }
            	            if ( state.backtracking==0 ) {

            	              							current = forceCreateModelElementAndSet(
            	              								grammarAccess.getOperandAccess().getMultiplyLeftAction_1_0_3_0(),
            	              								current);
            	              						
            	            }

            	            }

            	            this_STAR_8=(Token)match(input,RULE_STAR,FOLLOW_60); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              						newLeafNode(this_STAR_8, grammarAccess.getOperandAccess().getSTARTerminalRuleCall_1_0_3_1());
            	              					
            	            }

            	            }


            	            }
            	            break;
            	        case 5 :
            	            // InternalSQLParser.g:5323:5: ( () otherlv_10= Solidus )
            	            {
            	            // InternalSQLParser.g:5323:5: ( () otherlv_10= Solidus )
            	            // InternalSQLParser.g:5324:6: () otherlv_10= Solidus
            	            {
            	            // InternalSQLParser.g:5324:6: ()
            	            // InternalSQLParser.g:5325:7: 
            	            {
            	            if ( state.backtracking==0 ) {

            	              							/* */
            	              						
            	            }
            	            if ( state.backtracking==0 ) {

            	              							current = forceCreateModelElementAndSet(
            	              								grammarAccess.getOperandAccess().getDivisionLeftAction_1_0_4_0(),
            	              								current);
            	              						
            	            }

            	            }

            	            otherlv_10=(Token)match(input,Solidus,FOLLOW_60); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              						newLeafNode(otherlv_10, grammarAccess.getOperandAccess().getSolidusKeyword_1_0_4_1());
            	              					
            	            }

            	            }


            	            }
            	            break;

            	    }

            	    // InternalSQLParser.g:5340:4: ( (lv_right_11_0= ruleOperandFragment ) )
            	    // InternalSQLParser.g:5341:5: (lv_right_11_0= ruleOperandFragment )
            	    {
            	    // InternalSQLParser.g:5341:5: (lv_right_11_0= ruleOperandFragment )
            	    // InternalSQLParser.g:5342:6: lv_right_11_0= ruleOperandFragment
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getOperandAccess().getRightOperandFragmentParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_75);
            	    lv_right_11_0=ruleOperandFragment();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getOperandRule());
            	      						}
            	      						set(
            	      							current,
            	      							"right",
            	      							lv_right_11_0,
            	      							"org.xtext.example.mydsl_sql.SQL.OperandFragment");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop101;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOperand"


    // $ANTLR start "entryRuleOperandFragment"
    // InternalSQLParser.g:5364:1: entryRuleOperandFragment returns [EObject current=null] : iv_ruleOperandFragment= ruleOperandFragment EOF ;
    public final EObject entryRuleOperandFragment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperandFragment = null;


        try {
            // InternalSQLParser.g:5364:56: (iv_ruleOperandFragment= ruleOperandFragment EOF )
            // InternalSQLParser.g:5365:2: iv_ruleOperandFragment= ruleOperandFragment EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOperandFragmentRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleOperandFragment=ruleOperandFragment();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOperandFragment; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOperandFragment"


    // $ANTLR start "ruleOperandFragment"
    // InternalSQLParser.g:5371:1: ruleOperandFragment returns [EObject current=null] : ( ( (lv_column_0_0= ruleColumnOperand ) ) | ( (lv_xop_1_0= ruleXOperandFragment ) ) | ( (lv_subq_2_0= ruleSubQueryOperand ) ) | ( (lv_fcast_3_0= ruleOpFunctionCast ) ) | ( (lv_fext_4_0= ruleFunctionExtract ) ) | ( (lv_func_5_0= ruleOperandFunction ) ) | ( (lv_sqlcase_6_0= ruleSQLCASE ) ) ) ;
    public final EObject ruleOperandFragment() throws RecognitionException {
        EObject current = null;

        EObject lv_column_0_0 = null;

        EObject lv_xop_1_0 = null;

        EObject lv_subq_2_0 = null;

        EObject lv_fcast_3_0 = null;

        EObject lv_fext_4_0 = null;

        EObject lv_func_5_0 = null;

        EObject lv_sqlcase_6_0 = null;



        	enterRule();

        try {
            // InternalSQLParser.g:5377:2: ( ( ( (lv_column_0_0= ruleColumnOperand ) ) | ( (lv_xop_1_0= ruleXOperandFragment ) ) | ( (lv_subq_2_0= ruleSubQueryOperand ) ) | ( (lv_fcast_3_0= ruleOpFunctionCast ) ) | ( (lv_fext_4_0= ruleFunctionExtract ) ) | ( (lv_func_5_0= ruleOperandFunction ) ) | ( (lv_sqlcase_6_0= ruleSQLCASE ) ) ) )
            // InternalSQLParser.g:5378:2: ( ( (lv_column_0_0= ruleColumnOperand ) ) | ( (lv_xop_1_0= ruleXOperandFragment ) ) | ( (lv_subq_2_0= ruleSubQueryOperand ) ) | ( (lv_fcast_3_0= ruleOpFunctionCast ) ) | ( (lv_fext_4_0= ruleFunctionExtract ) ) | ( (lv_func_5_0= ruleOperandFunction ) ) | ( (lv_sqlcase_6_0= ruleSQLCASE ) ) )
            {
            // InternalSQLParser.g:5378:2: ( ( (lv_column_0_0= ruleColumnOperand ) ) | ( (lv_xop_1_0= ruleXOperandFragment ) ) | ( (lv_subq_2_0= ruleSubQueryOperand ) ) | ( (lv_fcast_3_0= ruleOpFunctionCast ) ) | ( (lv_fext_4_0= ruleFunctionExtract ) ) | ( (lv_func_5_0= ruleOperandFunction ) ) | ( (lv_sqlcase_6_0= ruleSQLCASE ) ) )
            int alt102=7;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                int LA102_1 = input.LA(2);

                if ( (LA102_1==LeftParenthesis) ) {
                    alt102=6;
                }
                else if ( (LA102_1==EOF||LA102_1==STRAIGHT_JOIN||(LA102_1>=KW_FOLLOWING && LA102_1<=INTERSECT)||LA102_1==PRECEDING||LA102_1==BETWEEN||LA102_1==NATURAL||(LA102_1>=EXCEPT && LA102_1<=HAVING)||LA102_1==OFFSET||(LA102_1>=CROSS && LA102_1<=FETCH)||(LA102_1>=GROUP && LA102_1<=MINUS)||(LA102_1>=NULLS && LA102_1<=ORDER)||(LA102_1>=RANGE && LA102_1<=UNION)||LA102_1==WHERE||(LA102_1>=DESC && LA102_1<=FULL)||LA102_1==JOIN||(LA102_1>=LEFT && LA102_1<=LIKE)||LA102_1==ROWS||LA102_1==THEN||LA102_1==WHEN||LA102_1==LeftParenthesisPlusSignRightParenthesis||LA102_1==AND||LA102_1==ASC||LA102_1==END||LA102_1==NOT||LA102_1==ExclamationMarkEqualsSign||(LA102_1>=LessThanSignEqualsSign && LA102_1<=AS)||(LA102_1>=IN && LA102_1<=IS)||(LA102_1>=OR && LA102_1<=VerticalLineVerticalLine)||(LA102_1>=RightParenthesis && LA102_1<=RightCurlyBracket)||(LA102_1>=RULE_JRNPARAM && LA102_1<=RULE_STAR)||(LA102_1>=RULE_STRING && LA102_1<=RULE_ID)) ) {
                    alt102=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 102, 1, input);

                    throw nvae;
                }
                }
                break;
            case RULE_STRING:
            case RULE_DBNAME:
                {
                alt102=1;
                }
                break;
            case RULE_JRPARAM:
            case RULE_JRNPARAM:
            case RULE_UNSIGNED:
            case RULE_INT:
            case RULE_SIGNED_DOUBLE:
            case RULE_STRING_:
                {
                alt102=2;
                }
                break;
            case LeftParenthesis:
                {
                alt102=3;
                }
                break;
            case CAST:
                {
                alt102=4;
                }
                break;
            case EXTRACT:
                {
                alt102=5;
                }
                break;
            case CASE:
                {
                alt102=7;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 102, 0, input);

                throw nvae;
            }

            switch (alt102) {
                case 1 :
                    // InternalSQLParser.g:5379:3: ( (lv_column_0_0= ruleColumnOperand ) )
                    {
                    // InternalSQLParser.g:5379:3: ( (lv_column_0_0= ruleColumnOperand ) )
                    // InternalSQLParser.g:5380:4: (lv_column_0_0= ruleColumnOperand )
                    {
                    // InternalSQLParser.g:5380:4: (lv_column_0_0= ruleColumnOperand )
                    // InternalSQLParser.g:5381:5: lv_column_0_0= ruleColumnOperand
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getOperandFragmentAccess().getColumnColumnOperandParserRuleCall_0_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_column_0_0=ruleColumnOperand();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getOperandFragmentRule());
                      					}
                      					set(
                      						current,
                      						"column",
                      						lv_column_0_0,
                      						"org.xtext.example.mydsl_sql.SQL.ColumnOperand");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalSQLParser.g:5399:3: ( (lv_xop_1_0= ruleXOperandFragment ) )
                    {
                    // InternalSQLParser.g:5399:3: ( (lv_xop_1_0= ruleXOperandFragment ) )
                    // InternalSQLParser.g:5400:4: (lv_xop_1_0= ruleXOperandFragment )
                    {
                    // InternalSQLParser.g:5400:4: (lv_xop_1_0= ruleXOperandFragment )
                    // InternalSQLParser.g:5401:5: lv_xop_1_0= ruleXOperandFragment
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getOperandFragmentAccess().getXopXOperandFragmentParserRuleCall_1_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_xop_1_0=ruleXOperandFragment();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getOperandFragmentRule());
                      					}
                      					set(
                      						current,
                      						"xop",
                      						lv_xop_1_0,
                      						"org.xtext.example.mydsl_sql.SQL.XOperandFragment");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalSQLParser.g:5419:3: ( (lv_subq_2_0= ruleSubQueryOperand ) )
                    {
                    // InternalSQLParser.g:5419:3: ( (lv_subq_2_0= ruleSubQueryOperand ) )
                    // InternalSQLParser.g:5420:4: (lv_subq_2_0= ruleSubQueryOperand )
                    {
                    // InternalSQLParser.g:5420:4: (lv_subq_2_0= ruleSubQueryOperand )
                    // InternalSQLParser.g:5421:5: lv_subq_2_0= ruleSubQueryOperand
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getOperandFragmentAccess().getSubqSubQueryOperandParserRuleCall_2_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_subq_2_0=ruleSubQueryOperand();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getOperandFragmentRule());
                      					}
                      					set(
                      						current,
                      						"subq",
                      						lv_subq_2_0,
                      						"org.xtext.example.mydsl_sql.SQL.SubQueryOperand");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalSQLParser.g:5439:3: ( (lv_fcast_3_0= ruleOpFunctionCast ) )
                    {
                    // InternalSQLParser.g:5439:3: ( (lv_fcast_3_0= ruleOpFunctionCast ) )
                    // InternalSQLParser.g:5440:4: (lv_fcast_3_0= ruleOpFunctionCast )
                    {
                    // InternalSQLParser.g:5440:4: (lv_fcast_3_0= ruleOpFunctionCast )
                    // InternalSQLParser.g:5441:5: lv_fcast_3_0= ruleOpFunctionCast
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getOperandFragmentAccess().getFcastOpFunctionCastParserRuleCall_3_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_fcast_3_0=ruleOpFunctionCast();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getOperandFragmentRule());
                      					}
                      					set(
                      						current,
                      						"fcast",
                      						lv_fcast_3_0,
                      						"org.xtext.example.mydsl_sql.SQL.OpFunctionCast");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }


                    }
                    break;
                case 5 :
                    // InternalSQLParser.g:5459:3: ( (lv_fext_4_0= ruleFunctionExtract ) )
                    {
                    // InternalSQLParser.g:5459:3: ( (lv_fext_4_0= ruleFunctionExtract ) )
                    // InternalSQLParser.g:5460:4: (lv_fext_4_0= ruleFunctionExtract )
                    {
                    // InternalSQLParser.g:5460:4: (lv_fext_4_0= ruleFunctionExtract )
                    // InternalSQLParser.g:5461:5: lv_fext_4_0= ruleFunctionExtract
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getOperandFragmentAccess().getFextFunctionExtractParserRuleCall_4_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_fext_4_0=ruleFunctionExtract();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getOperandFragmentRule());
                      					}
                      					set(
                      						current,
                      						"fext",
                      						lv_fext_4_0,
                      						"org.xtext.example.mydsl_sql.SQL.FunctionExtract");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }


                    }
                    break;
                case 6 :
                    // InternalSQLParser.g:5479:3: ( (lv_func_5_0= ruleOperandFunction ) )
                    {
                    // InternalSQLParser.g:5479:3: ( (lv_func_5_0= ruleOperandFunction ) )
                    // InternalSQLParser.g:5480:4: (lv_func_5_0= ruleOperandFunction )
                    {
                    // InternalSQLParser.g:5480:4: (lv_func_5_0= ruleOperandFunction )
                    // InternalSQLParser.g:5481:5: lv_func_5_0= ruleOperandFunction
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getOperandFragmentAccess().getFuncOperandFunctionParserRuleCall_5_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_func_5_0=ruleOperandFunction();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getOperandFragmentRule());
                      					}
                      					set(
                      						current,
                      						"func",
                      						lv_func_5_0,
                      						"org.xtext.example.mydsl_sql.SQL.OperandFunction");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }


                    }
                    break;
                case 7 :
                    // InternalSQLParser.g:5499:3: ( (lv_sqlcase_6_0= ruleSQLCASE ) )
                    {
                    // InternalSQLParser.g:5499:3: ( (lv_sqlcase_6_0= ruleSQLCASE ) )
                    // InternalSQLParser.g:5500:4: (lv_sqlcase_6_0= ruleSQLCASE )
                    {
                    // InternalSQLParser.g:5500:4: (lv_sqlcase_6_0= ruleSQLCASE )
                    // InternalSQLParser.g:5501:5: lv_sqlcase_6_0= ruleSQLCASE
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getOperandFragmentAccess().getSqlcaseSQLCASEParserRuleCall_6_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_sqlcase_6_0=ruleSQLCASE();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getOperandFragmentRule());
                      					}
                      					set(
                      						current,
                      						"sqlcase",
                      						lv_sqlcase_6_0,
                      						"org.xtext.example.mydsl_sql.SQL.SQLCASE");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOperandFragment"


    // $ANTLR start "entryRuleOperandFunction"
    // InternalSQLParser.g:5522:1: entryRuleOperandFunction returns [EObject current=null] : iv_ruleOperandFunction= ruleOperandFunction EOF ;
    public final EObject entryRuleOperandFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperandFunction = null;


        try {
            // InternalSQLParser.g:5522:56: (iv_ruleOperandFunction= ruleOperandFunction EOF )
            // InternalSQLParser.g:5523:2: iv_ruleOperandFunction= ruleOperandFunction EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOperandFunctionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleOperandFunction=ruleOperandFunction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOperandFunction; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOperandFunction"


    // $ANTLR start "ruleOperandFunction"
    // InternalSQLParser.g:5529:1: ruleOperandFunction returns [EObject current=null] : ( () ( (lv_fname_1_0= ruleFNAME ) ) ( ( (lv_star_2_0= RULE_STAR ) ) | ( (lv_args_3_0= ruleOpFunctionArg ) ) )? otherlv_4= RightParenthesis ( (lv_fan_5_0= ruleFunctionAnalytical ) )? ) ;
    public final EObject ruleOperandFunction() throws RecognitionException {
        EObject current = null;

        Token lv_star_2_0=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_fname_1_0 = null;

        EObject lv_args_3_0 = null;

        EObject lv_fan_5_0 = null;



        	enterRule();

        try {
            // InternalSQLParser.g:5535:2: ( ( () ( (lv_fname_1_0= ruleFNAME ) ) ( ( (lv_star_2_0= RULE_STAR ) ) | ( (lv_args_3_0= ruleOpFunctionArg ) ) )? otherlv_4= RightParenthesis ( (lv_fan_5_0= ruleFunctionAnalytical ) )? ) )
            // InternalSQLParser.g:5536:2: ( () ( (lv_fname_1_0= ruleFNAME ) ) ( ( (lv_star_2_0= RULE_STAR ) ) | ( (lv_args_3_0= ruleOpFunctionArg ) ) )? otherlv_4= RightParenthesis ( (lv_fan_5_0= ruleFunctionAnalytical ) )? )
            {
            // InternalSQLParser.g:5536:2: ( () ( (lv_fname_1_0= ruleFNAME ) ) ( ( (lv_star_2_0= RULE_STAR ) ) | ( (lv_args_3_0= ruleOpFunctionArg ) ) )? otherlv_4= RightParenthesis ( (lv_fan_5_0= ruleFunctionAnalytical ) )? )
            // InternalSQLParser.g:5537:3: () ( (lv_fname_1_0= ruleFNAME ) ) ( ( (lv_star_2_0= RULE_STAR ) ) | ( (lv_args_3_0= ruleOpFunctionArg ) ) )? otherlv_4= RightParenthesis ( (lv_fan_5_0= ruleFunctionAnalytical ) )?
            {
            // InternalSQLParser.g:5537:3: ()
            // InternalSQLParser.g:5538:4: 
            {
            if ( state.backtracking==0 ) {

              				/* */
              			
            }
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getOperandFunctionAccess().getOpFunctionAction_0(),
              					current);
              			
            }

            }

            // InternalSQLParser.g:5547:3: ( (lv_fname_1_0= ruleFNAME ) )
            // InternalSQLParser.g:5548:4: (lv_fname_1_0= ruleFNAME )
            {
            // InternalSQLParser.g:5548:4: (lv_fname_1_0= ruleFNAME )
            // InternalSQLParser.g:5549:5: lv_fname_1_0= ruleFNAME
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getOperandFunctionAccess().getFnameFNAMEParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_76);
            lv_fname_1_0=ruleFNAME();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getOperandFunctionRule());
              					}
              					set(
              						current,
              						"fname",
              						lv_fname_1_0,
              						"org.xtext.example.mydsl_sql.SQL.FNAME");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalSQLParser.g:5566:3: ( ( (lv_star_2_0= RULE_STAR ) ) | ( (lv_args_3_0= ruleOpFunctionArg ) ) )?
            int alt103=3;
            int LA103_0 = input.LA(1);

            if ( (LA103_0==RULE_STAR) ) {
                alt103=1;
            }
            else if ( (LA103_0==DISTINCT||LA103_0==EXTRACT||LA103_0==CAST||LA103_0==CASE||LA103_0==ALL||LA103_0==LeftParenthesis||(LA103_0>=RULE_JRPARAM && LA103_0<=RULE_JRNPARAM)||(LA103_0>=RULE_UNSIGNED && LA103_0<=RULE_SIGNED_DOUBLE)||(LA103_0>=RULE_STRING_ && LA103_0<=RULE_ID)) ) {
                alt103=2;
            }
            switch (alt103) {
                case 1 :
                    // InternalSQLParser.g:5567:4: ( (lv_star_2_0= RULE_STAR ) )
                    {
                    // InternalSQLParser.g:5567:4: ( (lv_star_2_0= RULE_STAR ) )
                    // InternalSQLParser.g:5568:5: (lv_star_2_0= RULE_STAR )
                    {
                    // InternalSQLParser.g:5568:5: (lv_star_2_0= RULE_STAR )
                    // InternalSQLParser.g:5569:6: lv_star_2_0= RULE_STAR
                    {
                    lv_star_2_0=(Token)match(input,RULE_STAR,FOLLOW_8); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_star_2_0, grammarAccess.getOperandFunctionAccess().getStarSTARTerminalRuleCall_2_0_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getOperandFunctionRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"star",
                      							lv_star_2_0,
                      							"org.xtext.example.mydsl_sql.SQL.STAR");
                      					
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalSQLParser.g:5586:4: ( (lv_args_3_0= ruleOpFunctionArg ) )
                    {
                    // InternalSQLParser.g:5586:4: ( (lv_args_3_0= ruleOpFunctionArg ) )
                    // InternalSQLParser.g:5587:5: (lv_args_3_0= ruleOpFunctionArg )
                    {
                    // InternalSQLParser.g:5587:5: (lv_args_3_0= ruleOpFunctionArg )
                    // InternalSQLParser.g:5588:6: lv_args_3_0= ruleOpFunctionArg
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getOperandFunctionAccess().getArgsOpFunctionArgParserRuleCall_2_1_0());
                      					
                    }
                    pushFollow(FOLLOW_8);
                    lv_args_3_0=ruleOpFunctionArg();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getOperandFunctionRule());
                      						}
                      						set(
                      							current,
                      							"args",
                      							lv_args_3_0,
                      							"org.xtext.example.mydsl_sql.SQL.OpFunctionArg");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,RightParenthesis,FOLLOW_77); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getOperandFunctionAccess().getRightParenthesisKeyword_3());
              		
            }
            // InternalSQLParser.g:5610:3: ( (lv_fan_5_0= ruleFunctionAnalytical ) )?
            int alt104=2;
            int LA104_0 = input.LA(1);

            if ( (LA104_0==OVER) ) {
                alt104=1;
            }
            switch (alt104) {
                case 1 :
                    // InternalSQLParser.g:5611:4: (lv_fan_5_0= ruleFunctionAnalytical )
                    {
                    // InternalSQLParser.g:5611:4: (lv_fan_5_0= ruleFunctionAnalytical )
                    // InternalSQLParser.g:5612:5: lv_fan_5_0= ruleFunctionAnalytical
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getOperandFunctionAccess().getFanFunctionAnalyticalParserRuleCall_4_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_fan_5_0=ruleFunctionAnalytical();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getOperandFunctionRule());
                      					}
                      					set(
                      						current,
                      						"fan",
                      						lv_fan_5_0,
                      						"org.xtext.example.mydsl_sql.SQL.FunctionAnalytical");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOperandFunction"


    // $ANTLR start "entryRuleFunctionExtract"
    // InternalSQLParser.g:5633:1: entryRuleFunctionExtract returns [EObject current=null] : iv_ruleFunctionExtract= ruleFunctionExtract EOF ;
    public final EObject entryRuleFunctionExtract() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionExtract = null;


        try {
            // InternalSQLParser.g:5633:56: (iv_ruleFunctionExtract= ruleFunctionExtract EOF )
            // InternalSQLParser.g:5634:2: iv_ruleFunctionExtract= ruleFunctionExtract EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFunctionExtractRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleFunctionExtract=ruleFunctionExtract();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFunctionExtract; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFunctionExtract"


    // $ANTLR start "ruleFunctionExtract"
    // InternalSQLParser.g:5640:1: ruleFunctionExtract returns [EObject current=null] : (otherlv_0= EXTRACT otherlv_1= LeftParenthesis ( (lv_v_2_0= ruleEXTRACT_VALUES ) ) otherlv_3= FROM ( (lv_operand_4_0= ruleOperandGroup ) ) otherlv_5= RightParenthesis ) ;
    public final EObject ruleFunctionExtract() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Enumerator lv_v_2_0 = null;

        EObject lv_operand_4_0 = null;



        	enterRule();

        try {
            // InternalSQLParser.g:5646:2: ( (otherlv_0= EXTRACT otherlv_1= LeftParenthesis ( (lv_v_2_0= ruleEXTRACT_VALUES ) ) otherlv_3= FROM ( (lv_operand_4_0= ruleOperandGroup ) ) otherlv_5= RightParenthesis ) )
            // InternalSQLParser.g:5647:2: (otherlv_0= EXTRACT otherlv_1= LeftParenthesis ( (lv_v_2_0= ruleEXTRACT_VALUES ) ) otherlv_3= FROM ( (lv_operand_4_0= ruleOperandGroup ) ) otherlv_5= RightParenthesis )
            {
            // InternalSQLParser.g:5647:2: (otherlv_0= EXTRACT otherlv_1= LeftParenthesis ( (lv_v_2_0= ruleEXTRACT_VALUES ) ) otherlv_3= FROM ( (lv_operand_4_0= ruleOperandGroup ) ) otherlv_5= RightParenthesis )
            // InternalSQLParser.g:5648:3: otherlv_0= EXTRACT otherlv_1= LeftParenthesis ( (lv_v_2_0= ruleEXTRACT_VALUES ) ) otherlv_3= FROM ( (lv_operand_4_0= ruleOperandGroup ) ) otherlv_5= RightParenthesis
            {
            otherlv_0=(Token)match(input,EXTRACT,FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getFunctionExtractAccess().getEXTRACTKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,LeftParenthesis,FOLLOW_78); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getFunctionExtractAccess().getLeftParenthesisKeyword_1());
              		
            }
            // InternalSQLParser.g:5656:3: ( (lv_v_2_0= ruleEXTRACT_VALUES ) )
            // InternalSQLParser.g:5657:4: (lv_v_2_0= ruleEXTRACT_VALUES )
            {
            // InternalSQLParser.g:5657:4: (lv_v_2_0= ruleEXTRACT_VALUES )
            // InternalSQLParser.g:5658:5: lv_v_2_0= ruleEXTRACT_VALUES
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getFunctionExtractAccess().getVEXTRACT_VALUESEnumRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_20);
            lv_v_2_0=ruleEXTRACT_VALUES();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getFunctionExtractRule());
              					}
              					set(
              						current,
              						"v",
              						lv_v_2_0,
              						"org.xtext.example.mydsl_sql.SQL.EXTRACT_VALUES");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_3=(Token)match(input,FROM,FOLLOW_60); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getFunctionExtractAccess().getFROMKeyword_3());
              		
            }
            // InternalSQLParser.g:5679:3: ( (lv_operand_4_0= ruleOperandGroup ) )
            // InternalSQLParser.g:5680:4: (lv_operand_4_0= ruleOperandGroup )
            {
            // InternalSQLParser.g:5680:4: (lv_operand_4_0= ruleOperandGroup )
            // InternalSQLParser.g:5681:5: lv_operand_4_0= ruleOperandGroup
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getFunctionExtractAccess().getOperandOperandGroupParserRuleCall_4_0());
              				
            }
            pushFollow(FOLLOW_8);
            lv_operand_4_0=ruleOperandGroup();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getFunctionExtractRule());
              					}
              					set(
              						current,
              						"operand",
              						lv_operand_4_0,
              						"org.xtext.example.mydsl_sql.SQL.OperandGroup");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_5=(Token)match(input,RightParenthesis,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getFunctionExtractAccess().getRightParenthesisKeyword_5());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFunctionExtract"


    // $ANTLR start "entryRuleFunctionAnalytical"
    // InternalSQLParser.g:5706:1: entryRuleFunctionAnalytical returns [EObject current=null] : iv_ruleFunctionAnalytical= ruleFunctionAnalytical EOF ;
    public final EObject entryRuleFunctionAnalytical() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionAnalytical = null;


        try {
            // InternalSQLParser.g:5706:59: (iv_ruleFunctionAnalytical= ruleFunctionAnalytical EOF )
            // InternalSQLParser.g:5707:2: iv_ruleFunctionAnalytical= ruleFunctionAnalytical EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFunctionAnalyticalRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleFunctionAnalytical=ruleFunctionAnalytical();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFunctionAnalytical; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFunctionAnalytical"


    // $ANTLR start "ruleFunctionAnalytical"
    // InternalSQLParser.g:5713:1: ruleFunctionAnalytical returns [EObject current=null] : (otherlv_0= OVER otherlv_1= LeftParenthesis ( (lv_anClause_2_0= ruleAnalyticClause ) ) otherlv_3= RightParenthesis ) ;
    public final EObject ruleFunctionAnalytical() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_anClause_2_0 = null;



        	enterRule();

        try {
            // InternalSQLParser.g:5719:2: ( (otherlv_0= OVER otherlv_1= LeftParenthesis ( (lv_anClause_2_0= ruleAnalyticClause ) ) otherlv_3= RightParenthesis ) )
            // InternalSQLParser.g:5720:2: (otherlv_0= OVER otherlv_1= LeftParenthesis ( (lv_anClause_2_0= ruleAnalyticClause ) ) otherlv_3= RightParenthesis )
            {
            // InternalSQLParser.g:5720:2: (otherlv_0= OVER otherlv_1= LeftParenthesis ( (lv_anClause_2_0= ruleAnalyticClause ) ) otherlv_3= RightParenthesis )
            // InternalSQLParser.g:5721:3: otherlv_0= OVER otherlv_1= LeftParenthesis ( (lv_anClause_2_0= ruleAnalyticClause ) ) otherlv_3= RightParenthesis
            {
            otherlv_0=(Token)match(input,OVER,FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getFunctionAnalyticalAccess().getOVERKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,LeftParenthesis,FOLLOW_79); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getFunctionAnalyticalAccess().getLeftParenthesisKeyword_1());
              		
            }
            // InternalSQLParser.g:5729:3: ( (lv_anClause_2_0= ruleAnalyticClause ) )
            // InternalSQLParser.g:5730:4: (lv_anClause_2_0= ruleAnalyticClause )
            {
            // InternalSQLParser.g:5730:4: (lv_anClause_2_0= ruleAnalyticClause )
            // InternalSQLParser.g:5731:5: lv_anClause_2_0= ruleAnalyticClause
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getFunctionAnalyticalAccess().getAnClauseAnalyticClauseParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_8);
            lv_anClause_2_0=ruleAnalyticClause();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getFunctionAnalyticalRule());
              					}
              					set(
              						current,
              						"anClause",
              						lv_anClause_2_0,
              						"org.xtext.example.mydsl_sql.SQL.AnalyticClause");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_3=(Token)match(input,RightParenthesis,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getFunctionAnalyticalAccess().getRightParenthesisKeyword_3());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFunctionAnalytical"


    // $ANTLR start "entryRuleAnalyticClause"
    // InternalSQLParser.g:5756:1: entryRuleAnalyticClause returns [EObject current=null] : iv_ruleAnalyticClause= ruleAnalyticClause EOF ;
    public final EObject entryRuleAnalyticClause() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnalyticClause = null;


        try {
            // InternalSQLParser.g:5756:55: (iv_ruleAnalyticClause= ruleAnalyticClause EOF )
            // InternalSQLParser.g:5757:2: iv_ruleAnalyticClause= ruleAnalyticClause EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAnalyticClauseRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleAnalyticClause=ruleAnalyticClause();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAnalyticClause; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAnalyticClause"


    // $ANTLR start "ruleAnalyticClause"
    // InternalSQLParser.g:5763:1: ruleAnalyticClause returns [EObject current=null] : ( () ( (lv_abc_1_0= ruleQueryPartitionClause ) )? ( ( (lv_obc_2_0= ruleOrderByClause ) ) ( (lv_winc_3_0= ruleWindowingClause ) )? )? ) ;
    public final EObject ruleAnalyticClause() throws RecognitionException {
        EObject current = null;

        EObject lv_abc_1_0 = null;

        EObject lv_obc_2_0 = null;

        EObject lv_winc_3_0 = null;



        	enterRule();

        try {
            // InternalSQLParser.g:5769:2: ( ( () ( (lv_abc_1_0= ruleQueryPartitionClause ) )? ( ( (lv_obc_2_0= ruleOrderByClause ) ) ( (lv_winc_3_0= ruleWindowingClause ) )? )? ) )
            // InternalSQLParser.g:5770:2: ( () ( (lv_abc_1_0= ruleQueryPartitionClause ) )? ( ( (lv_obc_2_0= ruleOrderByClause ) ) ( (lv_winc_3_0= ruleWindowingClause ) )? )? )
            {
            // InternalSQLParser.g:5770:2: ( () ( (lv_abc_1_0= ruleQueryPartitionClause ) )? ( ( (lv_obc_2_0= ruleOrderByClause ) ) ( (lv_winc_3_0= ruleWindowingClause ) )? )? )
            // InternalSQLParser.g:5771:3: () ( (lv_abc_1_0= ruleQueryPartitionClause ) )? ( ( (lv_obc_2_0= ruleOrderByClause ) ) ( (lv_winc_3_0= ruleWindowingClause ) )? )?
            {
            // InternalSQLParser.g:5771:3: ()
            // InternalSQLParser.g:5772:4: 
            {
            if ( state.backtracking==0 ) {

              				/* */
              			
            }
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getAnalyticClauseAccess().getAnalyticClauseAction_0(),
              					current);
              			
            }

            }

            // InternalSQLParser.g:5781:3: ( (lv_abc_1_0= ruleQueryPartitionClause ) )?
            int alt105=2;
            int LA105_0 = input.LA(1);

            if ( (LA105_0==PARTITION) ) {
                alt105=1;
            }
            switch (alt105) {
                case 1 :
                    // InternalSQLParser.g:5782:4: (lv_abc_1_0= ruleQueryPartitionClause )
                    {
                    // InternalSQLParser.g:5782:4: (lv_abc_1_0= ruleQueryPartitionClause )
                    // InternalSQLParser.g:5783:5: lv_abc_1_0= ruleQueryPartitionClause
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getAnalyticClauseAccess().getAbcQueryPartitionClauseParserRuleCall_1_0());
                      				
                    }
                    pushFollow(FOLLOW_80);
                    lv_abc_1_0=ruleQueryPartitionClause();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getAnalyticClauseRule());
                      					}
                      					set(
                      						current,
                      						"abc",
                      						lv_abc_1_0,
                      						"org.xtext.example.mydsl_sql.SQL.QueryPartitionClause");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalSQLParser.g:5800:3: ( ( (lv_obc_2_0= ruleOrderByClause ) ) ( (lv_winc_3_0= ruleWindowingClause ) )? )?
            int alt107=2;
            int LA107_0 = input.LA(1);

            if ( (LA107_0==ORDER) ) {
                alt107=1;
            }
            switch (alt107) {
                case 1 :
                    // InternalSQLParser.g:5801:4: ( (lv_obc_2_0= ruleOrderByClause ) ) ( (lv_winc_3_0= ruleWindowingClause ) )?
                    {
                    // InternalSQLParser.g:5801:4: ( (lv_obc_2_0= ruleOrderByClause ) )
                    // InternalSQLParser.g:5802:5: (lv_obc_2_0= ruleOrderByClause )
                    {
                    // InternalSQLParser.g:5802:5: (lv_obc_2_0= ruleOrderByClause )
                    // InternalSQLParser.g:5803:6: lv_obc_2_0= ruleOrderByClause
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getAnalyticClauseAccess().getObcOrderByClauseParserRuleCall_2_0_0());
                      					
                    }
                    pushFollow(FOLLOW_81);
                    lv_obc_2_0=ruleOrderByClause();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getAnalyticClauseRule());
                      						}
                      						set(
                      							current,
                      							"obc",
                      							lv_obc_2_0,
                      							"org.xtext.example.mydsl_sql.SQL.OrderByClause");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalSQLParser.g:5820:4: ( (lv_winc_3_0= ruleWindowingClause ) )?
                    int alt106=2;
                    int LA106_0 = input.LA(1);

                    if ( (LA106_0==RANGE||LA106_0==ROWS) ) {
                        alt106=1;
                    }
                    switch (alt106) {
                        case 1 :
                            // InternalSQLParser.g:5821:5: (lv_winc_3_0= ruleWindowingClause )
                            {
                            // InternalSQLParser.g:5821:5: (lv_winc_3_0= ruleWindowingClause )
                            // InternalSQLParser.g:5822:6: lv_winc_3_0= ruleWindowingClause
                            {
                            if ( state.backtracking==0 ) {

                              						newCompositeNode(grammarAccess.getAnalyticClauseAccess().getWincWindowingClauseParserRuleCall_2_1_0());
                              					
                            }
                            pushFollow(FOLLOW_2);
                            lv_winc_3_0=ruleWindowingClause();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						if (current==null) {
                              							current = createModelElementForParent(grammarAccess.getAnalyticClauseRule());
                              						}
                              						set(
                              							current,
                              							"winc",
                              							lv_winc_3_0,
                              							"org.xtext.example.mydsl_sql.SQL.WindowingClause");
                              						afterParserOrEnumRuleCall();
                              					
                            }

                            }


                            }
                            break;

                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAnalyticClause"


    // $ANTLR start "entryRuleWindowingClause"
    // InternalSQLParser.g:5844:1: entryRuleWindowingClause returns [EObject current=null] : iv_ruleWindowingClause= ruleWindowingClause EOF ;
    public final EObject entryRuleWindowingClause() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWindowingClause = null;


        try {
            // InternalSQLParser.g:5844:56: (iv_ruleWindowingClause= ruleWindowingClause EOF )
            // InternalSQLParser.g:5845:2: iv_ruleWindowingClause= ruleWindowingClause EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getWindowingClauseRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleWindowingClause=ruleWindowingClause();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleWindowingClause; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleWindowingClause"


    // $ANTLR start "ruleWindowingClause"
    // InternalSQLParser.g:5851:1: ruleWindowingClause returns [EObject current=null] : ( (otherlv_0= ROWS | otherlv_1= RANGE ) (this_WindowingClauseBetween_2= ruleWindowingClauseBetween | this_WindowingClauseOperandPreceding_3= ruleWindowingClauseOperandPreceding ) ) ;
    public final EObject ruleWindowingClause() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject this_WindowingClauseBetween_2 = null;

        EObject this_WindowingClauseOperandPreceding_3 = null;



        	enterRule();

        try {
            // InternalSQLParser.g:5857:2: ( ( (otherlv_0= ROWS | otherlv_1= RANGE ) (this_WindowingClauseBetween_2= ruleWindowingClauseBetween | this_WindowingClauseOperandPreceding_3= ruleWindowingClauseOperandPreceding ) ) )
            // InternalSQLParser.g:5858:2: ( (otherlv_0= ROWS | otherlv_1= RANGE ) (this_WindowingClauseBetween_2= ruleWindowingClauseBetween | this_WindowingClauseOperandPreceding_3= ruleWindowingClauseOperandPreceding ) )
            {
            // InternalSQLParser.g:5858:2: ( (otherlv_0= ROWS | otherlv_1= RANGE ) (this_WindowingClauseBetween_2= ruleWindowingClauseBetween | this_WindowingClauseOperandPreceding_3= ruleWindowingClauseOperandPreceding ) )
            // InternalSQLParser.g:5859:3: (otherlv_0= ROWS | otherlv_1= RANGE ) (this_WindowingClauseBetween_2= ruleWindowingClauseBetween | this_WindowingClauseOperandPreceding_3= ruleWindowingClauseOperandPreceding )
            {
            // InternalSQLParser.g:5859:3: (otherlv_0= ROWS | otherlv_1= RANGE )
            int alt108=2;
            int LA108_0 = input.LA(1);

            if ( (LA108_0==ROWS) ) {
                alt108=1;
            }
            else if ( (LA108_0==RANGE) ) {
                alt108=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 108, 0, input);

                throw nvae;
            }
            switch (alt108) {
                case 1 :
                    // InternalSQLParser.g:5860:4: otherlv_0= ROWS
                    {
                    otherlv_0=(Token)match(input,ROWS,FOLLOW_82); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_0, grammarAccess.getWindowingClauseAccess().getROWSKeyword_0_0());
                      			
                    }

                    }
                    break;
                case 2 :
                    // InternalSQLParser.g:5865:4: otherlv_1= RANGE
                    {
                    otherlv_1=(Token)match(input,RANGE,FOLLOW_82); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getWindowingClauseAccess().getRANGEKeyword_0_1());
                      			
                    }

                    }
                    break;

            }

            // InternalSQLParser.g:5870:3: (this_WindowingClauseBetween_2= ruleWindowingClauseBetween | this_WindowingClauseOperandPreceding_3= ruleWindowingClauseOperandPreceding )
            int alt109=2;
            int LA109_0 = input.LA(1);

            if ( (LA109_0==BETWEEN) ) {
                alt109=1;
            }
            else if ( (LA109_0==UNBOUNDED||LA109_0==CURRENT||LA109_0==EXTRACT||LA109_0==CAST||LA109_0==CASE||LA109_0==LeftParenthesis||(LA109_0>=RULE_JRPARAM && LA109_0<=RULE_JRNPARAM)||(LA109_0>=RULE_UNSIGNED && LA109_0<=RULE_SIGNED_DOUBLE)||(LA109_0>=RULE_STRING_ && LA109_0<=RULE_ID)) ) {
                alt109=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 109, 0, input);

                throw nvae;
            }
            switch (alt109) {
                case 1 :
                    // InternalSQLParser.g:5871:4: this_WindowingClauseBetween_2= ruleWindowingClauseBetween
                    {
                    if ( state.backtracking==0 ) {

                      				/* */
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getWindowingClauseAccess().getWindowingClauseBetweenParserRuleCall_1_0());
                      			
                    }
                    pushFollow(FOLLOW_2);
                    this_WindowingClauseBetween_2=ruleWindowingClauseBetween();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_WindowingClauseBetween_2;
                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }
                    break;
                case 2 :
                    // InternalSQLParser.g:5883:4: this_WindowingClauseOperandPreceding_3= ruleWindowingClauseOperandPreceding
                    {
                    if ( state.backtracking==0 ) {

                      				/* */
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getWindowingClauseAccess().getWindowingClauseOperandPrecedingParserRuleCall_1_1());
                      			
                    }
                    pushFollow(FOLLOW_2);
                    this_WindowingClauseOperandPreceding_3=ruleWindowingClauseOperandPreceding();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_WindowingClauseOperandPreceding_3;
                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleWindowingClause"


    // $ANTLR start "entryRuleWindowingClauseBetween"
    // InternalSQLParser.g:5899:1: entryRuleWindowingClauseBetween returns [EObject current=null] : iv_ruleWindowingClauseBetween= ruleWindowingClauseBetween EOF ;
    public final EObject entryRuleWindowingClauseBetween() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWindowingClauseBetween = null;


        try {
            // InternalSQLParser.g:5899:63: (iv_ruleWindowingClauseBetween= ruleWindowingClauseBetween EOF )
            // InternalSQLParser.g:5900:2: iv_ruleWindowingClauseBetween= ruleWindowingClauseBetween EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getWindowingClauseBetweenRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleWindowingClauseBetween=ruleWindowingClauseBetween();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleWindowingClauseBetween; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleWindowingClauseBetween"


    // $ANTLR start "ruleWindowingClauseBetween"
    // InternalSQLParser.g:5906:1: ruleWindowingClauseBetween returns [EObject current=null] : (otherlv_0= BETWEEN ( (lv_wcoP_1_0= ruleWindowingClauseOperandPreceding ) ) otherlv_2= AND ( (lv_wcoF_3_0= ruleWindowingClauseOperandFollowing ) ) ) ;
    public final EObject ruleWindowingClauseBetween() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_wcoP_1_0 = null;

        EObject lv_wcoF_3_0 = null;



        	enterRule();

        try {
            // InternalSQLParser.g:5912:2: ( (otherlv_0= BETWEEN ( (lv_wcoP_1_0= ruleWindowingClauseOperandPreceding ) ) otherlv_2= AND ( (lv_wcoF_3_0= ruleWindowingClauseOperandFollowing ) ) ) )
            // InternalSQLParser.g:5913:2: (otherlv_0= BETWEEN ( (lv_wcoP_1_0= ruleWindowingClauseOperandPreceding ) ) otherlv_2= AND ( (lv_wcoF_3_0= ruleWindowingClauseOperandFollowing ) ) )
            {
            // InternalSQLParser.g:5913:2: (otherlv_0= BETWEEN ( (lv_wcoP_1_0= ruleWindowingClauseOperandPreceding ) ) otherlv_2= AND ( (lv_wcoF_3_0= ruleWindowingClauseOperandFollowing ) ) )
            // InternalSQLParser.g:5914:3: otherlv_0= BETWEEN ( (lv_wcoP_1_0= ruleWindowingClauseOperandPreceding ) ) otherlv_2= AND ( (lv_wcoF_3_0= ruleWindowingClauseOperandFollowing ) )
            {
            otherlv_0=(Token)match(input,BETWEEN,FOLLOW_82); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getWindowingClauseBetweenAccess().getBETWEENKeyword_0());
              		
            }
            // InternalSQLParser.g:5918:3: ( (lv_wcoP_1_0= ruleWindowingClauseOperandPreceding ) )
            // InternalSQLParser.g:5919:4: (lv_wcoP_1_0= ruleWindowingClauseOperandPreceding )
            {
            // InternalSQLParser.g:5919:4: (lv_wcoP_1_0= ruleWindowingClauseOperandPreceding )
            // InternalSQLParser.g:5920:5: lv_wcoP_1_0= ruleWindowingClauseOperandPreceding
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getWindowingClauseBetweenAccess().getWcoPWindowingClauseOperandPrecedingParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_71);
            lv_wcoP_1_0=ruleWindowingClauseOperandPreceding();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getWindowingClauseBetweenRule());
              					}
              					set(
              						current,
              						"wcoP",
              						lv_wcoP_1_0,
              						"org.xtext.example.mydsl_sql.SQL.WindowingClauseOperandPreceding");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_2=(Token)match(input,AND,FOLLOW_82); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getWindowingClauseBetweenAccess().getANDKeyword_2());
              		
            }
            // InternalSQLParser.g:5941:3: ( (lv_wcoF_3_0= ruleWindowingClauseOperandFollowing ) )
            // InternalSQLParser.g:5942:4: (lv_wcoF_3_0= ruleWindowingClauseOperandFollowing )
            {
            // InternalSQLParser.g:5942:4: (lv_wcoF_3_0= ruleWindowingClauseOperandFollowing )
            // InternalSQLParser.g:5943:5: lv_wcoF_3_0= ruleWindowingClauseOperandFollowing
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getWindowingClauseBetweenAccess().getWcoFWindowingClauseOperandFollowingParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_wcoF_3_0=ruleWindowingClauseOperandFollowing();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getWindowingClauseBetweenRule());
              					}
              					set(
              						current,
              						"wcoF",
              						lv_wcoF_3_0,
              						"org.xtext.example.mydsl_sql.SQL.WindowingClauseOperandFollowing");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleWindowingClauseBetween"


    // $ANTLR start "entryRuleWindowingClauseOperandFollowing"
    // InternalSQLParser.g:5964:1: entryRuleWindowingClauseOperandFollowing returns [EObject current=null] : iv_ruleWindowingClauseOperandFollowing= ruleWindowingClauseOperandFollowing EOF ;
    public final EObject entryRuleWindowingClauseOperandFollowing() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWindowingClauseOperandFollowing = null;


        try {
            // InternalSQLParser.g:5964:72: (iv_ruleWindowingClauseOperandFollowing= ruleWindowingClauseOperandFollowing EOF )
            // InternalSQLParser.g:5965:2: iv_ruleWindowingClauseOperandFollowing= ruleWindowingClauseOperandFollowing EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getWindowingClauseOperandFollowingRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleWindowingClauseOperandFollowing=ruleWindowingClauseOperandFollowing();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleWindowingClauseOperandFollowing; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleWindowingClauseOperandFollowing"


    // $ANTLR start "ruleWindowingClauseOperandFollowing"
    // InternalSQLParser.g:5971:1: ruleWindowingClauseOperandFollowing returns [EObject current=null] : ( () ( (otherlv_1= UNBOUNDED otherlv_2= KW_FOLLOWING ) | (otherlv_3= CURRENT otherlv_4= ROW ) | ( ( (lv_exp_5_0= ruleAnalyticExprArg ) ) (otherlv_6= PRECEDING | otherlv_7= KW_FOLLOWING ) ) ) ) ;
    public final EObject ruleWindowingClauseOperandFollowing() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        EObject lv_exp_5_0 = null;



        	enterRule();

        try {
            // InternalSQLParser.g:5977:2: ( ( () ( (otherlv_1= UNBOUNDED otherlv_2= KW_FOLLOWING ) | (otherlv_3= CURRENT otherlv_4= ROW ) | ( ( (lv_exp_5_0= ruleAnalyticExprArg ) ) (otherlv_6= PRECEDING | otherlv_7= KW_FOLLOWING ) ) ) ) )
            // InternalSQLParser.g:5978:2: ( () ( (otherlv_1= UNBOUNDED otherlv_2= KW_FOLLOWING ) | (otherlv_3= CURRENT otherlv_4= ROW ) | ( ( (lv_exp_5_0= ruleAnalyticExprArg ) ) (otherlv_6= PRECEDING | otherlv_7= KW_FOLLOWING ) ) ) )
            {
            // InternalSQLParser.g:5978:2: ( () ( (otherlv_1= UNBOUNDED otherlv_2= KW_FOLLOWING ) | (otherlv_3= CURRENT otherlv_4= ROW ) | ( ( (lv_exp_5_0= ruleAnalyticExprArg ) ) (otherlv_6= PRECEDING | otherlv_7= KW_FOLLOWING ) ) ) )
            // InternalSQLParser.g:5979:3: () ( (otherlv_1= UNBOUNDED otherlv_2= KW_FOLLOWING ) | (otherlv_3= CURRENT otherlv_4= ROW ) | ( ( (lv_exp_5_0= ruleAnalyticExprArg ) ) (otherlv_6= PRECEDING | otherlv_7= KW_FOLLOWING ) ) )
            {
            // InternalSQLParser.g:5979:3: ()
            // InternalSQLParser.g:5980:4: 
            {
            if ( state.backtracking==0 ) {

              				/* */
              			
            }
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getWindowingClauseOperandFollowingAccess().getWindowingClauseOperandFollowingAction_0(),
              					current);
              			
            }

            }

            // InternalSQLParser.g:5989:3: ( (otherlv_1= UNBOUNDED otherlv_2= KW_FOLLOWING ) | (otherlv_3= CURRENT otherlv_4= ROW ) | ( ( (lv_exp_5_0= ruleAnalyticExprArg ) ) (otherlv_6= PRECEDING | otherlv_7= KW_FOLLOWING ) ) )
            int alt111=3;
            switch ( input.LA(1) ) {
            case UNBOUNDED:
                {
                alt111=1;
                }
                break;
            case CURRENT:
                {
                alt111=2;
                }
                break;
            case EXTRACT:
            case CAST:
            case CASE:
            case LeftParenthesis:
            case RULE_JRPARAM:
            case RULE_JRNPARAM:
            case RULE_UNSIGNED:
            case RULE_INT:
            case RULE_SIGNED_DOUBLE:
            case RULE_STRING_:
            case RULE_STRING:
            case RULE_DBNAME:
            case RULE_ID:
                {
                alt111=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 111, 0, input);

                throw nvae;
            }

            switch (alt111) {
                case 1 :
                    // InternalSQLParser.g:5990:4: (otherlv_1= UNBOUNDED otherlv_2= KW_FOLLOWING )
                    {
                    // InternalSQLParser.g:5990:4: (otherlv_1= UNBOUNDED otherlv_2= KW_FOLLOWING )
                    // InternalSQLParser.g:5991:5: otherlv_1= UNBOUNDED otherlv_2= KW_FOLLOWING
                    {
                    otherlv_1=(Token)match(input,UNBOUNDED,FOLLOW_83); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_1, grammarAccess.getWindowingClauseOperandFollowingAccess().getUNBOUNDEDKeyword_1_0_0());
                      				
                    }
                    otherlv_2=(Token)match(input,KW_FOLLOWING,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_2, grammarAccess.getWindowingClauseOperandFollowingAccess().getFOLLOWINGKeyword_1_0_1());
                      				
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalSQLParser.g:6001:4: (otherlv_3= CURRENT otherlv_4= ROW )
                    {
                    // InternalSQLParser.g:6001:4: (otherlv_3= CURRENT otherlv_4= ROW )
                    // InternalSQLParser.g:6002:5: otherlv_3= CURRENT otherlv_4= ROW
                    {
                    otherlv_3=(Token)match(input,CURRENT,FOLLOW_84); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_3, grammarAccess.getWindowingClauseOperandFollowingAccess().getCURRENTKeyword_1_1_0());
                      				
                    }
                    otherlv_4=(Token)match(input,ROW,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_4, grammarAccess.getWindowingClauseOperandFollowingAccess().getROWKeyword_1_1_1());
                      				
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalSQLParser.g:6012:4: ( ( (lv_exp_5_0= ruleAnalyticExprArg ) ) (otherlv_6= PRECEDING | otherlv_7= KW_FOLLOWING ) )
                    {
                    // InternalSQLParser.g:6012:4: ( ( (lv_exp_5_0= ruleAnalyticExprArg ) ) (otherlv_6= PRECEDING | otherlv_7= KW_FOLLOWING ) )
                    // InternalSQLParser.g:6013:5: ( (lv_exp_5_0= ruleAnalyticExprArg ) ) (otherlv_6= PRECEDING | otherlv_7= KW_FOLLOWING )
                    {
                    // InternalSQLParser.g:6013:5: ( (lv_exp_5_0= ruleAnalyticExprArg ) )
                    // InternalSQLParser.g:6014:6: (lv_exp_5_0= ruleAnalyticExprArg )
                    {
                    // InternalSQLParser.g:6014:6: (lv_exp_5_0= ruleAnalyticExprArg )
                    // InternalSQLParser.g:6015:7: lv_exp_5_0= ruleAnalyticExprArg
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getWindowingClauseOperandFollowingAccess().getExpAnalyticExprArgParserRuleCall_1_2_0_0());
                      						
                    }
                    pushFollow(FOLLOW_85);
                    lv_exp_5_0=ruleAnalyticExprArg();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElementForParent(grammarAccess.getWindowingClauseOperandFollowingRule());
                      							}
                      							set(
                      								current,
                      								"exp",
                      								lv_exp_5_0,
                      								"org.xtext.example.mydsl_sql.SQL.AnalyticExprArg");
                      							afterParserOrEnumRuleCall();
                      						
                    }

                    }


                    }

                    // InternalSQLParser.g:6032:5: (otherlv_6= PRECEDING | otherlv_7= KW_FOLLOWING )
                    int alt110=2;
                    int LA110_0 = input.LA(1);

                    if ( (LA110_0==PRECEDING) ) {
                        alt110=1;
                    }
                    else if ( (LA110_0==KW_FOLLOWING) ) {
                        alt110=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 110, 0, input);

                        throw nvae;
                    }
                    switch (alt110) {
                        case 1 :
                            // InternalSQLParser.g:6033:6: otherlv_6= PRECEDING
                            {
                            otherlv_6=(Token)match(input,PRECEDING,FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(otherlv_6, grammarAccess.getWindowingClauseOperandFollowingAccess().getPRECEDINGKeyword_1_2_1_0());
                              					
                            }

                            }
                            break;
                        case 2 :
                            // InternalSQLParser.g:6038:6: otherlv_7= KW_FOLLOWING
                            {
                            otherlv_7=(Token)match(input,KW_FOLLOWING,FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(otherlv_7, grammarAccess.getWindowingClauseOperandFollowingAccess().getFOLLOWINGKeyword_1_2_1_1());
                              					
                            }

                            }
                            break;

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleWindowingClauseOperandFollowing"


    // $ANTLR start "entryRuleWindowingClauseOperandPreceding"
    // InternalSQLParser.g:6049:1: entryRuleWindowingClauseOperandPreceding returns [EObject current=null] : iv_ruleWindowingClauseOperandPreceding= ruleWindowingClauseOperandPreceding EOF ;
    public final EObject entryRuleWindowingClauseOperandPreceding() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWindowingClauseOperandPreceding = null;


        try {
            // InternalSQLParser.g:6049:72: (iv_ruleWindowingClauseOperandPreceding= ruleWindowingClauseOperandPreceding EOF )
            // InternalSQLParser.g:6050:2: iv_ruleWindowingClauseOperandPreceding= ruleWindowingClauseOperandPreceding EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getWindowingClauseOperandPrecedingRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleWindowingClauseOperandPreceding=ruleWindowingClauseOperandPreceding();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleWindowingClauseOperandPreceding; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleWindowingClauseOperandPreceding"


    // $ANTLR start "ruleWindowingClauseOperandPreceding"
    // InternalSQLParser.g:6056:1: ruleWindowingClauseOperandPreceding returns [EObject current=null] : ( () ( (otherlv_1= UNBOUNDED otherlv_2= PRECEDING ) | (otherlv_3= CURRENT otherlv_4= ROW ) | ( ( (lv_expr_5_0= ruleAnalyticExprArg ) ) (otherlv_6= PRECEDING | otherlv_7= KW_FOLLOWING ) ) ) ) ;
    public final EObject ruleWindowingClauseOperandPreceding() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        EObject lv_expr_5_0 = null;



        	enterRule();

        try {
            // InternalSQLParser.g:6062:2: ( ( () ( (otherlv_1= UNBOUNDED otherlv_2= PRECEDING ) | (otherlv_3= CURRENT otherlv_4= ROW ) | ( ( (lv_expr_5_0= ruleAnalyticExprArg ) ) (otherlv_6= PRECEDING | otherlv_7= KW_FOLLOWING ) ) ) ) )
            // InternalSQLParser.g:6063:2: ( () ( (otherlv_1= UNBOUNDED otherlv_2= PRECEDING ) | (otherlv_3= CURRENT otherlv_4= ROW ) | ( ( (lv_expr_5_0= ruleAnalyticExprArg ) ) (otherlv_6= PRECEDING | otherlv_7= KW_FOLLOWING ) ) ) )
            {
            // InternalSQLParser.g:6063:2: ( () ( (otherlv_1= UNBOUNDED otherlv_2= PRECEDING ) | (otherlv_3= CURRENT otherlv_4= ROW ) | ( ( (lv_expr_5_0= ruleAnalyticExprArg ) ) (otherlv_6= PRECEDING | otherlv_7= KW_FOLLOWING ) ) ) )
            // InternalSQLParser.g:6064:3: () ( (otherlv_1= UNBOUNDED otherlv_2= PRECEDING ) | (otherlv_3= CURRENT otherlv_4= ROW ) | ( ( (lv_expr_5_0= ruleAnalyticExprArg ) ) (otherlv_6= PRECEDING | otherlv_7= KW_FOLLOWING ) ) )
            {
            // InternalSQLParser.g:6064:3: ()
            // InternalSQLParser.g:6065:4: 
            {
            if ( state.backtracking==0 ) {

              				/* */
              			
            }
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getWindowingClauseOperandPrecedingAccess().getWindowingClauseOperandPrecedingAction_0(),
              					current);
              			
            }

            }

            // InternalSQLParser.g:6074:3: ( (otherlv_1= UNBOUNDED otherlv_2= PRECEDING ) | (otherlv_3= CURRENT otherlv_4= ROW ) | ( ( (lv_expr_5_0= ruleAnalyticExprArg ) ) (otherlv_6= PRECEDING | otherlv_7= KW_FOLLOWING ) ) )
            int alt113=3;
            switch ( input.LA(1) ) {
            case UNBOUNDED:
                {
                alt113=1;
                }
                break;
            case CURRENT:
                {
                alt113=2;
                }
                break;
            case EXTRACT:
            case CAST:
            case CASE:
            case LeftParenthesis:
            case RULE_JRPARAM:
            case RULE_JRNPARAM:
            case RULE_UNSIGNED:
            case RULE_INT:
            case RULE_SIGNED_DOUBLE:
            case RULE_STRING_:
            case RULE_STRING:
            case RULE_DBNAME:
            case RULE_ID:
                {
                alt113=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 113, 0, input);

                throw nvae;
            }

            switch (alt113) {
                case 1 :
                    // InternalSQLParser.g:6075:4: (otherlv_1= UNBOUNDED otherlv_2= PRECEDING )
                    {
                    // InternalSQLParser.g:6075:4: (otherlv_1= UNBOUNDED otherlv_2= PRECEDING )
                    // InternalSQLParser.g:6076:5: otherlv_1= UNBOUNDED otherlv_2= PRECEDING
                    {
                    otherlv_1=(Token)match(input,UNBOUNDED,FOLLOW_86); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_1, grammarAccess.getWindowingClauseOperandPrecedingAccess().getUNBOUNDEDKeyword_1_0_0());
                      				
                    }
                    otherlv_2=(Token)match(input,PRECEDING,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_2, grammarAccess.getWindowingClauseOperandPrecedingAccess().getPRECEDINGKeyword_1_0_1());
                      				
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalSQLParser.g:6086:4: (otherlv_3= CURRENT otherlv_4= ROW )
                    {
                    // InternalSQLParser.g:6086:4: (otherlv_3= CURRENT otherlv_4= ROW )
                    // InternalSQLParser.g:6087:5: otherlv_3= CURRENT otherlv_4= ROW
                    {
                    otherlv_3=(Token)match(input,CURRENT,FOLLOW_84); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_3, grammarAccess.getWindowingClauseOperandPrecedingAccess().getCURRENTKeyword_1_1_0());
                      				
                    }
                    otherlv_4=(Token)match(input,ROW,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_4, grammarAccess.getWindowingClauseOperandPrecedingAccess().getROWKeyword_1_1_1());
                      				
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalSQLParser.g:6097:4: ( ( (lv_expr_5_0= ruleAnalyticExprArg ) ) (otherlv_6= PRECEDING | otherlv_7= KW_FOLLOWING ) )
                    {
                    // InternalSQLParser.g:6097:4: ( ( (lv_expr_5_0= ruleAnalyticExprArg ) ) (otherlv_6= PRECEDING | otherlv_7= KW_FOLLOWING ) )
                    // InternalSQLParser.g:6098:5: ( (lv_expr_5_0= ruleAnalyticExprArg ) ) (otherlv_6= PRECEDING | otherlv_7= KW_FOLLOWING )
                    {
                    // InternalSQLParser.g:6098:5: ( (lv_expr_5_0= ruleAnalyticExprArg ) )
                    // InternalSQLParser.g:6099:6: (lv_expr_5_0= ruleAnalyticExprArg )
                    {
                    // InternalSQLParser.g:6099:6: (lv_expr_5_0= ruleAnalyticExprArg )
                    // InternalSQLParser.g:6100:7: lv_expr_5_0= ruleAnalyticExprArg
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getWindowingClauseOperandPrecedingAccess().getExprAnalyticExprArgParserRuleCall_1_2_0_0());
                      						
                    }
                    pushFollow(FOLLOW_85);
                    lv_expr_5_0=ruleAnalyticExprArg();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElementForParent(grammarAccess.getWindowingClauseOperandPrecedingRule());
                      							}
                      							set(
                      								current,
                      								"expr",
                      								lv_expr_5_0,
                      								"org.xtext.example.mydsl_sql.SQL.AnalyticExprArg");
                      							afterParserOrEnumRuleCall();
                      						
                    }

                    }


                    }

                    // InternalSQLParser.g:6117:5: (otherlv_6= PRECEDING | otherlv_7= KW_FOLLOWING )
                    int alt112=2;
                    int LA112_0 = input.LA(1);

                    if ( (LA112_0==PRECEDING) ) {
                        alt112=1;
                    }
                    else if ( (LA112_0==KW_FOLLOWING) ) {
                        alt112=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 112, 0, input);

                        throw nvae;
                    }
                    switch (alt112) {
                        case 1 :
                            // InternalSQLParser.g:6118:6: otherlv_6= PRECEDING
                            {
                            otherlv_6=(Token)match(input,PRECEDING,FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(otherlv_6, grammarAccess.getWindowingClauseOperandPrecedingAccess().getPRECEDINGKeyword_1_2_1_0());
                              					
                            }

                            }
                            break;
                        case 2 :
                            // InternalSQLParser.g:6123:6: otherlv_7= KW_FOLLOWING
                            {
                            otherlv_7=(Token)match(input,KW_FOLLOWING,FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(otherlv_7, grammarAccess.getWindowingClauseOperandPrecedingAccess().getFOLLOWINGKeyword_1_2_1_1());
                              					
                            }

                            }
                            break;

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleWindowingClauseOperandPreceding"


    // $ANTLR start "entryRuleOrderByClause"
    // InternalSQLParser.g:6134:1: entryRuleOrderByClause returns [EObject current=null] : iv_ruleOrderByClause= ruleOrderByClause EOF ;
    public final EObject entryRuleOrderByClause() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrderByClause = null;


        try {
            // InternalSQLParser.g:6134:54: (iv_ruleOrderByClause= ruleOrderByClause EOF )
            // InternalSQLParser.g:6135:2: iv_ruleOrderByClause= ruleOrderByClause EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOrderByClauseRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleOrderByClause=ruleOrderByClause();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOrderByClause; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOrderByClause"


    // $ANTLR start "ruleOrderByClause"
    // InternalSQLParser.g:6141:1: ruleOrderByClause returns [EObject current=null] : ( ( (otherlv_0= ORDER otherlv_1= BY ) | (otherlv_2= ORDER otherlv_3= SIBLINGS otherlv_4= BY ) ) ( (lv_args_5_0= ruleOrderByClauseArgs ) ) ) ;
    public final EObject ruleOrderByClause() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        EObject lv_args_5_0 = null;



        	enterRule();

        try {
            // InternalSQLParser.g:6147:2: ( ( ( (otherlv_0= ORDER otherlv_1= BY ) | (otherlv_2= ORDER otherlv_3= SIBLINGS otherlv_4= BY ) ) ( (lv_args_5_0= ruleOrderByClauseArgs ) ) ) )
            // InternalSQLParser.g:6148:2: ( ( (otherlv_0= ORDER otherlv_1= BY ) | (otherlv_2= ORDER otherlv_3= SIBLINGS otherlv_4= BY ) ) ( (lv_args_5_0= ruleOrderByClauseArgs ) ) )
            {
            // InternalSQLParser.g:6148:2: ( ( (otherlv_0= ORDER otherlv_1= BY ) | (otherlv_2= ORDER otherlv_3= SIBLINGS otherlv_4= BY ) ) ( (lv_args_5_0= ruleOrderByClauseArgs ) ) )
            // InternalSQLParser.g:6149:3: ( (otherlv_0= ORDER otherlv_1= BY ) | (otherlv_2= ORDER otherlv_3= SIBLINGS otherlv_4= BY ) ) ( (lv_args_5_0= ruleOrderByClauseArgs ) )
            {
            // InternalSQLParser.g:6149:3: ( (otherlv_0= ORDER otherlv_1= BY ) | (otherlv_2= ORDER otherlv_3= SIBLINGS otherlv_4= BY ) )
            int alt114=2;
            int LA114_0 = input.LA(1);

            if ( (LA114_0==ORDER) ) {
                int LA114_1 = input.LA(2);

                if ( (LA114_1==SIBLINGS) ) {
                    alt114=2;
                }
                else if ( (LA114_1==BY) ) {
                    alt114=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 114, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 114, 0, input);

                throw nvae;
            }
            switch (alt114) {
                case 1 :
                    // InternalSQLParser.g:6150:4: (otherlv_0= ORDER otherlv_1= BY )
                    {
                    // InternalSQLParser.g:6150:4: (otherlv_0= ORDER otherlv_1= BY )
                    // InternalSQLParser.g:6151:5: otherlv_0= ORDER otherlv_1= BY
                    {
                    otherlv_0=(Token)match(input,ORDER,FOLLOW_25); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_0, grammarAccess.getOrderByClauseAccess().getORDERKeyword_0_0_0());
                      				
                    }
                    otherlv_1=(Token)match(input,BY,FOLLOW_82); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_1, grammarAccess.getOrderByClauseAccess().getBYKeyword_0_0_1());
                      				
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalSQLParser.g:6161:4: (otherlv_2= ORDER otherlv_3= SIBLINGS otherlv_4= BY )
                    {
                    // InternalSQLParser.g:6161:4: (otherlv_2= ORDER otherlv_3= SIBLINGS otherlv_4= BY )
                    // InternalSQLParser.g:6162:5: otherlv_2= ORDER otherlv_3= SIBLINGS otherlv_4= BY
                    {
                    otherlv_2=(Token)match(input,ORDER,FOLLOW_87); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_2, grammarAccess.getOrderByClauseAccess().getORDERKeyword_0_1_0());
                      				
                    }
                    otherlv_3=(Token)match(input,SIBLINGS,FOLLOW_25); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_3, grammarAccess.getOrderByClauseAccess().getSIBLINGSKeyword_0_1_1());
                      				
                    }
                    otherlv_4=(Token)match(input,BY,FOLLOW_82); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_4, grammarAccess.getOrderByClauseAccess().getBYKeyword_0_1_2());
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalSQLParser.g:6176:3: ( (lv_args_5_0= ruleOrderByClauseArgs ) )
            // InternalSQLParser.g:6177:4: (lv_args_5_0= ruleOrderByClauseArgs )
            {
            // InternalSQLParser.g:6177:4: (lv_args_5_0= ruleOrderByClauseArgs )
            // InternalSQLParser.g:6178:5: lv_args_5_0= ruleOrderByClauseArgs
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getOrderByClauseAccess().getArgsOrderByClauseArgsParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_args_5_0=ruleOrderByClauseArgs();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getOrderByClauseRule());
              					}
              					set(
              						current,
              						"args",
              						lv_args_5_0,
              						"org.xtext.example.mydsl_sql.SQL.OrderByClauseArgs");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOrderByClause"


    // $ANTLR start "entryRuleOrderByClauseArgs"
    // InternalSQLParser.g:6199:1: entryRuleOrderByClauseArgs returns [EObject current=null] : iv_ruleOrderByClauseArgs= ruleOrderByClauseArgs EOF ;
    public final EObject entryRuleOrderByClauseArgs() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrderByClauseArgs = null;


        try {
            // InternalSQLParser.g:6199:58: (iv_ruleOrderByClauseArgs= ruleOrderByClauseArgs EOF )
            // InternalSQLParser.g:6200:2: iv_ruleOrderByClauseArgs= ruleOrderByClauseArgs EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOrderByClauseArgsRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleOrderByClauseArgs=ruleOrderByClauseArgs();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOrderByClauseArgs; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOrderByClauseArgs"


    // $ANTLR start "ruleOrderByClauseArgs"
    // InternalSQLParser.g:6206:1: ruleOrderByClauseArgs returns [EObject current=null] : (this_OrderByClauseArg_0= ruleOrderByClauseArg ( () (otherlv_2= Comma ( (lv_entries_3_0= ruleOrderByClauseArg ) ) )+ )? ) ;
    public final EObject ruleOrderByClauseArgs() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_OrderByClauseArg_0 = null;

        EObject lv_entries_3_0 = null;



        	enterRule();

        try {
            // InternalSQLParser.g:6212:2: ( (this_OrderByClauseArg_0= ruleOrderByClauseArg ( () (otherlv_2= Comma ( (lv_entries_3_0= ruleOrderByClauseArg ) ) )+ )? ) )
            // InternalSQLParser.g:6213:2: (this_OrderByClauseArg_0= ruleOrderByClauseArg ( () (otherlv_2= Comma ( (lv_entries_3_0= ruleOrderByClauseArg ) ) )+ )? )
            {
            // InternalSQLParser.g:6213:2: (this_OrderByClauseArg_0= ruleOrderByClauseArg ( () (otherlv_2= Comma ( (lv_entries_3_0= ruleOrderByClauseArg ) ) )+ )? )
            // InternalSQLParser.g:6214:3: this_OrderByClauseArg_0= ruleOrderByClauseArg ( () (otherlv_2= Comma ( (lv_entries_3_0= ruleOrderByClauseArg ) ) )+ )?
            {
            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getOrderByClauseArgsAccess().getOrderByClauseArgParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_9);
            this_OrderByClauseArg_0=ruleOrderByClauseArg();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_OrderByClauseArg_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalSQLParser.g:6225:3: ( () (otherlv_2= Comma ( (lv_entries_3_0= ruleOrderByClauseArg ) ) )+ )?
            int alt116=2;
            int LA116_0 = input.LA(1);

            if ( (LA116_0==Comma) ) {
                alt116=1;
            }
            switch (alt116) {
                case 1 :
                    // InternalSQLParser.g:6226:4: () (otherlv_2= Comma ( (lv_entries_3_0= ruleOrderByClauseArg ) ) )+
                    {
                    // InternalSQLParser.g:6226:4: ()
                    // InternalSQLParser.g:6227:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					/* */
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElementAndAdd(
                      						grammarAccess.getOrderByClauseArgsAccess().getOBCArgsEntriesAction_1_0(),
                      						current);
                      				
                    }

                    }

                    // InternalSQLParser.g:6236:4: (otherlv_2= Comma ( (lv_entries_3_0= ruleOrderByClauseArg ) ) )+
                    int cnt115=0;
                    loop115:
                    do {
                        int alt115=2;
                        int LA115_0 = input.LA(1);

                        if ( (LA115_0==Comma) ) {
                            alt115=1;
                        }


                        switch (alt115) {
                    	case 1 :
                    	    // InternalSQLParser.g:6237:5: otherlv_2= Comma ( (lv_entries_3_0= ruleOrderByClauseArg ) )
                    	    {
                    	    otherlv_2=(Token)match(input,Comma,FOLLOW_82); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_2, grammarAccess.getOrderByClauseArgsAccess().getCommaKeyword_1_1_0());
                    	      				
                    	    }
                    	    // InternalSQLParser.g:6241:5: ( (lv_entries_3_0= ruleOrderByClauseArg ) )
                    	    // InternalSQLParser.g:6242:6: (lv_entries_3_0= ruleOrderByClauseArg )
                    	    {
                    	    // InternalSQLParser.g:6242:6: (lv_entries_3_0= ruleOrderByClauseArg )
                    	    // InternalSQLParser.g:6243:7: lv_entries_3_0= ruleOrderByClauseArg
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getOrderByClauseArgsAccess().getEntriesOrderByClauseArgParserRuleCall_1_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_9);
                    	    lv_entries_3_0=ruleOrderByClauseArg();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getOrderByClauseArgsRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"entries",
                    	      								lv_entries_3_0,
                    	      								"org.xtext.example.mydsl_sql.SQL.OrderByClauseArg");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt115 >= 1 ) break loop115;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(115, input);
                                throw eee;
                        }
                        cnt115++;
                    } while (true);


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOrderByClauseArgs"


    // $ANTLR start "entryRuleOrderByClauseArg"
    // InternalSQLParser.g:6266:1: entryRuleOrderByClauseArg returns [EObject current=null] : iv_ruleOrderByClauseArg= ruleOrderByClauseArg EOF ;
    public final EObject entryRuleOrderByClauseArg() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrderByClauseArg = null;


        try {
            // InternalSQLParser.g:6266:57: (iv_ruleOrderByClauseArg= ruleOrderByClauseArg EOF )
            // InternalSQLParser.g:6267:2: iv_ruleOrderByClauseArg= ruleOrderByClauseArg EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOrderByClauseArgRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleOrderByClauseArg=ruleOrderByClauseArg();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOrderByClauseArg; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOrderByClauseArg"


    // $ANTLR start "ruleOrderByClauseArg"
    // InternalSQLParser.g:6273:1: ruleOrderByClauseArg returns [EObject current=null] : ( ( (lv_col_0_0= ruleAnalyticExprArg ) ) (otherlv_1= ASC | otherlv_2= DESC )? (otherlv_3= NULLS (otherlv_4= FIRST | otherlv_5= LAST ) )? ) ;
    public final EObject ruleOrderByClauseArg() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        EObject lv_col_0_0 = null;



        	enterRule();

        try {
            // InternalSQLParser.g:6279:2: ( ( ( (lv_col_0_0= ruleAnalyticExprArg ) ) (otherlv_1= ASC | otherlv_2= DESC )? (otherlv_3= NULLS (otherlv_4= FIRST | otherlv_5= LAST ) )? ) )
            // InternalSQLParser.g:6280:2: ( ( (lv_col_0_0= ruleAnalyticExprArg ) ) (otherlv_1= ASC | otherlv_2= DESC )? (otherlv_3= NULLS (otherlv_4= FIRST | otherlv_5= LAST ) )? )
            {
            // InternalSQLParser.g:6280:2: ( ( (lv_col_0_0= ruleAnalyticExprArg ) ) (otherlv_1= ASC | otherlv_2= DESC )? (otherlv_3= NULLS (otherlv_4= FIRST | otherlv_5= LAST ) )? )
            // InternalSQLParser.g:6281:3: ( (lv_col_0_0= ruleAnalyticExprArg ) ) (otherlv_1= ASC | otherlv_2= DESC )? (otherlv_3= NULLS (otherlv_4= FIRST | otherlv_5= LAST ) )?
            {
            // InternalSQLParser.g:6281:3: ( (lv_col_0_0= ruleAnalyticExprArg ) )
            // InternalSQLParser.g:6282:4: (lv_col_0_0= ruleAnalyticExprArg )
            {
            // InternalSQLParser.g:6282:4: (lv_col_0_0= ruleAnalyticExprArg )
            // InternalSQLParser.g:6283:5: lv_col_0_0= ruleAnalyticExprArg
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getOrderByClauseArgAccess().getColAnalyticExprArgParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_88);
            lv_col_0_0=ruleAnalyticExprArg();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getOrderByClauseArgRule());
              					}
              					set(
              						current,
              						"col",
              						lv_col_0_0,
              						"org.xtext.example.mydsl_sql.SQL.AnalyticExprArg");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalSQLParser.g:6300:3: (otherlv_1= ASC | otherlv_2= DESC )?
            int alt117=3;
            int LA117_0 = input.LA(1);

            if ( (LA117_0==ASC) ) {
                alt117=1;
            }
            else if ( (LA117_0==DESC) ) {
                alt117=2;
            }
            switch (alt117) {
                case 1 :
                    // InternalSQLParser.g:6301:4: otherlv_1= ASC
                    {
                    otherlv_1=(Token)match(input,ASC,FOLLOW_89); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getOrderByClauseArgAccess().getASCKeyword_1_0());
                      			
                    }

                    }
                    break;
                case 2 :
                    // InternalSQLParser.g:6306:4: otherlv_2= DESC
                    {
                    otherlv_2=(Token)match(input,DESC,FOLLOW_89); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getOrderByClauseArgAccess().getDESCKeyword_1_1());
                      			
                    }

                    }
                    break;

            }

            // InternalSQLParser.g:6311:3: (otherlv_3= NULLS (otherlv_4= FIRST | otherlv_5= LAST ) )?
            int alt119=2;
            int LA119_0 = input.LA(1);

            if ( (LA119_0==NULLS) ) {
                alt119=1;
            }
            switch (alt119) {
                case 1 :
                    // InternalSQLParser.g:6312:4: otherlv_3= NULLS (otherlv_4= FIRST | otherlv_5= LAST )
                    {
                    otherlv_3=(Token)match(input,NULLS,FOLLOW_90); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getOrderByClauseArgAccess().getNULLSKeyword_2_0());
                      			
                    }
                    // InternalSQLParser.g:6316:4: (otherlv_4= FIRST | otherlv_5= LAST )
                    int alt118=2;
                    int LA118_0 = input.LA(1);

                    if ( (LA118_0==FIRST) ) {
                        alt118=1;
                    }
                    else if ( (LA118_0==LAST) ) {
                        alt118=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 118, 0, input);

                        throw nvae;
                    }
                    switch (alt118) {
                        case 1 :
                            // InternalSQLParser.g:6317:5: otherlv_4= FIRST
                            {
                            otherlv_4=(Token)match(input,FIRST,FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_4, grammarAccess.getOrderByClauseArgAccess().getFIRSTKeyword_2_1_0());
                              				
                            }

                            }
                            break;
                        case 2 :
                            // InternalSQLParser.g:6322:5: otherlv_5= LAST
                            {
                            otherlv_5=(Token)match(input,LAST,FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_5, grammarAccess.getOrderByClauseArgAccess().getLASTKeyword_2_1_1());
                              				
                            }

                            }
                            break;

                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOrderByClauseArg"


    // $ANTLR start "entryRuleQueryPartitionClause"
    // InternalSQLParser.g:6332:1: entryRuleQueryPartitionClause returns [EObject current=null] : iv_ruleQueryPartitionClause= ruleQueryPartitionClause EOF ;
    public final EObject entryRuleQueryPartitionClause() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQueryPartitionClause = null;


        try {
            // InternalSQLParser.g:6332:61: (iv_ruleQueryPartitionClause= ruleQueryPartitionClause EOF )
            // InternalSQLParser.g:6333:2: iv_ruleQueryPartitionClause= ruleQueryPartitionClause EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQueryPartitionClauseRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleQueryPartitionClause=ruleQueryPartitionClause();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQueryPartitionClause; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleQueryPartitionClause"


    // $ANTLR start "ruleQueryPartitionClause"
    // InternalSQLParser.g:6339:1: ruleQueryPartitionClause returns [EObject current=null] : (otherlv_0= PARTITION otherlv_1= BY ( ( (lv_args_2_0= ruleAnalyticExprArgs ) ) | (otherlv_3= LeftParenthesis this_AnalyticExprArgs_4= ruleAnalyticExprArgs otherlv_5= RightParenthesis ) ) ) ;
    public final EObject ruleQueryPartitionClause() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_args_2_0 = null;

        EObject this_AnalyticExprArgs_4 = null;



        	enterRule();

        try {
            // InternalSQLParser.g:6345:2: ( (otherlv_0= PARTITION otherlv_1= BY ( ( (lv_args_2_0= ruleAnalyticExprArgs ) ) | (otherlv_3= LeftParenthesis this_AnalyticExprArgs_4= ruleAnalyticExprArgs otherlv_5= RightParenthesis ) ) ) )
            // InternalSQLParser.g:6346:2: (otherlv_0= PARTITION otherlv_1= BY ( ( (lv_args_2_0= ruleAnalyticExprArgs ) ) | (otherlv_3= LeftParenthesis this_AnalyticExprArgs_4= ruleAnalyticExprArgs otherlv_5= RightParenthesis ) ) )
            {
            // InternalSQLParser.g:6346:2: (otherlv_0= PARTITION otherlv_1= BY ( ( (lv_args_2_0= ruleAnalyticExprArgs ) ) | (otherlv_3= LeftParenthesis this_AnalyticExprArgs_4= ruleAnalyticExprArgs otherlv_5= RightParenthesis ) ) )
            // InternalSQLParser.g:6347:3: otherlv_0= PARTITION otherlv_1= BY ( ( (lv_args_2_0= ruleAnalyticExprArgs ) ) | (otherlv_3= LeftParenthesis this_AnalyticExprArgs_4= ruleAnalyticExprArgs otherlv_5= RightParenthesis ) )
            {
            otherlv_0=(Token)match(input,PARTITION,FOLLOW_25); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getQueryPartitionClauseAccess().getPARTITIONKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,BY,FOLLOW_82); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getQueryPartitionClauseAccess().getBYKeyword_1());
              		
            }
            // InternalSQLParser.g:6355:3: ( ( (lv_args_2_0= ruleAnalyticExprArgs ) ) | (otherlv_3= LeftParenthesis this_AnalyticExprArgs_4= ruleAnalyticExprArgs otherlv_5= RightParenthesis ) )
            int alt120=2;
            int LA120_0 = input.LA(1);

            if ( (LA120_0==EXTRACT||LA120_0==CAST||LA120_0==CASE||(LA120_0>=RULE_JRPARAM && LA120_0<=RULE_JRNPARAM)||(LA120_0>=RULE_UNSIGNED && LA120_0<=RULE_SIGNED_DOUBLE)||(LA120_0>=RULE_STRING_ && LA120_0<=RULE_ID)) ) {
                alt120=1;
            }
            else if ( (LA120_0==LeftParenthesis) ) {
                int LA120_2 = input.LA(2);

                if ( (LA120_2==EXTRACT||LA120_2==CAST||LA120_2==CASE||LA120_2==LeftParenthesis||(LA120_2>=RULE_JRPARAM && LA120_2<=RULE_JRNPARAM)||(LA120_2>=RULE_UNSIGNED && LA120_2<=RULE_SIGNED_DOUBLE)||(LA120_2>=RULE_STRING_ && LA120_2<=RULE_ID)) ) {
                    alt120=2;
                }
                else if ( (LA120_2==SELECT) ) {
                    alt120=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 120, 2, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 120, 0, input);

                throw nvae;
            }
            switch (alt120) {
                case 1 :
                    // InternalSQLParser.g:6356:4: ( (lv_args_2_0= ruleAnalyticExprArgs ) )
                    {
                    // InternalSQLParser.g:6356:4: ( (lv_args_2_0= ruleAnalyticExprArgs ) )
                    // InternalSQLParser.g:6357:5: (lv_args_2_0= ruleAnalyticExprArgs )
                    {
                    // InternalSQLParser.g:6357:5: (lv_args_2_0= ruleAnalyticExprArgs )
                    // InternalSQLParser.g:6358:6: lv_args_2_0= ruleAnalyticExprArgs
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getQueryPartitionClauseAccess().getArgsAnalyticExprArgsParserRuleCall_2_0_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_args_2_0=ruleAnalyticExprArgs();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getQueryPartitionClauseRule());
                      						}
                      						set(
                      							current,
                      							"args",
                      							lv_args_2_0,
                      							"org.xtext.example.mydsl_sql.SQL.AnalyticExprArgs");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalSQLParser.g:6376:4: (otherlv_3= LeftParenthesis this_AnalyticExprArgs_4= ruleAnalyticExprArgs otherlv_5= RightParenthesis )
                    {
                    // InternalSQLParser.g:6376:4: (otherlv_3= LeftParenthesis this_AnalyticExprArgs_4= ruleAnalyticExprArgs otherlv_5= RightParenthesis )
                    // InternalSQLParser.g:6377:5: otherlv_3= LeftParenthesis this_AnalyticExprArgs_4= ruleAnalyticExprArgs otherlv_5= RightParenthesis
                    {
                    otherlv_3=(Token)match(input,LeftParenthesis,FOLLOW_82); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_3, grammarAccess.getQueryPartitionClauseAccess().getLeftParenthesisKeyword_2_1_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					/* */
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getQueryPartitionClauseAccess().getAnalyticExprArgsParserRuleCall_2_1_1());
                      				
                    }
                    pushFollow(FOLLOW_8);
                    this_AnalyticExprArgs_4=ruleAnalyticExprArgs();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					current = this_AnalyticExprArgs_4;
                      					afterParserOrEnumRuleCall();
                      				
                    }
                    otherlv_5=(Token)match(input,RightParenthesis,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_5, grammarAccess.getQueryPartitionClauseAccess().getRightParenthesisKeyword_2_1_2());
                      				
                    }

                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleQueryPartitionClause"


    // $ANTLR start "entryRuleAnalyticExprArgs"
    // InternalSQLParser.g:6402:1: entryRuleAnalyticExprArgs returns [EObject current=null] : iv_ruleAnalyticExprArgs= ruleAnalyticExprArgs EOF ;
    public final EObject entryRuleAnalyticExprArgs() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnalyticExprArgs = null;


        try {
            // InternalSQLParser.g:6402:57: (iv_ruleAnalyticExprArgs= ruleAnalyticExprArgs EOF )
            // InternalSQLParser.g:6403:2: iv_ruleAnalyticExprArgs= ruleAnalyticExprArgs EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAnalyticExprArgsRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleAnalyticExprArgs=ruleAnalyticExprArgs();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAnalyticExprArgs; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAnalyticExprArgs"


    // $ANTLR start "ruleAnalyticExprArgs"
    // InternalSQLParser.g:6409:1: ruleAnalyticExprArgs returns [EObject current=null] : (this_AnalyticExprArg_0= ruleAnalyticExprArg ( () (otherlv_2= Comma ( (lv_entries_3_0= ruleAnalyticExprArg ) ) )+ )? ) ;
    public final EObject ruleAnalyticExprArgs() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_AnalyticExprArg_0 = null;

        EObject lv_entries_3_0 = null;



        	enterRule();

        try {
            // InternalSQLParser.g:6415:2: ( (this_AnalyticExprArg_0= ruleAnalyticExprArg ( () (otherlv_2= Comma ( (lv_entries_3_0= ruleAnalyticExprArg ) ) )+ )? ) )
            // InternalSQLParser.g:6416:2: (this_AnalyticExprArg_0= ruleAnalyticExprArg ( () (otherlv_2= Comma ( (lv_entries_3_0= ruleAnalyticExprArg ) ) )+ )? )
            {
            // InternalSQLParser.g:6416:2: (this_AnalyticExprArg_0= ruleAnalyticExprArg ( () (otherlv_2= Comma ( (lv_entries_3_0= ruleAnalyticExprArg ) ) )+ )? )
            // InternalSQLParser.g:6417:3: this_AnalyticExprArg_0= ruleAnalyticExprArg ( () (otherlv_2= Comma ( (lv_entries_3_0= ruleAnalyticExprArg ) ) )+ )?
            {
            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getAnalyticExprArgsAccess().getAnalyticExprArgParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_9);
            this_AnalyticExprArg_0=ruleAnalyticExprArg();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_AnalyticExprArg_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalSQLParser.g:6428:3: ( () (otherlv_2= Comma ( (lv_entries_3_0= ruleAnalyticExprArg ) ) )+ )?
            int alt122=2;
            int LA122_0 = input.LA(1);

            if ( (LA122_0==Comma) ) {
                alt122=1;
            }
            switch (alt122) {
                case 1 :
                    // InternalSQLParser.g:6429:4: () (otherlv_2= Comma ( (lv_entries_3_0= ruleAnalyticExprArg ) ) )+
                    {
                    // InternalSQLParser.g:6429:4: ()
                    // InternalSQLParser.g:6430:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					/* */
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElementAndAdd(
                      						grammarAccess.getAnalyticExprArgsAccess().getAExpArgsEntriesAction_1_0(),
                      						current);
                      				
                    }

                    }

                    // InternalSQLParser.g:6439:4: (otherlv_2= Comma ( (lv_entries_3_0= ruleAnalyticExprArg ) ) )+
                    int cnt121=0;
                    loop121:
                    do {
                        int alt121=2;
                        int LA121_0 = input.LA(1);

                        if ( (LA121_0==Comma) ) {
                            alt121=1;
                        }


                        switch (alt121) {
                    	case 1 :
                    	    // InternalSQLParser.g:6440:5: otherlv_2= Comma ( (lv_entries_3_0= ruleAnalyticExprArg ) )
                    	    {
                    	    otherlv_2=(Token)match(input,Comma,FOLLOW_82); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_2, grammarAccess.getAnalyticExprArgsAccess().getCommaKeyword_1_1_0());
                    	      				
                    	    }
                    	    // InternalSQLParser.g:6444:5: ( (lv_entries_3_0= ruleAnalyticExprArg ) )
                    	    // InternalSQLParser.g:6445:6: (lv_entries_3_0= ruleAnalyticExprArg )
                    	    {
                    	    // InternalSQLParser.g:6445:6: (lv_entries_3_0= ruleAnalyticExprArg )
                    	    // InternalSQLParser.g:6446:7: lv_entries_3_0= ruleAnalyticExprArg
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getAnalyticExprArgsAccess().getEntriesAnalyticExprArgParserRuleCall_1_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_9);
                    	    lv_entries_3_0=ruleAnalyticExprArg();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getAnalyticExprArgsRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"entries",
                    	      								lv_entries_3_0,
                    	      								"org.xtext.example.mydsl_sql.SQL.AnalyticExprArg");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt121 >= 1 ) break loop121;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(121, input);
                                throw eee;
                        }
                        cnt121++;
                    } while (true);


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAnalyticExprArgs"


    // $ANTLR start "entryRuleAnalyticExprArg"
    // InternalSQLParser.g:6469:1: entryRuleAnalyticExprArg returns [EObject current=null] : iv_ruleAnalyticExprArg= ruleAnalyticExprArg EOF ;
    public final EObject entryRuleAnalyticExprArg() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnalyticExprArg = null;


        try {
            // InternalSQLParser.g:6469:56: (iv_ruleAnalyticExprArg= ruleAnalyticExprArg EOF )
            // InternalSQLParser.g:6470:2: iv_ruleAnalyticExprArg= ruleAnalyticExprArg EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAnalyticExprArgRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleAnalyticExprArg=ruleAnalyticExprArg();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAnalyticExprArg; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAnalyticExprArg"


    // $ANTLR start "ruleAnalyticExprArg"
    // InternalSQLParser.g:6476:1: ruleAnalyticExprArg returns [EObject current=null] : ( ( (lv_ce_0_0= ruleOperand ) ) ( (lv_colAlias_1_0= ruleDbObjectName ) )? ) ;
    public final EObject ruleAnalyticExprArg() throws RecognitionException {
        EObject current = null;

        EObject lv_ce_0_0 = null;

        EObject lv_colAlias_1_0 = null;



        	enterRule();

        try {
            // InternalSQLParser.g:6482:2: ( ( ( (lv_ce_0_0= ruleOperand ) ) ( (lv_colAlias_1_0= ruleDbObjectName ) )? ) )
            // InternalSQLParser.g:6483:2: ( ( (lv_ce_0_0= ruleOperand ) ) ( (lv_colAlias_1_0= ruleDbObjectName ) )? )
            {
            // InternalSQLParser.g:6483:2: ( ( (lv_ce_0_0= ruleOperand ) ) ( (lv_colAlias_1_0= ruleDbObjectName ) )? )
            // InternalSQLParser.g:6484:3: ( (lv_ce_0_0= ruleOperand ) ) ( (lv_colAlias_1_0= ruleDbObjectName ) )?
            {
            // InternalSQLParser.g:6484:3: ( (lv_ce_0_0= ruleOperand ) )
            // InternalSQLParser.g:6485:4: (lv_ce_0_0= ruleOperand )
            {
            // InternalSQLParser.g:6485:4: (lv_ce_0_0= ruleOperand )
            // InternalSQLParser.g:6486:5: lv_ce_0_0= ruleOperand
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getAnalyticExprArgAccess().getCeOperandParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_36);
            lv_ce_0_0=ruleOperand();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getAnalyticExprArgRule());
              					}
              					set(
              						current,
              						"ce",
              						lv_ce_0_0,
              						"org.xtext.example.mydsl_sql.SQL.Operand");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalSQLParser.g:6503:3: ( (lv_colAlias_1_0= ruleDbObjectName ) )?
            int alt123=2;
            int LA123_0 = input.LA(1);

            if ( ((LA123_0>=RULE_STRING && LA123_0<=RULE_ID)) ) {
                alt123=1;
            }
            switch (alt123) {
                case 1 :
                    // InternalSQLParser.g:6504:4: (lv_colAlias_1_0= ruleDbObjectName )
                    {
                    // InternalSQLParser.g:6504:4: (lv_colAlias_1_0= ruleDbObjectName )
                    // InternalSQLParser.g:6505:5: lv_colAlias_1_0= ruleDbObjectName
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getAnalyticExprArgAccess().getColAliasDbObjectNameParserRuleCall_1_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_colAlias_1_0=ruleDbObjectName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getAnalyticExprArgRule());
                      					}
                      					set(
                      						current,
                      						"colAlias",
                      						lv_colAlias_1_0,
                      						"org.xtext.example.mydsl_sql.SQL.DbObjectName");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAnalyticExprArg"


    // $ANTLR start "entryRuleOpFunctionArg"
    // InternalSQLParser.g:6526:1: entryRuleOpFunctionArg returns [EObject current=null] : iv_ruleOpFunctionArg= ruleOpFunctionArg EOF ;
    public final EObject entryRuleOpFunctionArg() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOpFunctionArg = null;


        try {
            // InternalSQLParser.g:6526:54: (iv_ruleOpFunctionArg= ruleOpFunctionArg EOF )
            // InternalSQLParser.g:6527:2: iv_ruleOpFunctionArg= ruleOpFunctionArg EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpFunctionArgRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleOpFunctionArg=ruleOpFunctionArg();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpFunctionArg; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOpFunctionArg"


    // $ANTLR start "ruleOpFunctionArg"
    // InternalSQLParser.g:6533:1: ruleOpFunctionArg returns [EObject current=null] : (this_OpFunctionArgOperand_0= ruleOpFunctionArgOperand ( () (otherlv_2= Comma ( (lv_entries_3_0= ruleOpFunctionArgOperand ) ) )+ )? ) ;
    public final EObject ruleOpFunctionArg() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_OpFunctionArgOperand_0 = null;

        EObject lv_entries_3_0 = null;



        	enterRule();

        try {
            // InternalSQLParser.g:6539:2: ( (this_OpFunctionArgOperand_0= ruleOpFunctionArgOperand ( () (otherlv_2= Comma ( (lv_entries_3_0= ruleOpFunctionArgOperand ) ) )+ )? ) )
            // InternalSQLParser.g:6540:2: (this_OpFunctionArgOperand_0= ruleOpFunctionArgOperand ( () (otherlv_2= Comma ( (lv_entries_3_0= ruleOpFunctionArgOperand ) ) )+ )? )
            {
            // InternalSQLParser.g:6540:2: (this_OpFunctionArgOperand_0= ruleOpFunctionArgOperand ( () (otherlv_2= Comma ( (lv_entries_3_0= ruleOpFunctionArgOperand ) ) )+ )? )
            // InternalSQLParser.g:6541:3: this_OpFunctionArgOperand_0= ruleOpFunctionArgOperand ( () (otherlv_2= Comma ( (lv_entries_3_0= ruleOpFunctionArgOperand ) ) )+ )?
            {
            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getOpFunctionArgAccess().getOpFunctionArgOperandParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_9);
            this_OpFunctionArgOperand_0=ruleOpFunctionArgOperand();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_OpFunctionArgOperand_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalSQLParser.g:6552:3: ( () (otherlv_2= Comma ( (lv_entries_3_0= ruleOpFunctionArgOperand ) ) )+ )?
            int alt125=2;
            int LA125_0 = input.LA(1);

            if ( (LA125_0==Comma) ) {
                alt125=1;
            }
            switch (alt125) {
                case 1 :
                    // InternalSQLParser.g:6553:4: () (otherlv_2= Comma ( (lv_entries_3_0= ruleOpFunctionArgOperand ) ) )+
                    {
                    // InternalSQLParser.g:6553:4: ()
                    // InternalSQLParser.g:6554:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					/* */
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElementAndAdd(
                      						grammarAccess.getOpFunctionArgAccess().getOpFListEntriesAction_1_0(),
                      						current);
                      				
                    }

                    }

                    // InternalSQLParser.g:6563:4: (otherlv_2= Comma ( (lv_entries_3_0= ruleOpFunctionArgOperand ) ) )+
                    int cnt124=0;
                    loop124:
                    do {
                        int alt124=2;
                        int LA124_0 = input.LA(1);

                        if ( (LA124_0==Comma) ) {
                            alt124=1;
                        }


                        switch (alt124) {
                    	case 1 :
                    	    // InternalSQLParser.g:6564:5: otherlv_2= Comma ( (lv_entries_3_0= ruleOpFunctionArgOperand ) )
                    	    {
                    	    otherlv_2=(Token)match(input,Comma,FOLLOW_91); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_2, grammarAccess.getOpFunctionArgAccess().getCommaKeyword_1_1_0());
                    	      				
                    	    }
                    	    // InternalSQLParser.g:6568:5: ( (lv_entries_3_0= ruleOpFunctionArgOperand ) )
                    	    // InternalSQLParser.g:6569:6: (lv_entries_3_0= ruleOpFunctionArgOperand )
                    	    {
                    	    // InternalSQLParser.g:6569:6: (lv_entries_3_0= ruleOpFunctionArgOperand )
                    	    // InternalSQLParser.g:6570:7: lv_entries_3_0= ruleOpFunctionArgOperand
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getOpFunctionArgAccess().getEntriesOpFunctionArgOperandParserRuleCall_1_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_9);
                    	    lv_entries_3_0=ruleOpFunctionArgOperand();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getOpFunctionArgRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"entries",
                    	      								lv_entries_3_0,
                    	      								"org.xtext.example.mydsl_sql.SQL.OpFunctionArgOperand");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt124 >= 1 ) break loop124;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(124, input);
                                throw eee;
                        }
                        cnt124++;
                    } while (true);


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOpFunctionArg"


    // $ANTLR start "entryRuleOpFunctionArgOperand"
    // InternalSQLParser.g:6593:1: entryRuleOpFunctionArgOperand returns [EObject current=null] : iv_ruleOpFunctionArgOperand= ruleOpFunctionArgOperand EOF ;
    public final EObject entryRuleOpFunctionArgOperand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOpFunctionArgOperand = null;


        try {
            // InternalSQLParser.g:6593:61: (iv_ruleOpFunctionArgOperand= ruleOpFunctionArgOperand EOF )
            // InternalSQLParser.g:6594:2: iv_ruleOpFunctionArgOperand= ruleOpFunctionArgOperand EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpFunctionArgOperandRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleOpFunctionArgOperand=ruleOpFunctionArgOperand();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpFunctionArgOperand; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOpFunctionArgOperand"


    // $ANTLR start "ruleOpFunctionArgOperand"
    // InternalSQLParser.g:6600:1: ruleOpFunctionArgOperand returns [EObject current=null] : ( ( (lv_op_0_1= ruleOpFunctionArgAgregate | lv_op_0_2= ruleOperand ) ) ) ;
    public final EObject ruleOpFunctionArgOperand() throws RecognitionException {
        EObject current = null;

        EObject lv_op_0_1 = null;

        EObject lv_op_0_2 = null;



        	enterRule();

        try {
            // InternalSQLParser.g:6606:2: ( ( ( (lv_op_0_1= ruleOpFunctionArgAgregate | lv_op_0_2= ruleOperand ) ) ) )
            // InternalSQLParser.g:6607:2: ( ( (lv_op_0_1= ruleOpFunctionArgAgregate | lv_op_0_2= ruleOperand ) ) )
            {
            // InternalSQLParser.g:6607:2: ( ( (lv_op_0_1= ruleOpFunctionArgAgregate | lv_op_0_2= ruleOperand ) ) )
            // InternalSQLParser.g:6608:3: ( (lv_op_0_1= ruleOpFunctionArgAgregate | lv_op_0_2= ruleOperand ) )
            {
            // InternalSQLParser.g:6608:3: ( (lv_op_0_1= ruleOpFunctionArgAgregate | lv_op_0_2= ruleOperand ) )
            // InternalSQLParser.g:6609:4: (lv_op_0_1= ruleOpFunctionArgAgregate | lv_op_0_2= ruleOperand )
            {
            // InternalSQLParser.g:6609:4: (lv_op_0_1= ruleOpFunctionArgAgregate | lv_op_0_2= ruleOperand )
            int alt126=2;
            int LA126_0 = input.LA(1);

            if ( (LA126_0==DISTINCT||LA126_0==ALL) ) {
                alt126=1;
            }
            else if ( (LA126_0==EXTRACT||LA126_0==CAST||LA126_0==CASE||LA126_0==LeftParenthesis||(LA126_0>=RULE_JRPARAM && LA126_0<=RULE_JRNPARAM)||(LA126_0>=RULE_UNSIGNED && LA126_0<=RULE_SIGNED_DOUBLE)||(LA126_0>=RULE_STRING_ && LA126_0<=RULE_ID)) ) {
                alt126=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 126, 0, input);

                throw nvae;
            }
            switch (alt126) {
                case 1 :
                    // InternalSQLParser.g:6610:5: lv_op_0_1= ruleOpFunctionArgAgregate
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getOpFunctionArgOperandAccess().getOpOpFunctionArgAgregateParserRuleCall_0_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_op_0_1=ruleOpFunctionArgAgregate();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getOpFunctionArgOperandRule());
                      					}
                      					set(
                      						current,
                      						"op",
                      						lv_op_0_1,
                      						"org.xtext.example.mydsl_sql.SQL.OpFunctionArgAgregate");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }
                    break;
                case 2 :
                    // InternalSQLParser.g:6626:5: lv_op_0_2= ruleOperand
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getOpFunctionArgOperandAccess().getOpOperandParserRuleCall_0_1());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_op_0_2=ruleOperand();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getOpFunctionArgOperandRule());
                      					}
                      					set(
                      						current,
                      						"op",
                      						lv_op_0_2,
                      						"org.xtext.example.mydsl_sql.SQL.Operand");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }
                    break;

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOpFunctionArgOperand"


    // $ANTLR start "entryRuleOpFunctionCast"
    // InternalSQLParser.g:6647:1: entryRuleOpFunctionCast returns [EObject current=null] : iv_ruleOpFunctionCast= ruleOpFunctionCast EOF ;
    public final EObject entryRuleOpFunctionCast() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOpFunctionCast = null;


        try {
            // InternalSQLParser.g:6647:55: (iv_ruleOpFunctionCast= ruleOpFunctionCast EOF )
            // InternalSQLParser.g:6648:2: iv_ruleOpFunctionCast= ruleOpFunctionCast EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpFunctionCastRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleOpFunctionCast=ruleOpFunctionCast();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpFunctionCast; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOpFunctionCast"


    // $ANTLR start "ruleOpFunctionCast"
    // InternalSQLParser.g:6654:1: ruleOpFunctionCast returns [EObject current=null] : (otherlv_0= CAST ( (lv_op_1_0= ruleOperandGroup ) ) otherlv_2= AS ( (lv_type_3_0= RULE_ID ) ) (otherlv_4= LeftParenthesis ( (lv_p_5_0= RULE_UNSIGNED ) ) (otherlv_6= Comma ( (lv_p2_7_0= RULE_UNSIGNED ) ) )? otherlv_8= RightParenthesis )? otherlv_9= RightParenthesis ) ;
    public final EObject ruleOpFunctionCast() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token lv_type_3_0=null;
        Token otherlv_4=null;
        Token lv_p_5_0=null;
        Token otherlv_6=null;
        Token lv_p2_7_0=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        EObject lv_op_1_0 = null;



        	enterRule();

        try {
            // InternalSQLParser.g:6660:2: ( (otherlv_0= CAST ( (lv_op_1_0= ruleOperandGroup ) ) otherlv_2= AS ( (lv_type_3_0= RULE_ID ) ) (otherlv_4= LeftParenthesis ( (lv_p_5_0= RULE_UNSIGNED ) ) (otherlv_6= Comma ( (lv_p2_7_0= RULE_UNSIGNED ) ) )? otherlv_8= RightParenthesis )? otherlv_9= RightParenthesis ) )
            // InternalSQLParser.g:6661:2: (otherlv_0= CAST ( (lv_op_1_0= ruleOperandGroup ) ) otherlv_2= AS ( (lv_type_3_0= RULE_ID ) ) (otherlv_4= LeftParenthesis ( (lv_p_5_0= RULE_UNSIGNED ) ) (otherlv_6= Comma ( (lv_p2_7_0= RULE_UNSIGNED ) ) )? otherlv_8= RightParenthesis )? otherlv_9= RightParenthesis )
            {
            // InternalSQLParser.g:6661:2: (otherlv_0= CAST ( (lv_op_1_0= ruleOperandGroup ) ) otherlv_2= AS ( (lv_type_3_0= RULE_ID ) ) (otherlv_4= LeftParenthesis ( (lv_p_5_0= RULE_UNSIGNED ) ) (otherlv_6= Comma ( (lv_p2_7_0= RULE_UNSIGNED ) ) )? otherlv_8= RightParenthesis )? otherlv_9= RightParenthesis )
            // InternalSQLParser.g:6662:3: otherlv_0= CAST ( (lv_op_1_0= ruleOperandGroup ) ) otherlv_2= AS ( (lv_type_3_0= RULE_ID ) ) (otherlv_4= LeftParenthesis ( (lv_p_5_0= RULE_UNSIGNED ) ) (otherlv_6= Comma ( (lv_p2_7_0= RULE_UNSIGNED ) ) )? otherlv_8= RightParenthesis )? otherlv_9= RightParenthesis
            {
            otherlv_0=(Token)match(input,CAST,FOLLOW_60); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getOpFunctionCastAccess().getCASTKeyword_0());
              		
            }
            // InternalSQLParser.g:6666:3: ( (lv_op_1_0= ruleOperandGroup ) )
            // InternalSQLParser.g:6667:4: (lv_op_1_0= ruleOperandGroup )
            {
            // InternalSQLParser.g:6667:4: (lv_op_1_0= ruleOperandGroup )
            // InternalSQLParser.g:6668:5: lv_op_1_0= ruleOperandGroup
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getOpFunctionCastAccess().getOpOperandGroupParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_6);
            lv_op_1_0=ruleOperandGroup();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getOpFunctionCastRule());
              					}
              					set(
              						current,
              						"op",
              						lv_op_1_0,
              						"org.xtext.example.mydsl_sql.SQL.OperandGroup");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_2=(Token)match(input,AS,FOLLOW_46); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getOpFunctionCastAccess().getASKeyword_2());
              		
            }
            // InternalSQLParser.g:6689:3: ( (lv_type_3_0= RULE_ID ) )
            // InternalSQLParser.g:6690:4: (lv_type_3_0= RULE_ID )
            {
            // InternalSQLParser.g:6690:4: (lv_type_3_0= RULE_ID )
            // InternalSQLParser.g:6691:5: lv_type_3_0= RULE_ID
            {
            lv_type_3_0=(Token)match(input,RULE_ID,FOLLOW_92); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_type_3_0, grammarAccess.getOpFunctionCastAccess().getTypeIDTerminalRuleCall_3_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getOpFunctionCastRule());
              					}
              					setWithLastConsumed(
              						current,
              						"type",
              						lv_type_3_0,
              						"org.xtext.example.mydsl_sql.SQL.ID");
              				
            }

            }


            }

            // InternalSQLParser.g:6707:3: (otherlv_4= LeftParenthesis ( (lv_p_5_0= RULE_UNSIGNED ) ) (otherlv_6= Comma ( (lv_p2_7_0= RULE_UNSIGNED ) ) )? otherlv_8= RightParenthesis )?
            int alt128=2;
            int LA128_0 = input.LA(1);

            if ( (LA128_0==LeftParenthesis) ) {
                alt128=1;
            }
            switch (alt128) {
                case 1 :
                    // InternalSQLParser.g:6708:4: otherlv_4= LeftParenthesis ( (lv_p_5_0= RULE_UNSIGNED ) ) (otherlv_6= Comma ( (lv_p2_7_0= RULE_UNSIGNED ) ) )? otherlv_8= RightParenthesis
                    {
                    otherlv_4=(Token)match(input,LeftParenthesis,FOLLOW_12); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_4, grammarAccess.getOpFunctionCastAccess().getLeftParenthesisKeyword_4_0());
                      			
                    }
                    // InternalSQLParser.g:6712:4: ( (lv_p_5_0= RULE_UNSIGNED ) )
                    // InternalSQLParser.g:6713:5: (lv_p_5_0= RULE_UNSIGNED )
                    {
                    // InternalSQLParser.g:6713:5: (lv_p_5_0= RULE_UNSIGNED )
                    // InternalSQLParser.g:6714:6: lv_p_5_0= RULE_UNSIGNED
                    {
                    lv_p_5_0=(Token)match(input,RULE_UNSIGNED,FOLLOW_93); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_p_5_0, grammarAccess.getOpFunctionCastAccess().getPUNSIGNEDTerminalRuleCall_4_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getOpFunctionCastRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"p",
                      							lv_p_5_0,
                      							"org.xtext.example.mydsl_sql.SQL.UNSIGNED");
                      					
                    }

                    }


                    }

                    // InternalSQLParser.g:6730:4: (otherlv_6= Comma ( (lv_p2_7_0= RULE_UNSIGNED ) ) )?
                    int alt127=2;
                    int LA127_0 = input.LA(1);

                    if ( (LA127_0==Comma) ) {
                        alt127=1;
                    }
                    switch (alt127) {
                        case 1 :
                            // InternalSQLParser.g:6731:5: otherlv_6= Comma ( (lv_p2_7_0= RULE_UNSIGNED ) )
                            {
                            otherlv_6=(Token)match(input,Comma,FOLLOW_12); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_6, grammarAccess.getOpFunctionCastAccess().getCommaKeyword_4_2_0());
                              				
                            }
                            // InternalSQLParser.g:6735:5: ( (lv_p2_7_0= RULE_UNSIGNED ) )
                            // InternalSQLParser.g:6736:6: (lv_p2_7_0= RULE_UNSIGNED )
                            {
                            // InternalSQLParser.g:6736:6: (lv_p2_7_0= RULE_UNSIGNED )
                            // InternalSQLParser.g:6737:7: lv_p2_7_0= RULE_UNSIGNED
                            {
                            lv_p2_7_0=(Token)match(input,RULE_UNSIGNED,FOLLOW_8); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							newLeafNode(lv_p2_7_0, grammarAccess.getOpFunctionCastAccess().getP2UNSIGNEDTerminalRuleCall_4_2_1_0());
                              						
                            }
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElement(grammarAccess.getOpFunctionCastRule());
                              							}
                              							setWithLastConsumed(
                              								current,
                              								"p2",
                              								lv_p2_7_0,
                              								"org.xtext.example.mydsl_sql.SQL.UNSIGNED");
                              						
                            }

                            }


                            }


                            }
                            break;

                    }

                    otherlv_8=(Token)match(input,RightParenthesis,FOLLOW_8); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_8, grammarAccess.getOpFunctionCastAccess().getRightParenthesisKeyword_4_3());
                      			
                    }

                    }
                    break;

            }

            otherlv_9=(Token)match(input,RightParenthesis,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_9, grammarAccess.getOpFunctionCastAccess().getRightParenthesisKeyword_5());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOpFunctionCast"


    // $ANTLR start "entryRuleOpFunctionArgAgregate"
    // InternalSQLParser.g:6767:1: entryRuleOpFunctionArgAgregate returns [EObject current=null] : iv_ruleOpFunctionArgAgregate= ruleOpFunctionArgAgregate EOF ;
    public final EObject entryRuleOpFunctionArgAgregate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOpFunctionArgAgregate = null;


        try {
            // InternalSQLParser.g:6767:62: (iv_ruleOpFunctionArgAgregate= ruleOpFunctionArgAgregate EOF )
            // InternalSQLParser.g:6768:2: iv_ruleOpFunctionArgAgregate= ruleOpFunctionArgAgregate EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpFunctionArgAgregateRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleOpFunctionArgAgregate=ruleOpFunctionArgAgregate();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpFunctionArgAgregate; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOpFunctionArgAgregate"


    // $ANTLR start "ruleOpFunctionArgAgregate"
    // InternalSQLParser.g:6774:1: ruleOpFunctionArgAgregate returns [EObject current=null] : ( (otherlv_0= ALL | otherlv_1= DISTINCT ) this_Operand_2= ruleOperand ) ;
    public final EObject ruleOpFunctionArgAgregate() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject this_Operand_2 = null;



        	enterRule();

        try {
            // InternalSQLParser.g:6780:2: ( ( (otherlv_0= ALL | otherlv_1= DISTINCT ) this_Operand_2= ruleOperand ) )
            // InternalSQLParser.g:6781:2: ( (otherlv_0= ALL | otherlv_1= DISTINCT ) this_Operand_2= ruleOperand )
            {
            // InternalSQLParser.g:6781:2: ( (otherlv_0= ALL | otherlv_1= DISTINCT ) this_Operand_2= ruleOperand )
            // InternalSQLParser.g:6782:3: (otherlv_0= ALL | otherlv_1= DISTINCT ) this_Operand_2= ruleOperand
            {
            // InternalSQLParser.g:6782:3: (otherlv_0= ALL | otherlv_1= DISTINCT )
            int alt129=2;
            int LA129_0 = input.LA(1);

            if ( (LA129_0==ALL) ) {
                alt129=1;
            }
            else if ( (LA129_0==DISTINCT) ) {
                alt129=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 129, 0, input);

                throw nvae;
            }
            switch (alt129) {
                case 1 :
                    // InternalSQLParser.g:6783:4: otherlv_0= ALL
                    {
                    otherlv_0=(Token)match(input,ALL,FOLLOW_60); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_0, grammarAccess.getOpFunctionArgAgregateAccess().getALLKeyword_0_0());
                      			
                    }

                    }
                    break;
                case 2 :
                    // InternalSQLParser.g:6788:4: otherlv_1= DISTINCT
                    {
                    otherlv_1=(Token)match(input,DISTINCT,FOLLOW_60); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getOpFunctionArgAgregateAccess().getDISTINCTKeyword_0_1());
                      			
                    }

                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getOpFunctionArgAgregateAccess().getOperandParserRuleCall_1());
              		
            }
            pushFollow(FOLLOW_2);
            this_Operand_2=ruleOperand();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_Operand_2;
              			afterParserOrEnumRuleCall();
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOpFunctionArgAgregate"


    // $ANTLR start "entryRuleXOperandFragment"
    // InternalSQLParser.g:6808:1: entryRuleXOperandFragment returns [EObject current=null] : iv_ruleXOperandFragment= ruleXOperandFragment EOF ;
    public final EObject entryRuleXOperandFragment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXOperandFragment = null;


        try {
            // InternalSQLParser.g:6808:57: (iv_ruleXOperandFragment= ruleXOperandFragment EOF )
            // InternalSQLParser.g:6809:2: iv_ruleXOperandFragment= ruleXOperandFragment EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXOperandFragmentRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleXOperandFragment=ruleXOperandFragment();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXOperandFragment; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXOperandFragment"


    // $ANTLR start "ruleXOperandFragment"
    // InternalSQLParser.g:6815:1: ruleXOperandFragment returns [EObject current=null] : ( ( (lv_param_0_0= ruleParameterOperand ) ) | ( (lv_eparam_1_0= ruleExclamationParameterOperand ) ) | ( (lv_scalar_2_0= ruleScalarNumberOperand ) ) ) ;
    public final EObject ruleXOperandFragment() throws RecognitionException {
        EObject current = null;

        EObject lv_param_0_0 = null;

        EObject lv_eparam_1_0 = null;

        EObject lv_scalar_2_0 = null;



        	enterRule();

        try {
            // InternalSQLParser.g:6821:2: ( ( ( (lv_param_0_0= ruleParameterOperand ) ) | ( (lv_eparam_1_0= ruleExclamationParameterOperand ) ) | ( (lv_scalar_2_0= ruleScalarNumberOperand ) ) ) )
            // InternalSQLParser.g:6822:2: ( ( (lv_param_0_0= ruleParameterOperand ) ) | ( (lv_eparam_1_0= ruleExclamationParameterOperand ) ) | ( (lv_scalar_2_0= ruleScalarNumberOperand ) ) )
            {
            // InternalSQLParser.g:6822:2: ( ( (lv_param_0_0= ruleParameterOperand ) ) | ( (lv_eparam_1_0= ruleExclamationParameterOperand ) ) | ( (lv_scalar_2_0= ruleScalarNumberOperand ) ) )
            int alt130=3;
            switch ( input.LA(1) ) {
            case RULE_JRPARAM:
                {
                alt130=1;
                }
                break;
            case RULE_JRNPARAM:
                {
                alt130=2;
                }
                break;
            case RULE_UNSIGNED:
            case RULE_INT:
            case RULE_SIGNED_DOUBLE:
            case RULE_STRING_:
                {
                alt130=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 130, 0, input);

                throw nvae;
            }

            switch (alt130) {
                case 1 :
                    // InternalSQLParser.g:6823:3: ( (lv_param_0_0= ruleParameterOperand ) )
                    {
                    // InternalSQLParser.g:6823:3: ( (lv_param_0_0= ruleParameterOperand ) )
                    // InternalSQLParser.g:6824:4: (lv_param_0_0= ruleParameterOperand )
                    {
                    // InternalSQLParser.g:6824:4: (lv_param_0_0= ruleParameterOperand )
                    // InternalSQLParser.g:6825:5: lv_param_0_0= ruleParameterOperand
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getXOperandFragmentAccess().getParamParameterOperandParserRuleCall_0_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_param_0_0=ruleParameterOperand();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getXOperandFragmentRule());
                      					}
                      					set(
                      						current,
                      						"param",
                      						lv_param_0_0,
                      						"org.xtext.example.mydsl_sql.SQL.ParameterOperand");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalSQLParser.g:6843:3: ( (lv_eparam_1_0= ruleExclamationParameterOperand ) )
                    {
                    // InternalSQLParser.g:6843:3: ( (lv_eparam_1_0= ruleExclamationParameterOperand ) )
                    // InternalSQLParser.g:6844:4: (lv_eparam_1_0= ruleExclamationParameterOperand )
                    {
                    // InternalSQLParser.g:6844:4: (lv_eparam_1_0= ruleExclamationParameterOperand )
                    // InternalSQLParser.g:6845:5: lv_eparam_1_0= ruleExclamationParameterOperand
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getXOperandFragmentAccess().getEparamExclamationParameterOperandParserRuleCall_1_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_eparam_1_0=ruleExclamationParameterOperand();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getXOperandFragmentRule());
                      					}
                      					set(
                      						current,
                      						"eparam",
                      						lv_eparam_1_0,
                      						"org.xtext.example.mydsl_sql.SQL.ExclamationParameterOperand");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalSQLParser.g:6863:3: ( (lv_scalar_2_0= ruleScalarNumberOperand ) )
                    {
                    // InternalSQLParser.g:6863:3: ( (lv_scalar_2_0= ruleScalarNumberOperand ) )
                    // InternalSQLParser.g:6864:4: (lv_scalar_2_0= ruleScalarNumberOperand )
                    {
                    // InternalSQLParser.g:6864:4: (lv_scalar_2_0= ruleScalarNumberOperand )
                    // InternalSQLParser.g:6865:5: lv_scalar_2_0= ruleScalarNumberOperand
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getXOperandFragmentAccess().getScalarScalarNumberOperandParserRuleCall_2_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_scalar_2_0=ruleScalarNumberOperand();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getXOperandFragmentRule());
                      					}
                      					set(
                      						current,
                      						"scalar",
                      						lv_scalar_2_0,
                      						"org.xtext.example.mydsl_sql.SQL.ScalarNumberOperand");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXOperandFragment"


    // $ANTLR start "entryRuleParameterOperand"
    // InternalSQLParser.g:6886:1: entryRuleParameterOperand returns [EObject current=null] : iv_ruleParameterOperand= ruleParameterOperand EOF ;
    public final EObject entryRuleParameterOperand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterOperand = null;


        try {
            // InternalSQLParser.g:6886:57: (iv_ruleParameterOperand= ruleParameterOperand EOF )
            // InternalSQLParser.g:6887:2: iv_ruleParameterOperand= ruleParameterOperand EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getParameterOperandRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleParameterOperand=ruleParameterOperand();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleParameterOperand; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleParameterOperand"


    // $ANTLR start "ruleParameterOperand"
    // InternalSQLParser.g:6893:1: ruleParameterOperand returns [EObject current=null] : ( (lv_prm_0_0= RULE_JRPARAM ) ) ;
    public final EObject ruleParameterOperand() throws RecognitionException {
        EObject current = null;

        Token lv_prm_0_0=null;


        	enterRule();

        try {
            // InternalSQLParser.g:6899:2: ( ( (lv_prm_0_0= RULE_JRPARAM ) ) )
            // InternalSQLParser.g:6900:2: ( (lv_prm_0_0= RULE_JRPARAM ) )
            {
            // InternalSQLParser.g:6900:2: ( (lv_prm_0_0= RULE_JRPARAM ) )
            // InternalSQLParser.g:6901:3: (lv_prm_0_0= RULE_JRPARAM )
            {
            // InternalSQLParser.g:6901:3: (lv_prm_0_0= RULE_JRPARAM )
            // InternalSQLParser.g:6902:4: lv_prm_0_0= RULE_JRPARAM
            {
            lv_prm_0_0=(Token)match(input,RULE_JRPARAM,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(lv_prm_0_0, grammarAccess.getParameterOperandAccess().getPrmJRPARAMTerminalRuleCall_0());
              			
            }
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElement(grammarAccess.getParameterOperandRule());
              				}
              				setWithLastConsumed(
              					current,
              					"prm",
              					lv_prm_0_0,
              					"org.xtext.example.mydsl_sql.SQL.JRPARAM");
              			
            }

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleParameterOperand"


    // $ANTLR start "entryRuleExclamationParameterOperand"
    // InternalSQLParser.g:6921:1: entryRuleExclamationParameterOperand returns [EObject current=null] : iv_ruleExclamationParameterOperand= ruleExclamationParameterOperand EOF ;
    public final EObject entryRuleExclamationParameterOperand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExclamationParameterOperand = null;


        try {
            // InternalSQLParser.g:6921:68: (iv_ruleExclamationParameterOperand= ruleExclamationParameterOperand EOF )
            // InternalSQLParser.g:6922:2: iv_ruleExclamationParameterOperand= ruleExclamationParameterOperand EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExclamationParameterOperandRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleExclamationParameterOperand=ruleExclamationParameterOperand();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExclamationParameterOperand; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExclamationParameterOperand"


    // $ANTLR start "ruleExclamationParameterOperand"
    // InternalSQLParser.g:6928:1: ruleExclamationParameterOperand returns [EObject current=null] : ( (lv_prm_0_0= RULE_JRNPARAM ) ) ;
    public final EObject ruleExclamationParameterOperand() throws RecognitionException {
        EObject current = null;

        Token lv_prm_0_0=null;


        	enterRule();

        try {
            // InternalSQLParser.g:6934:2: ( ( (lv_prm_0_0= RULE_JRNPARAM ) ) )
            // InternalSQLParser.g:6935:2: ( (lv_prm_0_0= RULE_JRNPARAM ) )
            {
            // InternalSQLParser.g:6935:2: ( (lv_prm_0_0= RULE_JRNPARAM ) )
            // InternalSQLParser.g:6936:3: (lv_prm_0_0= RULE_JRNPARAM )
            {
            // InternalSQLParser.g:6936:3: (lv_prm_0_0= RULE_JRNPARAM )
            // InternalSQLParser.g:6937:4: lv_prm_0_0= RULE_JRNPARAM
            {
            lv_prm_0_0=(Token)match(input,RULE_JRNPARAM,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(lv_prm_0_0, grammarAccess.getExclamationParameterOperandAccess().getPrmJRNPARAMTerminalRuleCall_0());
              			
            }
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElement(grammarAccess.getExclamationParameterOperandRule());
              				}
              				setWithLastConsumed(
              					current,
              					"prm",
              					lv_prm_0_0,
              					"org.xtext.example.mydsl_sql.SQL.JRNPARAM");
              			
            }

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExclamationParameterOperand"


    // $ANTLR start "entryRuleColumnOperand"
    // InternalSQLParser.g:6956:1: entryRuleColumnOperand returns [EObject current=null] : iv_ruleColumnOperand= ruleColumnOperand EOF ;
    public final EObject entryRuleColumnOperand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleColumnOperand = null;


        try {
            // InternalSQLParser.g:6956:54: (iv_ruleColumnOperand= ruleColumnOperand EOF )
            // InternalSQLParser.g:6957:2: iv_ruleColumnOperand= ruleColumnOperand EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getColumnOperandRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleColumnOperand=ruleColumnOperand();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleColumnOperand; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleColumnOperand"


    // $ANTLR start "ruleColumnOperand"
    // InternalSQLParser.g:6963:1: ruleColumnOperand returns [EObject current=null] : ( ( (lv_cfull_0_0= ruleColumnFull ) ) ( (lv_ora_1_0= LeftParenthesisPlusSignRightParenthesis ) )? ) ;
    public final EObject ruleColumnOperand() throws RecognitionException {
        EObject current = null;

        Token lv_ora_1_0=null;
        EObject lv_cfull_0_0 = null;



        	enterRule();

        try {
            // InternalSQLParser.g:6969:2: ( ( ( (lv_cfull_0_0= ruleColumnFull ) ) ( (lv_ora_1_0= LeftParenthesisPlusSignRightParenthesis ) )? ) )
            // InternalSQLParser.g:6970:2: ( ( (lv_cfull_0_0= ruleColumnFull ) ) ( (lv_ora_1_0= LeftParenthesisPlusSignRightParenthesis ) )? )
            {
            // InternalSQLParser.g:6970:2: ( ( (lv_cfull_0_0= ruleColumnFull ) ) ( (lv_ora_1_0= LeftParenthesisPlusSignRightParenthesis ) )? )
            // InternalSQLParser.g:6971:3: ( (lv_cfull_0_0= ruleColumnFull ) ) ( (lv_ora_1_0= LeftParenthesisPlusSignRightParenthesis ) )?
            {
            // InternalSQLParser.g:6971:3: ( (lv_cfull_0_0= ruleColumnFull ) )
            // InternalSQLParser.g:6972:4: (lv_cfull_0_0= ruleColumnFull )
            {
            // InternalSQLParser.g:6972:4: (lv_cfull_0_0= ruleColumnFull )
            // InternalSQLParser.g:6973:5: lv_cfull_0_0= ruleColumnFull
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getColumnOperandAccess().getCfullColumnFullParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_94);
            lv_cfull_0_0=ruleColumnFull();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getColumnOperandRule());
              					}
              					set(
              						current,
              						"cfull",
              						lv_cfull_0_0,
              						"org.xtext.example.mydsl_sql.SQL.ColumnFull");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalSQLParser.g:6990:3: ( (lv_ora_1_0= LeftParenthesisPlusSignRightParenthesis ) )?
            int alt131=2;
            int LA131_0 = input.LA(1);

            if ( (LA131_0==LeftParenthesisPlusSignRightParenthesis) ) {
                alt131=1;
            }
            switch (alt131) {
                case 1 :
                    // InternalSQLParser.g:6991:4: (lv_ora_1_0= LeftParenthesisPlusSignRightParenthesis )
                    {
                    // InternalSQLParser.g:6991:4: (lv_ora_1_0= LeftParenthesisPlusSignRightParenthesis )
                    // InternalSQLParser.g:6992:5: lv_ora_1_0= LeftParenthesisPlusSignRightParenthesis
                    {
                    lv_ora_1_0=(Token)match(input,LeftParenthesisPlusSignRightParenthesis,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_ora_1_0, grammarAccess.getColumnOperandAccess().getOraLeftParenthesisPlusSignRightParenthesisKeyword_1_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getColumnOperandRule());
                      					}
                      					setWithLastConsumed(current, "ora", lv_ora_1_0, "(+)");
                      				
                    }

                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleColumnOperand"


    // $ANTLR start "entryRuleSubQueryOperand"
    // InternalSQLParser.g:7008:1: entryRuleSubQueryOperand returns [EObject current=null] : iv_ruleSubQueryOperand= ruleSubQueryOperand EOF ;
    public final EObject entryRuleSubQueryOperand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubQueryOperand = null;


        try {
            // InternalSQLParser.g:7008:56: (iv_ruleSubQueryOperand= ruleSubQueryOperand EOF )
            // InternalSQLParser.g:7009:2: iv_ruleSubQueryOperand= ruleSubQueryOperand EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSubQueryOperandRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleSubQueryOperand=ruleSubQueryOperand();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSubQueryOperand; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSubQueryOperand"


    // $ANTLR start "ruleSubQueryOperand"
    // InternalSQLParser.g:7015:1: ruleSubQueryOperand returns [EObject current=null] : ( () otherlv_1= LeftParenthesis ( (lv_sel_2_0= ruleSelectQuery ) ) otherlv_3= RightParenthesis ) ;
    public final EObject ruleSubQueryOperand() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_sel_2_0 = null;



        	enterRule();

        try {
            // InternalSQLParser.g:7021:2: ( ( () otherlv_1= LeftParenthesis ( (lv_sel_2_0= ruleSelectQuery ) ) otherlv_3= RightParenthesis ) )
            // InternalSQLParser.g:7022:2: ( () otherlv_1= LeftParenthesis ( (lv_sel_2_0= ruleSelectQuery ) ) otherlv_3= RightParenthesis )
            {
            // InternalSQLParser.g:7022:2: ( () otherlv_1= LeftParenthesis ( (lv_sel_2_0= ruleSelectQuery ) ) otherlv_3= RightParenthesis )
            // InternalSQLParser.g:7023:3: () otherlv_1= LeftParenthesis ( (lv_sel_2_0= ruleSelectQuery ) ) otherlv_3= RightParenthesis
            {
            // InternalSQLParser.g:7023:3: ()
            // InternalSQLParser.g:7024:4: 
            {
            if ( state.backtracking==0 ) {

              				/* */
              			
            }
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getSubQueryOperandAccess().getSubQueryOperandAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,LeftParenthesis,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getSubQueryOperandAccess().getLeftParenthesisKeyword_1());
              		
            }
            // InternalSQLParser.g:7037:3: ( (lv_sel_2_0= ruleSelectQuery ) )
            // InternalSQLParser.g:7038:4: (lv_sel_2_0= ruleSelectQuery )
            {
            // InternalSQLParser.g:7038:4: (lv_sel_2_0= ruleSelectQuery )
            // InternalSQLParser.g:7039:5: lv_sel_2_0= ruleSelectQuery
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getSubQueryOperandAccess().getSelSelectQueryParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_8);
            lv_sel_2_0=ruleSelectQuery();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getSubQueryOperandRule());
              					}
              					set(
              						current,
              						"sel",
              						lv_sel_2_0,
              						"org.xtext.example.mydsl_sql.SQL.SelectQuery");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_3=(Token)match(input,RightParenthesis,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getSubQueryOperandAccess().getRightParenthesisKeyword_3());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSubQueryOperand"


    // $ANTLR start "entryRuleScalarOperand"
    // InternalSQLParser.g:7064:1: entryRuleScalarOperand returns [EObject current=null] : iv_ruleScalarOperand= ruleScalarOperand EOF ;
    public final EObject entryRuleScalarOperand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleScalarOperand = null;


        try {
            // InternalSQLParser.g:7064:54: (iv_ruleScalarOperand= ruleScalarOperand EOF )
            // InternalSQLParser.g:7065:2: iv_ruleScalarOperand= ruleScalarOperand EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getScalarOperandRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleScalarOperand=ruleScalarOperand();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleScalarOperand; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleScalarOperand"


    // $ANTLR start "ruleScalarOperand"
    // InternalSQLParser.g:7071:1: ruleScalarOperand returns [EObject current=null] : ( ( (lv_sostr_0_0= ruleStringOperand ) ) | ( (lv_sodbl_1_0= RULE_SIGNED_DOUBLE ) ) | ( (lv_sodate_2_0= RULE_DATE ) ) | ( (lv_sotime_3_0= RULE_TIME ) ) | ( (lv_sodt_4_0= RULE_TIMESTAMP ) ) ) ;
    public final EObject ruleScalarOperand() throws RecognitionException {
        EObject current = null;

        Token lv_sodbl_1_0=null;
        Token lv_sodate_2_0=null;
        Token lv_sotime_3_0=null;
        Token lv_sodt_4_0=null;
        AntlrDatatypeRuleToken lv_sostr_0_0 = null;



        	enterRule();

        try {
            // InternalSQLParser.g:7077:2: ( ( ( (lv_sostr_0_0= ruleStringOperand ) ) | ( (lv_sodbl_1_0= RULE_SIGNED_DOUBLE ) ) | ( (lv_sodate_2_0= RULE_DATE ) ) | ( (lv_sotime_3_0= RULE_TIME ) ) | ( (lv_sodt_4_0= RULE_TIMESTAMP ) ) ) )
            // InternalSQLParser.g:7078:2: ( ( (lv_sostr_0_0= ruleStringOperand ) ) | ( (lv_sodbl_1_0= RULE_SIGNED_DOUBLE ) ) | ( (lv_sodate_2_0= RULE_DATE ) ) | ( (lv_sotime_3_0= RULE_TIME ) ) | ( (lv_sodt_4_0= RULE_TIMESTAMP ) ) )
            {
            // InternalSQLParser.g:7078:2: ( ( (lv_sostr_0_0= ruleStringOperand ) ) | ( (lv_sodbl_1_0= RULE_SIGNED_DOUBLE ) ) | ( (lv_sodate_2_0= RULE_DATE ) ) | ( (lv_sotime_3_0= RULE_TIME ) ) | ( (lv_sodt_4_0= RULE_TIMESTAMP ) ) )
            int alt132=5;
            switch ( input.LA(1) ) {
            case RULE_STRING_:
                {
                alt132=1;
                }
                break;
            case RULE_SIGNED_DOUBLE:
                {
                alt132=2;
                }
                break;
            case RULE_DATE:
                {
                alt132=3;
                }
                break;
            case RULE_TIME:
                {
                alt132=4;
                }
                break;
            case RULE_TIMESTAMP:
                {
                alt132=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 132, 0, input);

                throw nvae;
            }

            switch (alt132) {
                case 1 :
                    // InternalSQLParser.g:7079:3: ( (lv_sostr_0_0= ruleStringOperand ) )
                    {
                    // InternalSQLParser.g:7079:3: ( (lv_sostr_0_0= ruleStringOperand ) )
                    // InternalSQLParser.g:7080:4: (lv_sostr_0_0= ruleStringOperand )
                    {
                    // InternalSQLParser.g:7080:4: (lv_sostr_0_0= ruleStringOperand )
                    // InternalSQLParser.g:7081:5: lv_sostr_0_0= ruleStringOperand
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getScalarOperandAccess().getSostrStringOperandParserRuleCall_0_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_sostr_0_0=ruleStringOperand();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getScalarOperandRule());
                      					}
                      					set(
                      						current,
                      						"sostr",
                      						lv_sostr_0_0,
                      						"org.xtext.example.mydsl_sql.SQL.StringOperand");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalSQLParser.g:7099:3: ( (lv_sodbl_1_0= RULE_SIGNED_DOUBLE ) )
                    {
                    // InternalSQLParser.g:7099:3: ( (lv_sodbl_1_0= RULE_SIGNED_DOUBLE ) )
                    // InternalSQLParser.g:7100:4: (lv_sodbl_1_0= RULE_SIGNED_DOUBLE )
                    {
                    // InternalSQLParser.g:7100:4: (lv_sodbl_1_0= RULE_SIGNED_DOUBLE )
                    // InternalSQLParser.g:7101:5: lv_sodbl_1_0= RULE_SIGNED_DOUBLE
                    {
                    lv_sodbl_1_0=(Token)match(input,RULE_SIGNED_DOUBLE,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_sodbl_1_0, grammarAccess.getScalarOperandAccess().getSodblSIGNED_DOUBLETerminalRuleCall_1_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getScalarOperandRule());
                      					}
                      					setWithLastConsumed(
                      						current,
                      						"sodbl",
                      						lv_sodbl_1_0,
                      						"org.xtext.example.mydsl_sql.SQL.SIGNED_DOUBLE");
                      				
                    }

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalSQLParser.g:7118:3: ( (lv_sodate_2_0= RULE_DATE ) )
                    {
                    // InternalSQLParser.g:7118:3: ( (lv_sodate_2_0= RULE_DATE ) )
                    // InternalSQLParser.g:7119:4: (lv_sodate_2_0= RULE_DATE )
                    {
                    // InternalSQLParser.g:7119:4: (lv_sodate_2_0= RULE_DATE )
                    // InternalSQLParser.g:7120:5: lv_sodate_2_0= RULE_DATE
                    {
                    lv_sodate_2_0=(Token)match(input,RULE_DATE,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_sodate_2_0, grammarAccess.getScalarOperandAccess().getSodateDATETerminalRuleCall_2_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getScalarOperandRule());
                      					}
                      					setWithLastConsumed(
                      						current,
                      						"sodate",
                      						lv_sodate_2_0,
                      						"org.xtext.example.mydsl_sql.SQL.DATE");
                      				
                    }

                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalSQLParser.g:7137:3: ( (lv_sotime_3_0= RULE_TIME ) )
                    {
                    // InternalSQLParser.g:7137:3: ( (lv_sotime_3_0= RULE_TIME ) )
                    // InternalSQLParser.g:7138:4: (lv_sotime_3_0= RULE_TIME )
                    {
                    // InternalSQLParser.g:7138:4: (lv_sotime_3_0= RULE_TIME )
                    // InternalSQLParser.g:7139:5: lv_sotime_3_0= RULE_TIME
                    {
                    lv_sotime_3_0=(Token)match(input,RULE_TIME,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_sotime_3_0, grammarAccess.getScalarOperandAccess().getSotimeTIMETerminalRuleCall_3_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getScalarOperandRule());
                      					}
                      					setWithLastConsumed(
                      						current,
                      						"sotime",
                      						lv_sotime_3_0,
                      						"org.xtext.example.mydsl_sql.SQL.TIME");
                      				
                    }

                    }


                    }


                    }
                    break;
                case 5 :
                    // InternalSQLParser.g:7156:3: ( (lv_sodt_4_0= RULE_TIMESTAMP ) )
                    {
                    // InternalSQLParser.g:7156:3: ( (lv_sodt_4_0= RULE_TIMESTAMP ) )
                    // InternalSQLParser.g:7157:4: (lv_sodt_4_0= RULE_TIMESTAMP )
                    {
                    // InternalSQLParser.g:7157:4: (lv_sodt_4_0= RULE_TIMESTAMP )
                    // InternalSQLParser.g:7158:5: lv_sodt_4_0= RULE_TIMESTAMP
                    {
                    lv_sodt_4_0=(Token)match(input,RULE_TIMESTAMP,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_sodt_4_0, grammarAccess.getScalarOperandAccess().getSodtTIMESTAMPTerminalRuleCall_4_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getScalarOperandRule());
                      					}
                      					setWithLastConsumed(
                      						current,
                      						"sodt",
                      						lv_sodt_4_0,
                      						"org.xtext.example.mydsl_sql.SQL.TIMESTAMP");
                      				
                    }

                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleScalarOperand"


    // $ANTLR start "entryRuleScalarNumberOperand"
    // InternalSQLParser.g:7178:1: entryRuleScalarNumberOperand returns [EObject current=null] : iv_ruleScalarNumberOperand= ruleScalarNumberOperand EOF ;
    public final EObject entryRuleScalarNumberOperand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleScalarNumberOperand = null;


        try {
            // InternalSQLParser.g:7178:60: (iv_ruleScalarNumberOperand= ruleScalarNumberOperand EOF )
            // InternalSQLParser.g:7179:2: iv_ruleScalarNumberOperand= ruleScalarNumberOperand EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getScalarNumberOperandRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleScalarNumberOperand=ruleScalarNumberOperand();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleScalarNumberOperand; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleScalarNumberOperand"


    // $ANTLR start "ruleScalarNumberOperand"
    // InternalSQLParser.g:7185:1: ruleScalarNumberOperand returns [EObject current=null] : ( ( (lv_soUInt_0_0= RULE_UNSIGNED ) ) | ( (lv_soint_1_0= RULE_INT ) ) | ( (lv_sodbl_2_0= RULE_SIGNED_DOUBLE ) ) | ( (lv_sostr_3_0= ruleStringOperand ) ) ) ;
    public final EObject ruleScalarNumberOperand() throws RecognitionException {
        EObject current = null;

        Token lv_soUInt_0_0=null;
        Token lv_soint_1_0=null;
        Token lv_sodbl_2_0=null;
        AntlrDatatypeRuleToken lv_sostr_3_0 = null;



        	enterRule();

        try {
            // InternalSQLParser.g:7191:2: ( ( ( (lv_soUInt_0_0= RULE_UNSIGNED ) ) | ( (lv_soint_1_0= RULE_INT ) ) | ( (lv_sodbl_2_0= RULE_SIGNED_DOUBLE ) ) | ( (lv_sostr_3_0= ruleStringOperand ) ) ) )
            // InternalSQLParser.g:7192:2: ( ( (lv_soUInt_0_0= RULE_UNSIGNED ) ) | ( (lv_soint_1_0= RULE_INT ) ) | ( (lv_sodbl_2_0= RULE_SIGNED_DOUBLE ) ) | ( (lv_sostr_3_0= ruleStringOperand ) ) )
            {
            // InternalSQLParser.g:7192:2: ( ( (lv_soUInt_0_0= RULE_UNSIGNED ) ) | ( (lv_soint_1_0= RULE_INT ) ) | ( (lv_sodbl_2_0= RULE_SIGNED_DOUBLE ) ) | ( (lv_sostr_3_0= ruleStringOperand ) ) )
            int alt133=4;
            switch ( input.LA(1) ) {
            case RULE_UNSIGNED:
                {
                alt133=1;
                }
                break;
            case RULE_INT:
                {
                alt133=2;
                }
                break;
            case RULE_SIGNED_DOUBLE:
                {
                alt133=3;
                }
                break;
            case RULE_STRING_:
                {
                alt133=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 133, 0, input);

                throw nvae;
            }

            switch (alt133) {
                case 1 :
                    // InternalSQLParser.g:7193:3: ( (lv_soUInt_0_0= RULE_UNSIGNED ) )
                    {
                    // InternalSQLParser.g:7193:3: ( (lv_soUInt_0_0= RULE_UNSIGNED ) )
                    // InternalSQLParser.g:7194:4: (lv_soUInt_0_0= RULE_UNSIGNED )
                    {
                    // InternalSQLParser.g:7194:4: (lv_soUInt_0_0= RULE_UNSIGNED )
                    // InternalSQLParser.g:7195:5: lv_soUInt_0_0= RULE_UNSIGNED
                    {
                    lv_soUInt_0_0=(Token)match(input,RULE_UNSIGNED,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_soUInt_0_0, grammarAccess.getScalarNumberOperandAccess().getSoUIntUNSIGNEDTerminalRuleCall_0_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getScalarNumberOperandRule());
                      					}
                      					setWithLastConsumed(
                      						current,
                      						"soUInt",
                      						lv_soUInt_0_0,
                      						"org.xtext.example.mydsl_sql.SQL.UNSIGNED");
                      				
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalSQLParser.g:7212:3: ( (lv_soint_1_0= RULE_INT ) )
                    {
                    // InternalSQLParser.g:7212:3: ( (lv_soint_1_0= RULE_INT ) )
                    // InternalSQLParser.g:7213:4: (lv_soint_1_0= RULE_INT )
                    {
                    // InternalSQLParser.g:7213:4: (lv_soint_1_0= RULE_INT )
                    // InternalSQLParser.g:7214:5: lv_soint_1_0= RULE_INT
                    {
                    lv_soint_1_0=(Token)match(input,RULE_INT,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_soint_1_0, grammarAccess.getScalarNumberOperandAccess().getSointINTTerminalRuleCall_1_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getScalarNumberOperandRule());
                      					}
                      					setWithLastConsumed(
                      						current,
                      						"soint",
                      						lv_soint_1_0,
                      						"org.xtext.example.mydsl_sql.SQL.INT");
                      				
                    }

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalSQLParser.g:7231:3: ( (lv_sodbl_2_0= RULE_SIGNED_DOUBLE ) )
                    {
                    // InternalSQLParser.g:7231:3: ( (lv_sodbl_2_0= RULE_SIGNED_DOUBLE ) )
                    // InternalSQLParser.g:7232:4: (lv_sodbl_2_0= RULE_SIGNED_DOUBLE )
                    {
                    // InternalSQLParser.g:7232:4: (lv_sodbl_2_0= RULE_SIGNED_DOUBLE )
                    // InternalSQLParser.g:7233:5: lv_sodbl_2_0= RULE_SIGNED_DOUBLE
                    {
                    lv_sodbl_2_0=(Token)match(input,RULE_SIGNED_DOUBLE,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_sodbl_2_0, grammarAccess.getScalarNumberOperandAccess().getSodblSIGNED_DOUBLETerminalRuleCall_2_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getScalarNumberOperandRule());
                      					}
                      					setWithLastConsumed(
                      						current,
                      						"sodbl",
                      						lv_sodbl_2_0,
                      						"org.xtext.example.mydsl_sql.SQL.SIGNED_DOUBLE");
                      				
                    }

                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalSQLParser.g:7250:3: ( (lv_sostr_3_0= ruleStringOperand ) )
                    {
                    // InternalSQLParser.g:7250:3: ( (lv_sostr_3_0= ruleStringOperand ) )
                    // InternalSQLParser.g:7251:4: (lv_sostr_3_0= ruleStringOperand )
                    {
                    // InternalSQLParser.g:7251:4: (lv_sostr_3_0= ruleStringOperand )
                    // InternalSQLParser.g:7252:5: lv_sostr_3_0= ruleStringOperand
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getScalarNumberOperandAccess().getSostrStringOperandParserRuleCall_3_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_sostr_3_0=ruleStringOperand();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getScalarNumberOperandRule());
                      					}
                      					set(
                      						current,
                      						"sostr",
                      						lv_sostr_3_0,
                      						"org.xtext.example.mydsl_sql.SQL.StringOperand");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleScalarNumberOperand"


    // $ANTLR start "entryRuleSQLCASE"
    // InternalSQLParser.g:7273:1: entryRuleSQLCASE returns [EObject current=null] : iv_ruleSQLCASE= ruleSQLCASE EOF ;
    public final EObject entryRuleSQLCASE() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSQLCASE = null;


        try {
            // InternalSQLParser.g:7273:48: (iv_ruleSQLCASE= ruleSQLCASE EOF )
            // InternalSQLParser.g:7274:2: iv_ruleSQLCASE= ruleSQLCASE EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSQLCASERule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleSQLCASE=ruleSQLCASE();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSQLCASE; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSQLCASE"


    // $ANTLR start "ruleSQLCASE"
    // InternalSQLParser.g:7280:1: ruleSQLCASE returns [EObject current=null] : (otherlv_0= CASE ( ( (lv_wop_1_0= ruleOperandGroup ) ) | ( (lv_expr_2_0= ruleFullExpression ) ) )? ( (lv_when_3_0= ruleSQLCaseWhens ) ) otherlv_4= END ) ;
    public final EObject ruleSQLCASE() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_4=null;
        EObject lv_wop_1_0 = null;

        EObject lv_expr_2_0 = null;

        EObject lv_when_3_0 = null;



        	enterRule();

        try {
            // InternalSQLParser.g:7286:2: ( (otherlv_0= CASE ( ( (lv_wop_1_0= ruleOperandGroup ) ) | ( (lv_expr_2_0= ruleFullExpression ) ) )? ( (lv_when_3_0= ruleSQLCaseWhens ) ) otherlv_4= END ) )
            // InternalSQLParser.g:7287:2: (otherlv_0= CASE ( ( (lv_wop_1_0= ruleOperandGroup ) ) | ( (lv_expr_2_0= ruleFullExpression ) ) )? ( (lv_when_3_0= ruleSQLCaseWhens ) ) otherlv_4= END )
            {
            // InternalSQLParser.g:7287:2: (otherlv_0= CASE ( ( (lv_wop_1_0= ruleOperandGroup ) ) | ( (lv_expr_2_0= ruleFullExpression ) ) )? ( (lv_when_3_0= ruleSQLCaseWhens ) ) otherlv_4= END )
            // InternalSQLParser.g:7288:3: otherlv_0= CASE ( ( (lv_wop_1_0= ruleOperandGroup ) ) | ( (lv_expr_2_0= ruleFullExpression ) ) )? ( (lv_when_3_0= ruleSQLCaseWhens ) ) otherlv_4= END
            {
            otherlv_0=(Token)match(input,CASE,FOLLOW_95); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getSQLCASEAccess().getCASEKeyword_0());
              		
            }
            // InternalSQLParser.g:7292:3: ( ( (lv_wop_1_0= ruleOperandGroup ) ) | ( (lv_expr_2_0= ruleFullExpression ) ) )?
            int alt134=3;
            alt134 = dfa134.predict(input);
            switch (alt134) {
                case 1 :
                    // InternalSQLParser.g:7293:4: ( (lv_wop_1_0= ruleOperandGroup ) )
                    {
                    // InternalSQLParser.g:7293:4: ( (lv_wop_1_0= ruleOperandGroup ) )
                    // InternalSQLParser.g:7294:5: (lv_wop_1_0= ruleOperandGroup )
                    {
                    // InternalSQLParser.g:7294:5: (lv_wop_1_0= ruleOperandGroup )
                    // InternalSQLParser.g:7295:6: lv_wop_1_0= ruleOperandGroup
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getSQLCASEAccess().getWopOperandGroupParserRuleCall_1_0_0());
                      					
                    }
                    pushFollow(FOLLOW_95);
                    lv_wop_1_0=ruleOperandGroup();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getSQLCASERule());
                      						}
                      						set(
                      							current,
                      							"wop",
                      							lv_wop_1_0,
                      							"org.xtext.example.mydsl_sql.SQL.OperandGroup");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalSQLParser.g:7313:4: ( (lv_expr_2_0= ruleFullExpression ) )
                    {
                    // InternalSQLParser.g:7313:4: ( (lv_expr_2_0= ruleFullExpression ) )
                    // InternalSQLParser.g:7314:5: (lv_expr_2_0= ruleFullExpression )
                    {
                    // InternalSQLParser.g:7314:5: (lv_expr_2_0= ruleFullExpression )
                    // InternalSQLParser.g:7315:6: lv_expr_2_0= ruleFullExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getSQLCASEAccess().getExprFullExpressionParserRuleCall_1_1_0());
                      					
                    }
                    pushFollow(FOLLOW_95);
                    lv_expr_2_0=ruleFullExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getSQLCASERule());
                      						}
                      						set(
                      							current,
                      							"expr",
                      							lv_expr_2_0,
                      							"org.xtext.example.mydsl_sql.SQL.FullExpression");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            // InternalSQLParser.g:7333:3: ( (lv_when_3_0= ruleSQLCaseWhens ) )
            // InternalSQLParser.g:7334:4: (lv_when_3_0= ruleSQLCaseWhens )
            {
            // InternalSQLParser.g:7334:4: (lv_when_3_0= ruleSQLCaseWhens )
            // InternalSQLParser.g:7335:5: lv_when_3_0= ruleSQLCaseWhens
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getSQLCASEAccess().getWhenSQLCaseWhensParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_96);
            lv_when_3_0=ruleSQLCaseWhens();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getSQLCASERule());
              					}
              					set(
              						current,
              						"when",
              						lv_when_3_0,
              						"org.xtext.example.mydsl_sql.SQL.SQLCaseWhens");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_4=(Token)match(input,END,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getSQLCASEAccess().getENDKeyword_3());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSQLCASE"


    // $ANTLR start "entryRuleSQLCaseWhens"
    // InternalSQLParser.g:7360:1: entryRuleSQLCaseWhens returns [EObject current=null] : iv_ruleSQLCaseWhens= ruleSQLCaseWhens EOF ;
    public final EObject entryRuleSQLCaseWhens() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSQLCaseWhens = null;


        try {
            // InternalSQLParser.g:7360:53: (iv_ruleSQLCaseWhens= ruleSQLCaseWhens EOF )
            // InternalSQLParser.g:7361:2: iv_ruleSQLCaseWhens= ruleSQLCaseWhens EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSQLCaseWhensRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleSQLCaseWhens=ruleSQLCaseWhens();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSQLCaseWhens; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSQLCaseWhens"


    // $ANTLR start "ruleSQLCaseWhens"
    // InternalSQLParser.g:7367:1: ruleSQLCaseWhens returns [EObject current=null] : (this_SqlCaseWhen_0= ruleSqlCaseWhen ( () ( (lv_entries_2_0= ruleSqlCaseWhen ) )+ )? ) ;
    public final EObject ruleSQLCaseWhens() throws RecognitionException {
        EObject current = null;

        EObject this_SqlCaseWhen_0 = null;

        EObject lv_entries_2_0 = null;



        	enterRule();

        try {
            // InternalSQLParser.g:7373:2: ( (this_SqlCaseWhen_0= ruleSqlCaseWhen ( () ( (lv_entries_2_0= ruleSqlCaseWhen ) )+ )? ) )
            // InternalSQLParser.g:7374:2: (this_SqlCaseWhen_0= ruleSqlCaseWhen ( () ( (lv_entries_2_0= ruleSqlCaseWhen ) )+ )? )
            {
            // InternalSQLParser.g:7374:2: (this_SqlCaseWhen_0= ruleSqlCaseWhen ( () ( (lv_entries_2_0= ruleSqlCaseWhen ) )+ )? )
            // InternalSQLParser.g:7375:3: this_SqlCaseWhen_0= ruleSqlCaseWhen ( () ( (lv_entries_2_0= ruleSqlCaseWhen ) )+ )?
            {
            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getSQLCaseWhensAccess().getSqlCaseWhenParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_97);
            this_SqlCaseWhen_0=ruleSqlCaseWhen();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_SqlCaseWhen_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalSQLParser.g:7386:3: ( () ( (lv_entries_2_0= ruleSqlCaseWhen ) )+ )?
            int alt136=2;
            int LA136_0 = input.LA(1);

            if ( (LA136_0==WHEN) ) {
                alt136=1;
            }
            switch (alt136) {
                case 1 :
                    // InternalSQLParser.g:7387:4: () ( (lv_entries_2_0= ruleSqlCaseWhen ) )+
                    {
                    // InternalSQLParser.g:7387:4: ()
                    // InternalSQLParser.g:7388:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					/* */
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElementAndAdd(
                      						grammarAccess.getSQLCaseWhensAccess().getWhenListEntriesAction_1_0(),
                      						current);
                      				
                    }

                    }

                    // InternalSQLParser.g:7397:4: ( (lv_entries_2_0= ruleSqlCaseWhen ) )+
                    int cnt135=0;
                    loop135:
                    do {
                        int alt135=2;
                        int LA135_0 = input.LA(1);

                        if ( (LA135_0==WHEN) ) {
                            alt135=1;
                        }


                        switch (alt135) {
                    	case 1 :
                    	    // InternalSQLParser.g:7398:5: (lv_entries_2_0= ruleSqlCaseWhen )
                    	    {
                    	    // InternalSQLParser.g:7398:5: (lv_entries_2_0= ruleSqlCaseWhen )
                    	    // InternalSQLParser.g:7399:6: lv_entries_2_0= ruleSqlCaseWhen
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      						newCompositeNode(grammarAccess.getSQLCaseWhensAccess().getEntriesSqlCaseWhenParserRuleCall_1_1_0());
                    	      					
                    	    }
                    	    pushFollow(FOLLOW_97);
                    	    lv_entries_2_0=ruleSqlCaseWhen();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      						if (current==null) {
                    	      							current = createModelElementForParent(grammarAccess.getSQLCaseWhensRule());
                    	      						}
                    	      						add(
                    	      							current,
                    	      							"entries",
                    	      							lv_entries_2_0,
                    	      							"org.xtext.example.mydsl_sql.SQL.SqlCaseWhen");
                    	      						afterParserOrEnumRuleCall();
                    	      					
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt135 >= 1 ) break loop135;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(135, input);
                                throw eee;
                        }
                        cnt135++;
                    } while (true);


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSQLCaseWhens"


    // $ANTLR start "entryRuleSqlCaseWhen"
    // InternalSQLParser.g:7421:1: entryRuleSqlCaseWhen returns [EObject current=null] : iv_ruleSqlCaseWhen= ruleSqlCaseWhen EOF ;
    public final EObject entryRuleSqlCaseWhen() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSqlCaseWhen = null;


        try {
            // InternalSQLParser.g:7421:52: (iv_ruleSqlCaseWhen= ruleSqlCaseWhen EOF )
            // InternalSQLParser.g:7422:2: iv_ruleSqlCaseWhen= ruleSqlCaseWhen EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSqlCaseWhenRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleSqlCaseWhen=ruleSqlCaseWhen();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSqlCaseWhen; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSqlCaseWhen"


    // $ANTLR start "ruleSqlCaseWhen"
    // InternalSQLParser.g:7428:1: ruleSqlCaseWhen returns [EObject current=null] : (otherlv_0= WHEN ( ( (lv_wop_1_0= ruleOperandGroup ) ) | ( (lv_expr_2_0= ruleFullExpression ) ) ) otherlv_3= THEN ( (lv_texp_4_0= ruleOperandGroup ) ) (otherlv_5= ELSE ( (lv_eexp_6_0= ruleOperandGroup ) ) )? ) ;
    public final EObject ruleSqlCaseWhen() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_wop_1_0 = null;

        EObject lv_expr_2_0 = null;

        EObject lv_texp_4_0 = null;

        EObject lv_eexp_6_0 = null;



        	enterRule();

        try {
            // InternalSQLParser.g:7434:2: ( (otherlv_0= WHEN ( ( (lv_wop_1_0= ruleOperandGroup ) ) | ( (lv_expr_2_0= ruleFullExpression ) ) ) otherlv_3= THEN ( (lv_texp_4_0= ruleOperandGroup ) ) (otherlv_5= ELSE ( (lv_eexp_6_0= ruleOperandGroup ) ) )? ) )
            // InternalSQLParser.g:7435:2: (otherlv_0= WHEN ( ( (lv_wop_1_0= ruleOperandGroup ) ) | ( (lv_expr_2_0= ruleFullExpression ) ) ) otherlv_3= THEN ( (lv_texp_4_0= ruleOperandGroup ) ) (otherlv_5= ELSE ( (lv_eexp_6_0= ruleOperandGroup ) ) )? )
            {
            // InternalSQLParser.g:7435:2: (otherlv_0= WHEN ( ( (lv_wop_1_0= ruleOperandGroup ) ) | ( (lv_expr_2_0= ruleFullExpression ) ) ) otherlv_3= THEN ( (lv_texp_4_0= ruleOperandGroup ) ) (otherlv_5= ELSE ( (lv_eexp_6_0= ruleOperandGroup ) ) )? )
            // InternalSQLParser.g:7436:3: otherlv_0= WHEN ( ( (lv_wop_1_0= ruleOperandGroup ) ) | ( (lv_expr_2_0= ruleFullExpression ) ) ) otherlv_3= THEN ( (lv_texp_4_0= ruleOperandGroup ) ) (otherlv_5= ELSE ( (lv_eexp_6_0= ruleOperandGroup ) ) )?
            {
            otherlv_0=(Token)match(input,WHEN,FOLLOW_23); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getSqlCaseWhenAccess().getWHENKeyword_0());
              		
            }
            // InternalSQLParser.g:7440:3: ( ( (lv_wop_1_0= ruleOperandGroup ) ) | ( (lv_expr_2_0= ruleFullExpression ) ) )
            int alt137=2;
            alt137 = dfa137.predict(input);
            switch (alt137) {
                case 1 :
                    // InternalSQLParser.g:7441:4: ( (lv_wop_1_0= ruleOperandGroup ) )
                    {
                    // InternalSQLParser.g:7441:4: ( (lv_wop_1_0= ruleOperandGroup ) )
                    // InternalSQLParser.g:7442:5: (lv_wop_1_0= ruleOperandGroup )
                    {
                    // InternalSQLParser.g:7442:5: (lv_wop_1_0= ruleOperandGroup )
                    // InternalSQLParser.g:7443:6: lv_wop_1_0= ruleOperandGroup
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getSqlCaseWhenAccess().getWopOperandGroupParserRuleCall_1_0_0());
                      					
                    }
                    pushFollow(FOLLOW_98);
                    lv_wop_1_0=ruleOperandGroup();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getSqlCaseWhenRule());
                      						}
                      						set(
                      							current,
                      							"wop",
                      							lv_wop_1_0,
                      							"org.xtext.example.mydsl_sql.SQL.OperandGroup");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalSQLParser.g:7461:4: ( (lv_expr_2_0= ruleFullExpression ) )
                    {
                    // InternalSQLParser.g:7461:4: ( (lv_expr_2_0= ruleFullExpression ) )
                    // InternalSQLParser.g:7462:5: (lv_expr_2_0= ruleFullExpression )
                    {
                    // InternalSQLParser.g:7462:5: (lv_expr_2_0= ruleFullExpression )
                    // InternalSQLParser.g:7463:6: lv_expr_2_0= ruleFullExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getSqlCaseWhenAccess().getExprFullExpressionParserRuleCall_1_1_0());
                      					
                    }
                    pushFollow(FOLLOW_98);
                    lv_expr_2_0=ruleFullExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getSqlCaseWhenRule());
                      						}
                      						set(
                      							current,
                      							"expr",
                      							lv_expr_2_0,
                      							"org.xtext.example.mydsl_sql.SQL.FullExpression");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,THEN,FOLLOW_60); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getSqlCaseWhenAccess().getTHENKeyword_2());
              		
            }
            // InternalSQLParser.g:7485:3: ( (lv_texp_4_0= ruleOperandGroup ) )
            // InternalSQLParser.g:7486:4: (lv_texp_4_0= ruleOperandGroup )
            {
            // InternalSQLParser.g:7486:4: (lv_texp_4_0= ruleOperandGroup )
            // InternalSQLParser.g:7487:5: lv_texp_4_0= ruleOperandGroup
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getSqlCaseWhenAccess().getTexpOperandGroupParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_99);
            lv_texp_4_0=ruleOperandGroup();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getSqlCaseWhenRule());
              					}
              					set(
              						current,
              						"texp",
              						lv_texp_4_0,
              						"org.xtext.example.mydsl_sql.SQL.OperandGroup");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalSQLParser.g:7504:3: (otherlv_5= ELSE ( (lv_eexp_6_0= ruleOperandGroup ) ) )?
            int alt138=2;
            int LA138_0 = input.LA(1);

            if ( (LA138_0==ELSE) ) {
                alt138=1;
            }
            switch (alt138) {
                case 1 :
                    // InternalSQLParser.g:7505:4: otherlv_5= ELSE ( (lv_eexp_6_0= ruleOperandGroup ) )
                    {
                    otherlv_5=(Token)match(input,ELSE,FOLLOW_60); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_5, grammarAccess.getSqlCaseWhenAccess().getELSEKeyword_4_0());
                      			
                    }
                    // InternalSQLParser.g:7509:4: ( (lv_eexp_6_0= ruleOperandGroup ) )
                    // InternalSQLParser.g:7510:5: (lv_eexp_6_0= ruleOperandGroup )
                    {
                    // InternalSQLParser.g:7510:5: (lv_eexp_6_0= ruleOperandGroup )
                    // InternalSQLParser.g:7511:6: lv_eexp_6_0= ruleOperandGroup
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getSqlCaseWhenAccess().getEexpOperandGroupParserRuleCall_4_1_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_eexp_6_0=ruleOperandGroup();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getSqlCaseWhenRule());
                      						}
                      						set(
                      							current,
                      							"eexp",
                      							lv_eexp_6_0,
                      							"org.xtext.example.mydsl_sql.SQL.OperandGroup");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSqlCaseWhen"


    // $ANTLR start "entryRuleJoinType"
    // InternalSQLParser.g:7533:1: entryRuleJoinType returns [String current=null] : iv_ruleJoinType= ruleJoinType EOF ;
    public final String entryRuleJoinType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleJoinType = null;


        try {
            // InternalSQLParser.g:7533:48: (iv_ruleJoinType= ruleJoinType EOF )
            // InternalSQLParser.g:7534:2: iv_ruleJoinType= ruleJoinType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJoinTypeRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleJoinType=ruleJoinType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJoinType.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleJoinType"


    // $ANTLR start "ruleJoinType"
    // InternalSQLParser.g:7540:1: ruleJoinType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= NATURAL )? (kw= INNER | ( (kw= LEFT | kw= RIGHT | kw= FULL ) (kw= OUTER )? ) | kw= CROSS | kw= STRAIGHT_JOIN )? kw= JOIN ) ;
    public final AntlrDatatypeRuleToken ruleJoinType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalSQLParser.g:7546:2: ( ( (kw= NATURAL )? (kw= INNER | ( (kw= LEFT | kw= RIGHT | kw= FULL ) (kw= OUTER )? ) | kw= CROSS | kw= STRAIGHT_JOIN )? kw= JOIN ) )
            // InternalSQLParser.g:7547:2: ( (kw= NATURAL )? (kw= INNER | ( (kw= LEFT | kw= RIGHT | kw= FULL ) (kw= OUTER )? ) | kw= CROSS | kw= STRAIGHT_JOIN )? kw= JOIN )
            {
            // InternalSQLParser.g:7547:2: ( (kw= NATURAL )? (kw= INNER | ( (kw= LEFT | kw= RIGHT | kw= FULL ) (kw= OUTER )? ) | kw= CROSS | kw= STRAIGHT_JOIN )? kw= JOIN )
            // InternalSQLParser.g:7548:3: (kw= NATURAL )? (kw= INNER | ( (kw= LEFT | kw= RIGHT | kw= FULL ) (kw= OUTER )? ) | kw= CROSS | kw= STRAIGHT_JOIN )? kw= JOIN
            {
            // InternalSQLParser.g:7548:3: (kw= NATURAL )?
            int alt139=2;
            int LA139_0 = input.LA(1);

            if ( (LA139_0==NATURAL) ) {
                alt139=1;
            }
            switch (alt139) {
                case 1 :
                    // InternalSQLParser.g:7549:4: kw= NATURAL
                    {
                    kw=(Token)match(input,NATURAL,FOLLOW_100); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getJoinTypeAccess().getNATURALKeyword_0());
                      			
                    }

                    }
                    break;

            }

            // InternalSQLParser.g:7555:3: (kw= INNER | ( (kw= LEFT | kw= RIGHT | kw= FULL ) (kw= OUTER )? ) | kw= CROSS | kw= STRAIGHT_JOIN )?
            int alt142=5;
            switch ( input.LA(1) ) {
                case INNER:
                    {
                    alt142=1;
                    }
                    break;
                case RIGHT:
                case FULL:
                case LEFT:
                    {
                    alt142=2;
                    }
                    break;
                case CROSS:
                    {
                    alt142=3;
                    }
                    break;
                case STRAIGHT_JOIN:
                    {
                    alt142=4;
                    }
                    break;
            }

            switch (alt142) {
                case 1 :
                    // InternalSQLParser.g:7556:4: kw= INNER
                    {
                    kw=(Token)match(input,INNER,FOLLOW_101); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getJoinTypeAccess().getINNERKeyword_1_0());
                      			
                    }

                    }
                    break;
                case 2 :
                    // InternalSQLParser.g:7562:4: ( (kw= LEFT | kw= RIGHT | kw= FULL ) (kw= OUTER )? )
                    {
                    // InternalSQLParser.g:7562:4: ( (kw= LEFT | kw= RIGHT | kw= FULL ) (kw= OUTER )? )
                    // InternalSQLParser.g:7563:5: (kw= LEFT | kw= RIGHT | kw= FULL ) (kw= OUTER )?
                    {
                    // InternalSQLParser.g:7563:5: (kw= LEFT | kw= RIGHT | kw= FULL )
                    int alt140=3;
                    switch ( input.LA(1) ) {
                    case LEFT:
                        {
                        alt140=1;
                        }
                        break;
                    case RIGHT:
                        {
                        alt140=2;
                        }
                        break;
                    case FULL:
                        {
                        alt140=3;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 140, 0, input);

                        throw nvae;
                    }

                    switch (alt140) {
                        case 1 :
                            // InternalSQLParser.g:7564:6: kw= LEFT
                            {
                            kw=(Token)match(input,LEFT,FOLLOW_102); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						current.merge(kw);
                              						newLeafNode(kw, grammarAccess.getJoinTypeAccess().getLEFTKeyword_1_1_0_0());
                              					
                            }

                            }
                            break;
                        case 2 :
                            // InternalSQLParser.g:7570:6: kw= RIGHT
                            {
                            kw=(Token)match(input,RIGHT,FOLLOW_102); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						current.merge(kw);
                              						newLeafNode(kw, grammarAccess.getJoinTypeAccess().getRIGHTKeyword_1_1_0_1());
                              					
                            }

                            }
                            break;
                        case 3 :
                            // InternalSQLParser.g:7576:6: kw= FULL
                            {
                            kw=(Token)match(input,FULL,FOLLOW_102); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						current.merge(kw);
                              						newLeafNode(kw, grammarAccess.getJoinTypeAccess().getFULLKeyword_1_1_0_2());
                              					
                            }

                            }
                            break;

                    }

                    // InternalSQLParser.g:7582:5: (kw= OUTER )?
                    int alt141=2;
                    int LA141_0 = input.LA(1);

                    if ( (LA141_0==OUTER) ) {
                        alt141=1;
                    }
                    switch (alt141) {
                        case 1 :
                            // InternalSQLParser.g:7583:6: kw= OUTER
                            {
                            kw=(Token)match(input,OUTER,FOLLOW_101); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						current.merge(kw);
                              						newLeafNode(kw, grammarAccess.getJoinTypeAccess().getOUTERKeyword_1_1_1());
                              					
                            }

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalSQLParser.g:7591:4: kw= CROSS
                    {
                    kw=(Token)match(input,CROSS,FOLLOW_101); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getJoinTypeAccess().getCROSSKeyword_1_2());
                      			
                    }

                    }
                    break;
                case 4 :
                    // InternalSQLParser.g:7597:4: kw= STRAIGHT_JOIN
                    {
                    kw=(Token)match(input,STRAIGHT_JOIN,FOLLOW_101); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getJoinTypeAccess().getSTRAIGHT_JOINKeyword_1_3());
                      			
                    }

                    }
                    break;

            }

            kw=(Token)match(input,JOIN,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getJoinTypeAccess().getJOINKeyword_2());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleJoinType"


    // $ANTLR start "entryRuleDBID"
    // InternalSQLParser.g:7612:1: entryRuleDBID returns [String current=null] : iv_ruleDBID= ruleDBID EOF ;
    public final String entryRuleDBID() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDBID = null;


        try {
            // InternalSQLParser.g:7612:44: (iv_ruleDBID= ruleDBID EOF )
            // InternalSQLParser.g:7613:2: iv_ruleDBID= ruleDBID EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDBIDRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDBID=ruleDBID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDBID.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDBID"


    // $ANTLR start "ruleDBID"
    // InternalSQLParser.g:7619:1: ruleDBID returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID | this_DBNAME_1= RULE_DBNAME | this_STRING_2= RULE_STRING ) ;
    public final AntlrDatatypeRuleToken ruleDBID() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token this_DBNAME_1=null;
        Token this_STRING_2=null;


        	enterRule();

        try {
            // InternalSQLParser.g:7625:2: ( (this_ID_0= RULE_ID | this_DBNAME_1= RULE_DBNAME | this_STRING_2= RULE_STRING ) )
            // InternalSQLParser.g:7626:2: (this_ID_0= RULE_ID | this_DBNAME_1= RULE_DBNAME | this_STRING_2= RULE_STRING )
            {
            // InternalSQLParser.g:7626:2: (this_ID_0= RULE_ID | this_DBNAME_1= RULE_DBNAME | this_STRING_2= RULE_STRING )
            int alt143=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt143=1;
                }
                break;
            case RULE_DBNAME:
                {
                alt143=2;
                }
                break;
            case RULE_STRING:
                {
                alt143=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 143, 0, input);

                throw nvae;
            }

            switch (alt143) {
                case 1 :
                    // InternalSQLParser.g:7627:3: this_ID_0= RULE_ID
                    {
                    this_ID_0=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_ID_0);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newLeafNode(this_ID_0, grammarAccess.getDBIDAccess().getIDTerminalRuleCall_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalSQLParser.g:7635:3: this_DBNAME_1= RULE_DBNAME
                    {
                    this_DBNAME_1=(Token)match(input,RULE_DBNAME,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_DBNAME_1);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newLeafNode(this_DBNAME_1, grammarAccess.getDBIDAccess().getDBNAMETerminalRuleCall_1());
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalSQLParser.g:7643:3: this_STRING_2= RULE_STRING
                    {
                    this_STRING_2=(Token)match(input,RULE_STRING,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_STRING_2);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newLeafNode(this_STRING_2, grammarAccess.getDBIDAccess().getSTRINGTerminalRuleCall_2());
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDBID"


    // $ANTLR start "entryRuleStringOperand"
    // InternalSQLParser.g:7654:1: entryRuleStringOperand returns [String current=null] : iv_ruleStringOperand= ruleStringOperand EOF ;
    public final String entryRuleStringOperand() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleStringOperand = null;


        try {
            // InternalSQLParser.g:7654:53: (iv_ruleStringOperand= ruleStringOperand EOF )
            // InternalSQLParser.g:7655:2: iv_ruleStringOperand= ruleStringOperand EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStringOperandRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleStringOperand=ruleStringOperand();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStringOperand.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStringOperand"


    // $ANTLR start "ruleStringOperand"
    // InternalSQLParser.g:7661:1: ruleStringOperand returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_STRING__0= RULE_STRING_ ;
    public final AntlrDatatypeRuleToken ruleStringOperand() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING__0=null;


        	enterRule();

        try {
            // InternalSQLParser.g:7667:2: (this_STRING__0= RULE_STRING_ )
            // InternalSQLParser.g:7668:2: this_STRING__0= RULE_STRING_
            {
            this_STRING__0=(Token)match(input,RULE_STRING_,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_STRING__0);
              	
            }
            if ( state.backtracking==0 ) {

              		newLeafNode(this_STRING__0, grammarAccess.getStringOperandAccess().getSTRING_TerminalRuleCall());
              	
            }

            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStringOperand"


    // $ANTLR start "entryRuleFNAME"
    // InternalSQLParser.g:7678:1: entryRuleFNAME returns [String current=null] : iv_ruleFNAME= ruleFNAME EOF ;
    public final String entryRuleFNAME() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFNAME = null;


        try {
            // InternalSQLParser.g:7678:45: (iv_ruleFNAME= ruleFNAME EOF )
            // InternalSQLParser.g:7679:2: iv_ruleFNAME= ruleFNAME EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFNAMERule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleFNAME=ruleFNAME();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFNAME.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFNAME"


    // $ANTLR start "ruleFNAME"
    // InternalSQLParser.g:7685:1: ruleFNAME returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID kw= LeftParenthesis ) ;
    public final AntlrDatatypeRuleToken ruleFNAME() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;


        	enterRule();

        try {
            // InternalSQLParser.g:7691:2: ( (this_ID_0= RULE_ID kw= LeftParenthesis ) )
            // InternalSQLParser.g:7692:2: (this_ID_0= RULE_ID kw= LeftParenthesis )
            {
            // InternalSQLParser.g:7692:2: (this_ID_0= RULE_ID kw= LeftParenthesis )
            // InternalSQLParser.g:7693:3: this_ID_0= RULE_ID kw= LeftParenthesis
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_ID_0);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_ID_0, grammarAccess.getFNAMEAccess().getIDTerminalRuleCall_0());
              		
            }
            kw=(Token)match(input,LeftParenthesis,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getFNAMEAccess().getLeftParenthesisKeyword_1());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFNAME"


    // $ANTLR start "entryRuleUnsignedValue"
    // InternalSQLParser.g:7709:1: entryRuleUnsignedValue returns [EObject current=null] : iv_ruleUnsignedValue= ruleUnsignedValue EOF ;
    public final EObject entryRuleUnsignedValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnsignedValue = null;


        try {
            // InternalSQLParser.g:7709:54: (iv_ruleUnsignedValue= ruleUnsignedValue EOF )
            // InternalSQLParser.g:7710:2: iv_ruleUnsignedValue= ruleUnsignedValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getUnsignedValueRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleUnsignedValue=ruleUnsignedValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleUnsignedValue; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleUnsignedValue"


    // $ANTLR start "ruleUnsignedValue"
    // InternalSQLParser.g:7716:1: ruleUnsignedValue returns [EObject current=null] : ( (lv_integer_0_0= RULE_UNSIGNED ) ) ;
    public final EObject ruleUnsignedValue() throws RecognitionException {
        EObject current = null;

        Token lv_integer_0_0=null;


        	enterRule();

        try {
            // InternalSQLParser.g:7722:2: ( ( (lv_integer_0_0= RULE_UNSIGNED ) ) )
            // InternalSQLParser.g:7723:2: ( (lv_integer_0_0= RULE_UNSIGNED ) )
            {
            // InternalSQLParser.g:7723:2: ( (lv_integer_0_0= RULE_UNSIGNED ) )
            // InternalSQLParser.g:7724:3: (lv_integer_0_0= RULE_UNSIGNED )
            {
            // InternalSQLParser.g:7724:3: (lv_integer_0_0= RULE_UNSIGNED )
            // InternalSQLParser.g:7725:4: lv_integer_0_0= RULE_UNSIGNED
            {
            lv_integer_0_0=(Token)match(input,RULE_UNSIGNED,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(lv_integer_0_0, grammarAccess.getUnsignedValueAccess().getIntegerUNSIGNEDTerminalRuleCall_0());
              			
            }
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElement(grammarAccess.getUnsignedValueRule());
              				}
              				setWithLastConsumed(
              					current,
              					"integer",
              					lv_integer_0_0,
              					"org.xtext.example.mydsl_sql.SQL.UNSIGNED");
              			
            }

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleUnsignedValue"


    // $ANTLR start "ruleXFunction"
    // InternalSQLParser.g:7744:1: ruleXFunction returns [Enumerator current=null] : ( (enumLiteral_0= IN_1 ) | (enumLiteral_1= NOTIN ) | (enumLiteral_2= EQUAL ) | (enumLiteral_3= NOTEQUAL ) | (enumLiteral_4= LESS ) | (enumLiteral_5= LESS_1 ) | (enumLiteral_6= GREATER_1 ) | (enumLiteral_7= GREATER ) | (enumLiteral_8= BETWEEN_1 ) | (enumLiteral_9= BETWEEN_4 ) | (enumLiteral_10= BETWEEN_3 ) | (enumLiteral_11= BETWEEN_2 ) ) ;
    public final Enumerator ruleXFunction() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;
        Token enumLiteral_6=null;
        Token enumLiteral_7=null;
        Token enumLiteral_8=null;
        Token enumLiteral_9=null;
        Token enumLiteral_10=null;
        Token enumLiteral_11=null;


        	enterRule();

        try {
            // InternalSQLParser.g:7750:2: ( ( (enumLiteral_0= IN_1 ) | (enumLiteral_1= NOTIN ) | (enumLiteral_2= EQUAL ) | (enumLiteral_3= NOTEQUAL ) | (enumLiteral_4= LESS ) | (enumLiteral_5= LESS_1 ) | (enumLiteral_6= GREATER_1 ) | (enumLiteral_7= GREATER ) | (enumLiteral_8= BETWEEN_1 ) | (enumLiteral_9= BETWEEN_4 ) | (enumLiteral_10= BETWEEN_3 ) | (enumLiteral_11= BETWEEN_2 ) ) )
            // InternalSQLParser.g:7751:2: ( (enumLiteral_0= IN_1 ) | (enumLiteral_1= NOTIN ) | (enumLiteral_2= EQUAL ) | (enumLiteral_3= NOTEQUAL ) | (enumLiteral_4= LESS ) | (enumLiteral_5= LESS_1 ) | (enumLiteral_6= GREATER_1 ) | (enumLiteral_7= GREATER ) | (enumLiteral_8= BETWEEN_1 ) | (enumLiteral_9= BETWEEN_4 ) | (enumLiteral_10= BETWEEN_3 ) | (enumLiteral_11= BETWEEN_2 ) )
            {
            // InternalSQLParser.g:7751:2: ( (enumLiteral_0= IN_1 ) | (enumLiteral_1= NOTIN ) | (enumLiteral_2= EQUAL ) | (enumLiteral_3= NOTEQUAL ) | (enumLiteral_4= LESS ) | (enumLiteral_5= LESS_1 ) | (enumLiteral_6= GREATER_1 ) | (enumLiteral_7= GREATER ) | (enumLiteral_8= BETWEEN_1 ) | (enumLiteral_9= BETWEEN_4 ) | (enumLiteral_10= BETWEEN_3 ) | (enumLiteral_11= BETWEEN_2 ) )
            int alt144=12;
            switch ( input.LA(1) ) {
            case IN_1:
                {
                alt144=1;
                }
                break;
            case NOTIN:
                {
                alt144=2;
                }
                break;
            case EQUAL:
                {
                alt144=3;
                }
                break;
            case NOTEQUAL:
                {
                alt144=4;
                }
                break;
            case LESS:
                {
                alt144=5;
                }
                break;
            case LESS_1:
                {
                alt144=6;
                }
                break;
            case GREATER_1:
                {
                alt144=7;
                }
                break;
            case GREATER:
                {
                alt144=8;
                }
                break;
            case BETWEEN_1:
                {
                alt144=9;
                }
                break;
            case BETWEEN_4:
                {
                alt144=10;
                }
                break;
            case BETWEEN_3:
                {
                alt144=11;
                }
                break;
            case BETWEEN_2:
                {
                alt144=12;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 144, 0, input);

                throw nvae;
            }

            switch (alt144) {
                case 1 :
                    // InternalSQLParser.g:7752:3: (enumLiteral_0= IN_1 )
                    {
                    // InternalSQLParser.g:7752:3: (enumLiteral_0= IN_1 )
                    // InternalSQLParser.g:7753:4: enumLiteral_0= IN_1
                    {
                    enumLiteral_0=(Token)match(input,IN_1,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getXFunctionAccess().getXinEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getXFunctionAccess().getXinEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalSQLParser.g:7760:3: (enumLiteral_1= NOTIN )
                    {
                    // InternalSQLParser.g:7760:3: (enumLiteral_1= NOTIN )
                    // InternalSQLParser.g:7761:4: enumLiteral_1= NOTIN
                    {
                    enumLiteral_1=(Token)match(input,NOTIN,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getXFunctionAccess().getXnotinEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getXFunctionAccess().getXnotinEnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalSQLParser.g:7768:3: (enumLiteral_2= EQUAL )
                    {
                    // InternalSQLParser.g:7768:3: (enumLiteral_2= EQUAL )
                    // InternalSQLParser.g:7769:4: enumLiteral_2= EQUAL
                    {
                    enumLiteral_2=(Token)match(input,EQUAL,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getXFunctionAccess().getXeqEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_2, grammarAccess.getXFunctionAccess().getXeqEnumLiteralDeclaration_2());
                      			
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalSQLParser.g:7776:3: (enumLiteral_3= NOTEQUAL )
                    {
                    // InternalSQLParser.g:7776:3: (enumLiteral_3= NOTEQUAL )
                    // InternalSQLParser.g:7777:4: enumLiteral_3= NOTEQUAL
                    {
                    enumLiteral_3=(Token)match(input,NOTEQUAL,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getXFunctionAccess().getXnoteqEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_3, grammarAccess.getXFunctionAccess().getXnoteqEnumLiteralDeclaration_3());
                      			
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalSQLParser.g:7784:3: (enumLiteral_4= LESS )
                    {
                    // InternalSQLParser.g:7784:3: (enumLiteral_4= LESS )
                    // InternalSQLParser.g:7785:4: enumLiteral_4= LESS
                    {
                    enumLiteral_4=(Token)match(input,LESS,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getXFunctionAccess().getXlsEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_4, grammarAccess.getXFunctionAccess().getXlsEnumLiteralDeclaration_4());
                      			
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalSQLParser.g:7792:3: (enumLiteral_5= LESS_1 )
                    {
                    // InternalSQLParser.g:7792:3: (enumLiteral_5= LESS_1 )
                    // InternalSQLParser.g:7793:4: enumLiteral_5= LESS_1
                    {
                    enumLiteral_5=(Token)match(input,LESS_1,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getXFunctionAccess().getXlsrEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_5, grammarAccess.getXFunctionAccess().getXlsrEnumLiteralDeclaration_5());
                      			
                    }

                    }


                    }
                    break;
                case 7 :
                    // InternalSQLParser.g:7800:3: (enumLiteral_6= GREATER_1 )
                    {
                    // InternalSQLParser.g:7800:3: (enumLiteral_6= GREATER_1 )
                    // InternalSQLParser.g:7801:4: enumLiteral_6= GREATER_1
                    {
                    enumLiteral_6=(Token)match(input,GREATER_1,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getXFunctionAccess().getXgtlEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_6, grammarAccess.getXFunctionAccess().getXgtlEnumLiteralDeclaration_6());
                      			
                    }

                    }


                    }
                    break;
                case 8 :
                    // InternalSQLParser.g:7808:3: (enumLiteral_7= GREATER )
                    {
                    // InternalSQLParser.g:7808:3: (enumLiteral_7= GREATER )
                    // InternalSQLParser.g:7809:4: enumLiteral_7= GREATER
                    {
                    enumLiteral_7=(Token)match(input,GREATER,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getXFunctionAccess().getXgtEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_7, grammarAccess.getXFunctionAccess().getXgtEnumLiteralDeclaration_7());
                      			
                    }

                    }


                    }
                    break;
                case 9 :
                    // InternalSQLParser.g:7816:3: (enumLiteral_8= BETWEEN_1 )
                    {
                    // InternalSQLParser.g:7816:3: (enumLiteral_8= BETWEEN_1 )
                    // InternalSQLParser.g:7817:4: enumLiteral_8= BETWEEN_1
                    {
                    enumLiteral_8=(Token)match(input,BETWEEN_1,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getXFunctionAccess().getXbwnEnumLiteralDeclaration_8().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_8, grammarAccess.getXFunctionAccess().getXbwnEnumLiteralDeclaration_8());
                      			
                    }

                    }


                    }
                    break;
                case 10 :
                    // InternalSQLParser.g:7824:3: (enumLiteral_9= BETWEEN_4 )
                    {
                    // InternalSQLParser.g:7824:3: (enumLiteral_9= BETWEEN_4 )
                    // InternalSQLParser.g:7825:4: enumLiteral_9= BETWEEN_4
                    {
                    enumLiteral_9=(Token)match(input,BETWEEN_4,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getXFunctionAccess().getXbwncEnumLiteralDeclaration_9().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_9, grammarAccess.getXFunctionAccess().getXbwncEnumLiteralDeclaration_9());
                      			
                    }

                    }


                    }
                    break;
                case 11 :
                    // InternalSQLParser.g:7832:3: (enumLiteral_10= BETWEEN_3 )
                    {
                    // InternalSQLParser.g:7832:3: (enumLiteral_10= BETWEEN_3 )
                    // InternalSQLParser.g:7833:4: enumLiteral_10= BETWEEN_3
                    {
                    enumLiteral_10=(Token)match(input,BETWEEN_3,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getXFunctionAccess().getXbwnlEnumLiteralDeclaration_10().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_10, grammarAccess.getXFunctionAccess().getXbwnlEnumLiteralDeclaration_10());
                      			
                    }

                    }


                    }
                    break;
                case 12 :
                    // InternalSQLParser.g:7840:3: (enumLiteral_11= BETWEEN_2 )
                    {
                    // InternalSQLParser.g:7840:3: (enumLiteral_11= BETWEEN_2 )
                    // InternalSQLParser.g:7841:4: enumLiteral_11= BETWEEN_2
                    {
                    enumLiteral_11=(Token)match(input,BETWEEN_2,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getXFunctionAccess().getXbwnrEnumLiteralDeclaration_11().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_11, grammarAccess.getXFunctionAccess().getXbwnrEnumLiteralDeclaration_11());
                      			
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXFunction"


    // $ANTLR start "ruleEXTRACT_VALUES"
    // InternalSQLParser.g:7851:1: ruleEXTRACT_VALUES returns [Enumerator current=null] : ( (enumLiteral_0= MICROSECOND ) | (enumLiteral_1= SECOND ) | (enumLiteral_2= MINUTE ) | (enumLiteral_3= HOUR ) | (enumLiteral_4= DAY ) | (enumLiteral_5= WEEK ) | (enumLiteral_6= MONTH ) | (enumLiteral_7= QUARTER ) | (enumLiteral_8= YEAR ) | (enumLiteral_9= SECOND_MICROSECOND ) | (enumLiteral_10= MINUTE_MICROSECOND ) | (enumLiteral_11= MINUTE_SECOND ) | (enumLiteral_12= HOUR_MICROSECOND ) | (enumLiteral_13= HOUR_SECOND ) | (enumLiteral_14= HOUR_MINUTE ) | (enumLiteral_15= DAY_MICROSECOND ) | (enumLiteral_16= DAY_SECOND ) | (enumLiteral_17= DAY_MINUTE ) | (enumLiteral_18= DAY_HOUR ) | (enumLiteral_19= YEAR_MONTH ) ) ;
    public final Enumerator ruleEXTRACT_VALUES() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;
        Token enumLiteral_6=null;
        Token enumLiteral_7=null;
        Token enumLiteral_8=null;
        Token enumLiteral_9=null;
        Token enumLiteral_10=null;
        Token enumLiteral_11=null;
        Token enumLiteral_12=null;
        Token enumLiteral_13=null;
        Token enumLiteral_14=null;
        Token enumLiteral_15=null;
        Token enumLiteral_16=null;
        Token enumLiteral_17=null;
        Token enumLiteral_18=null;
        Token enumLiteral_19=null;


        	enterRule();

        try {
            // InternalSQLParser.g:7857:2: ( ( (enumLiteral_0= MICROSECOND ) | (enumLiteral_1= SECOND ) | (enumLiteral_2= MINUTE ) | (enumLiteral_3= HOUR ) | (enumLiteral_4= DAY ) | (enumLiteral_5= WEEK ) | (enumLiteral_6= MONTH ) | (enumLiteral_7= QUARTER ) | (enumLiteral_8= YEAR ) | (enumLiteral_9= SECOND_MICROSECOND ) | (enumLiteral_10= MINUTE_MICROSECOND ) | (enumLiteral_11= MINUTE_SECOND ) | (enumLiteral_12= HOUR_MICROSECOND ) | (enumLiteral_13= HOUR_SECOND ) | (enumLiteral_14= HOUR_MINUTE ) | (enumLiteral_15= DAY_MICROSECOND ) | (enumLiteral_16= DAY_SECOND ) | (enumLiteral_17= DAY_MINUTE ) | (enumLiteral_18= DAY_HOUR ) | (enumLiteral_19= YEAR_MONTH ) ) )
            // InternalSQLParser.g:7858:2: ( (enumLiteral_0= MICROSECOND ) | (enumLiteral_1= SECOND ) | (enumLiteral_2= MINUTE ) | (enumLiteral_3= HOUR ) | (enumLiteral_4= DAY ) | (enumLiteral_5= WEEK ) | (enumLiteral_6= MONTH ) | (enumLiteral_7= QUARTER ) | (enumLiteral_8= YEAR ) | (enumLiteral_9= SECOND_MICROSECOND ) | (enumLiteral_10= MINUTE_MICROSECOND ) | (enumLiteral_11= MINUTE_SECOND ) | (enumLiteral_12= HOUR_MICROSECOND ) | (enumLiteral_13= HOUR_SECOND ) | (enumLiteral_14= HOUR_MINUTE ) | (enumLiteral_15= DAY_MICROSECOND ) | (enumLiteral_16= DAY_SECOND ) | (enumLiteral_17= DAY_MINUTE ) | (enumLiteral_18= DAY_HOUR ) | (enumLiteral_19= YEAR_MONTH ) )
            {
            // InternalSQLParser.g:7858:2: ( (enumLiteral_0= MICROSECOND ) | (enumLiteral_1= SECOND ) | (enumLiteral_2= MINUTE ) | (enumLiteral_3= HOUR ) | (enumLiteral_4= DAY ) | (enumLiteral_5= WEEK ) | (enumLiteral_6= MONTH ) | (enumLiteral_7= QUARTER ) | (enumLiteral_8= YEAR ) | (enumLiteral_9= SECOND_MICROSECOND ) | (enumLiteral_10= MINUTE_MICROSECOND ) | (enumLiteral_11= MINUTE_SECOND ) | (enumLiteral_12= HOUR_MICROSECOND ) | (enumLiteral_13= HOUR_SECOND ) | (enumLiteral_14= HOUR_MINUTE ) | (enumLiteral_15= DAY_MICROSECOND ) | (enumLiteral_16= DAY_SECOND ) | (enumLiteral_17= DAY_MINUTE ) | (enumLiteral_18= DAY_HOUR ) | (enumLiteral_19= YEAR_MONTH ) )
            int alt145=20;
            switch ( input.LA(1) ) {
            case MICROSECOND:
                {
                alt145=1;
                }
                break;
            case SECOND:
                {
                alt145=2;
                }
                break;
            case MINUTE:
                {
                alt145=3;
                }
                break;
            case HOUR:
                {
                alt145=4;
                }
                break;
            case DAY:
                {
                alt145=5;
                }
                break;
            case WEEK:
                {
                alt145=6;
                }
                break;
            case MONTH:
                {
                alt145=7;
                }
                break;
            case QUARTER:
                {
                alt145=8;
                }
                break;
            case YEAR:
                {
                alt145=9;
                }
                break;
            case SECOND_MICROSECOND:
                {
                alt145=10;
                }
                break;
            case MINUTE_MICROSECOND:
                {
                alt145=11;
                }
                break;
            case MINUTE_SECOND:
                {
                alt145=12;
                }
                break;
            case HOUR_MICROSECOND:
                {
                alt145=13;
                }
                break;
            case HOUR_SECOND:
                {
                alt145=14;
                }
                break;
            case HOUR_MINUTE:
                {
                alt145=15;
                }
                break;
            case DAY_MICROSECOND:
                {
                alt145=16;
                }
                break;
            case DAY_SECOND:
                {
                alt145=17;
                }
                break;
            case DAY_MINUTE:
                {
                alt145=18;
                }
                break;
            case DAY_HOUR:
                {
                alt145=19;
                }
                break;
            case YEAR_MONTH:
                {
                alt145=20;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 145, 0, input);

                throw nvae;
            }

            switch (alt145) {
                case 1 :
                    // InternalSQLParser.g:7859:3: (enumLiteral_0= MICROSECOND )
                    {
                    // InternalSQLParser.g:7859:3: (enumLiteral_0= MICROSECOND )
                    // InternalSQLParser.g:7860:4: enumLiteral_0= MICROSECOND
                    {
                    enumLiteral_0=(Token)match(input,MICROSECOND,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getEXTRACT_VALUESAccess().getMsEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getEXTRACT_VALUESAccess().getMsEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalSQLParser.g:7867:3: (enumLiteral_1= SECOND )
                    {
                    // InternalSQLParser.g:7867:3: (enumLiteral_1= SECOND )
                    // InternalSQLParser.g:7868:4: enumLiteral_1= SECOND
                    {
                    enumLiteral_1=(Token)match(input,SECOND,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getEXTRACT_VALUESAccess().getSEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getEXTRACT_VALUESAccess().getSEnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalSQLParser.g:7875:3: (enumLiteral_2= MINUTE )
                    {
                    // InternalSQLParser.g:7875:3: (enumLiteral_2= MINUTE )
                    // InternalSQLParser.g:7876:4: enumLiteral_2= MINUTE
                    {
                    enumLiteral_2=(Token)match(input,MINUTE,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getEXTRACT_VALUESAccess().getMEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_2, grammarAccess.getEXTRACT_VALUESAccess().getMEnumLiteralDeclaration_2());
                      			
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalSQLParser.g:7883:3: (enumLiteral_3= HOUR )
                    {
                    // InternalSQLParser.g:7883:3: (enumLiteral_3= HOUR )
                    // InternalSQLParser.g:7884:4: enumLiteral_3= HOUR
                    {
                    enumLiteral_3=(Token)match(input,HOUR,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getEXTRACT_VALUESAccess().getHEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_3, grammarAccess.getEXTRACT_VALUESAccess().getHEnumLiteralDeclaration_3());
                      			
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalSQLParser.g:7891:3: (enumLiteral_4= DAY )
                    {
                    // InternalSQLParser.g:7891:3: (enumLiteral_4= DAY )
                    // InternalSQLParser.g:7892:4: enumLiteral_4= DAY
                    {
                    enumLiteral_4=(Token)match(input,DAY,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getEXTRACT_VALUESAccess().getDayEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_4, grammarAccess.getEXTRACT_VALUESAccess().getDayEnumLiteralDeclaration_4());
                      			
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalSQLParser.g:7899:3: (enumLiteral_5= WEEK )
                    {
                    // InternalSQLParser.g:7899:3: (enumLiteral_5= WEEK )
                    // InternalSQLParser.g:7900:4: enumLiteral_5= WEEK
                    {
                    enumLiteral_5=(Token)match(input,WEEK,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getEXTRACT_VALUESAccess().getWeekEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_5, grammarAccess.getEXTRACT_VALUESAccess().getWeekEnumLiteralDeclaration_5());
                      			
                    }

                    }


                    }
                    break;
                case 7 :
                    // InternalSQLParser.g:7907:3: (enumLiteral_6= MONTH )
                    {
                    // InternalSQLParser.g:7907:3: (enumLiteral_6= MONTH )
                    // InternalSQLParser.g:7908:4: enumLiteral_6= MONTH
                    {
                    enumLiteral_6=(Token)match(input,MONTH,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getEXTRACT_VALUESAccess().getMonthEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_6, grammarAccess.getEXTRACT_VALUESAccess().getMonthEnumLiteralDeclaration_6());
                      			
                    }

                    }


                    }
                    break;
                case 8 :
                    // InternalSQLParser.g:7915:3: (enumLiteral_7= QUARTER )
                    {
                    // InternalSQLParser.g:7915:3: (enumLiteral_7= QUARTER )
                    // InternalSQLParser.g:7916:4: enumLiteral_7= QUARTER
                    {
                    enumLiteral_7=(Token)match(input,QUARTER,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getEXTRACT_VALUESAccess().getQuartEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_7, grammarAccess.getEXTRACT_VALUESAccess().getQuartEnumLiteralDeclaration_7());
                      			
                    }

                    }


                    }
                    break;
                case 9 :
                    // InternalSQLParser.g:7923:3: (enumLiteral_8= YEAR )
                    {
                    // InternalSQLParser.g:7923:3: (enumLiteral_8= YEAR )
                    // InternalSQLParser.g:7924:4: enumLiteral_8= YEAR
                    {
                    enumLiteral_8=(Token)match(input,YEAR,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getEXTRACT_VALUESAccess().getYearEnumLiteralDeclaration_8().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_8, grammarAccess.getEXTRACT_VALUESAccess().getYearEnumLiteralDeclaration_8());
                      			
                    }

                    }


                    }
                    break;
                case 10 :
                    // InternalSQLParser.g:7931:3: (enumLiteral_9= SECOND_MICROSECOND )
                    {
                    // InternalSQLParser.g:7931:3: (enumLiteral_9= SECOND_MICROSECOND )
                    // InternalSQLParser.g:7932:4: enumLiteral_9= SECOND_MICROSECOND
                    {
                    enumLiteral_9=(Token)match(input,SECOND_MICROSECOND,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getEXTRACT_VALUESAccess().getMicrosEnumLiteralDeclaration_9().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_9, grammarAccess.getEXTRACT_VALUESAccess().getMicrosEnumLiteralDeclaration_9());
                      			
                    }

                    }


                    }
                    break;
                case 11 :
                    // InternalSQLParser.g:7939:3: (enumLiteral_10= MINUTE_MICROSECOND )
                    {
                    // InternalSQLParser.g:7939:3: (enumLiteral_10= MINUTE_MICROSECOND )
                    // InternalSQLParser.g:7940:4: enumLiteral_10= MINUTE_MICROSECOND
                    {
                    enumLiteral_10=(Token)match(input,MINUTE_MICROSECOND,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getEXTRACT_VALUESAccess().getMinMicroEnumLiteralDeclaration_10().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_10, grammarAccess.getEXTRACT_VALUESAccess().getMinMicroEnumLiteralDeclaration_10());
                      			
                    }

                    }


                    }
                    break;
                case 12 :
                    // InternalSQLParser.g:7947:3: (enumLiteral_11= MINUTE_SECOND )
                    {
                    // InternalSQLParser.g:7947:3: (enumLiteral_11= MINUTE_SECOND )
                    // InternalSQLParser.g:7948:4: enumLiteral_11= MINUTE_SECOND
                    {
                    enumLiteral_11=(Token)match(input,MINUTE_SECOND,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getEXTRACT_VALUESAccess().getMinSecEnumLiteralDeclaration_11().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_11, grammarAccess.getEXTRACT_VALUESAccess().getMinSecEnumLiteralDeclaration_11());
                      			
                    }

                    }


                    }
                    break;
                case 13 :
                    // InternalSQLParser.g:7955:3: (enumLiteral_12= HOUR_MICROSECOND )
                    {
                    // InternalSQLParser.g:7955:3: (enumLiteral_12= HOUR_MICROSECOND )
                    // InternalSQLParser.g:7956:4: enumLiteral_12= HOUR_MICROSECOND
                    {
                    enumLiteral_12=(Token)match(input,HOUR_MICROSECOND,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getEXTRACT_VALUESAccess().getHmsEnumLiteralDeclaration_12().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_12, grammarAccess.getEXTRACT_VALUESAccess().getHmsEnumLiteralDeclaration_12());
                      			
                    }

                    }


                    }
                    break;
                case 14 :
                    // InternalSQLParser.g:7963:3: (enumLiteral_13= HOUR_SECOND )
                    {
                    // InternalSQLParser.g:7963:3: (enumLiteral_13= HOUR_SECOND )
                    // InternalSQLParser.g:7964:4: enumLiteral_13= HOUR_SECOND
                    {
                    enumLiteral_13=(Token)match(input,HOUR_SECOND,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getEXTRACT_VALUESAccess().getHsEnumLiteralDeclaration_13().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_13, grammarAccess.getEXTRACT_VALUESAccess().getHsEnumLiteralDeclaration_13());
                      			
                    }

                    }


                    }
                    break;
                case 15 :
                    // InternalSQLParser.g:7971:3: (enumLiteral_14= HOUR_MINUTE )
                    {
                    // InternalSQLParser.g:7971:3: (enumLiteral_14= HOUR_MINUTE )
                    // InternalSQLParser.g:7972:4: enumLiteral_14= HOUR_MINUTE
                    {
                    enumLiteral_14=(Token)match(input,HOUR_MINUTE,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getEXTRACT_VALUESAccess().getHminEnumLiteralDeclaration_14().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_14, grammarAccess.getEXTRACT_VALUESAccess().getHminEnumLiteralDeclaration_14());
                      			
                    }

                    }


                    }
                    break;
                case 16 :
                    // InternalSQLParser.g:7979:3: (enumLiteral_15= DAY_MICROSECOND )
                    {
                    // InternalSQLParser.g:7979:3: (enumLiteral_15= DAY_MICROSECOND )
                    // InternalSQLParser.g:7980:4: enumLiteral_15= DAY_MICROSECOND
                    {
                    enumLiteral_15=(Token)match(input,DAY_MICROSECOND,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getEXTRACT_VALUESAccess().getDmsEnumLiteralDeclaration_15().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_15, grammarAccess.getEXTRACT_VALUESAccess().getDmsEnumLiteralDeclaration_15());
                      			
                    }

                    }


                    }
                    break;
                case 17 :
                    // InternalSQLParser.g:7987:3: (enumLiteral_16= DAY_SECOND )
                    {
                    // InternalSQLParser.g:7987:3: (enumLiteral_16= DAY_SECOND )
                    // InternalSQLParser.g:7988:4: enumLiteral_16= DAY_SECOND
                    {
                    enumLiteral_16=(Token)match(input,DAY_SECOND,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getEXTRACT_VALUESAccess().getDsEnumLiteralDeclaration_16().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_16, grammarAccess.getEXTRACT_VALUESAccess().getDsEnumLiteralDeclaration_16());
                      			
                    }

                    }


                    }
                    break;
                case 18 :
                    // InternalSQLParser.g:7995:3: (enumLiteral_17= DAY_MINUTE )
                    {
                    // InternalSQLParser.g:7995:3: (enumLiteral_17= DAY_MINUTE )
                    // InternalSQLParser.g:7996:4: enumLiteral_17= DAY_MINUTE
                    {
                    enumLiteral_17=(Token)match(input,DAY_MINUTE,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getEXTRACT_VALUESAccess().getDayminEnumLiteralDeclaration_17().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_17, grammarAccess.getEXTRACT_VALUESAccess().getDayminEnumLiteralDeclaration_17());
                      			
                    }

                    }


                    }
                    break;
                case 19 :
                    // InternalSQLParser.g:8003:3: (enumLiteral_18= DAY_HOUR )
                    {
                    // InternalSQLParser.g:8003:3: (enumLiteral_18= DAY_HOUR )
                    // InternalSQLParser.g:8004:4: enumLiteral_18= DAY_HOUR
                    {
                    enumLiteral_18=(Token)match(input,DAY_HOUR,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getEXTRACT_VALUESAccess().getDayhEnumLiteralDeclaration_18().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_18, grammarAccess.getEXTRACT_VALUESAccess().getDayhEnumLiteralDeclaration_18());
                      			
                    }

                    }


                    }
                    break;
                case 20 :
                    // InternalSQLParser.g:8011:3: (enumLiteral_19= YEAR_MONTH )
                    {
                    // InternalSQLParser.g:8011:3: (enumLiteral_19= YEAR_MONTH )
                    // InternalSQLParser.g:8012:4: enumLiteral_19= YEAR_MONTH
                    {
                    enumLiteral_19=(Token)match(input,YEAR_MONTH,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getEXTRACT_VALUESAccess().getYearMonthEnumLiteralDeclaration_19().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_19, grammarAccess.getEXTRACT_VALUESAccess().getYearMonthEnumLiteralDeclaration_19());
                      			
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEXTRACT_VALUES"

    // $ANTLR start synpred176_InternalSQLParser
    public final void synpred176_InternalSQLParser_fragment() throws RecognitionException {   
        EObject lv_wop_1_0 = null;


        // InternalSQLParser.g:7293:4: ( ( (lv_wop_1_0= ruleOperandGroup ) ) )
        // InternalSQLParser.g:7293:4: ( (lv_wop_1_0= ruleOperandGroup ) )
        {
        // InternalSQLParser.g:7293:4: ( (lv_wop_1_0= ruleOperandGroup ) )
        // InternalSQLParser.g:7294:5: (lv_wop_1_0= ruleOperandGroup )
        {
        // InternalSQLParser.g:7294:5: (lv_wop_1_0= ruleOperandGroup )
        // InternalSQLParser.g:7295:6: lv_wop_1_0= ruleOperandGroup
        {
        if ( state.backtracking==0 ) {

          						newCompositeNode(grammarAccess.getSQLCASEAccess().getWopOperandGroupParserRuleCall_1_0_0());
          					
        }
        pushFollow(FOLLOW_2);
        lv_wop_1_0=ruleOperandGroup();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred176_InternalSQLParser

    // $ANTLR start synpred177_InternalSQLParser
    public final void synpred177_InternalSQLParser_fragment() throws RecognitionException {   
        EObject lv_expr_2_0 = null;


        // InternalSQLParser.g:7313:4: ( ( (lv_expr_2_0= ruleFullExpression ) ) )
        // InternalSQLParser.g:7313:4: ( (lv_expr_2_0= ruleFullExpression ) )
        {
        // InternalSQLParser.g:7313:4: ( (lv_expr_2_0= ruleFullExpression ) )
        // InternalSQLParser.g:7314:5: (lv_expr_2_0= ruleFullExpression )
        {
        // InternalSQLParser.g:7314:5: (lv_expr_2_0= ruleFullExpression )
        // InternalSQLParser.g:7315:6: lv_expr_2_0= ruleFullExpression
        {
        if ( state.backtracking==0 ) {

          						newCompositeNode(grammarAccess.getSQLCASEAccess().getExprFullExpressionParserRuleCall_1_1_0());
          					
        }
        pushFollow(FOLLOW_2);
        lv_expr_2_0=ruleFullExpression();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred177_InternalSQLParser

    // $ANTLR start synpred180_InternalSQLParser
    public final void synpred180_InternalSQLParser_fragment() throws RecognitionException {   
        EObject lv_wop_1_0 = null;


        // InternalSQLParser.g:7441:4: ( ( (lv_wop_1_0= ruleOperandGroup ) ) )
        // InternalSQLParser.g:7441:4: ( (lv_wop_1_0= ruleOperandGroup ) )
        {
        // InternalSQLParser.g:7441:4: ( (lv_wop_1_0= ruleOperandGroup ) )
        // InternalSQLParser.g:7442:5: (lv_wop_1_0= ruleOperandGroup )
        {
        // InternalSQLParser.g:7442:5: (lv_wop_1_0= ruleOperandGroup )
        // InternalSQLParser.g:7443:6: lv_wop_1_0= ruleOperandGroup
        {
        if ( state.backtracking==0 ) {

          						newCompositeNode(grammarAccess.getSqlCaseWhenAccess().getWopOperandGroupParserRuleCall_1_0_0());
          					
        }
        pushFollow(FOLLOW_2);
        lv_wop_1_0=ruleOperandGroup();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred180_InternalSQLParser

    // Delegated rules

    public final boolean synpred177_InternalSQLParser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred177_InternalSQLParser_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred180_InternalSQLParser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred180_InternalSQLParser_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred176_InternalSQLParser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred176_InternalSQLParser_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA78 dfa78 = new DFA78(this);
    protected DFA77 dfa77 = new DFA77(this);
    protected DFA134 dfa134 = new DFA134(this);
    protected DFA137 dfa137 = new DFA137(this);
    static final String dfa_1s = "\12\uffff";
    static final String dfa_2s = "\5\uffff\1\11\4\uffff";
    static final String dfa_3s = "\1\42\1\51\1\uffff\1\42\1\uffff\1\11\4\uffff";
    static final String dfa_4s = "\1\u008f\1\166\1\uffff\1\u008f\1\uffff\1\u0084\4\uffff";
    static final String dfa_5s = "\2\uffff\1\1\1\uffff\1\2\1\uffff\1\3\1\5\1\6\1\4";
    static final String dfa_6s = "\12\uffff}>";
    static final String[] dfa_7s = {
            "\1\4\6\uffff\1\10\11\uffff\1\4\22\uffff\1\4\11\uffff\1\2\23\uffff\1\1\5\uffff\1\6\5\uffff\1\7\5\uffff\1\3\13\uffff\1\4\1\5\1\uffff\3\4\4\uffff\4\4",
            "\1\10\106\uffff\1\7\5\uffff\1\2",
            "",
            "\1\2\6\uffff\1\2\4\uffff\1\4\4\uffff\1\2\22\uffff\1\2\11\uffff\1\2\23\uffff\1\2\5\uffff\1\2\5\uffff\1\2\5\uffff\1\2\13\uffff\2\2\1\uffff\3\2\4\uffff\4\2",
            "",
            "\1\11\10\uffff\1\11\14\uffff\1\4\4\uffff\1\11\3\uffff\1\11\1\4\1\11\1\uffff\1\11\7\uffff\2\11\1\uffff\4\11\2\uffff\1\11\3\uffff\2\11\1\uffff\1\11\5\uffff\1\11\1\uffff\1\11\1\uffff\1\11\1\4\6\uffff\1\11\2\uffff\1\11\4\uffff\1\11\5\uffff\1\4\4\uffff\1\4\1\uffff\3\4\2\uffff\2\4\1\uffff\1\11\2\4\1\uffff\1\11\1\4\1\11\1\4\1\uffff\4\4\3\uffff\1\11\1\4",
            "",
            "",
            "",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final short[] dfa_2 = DFA.unpackEncodedString(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final char[] dfa_4 = DFA.unpackEncodedStringToUnsignedChars(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[] dfa_6 = DFA.unpackEncodedString(dfa_6s);
    static final short[][] dfa_7 = unpackEncodedStringArray(dfa_7s);

    class DFA78 extends DFA {

        public DFA78(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 78;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "3619:2: ( ( (lv_expgroup_0_0= ruleExpressionGroup ) ) | ( (lv_exp_1_0= ruleExpression ) ) | ( ( (lv_xexp_2_1= ruleXExpression | lv_xexp_2_2= ruleXExpression_ ) ) ) | ( (lv_notPrm_3_0= RULE_JRNPARAM ) ) | ( (lv_in_4_0= ruleInOperator ) ) | ( (lv_exists_5_0= ruleExistsOperator ) ) )";
        }
    }
    static final String dfa_8s = "\20\uffff";
    static final String dfa_9s = "\1\152\1\20\14\171\2\uffff";
    static final String dfa_10s = "\1\152\1\150\14\u0080\2\uffff";
    static final String dfa_11s = "\16\uffff\1\1\1\2";
    static final String dfa_12s = "\20\uffff}>";
    static final String[] dfa_13s = {
            "\1\1",
            "\1\13\5\uffff\1\15\1\5\1\14\1\10\3\uffff\1\12\1\11\21\uffff\1\4\1\7\1\3\22\uffff\1\6\42\uffff\1\2",
            "\1\16\6\uffff\1\17",
            "\1\16\6\uffff\1\17",
            "\1\16\6\uffff\1\17",
            "\1\16\6\uffff\1\17",
            "\1\16\6\uffff\1\17",
            "\1\16\6\uffff\1\17",
            "\1\16\6\uffff\1\17",
            "\1\16\6\uffff\1\17",
            "\1\16\6\uffff\1\17",
            "\1\16\6\uffff\1\17",
            "\1\16\6\uffff\1\17",
            "\1\16\6\uffff\1\17",
            "",
            ""
    };

    static final short[] dfa_8 = DFA.unpackEncodedString(dfa_8s);
    static final char[] dfa_9 = DFA.unpackEncodedStringToUnsignedChars(dfa_9s);
    static final char[] dfa_10 = DFA.unpackEncodedStringToUnsignedChars(dfa_10s);
    static final short[] dfa_11 = DFA.unpackEncodedString(dfa_11s);
    static final short[] dfa_12 = DFA.unpackEncodedString(dfa_12s);
    static final short[][] dfa_13 = unpackEncodedStringArray(dfa_13s);

    class DFA77 extends DFA {

        public DFA77(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 77;
            this.eot = dfa_8;
            this.eof = dfa_8;
            this.min = dfa_9;
            this.max = dfa_10;
            this.accept = dfa_11;
            this.special = dfa_12;
            this.transition = dfa_13;
        }
        public String getDescription() {
            return "3662:5: (lv_xexp_2_1= ruleXExpression | lv_xexp_2_2= ruleXExpression_ )";
        }
    }
    static final String dfa_14s = "\25\uffff";
    static final String dfa_15s = "\1\42\15\0\7\uffff";
    static final String dfa_16s = "\1\u008f\15\0\7\uffff";
    static final String dfa_17s = "\16\uffff\1\2\4\uffff\1\3\1\1";
    static final String dfa_18s = "\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\7\uffff}>";
    static final String[] dfa_19s = {
            "\1\14\6\uffff\1\16\11\uffff\1\13\22\uffff\1\15\11\uffff\1\16\10\uffff\1\23\12\uffff\1\16\5\uffff\1\16\5\uffff\1\16\5\uffff\1\12\13\uffff\1\4\1\5\1\uffff\1\6\1\7\1\10\4\uffff\1\11\1\3\1\2\1\1",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] dfa_14 = DFA.unpackEncodedString(dfa_14s);
    static final char[] dfa_15 = DFA.unpackEncodedStringToUnsignedChars(dfa_15s);
    static final char[] dfa_16 = DFA.unpackEncodedStringToUnsignedChars(dfa_16s);
    static final short[] dfa_17 = DFA.unpackEncodedString(dfa_17s);
    static final short[] dfa_18 = DFA.unpackEncodedString(dfa_18s);
    static final short[][] dfa_19 = unpackEncodedStringArray(dfa_19s);

    class DFA134 extends DFA {

        public DFA134(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 134;
            this.eot = dfa_14;
            this.eof = dfa_14;
            this.min = dfa_15;
            this.max = dfa_16;
            this.accept = dfa_17;
            this.special = dfa_18;
            this.transition = dfa_19;
        }
        public String getDescription() {
            return "7292:3: ( ( (lv_wop_1_0= ruleOperandGroup ) ) | ( (lv_expr_2_0= ruleFullExpression ) ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA134_1 = input.LA(1);

                         
                        int index134_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred176_InternalSQLParser()) ) {s = 20;}

                        else if ( (synpred177_InternalSQLParser()) ) {s = 14;}

                         
                        input.seek(index134_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA134_2 = input.LA(1);

                         
                        int index134_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred176_InternalSQLParser()) ) {s = 20;}

                        else if ( (synpred177_InternalSQLParser()) ) {s = 14;}

                         
                        input.seek(index134_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA134_3 = input.LA(1);

                         
                        int index134_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred176_InternalSQLParser()) ) {s = 20;}

                        else if ( (synpred177_InternalSQLParser()) ) {s = 14;}

                         
                        input.seek(index134_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA134_4 = input.LA(1);

                         
                        int index134_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred176_InternalSQLParser()) ) {s = 20;}

                        else if ( (synpred177_InternalSQLParser()) ) {s = 14;}

                         
                        input.seek(index134_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA134_5 = input.LA(1);

                         
                        int index134_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred176_InternalSQLParser()) ) {s = 20;}

                        else if ( (synpred177_InternalSQLParser()) ) {s = 14;}

                         
                        input.seek(index134_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA134_6 = input.LA(1);

                         
                        int index134_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred176_InternalSQLParser()) ) {s = 20;}

                        else if ( (synpred177_InternalSQLParser()) ) {s = 14;}

                         
                        input.seek(index134_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA134_7 = input.LA(1);

                         
                        int index134_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred176_InternalSQLParser()) ) {s = 20;}

                        else if ( (synpred177_InternalSQLParser()) ) {s = 14;}

                         
                        input.seek(index134_7);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA134_8 = input.LA(1);

                         
                        int index134_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred176_InternalSQLParser()) ) {s = 20;}

                        else if ( (synpred177_InternalSQLParser()) ) {s = 14;}

                         
                        input.seek(index134_8);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA134_9 = input.LA(1);

                         
                        int index134_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred176_InternalSQLParser()) ) {s = 20;}

                        else if ( (synpred177_InternalSQLParser()) ) {s = 14;}

                         
                        input.seek(index134_9);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA134_10 = input.LA(1);

                         
                        int index134_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred176_InternalSQLParser()) ) {s = 20;}

                        else if ( (synpred177_InternalSQLParser()) ) {s = 14;}

                         
                        input.seek(index134_10);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA134_11 = input.LA(1);

                         
                        int index134_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred176_InternalSQLParser()) ) {s = 20;}

                        else if ( (synpred177_InternalSQLParser()) ) {s = 14;}

                         
                        input.seek(index134_11);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA134_12 = input.LA(1);

                         
                        int index134_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred176_InternalSQLParser()) ) {s = 20;}

                        else if ( (synpred177_InternalSQLParser()) ) {s = 14;}

                         
                        input.seek(index134_12);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA134_13 = input.LA(1);

                         
                        int index134_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred176_InternalSQLParser()) ) {s = 20;}

                        else if ( (synpred177_InternalSQLParser()) ) {s = 14;}

                         
                        input.seek(index134_13);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 134, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_20s = "\24\uffff";
    static final String dfa_21s = "\1\42\15\0\6\uffff";
    static final String dfa_22s = "\1\u008f\15\0\6\uffff";
    static final String dfa_23s = "\16\uffff\1\2\4\uffff\1\1";
    static final String dfa_24s = "\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\6\uffff}>";
    static final String[] dfa_25s = {
            "\1\14\6\uffff\1\16\11\uffff\1\13\22\uffff\1\15\11\uffff\1\16\23\uffff\1\16\5\uffff\1\16\5\uffff\1\16\5\uffff\1\12\13\uffff\1\4\1\5\1\uffff\1\6\1\7\1\10\4\uffff\1\11\1\3\1\2\1\1",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] dfa_20 = DFA.unpackEncodedString(dfa_20s);
    static final char[] dfa_21 = DFA.unpackEncodedStringToUnsignedChars(dfa_21s);
    static final char[] dfa_22 = DFA.unpackEncodedStringToUnsignedChars(dfa_22s);
    static final short[] dfa_23 = DFA.unpackEncodedString(dfa_23s);
    static final short[] dfa_24 = DFA.unpackEncodedString(dfa_24s);
    static final short[][] dfa_25 = unpackEncodedStringArray(dfa_25s);

    class DFA137 extends DFA {

        public DFA137(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 137;
            this.eot = dfa_20;
            this.eof = dfa_20;
            this.min = dfa_21;
            this.max = dfa_22;
            this.accept = dfa_23;
            this.special = dfa_24;
            this.transition = dfa_25;
        }
        public String getDescription() {
            return "7440:3: ( ( (lv_wop_1_0= ruleOperandGroup ) ) | ( (lv_expr_2_0= ruleFullExpression ) ) )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA137_1 = input.LA(1);

                         
                        int index137_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred180_InternalSQLParser()) ) {s = 19;}

                        else if ( (true) ) {s = 14;}

                         
                        input.seek(index137_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA137_2 = input.LA(1);

                         
                        int index137_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred180_InternalSQLParser()) ) {s = 19;}

                        else if ( (true) ) {s = 14;}

                         
                        input.seek(index137_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA137_3 = input.LA(1);

                         
                        int index137_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred180_InternalSQLParser()) ) {s = 19;}

                        else if ( (true) ) {s = 14;}

                         
                        input.seek(index137_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA137_4 = input.LA(1);

                         
                        int index137_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred180_InternalSQLParser()) ) {s = 19;}

                        else if ( (true) ) {s = 14;}

                         
                        input.seek(index137_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA137_5 = input.LA(1);

                         
                        int index137_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred180_InternalSQLParser()) ) {s = 19;}

                        else if ( (true) ) {s = 14;}

                         
                        input.seek(index137_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA137_6 = input.LA(1);

                         
                        int index137_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred180_InternalSQLParser()) ) {s = 19;}

                        else if ( (true) ) {s = 14;}

                         
                        input.seek(index137_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA137_7 = input.LA(1);

                         
                        int index137_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred180_InternalSQLParser()) ) {s = 19;}

                        else if ( (true) ) {s = 14;}

                         
                        input.seek(index137_7);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA137_8 = input.LA(1);

                         
                        int index137_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred180_InternalSQLParser()) ) {s = 19;}

                        else if ( (true) ) {s = 14;}

                         
                        input.seek(index137_8);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA137_9 = input.LA(1);

                         
                        int index137_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred180_InternalSQLParser()) ) {s = 19;}

                        else if ( (true) ) {s = 14;}

                         
                        input.seek(index137_9);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA137_10 = input.LA(1);

                         
                        int index137_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred180_InternalSQLParser()) ) {s = 19;}

                        else if ( (true) ) {s = 14;}

                         
                        input.seek(index137_10);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA137_11 = input.LA(1);

                         
                        int index137_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred180_InternalSQLParser()) ) {s = 19;}

                        else if ( (true) ) {s = 14;}

                         
                        input.seek(index137_11);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA137_12 = input.LA(1);

                         
                        int index137_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred180_InternalSQLParser()) ) {s = 19;}

                        else if ( (true) ) {s = 14;}

                         
                        input.seek(index137_12);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA137_13 = input.LA(1);

                         
                        int index137_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred180_InternalSQLParser()) ) {s = 19;}

                        else if ( (true) ) {s = 14;}

                         
                        input.seek(index137_13);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 137, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000400000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x000000000000E000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000000L,0x0040400000000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000000L,0x0000400000000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000000L,0x0040000000000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000000L,0x0080000000000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000002L,0x0200000000000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000000L,0x0000002000100000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0400010000040002L,0x0000000000000004L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000400000000000L,0x0000000024000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0008000408000000L,0x0040004000000040L,0x000000000000F0FCL});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x00000000000000C0L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0008002408000000L,0x0040004004000040L,0x000000000000F0FCL});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0008000408000000L,0x0040004004000040L,0x000000000000F0FCL});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000000000L,0x0040000000000000L,0x000000000000E000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x22A0140000000002L,0x0000000000000010L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0008020400000000L,0x0041041000010040L,0x000000000000F0ECL});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x22A0140000000002L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000000000L,0x0000800000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x000000000000E020L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x2220140000000002L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x2220100000000002L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0220100000000002L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000000000000L,0x0000000020000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0020100000000002L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0020000000000002L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000000000002L,0x0000400000000000L,0x000000000000E000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x000000000000E000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000000000002L,0x0800000000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0110001000000202L,0x0000000000005402L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000000000000000L,0x0004000000000008L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x8000008000000002L,0x0000400000000000L,0x000000000000E000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L,0x00000000000010ECL});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000000000000000L,0x0040008000000000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000000000000000L,0x0001000000000000L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0000000000000000L,0x0040000080000000L,0x000000000000E000L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0000000000000000L,0x0000000080000000L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0000000A00000000L,0x0040000000000000L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0000000000000002L,0x0000400000000000L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0000000000000000L,0x0800000000000000L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0000000000000002L,0x0000000100000080L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x0000000000000002L,0x0008000040000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x0007000063C10000L,0x0000010000000020L});
    public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x0000000000000000L,0x0200000000000000L});
    public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x0008000400000000L,0x0040000000000040L,0x000000000000F0ECL});
    public static final BitSet FOLLOW_61 = new BitSet(new long[]{0x0000000000000000L,0x0200000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_62 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_63 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_64 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000003L});
    public static final BitSet FOLLOW_65 = new BitSet(new long[]{0x0008020480000000L,0xE0533E1000018040L,0x000000000000F0ECL});
    public static final BitSet FOLLOW_66 = new BitSet(new long[]{0x0000000000000000L,0x0000001000020000L});
    public static final BitSet FOLLOW_67 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_68 = new BitSet(new long[]{0x0008000400000000L,0x00400000A0200040L,0x000000000000F0ECL});
    public static final BitSet FOLLOW_69 = new BitSet(new long[]{0x0008000000000000L,0x0000000000000000L,0x00000000000090ECL});
    public static final BitSet FOLLOW_70 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_71 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_72 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_73 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_74 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x00000000000017ECL});
    public static final BitSet FOLLOW_75 = new BitSet(new long[]{0x0000000000000002L,0x1520000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_76 = new BitSet(new long[]{0x0008000408000000L,0x00C0000020000040L,0x000000000000F0FCL});
    public static final BitSet FOLLOW_77 = new BitSet(new long[]{0x0000000000000002L,0x0000000000080000L});
    public static final BitSet FOLLOW_78 = new BitSet(new long[]{0x080028400400FDF0L,0x0000000209000800L});
    public static final BitSet FOLLOW_79 = new BitSet(new long[]{0x2000000000080000L,0x0080000000000000L});
    public static final BitSet FOLLOW_80 = new BitSet(new long[]{0x2000000000000002L});
    public static final BitSet FOLLOW_81 = new BitSet(new long[]{0x0000000000000002L,0x0000000000100001L});
    public static final BitSet FOLLOW_82 = new BitSet(new long[]{0x0008000580200000L,0x0040000000000040L,0x000000000000F0ECL});
    public static final BitSet FOLLOW_83 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_84 = new BitSet(new long[]{0x0000000000000000L,0x0000002000000000L});
    public static final BitSet FOLLOW_85 = new BitSet(new long[]{0x0000000000120000L});
    public static final BitSet FOLLOW_86 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_87 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_88 = new BitSet(new long[]{0x1000000000000002L,0x0000000100000080L});
    public static final BitSet FOLLOW_89 = new BitSet(new long[]{0x1000000000000002L});
    public static final BitSet FOLLOW_90 = new BitSet(new long[]{0x0040000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_91 = new BitSet(new long[]{0x0008000408000000L,0x0040000020000040L,0x000000000000F0ECL});
    public static final BitSet FOLLOW_92 = new BitSet(new long[]{0x0000000000000000L,0x00C0000000000000L});
    public static final BitSet FOLLOW_93 = new BitSet(new long[]{0x0000000000000000L,0x0280000000000000L});
    public static final BitSet FOLLOW_94 = new BitSet(new long[]{0x0000000000000002L,0x0000000010000000L});
    public static final BitSet FOLLOW_95 = new BitSet(new long[]{0x0008020400000000L,0x0041041002010040L,0x000000000000F0ECL});
    public static final BitSet FOLLOW_96 = new BitSet(new long[]{0x0000000000000000L,0x0000000400000000L});
    public static final BitSet FOLLOW_97 = new BitSet(new long[]{0x0008020400000002L,0x0041041002010040L,0x000000000000F0ECL});
    public static final BitSet FOLLOW_98 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_99 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000100L});
    public static final BitSet FOLLOW_100 = new BitSet(new long[]{0x0110000000000200L,0x0000000000005402L});
    public static final BitSet FOLLOW_101 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_102 = new BitSet(new long[]{0x4000000000000000L,0x0000000000001000L});

}