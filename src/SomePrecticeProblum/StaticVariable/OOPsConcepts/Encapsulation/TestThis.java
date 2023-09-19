package SomePrecticeProblum.StaticVariable.OOPsConcepts.Encapsulation;

public class TestThis {

    int i; // instance variable
    void setValues(int i){
        this.i = i;
    }
    void show(){
        System.out.println(i);
    }
}
class Xyz {
    public static void main(String [] args){

        TestThis t = new TestThis();
        t.setValues(10);
        t.show();

    }
}
