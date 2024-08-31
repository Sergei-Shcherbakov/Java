package seminar4.sem4;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

// 1) Замерьте время, за которое в ArrayList добавятся 10000 элементов.
// 2) Замерьте время, за которое в LinkedList добавятся 10000 элементов. Сравните с предыдущим.
public class Task1 {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new LinkedList<>();
        System.out.println(work(list1));
        System.out.println(work(list2));
    }

    private static long work(List<Integer> list) {
        long timeStart = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            list.add(list.size()/2, i);
        }
        long timeFinish = System.currentTimeMillis();
        return timeFinish - timeStart;
    }
}
