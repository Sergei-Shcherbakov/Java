package seminar4.sem4;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

//Реализовать консольное приложение, которое:
//Принимает от пользователя и “запоминает” строки.
//Если введено print, выводит строки так, чтобы последняя введенная была первой в списке, а первая - последней.
//Если введено revert, удаляет предыдущую введенную строку из памяти.
public class Task3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<String> list = new LinkedList<>();
        boolean work = true;
        while (work){
            String line = scan.nextLine();
            switch (line){
                case "print":
                    ListIterator<String> iter = list.listIterator(list.size());
                    while (iter.hasPrevious()){
                        System.out.println(iter.previous());
//                        for (String s: list){
//                            System.out.println(s); // index = 0
                    }
                    break;
                case "revert":
                    list.remove(list.size() -1 );
                    break;
                case "finish":
                    work = false;
                    break;
                default:
                    list.add(line);
            }
        }
    }
}
