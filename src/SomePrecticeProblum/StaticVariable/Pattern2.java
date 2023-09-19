package SomePrecticeProblum.StaticVariable;

public class Pattern2 {
    public static void main(String[] args) {

        int num;
        for (int i = 5; i >= 1; i--){
            num = i;

            for (int j = 5; j >= 5; j--){
                System.out.print(num-- +" ");
            }
            System.out.println();
        }

    }
}
