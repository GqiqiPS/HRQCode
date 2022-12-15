package CodeCS;
import java.util.*;
public class campusCup {
    // Dropbox holds a competition between schools called CampusCup. If you verify an email address from a college, university, or higher education institution, you earn 20 points toward your school's overall ranking. When a school receives at least 100 points, all of its registered members receive an additional 3 Gb of bonus space each. When the school receives at least 200 points, its registered members receive an additional 8 Gb. If the school receives at least 300 points, its members receive an additional 15 Gb. And finally, when a school receives at least 500 points, members receive an additional 25 Gb each.
    String[] solution(String[] emails) {
        HashMap<String, Integer> map = new HashMap<>();
        for (String email : emails) {
            String[] arr = email.split("@");
            String[] arr2 = arr[1].split("\\.");
            if (map.containsKey(arr2[0])) {
                map.put(arr2[0], map.get(arr2[0]) + 20);
            } else {
                map.put(arr2[0], 20);
            }
        }
        List<String> list = new ArrayList<>();
        for (String key : map.keySet()) {
            if (map.get(key) >= 100) {
                list.add(key);
            }
        }
        Collections.sort(list);
        String[] res = new String[list.size()];
        for (int i = 0; i < list.size(); i++) {
            res[i] = list.get(i);
        }
        return res;
    }
}
