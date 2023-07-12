//Задание
//Пусть дан произвольный список целых чисел.
//1) Нужно удалить из него чётные числа
//2) Найти минимальное значение
//3) Найти максимальное значение
//4) Найти среднее значение

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Произвольный список целых чисел
        List<Integer> numbers = new ArrayList<>();
        numbers.add(9);
        numbers.add(2);
        numbers.add(5);
        numbers.add(4);
        numbers.add(7);
        numbers.add(6);

        // Удаление четных чисел
        FirstTask.removeEvenNumbers(numbers);

        // Нахождение минимального значения
        int min = FirstTask.findMinValue(numbers);

        // Нахождение максимального значения
        int max = FirstTask.findMaxValue(numbers);

        // Нахождение среднего значения
        double average = FirstTask.findAverageValue(numbers);

        // Вывод результатов
        System.out.println("Список после удаления четных чисел: " + numbers);
        System.out.println("Минимальное значение: " + min);
        System.out.println("Максимальное значение: " + max);
        System.out.println("Среднее значение: " + average);
    }
}
