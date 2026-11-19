import java.util.*;

public class Task2 {
    public static List<List<String>> groupAnagrams(List<String> words) {
        Map<String, List<String>> map = new LinkedHashMap<>();
        for (String word : words) {
            char[] chars = word.toCharArray();                  //разбиваем слово на отдельные куски
            Arrays.sort(chars);
            String sortedWord = new String(chars);              //собираем обратно эти куски

            map.putIfAbsent(sortedWord, new ArrayList<>());     // пустой список под ключ если нету списка для него специального
            map.get(sortedWord).add(word);                      // добавляем слово в необходимую группу
        }
        return new ArrayList<>(map.values());                    //выводим все что есть в виде списка
    }
}
