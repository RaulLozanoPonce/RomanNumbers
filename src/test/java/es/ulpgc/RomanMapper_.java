package es.ulpgc;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(org.junit.runners.Parameterized.class)
public class RomanMapper_ {
    private int number;
    private int position;
    private String romanNumber;

    public RomanMapper_(int number, int position, String romanNumber) {
        this.number = number;
        this.position = position;
        this.romanNumber = romanNumber;
    }

    @Test
    public void execute(){
        assertThat(RomanMapper.mapNumber(number, position)).isEqualTo(romanNumber);
    }

    @Parameterized.Parameters
    public static Object[][] cases() {
        return new Object[][]{
                {1, 0, "I"},
                {2, 0, "II"},
                {3, 0, "III"},
                {4, 0, "IV"},
                {5, 0, "V"},
                {6, 0, "VI"},
                {7, 0, "VII"},
                {8, 0, "VIII"},
                {9, 0, "IX"},
                {1, 1, "X"},
        };
    }
}

