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
        assertThat(numberBreak(number)).isEqualTo(this.numberBroken);
    }

    private int[][] numberBreak(int number) {
        if(number >= 10) return new int[][] {{number/10,1}};
        return number == 0 ? null : new int[][] {{number,0}};
    }

    @Parameterized.Parameters
    public static Object[][] cases() {
        return new Object[][]{
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
                {50, new int[][] {{5,1}}}
        };
    }
}
