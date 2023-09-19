package Leetcode;

public class PerfectSqure {

    public static void main(String[] args) {

        PerfectSqure pS = new PerfectSqure();
        pS.perSqr(25);


    }

    public boolean perSqr(int num){

        int start = 1;
        int end = num/2;

        while (start <= end){

            int mid = start + (end - start)/2;

            if (mid * mid == num){
                System.out.println("Perfect square "+ mid);
                return true;
            } else if (mid * mid > num) {
                end = mid - 1;
            }else {
                start = mid + 1;
            }
        }
        return false;
    }
}
