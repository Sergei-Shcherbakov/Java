package seminar3.dz3.task3;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;

class Answer {
    public static void analyzeNumbers(Integer[] arr) {
        // Введите свое решение ниже
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(arr));
        int min = 99999999, max = 1, sum = 0, count = 0;
        Collections.sort(list);

        for (int i = 0; i < list.size(); i++) {
            count = i+1;
            sum += list.get(i);
            if (max < list.get(i)) max = list.get(i);
            if (min > list.get(i)) min = list.get(i);
        }
        for (int i = 0; i < list.size(); i++) {

        }
        double avg = (double) sum /count;
        System.out.println(list);
        System.out.println("Minimum is " + min);
        System.out.println("Maximum is " + max);
        System.out.println("Average is " + avg);


    }
}

// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
public class Printer3{
    public static void main(String[] args) {
        Integer[] arr = {};

        if (args.length == 0) {
            // При отправке кода на Выполнение, вы можете варьировать эти параметры
            arr = new Integer[]{4, 2, 7, 5, 1, 3, 8, 6, 9};
        }
        else{
            arr = Arrays.stream(args[0].split(", "))
                    .map(Integer::parseInt)
                    .toArray(Integer[]::new);
        }

        Answer ans = new Answer();
        ans.analyzeNumbers(arr);
    }
}
