import java.util.ArrayList;
import java.util.List;

public class Task4 {
    public static void analyzeNumbers() {
        List<Integer> numbers = new ArrayList<>(List.of(3,1,6,1,9,3,2,6,3,9));
        System.out.println("Исходный список: " + numbers);

        List<Integer> uniqueNumbers = new ArrayList<>();                // собираем уникальные числа вместе
        for (int num : numbers) {
            if (!uniqueNumbers.contains(num)) {
                uniqueNumbers.add(num);
            }
        }
        System.out.println("Уникальные: " + uniqueNumbers);

        for (int unique : uniqueNumbers) {              //подсчет уникальных чисел
            int count = 0;
            for (int num : numbers) {
                if (num == unique) count++;         // нашел уникальное число? прибавляю 1
            }
            System.out.println(unique + " - " + count + " раза");
        }
        int min = numbers.get(0);  // обнуляем переменные
        int max = numbers.get(0);
        int sum = 0;

        for (int num : numbers) {
            if (num < min) min = num;           //summa max min
            if (num > max) max = num;
            sum += num;
        }

        double average = (double) sum / numbers.size();
        System.out.println("Мин: " + min + ", Макс: " + max);
        System.out.println("Сумма: " + sum + ", Среднее: " + average);
    }
}
