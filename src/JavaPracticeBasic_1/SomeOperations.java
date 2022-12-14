package JavaPracticeBasic_1;

public class SomeOperations {
    public static void main(String[] args) {

        int a, b, c, d;
        a = - 5+ 8 * 6;
        b = (55 + 9) % 9;
        c = 20 + -3 * 5 / 8;
        //  +1 and it always rounds down. int i = .99999999 sets int to 0. More specifically,
        //  it takes the integer portion and discards the rest
        d = 5 + 15 / 3 * 2 - 8 % 3;

        System.out.println("Operation a is : " +a);
        System.out.println("Operation a is : " +b);
        System.out.println("Operation a is : " +c);
        System.out.println("Operation a is : " +d);
    }
}

/* Write a Java program to print the result of the following operations. Go to the editor
   Test Data:
   a. -5 + 8 * 6
   b. (55+9) % 9
   c. 20 + -3*5 / 8
   d. 5 + 15 / 3 * 2 - 8 % 3
   Expected Output :
   43
   1
   19
   13
 */
