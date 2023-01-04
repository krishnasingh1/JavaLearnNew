package JavaArray;

public class CopyingAJavaArray {
    public static void main(String[] args) {
        // declaring a source array
        char [] copyFrom = {'d','e','c','a','f','f','e','i','n','a','t','e','d'};
        System.out.println(String.valueOf(copyFrom));
        // declaring a destination array
        char [] copyTo = new char[7];

        // copying array using System.arrayCopy() method
        System.arraycopy(copyFrom, 2, copyTo, 0, 7);

        // printing the destination array
        System.out.println(copyTo);
        System.out.println(String.valueOf(copyTo));
    }
}

/*
        Copying a Java Array --> We can copy an array to another by the arraycopy() method of System class.

                                Syntax of arraycopy method

                                public static void arraycopy(
                                Object src, int srcPos,Object dest, int destPos, int length
                                )
 */
