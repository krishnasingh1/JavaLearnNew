package JavaOperatorsandExpressions.InstanceOfOperator;

class Test {}
public class ObjectNull {
    public static void main(String[] args) {

        Test tobj = null;

        // A simple case
        if (tobj instanceof Test)
            System.out.println("tobj is instance of Test");
        else
            System.out.println("tobj is NOT instance of Test");
    }
}

// instanceof returning false for null

