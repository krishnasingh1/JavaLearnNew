package SomePrecticeProblum.StaticVariable.OOPsConcepts;

public class Animal {

    public void eat(){

        System.out.println("I am eating.");
    }

    public static void main(String [] args){

        System.out.println("1. ");
        Animal buzo = new Animal();

        buzo.eat();
        buzo.run();

        Birds sp = new Birds();
        sp.fly();
    }

    public void run(){

        System.out.println("I am running.");
    }
}

class Birds{

    public  void fly(){
        System.out.println("I am flying.");
    }

}
