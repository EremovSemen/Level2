import java.util.*;

public class Task1 {



    public static void main(String[] args) {
        int A = 0;
        int B = 0;
        int C = 0;
        int D = 0;
        int F = 0;


        ArrayList<String> arr = new ArrayList<>();
        arr.add("A");
        arr.add("A");
        arr.add("A");
        arr.add("A");
        arr.add("B");
        arr.add("B");
        arr.add("B");
        arr.add("B");
        arr.add("C");
        arr.add("C");
        arr.add("D");
        arr.add("F");
        System.out.println("Начальный список: " + arr);
        Iterator<String> iter = arr.iterator();
        while (iter.hasNext()) {
            String str = iter.next();
            if (str.equals("A")) {
                A++;
            }
            if (str.equals("B")) {
                B++;
            }
            if (str.equals("C")) {
                C++;
            }
            if (str.equals("D")) {
                D++;
            }
            if (str.equals("F")) {
                F++;
            }

            }
        System.out.println("Количество повторений эллмента: " + "A- " + A);
        System.out.println("Количество повторений эллмента: " + "B- " + B);
        System.out.println("Количество повторений эллмента: " + "C- " + C);
        System.out.println("Количество повторений эллмента: " + "D- " + D);
        System.out.println("Количество повторений эллмента: " + "F- " + F);

        Set set = new HashSet<>(arr);

        System.out.println("Уникальные эллементы: "+ set);










    }

}
