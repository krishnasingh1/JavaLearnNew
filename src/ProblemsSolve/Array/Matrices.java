package ProblemsSolve.Array;

public class Matrices {

    public static void main(String[] args) {
        int [] [] mat1 = { {1, 2, 3},
                           {4, 5, 6}};
        int [] [] mat2 = { {2, 6, 13},
                           {3, 7, 1}};
        int [] [] result = { {0, 0, 0}, {0, 0, 0}};

        for (int i = 0; i < mat1.length; i++) { // this is for row
            for (int j = 0; j < mat1[i].length; j++){ // this is for column
                result[i][j] = mat1[i][j] + mat2[i][j];
                System.out.print(result[i][j] +" ");
            }
            System.out.println("");// Print the new line
        }

        // for using format print
        for (int i=0;i<mat1.length;i++){ // row number of times
            for (int j=0;j<mat1[i].length;j++) { // column number of time
                System.out.format(" Setting value for i=%d and j=%d\n", i, j);
                result[i][j] = mat1[i][j] + mat2[i][j];
                System.out.println(result[i][j]);
            }
        }

    }
}

/*
        Question --> Create a Java program to add two matrices of size 2x3.
 */