/* Simple Assignment
-  "=" Sign: Assigns the value from the right to the variable on the left. 

Arithmetic
-  These operators work with any combination of numeric primitives (byte, short, char, int, long, float, double).
-  The resulting type of the expression is the type which doesn't lose information (so an int plus a short will produce
an int, not a short).
   1. "+": Addition.
   2. "-": Subtraction.
   3. "*": Multiplication.
   4. "/": Division.
   5. "%": Remainder. 

Unary Arithmetic Operators
-  These operators are either prefix operators (i.e. they come before the thing they operate on - the operand) or postfix
(come after the thing they operate on), and only take a single operand. 
   1. "+": Positive Operator: Declares the number as positive: e.g. "int a = +1".
   2. "-": Negative Operator: Makes a positive value negative, and a negative value positive. 
   3. "++": Prefix Increment: Adds one to the variable's value and returns the value after this addition.
   4. "++": Postfix Increment: Adds one to the variable's values and returns the value from before the addition. 
   5. "--": Prefix Increment: Substracts one from the variable's value and returns the value after this subtraction.
   6. "--": Postfix Increment: Subtracts one from the variable's values and returns the value from before the subtraction.  

Equality Operators
-  "==": Equal To: For primitives, it returns true if the values are the same and false if they're not. For object 
variables, it returns true if the two variables are the same object, and false otherwise. Note that this means that
two object variables that happen to store the same values are not equal under this scheme. 
-  "!-": Not Equal To: As above, but returns true if they're different and false if they're the same. Has the same caveat
about comparing object variables. 

Relational Operators
-  These operators only work with primitive numeric operands:
   - "<": Less than.
   - ">": Greater than.
   - "<=": Less than or equal to.
   - ">=": Greater than or equal to. 

Logical Operators
-  They implement logical operations and require both operands to have type boolean.
   -  "&": And: Always evaluates both operands. 
   -  "|": Or: Always evaluates both operands.
   -  "&&": Short-Circuit And: Only evaluates the second operand if the first evaluates to true, stops if the first evaluates to false. 
   -  "||": Short-Circuit Or: Only evaluates the second operand if the first evaluates to false.
   -  "!": Not: Unary prefix operator. Inverts a boolean value (flips true and false).

Ternary Operator
-  ?: Short hand for a simple if-else, the syntax is A ? B : C. Where "A" is an expression that evaluates to a boolean value, "B" is the code that's run if "A"
evaluates to true, "C" is run if it evaluates to false. Normally B and C would return values, in which case they have to match the expected return type of whatever
you're doing with it. 

Instanceof Operator
-  "instanceof" returns true if the thing on the left has a type that matches the class name given on the right: i.e. "s instanceof String".

Bitwise Operators
-  These operators all treat numeric values as bit strings (i.e. 0s and 1s).
   -  "~": Unary bitwise complement: Flips all 0s to 1s and 1s to 0s. Like "!"" but for things other than booleans. Also actually modifies the operand, 
   "!" just changes the returned value. 
   -  "&": Bitwise and.
   -  "|": Bitwise or.
   -  "^": Bitwise xor. 
   -  "<<": Signed left shift. Moves the bits of the left operand to the left. The number of steps to the left is given by the right operand. Doesn't touch the
   sign bit. 
   -  ">>": Signed right shift. Moves the bits of the left operand to the right. Doesn't touch the sign bit. 
   -  ">>>": Unsigned right shift. As ">>", but does shift the sign bit as well (treats all numbers as unsigned).

Combination Assignment Operators
-  These operators all have the form "A <op>= B", and effectively expand to the expression "A = A <op> B", where <op> is a suitable operator:
   "+=", "-=", "*=", "/=", "%=", "&=", "|=", "^=", "<<=", ">>=".

Array Access Operator
-  "[]", i.e. a[i]. Basically says: "give me the element that's i steps from the start of array a".

Grouping Operator
-  "()" just forces whatever's inside the parenthesis to be evaluated before the result is used elsewhere.

De-Reference Operator
-  ".": Dereferences the left operand to obtain the right operand. Essentially, "in the thing on the left, give me the thing with the name on the right".

Type Cast Operator
-  (<type>), where "<type>" is replaced by a value name for a type. An unary operator that attempts to change the type of the thing to the right into "type".
-  For example, "(int) 1.0" will try to turn the value 1.0 into an int. 

Namespace Operators
-  "a::b" gets the method "b" from the class "a". This operator is mainly used when you want to name functions as a parameter to a lambda expression. 

Braces ("{}")
-  Define a block in Java. 
-  A static initialiser for arrays, i.e. "<Type>[] <name> = {value1, value2, ...};"
-  They can be used to create an anonymous inner class "new Something<OtherThings>(){...};", where all the gaps are filled in appropriately. 
-  They can be used to initialise such classes (though this is sort of just using them as a static initialiser):
 "new Something<OtherThings>(){ { action1(); action2(); ...; } };". The first is routinely used, and can be used to pass a static array directly into a function
 (methodName(new <type> [] {value1, value2, ...})), the other two are less used. 

Precedence and Associativity
-  In Java, the precedence of the operators, from highest to lowest is (everything on the same level has the same precedence) given by the following list.
-  The associativity of each level is also given. 
   1. (), [], . (left to right)
   2. postfix ++, postfix -- (right to left)
   3. prefix ++, prefix --, !, ~, unary +, unary -, (<type>) (right to left)
   4. *, /, % (right to left)
   5. +, - (binary add and subtract) (left to right)
   6. >>, <<, >>> (left to right)
   7. <, <=, >, >= (left to right)
   8. ==, != (left to right)
   9. & (left to right)
   10. ^ (left to right)
   11. | (left to right)
   12. && (left to right)
   13. || (left to right)
   14. ?: (right to left)
   15. =, +=, -=, *=, /=, %=, >>=, <<=, &=, ^=, |= (right to left)
*/