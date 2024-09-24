package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class Ex03Test {

    @Test
    @DisplayName("Should number negative")
    void ShouldNumberNegative() {
        int[] array = {-1, 2, 3, -2, 5};
        assertThrows(IllegalArgumentException.class, () -> new Ex03(array));

    }

}
