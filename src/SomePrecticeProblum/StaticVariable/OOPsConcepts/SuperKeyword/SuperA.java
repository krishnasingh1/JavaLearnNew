package SomePrecticeProblum.StaticVariable.OOPsConcepts.SuperKeyword;

public class SuperA {

    int a = 10;
}
class B extends SuperA{

    int a = 20;
    void show(int a){
        System.out.println(a);// 30
        System.out.println(this.a);// 20
        System.out.println(super.a);// 10
    }

    public static void main(String[] args) {
        B obj = new B();
        obj.show(30);
    }
}
