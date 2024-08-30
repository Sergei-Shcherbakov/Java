package seminar2.dz2.task1;
import netscape.javascript.JSObject;



class Answer {
    public static StringBuilder answer(String QUERY, String PARAMS){
        // Напишите свое решение ниже
        StringBuilder sb = new StringBuilder();
        String name = extractValue(PARAMS, "name");
        String country = extractValue(PARAMS, "country");
        String city = extractValue(PARAMS, "city");
        String age = extractValue(PARAMS, "age");
        sb.append(QUERY);
        if (!name.isEmpty()) {
            sb.append("name = '").append(name).append("' AND ");
        }
        if (!country.isEmpty()) {
            sb.append("country = '").append(country).append("' AND ");
        }
        if (!city.isEmpty()) {
            sb.append("city = '").append(city).append("' AND ");
        }
        // Проверка на null
        if (!age.isEmpty() && !age.equals("null")) {
            sb.append("age = '").append(age).append("' AND ");
        }

        // Удаление лишнего "AND" в конце
        if (sb.lastIndexOf(" AND ") == sb.length() - 5) {
            sb.delete(sb.length() - 5, sb.length());
        }

        // Удаление " WHERE " если не было условий
        if (sb.toString().equals("SELECT * FROM Users WHERE ")) {
            sb.delete(sb.length() - 7, sb.length());
        }


        // Удаление " WHERE " если не было условий
        if (sb.toString().equals("SELECT * FROM Users WHERE ")) {
            sb.delete(sb.length() - 7, sb.length());
        }
        return sb;
    }

    private static String extractValue(String PARAMS, String key) {
        int start = PARAMS.indexOf("\"" + key + "\":\"");
        if (start == -1) {
            return ""; // Значение не найдено
        }
        int end = PARAMS.indexOf("\"", start + key.length() + 4);
        return PARAMS.substring(start + key.length() + 4, end);
    }
}


// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
public class Printer4{
    public static void main(String[] args) {
        String QUERY = "";
        String PARAMS = "";

        if (args.length == 0) {
            // При отправке кода на Выполнение, вы можете варьировать эти параметры
            QUERY = "select * from students where ";
            PARAMS = "{\"name\":\"Ivanov\", \"country\":\"Russia\", \"city\":\"Moscow\", \"age\":\"null\"} ";
        }
        else{
            QUERY = args[0];
            PARAMS = args[1];
        }

        Answer ans = new Answer();
        System.out.println(ans.answer(QUERY, PARAMS));
    }
}
