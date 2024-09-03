package seminar6.sem6.task2;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

//1. Напишите метод, который заполнит массив из 1000 элементов случайными цифрами от 0 до 24.
//2. Создайте метод, в который передайте заполненный выше массив и
// с помощью Set вычислите процент уникальных значений в данном массиве и верните его в виде числа с плавающей запятой.
//Для вычисления процента используйте формулу:
//процент уникальных чисел = количество уникальных чисел * 100 / общее количество чисел в массиве.
public class T2 {
    public static void main(String[] args) {
        Integer[] arr = generateArr(0,24, 10);
        System.out.println(Arrays.toString(arr));
        System.out.println(uniqPercent(arr));
    }


    static double uniqPercent(Integer[] arr){
        Set<Integer> set = new HashSet<>(Arrays.asList(arr));
        return (set.size() * 100.0) / arr.length;

    }

    static Integer[] generateArr(int min, int max, int n){
        Random random = new Random();
        Integer[] res = new Integer[n];
        for (int i = 0; i < n; i++) {
            res[i] = random.nextInt(min,max+1);
        }
        return res;
    }
}
