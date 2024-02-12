import java.util.HashMap;
import java.util.Map;

public class NomerSatu {
    public Map<Character, Integer> countLetter(String input) {
        Map<Character, Integer> letterCount = new HashMap<>();

        for (char c : input.toCharArray()) {
            c = Character.toLowerCase(c);
            if (Character.isLetter(c)) {
                if (!letterCount.containsKey(c)) {
                    letterCount.put(c, 1);
                } else {
                    letterCount.put(c, letterCount.get(c) + 1);
                }
            }
        }

        return letterCount;
    }


}