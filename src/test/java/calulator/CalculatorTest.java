package calulator;

import calculator.Calculator;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

class CalculatorTest {

    @ParameterizedTest
    @CsvSource(value = {"2 + 3 * 4 / 2:10", "4 / 2 + 3 * 5 - 10:15"}, delimiter = ':')
    @DisplayName("스트링 계산기를 실행한다")
    void caculate(String input, double expected) {
        // when
        double result = Calculator.excute(input);

        // then
        assertThat(result).isEqualTo(expected);
    }
}
