
import java.util.HashMap;
import java.util.Map;
public class WordCountMap {
    /**
     * Receive a string of multiple words.
     * Return a Map object where the key is a word and the value is the count of occurrences of the word.
     *
     * You will need to instantiate a map, use the split(" ") on words, and iterate through the resulting array.
     * Inside of the resulting for loop, you should insert a new key to the map every time you encounter a word that
     * is not already a key in the map, and add to the word's count value every time you encounter a word that already
     * exists in the map.
     *
     * @param words A string of Words separated by spaces.
     * @return a Map (key/value pairs) of all the words mapped to their number of occurrences.
     */
    public Map<String, Integer> returnWordMap(String words){
        Map<String, Integer> map = new HashMap<String, Integer>();
        
        String[] splitted = words.split(" ");
        

        for (int i = 0; i < splitted.length; i++) {
            // s = s + splitted[i];
            String key = splitted[i];
            Integer count = map.get(key);
            // if the map contains no mapping for the key,
            // map the key with a value of 1
            if (count == null) {
                map.put(key, 1);
            }
            // else increment the found value by 1
            else {
                map.put(key, count + 1);
            }
        }
        // System.out.println(Arrays.toString(splitted));
        System.out.println(map);


        return map;
    }
}
