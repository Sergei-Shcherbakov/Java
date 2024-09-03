package seminar6.sem6.task1;

import java.util.*;

public class T1 {
    public static void main(String[] args) {
        Integer[] arr = {4, 5, 1, 2, 3, 2, 6, 3};

        Set<Integer> set1 = new HashSet<>(Arrays.asList(arr));
        Set<Integer> set2 = new LinkedHashSet<>(Arrays.asList(arr));
        Set<Integer> set3 = new TreeSet<>(Arrays.asList(arr));

        System.out.println(set1);
        System.out.println(set2);
        System.out.println(set3);
    }
}
