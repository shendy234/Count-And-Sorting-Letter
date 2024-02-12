import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class NomerDua {
    public String processInput(String[] inputArray) {
        Map<Character, Integer> letterCountMap = new HashMap<>();
        for (String word : inputArray) {
            word.chars().filter(Character::isLetter).mapToObj(letter -> (char) letter)
                    .forEach(letter -> letterCountMap.put(letter, letterCountMap.getOrDefault(letter, 0) + 1));
        }
        String result = letterCountMap.entrySet().stream()
                .sorted((entry1, entry2) -> {
                    int countComparison = entry2.getValue().compareTo(entry1.getValue());
                    if (countComparison != 0) {
                        return countComparison;
                    } else {
                        return Character.compare(entry1.getKey(), entry2.getKey());
                    }
                })
                .map(Map.Entry::getKey)
                .map(String::valueOf)
                .collect(Collectors.joining());

        return result;
    }

}
