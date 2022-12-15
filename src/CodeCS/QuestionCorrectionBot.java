package CodeCS;
import java.util.*;
public class QuestionCorrectionBot {
    public String questionCorrectionBot(String question) {
        String[] arr = question.split(" ");
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            if (i == 0) {
                sb.append(arr[i].substring(0, 1).toUpperCase() + arr[i].substring(1));
            } else {
                sb.append(" " + arr[i]);
            }
        }
        if (sb.charAt(sb.length() - 1) != '?') {
            sb.append("?");
        }
        return sb.toString();

    }
}
