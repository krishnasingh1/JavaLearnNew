package SomePrecticeProblum.StaticVariable.OOPsConcepts;

public class ObjectInitializeByUsingReferenceVariable {

    public static void main(String [] args){

        Animal1 buzo = new Animal1();

        buzo.color = "Black";
        buzo.age = 10;

        System.out.println(buzo.color + " " + buzo.age);
    }
}

class Animal1{

    String color;
    int age;

}
