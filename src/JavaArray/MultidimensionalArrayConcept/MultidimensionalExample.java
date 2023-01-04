package JavaArray.MultidimensionalArrayConcept;

public class MultidimensionalExample {
    public static void main(String[] args) {

        // Declaring and initializing 2D Array
        int arr[][] = { {1,2,3}, {2,4,5}, {4,4,5}};
        // printing 2D array
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr.length; j++){
                System.out.print(arr[i][j]+ " ");
            }
            System.out.println();
        }

    }
}
