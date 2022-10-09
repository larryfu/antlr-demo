package com.shopee.banking.antifraud.fdl;

import com.shopee.banking.antifraud.expr.LogicExprLexer;
import com.shopee.banking.antifraud.expr.LogicExprParser;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.misc.IntervalSet;

import java.io.IOException;

public class FdlDemo {

    public static void main(String[] args) throws IOException {
        String expr = "select count(*) from report where scene=1001.1 and action =11001 group by uid\n" +
                "  recent 600 sec";
        CharStream charStream = new ANTLRInputStream(expr);
        fdlLexer lexer1 = new fdlLexer(charStream);
        CommonTokenStream tokens = new CommonTokenStream(lexer1);  //转成token流

        //tokens.get(0).getType()

        fdlParser parser = new fdlParser(tokens);
        fdlParser.FdlContext tree = parser.fdl();
       // IntervalSet set = parser.getExpectedTokens();
        System.out.println(tree.function().function_name().IDENTIFIER().getText());
        System.out.println(tree.function().function_param());
        System.out.println(tree.condition().size());
        System.out.println(tree.time_range());
        System.out.println(tree.toStringTree(parser));
        //tree.exception

    }
}
