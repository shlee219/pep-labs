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
        
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            Integer val = map.get(c);
            if (val != null) {
                map.put(c, val + 1);
            } else {
                map.put(c, 1);
            }
        }
        System.out.println(map);
        for (Map.Entry<Character, Integer> value : map.entrySet()) {
            if (maxValue == null || value.getValue().compareTo(maxValue.getValue()) > 0) {
                maxValue = value;
            }
        }
        
        return maxValue.getKey();
    }
}
