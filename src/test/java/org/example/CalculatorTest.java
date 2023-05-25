//ID:B201202047
//NAME:FERHAT
//SURNAME:TOPCUOGLU
//COURSE NAME:SOFTWARE VERIFICATION
//HOMEWORK NUMBER: 1
//GITHUB LINK: https://github.com/feronline

package org.example;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

    @ParameterizedTest
    @CsvSource({
            "20, 5, 4",
            "4, 1, 4",
            "14, 7, 2",
            "8, 4, 2",
            "25, 5, 5"
    })
    void testDivision(double bolunen, double bolen, double sonuc) {
        assertEquals(sonuc, Calculator.divide(bolunen, bolen));
    }
}