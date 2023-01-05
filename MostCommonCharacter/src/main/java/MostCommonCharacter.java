import java.util.HashMap;

public class MostCommonCharacter {
    /**
     * Find the most common character in str.
     * You could use a HashMap that maps a Character key to an Int value to represent how many times a Character has
     * been spotted.
     * @param str A String.
     * @return the most common character within str.
     */
    public char recurringChar(String str) {
        Character mcc = ' ';
        HashMap<Character, Integer> hm = new HashMap<>();
        for (int i =0; i<str.length(); i++)
        {
            char c = str.charAt(i);
            int total = hm.get(c);
            if (total != null)
            {
                hm.put(c, total + 1);
            }
            else{
                hm.put(c, 1);
            }
        }
        return ' ';
    }
}
