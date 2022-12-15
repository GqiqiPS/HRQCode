package CodeCS;
import java.util.*;
public class GroupArrays {
    // You are given an array of arrays a. Your task is to group the arrays a[i] by their mean values, so that arrays with equal mean values are in the same group, and arrays with different mean values are in different groups.
    //
    //Each group should contain a set of indices (i, j, etc), such that the corresponding arrays (a[i], a[j], etc) all have the same mean. Return the set of groups as an array of arrays,
    // where the indices within each group are sorted in ascending order, and the groups are sorted in ascending order of their minimum element.
    // For
    //
    //a = [[3, 3, 4, 2],
    //     [4, 4],
    //     [4, 0, 3, 3],
    //     [2, 3],
    //     [3, 3, 3]]
    //the output should be
    //
    //solution(a) = [[0, 4],
    //                 [1],
    //                 [2, 3]]
    //mean(a[0]) = (3 + 3 + 4 + 2) / 4 = 3;
    //mean(a[1]) = (4 + 4) / 2 = 4;
    //mean(a[2]) = (4 + 0 + 3 + 3) / 4 = 2.5;
    //mean(a[3]) = (2 + 3) / 2 = 2.5;
    //mean(a[4]) = (3 + 3 + 3) / 3 = 3.
    //There are three groups of means: those with mean 2.5, 3, and 4. And they form the following groups:
    //
    //Arrays with indices 0 and 4 form a group with mean 3;
    //Array with index 1 forms a group with mean 4;
    //Arrays with indices 2 and 3 form a group with mean 2.5.
    //Note that neither
    //
    //solution(a) = [[0, 4],
    //                 [2, 3],
    //                 [1]]
    //nor
    //
    //solution(a) = [[0, 4],
    //                 [1],
    //                 [3, 2]]
    //will be considered as a correct answer:
    //
    //In the first case, the minimal element in the array at index 2 is 1, and it is less then the minimal element in the array at index 1, which is 2.
    //In the second case, the array at index 2 is not sorted in ascending order.
    //For
    //
    //a = [[-5, 2, 3],
    //     [0, 0],
    //     [0],
    //     [-100, 100]]
    //the output should be
    //
    //solution(a) = [[0, 1, 2, 3]]
    //The mean values of all of the arrays are 0, so all of them are in the same group.
    int[][] solution(int[][] a) {
        int[][] res = new int[a.length][];
        int[] mean = new int[a.length];
        for(int i = 0; i < a.length; i++) {
            mean[i] = getMean(a[i]);
        }
        int[] count = new int[a.length];
        for(int i = 0; i < a.length; i++) {
            for(int j = 0; j < a.length; j++) {
                if(mean[i] == mean[j]) {
                    count[i]++;
                }
            }
        }
        int[][] temp = new int[a.length][];
        for(int i = 0; i < a.length; i++) {
            temp[i] = new int[count[i]];
        }
        int[] index = new int[a.length];
        for(int i = 0; i < a.length; i++) {
            for(int j = 0; j < a.length; j++) {
                if(mean[i] == mean[j]) {
                    temp[i][index[i]++] = j;
                }
            }
        }
        for(int i = 0; i < a.length; i++) {
            Arrays.sort(temp[i]);
        }
        int[] count2 = new int[a.length];
        for(int i = 0; i < a.length; i++) {
            for(int j = 0; j < a.length; j++) {
                if(temp[i][0] == temp[j][0]) {
                    count2[i]++;
                }
            }
        }
        int[][] temp2 = new int[a.length][];
        for(int i = 0; i < a.length; i++) {
            temp2[i] = new int[count2[i]];
        }
        int[] index2 = new int[a.length];
        for(int i = 0; i < a.length; i++) {
            for(int j = 0; j < a.length; j++) {
                if(temp[i][0] == temp[j][0]) {
                    temp2[i][index2[i]++] = j;
                }
            }
        }
        for(int i = 0; i < a.length; i++) {
            Arrays.sort(temp2[i]);
        }
        int index3 = 0;
        for(int i = 0; i < a.length; i++) {
            if(temp2[i].length != 0) {
                res[index3++] = temp2[i];
    }
            }
        return res;
    }
    int getMean(int[] a) {
        int sum = 0;
        for(int i = 0; i < a.length; i++) {
            sum += a[i];
        }
        return sum / a.length;
    }

}