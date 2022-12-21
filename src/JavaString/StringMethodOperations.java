package JavaString;

public class StringMethodOperations {

    public static void main(String[] args) {

        String name = "Harry";

        // name.length(); --> Print the length value of the string
        int value = name.length();
        System.out.println(value);

        // name.toLowerCase(); --> Return new String which has all the lowercase character from the string name
        String lString = name.toLowerCase();
        System.out.println(lString);

        // name.toUpperCase(); --> Return new String which has all the Uppercase character from the string name
        String uString = name.toUpperCase();
        System.out.println(uString);

        //non TrimmedString
        String nonTrimmedString = "     Krishna     ";
        System.out.println(nonTrimmedString);

        // name(like).trim() --> Returns a new String after removing all the leading and trailing spaces from the original string.
        String trimmedString = nonTrimmedString.trim();
        System.out.println(trimmedString);

        // name.subString(int start) --> Returns a substring from start to the end. Substring(3) returns “ry”. [Note that indexing starts from 0]
        System.out.println(name.substring(3));//"ry"
        System.out.println(name.substring(2));// "rry"
        System.out.println(name.substring(0));
        // redundant  is like zero likhane se koi fark nahi padne wala because string zero se start hoti hai to pori string print hogi so string ka naam bhi likhoge to pori string print hogi

        // name.subString(int start, int end) --> 	Returns a substring from the start index to the end index. The start index is included, and the end is excluded.
        System.out.println(name.substring(1,4));
        System.out.println(name.substring(1,5));// if 5th index dont have but it is work because start index included and end index excluded so thats why

        // name.replace('r', 'p'); --> Returns a new string after replacing r with p. Happy is returned in this case. (This method takes char as argument)
        System.out.println(name.replace('r', 'p'));
        System.out.println(name.replace("rry", "ire"));
        System.out.println(name.replace("r", "ire"));

        // name.startsWith("Ha"); --> 	Returns true if the name starts with the string “Ha”. (True in this case)
        System.out.println(name.startsWith("Ha"));
        System.out.println(name.startsWith("Har"));
        System.out.println(name.startsWith("Par"));
        System.out.println(name.startsWith("ha")); // case sansitive hai Capital H se start hai to hi true hogi nahi to false

        // name.endsWith("rry"); --> 	Returns true if the name ends with the string “ry”. (True in this case)
        System.out.println(name.endsWith("ry"));
        System.out.println(name.endsWith("rry"));
        System.out.println(name.endsWith("Har"));
        System.out.println(name.endsWith("dd"));
        System.out.println(name.endsWith("y"));

        // name.charAt(2); --> Returns the character at a given index position. (r in this case)
        System.out.println(name.charAt(0));
        System.out.println(name.charAt(1));
        System.out.println(name.charAt(2));
        System.out.println(name.charAt(3));
        System.out.println(name.charAt(4));

        // name.indexOf(String) --> Returns the index of the first occurrence of the specified character in the given string.
        System.out.println(name.indexOf("ry"));// 3
        System.out.println(name.indexOf("r"));// 2
        System.out.println(name.indexOf("ey")); // wrong string search index the value always (-1)
        System.out.println(name.indexOf("rry", 4)); // start search string index to the index value then print index value

        String modifiedName = "Harryrryrry";
        System.out.println(modifiedName.indexOf("rry")); // get the value of the string is first search ande get the same but considard first "rry"
        System.out.println(modifiedName.indexOf("rry", 4)); // get the value of the string is first search ande get the same but considard after 4 index value
        System.out.println(modifiedName.indexOf("yrry", 4)); // get the value of the string is first search ande get the same but considard after 4 index value

        // modifiedName.lastIndexOf("r");  --> Returns the last index of the specified character from the given string. (3 in this case)
        System.out.println(modifiedName.lastIndexOf("rry"));// lastIndexOf start find right to left or start with ends
        System.out.println(modifiedName.lastIndexOf("rry", 4));
        System.out.println(modifiedName.lastIndexOf("rry", 7));

        // name.equals("Harry"); --> Returns true if the given string is equal to “Harry” false otherwise [Case sensitive]
        System.out.println(name.equals("Harry")); // true
        System.out.println(name.equals("harry"));// false

        // name.equalsIgnoreCase("string");  --> Returns true if two strings are equal, ignoring the case of characters.
        System.out.println(name.equalsIgnoreCase("harry"));// true
        System.out.println(name.equalsIgnoreCase("haRrY"));// true
        System.out.println(name.equalsIgnoreCase("haRrYerregd"));// false

        // Escape Sequence Characters :  The sequence of characters after backslash ‘\’ = Escape Sequence Characters
        //Escape Sequence Characters consist of more than one character but represent one character when used within the strings.
        //Examples: \n (newline), \t (tab), \’ (single quote), \\ (backslash), etc.

        System.out.println("I an escape sequence \" double quate ");
        //System.out.println("I an escape sequence " double quate "); // error
        System.out.println("I an escape sequence \\ backslash "); //
        System.out.println("I an escape sequence \t tab space"); //
        System.out.println("I an escape sequence \n new line"); //
        System.out.println("I an escape sequence \' single quote"); //






    }
}
