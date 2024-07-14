package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class FindMatchingTest {

    @Test
    public void middle1Test() {
        List<Double> testList = List.of(10.0, 15.45, 5.811, 175.0);
        Double testResult = Find.findMatching(testList, 4.0, 9.3);
        Assertions.assertEquals(5.811, testResult);
    }

    @Test
    public void emptyTest() {
        List<Double> testList = new ArrayList<>();
        Assertions.assertThrows(
                Exception.class, () -> Find.findMatching(testList, 10.0, 12.0));
    }

    @Test
    public void middleUkol1Test() {
        List<Double> testList = List.of(12.0, 8.126, 6.0);
        Double testResult = Find.findMatching(testList, 11.0, 12.6);
        Assertions.assertEquals(12.0, testResult);
    }
}
