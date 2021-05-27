package com.reggy93.fibonacci.service;

import com.reggy93.fibonacci.exception.UnsupportedIndexValueException;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.junit.jupiter.api.Assertions.assertThrows;

/**
 * Unit tests for {@link FibonacciCounterImpl}.
 *
 * @author Reggy93 <marcin.z.wrobel@gmail.com>
 * created on 27 May 2021
 */
class FibonacciCounterImplUnitTest {

    private static FibonacciCounterImpl testedCounter;

    @BeforeAll
    static void beforeAll() {
        testedCounter = new FibonacciCounterImpl();
    }


    @Test
    void countFibonacciValueForIndexBelow0ShouldThrowUnsupportedIndexValueException() {

        assertThrows(UnsupportedIndexValueException.class, () -> testedCounter.countFibonacciValueForIndex(-1));
    }


    @Test
    void countFibonacciValueForIndexEqualTo0ShouldReturn0() throws UnsupportedIndexValueException {

        assertThat(testedCounter.countFibonacciValueForIndex(0), is(0));
    }

    @ParameterizedTest
    @ValueSource(ints = {1, 2})
    void countFibonacciValueForIndexEqualTo1Or2ShouldReturn1(int index) throws UnsupportedIndexValueException {

        assertThat(testedCounter.countFibonacciValueForIndex(index), is(1));
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/fibonacci-matrix.csv", numLinesToSkip = 1)
    void countFibonacciValueAccordingToTheProvidedMatrix(int index, int expectedValue) throws UnsupportedIndexValueException {

        assertThat(testedCounter.countFibonacciValueForIndex(index), is(expectedValue));
    }
}