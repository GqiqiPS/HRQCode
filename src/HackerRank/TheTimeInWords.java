package HackerRank;
import javax.xml.transform.Result;
import java.io.IOException;
import java.util.*;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class TheTimeInWords {
    public static String timeInWords(int h, int m) {
        String[] words = new String[]{"one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "eleven", "twelve", "thirteen", "fourteen", "quarter", "sixteen", "seventeen", "eighteen", "nineteen", "twenty", "twenty one", "twenty two", "twenty three", "twenty four", "twenty five", "twenty six", "twenty seven", "twenty eight", "twenty nine", "half"};
        if(m == 0) {
            return words[h - 1] + " o' clock";
        }
        if(m == 15) {
            return words[m - 1] + " past " + words[h - 1];
        }
        if(m == 30) {
            return words[m - 1] + " past " + words[h - 1];
        }
        if(m == 45) {
            return words[60 - m - 1] + " to " + words[h];
        }
        if(m < 30) {
            return words[m - 1] + " minutes past " + words[h - 1];
        }
        if(m == 1) {
            return words[m - 1] + " minute past " + words[h - 1];
        }
        return words[60 - m - 1] + " minutes to " + words[h];
    }


}
