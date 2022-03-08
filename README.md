# java-language-fundamentals
## Modern Java: The Big Picture
### Introducing the Java Platform
Java Platform has 3 parts:
1. Java Programming Language
2. Java SE APIs (JDK), We have Oracle and Open Source JDK
3. Java Virtual Machine (JDK)
## Getting Started with Programming in Java
### Creating your first Java app
Packages help with the following:
1. Type Name uniqueness
2. Source code organization

The bytecode is stored in the out folder, executed using full type name
### Variables, Data Types and Math Operators
Primitive Data Types:
1. Built into the language
2. Foundation of all Types
3. Four categories:
	1. Integer Types -
		1. byte
		2. short
		3. int
		4. long (add L to end)
	2. Floating Point Types -
		1. float (f at the end)
		2. double (d at the end)
	3. Character Type
		Char and store a single character or unicode code points (\u followed by 4 hex digits)
	4. Bool
		Stores true or false

Primitive data types are stored by value

Three Kinds of operators:
1. Postfix/Prefix
2. Basic
3. Compound Assignment

Order of Precedence:
1. Postfix
2. Prefix
3. Multiplicative
4. Additive
In case of tie, left to right
Use Parenthesis to override

Type Converions are of two types:
1. Implicit - widening conversions don automatically by the compiler
2. Explicit - written in code by user, both widening and narrowing, can have side effects for narrowing
### Conditional Logic and Block Statements
For non-linear path of execution:
1. Relational Operators
2. Conditional Assignment
3. If-else
3. Logic Operators
4. Block statements
5. Switch