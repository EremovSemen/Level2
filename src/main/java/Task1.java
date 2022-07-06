import java.nio.charset.StandardCharsets;
import java.util.*;

public class Task1 {


    public static void main(String[] args) {
        String[] words = """
         Универсальное средство для общения и поиска друзей и одноклассников,
        которым ежедневно пользуются десятки миллионов человек, десятки миллионов человек."""
                .toLowerCase().split("\\p{Blank}+");


        List<String> wordList = Arrays.asList(words);
        Set<String> uniqueWords = new HashSet<>(wordList);

        long start = System.currentTimeMillis();

        for (String word : uniqueWords) {
            int count = Collections.frequency(wordList, word);
        }
        System.out.println("n * n: " + (System.currentTimeMillis() - start));

        Map<String, Integer> map = new HashMap<>((int) (wordList.size() * 1.25));

        for (String s : wordList) {
            Integer count;
            if (!map.containsKey(s)) {
                count = 1;
            } else {
                count = map.get(s) + 1;
            }
            map.put (s,count);
        }
        map.forEach((k, v) -> System.out.println("Слово '" + k + "' встретилось " + v + " раз"));

    }

}

