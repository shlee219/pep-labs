import java.util.HashMap;
import java.util.Map;

public class MostCommonCharacter {
    /**
     * Find the most common character in str.
     * You could use a HashMap that maps a Character key to an Int value to represent how many times a Character has
     * been spotted.
     * @param str A String.
     * @return the most common character within str.
     */
    public char recurringChar(String str) {
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        Map.Entry<Character, Integer> maxValue = null;
        
        //Loop through given string "str"
        for (int i = 0; i < str.length(); i++) 
        {
            // char "c" holds current character at index(i) of "str"
            char c = str.charAt(i);
            //int "val" will hold the current Key-Value pair associated with "c"
            Integer val = map.get(c);

            //If value of current character "c" is null, give it value of 1. 
                //Or easier said, if current character(key) in the string has not been counted before set the value of it to 1
                    //If it isn't null, increment the value by 1 (If it has been counted before, up the counter by 1)
            if (val != null) 
            {
                map.put(c, val + 1);
            } else 
            {
                map.put(c, 1);
            }
        }
        
        //Loop through the hashmap "map"
        for (Map.Entry<Character, Integer> value : map.entrySet()) 
        {
            //If maxValue is null (probably because the loop has just begun), set the value associated with current loop's key as maxValue
            //Or if current value of this iteration is bigger than what maxValue is, set that as maxValue.
            if (maxValue == null || value.getValue().compareTo(maxValue.getValue()) > 0) 
            {
                maxValue = value;
            }
        }
        //return only the key from the key-value pair that has the highest value.
        return maxValue.getKey();
    }
}
