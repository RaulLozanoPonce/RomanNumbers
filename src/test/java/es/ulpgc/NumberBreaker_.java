package es.ulpgc;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(org.junit.runners.Parameterized.class)
public class NumberBreaker_ {

    private int number;
    private int[] numberBroken;

    public NumberBreaker_(int number, int[] numberBroken) {
        this.number = number;
        this.numberBroken = numberBroken;
    }

    @Test
    public void execute(){
        assertThat(numberBreak(number)).isEqualTo(this.numberBroken);
    }

    private int[] numberBreak(int number) {
        return null;
    }

    @Parameterized.Parameters
    public static Object[][] cases() {
        return new Object[][]{
                {0, null}
        };
    }
}
