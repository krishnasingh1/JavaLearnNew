package SomePrecticeProblum.StaticVariable.OOPsConcepts.Abstraction;

abstract public class AbstractClassVehicle {

    int no_Of_Tyres;

    abstract void start();
}

class Car extends AbstractClassVehicle
{

    @Override
    void start() {
       System.out.println("Car start with key");
    }
}
class Scooter extends AbstractClassVehicle
{
    @Override
    void start() {
        System.out.println("Scooter start with kick");
    }

    public static void main(String[] args) {
        Car c = new Car();
        c.start();
        Scooter s = new Scooter();
        s.start();
    }
}
