
import java.util.*;

public class Task2 {

    private  Map<String, List<String>> phones = new HashMap<>();


    public void add(String name, String phone) {
        List<String> phoneList = phones.getOrDefault(name, new ArrayList<>());
        phoneList.add(phone);
        phones.put(name, phoneList);

    }

    List<String> get(String name) {
      return  phones.getOrDefault(name, new ArrayList<>());
    }

}

