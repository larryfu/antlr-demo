grammar LogicExpr;
options {
    language = Java; //设定生成代码的语言
}

@header {        //一种action,定义生成的词法语法解析文件的头，当使用java的时候，生成的类需要包名，可以在这里统一定义
 package com.shopee.banking.antifraud.expr;
 }

WS: [ \t\n\r]+ -> skip ;
ID: [a-zA-Z][a-zA-Z0-9|_]*;
OP: '&&'|'||';
expr:  ID (OP ID)* |'('expr')'| expr OP expr;

