package ProblemsSolve.StringClass_SringDataType;

public class ReplaceSpaceWithUnderscores {

    public static void main(String[] args) {

        String s1 = "  Krishna Pal Singh Rathore  ";
        System.out.println(s1);
        s1 = s1.replace(" ", "_");
        System.out.println(s1);

        String text = " To Lower Case ";
        System.out.println(text);
        text = text.replace(" ", "_");
        System.out.println(text);

        String text1 = "To My     Friend";
        text1 = text1.replace(" ", "_");
        System.out.println(text1);
    }
}

/*
    Question --> Write a Java program to replace spaces with underscores.
 */
