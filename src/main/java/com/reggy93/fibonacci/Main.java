package com.reggy93.fibonacci;

import com.reggy93.fibonacci.exception.UnsupportedIndexValueException;
import com.reggy93.fibonacci.service.FibonacciCounter;
import com.reggy93.fibonacci.service.FibonacciCounterImpl;

import java.util.function.Supplier;
import java.util.logging.Logger;

/**
 * @author Reggy93 <marcin.z.wrobel@gmail.com>
 * created on 27 May 2021
 */
public class Main {

    private static final Logger LOG = Logger.getLogger("MainClassLogger");

    public static void main(String[] args) {

        final FibonacciCounter fibonacciCounter = new FibonacciCounterImpl();

        LOG.info(logMessage("Trying to count Fibonacci value for index", args[0]));

        try {
            final int fibonacciValue = fibonacciCounter.countFibonacciValueForIndex(Integer.parseInt(args[0]));
            LOG.info(logMessage("Counted Fibonacci value for provided index is:", fibonacciValue));
        } catch (UnsupportedIndexValueException e) {
            LOG.severe(() -> String.format("%s %s", "Following error occurred while trying to count Fibonacci value:"
                    , e));
        } catch (NumberFormatException e) {
            LOG.severe(() -> String.format("%s %s", "Unable to parse provided index value", e));
        }
    }

    private static Supplier<String> logMessage(final String message, final Object parameter) {
        return () -> String.format("%s [%s]", message, parameter);
    }

}
