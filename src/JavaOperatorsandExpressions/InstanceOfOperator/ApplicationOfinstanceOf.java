package JavaOperatorsandExpressions.InstanceOfOperator;


class Parent3 {
    int value = 1000;
}

class Child3 extends Parent3 {
    int value = 10;

}
public class ApplicationOfinstanceOf {

    public static void main(String[] args) {

        Parent3 cobj = new Child3();
        Parent3 par = cobj;

        // Using instanceof to make sure that par
        // is a valid reference before typecasting
        if (par instanceof Child3)
        {
            System.out.println("Value accessed through " +
                    "parent reference with typecasting is " +
                    ((Child3)par).value);
        }



    }
}

/*
        Now, the application of instanceof keyword is as follows:
            We have seen here that a parent class data member is accessed when a reference of parent type
            refers to a child object. We can access child data members using typecasting.

            Syntax:  ((child_class_name) Parent_Reference_variable).func.name()

            When we do typecast, it is always a good idea to check if the typecasting is valid or not.
            instanceof helps us here. We can always first check for validity using instancef, then do typecasting.
 */
