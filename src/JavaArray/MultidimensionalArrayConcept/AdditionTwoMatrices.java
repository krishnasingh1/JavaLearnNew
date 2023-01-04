package JavaArray.MultidimensionalArrayConcept;

public class AdditionTwoMatrices {

    public static void main(String[] args) {

        // Creating two matrices
        int a[][] = {{1,3,4}, {3,4,5}};
        int b[][] = {{1,3,4}, {4,4,5}};

        // Creating another matrix to store the sum of two matrices
        int c[][] = new int[2][3];

        // adding and printing addition of 2 matrices
        for (int i = 0; i < c.length; i++) {
            for (int j = 0; j <c[i].length; j++){
                c[i][j] = a[i][j] + b[i][j];
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }
    }
}
