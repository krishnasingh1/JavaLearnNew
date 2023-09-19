package SomePrecticeProblum.StaticVariable.Questions;

public class FindMAxAndMinValues {

    public static void main(String [] args){
        int[] a = {4, 3, 5, 2, 1, 6};

        int max = a[0];
        int min = a[0];

        for (int i = 1; i < a.length; i++){

            if (a[i] > max){
                max  = a[i];
            }

            if (a[i] < min){
                min = a[i];
            }
        }

        System.out.println("The maximum element is "+max);
        System.out.println("The minimum element is "+min);
    }


}
