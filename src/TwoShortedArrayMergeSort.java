public class TwoShortedArrayMergeSort {

    public static void main(String[] args) {

        int [] arr1 = {10, 20, 30, 40, 50};
        int [] arr2 = {5, 15, 25, 35, 45};

        int a1 = arr1.length;
        int b1 = arr2.length;

        int c1 = a1 + b1;

        int arr [] = new int[c1];

        TwoShortedArrayMergeSort Ts = new TwoShortedArrayMergeSort();
        Ts.merge(arr1, arr2, a1, b1, arr);
        for (int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }


    }

    public void merge(int []arr1, int []arr2, int a1, int b1, int arr[]){

        int i = 0, j = 0, k = 0;

        while (i < a1 && j < b1){

            if (arr1[i] <= arr2[j]){
                arr[k] = arr1[i];
                i++;
            }else {
                arr[k] = arr2[j];
                j++;
            }
            k++;

        }

        while (i < a1){
            arr[k] = arr1[i];
            i++;
            k++;
        }
        while (j < b1){
            arr[k] = arr2[j];
            j++;
            k++;
        }





    }
}
