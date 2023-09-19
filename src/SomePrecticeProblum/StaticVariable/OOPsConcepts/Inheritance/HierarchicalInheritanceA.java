package SomePrecticeProblum.StaticVariable.OOPsConcepts.Inheritance;

public class HierarchicalInheritanceA {
    void showA(){
        System.out.println("a class method");
    }
}
class B2 extends HierarchicalInheritanceA{
    void showB(){
        System.out.println("b class method");
    }
}
class C2 extends HierarchicalInheritanceA{
    void showC(){
        System.out.println("c class method");
    }

    public static void main(String [] args){

        HierarchicalInheritanceA ob1 = new HierarchicalInheritanceA();
        ob1.showA();
        //a.showB(); can not find showB() because of showB(); not a parent properties
        // ob.showC();
        System.out.println("----------------");
        B2 ob2 = new B2();
        ob2.showA();
        ob2.showB();
        //ob2.showC();
        System.out.println("----------------");
        C2 ob3 = new C2();
        ob3.showA();
        //ob3.showB();
        ob3.showC();
    }
}
