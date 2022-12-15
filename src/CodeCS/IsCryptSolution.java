package CodeCS;
import java.util.*;
public class IsCryptSolution {
    boolean solution(String[] crypt, char[][] solution) {
        HashMap<Character, Character> map = new HashMap<>();
        for(int i = 0; i < solution.length; i++) {
            map.put(solution[i][0], solution[i][1]);
        }
        String[] res = new String[crypt.length];
        for(int i = 0; i < crypt.length; i++) {
            StringBuilder sb = new StringBuilder();
            for(int j = 0; j < crypt[i].length(); j++) {
                sb.append(map.get(crypt[i].charAt(j)));
            }
            res[i] = sb.toString();
        }
        if(res[0].length() > 1 && res[0].charAt(0) == '0') {
            return false;
        }
        if(res[1].length() > 1 && res[1].charAt(0) == '0') {
            return false;
        }
        if(res[2].length() > 1 && res[2].charAt(0) == '0') {
            return false;
        }
        long a = Long.parseLong(res[0]);
        long b = Long.parseLong(res[1]);
        long c = Long.parseLong(res[2]);
        return a + b == c;


    }
}
