package JavaArray.MultidimensionalArrayConcept;

public class MultidimensionalExample2 {

    public static void main(String[] args) {

        // InDirect Method
        int[][] arr = new int[10][20];

        arr[0][0] = 1;

        System.out.println(arr[0][0]);

        // Direct methode of Declarations
        int [][] arr1 = {{1, 2 }, {3, 4}};

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++){
                System.out.print(arr1[i][j] + " ");
            }
            System.out.println();
        }

        // Direct Method
        for (int i = 0; i < 2; i++)
            for (int j = 0; j < 2; j++)
                System.out.println("arr1[" + i + "][" + j + "] = "
                        + arr1[i][j]);


    }
}

