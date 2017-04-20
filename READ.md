sql parser

结构：

Parser
>将输入文本转换为ast（抽象语法树），parser有包括两个部分，Parser和Lexer，其中Lexer实现词法分析，Parser实现语法分析

AST
>AST是Abstract Syntax Tree的缩写，也就是抽象语法树。AST是parser输出的结果

Visitor
>Visitor是遍历AST的手段，是处理AST最方便的模式，Visitor是一个接口，有缺省什么都没做的实现VistorAdapter
