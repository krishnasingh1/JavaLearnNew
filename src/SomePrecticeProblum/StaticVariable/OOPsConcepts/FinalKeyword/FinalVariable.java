package SomePrecticeProblum.StaticVariable.OOPsConcepts.FinalKeyword;

public class FinalVariable {

    public static void main(String[] args) {

        final int i = 10;
        //i = i + 20; // shows error because of final variable can not be change
        System.out.println(i);
    }
}
