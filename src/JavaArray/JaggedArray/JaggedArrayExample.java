package JavaArray.JaggedArray;

public class JaggedArrayExample {
    public static void main(String[] args) {

        // Declaring 2-D Array with 2 rows
        int arr[][] = new int[2][];

        // Making the above array Jagged

        // First row has 3 columns
        arr[0] = new int[3];

        // Second row has 2 columns
        arr[1] = new int[2];

        // Initializing array
        int count = 0;
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[i].length; j++){
                arr[i][j] = count++;
            }
        }

        // Displaying the values of 2D Jagged array
        System.out.println("Contents of 2D Jagged Array");
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[i].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

    }
}

/*
        Jagged Array in Java --> A jagged array is an array of arrays such that member arrays can be of different sizes, i.e., we can create
                                a 2-D array but with a variable number of columns in each row. These types of arrays are also known as Jagged arrays.

               * Declaration and Initialization of Jagged array :

                Syntax: data_type array_name[][] = new data_type[n][];  //n: no. of rows
                             array_name[] = new data_type[n1] //n1= no. of columns in row-1
                             array_name[] = new data_type[n2] //n2= no. of columns in row-2
                             array_name[] = new data_type[n3] //n3= no. of columns in row-3
                                                   .
                                                   .
                                                   .
                             array_name[] = new data_type[nk]  //nk=no. of columns in row-n


                * Alternative, ways to Initialize a Jagged array :

                                    int arr_name[][] = new int[][]  {
                                                  new int[] {10, 20, 30 ,40},
                                                  new int[] {50, 60, 70, 80, 90, 100},
                                                  new int[] {110, 120}
                                                      };

                                              OR

                                    int[][] arr_name = {
                                          new int[] {10, 20, 30 ,40},
                                          new int[] {50, 60, 70, 80, 90, 100},
                                          new int[] {110, 120}
                                              };

                                              OR

                                    int[][] arr_name = {
                                           {10, 20, 30 ,40},
                                           {50, 60, 70, 80, 90, 100},
                                           {110, 120}
                                              };
 */
