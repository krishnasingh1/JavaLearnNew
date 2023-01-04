package JavaOppsConcepts.Method;

public class VarArgs {

    static int sum(int a, int b){
        return a + b;
    }

    static int sum(int a, int b, int c){
        return a + b + c;
    }

    static int sum(int a, int b, int c, int d){
        return a + b + c + d;
    }

    // many times you have to create method thats why we have to one solution VarArgs
    static  int sum1(int ...arr){
        int result = 0;
        for (int a : arr) {
            result += a;
        }
        return result;
    }

    // there you want to at least one number to add must so this type idea use
    public static int bar(int x, int ...arr1){
        int result1 = x;
        for (int a : arr1) {
            result1 += a;
        }
        return result1;
    }

    static int add(int ...arr){
        int result = 0;
        for (int a : arr){
            result = result + a;
        }
        return result;
    }
    public static void main(String[] args) {

        System.out.println("Welcome to VarArgs Tutorial");
        System.out.println("The sum of 4 and 5 is: "+ sum(4 , 5));
        System.out.println("The sum of 4, 3 and 5 is: "+ sum(4 , 3, 4));
        System.out.println("The sum of2, 4, 3 and 5 is: "+ sum(2 , 4, 3 , 5));

        // VarArgs s.o.u.t
        System.out.println("The sum of 4 and 5 is: "+ sum1());
        System.out.println("The sum of 4 and 5 is: "+ sum1(1));
        System.out.println("The sum of 4 and 5 is: "+ sum1(4, 5));
        System.out.println("The sum of 4, 3 and 5 is: "+ sum1(4 , 3, 4));
        System.out.println("The sum of2, 4, 3 and 5 is: "+ sum1(2 , 4, 3 , 5));
        System.out.println("The sum of2, 4, 3 and 5 is: "+ sum1(1, 2 , 4, 3 , 5));

        // bar using at least one view
        //System.out.println("The sum of 4 and 5 is: "+ bar()); this not work because of there are at least one argument want
        System.out.println("The sum of 4 and 5 is: "+ bar(1));
        System.out.println("The sum of 4 and 5 is: "+ bar(4, 5));
        System.out.println("The sum of 4, 3 and 5 is: "+ bar(4 , 3, 4));
        System.out.println("The sum of2, 4, 3 and 5 is: "+ bar(2 , 4, 3 , 5));
        System.out.println("The sum of2, 4, 3 and 5 is: "+ bar(1, 2 , 4, 3 , 5));


        System.out.println(add(1,2));
        System.out.println(add(2,3,4));
        System.out.println(add(4,5,6));



    }
}
