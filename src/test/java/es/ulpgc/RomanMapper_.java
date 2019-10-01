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
                {3, 1, "XXX"},
                {4, 1, "XL"},
                {5, 1, "L"},
                {6, 1, "LX"},
                {8, 1, "LXXX"},
                {1, 2, "C"},
                {4, 2, "CD"},
                {7, 2, "DCC"},
                {9, 2, "CM"},
                {3, 3, "MMM"}
        };
    }
}

