package seminar5.dz5.task3;

import java.util.Arrays;



class HeapSort {
    public static void buildTree(int[] tree, int sortLength, int i) {
        // Введите свое решение ниже
//        int i = tree[0];
//        for (int cur:tree) {
//            if(cur > i){
//                i = cur;
//        }
        int left = 2 * i + 1;
        int right = 2 * i + 2;
        int largest = i;
        if (left < sortLength && tree[left] > tree[largest]) {
            largest = left;
        }
        if (right < sortLength && tree[right] > tree[largest]) {
            largest = right;
        }
        if (largest != i) {
            int tmp = tree[i];
            tree[i] = tree[largest];
            tree[largest] = tmp;
            buildTree(tree, sortLength, largest);
        }
    }


    public static void heapSort(int[] sortArray, int sortLength) {
// Введите свое решение ниже
        if (sortLength == 0) {
            return;
        }

        int length = sortLength;

        // Moving from the first element that isn't a leaf towards the root
        for (int i = length / 2 - 1; i >= 0; i--) {
            buildTree(sortArray, length, i);
        }

        for (int i = length - 1; i >= 0; i--) {
            int tmp = sortArray[0];
            sortArray[0] = sortArray[i];
            sortArray[i] = tmp;
            buildTree(sortArray, i, 0);
        }
    }

}

// Не удаляйте и не меняйте метод Main!
public class Printer3 {
    public static void main(String[] args) {
        int[] initArray;

        if (args.length == 0) {
            initArray = new int[]{17, 32, 1, 4, 25, 17, 0, 3, 10, 7, 64, 1};
        } else {
            initArray = Arrays.stream(args[0].split(" ")).mapToInt(Integer::parseInt).toArray();
        }

        System.out.println("Initial array:");
        System.out.println(Arrays.toString(initArray));
        HeapSort.heapSort(initArray, initArray.length);
        System.out.println("Sorted array:");
        System.out.println(Arrays.toString(initArray));
    }
}
