package JavaArray.MultidimensionalArrayConcept;

public class MultidimensionalExample1 {
    public static void main(String[] args) {

        // Declaring and initializing 2D Array
        int arr[][] = {{2, 7, 9}, {3, 6, 1}, {7, 4, 2}};

        // printing 2D array
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
