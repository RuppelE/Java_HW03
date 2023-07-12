import java.util.List;

public class FirstTask {

    // Метод для удаления четных чисел из списка
    static void removeEvenNumbers(List<Integer> numbers) {
        numbers.removeIf(number -> number % 2 == 0);
    }

    // Метод для нахождения минимального значения в списке
    static int findMinValue(List<Integer> numbers) {
        int min = Integer.MAX_VALUE;
        for (int number : numbers) {
            if (number < min) {
                min = number;
            }
        }
        return min;
    }

    // Метод для нахождения максимального значения в списке
    static int findMaxValue(List<Integer> numbers) {
        int max = Integer.MIN_VALUE;
        for (int number : numbers) {
            if (number > max) {
                max = number;
            }
        }
        return max;
    }

    // Метод для нахождения среднего значения в списке
    static double findAverageValue(List<Integer> numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return (double) sum / numbers.size();
    }
}
