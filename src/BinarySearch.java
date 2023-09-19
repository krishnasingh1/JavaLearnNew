public class BinarySearch {

    public static void main(String[] args) {

        BinarySearch bS = new BinarySearch();
        int arr1[] = {10, 20, 30, 40, 50, 60, 70, 80};
        bS.BinarySearch( arr1,10);

    }

    public void BinarySearch(int [] arr, int n){

        int start = 1;
        int end = n;

        while (start <= end){
            int mid = (start + end)/2;

            if (mid == n){
                System.out.println(mid + " == "+ n);
                break;
            } else if (n > mid) {
                start = mid + 1;
            }else {
                end = mid -1;
            }
        }

    }
}
