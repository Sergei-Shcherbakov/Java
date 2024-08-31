package seminar3.sem3;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

//Заполнить список десятью случайными числами.
//Отсортировать список методом sort() и вывести его на экран.
public class Task2 {
    public static void main(String[] args) {
        List<Integer> a = masRandom(5, 1, 5);
        System.out.println(a);
        a.sort(null);
        System.out.println(a);


    }
    public static List<Integer> masRandom(int count, int min, int max){
        List<Integer> mac = new ArrayList<>(count);
        Random rand = new Random();
        for (int i = 0; i < count ; i++) {
            mac.add(rand.nextInt(min, max +1));
        }
        return mac;
    }
}
