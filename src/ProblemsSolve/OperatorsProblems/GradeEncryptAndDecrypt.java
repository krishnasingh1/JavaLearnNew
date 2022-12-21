package ProblemsSolve.OperatorsProblems;

public class GradeEncryptAndDecrypt {

    public static void main(String[] args) {

        char grade =  'B';
        grade = (char)(grade + 8);
        System.out.println("Encrypted Grade is : "+grade);


        // Decrypting the grade
        grade = (char) (grade - 8);
        System.out.println("Decrypted Grade is : "+grade);
    }
}

/*
        Question : Write a java program to encrypt a grade by adding 8 to it. Decrypt it to show the correct grade.
 */
