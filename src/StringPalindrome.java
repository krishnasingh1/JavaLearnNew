import java.util.Scanner;

public class StringPalindrome {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the num");
        //int num = sc.nextInt();
        // palindrome(num);
        palindrome("ABA");

    }

    public static void palindrome(String str1){

        int sl = str1.length();

        String str2 = "";

        for(int i = sl - 1; i >= 0; i--){

            str2 = str2 + str1.charAt(i);
        }



        if(str1.equals(str2)){
            System.out.println("the num is palindrome "+str1);
        }else{
            System.out.println("the num is non palindrome "+ str1 );
        }
    }
}
