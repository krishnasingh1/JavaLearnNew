package JavaPracticeLearnNew;

public class LearnComment {
    //function print a and c
    //comment the line that output b
    static void comment(int a, int b, int c){

        // print a
        System.out.println(a);
        //print b
        //System.out.println(b);
        // print c
        System.out.println(c);

    }
    public static void main(String[] args) {

        comment(5,10,15);

    }
}

/*
Comments are very useful in any language to tell user what is the task of any function or operation.
 The comments are neglected by the compiler, so whatever you write in the comments won't have any
 effect on the working of a code. In Java, comments can be written as mentioned below:
 You are given a complete function that outputs a, b, and c. Comment the code that outputs b, so only a and c gets printed.
 */
/*This is comment*/
//This is also Comment

/*
Input:
a = 5, b = 6, c = 15
Output:
5
15

 Input:
a = 5, b = 8, c = 15
Output:
5
15
*/

