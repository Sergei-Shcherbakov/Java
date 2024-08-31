package seminar3.sem3;

import java.util.ArrayList;
import java.util.List;

//Каталог товаров книжного магазина сохранен в виде двумерного списка List<ArrayList<String>> так,
//что на 0й позиции каждого внутреннего списка содержится название жанра,
//а на остальных позициях - названия книг. Напишите метод для заполнения данной структуры. Только уникальные значения.
public class Task4 {
    public static void main(String[] args) {
        List<List<String>> shopBook = new ArrayList<>();
        addBook(shopBook,"Сказка","Репка");
        System.out.println(shopBook);
        addBook(shopBook,"Сказка","Кепка");
        System.out.println(shopBook);
        addBook(shopBook,"Роман","Анастезия");
        System.out.println(shopBook);
        addBook(shopBook,"Роман","Петросия");
        System.out.println(shopBook);
        addBook(shopBook,"Фентези","Гарри Потер");
        System.out.println(shopBook);

    }

    static void addBook(List<List<String>> shopBook, String genre, String nameBook){
        for (int i = 0; i < shopBook.size(); i++) {
            List<String> curList = shopBook.get(i);
            if (curList.get(0).equalsIgnoreCase(genre)){
                if(!curList.contains(nameBook)){
                    curList.add(nameBook);
                }
                return;
            }
        }
        List<String> list = new ArrayList<>();
        list.add(genre);
        list.add(nameBook);
        shopBook.add(list);

    }
}
