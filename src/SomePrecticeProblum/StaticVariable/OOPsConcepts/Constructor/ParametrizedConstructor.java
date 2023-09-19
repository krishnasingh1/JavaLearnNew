package SomePrecticeProblum.StaticVariable.OOPsConcepts.Constructor;

public class ParametrizedConstructor {
    int b;
    ParametrizedConstructor(int a){
        this.b = a;
        System.out.println("Parametrized Constructor");
    }
    public static void main(String [] args){

        ParametrizedConstructor pc = new ParametrizedConstructor(10);
    }
}
