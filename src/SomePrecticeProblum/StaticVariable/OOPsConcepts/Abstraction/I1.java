package SomePrecticeProblum.StaticVariable.OOPsConcepts.Abstraction;

public interface I1 {

    public void show();
}

interface I2{

    void display();
}

class Test implements I1, I2{

    public void show(){
        System.out.println("1");
    }

    @Override
    public void display() {
        System.out.println("2");
    }

    public static  void main(String [] args){

        Test t = new Test();
        t.show();
        t.display();
    }
}
