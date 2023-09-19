package SomePrecticeProblum.StaticVariable.OOPsConcepts;

public class ObjectInitializeByUsingMethod {

    public static void main(String [] args){

        Animal2 buzo = new Animal2();
        buzo.initObject("black", 10);
        buzo.display();
    }
}

class Animal2 {

    String color;
    int age;

    void initObject(String c, int a){

        color = c;
        age = a;
    }

    void display(){

        System.out.println(color +" "+ age);
    }
}
