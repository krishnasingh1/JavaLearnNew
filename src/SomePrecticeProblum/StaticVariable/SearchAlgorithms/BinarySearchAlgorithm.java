package SomePrecticeProblum.StaticVariable.SearchAlgorithms;

public class BinarySearchAlgorithm {

    public static void main(String [] args){

        int[] arr = {2, 5, 7, 9, 12, 14, 16, 17, 19, 20, 24, 28};

        int item = 16;
        int li = 0;
        int hi = arr.length - 3;
        int mi = (li + hi)/2;

        while (li <= hi){

            if (arr[mi] == item){

                System.out.println("Item is at "+mi+" index position");
                break;
            } else if (arr[mi] < item) {
                li = mi + 1;
            }else {
                hi = mi - 1;
            }
            mi = (li + hi)/2;
        }
        if (li > hi){
            System.out.println("item not found ");
        }
    }
}
