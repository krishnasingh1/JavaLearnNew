package SomePrecticeProblum.StaticVariable.OOPsConcepts.Inheritance;

public class MultilevelInheritanceA {
    void showA(){
        System.out.println("a class method");
    }

}
class B1 extends MultilevelInheritanceA{

    void showB(){
        System.out.println("b class method");
    }
}
class C extends B1{

    void showC(){
        System.out.println("c class method");
    }
    public static void main(String [] args){

        SingleInheritanceA ob1 = new SingleInheritanceA();
        ob1.showA();
        //a.showB(); can not find showB() because of showB(); not a parent properties
        // ob.showC();
        System.out.println("----------------");
        B1 ob2 = new B1();
        ob2.showA();
        ob2.showB();
        //ob2.showC();
        System.out.println("----------------");
        C ob3 = new C();
        ob3.showA();
        ob3.showB();
        ob3.showC();
    }

}
