package ProblemsSolve.StringClass_SringDataType;

public class StringLetterReplaceToName {
    public static void main(String[] args) {

        String letter = "Dear <|name|> , Thanks a lot!";
        System.out.println(letter);
        letter = letter.replace("<|name|>", "Krishna Pal");
        System.out.println(letter);

        String letter1 = "Dear <|name|>, Thanks a lot!";
        letter1 = letter1.replace("<|name|>", "Sachin");
        System.out.println(letter1);
    }
}

/*
    Question --> Write a Java program to fill in a letter template which looks like below:
                    // letter = “Dear <|name|>, Thanks a lot”

                    // Replace <|name|> with a string (some name)
 */
