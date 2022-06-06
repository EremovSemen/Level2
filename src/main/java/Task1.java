import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Task1 {


    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Ваня") ;
        arrayList.add("Ваня") ;
        arrayList.add("Ваня");
        arrayList.add("Таня") ;
        arrayList.add("Олег");
        arrayList.add("Леша") ;
        arrayList.add("Тоша") ;
        arrayList.add("Олег");
        arrayList.add("Александр");
        arrayList.add("Дима");
        arrayList.add("Ваня") ;
        arrayList.add("Аня") ;
        System.out.println("Оригинальный лист: ");
        System.out.println(arrayList);
        System.out.println("Считаем колличество повторений выбранного эллемента:");
        get(arrayList,"Ваня");

        HashSet<String> set = new HashSet<>(arrayList);
        System.out.println("Уникальные эллементы:");
        System.out.println(set);

    }
    public static void get(ArrayList<String> list, String setName) {
        int sum = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals(setName)) {
                sum++;
            }
        }
        System.out.println(setName + " встречается " + sum + " раз(а)");
    }

}

