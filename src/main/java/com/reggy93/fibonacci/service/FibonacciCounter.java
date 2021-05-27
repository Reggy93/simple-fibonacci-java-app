package com.reggy93.fibonacci.service;

import com.reggy93.fibonacci.exception.UnsupportedIndexValueException;

/**
 * @author Reggy93 <marcin.z.wrobel@gmail.com>
 * created on 27 May 2021
 */
public interface FibonacciCounter {

    /**
     * Returns Fibonacci value for given index.
     *
     * @param index index to count Fibonacci value for.
     * @return Fibonacci value
     */
    int countFibonacciValueForIndex(int index) throws UnsupportedIndexValueException;
}
