package es.ulpgc;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class RomanNumbers {

    public static final int MIN = 0;
    public static final int MAX = 4000;
    public static final String[] ONES = {"I", "II", "III"};
    public static final String[] HUNDREDS = {"C", "CC", "CCC"};
    public static final String[] TENS = {"X", "XX", "XXX"};
    public static final String[] THOUSANDS = {"M", "MM", "MMM"};

    public static String toRoman(int number) {
        if (number <= MIN || number >= MAX) throw new IllegalParameterException();
        if (number >= 1000) return times(thousands(number), THOUSANDS) + times(hundreds(number), HUNDREDS) + times(tens(number), TENS) + times(ones(number), ONES);
        if (number >= 100) return times(hundreds(number), HUNDREDS) + times(tens(number), TENS) + times(ones(number), ONES);
        if (number >= 10) return times(tens(number), TENS) + times(ones(number), ONES);
        return times(number, ONES);
    }

    private static int thousands(int number) {
        return (number%10000)/1000;
    }

    private static int ones(int number) {
        return number % 10;
    }

    private static int tens(int number){
        return (number%100)/10;
    }

    private static int hundreds(int number){
        return (number%1000)/100;
    }

    private static String times(int offset, String[] constants) {
        if(offset == 0) return "";
        return constants[offset-1];
    }

    public static int[][] breakdown(int number) {
        if(number <= 0 || number >= 4000) return null;
        List<int[]> digits = new ArrayList<int[]>();
        int digitCount = (Integer.toString(number)).length();
        for (int i = 0; i < digitCount; i++) {
            digits.add(new int[] {(int) ((number/Math.pow(10,i))%10),i});
        }
        digits = digits.stream()
                .filter(digitAndPosition -> digitAndPosition[0] != 0)
                .collect(Collectors.toList());
        Collections.reverse(digits);
        return digits.toArray(new int[0][]);
    }
}
