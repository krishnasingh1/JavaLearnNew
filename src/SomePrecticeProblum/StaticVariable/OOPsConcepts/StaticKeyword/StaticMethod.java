package SomePrecticeProblum.StaticVariable.OOPsConcepts.StaticKeyword;

public class StaticMethod {

    void display(){
        System.out.println("1");
    }

    static  void show(){
        System.out.println("2");
    }

    public static void main(String[] args) {

        StaticMethod sm = new StaticMethod();
        sm.display();
        show(); // we to in the same class so we can call directly
        StaticMethod.show(); // otherwise we can call through className.methodName
        Xyz.show2();

    }
}

class Xyz {

    static void show2(){
        System.out.println("3");
    }
}
