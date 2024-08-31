package seminar3.dz3.task1;

import java.util.Arrays;

class MergeSort {
    public static int[] sortArr(int[] a, int[] b) {
        // Напишите свое решение ниже
        int [] c = new int[a.length + b.length];
        int pA = 0;
        int pB = 0;
        for (int i = 0; i < c.length; i++) {
            if (pA == a.length) {
                c[i] = b[pB];
                pB++;
            } else if (pB == b.length) {
                c[i] = a[pA];
                pA++;
            } else if (a[pA] < b[pB]) {
                c[i] = a[pA];
                pA++;
            } else {
                c[i] = b[pB];
                pB++;
            }
        }
        return c;
    }
    public static int[] mergeSort(int[] a){
        if (a == null){
            return null;
        }
        if (a.length < 2){
            return a;
        }
        int[] b = new int[a.length/2];
        System.arraycopy(a, 0,b,0,a.length/2);
        int [] c = new int[a.length - a.length / 2];
        System.arraycopy(a, a.length / 2, c, 0, a.length - a.length / 2);
        b = mergeSort(b);
        c = mergeSort(c);
        return sortArr(b,c);
    }
}


// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
public class Printer1{
    public static void main(String[] args) {
        int[] a;

        if (args.length == 0) {
            // При отправке кода на Выполнение, вы можете варьировать эти параметры
            a = new int[]{5, 1, 6, 2, 3, 4};
        } else {
            a = Arrays.stream(args[0].split(", ")).mapToInt(Integer::parseInt).toArray();
        }

        MergeSort answer = new MergeSort();
        String itresume_res = Arrays.toString(answer.mergeSort(a));
        System.out.println(itresume_res);
    }
}
