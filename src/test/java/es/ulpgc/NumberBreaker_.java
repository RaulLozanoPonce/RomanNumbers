package es.ulpgc;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(org.junit.runners.Parameterized.class)
public class NumberBreaker_ {

    private int number;
    private int[][] numberBroken;

    public NumberBreaker_(int number, int[][] numberBroken) {
        this.number = number;
        this.numberBroken = numberBroken;
    }

    @Test
    public void execute(){
        assertThat(breakdown(number)).isEqualTo(this.numberBroken);
    }

    private int[][] breakdown(int number) {
        if(number <= 0 || number >= 4000) return null;
        if(number >= 1000) return new int[][] {{number/1000,3}};
        if(number >= 100) return new int[][] {{number/100,2}};
        if(number >= 10) return new int[][] {{number/10,1}};
        return new int[][] {{number,0}};
    }

    @Parameterized.Parameters
    public static Object[][] cases() {
        return new Object[][]{
                {-1, null},
                {0, null},
                {1, new int[][] {{1,0}}},
                {2, new int[][] {{2,0}}},
                {3, new int[][] {{3,0}}},
                {4, new int[][] {{4,0}}},
                {5, new int[][] {{5,0}}},
                {10, new int[][] {{1,1}}},
                {20, new int[][] {{2,1}}},
                {30, new int[][] {{3,1}}},
                {40, new int[][] {{4,1}}},
                {50, new int[][] {{5,1}}},
                {100, new int[][] {{1,2}}},
                {200, new int[][] {{2,2}}},
                {300, new int[][] {{3,2}}},
                {400, new int[][] {{4,2}}},
                {500, new int[][] {{5,2}}},
                {1000, new int[][] {{1,3}}},
                {2000, new int[][] {{2,3}}},
                {3000, new int[][] {{3,3}}},
                {4000, null}
        };
    }
}
