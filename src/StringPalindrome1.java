import java.util.Scanner;

public class StringPalindrome1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the num");
        //int num = sc.nextInt();
        // palindrome(num);
        palindrome("AAABAAA");

    }

    public static void palindrome(String str1){

        int sl = str1.length();

        boolean temp = true;

        for(int i = 0,j = sl - 1; i < j; i++, j--){
            System.out.println(i);
            if (str1.charAt(i) != str1.charAt(j)){
                temp = false;
                break;
            }


        }

        if (temp){
            System.out.println("The String is palindrome");
        }else {
            System.out.println("The String is not palindrome");
        }



        /*if(str1.equals(str2)){
            System.out.println("the num is palindrome "+str1);
        }else{
            System.out.println("the num is non palindrome "+ str1 );
        }

         */
    }
}
