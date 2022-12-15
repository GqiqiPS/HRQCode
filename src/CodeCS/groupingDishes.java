package CodeCS;
import java.util.*;
public class groupingDishes {
    String[][] solution(String[][] dishes) {
        int row = dishes.length;
        int col = dishes[0].length;
        HashMap<String, List<String>> map = new HashMap<>();
        for (int i = 0; i < row; i++) {
            for (int j = 1; j < col; j++) {
                if (map.containsKey(dishes[i][j])) {
                    map.get(dishes[i][j]).add(dishes[i][0]);
                } else {
                    List<String> list = new ArrayList<>();
                    list.add(dishes[i][0]);
                    map.put(dishes[i][j], list);
                }
            }
        }
        List<String[]> list = new ArrayList<>();
        for (String key : map.keySet()) {
            if (map.get(key).size() > 1) {
                Collections.sort(map.get(key));
                String[] arr = new String[map.get(key).size() + 1];
                arr[0] = key;
                for (int i = 1; i < arr.length; i++) {
                    arr[i] = map.get(key).get(i - 1);
                }
                list.add(arr);
            }
        }
        Collections.sort(list, new Comparator<String[]>() {
            @Override
            public int compare(String[] o1, String[] o2) {
                return o1[0].compareTo(o2[0]);
            }
        });
        String[][] res = new String[list.size()][];
        for (int i = 0; i < list.size(); i++) {
            res[i] = list.get(i);
        }
        return res;


    }
}
