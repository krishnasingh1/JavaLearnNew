package JavaOperatorsandExpressions.PrecedenceAndAssociativity;

public class PAndA {
    public static void main(String[] args) {

        int a = 20, b = 10, c = 0, d = 20, e = 40, f = 30;

        // precedence rules for arithmetic operators.
        // (* = / = %) > (+ = -)
        // prints a+(b/d)
        System.out.println("a+b/d : "+(a + b / d));

        // if same precedence then associative
        // rules are followed.
        // e/f -> b*d -> a+(b*d) -> a+(b*d)-(e/f)
        System.out.println("a+b*d-e/f = "+(a + b * d - e / f));
    }
}

/*
         Precedence and Associativity --> There is often confusion when it comes to hybrid equations which are equations
                                          having multiple operators. The problem is which part to solve first. There is a
                                          golden rule to follow in these situations. If the operators have different
                                          precedence, solve the higher precedence first. If they have the same precedence,
                                          solve according to associativity, that is, either from right to left or from left
                                          to right. The explanation of the below program is well written in comments within
                                          the program itself.


 */
