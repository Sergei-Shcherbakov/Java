package seminar3.sem3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

//Создать список типа ArrayList
//Поместить в него как строки, так и целые числа.
//Пройти по списку, найти и удалить целые числа.
public class Task3 {
    public static void main(String[] args) {
        List list = listAdd();
        System.out.println(list);
        listDellInt(list);
        System.out.println(list);
        listDellInt2(list);
        System.out.println(list);
    }

    private static void listDellInt2(List list) {
        Iterator iter = list.iterator();
        while (iter.hasNext()){
            if(iter.next() instanceof Integer) iter.remove();
        }
    }

    public static List listAdd(){
        List list = new ArrayList();
        list.add(5);
        list.add(6);
        list.add('a');
        list.add('6');
        list.add(5.5);
        list.add(7);
        list.add("iw");
        list.add(9);
        list.add(true);
        return list;
    }
    public static void listDellInt(List list){
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) instanceof Integer){
                list.remove(i);
                i--;
            }
        }

    }
}
