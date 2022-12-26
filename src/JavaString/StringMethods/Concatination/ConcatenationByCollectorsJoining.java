package JavaString.StringMethods.Concatination;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ConcatenationByCollectorsJoining {
    public static void main(String[] args) {

        List<String> lisystr = Arrays.asList("abc","pqr","xyz"); // list of String Array
        String str = lisystr.stream().collect(Collectors.joining(",")); // performs joining operation
        System.out.println(str.toString()); // Display result
    }
}

/*
        String concatenation using Collectors.joining() method (Java (Java Version 8+)
                The Colletcors class in Java 8 offers joining() method that concatenates the input elements in a
                similar order as they occur.

                Here, a list of String array is declared. And a String object str stores the result of Collectors.joining() method.
 */
