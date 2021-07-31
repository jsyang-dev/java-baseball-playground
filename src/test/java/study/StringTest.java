package study;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatExceptionOfType;

class StringTest {

    @Test
    @DisplayName("replace 메소드를 호출한다")
    void replace() {
        // when
        String actual = "abc".replace("b", "d");

        // then
        assertThat(actual).isEqualTo("adc");
    }

    @Test
    @DisplayName("split 메소드를 호출한다")
    void split1() {
        // when
        String[] results = "1,2".split(",");

        // then
        assertThat(results).containsExactly("1", "2");
    }

    @Test
    @DisplayName("split 메소드를 단일 값으로 호출한다")
    void split2() {
        // when
        String[] results = "1".split(",");

        // then
        assertThat(results).contains("1");
    }

    @Test
    @DisplayName("substring 메소드를 호출한다")
    void substring() {
        // when
        String result = "(1,2)".substring(1, 4);

        // then
        assertThat(result).isEqualTo("1,2");
    }

    @Test
    @DisplayName("charAt 메소드를 호출한다")
    void charAt() {
        // when
        char result = "abc".charAt(1);

        // then
        assertThat(result).isEqualTo('b');
    }

    @Test
    @DisplayName("charAt 메소드를 범위를 벗어난 인덱스로 호출하면 예외를 발생한다")
    void charAtException() {
        // when & then
        assertThatExceptionOfType(StringIndexOutOfBoundsException.class)
                .isThrownBy(() -> "abc".charAt(3))
                .withMessageMatching("String index out of range: \\d+");
    }
}
