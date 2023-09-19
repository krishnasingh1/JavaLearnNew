package SomePrecticeProblum.StaticVariable.OOPsConcepts.Polimorphism;

public class TypeOfArgsMethodOverloading {

    void show(int a, String b){
        System.out.println("1");
    }
    void show(String a, int b){
        System.out.println("2");
    }

    public static void main(String[] args) {

        TypeOfArgsMethodOverloading t = new TypeOfArgsMethodOverloading();
        t.show(10, "Krishna");
        t.show("Krishna", 10);
    }
}
