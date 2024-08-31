package seminar4.les4;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Les4 {
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<>();
        Queue<Integer> q = new LinkedList<>();
        PriorityQueue<Integer> pq  = new PriorityQueue<>();
        pq.add(123);
        pq.add(3);
        pq.add(13);
        pq.add(1);
        ll.add(1);
        ll.add(2);
        ll.add(3);
        q.add(1);
        q.add(2);
        q.add(3);
        System.out.println(ll);
        System.out.println(q);
        System.out.println(pq);
    }
}
