package org.example;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class AppTests {
    @Test
    void t1() {
        assertThat(new App().plus(10, 20)).isEqualTo(30);
    }
}
