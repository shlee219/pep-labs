public class GetMax {
    /**
     * This method should return the max value of arr (the largest int.)
     * This problem will require you to use a for loop. No other guidance will be provided.
     *
     * @param arr an array of ints to be manipulated.
     * @return the largest value in arr.
     */
    
    public int max(int[] arr){
        //Set "largest" as first value in array "arr"
        int largest = arr[0];
        for (int i = 0; i < arr.length; i++){ 
            //Skip the first iteration of looping through "arr", AND if current arr[i] is bigger than "largest"
            if (i != 0 && arr[i] > largest){
                largest = arr[i];
            }
        }
        return largest;
    }
}
