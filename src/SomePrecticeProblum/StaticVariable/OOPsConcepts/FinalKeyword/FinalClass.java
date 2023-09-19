package SomePrecticeProblum.StaticVariable.OOPsConcepts.FinalKeyword;

final public class FinalClass {

    final void m1(){
        System.out.println("i'm in final method");
    }
}
class Test1 // extends FinalClass  cannot be extends the other class can not be inherit
{
    public static void main(String[] args) {
        FinalClass fc = new FinalClass();
        fc.m1();
    }
}
