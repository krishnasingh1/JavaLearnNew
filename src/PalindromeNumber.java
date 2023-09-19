public class PalindromeNumber {

    public static void main(String[] args) {
        int num = 1221;
        palindromeNum(num);
    }

    public static void palindromeNum(int num){

        int temp = num;
        int rev = 0, rem;

        while (temp != 0){

            rem = temp % 10;
            rev = (rev * 10) + rem;
            temp = temp / 10;
        }
        if (num == rev){
            System.out.println(num + " is palindrome");
        }else {
            System.out.println(num + " is Not palindrome");
        }

    }
}
