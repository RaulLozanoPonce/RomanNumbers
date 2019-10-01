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
                {1, 0, "I"}
        };
    }
}

