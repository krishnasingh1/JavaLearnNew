package JavaArray;

public class ClassObjectsForArray {
    public static void main(String[] args) {

        int [] intArray = new int[3];
        byte [] byteArray = new byte[3];
        short [] shortArray = new short[3];

        // array of String
        String [] strArray = new String[3];

        System.out.println(intArray.getClass());
        System.out.println(
                intArray.getClass().getSuperclass());
        System.out.println(byteArray.getClass());
        System.out.println(shortArray.getClass());
        System.out.println(strArray.getClass());

    }
}

/*
        Class Objects for Arrays --> Every array has an associated Class object, shared with all other arrays with the same component type.

        Explanation:

               * The string “[I” is the run-time type signature for the class object “array with component type int.”
               * The only direct super class of an array type is java.lang.Object.
               * The string “[B” is the run-time type signature for the class object “array with component type byte.”
               * The string “[S” is the run-time type signature for the class object “array with component type short.”
               * The string “[L” is the run-time type signature for the class object “array with component type of a Class.” The Class name is then followed.

               Array Members
                Now, as you know that arrays are objects of a class, and a direct superclass of arrays is a class Object. The members of an array type are all of the following:

                * The public final field length, which contains the number of components of the array. Length may be positive or zero.
                * All the members inherited from class Object; the only method of Object that is not inherited is its clone method.
                * The public method clone(), which overrides the clone method in class Object and throws no checked exceptions.

                * Arrays Types and Their Allowed Element Types
                 Array Types	                -->      Allowed Element Types
                Primitive Type Arrays	        -->      Any type which can be implicitly promoted to declared type.
                Object Type Arrays	Either      -->      declared type objects or it’s child class objects.
                Abstract Class Type Arrays	    -->      Its child-class objects are allowed.
                Interface Type Arrays	        -->      Its implementation class objects are allowed.
 */
