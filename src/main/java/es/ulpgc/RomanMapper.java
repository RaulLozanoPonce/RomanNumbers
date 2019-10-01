package es.ulpgc;

public class RomanMapper {

    public static String mapNumber(int number, int position){
        return new String[]{"I","II","III","IV","V","VI","VII","VIII","IX"}[number - 1];
    }
}
