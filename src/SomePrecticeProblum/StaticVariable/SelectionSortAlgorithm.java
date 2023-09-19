package SomePrecticeProblum.StaticVariable;

public class SelectionSortAlgorithm {

    public static void main(String [] args){
        int []a = {38, 52, 9, 18, 6, 62, 13};
        int temp = 0, min;

        for (int i = 0; i < a.length; i++ ){
            min = i;
            for (int j = i+1; j < a.length; j++) {

                if (a[j] < a[min]){
                    min = j;
                }
            }

            temp = a[i];
            a[i] = a[min];
            a[min] = temp;
        }

        for (int j : a) {
            System.out.print(j + " ");
        }

    }
}
