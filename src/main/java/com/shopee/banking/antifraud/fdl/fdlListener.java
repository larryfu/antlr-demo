// Generated from /home/larryfu/projects/antlr-demo/src/main/resources/fdl.g4 by ANTLR 4.10.1
        //一种action,定义生成的词法语法解析文件的头，当使用java的时候，生成的类需要包名，可以在这里统一定义
 package com.shopee.banking.antifraud.fdl;
 
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link fdlParser}.
 */
public interface fdlListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link fdlParser#function_name}.
	 * @param ctx the parse tree
	 */
	void enterFunction_name(fdlParser.Function_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link fdlParser#function_name}.
	 * @param ctx the parse tree
	 */
	void exitFunction_name(fdlParser.Function_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link fdlParser#function_param}.
	 * @param ctx the parse tree
	 */
	void enterFunction_param(fdlParser.Function_paramContext ctx);
	/**
	 * Exit a parse tree produced by {@link fdlParser#function_param}.
	 * @param ctx the parse tree
	 */
	void exitFunction_param(fdlParser.Function_paramContext ctx);
	/**
	 * Enter a parse tree produced by {@link fdlParser#function}.
	 * @param ctx the parse tree
	 */
	void enterFunction(fdlParser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link fdlParser#function}.
	 * @param ctx the parse tree
	 */
	void exitFunction(fdlParser.FunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link fdlParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(fdlParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link fdlParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(fdlParser.ValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link fdlParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondition(fdlParser.ConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link fdlParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondition(fdlParser.ConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link fdlParser#table}.
	 * @param ctx the parse tree
	 */
	void enterTable(fdlParser.TableContext ctx);
	/**
	 * Exit a parse tree produced by {@link fdlParser#table}.
	 * @param ctx the parse tree
	 */
	void exitTable(fdlParser.TableContext ctx);
	/**
	 * Enter a parse tree produced by {@link fdlParser#base_obj}.
	 * @param ctx the parse tree
	 */
	void enterBase_obj(fdlParser.Base_objContext ctx);
	/**
	 * Exit a parse tree produced by {@link fdlParser#base_obj}.
	 * @param ctx the parse tree
	 */
	void exitBase_obj(fdlParser.Base_objContext ctx);
	/**
	 * Enter a parse tree produced by {@link fdlParser#time_range}.
	 * @param ctx the parse tree
	 */
	void enterTime_range(fdlParser.Time_rangeContext ctx);
	/**
	 * Exit a parse tree produced by {@link fdlParser#time_range}.
	 * @param ctx the parse tree
	 */
	void exitTime_range(fdlParser.Time_rangeContext ctx);
	/**
	 * Enter a parse tree produced by {@link fdlParser#fdl}.
	 * @param ctx the parse tree
	 */
	void enterFdl(fdlParser.FdlContext ctx);
	/**
	 * Exit a parse tree produced by {@link fdlParser#fdl}.
	 * @param ctx the parse tree
	 */
	void exitFdl(fdlParser.FdlContext ctx);
}