package JavaArray.MultidimensionalArrayConcept;

public class MultiplicationTwoMatrices {
    public static void main(String[] args) {

        //creating two matrices
        int a[][]={{1,1,1},{2,2,2},{3,3,3}};
        int b[][]={{1,1,1},{2,2,2},{3,3,3}};

        //Creating another matrix to store the multiplication of two matrices
        int c[][] = new int[3][3];

        // multiplying and printing multiplication of 2 matrices\
        for (int i = 0; i < c.length; i++){
            for (int j = 0; j < c[i].length; j++){
                c[i][j] = 0;
                for (int k = 0; k < c.length; k++){
                    c[i][j]+=a[i][k] * b[k][j];// multiplication matrix
                }
                System.out.print(c[i][j]+" ");
            }
            System.out.println();
        }


    }
}
/*
        In the case of matrix multiplication, a one-row element of the first matrix is multiplied by all the columns of the
        second matrix which can be understood by the image given below.
 */
