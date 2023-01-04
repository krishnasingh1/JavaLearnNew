package JavaArray;

public class ClassNameOfAnArray {
    public static void main(String[] args) {

        // declaration and initializing of array
        int arr[] = {4,4,7};

        // getting the class name of java array
        Class c = arr.getClass();
        String name = c.getName();

        // print the class name of java array
        System.out.println(name);
    }
}

/*
        What is the class name of Java array?
        In Java, an array is an object. For array object, a proxy class is created whose name can be obtained by
        getClass().getName() method on the object.
 */
