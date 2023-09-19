package Leetcode;

public class PerfectSquirRoot {

    public static void main(String[] args) {

        int num = 36;
        perSqrt(num);
    }

    public static void perSqrt(int num){

        int start = 0;
        int end = num / 2;

        while (start <= end){

            int mid = (start + end) / 2;

            if (mid * mid == num){
                System.out.println(" The Squire Root is " + num);
                break;
            } else if (mid * mid > num) {
                mid = mid - 1;
            }else {
                mid = mid + 1;
            }

        }

    }
}
