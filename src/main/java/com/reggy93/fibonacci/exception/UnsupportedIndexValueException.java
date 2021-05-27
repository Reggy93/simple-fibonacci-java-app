package com.reggy93.fibonacci.exception;

/**
 * Exception thrown when unsupported index value for Fibonacci is provided.
 *
 * @author Reggy93 <marcin.z.wrobel@gmail.com>
 * created on 27 May 2021
 */
public class UnsupportedIndexValueException extends Exception {

    public UnsupportedIndexValueException(String message) {
        super(message);
    }
}
