package SomePrecticeProblum.StaticVariable.OOPsConcepts.Polimorphism;

public class NoOfArgsMethodOverloading {

    void show(){ // (int a, int b)
        System.out.println("1");
    }
    void show(int a){
        System.out.println("2");
    }

    public static void main(String[] args) {

        NoOfArgsMethodOverloading t = new NoOfArgsMethodOverloading();
        t.show();
        t.show(10);
        //t.show(10, 20);
    }
}
