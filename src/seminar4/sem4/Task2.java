package seminar4.sem4;

import java.util.*;

//Реализовать консольное приложение, которое:
//Принимает от пользователя строку вида
//text~num
//Нужно рассплитить строку по ~, сохранить text в связный список на позицию num.
//Если введено print~num, выводит строку из позиции num в связном списке и удаляет её из списка
public class Task2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<String> list = new LinkedList<>();

        while (true){
            String line = scan.nextLine();
            String text = line.split("~")[0];
            int num = Integer.parseInt(line.split("~")[1]);

            if (text.equals("print")) {
                String str = list.remove(num);
                System.out.println("Вывели и удалили: " + str);
            }else {
                list.add(num, text);
            }



        }
    }
}
