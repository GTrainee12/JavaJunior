package Seminar1;

import java.util.Arrays;
import java.util.List;

public class stremAPI_App {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        double average = numbers.stream()
                .filter(n -> n % 2 == 0) // фильтруем только четные числа
                .mapToInt(Integer::intValue) // преобразуем в IntStream для вычисления среднего значения
                .average() // вычисляем среднее значение
                .orElse(0); // возвращаем 0, если список пустой или не содержит четных чисел

        System.out.println("Среднее значение четных чисел: " + average);
    }
}