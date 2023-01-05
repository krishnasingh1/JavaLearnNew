package JavaArray.MultidimensionalArrayConcept;

public class Multidimensional3DArrayExample {

    public static void main(String[] args) {

        // InDirect Method of Declaration
        int [][][] arr3D = new int[10][20][30];
        arr3D[0][0][0] = 1;

        System.out.println("arr3D[0][0][0] : "+arr3D[0][0][0]);

        // Direct method of declaration
        int [][][] arr3D1 = { { {1, 2}, {3, 4} }, { {5, 6}, {7, 8} } };

        for (int i = 0; i < arr3D1.length; i++){
            for (int j = 0; j < arr3D1[i].length; j++) {
                for (int z = 0; z < arr3D1[j].length; z++){
                    System.out.println("arr3D1["+i+"]["+j+"]["+z+"] = "+ arr3D1[i][j][z]);
                }
            }
        }

        // Tabular format of 3D array
        int[][][] arr = { { { 1, 2 }, { 3, 4 } }, { { 5, 6 }, { 7, 8 } } };

        System.out.println("arr[0][0][0] = " + arr[0][0][0]);

        int[][][] arr3D2 = { { { 1, 2 }, { 3, 4 } },
                { { 5, 6 }, { 7, 8 } } };

        for (int i = 0; i < 2; i++) {

            for (int j = 0; j < 2; j++) {

                for (int k = 0; k < 2; k++) {

                    System.out.print(arr3D2[i][j][k] + " ");
                }

                System.out.println();
            }
            System.out.println();
        }
    }

}

/*
        Three – dimensional Array (3D-Array) --> Three – dimensional array is a complex form of a multidimensional array. A three – dimensional array can be
                                                 een as an array of two – dimensional array for easier understanding.

                            Indirect Method of Declaration:

                            Declaration – Syntax:
                            data_type[][][] array_name = new data_type[x][y][z];
                                    For example: int[][][] arr = new int[10][20][30];

                            Initialization – Syntax:
                            array_name[array_index][row_index][column_index] = value;
                                    For example: arr[0][0][0] = 1;

                            Direct Method of Declaration: Syntax:

                            data_type[][][] array_name = {
                                                          {
                                                           {valueA1R1C1, valueA1R1C2, ....},
                                                           {valueA1R2C1, valueA1R2C2, ....}
                                                          },
                                                          {
                                                           {valueA2R1C1, valueA2R1C2, ....},
                                                           {valueA2R2C1, valueA2R2C2, ....}
                                                          }
                                                         };

                            For example: int[][][] arr = { {{1, 2}, {3, 4}}, {{5, 6}, {7, 8}} };

                           * Representation of 3D array in Tabular Format:

                                A three – dimensional array can be seen as a tables of arrays with ‘x’ rows and ‘y’ columns where the row number ranges
                                from 0 to (x-1) and column number ranges from 0 to (y-1). A three – dimensional array with 3 array containing 3 rows and
                                3 columns is shown below:

                             * Print 3D array in tabular format:

                                To output all the elements of a Three-Dimensional array, use nested for loops. For this three for loops are required, One
                                 to traverse the arrays, second to traverse the rows and another to traverse columns.
 */

