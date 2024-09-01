package seminar4.dz4.task2;

import java.util.LinkedList;

class MyQueueInt {
    // Напишите свое решение ниже
    private LinkedList<Object> list = new LinkedList<>();



    public void enqueue(int element){
        // Напишите свое решение ниже
//        помещает элемент в конец очереди
        list.add(element);
    }

    public int dequeue(){
        // Напишите свое решение ниже
//        возвращает первый элемент из очереди и удаляет его
        return (Integer) list.removeFirst();
    }

    public int first(){
        // Напишите свое решение ниже
//        возвращает первый элемент из очереди, не удаляя
        return (Integer) list.getFirst();
    }

    public LinkedList<Object> getElements() {
        // Напишите свое решение ниже
//        возвращает все элементы в очереди
        return list;
    }
}

// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
public class Printer2 {
    public static void main(String[] args) {
        MyQueueInt queue;
        queue = new MyQueueInt();

        if (args.length == 0) {
            // При отправке кода на Выполнение, вы можете варьировать эти параметры
            queue.enqueue(1);
            queue.enqueue(10);
            queue.enqueue(15);
            queue.enqueue(5);
        } else {
            queue.enqueue(Integer.parseInt(args[0]));
            queue.enqueue(Integer.parseInt(args[1]));
            queue.enqueue(Integer.parseInt(args[2]));
            queue.enqueue(Integer.parseInt(args[3]));
        }

        System.out.println(queue.getElements());

        System.out.println(queue.dequeue());
        queue.dequeue();
        System.out.println(queue.getElements());

        System.out.println(queue.first());
    }
}
