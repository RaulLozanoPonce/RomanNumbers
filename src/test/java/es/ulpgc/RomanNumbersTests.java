package es.ulpgc;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertFalse;

@RunWith(org.junit.runners.Parameterized.class)
public class RomanNumbersTests {

    private int number;
    private String value;
    private Object exceptionClass;

    public RomanNumbersTests(int number, String value, Object exceptionClass) {
        this.number = number;
        this.value = value;
        this.exceptionClass = exceptionClass;
    }

    @Test
    public void execute(){
        try {
            assertThat(RomanNumbers.toRoman(number)).isEqualTo(this.value);
            assertFalse(exceptionClass != null);
        }catch (IllegalParameterException e){
            assertFalse(exceptionClass == null);
        }
    }

    @Parameterized.Parameters
    public static Object[][] cases() {
        return new Object[][]{
                {-1, null, IllegalParameterException.class},
                {0, null, IllegalParameterException.class},
                {4000, null, IllegalParameterException.class},
                {5000, null, IllegalParameterException.class},
                {1, "I", null},
                {2, "II", null},
                {3, "III", null},
                {10, "X", null},
                {11, "XI", null},
                {20, "XX", null},
                {30, "XXX", null},
                {100, "C", null},
                {110, "CX", null},
                {111, "CXI", null},
                {200, "CC", null},
                {300, "CCC", null}
        };
    }
}