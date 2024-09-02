package seminar5.sem5.task2;

import java.util.HashMap;
import java.util.Map;

//Даны 2 строки, написать метод, который вернет true, если эти строки являются изоморфными и false,
// если нет. Строки изоморфны, если одну букву в первом слове можно заменить на некоторую букву во втором слове,
// при этом
//повторяющиеся буквы одного слова меняются на одну и ту же букву с сохранением порядка следования.
// (Например, add - egg изоморфны)
//буква может не меняться, а остаться такой же. (Например, note - code)
//Пример 1:
//Input: s = "foo", t = "bar"
//Output: false
//Пример 2:
//Input: s = "paper", t = "title"
//Output: true
public class Task2 {
    public static void main(String[] args) {
        System.out.println(checkText("paper","title" ));
        System.out.println(checkText("foo","bar" ));
        System.out.println(checkText("foo","foo" ));
        System.out.println(checkText("foo","foot" ));

    }

    public static boolean checkText(String text1, String text2){
        if (text1.length() != text2.length()) return false;
        Map<Character, Character> map = new HashMap<>();
        char[] arr1 = text1.toCharArray();
        char[] arr2 = text2.toCharArray();
        for (int i = 0; i < arr1.length; i++) {
            if (map.containsKey(arr1[i])) {
                if (map.get(arr1[i]) != arr2[i]) {
                    return false;
                }
            }
            else {
                map.put(arr1[i], arr2[i]);
            }

        }
        return true;
    }
}
