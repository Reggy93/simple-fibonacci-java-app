package com.reggy93.fibonacci.service;

import com.reggy93.fibonacci.exception.UnsupportedIndexValueException;

import java.util.logging.Logger;

/**
 * Default implementation for {@link FibonacciCounter}.
 *
 * @author Reggy93 <marcin.z.wrobel@gmail.com>
 * created on 27 May 2021
 */
public class FibonacciCounterImpl implements FibonacciCounter {

    private static final  Logger LOG = Logger.getLogger("FibonacciCounterImplLogger");

    @Override
    public int countFibonacciValueForIndex(int index) throws UnsupportedIndexValueException {

        if (index < 0) {
            throw new UnsupportedIndexValueException("Provided index is < 0 - cannot count Fibonacci value!");
        }

        LOG.info(() -> String.format("%s [%s]", "Calculating Fibonacci value for index", index));

        if (index == 0) {
            return 0;
        }

        if (index == 1) {
            return 1;
        }

        return countFibonacciValueForIndex(index - 1) + countFibonacciValueForIndex(index - 2);
    }
}
