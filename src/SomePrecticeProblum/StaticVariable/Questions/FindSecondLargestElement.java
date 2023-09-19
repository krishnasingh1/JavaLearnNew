package SomePrecticeProblum.StaticVariable.Questions;

public class FindSecondLargestElement {

    public static void main(String [] args){

        int [] a = {6, 8, 2, 4, 1, 5, 7};

        int temp;

        for (int i = 0; i < a.length; i++){

            for (int j = i + 1; j < a.length; j++){

                if (a[i] < a[j]){

                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;

                }
            }
        }
        for (int i = 0; i < a.length; i++){
            System.out.print(a[i]+ " ");
        }
        System.out.println();
        System.out.println("Second Largest element is "+a[1]);
    }

    public static class StaticBlock {

        static {
            System.out.println("Hello");
            //System.exit(0);
        }

        static {

            System.out.println(" I am second static block");
        }

        public static void main(String[] args) {

            System.out.println("I am in main method..");
        }
    }
}
