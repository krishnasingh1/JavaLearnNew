package SomePrecticeProblum.StaticVariable.OOPsConcepts.StaticKeyword;

public class StaticVariable {

    static int a = 10; // static variable is create a class level

    void m1(){

       // static int b = 20;  // erroe because of we can not be create a local variable is static
    }
}

class Demo {

    public static void main(String[] args) {

        //System.out.println(a);  we can not direct access variable with out object
        System.out.println(StaticVariable.a); // but we can create a static variable so we cen access direct a variable class name and variable
    }
}
