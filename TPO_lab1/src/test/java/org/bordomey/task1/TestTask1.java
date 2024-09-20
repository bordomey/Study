package org.bordomey.task1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.bordomey.task1.Arctan;

import static org.junit.jupiter.api.Assertions.*;

public class TestTask1 {

    @ParameterizedTest(name = "arctan({0})")
    @DisplayName("TestTask1")
    @ValueSource(doubles = {-0.99, -0.5, 0, 0.5, 0.99})
    void checkPoints(double param) {
        assertAll(
                () -> assertEquals(Math.atan(param), Arctan.calculate(param,  20), 0.01)
        );
    }

    @ParameterizedTest(name = "arctan({0})")
    @DisplayName("TestTask1 illegal")
    @ValueSource(doubles = {-323, -1, 1, 332})
    void checkIllegalPoints(double param) {
        assertThrows(IllegalArgumentException.class, () -> Arctan.calculate(param, 20) );
    }
}
