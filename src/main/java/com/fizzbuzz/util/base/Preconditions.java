package com.fizzbuzz.util.base;

import com.fizzbuzz.exception.NotFoundException;

public class Preconditions {
    // this is just a collection of static methods. Make the constructor private to prevent instantiation.
    private Preconditions() {
    }

    public static <T> T checkExists(final T obj,
            final Object errorMessage) {
        if (obj == null) {
            throw new NotFoundException(errorMessage.toString());
        }

        return obj;
    }
}
