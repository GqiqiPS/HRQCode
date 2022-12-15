package CodeCS;
import java.util.*;
public class companyBotStrategy {

    public double companyBotStrategy(int[][] trainingData) {
        double sum = 0;
        int count = 0;
        for (int i = 0; i < trainingData.length; i++) {
            if (trainingData[i][1] == 1) {
                sum += trainingData[i][0];
                count++;
            }
        }
        if (count == 0) {
            return 0;
        }
        return sum / count;
    }
}
