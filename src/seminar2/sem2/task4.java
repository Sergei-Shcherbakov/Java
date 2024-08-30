package seminar2.sem2;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.FileHandler;
import java.util.logging.Handler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

//Напишите метод, который составит строку,
//состоящую из 100 повторений слова TEST и метод,
//который запишет эту строку в простой текстовый файл, обработайте исключения.
public class task4 {
    static Logger logger = Logger.getAnonymousLogger();
    public static void main(String[] args) {
        String filePath = "src/seminar2/sem2/test.txt";
        String logPath = "src/seminar2/sem2/log.txt";
        String s = "TEST";
        int n = 5;

        createLogger(logPath);
        String s1 = test(s,n);
//        System.out.println(s1);
        saveToFile(s1,filePath);
        System.out.println(readFile(filePath));
        closeLogger();
    }

    static void closeLogger() {
        Handler[] handlers = logger.getHandlers();
        for (Handler handler: handlers) {
            handler.close();
        }
    }

    static void createLogger(String logPath){
        try {
            FileHandler handler = new FileHandler(logPath, true);
            logger.addHandler(handler);
            SimpleFormatter formatter = new SimpleFormatter();
            handler.setFormatter(formatter);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    static void saveToFile(String s, String filePath){
        try (FileWriter w = new FileWriter(filePath)) {
            w.write(s);
            logger.info("Запись прошла успешно");
        } catch (Exception e){
            e.printStackTrace();
            logger.warning("Не удалось записать файл");
        }
    }


    static String readFile(String filePath){
        File file = new File(filePath);
        StringBuilder st = new StringBuilder();
        try ( Scanner sc = new Scanner(file)){
            while (sc.hasNext()) {
                st.append(sc.nextLine());
                st.append("\n");
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return st.toString();
    }
    static String test(String s, int n){
        StringBuilder st = new StringBuilder();
        for (int i = 0; i < n; i++) {
            st.append(s);
            st.append(" ");
        }
        return st.toString();

    }
}
