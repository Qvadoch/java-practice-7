package utils;

import java.util.Arrays;
import java.util.Scanner;

public class MenuUtils {
    public static void showMenu(Scanner scanner, Integer[] array) {
        while (true) {
            System.out.print("""
                    ---Меню---
                    1 - Поиск числа по индексу
                    2 - Сортировка по возрастанию
                    3 - Сортировка по убыванию
                    4 - Выход
                    Выберите действие:\s""");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Введите индекс: ");
                    int index = scanner.nextInt();
                    if (index < 0 || index >= array.length) {
                        System.out.println("Индекс выходит за границы массива");
                    } else {
                        System.out.println("Найденное число: " + array[index]);
                    }
                    break;
                case 2:
                    ArrayUtils.sortAscending(array);
                    System.out.println("По возрастанию: " + Arrays.toString(array));
                    break;
                case 3:
                    ArrayUtils.sortDescending(array);
                    System.out.println("По убыванию: " + Arrays.toString(array));
                    break;
                case 4:
                    return;
                default:
                    System.out.println("Нет такой команды");
                    break;
            }
        }
    }
}