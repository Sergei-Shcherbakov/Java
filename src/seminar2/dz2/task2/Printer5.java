package seminar2.dz2.task2;

import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

class BubbleSort {
    private static final DateTimeFormatter FORMATTER = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");

    public void sort(int[] arr) {
        delToFile();
        int n = arr.length;
        boolean swapped;
        for (int i = 0; i < n-1 ; i++) {
            swapped = false;
            for (int j = 0; j < n - i -1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Обмен элементов
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) break;
            log(arr);

            // Логирование результата

        }
        log(arr);
    }
    static void delToFile(){
        try (FileWriter w = new FileWriter("src/seminar2/dz2/task2/log.txt")) {
            w.write("");
        } catch (Exception e){
            e.printStackTrace();

        }
    }

    private void log(int[] arr) {
        try (FileWriter writer = new FileWriter("src/seminar2/dz2/task2/log.txt",true)) {
            String logEntry = LocalDateTime.now().format(FORMATTER) + " " + Arrays.toString(arr);
            writer.write(logEntry + "\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
public class Printer5{
    public static void main(String[] args) {
        int[] arr = {};
        // При отправке кода на Выполнение, вы можете варьировать эти параметры
        if (args.length == 0) {
            arr = new int[]{10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        }
        else{
            arr = Arrays.stream(args[0].split(", "))
                    .mapToInt(Integer::parseInt)
                    .toArray();
        }

        BubbleSort ans = new BubbleSort();
        ans.sort(arr);

        try (BufferedReader br = new BufferedReader(new FileReader("log.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}