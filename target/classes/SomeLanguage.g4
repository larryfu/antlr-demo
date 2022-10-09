grammar SomeLanguage; // 声明语法头
/*
*========================
*   一些 options 配置
*=======================
*/
options {
    language = Java; //设定生成代码的语言
}
@header {        //一种action,定义生成的词法语法解析文件的头，当使用java的时候，生成的类需要包名，可以在这里统一定义
 package com.shopee.antlr.some;
 }

/**
 =========================
   rule
 =========================
*/
classDeclaration : 'class' className '{' (method)* '}';
className : (ID|' ')+;
method : methodName '(' (parameter)* ')'(' ')*'{' (instruction)+'}' ;
parameter:instruction|' '|'['|']';
methodName : (ID|' ')+ ;
instruction : ID|'.'|'('|')'|';';
str:STR;
ID : [a-zA-Z0-9|_]+ ;
STR:'\'' ('\'\'' | ~('\''))* '\'';
WS: [ \t\n\r]+ -> skip ;