package CodeCS;
import java.util.*;
public class Sudoku {
    boolean solution(char[][] grid) {
        for(int i = 0; i < 9; i++) {
            HashSet<Character> row = new HashSet<>();
            HashSet<Character> col = new HashSet<>();
            for(int j = 0; j < 9; j++) {
                if(grid[i][j] != '.' && !row.add(grid[i][j])) {
                    return false;
                }
                if(grid[j][i] != '.' && !col.add(grid[j][i])) {
                    return false;
                }
            }
        }
        for(int i = 0; i < 9; i += 3) {
            for(int j = 0; j < 9; j += 3) {
                HashSet<Character> set = new HashSet<>();
                for(int k = 0; k < 3; k++) {
                    for(int l = 0; l < 3; l++) {
                        if(grid[i + k][j + l] != '.' && !set.add(grid[i + k][j + l])) {
                            return false;
                        }
                    }
                }
            }
        }
        return true;
    }
}
