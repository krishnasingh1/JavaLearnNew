package JavaOppsConcepts;

public class MethodOverrideExplain {

    static void tellsJoke() {
        System.out.println("I invented a new word!\n" +
                "Plagiarism!");
    }

    static void change(int a){
        a = 98;
    }

    static  void change2(int [] arr){
        arr[0] = 98;
    }

    static void foo(){
        System.out.println("Good Morning bro!");
    }

    static void foo(int a){
        System.out.println("Good Morning "+ a + " Bro!");
    }

    static void foo(int a, int b){
        System.out.println("Good Morning "+ a + " Bro!");
        System.out.println("Good Morning "+ b + " Bro!");
    }

    static int foo(int a, int b, int c){
        System.out.println("Good Morning "+ a + " Bro!");
        System.out.println("Good Morning "+ b + " Bro!");
        System.out.println("Good Morning "+ c + " Bro!");

        return 3;
    }



    public static void main(String[] args) {

        tellsJoke();

        // case : 1 Changing the Integer
        int x = 45;
        change(x);
        System.out.println("The value of x after running change is : "+x);

        // Case 2 : Changing the array
        int [] marks = {52, 73, 77, 89, 98, 94};

        change2(marks);
        System.out.println("The value of x after running change is : "+marks[0]);
        for (int mark : marks) {
            System.out.println(mark);
        }


        // Methode Overloading
        foo();
        foo(3000);
        foo(3000, 4000);
        foo(500, 600, 600);


    }
}
