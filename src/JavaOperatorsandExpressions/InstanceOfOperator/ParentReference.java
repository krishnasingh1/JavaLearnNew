package JavaOperatorsandExpressions.InstanceOfOperator;

class Parent2 {  }
class Child2 extends Parent2 { }
public class ParentReference {

    public static void main(String[] args) {

        // Reference is Parent type but object is
        // of child type.
        Parent2 obj = new Child2();
        if (obj instanceof Child2)
            System.out.println("cobj is instance of Child");
        else
            System.out.println("cobj is NOT instance of Child");

    }
}
