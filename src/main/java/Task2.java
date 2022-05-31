import java.util.ArrayList;
import java.util.List;

public class Task2 {

    public static void main(String[] args) {
        List<String> myArray = new ArrayList<String>();

        myArray.add("Петров тел. 4432224");
        myArray.add("Петров тел. 4566233");
        myArray.add("Никонов тел. 1238765");
        myArray.add("Иванов тел. 5654398");
        myArray.add("Сидоров тел. 5674356");
        myArray.add("Никонов тел. 2316789");
        Task2.get(myArray);


    }
    public static void get(List<String> myArray) {
        for (String string : myArray) {
            if (string.contains("Петров")) {
                System.out.println(string);
            }
        }

    }

}
