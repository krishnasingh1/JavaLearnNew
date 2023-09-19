package SomePrecticeProblum.StaticVariable.OOPsConcepts.Abstraction;

public interface Interface {

        void a();
        void b();
        void c();
        void d();
    }


    abstract class B implements Interface{
        public abstract void makeSound();
        public void c(){System.out.println("I am C");}
    }


    class M extends B{
        public void makeSound(){System.out.println("I am Krishna");}
        public void a(){System.out.println("I am a");}
        public void b(){System.out.println("I am b");}
        public void d(){System.out.println("I am d");}
    }


    class Test5{
        public static void main(String args[]){
           Interface a=  new M(); // UpperCasting
            M b = (M)a; // DownCasting
            a.a();
            a.b();
            a.c();
            b.d();
            b.makeSound();
        }}

