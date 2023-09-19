package SomePrecticeProblum.StaticVariable.OOPsConcepts.Polimorphism;

public class SequenceOfArgsMethodOverloading {

    void show(int a, String b){
        System.out.println("1");
    }
    void show(String b, int a){
        System.out.println("2");
    }

    public static void main(String[] args) {

        SequenceOfArgsMethodOverloading t = new SequenceOfArgsMethodOverloading();
        t.show(10, "Krishna");
        t.show("Krishna", 10);
    }
}
