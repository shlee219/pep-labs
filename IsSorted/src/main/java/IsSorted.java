import java.util.Arrays;

public class IsSorted {
    /**
     * Return true if arr is sorted, smallest to largest, false otherwise.
     * For example, {1,2,3,4} is storted but {1,2,4,3} is unsorted
     *
     * @param arr an int array
     * @return true if arr is sorted (all the numbers are in order). false if arr is not sorted.
     */
    
    public boolean checkSort(int[] arr){
        //Create array with same length as "arr"
        int[] arrOld = new int[arr.length];

        //Copy content of "arr" into "arrOld"
        for (int k = 0; k < arr.length; k++) {
            arrOld[k] = arr[k];
        }

        //Sort "arr"
        for (int i = 1; i < arr.length; i++) {

            for (int j = 0; j < arr.length; j++) {
                if (arr[j] >= arr[i]) {
                    int plchldr = arr[j];
                    int plchldr2 = arr[i];
                    arr[i] = plchldr;
                    arr[j] = plchldr2;
                }
            }
        }

        //Compare "arr" and "arrOld"
        if (Arrays.equals(arr, arrOld)) {
            System.out.println(Arrays.toString(arrOld));
            System.out.println(Arrays.toString(arr));
            return true;
        } else {
            System.out.println(Arrays.toString(arrOld));
            System.out.println(Arrays.toString(arr));
            return false;
        }
    }
}

