package com.fizzbuzz.util.base;

import com.fizzbuzz.exception.NotFoundException;

public class Preconditions {
    public static <T> T checkExists(final T obj, final Object errorMessage) {
        if (obj == null) {
            throw new NotFoundException(errorMessage.toString());
        }
        else
            return obj;
    }
}
