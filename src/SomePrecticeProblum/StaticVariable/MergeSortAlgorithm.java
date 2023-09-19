package SomePrecticeProblum.StaticVariable;

public class MergeSortAlgorithm {

    int[] array;
    int[] tempMergeArr;
    int length;
    public static void main(String [] args){

        int[] inputArr = {48, 36, 13, 52, 19, 94, 21};
        MergeSortAlgorithm ms = new MergeSortAlgorithm();
        ms.sort(inputArr);

        for (int i : inputArr) {
            System.out.print(i + " ");
        }

    }

    public void sort(int inputArr[]){

        this.array = inputArr;
        this.length = inputArr.length;
        this.tempMergeArr = new int[length];
        divideArray(0, length - 1);

    }

    public void divideArray(int loverIndex, int higherIndex){

        if (loverIndex < higherIndex) {
            int middle = loverIndex+(higherIndex - loverIndex)/2;

            // it will sort the left side of an array
            divideArray(loverIndex, middle);

            // it will sort the right side of an array
            divideArray(middle + 1, higherIndex);

            mergeArray(loverIndex, middle, higherIndex);
        }

    }

    public void mergeArray(int loverIndex, int middle, int higherIndex) {

        for (int i = loverIndex; i <= higherIndex; i++){
            tempMergeArr[i] = array[i];
        }

        int i = loverIndex;
        int j = middle + 1;
        int k = loverIndex;

        while (i <= middle && j <= higherIndex){

            if (tempMergeArr[i] <= tempMergeArr[j]){

                array[k] = tempMergeArr[i];
                i++;
            }
            else {
                array[k] = tempMergeArr[j];
                j++;
            }
            k++;
        }

        while (i <= middle){

            array[k] = tempMergeArr[i];
            k++;
            i++;
        }


    }
}
