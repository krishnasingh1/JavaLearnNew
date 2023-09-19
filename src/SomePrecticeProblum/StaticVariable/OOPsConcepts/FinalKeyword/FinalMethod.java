package SomePrecticeProblum.StaticVariable.OOPsConcepts.FinalKeyword;

public class FinalMethod {
    final void m1(){
        System.out.println("i'm in class FinalMethod");
    }
}
class Test extends FinalMethod{

//    void m1(){
//        System.out.println("im in Class Test");
//    }  final method can not be override
    public static void main(String[] args){

        Test t = new Test();
        t.m1();
    }
}
