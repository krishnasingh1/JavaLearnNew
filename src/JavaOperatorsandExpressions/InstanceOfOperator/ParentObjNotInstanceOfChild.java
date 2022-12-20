package JavaOperatorsandExpressions.InstanceOfOperator;


class Parent1{}

class Child1 {}
public class ParentObjNotInstanceOfChild {

    public static void main(String[] args) {

        Parent pobj = new Parent();
        if (pobj instanceof Child)
            System.out.println("pobj is instance of Child");
        else
            System.out.println("pobj is NOT instance of Child");
    }

// Parent object is not an instance of Child
}
