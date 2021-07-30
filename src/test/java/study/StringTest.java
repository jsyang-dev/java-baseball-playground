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
        String[] values = "1,2".split(",");

        // then
        assertThat(values).containsExactly("1", "2");
    }

    @Test
    void split2() {
        // when
        String[] values = "1".split(",");

        // then
        assertThat(values).contains("1");
    }
}
