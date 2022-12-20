package JavaOperatorsandExpressions.InstanceOfOperator;

import JavaOperatorsandExpressions.ShiftOperator.ShiftExample;

public class InstanceOf {
    public static void main(String[] args) {

        // Creating a object of class inside main()
        ShiftExample onject = new ShiftExample();

        // Returning instanceOf
        System.out.println(onject instanceof ShiftExample);
    }
}

/*
        instanceof Keyword in Java --> instanceof is a keyword that is used for checking if a reference variable is containing a given
                                       type of object reference or not. Following is a Java program to show different behaviors of
                                       instanceof. Henceforth it is known as a comparison operator where the instance is getting compared
                                       to type returning boolean true or false as in java we do not have 0 and 1 boolean return types.


 */
