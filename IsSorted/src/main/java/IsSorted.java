

public class IsSorted {
    /**
     * Return true if arr is sorted, smallest to largest, false otherwise.
     * For example, {1,2,3,4} is storted but {1,2,4,3} is unsorted
     *
     * @param arr an int array
     * @return true if arr is sorted (all the numbers are in order). false if arr is not sorted.
     */
    public boolean checkSort(int[] arr){
        int[] arrOld = arr;
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
            if( arrOld == arr){
                return true;
            }
            else{
                return false;
            }
            
        }
       
    }

