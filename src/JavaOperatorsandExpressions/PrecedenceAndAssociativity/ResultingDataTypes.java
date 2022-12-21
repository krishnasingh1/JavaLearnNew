package JavaOperatorsandExpressions.PrecedenceAndAssociativity;

public class ResultingDataTypes {

    public static void main(String[] args) {

//        byte x = 5;
//        int y = 6;
//        short z = 8;
//        int a = y + z;
//        float b = 6.54f + x;
//        System.out.println(b);

        // Increment and Decrement Operator
        int i = 56;
        // int b = i++; // first b is assigned i(56) than i is incremented
        int j = 67;
        int c = ++j; // first j is incremented the c is assigned j(68)

        System.out.println(i++);
        System.out.println(i);
        System.out.println(++i);
        System.out.println(i);

        int y = 7;
        int x = ++y * 8;
        System.out.println(x);

        // char in increment
        char a = 'B';
        a++;// now a is a 'C'
        System.out.println(a);
    }
}
