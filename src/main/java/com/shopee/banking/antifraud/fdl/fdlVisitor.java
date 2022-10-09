// Generated from /home/larryfu/projects/antlr-demo/src/main/resources/fdl.g4 by ANTLR 4.10.1
        //一种action,定义生成的词法语法解析文件的头，当使用java的时候，生成的类需要包名，可以在这里统一定义
 package com.shopee.banking.antifraud.fdl;
 
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link fdlParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface fdlVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link fdlParser#function_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_name(fdlParser.Function_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link fdlParser#function_param}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_param(fdlParser.Function_paramContext ctx);
	/**
	 * Visit a parse tree produced by {@link fdlParser#function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction(fdlParser.FunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link fdlParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue(fdlParser.ValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link fdlParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition(fdlParser.ConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link fdlParser#table}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable(fdlParser.TableContext ctx);
	/**
	 * Visit a parse tree produced by {@link fdlParser#base_obj}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBase_obj(fdlParser.Base_objContext ctx);
	/**
	 * Visit a parse tree produced by {@link fdlParser#time_range}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTime_range(fdlParser.Time_rangeContext ctx);
	/**
	 * Visit a parse tree produced by {@link fdlParser#fdl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFdl(fdlParser.FdlContext ctx);
}