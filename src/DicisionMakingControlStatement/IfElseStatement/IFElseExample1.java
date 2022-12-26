package DicisionMakingControlStatement.IfElseStatement;

public class IFElseExample1 {
    public static void main(String[] args) {

        int age = 6; // yes
        //int age = 26; // no
        //int age = 36; // no
        // int age = 18; // no
        // unt age = 29;

        if (age > 18) {
            System.out.println("Yes boy you can drive!");
        }else {
            System.out.println("No boy you cannot drive yet!");
        }

        // Relational Operator
        if(age != 18) {
            System.out.println("Yes boy you can drive!");
        }

        // diffrences between assign(=) and relational(==)
        if(age == 18) {
            System.out.println("Yes boy you can drive!");
        }

        //

        boolean cond = (age == 18);
        if (cond) {
            System.out.println("Yes boy you can drive!");
        }else {
            System.out.println("No boy you cannot drive yet!");
        }



    }
}
