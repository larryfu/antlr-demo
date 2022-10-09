// Generated from /Users/guangzengfu/workspace/antlr-demo/src/main/resources/LogicExpr.g4 by ANTLR 4.10.1
        //一种action,定义生成的词法语法解析文件的头，当使用java的时候，生成的类需要包名，可以在这里统一定义
 package com.shopee.banking.antifraud.expr;
 
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link LogicExprParser}.
 */
public interface LogicExprListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link LogicExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(LogicExprParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogicExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(LogicExprParser.ExprContext ctx);
}