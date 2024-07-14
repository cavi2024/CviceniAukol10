package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class FindMatchingTest {

    @Test
    public void middle1Test() {
        List<Double> testList = List.of(10.0, 15.45, 5.811, 175.0);
        Double testResult = Find.findMatching(testList, 4.0, 9.3);
        Assertions.assertEquals(5.811, testResult);
    }
}
