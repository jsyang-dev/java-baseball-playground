package study;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class StringTest {

    @Test
    void replace() {
        // when
        String actual = "abc".replace("b", "d");

        // then
        assertThat(actual).isEqualTo("adc");
    }

    @Test
    void split1() {
        // when
        String[] results = "1,2".split(",");

        // then
        assertThat(results).containsExactly("1", "2");
    }

    @Test
    void split2() {
        // when
        String[] results = "1".split(",");

        // then
        assertThat(results).contains("1");
    }

    @Test
    void substring() {
        // when
        String result = "(1,2)".substring(1, 4);

        // then
        assertThat(result).isEqualTo("1,2");
    }
}
