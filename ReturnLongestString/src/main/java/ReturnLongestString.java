
public class ReturnLongestString {
    /**
     * Return the longest String out of arr.
     * Remember that you can get the length of String with str.length().
     *
     * @param arr an array of Strings.
     * @return the longest String within arr. You can assume that there are no ties for the longest string.
     */
    public String longest(String[] arr){
    
        int counterHold = 0;
        String longest = "";
        for (int i = 0; i < arr.length; i++)
            {
                int counter = 0;
                for (int j = 0; j < arr[i].length(); j++)
                {
                     
                     counter++;
                    if ( counter > counterHold){
                        counterHold = counter;
                        longest = arr[i];
                    }

                }

            }

        return longest;
    }
}
