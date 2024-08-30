package seminar2.sem2;
//Напишите метод, который принимает на вход строку (String) и
//определяет является ли строка палиндромом (возвращает boolean значение).
    public class task3 {
    public static void main(String[] args) {
        String a = "A man a plan a canal panama";
        System.out.println(bo(a));

    }

    static Boolean bo(String a){
        a = a.replace(" ", "").replace(",", "").replace("—","").toLowerCase();
        StringBuilder st = new StringBuilder(a);
        return a.contentEquals(st.reverse());
    }
}
