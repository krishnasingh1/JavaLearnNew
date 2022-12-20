package JavaOperatorsandExpressions.InstanceOfOperator;

// class 1
// class Parent
class Parent {}

// class 2
// Child class
class Child extends Parent {

}

// class 3
// Main class
public class ParentChildInstanceOf {
    public static void main(String[] args) {

        // Creating object of Child class
        Child Cobj = new Child();


        // A simple case
        if (Cobj instanceof Child)
            System.out.println("Cobj is instance of Child ");
        else
            System.out.println("Cobj is not instance of Child");

        // instanceof returning true for Parent class also
        if (Cobj instanceof Parent)
            System.out.println("Cobj is instance of Parent");
        else
            System.out.println("Cobj is not instance of parent");

        // instanceOf return true for all ancestors

        // Note : Object is ancestor of a classes IN JAVA
        if (Cobj instanceof Object)
            System.out.println("Cobj is instance of object");
        else
            System.out.println("Cobj is not instance of object");

    }
}

/*
        Implementation: Here we will be creating sample classes with a parent-child relationship.
 */
