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
        assertThat(RomanNumbers.breakdown(number)).isEqualTo(this.numberBroken);
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
                {11, new int[][] {{1,1}, {1,0}}},
                {15, new int[][] {{1,1}, {5,0}}},
                {17, new int[][] {{1,1}, {7,0}}},
                {20, new int[][] {{2,1}}},
                {30, new int[][] {{3,1}}},
                {40, new int[][] {{4,1}}},
                {50, new int[][] {{5,1}}},
                {100, new int[][] {{1,2}}},
                {101, new int[][] {{1,2}, {1,0}}},
                {120, new int[][] {{1,2}, {2,1}}},
                {153, new int[][] {{1,2}, {5,1}, {3,0}}},
                {200, new int[][] {{2,2}}},
                {300, new int[][] {{3,2}}},
                {400, new int[][] {{4,2}}},
                {500, new int[][] {{5,2}}},
                {1000, new int[][] {{1,3}}},
                {1001, new int[][] {{1,3}, {1,0}}},
                {1020, new int[][] {{1,3}, {2,1}}},
                {1045, new int[][] {{1,3}, {4,1}, {5,0}}},
                {1123, new int[][] {{1,3}, {1,2}, {2,1}, {3,0}}},
                {1300, new int[][] {{1,3}, {3,2}}},
                {1607, new int[][] {{1,3}, {6,2}, {7,0}}},
                {1890, new int[][] {{1,3}, {8,2}, {9,1}}},
                {2000, new int[][] {{2,3}}},
                {3000, new int[][] {{3,3}}},
                {4000, null}
        };
    }
}
