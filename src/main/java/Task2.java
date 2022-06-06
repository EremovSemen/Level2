import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Task2 {
    public static void main(String[] args) {
//       Информация вносится следующим образом, с начала номер, за тем имя
        ArrayList<String> phoneName = new ArrayList<String>();
        addPhone(phoneName,"8 800 2000 000");
        addName(phoneName,"Сидоров");
        addPhone(phoneName,"8 800 2000 200");
        addName(phoneName,"Егоров");
        addPhone(phoneName,"8 800 2000 315");
        addName(phoneName,"Егоров");
        addPhone(phoneName, "8 800 2020 343");
        addName(phoneName, "Иванов");
        addPhone(phoneName, "8 800 2432 221");
        addName(phoneName, "Иванов");
        System.out.println("Поиск номера по указанной фамилии:");
        get(phoneName, "Иванов");


    }

    public static void get(ArrayList<String> list, String setName) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals(setName)) {
                System.out.println(list.get(i) + " " + list.get(i - 1));
            }
        }
    }

    public static void addPhone(ArrayList<String> List, String phone) {
        List.add(phone);
    }
    public static void addName(ArrayList<String> List, String name) {
        List.add( name);
    }
}
