package JavaArray;

public class ArrayElementAndForEachLoop {
    public static void main(String[] args) {

        // Float array
        float [] marks1 = {98.5f, 45.5f, 79.5f, 99.5f, 80.5f, 88.5f};
        System.out.println("Length of float array element : "+marks1.length);
        System.out.println(marks1[2]);

        //String Array
        String [] student = {"Krishna", "Rohan", "Shubham", "Lovish"};
        System.out.println("Length of String array element : " +student.length);
        System.out.println(student[2]);

        //declaring an array
        int [] marks = {98, 45, 79, 99, 80};
        System.out.println("Length of int array element : "+marks.length);

        // Displaying the Array (Native Way)
        System.out.println("Printing using Native way");
        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);
        System.out.println(marks[3]);
        System.out.println(marks[4]);

        // Displaying the Array (For Loop)
        System.out.println("Printing using for loop");
        for (int i = 0; i < marks.length; i++) {
            System.out.println(marks[i]);
        }

        // Quick Quiz : Displaying the Array Reverse order (For Loop)
        System.out.println("Printing using for loop in reverse order");
        for (int i = marks.length - 1; i >= 0; i--) {
            System.out.println(marks[i]);
        }

        // Quick Quiz : Displaying the Array (For-Each Loop)
        System.out.println("Printing using for-each loop");
        //traversing the array with for-each loop
        for (int element : marks) {
            System.out.println(element);
        }

    }
}

/*
        Java Tutorial: For Each Loop in Java
            * For each loop is an enhanced version of for loop.
            * It travels each element of the data structure one by one.
            * Note that you can not skip any element in for loop and it is also not possible to traverse elements in
              reverse order with the help of for each loop.
            * It increases the readability of the code.
            * If you just want to simply traverse an array from start to end then it is recommended to use for each loop.

            Syntax :
             for (int element:Arr) {
                 Sout(element);    //Prints all the elements
            }

 */
