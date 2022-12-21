package JavaOperatorsandExpressions.InstanceOfOperator;

public class InstanceOfOperator {

    public static void main(String[] args) {

        Person obj1 = new Person();
        Person obj2 = new Boy();

        // As object is of type person, it is not an
        // instance of Boy or interface
        System.out.println("obj1 instanceof Person : "+(obj1 instanceof Person));
        System.out.println("obj1 instanceof Boy : "+(obj1 instanceof Boy));
        System.out.println("obj1 instanceof Myinterface : "+(obj1 instanceof Myinterface));

        // Since  obj2 is of type Boy
        // whose parent class is person
        // and it implements the interface Myinterface
        // it is instances of all of these classes
        System.out.println("obj2 instanceof Person : "+(obj2 instanceof Person));
        System.out.println("obj2 instanceof Boy : "+(obj2 instanceof Boy));
        System.out.println("obj2 instanceof Myinterface : "+(obj2 instanceof Myinterface));
    }
}

class Person {}

class Boy extends Person implements Myinterface {

}

interface Myinterface {

}
