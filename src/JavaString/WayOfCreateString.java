package JavaString;

public class WayOfCreateString {
    public static void main(String[] args) {

        String s = new String("The nane is the Krishna ");
        // creating java string by new keyword
        // this statement create two object i.e
        // first object is created in heap
        // memory area and second object is
        // create in String constant pool.

        System.out.println(s);

        //Create String by Java String Literal
        String s1 = "Java";
        // Create char Array
        char[] ch = {'S', 't', 'r', 'i', 'n', 'g', 's'};
        // Converting char Array to String;
        String s2 = new String(ch);
        // Creating String by java new Keyword
        String s3 = new String("Krishna");


        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

        // Converting char array to the String
        char[] ch1 = {'K','r','i','s','h','n','a',' ','P','a','l'};
        String chAS = new String(ch1);

        System.out.println(chAS);

        // String Diffrance between by literals and by new keyword
        //better understanding of String literal and String object :
        // Using literals
        String str1 = "Krishna Pal Singh";
        String str2 = "Krishna Pal Singh";

        System.out.println(str1 == str2);
        /* Returns true because str1 and str2 are referencing the same object present in the string constant
           pool. Now, let's see the case of the String object : */

        // Using new Keyword
        String str3 = new String("Krishna Pal Singh");
        String str4 = new String("Krishna Pal Singh");

        System.out.println(str3 == str4);
        /* Although the value of both the string object is the same, still false is displayed as output because
          str3 and str4 are two different string objects created in the heap. That's why it is not considered a
          good practice two compare two strings using the == operator. Always use the equals() method to compare
          two strings in Java. */

    }
}

/*
    Introduction to Strings :-->
                                   > A string is a sequence of characters.
                                   > Strings are objects that represent a char array. For example.

                                   char[] str = {'K','R','I','S','H','N','A'};
                                   String s = new String(str);

                                   is same is :
                                   String s = "Krishna";

                                   > Strings are immutable and cannot be changed.
                                   > java.lang.String class is used to create a String object.
                                   > The string is a class but can be used as a data type.

                                   String <String_name> = "<sequence_of_string>";

                                   String str = "Krishna Pal Singh";

                                   In the above example, str is a reference, and “Krishna Pal Singh” is an object.

                                   Different ways to create a string in Java :
                                    In Java, strings can be created in two ways :

                                    > By using string literal
                                    > By using the new

                              :--> Creating String using String literal :

                                    String s1= "String literal"

                                    We use double quotes("") to create string using string literal. Before creating a new string instance,
                                    JVM verifies if the same string is already present in the string pool or not. If it is already present,
                                    then JVM returns a reference to the pooled instance otherwise, a new string instance is created.

                                    notice that string "Krishna" is already present in the string pool, which is pointed by the str1.
                                    When we try to create the same string object using str2, JVM finds that string object with the
                                    value "Krishna" is already present in the string pool; therefore, instead of creating a new object,
                                    a reference to the same object is returned.

                               :--> Creating String using new :

                                    String s=new String("Krishna");

                                    When we create a string using "new", a new object is always created in the heap memory.

                                    you can see that although the value of both string objects is the same, i.e., "Harry"
                                    still two different objects are created, and they are referred by two different reference
                                    variables, i.e., str1 and str2.



 */
