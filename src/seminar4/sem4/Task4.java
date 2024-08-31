package seminar4.sem4;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

import static java.util.Optional.empty;

// 1) Написать метод, который принимает массив элементов, помещает их в стэк и выводит на консоль содержимое стека.
// 2) Написать метод, который принимает массив элементов, помещает их в очередь и выводит на консоль содержимое очереди.
public class Task4 {
    public static void main(String[] args) {
        String[] arr = {"1", "2", "3", "4"};
//        printStack(arr);
        printQueue(arr);
    }

    private static void printQueue(String[] arr) {
        Queue<String> q = new LinkedList<>();
        q.addAll(Arrays.asList(arr));
        while (!q.isEmpty()) {
            System.out.println(q.poll());
        }
    }

    static void printStack(String[] arr) {
        Stack<String> stack = new Stack<>();
        stack.addAll(Arrays.asList(arr));
//        System.out.println(stack);
        while (!stack.empty()) {
            System.out.println(stack.pop());
        }
    }

}
