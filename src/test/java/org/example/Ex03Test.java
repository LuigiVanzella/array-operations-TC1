package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

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


    @Test
    @DisplayName("Should array length equals zero")
    void ShouldArrayLengthEqualsZero(){
        int[] array = {1,2,3,4,5};
        Ex03 ex03 = new Ex03(array);
        ex03.compareNumber(1);
        ex03.compareNumber(2);
        ex03.compareNumber(3);
        ex03.compareNumber(4);
        ex03.compareNumber(5);

        assertEquals(0,ex03.getArrayLength());

    }

    @Test
    @DisplayName("Should new number negative")
    void ShouldNewNumberNegative() {
        int[] array = {1,2,3,4,5};
        Ex03 ex03 = new Ex03(array);
        ex03.compareNumber(-1);
        assertThrows(IllegalArgumentException.class, () -> new Ex03(array));

    }

    @Test
    @DisplayName("Add number")
    void AddNumber(){
        int[] array = {1,2,3,4,5};
        Ex03 ex03 = new Ex03(array);
        ex03.compareNumber(6);
        assertEquals(6, ex03.getArrayLength());
    }

    @Test
    @DisplayName("Remove number")
    void RemoveNumber(){
        int[] array = {1,2,3,4,5};
        Ex03 ex03 = new Ex03(array);
        ex03.compareNumber(1);
        ex03.compareNumber(2);
        ex03.compareNumber(3);
        assertEquals(2, ex03.getArrayLength());
    }


}
