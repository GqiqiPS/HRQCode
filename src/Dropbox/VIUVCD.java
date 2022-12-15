package Dropbox;
import java.util.*;
public class VIUVCD {
    boolean solution(String passcode, String[] attempts) {
        HashMap<String, Integer> map = new HashMap<>();
        for(int i = 0; i < attempts.length; i++) {
            String attempt = attempts[i];
            if(attempt.equals(passcode)) {
                return true;
            }
            if(attempt.length() < passcode.length()) {
                continue;
            }
            for(int j = 0; j < attempt.length() - passcode.length() + 1; j++) {
                String sub = attempt.substring(j, j + passcode.length());
                if(sub.equals(passcode)) {
                    return true;
                }
                if(map.containsKey(sub)) {
                    map.put(sub, map.get(sub) + 1);
                } else {
                    map.put(sub, 1);
                }
            }

        }
        for(String key : map.keySet()) {
            if(map.get(key) > 1) {
                return true;
            }
        }
        return false;


    }
}
