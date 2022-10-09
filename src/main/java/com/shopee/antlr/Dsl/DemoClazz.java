package com.shopee.antlr.Dsl;


import com.shopee.banking.antifraud.expr.LogicExprLexer;
import com.shopee.banking.antifraud.expr.LogicExprListener;
import com.shopee.banking.antifraud.expr.LogicExprParser;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.IntervalSet;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.io.IOException;

public class DemoClazz {

    public static void main1(String[] args) throws IOException {
        String sql = "Select 'abc' as a, `hahah` as c  From a as table;";
        //  ByteArrayInputStream inputStream = new ByteArrayInputStream(sql.getBytes());
        ANTLRInputStream input = new ANTLRInputStream(sql);  //将输入转成antlr的input流
        DslLexer lexer = new DslLexer(input);  //词法分析
        CommonTokenStream tokens = new CommonTokenStream(lexer);  //转成token流
        DslParser parser = new DslParser(tokens); // 语法分析
        DslParser.StaContext tree = parser.sta();  //获取某一个规则树，这里获取的是最外层的规则，也可以通过sql()获取sql规则树......
        System.out.println(tree.toStringTree(parser)); //打印规则数
        //    DslVisitor


    }

    public static void main(String[] args) throws IOException {
        String expr = "c1 && kt && ((a2 && f3) || j9) - ";
        CharStream charStream = new ANTLRInputStream(expr);
        LogicExprLexer lexer1 = new LogicExprLexer(charStream);
        CommonTokenStream tokens = new CommonTokenStream(lexer1);  //转成token流

        //tokens.get(0).getType()

        LogicExprParser parser = new LogicExprParser(tokens);
        LogicExprParser.ExprContext tree = parser.expr();
        IntervalSet set = parser.getExpectedTokens();
        System.out.println(tree.ID());
        System.out.println(tree.toStringTree(parser));
  //tree.exception

    }
}
