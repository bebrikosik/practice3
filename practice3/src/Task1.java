import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task1 {
    public static void runTodoList() {
        List<String> tasks = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {                                           // цикл закончится если написать 5
            System.out.println("\n1 - добавить, 2 - удалить первую, 3 - удалить по номеру, 4 - показать все, 5 - выход");
            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    System.out.print("Введите задачу: ");
                    tasks.add(scanner.nextLine());                          // обавляем задачу
                    break;
                case "2":
                    if (tasks.isEmpty()) {
                        System.out.println("Список пуст");
                    } else {
                        tasks.remove(0);                    // обнуляем 1 элемент по индексу
                    }
                    break;
                case "3":
                    System.out.print("Введите номер задачи (с 1): ");
                    int index = Integer.parseInt(scanner.nextLine()) - 1;
                    if (index < 0 || index >= tasks.size()) {
                        System.out.println("Неверный номер");
                    } else {
                        tasks.remove(index);
                    }
                    break;
                case "4":

                    for (int i = 0; i < tasks.size(); i++) {            // вывод всех задач
                        System.out.println((i + 1) + ". " + tasks.get(i));
                    }
                    break;
                case "5":
                    return;
                default:
                    System.out.println("Неверная команда");                 //проверка на дурачка
            }
        }
    }
}
