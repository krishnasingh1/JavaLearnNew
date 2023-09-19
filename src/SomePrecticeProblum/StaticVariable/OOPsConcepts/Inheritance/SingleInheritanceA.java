package SomePrecticeProblum.StaticVariable.OOPsConcepts.Inheritance;

public class SingleInheritanceA {

     void showA(){
         System.out.println("a class method");
     }

}

class B extends SingleInheritanceA{

    void showB(){
        System.out.println("b class method");
    }

    public static void main(String [] args){

        SingleInheritanceA a = new SingleInheritanceA();
        a.showA();
        //a.showB(); can not find showB() because of showB(); not a parent properties

        B b = new B();
        b.showA();
        b.showB();
    }
}
