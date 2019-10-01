package es.ulpgc;

import java.util.stream.Stream;

import static java.lang.Integer.parseInt;
import static java.util.stream.IntStream.iterate;

public class NumberBreaker {

    private int number;

    public NumberBreaker(int number){
        this.number = number;
    }

    public int[][] breakdown() {
        if(number <= 0 || number >= 4000) return null;
        String numberString = number + "";
        return streamOf(numberString)
                .map(i -> tupleOf(numberString, i))
                .filter(filter -> isNotZero(filter))
                .toArray(int[][]::new);
    }

    private Stream<Integer> streamOf(String number) {
        return iterate(0, l -> l+1)
                .limit(number.length())
                .boxed();
    }

    private boolean isNotZero(int[] tuple){
        return tuple[0] != 0;
    }

    private int[] tupleOf(String number, Integer i){
        return new int[]{parseInt(number.substring(i,i+1)), number.length() - i - 1};
    }
}
