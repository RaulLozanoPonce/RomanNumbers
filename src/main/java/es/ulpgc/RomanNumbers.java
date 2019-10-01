//ReplaceTempWithQuery

package es.ulpgc;

import java.util.Arrays;

public class RomanNumbers {

    public static final int MIN = 0;
    public static final int MAX = 4000;

    public static String toRoman(int number) {
        if (number <= MIN || number >= MAX) throw new IllegalParameterException();
        int[][] decomposedNumber = new NumberBreaker(number).breakdown();
        return Arrays.stream(decomposedNumber)
                .map(i -> RomanMapper.mapNumber(i[0],i[1]))
                .reduce("", (totalNumber, numberToConcatenate) -> totalNumber + numberToConcatenate);
    }

    /*private static int thousands(int number) {
        return (number/1000) % 10;
    }

    private static int ones(int number) {
        return number % 10;
    }

    private static int tens(int number){ return (number/10) % 10; }

    private static int hundreds(int number){ return (number/100) % 10; }

    private static String times(int offset, String[] constants) {
        if(offset == 0) return "";
        return constants[offset-1];
    }*/
}
