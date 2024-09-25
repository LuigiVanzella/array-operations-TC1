package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class Ex03Test {

    @Test
    @DisplayName("Should number negative")
    void ShouldNumberNegative() {
        int[] array = {-1, 2, 3, -2, 5};
        assertThrows(IllegalArgumentException.class, () -> new Ex03(array));

    }

    @Test
    @DisplayName("Should array length equals ten")
    void ShouldArrayLengthEqualsTen(){
        int[] array = {1,2,3,4,5};
        Ex03 ex03 = new Ex03(array);
        ex03.compareNumber(6);
        ex03.compareNumber(7);
        ex03.compareNumber(8);
        ex03.compareNumber(9);
        ex03.compareNumber(10);

        assertEquals(10,ex03.getArrayLength());
    }



}
