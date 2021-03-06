package es.ulpgc;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class RomanMapper {

    private static Map<Integer,String> romanMap;

    static{
        romanMap = new HashMap<>();
        romanMap.put(hashOf(1, 0),"I");
        romanMap.put(hashOf(2, 0),"II");
        romanMap.put(hashOf(3, 0),"III");
        romanMap.put(hashOf(4, 0),"IV");
        romanMap.put(hashOf(5, 0),"V");
        romanMap.put(hashOf(6, 0),"VI");
        romanMap.put(hashOf(7, 0),"VII");
        romanMap.put(hashOf(8, 0),"VIII");
        romanMap.put(hashOf(9, 0),"IX");
        romanMap.put(hashOf(1, 1),"X");
        romanMap.put(hashOf(2, 1),"XX");
        romanMap.put(hashOf(3, 1),"XXX");
        romanMap.put(hashOf(4, 1),"XL");
        romanMap.put(hashOf(5, 1),"L");
        romanMap.put(hashOf(6, 1),"LX");
        romanMap.put(hashOf(7, 1),"LXX");
        romanMap.put(hashOf(8, 1),"LXXX");
        romanMap.put(hashOf(9, 1),"XC");
        romanMap.put(hashOf(1, 2),"C");
        romanMap.put(hashOf(2, 2),"CC");
        romanMap.put(hashOf(3, 2),"CCC");
        romanMap.put(hashOf(4, 2),"CD");
        romanMap.put(hashOf(5, 2),"D");
        romanMap.put(hashOf(6, 2),"DC");
        romanMap.put(hashOf(7, 2),"DCC");
        romanMap.put(hashOf(8, 2),"DCCC");
        romanMap.put(hashOf(9, 2),"CM");
        romanMap.put(hashOf(1, 3),"M");
        romanMap.put(hashOf(2, 3),"MM");
        romanMap.put(hashOf(3, 3),"MMM");
    }

    private static int hashOf(int number, int position) {
        return Arrays.hashCode(new int[]{number, position});
    }

    public static String mapNumber(int number, int position){
        return romanMap.get(hashOf(number, position));
    }
}
