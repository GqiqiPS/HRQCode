package CodeCS;
import java.util.*;
public class domainType {
    String[] solution(String[] domains) {
        HashMap<String, String> map = new HashMap<>();
        map.put("org", "organization");
        map.put("com", "commercial");
        map.put("net", "network");
        map.put("info", "information");
        String[] res = new String[domains.length];
        for(int i = 0; i < domains.length; i++) {
            String[] arr = domains[i].split("\\.");
            res[i] = map.get(arr[arr.length - 1]);
        }
        return res;
    }
}
