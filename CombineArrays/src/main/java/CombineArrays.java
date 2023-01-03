

public class CombineArrays {
    /**
     * Combine two arrays into a single array and return it.
     *
     * @param arr1 an array of ints.
     * @param arr2 an array of ints.
     * @return an array containing the contents of arr1 followed by the contents of arr2.
     */
    public int[] combine(int[] arr1, int[] arr2){
        int arraySizeCount = 0;
        for (int i = 0; i < arr1.length; i++) 
        {
            arraySizeCount++;
        }
        for (int i = 0; i < arr2.length; i++) 
        {
            arraySizeCount++;
        }

        int array[] = new int[arraySizeCount];
        int arrayEndCount = 0;
        
        for (int i = 0; i < arr1.length; i++) 
        {
            array[i] = arr1[i];
            arrayEndCount++;
        }

    
        for (int j = 0; j <arr2.length; j++)
        {
          
          array[arrayEndCount] = arr2[j];
          arrayEndCount++;
        }
        
        return array;
    }
}
