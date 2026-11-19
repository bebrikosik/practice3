import java.util.*;

public class Task3 {
    public static List<String> getTopWords(String text, int n) {
        String[] words = text.split("\\s+");            // делим текст на части
        Map<String, Integer> wordCount = new HashMap<>();


        for (String word : words) {
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1); //подсчет слоф
        }
        List<String> sortedWords = new ArrayList<>(wordCount.keySet()); //сортируем уникальные слова и откладываем их
        return sortedWords.subList(0, Math.min(n, sortedWords.size())); // возвращаем отсорт.слова и доп защита чтобы не было выводов меньше чем число N
    }
}