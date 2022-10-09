grammar fdl;
options {
    language = Java; //设定生成代码的语言
}

@header {        //一种action,定义生成的词法语法解析文件的头，当使用java的时候，生成的类需要包名，可以在这里统一定义
 package com.shopee.banking.antifraud.fdl;
 }


fragment DIGIT:[0-9];   //匹配数字
fragment LETTER:[a-zA-Z];  //匹配字母

WS: [ \t\n\r]+ -> skip ;
SELECT: [Ss][Ee][Ll][Ee][Cc][Tt];
FROM: [Ff][Rr][Oo][Mm];
WHERE: 'where';
GROUPBY: 'group'[ ]+'by';
TIMEUNIT: 'sec'|'min'|'day';
INT: DIGIT+;
NUMBER: INT ('.' INT)?;
OPERATOR: '='|'>'|'<'|'>='|'<=';
STRING        //匹配带引号的文本
    : '\'' ( ~('\''|'\\') | ('\\' .) )* '\''
    ;
AND: [Aa][Nn][Dd];
IDENTIFIER    //匹配只含有数字字母和下划线的文本
    : LETTER(LETTER | DIGIT | '_')+;
function_name: IDENTIFIER;
function_param:IDENTIFIER;
function: function_name'('('*'|function_param)')';
value: STRING | NUMBER|INT;
condition: IDENTIFIER OPERATOR value;
table: IDENTIFIER;
base_obj:IDENTIFIER;
time_range:INT TIMEUNIT;

fdl: SELECT function FROM table WHERE condition (AND condition)* GROUPBY base_obj 'recent' time_range;
