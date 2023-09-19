package SomePrecticeProblum.StaticVariable;

public class pattern {
    public static void main(String[] args) {
            int num;
        for (int i = 1; i <= 5; i++){
            //num = 1;
            num = i;
            for (int j = 1; j <= i; j++){
                System.out.print(num++ +" ");

            }
            System.out.println();
        }

    }
}
