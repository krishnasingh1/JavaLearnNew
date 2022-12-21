package JavaOperatorsandExpressions.PrecedenceAndAssociativity;

public class UsingPlusOverPeranthisis {

    public static void main(String[] args) {
        int x = 5, y = 8;

        // concatenates x and y as
        // first x is added to "concatenation (x+y) = "
        // producing "concatenation (x+y) = 5"
        // and then 8 is further concatenated.
        System.out.println("Concatenation (x+y)= " + x + y);

        // addition of x and y
        System.out.println("Addition (x+y) = " + (x + y));
    }
}
