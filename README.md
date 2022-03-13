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
### Working with Strings
Strings are stored by reference so "==" operator might return false even though the value is same,
In that case use .equals(), but since it does character by character comparision it might be a little expensive
Consider using .intern() for specially long strings

Similary use StringBuilder when a lot of string modifications are required

### String Formatting
Fromat Conversions:
1. d Integral
2. x Hex
3. f Floating point
4. e Scientific Notation
5. s String

Format Flag:
1. %#x, 32 -> 0x20
2. %4d -> adds spaces to make up 4 characters, %04d -> adds 0s to make up for 4 characters
3. %,d -> adds culture specific commas, %,.2f -> will additionally add 2 decimal places
4. % d -> moves only positive numbers one char to the right
5. %+d -> always shows sign for decimal
6. %(d -> shows negative values withouth sign in parenthesis
7. %3$d -> displays the int with third index
8. %<d -> uses the same value as the previous specifier

### Date and Time
Instant
Local Date Time
Zoned Date Time
Date Time Formatter (.format() .parse())
Duration (Precise nanaoseconds)
Period (Human time)
	
Create a UTC clock and keep everything relative to it
## Handeling Exceptions in Java
Try with resources for autocloseable interfaces, when you don't want to handle more exceptions in finally
With multiple catches, it will go in fifo, so use specific expections first and less specific ones after that
All runtime exceptions are unchecked exceptions
