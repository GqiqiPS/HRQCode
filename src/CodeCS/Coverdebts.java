package CodeCS;
import java.util.*;
public class Coverdebts {
//    Given a monthly salary s in dollars, a list of debts, and a list of interests for these debts, your task is to pay all the debts while spending the least possible amount of money. However, you have a strict restriction: you can spend no more than 10% of your salary on covering debts.
//
//    There is also a rule on how the required payment can change according to your previous payments: if at the end of the month, you do not fully pay your ith debt, its amount increases by (interests[i] / 100) * debts[i] dollars. In other words, if at the end of the month for some i where debts[i] > 0, then debts[i] becomes equal to
//
//    debts[i] + debts[i] * (interests[i] / 100)
//    You can pay for the debts in any order. Return the minimum possible amount of money required to cover all the debts.
    double solution(int s, int[] debts, int[] interests) {
        double total = 0;
        for (int i = 0; i < debts.length; i++) {
            total += debts[i];
        }
        double min = total;
        for (int i = 0; i < debts.length; i++) {
            double temp = total;
            for (int j = 0; j < debts.length; j++) {
                if(j == i) {
                    continue;
                }
                temp += debts[j] * (interests[j] / 100.0);
            }
            min = Math.min(min, temp);
        }
        return Math.min(min, s * 1.1);

    }
}
