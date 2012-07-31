package com.fizzbuzz.util.base;

import java.lang.reflect.Constructor;

public class Reflections {
    public static <T> T newInstance(final Class<T> clazz) {
        T result = null;

        try {
            result = clazz.newInstance();
        }
        catch (Exception e) {
            throw new RuntimeException("failed to instantiate class: " + clazz.getName());

        }
        return result;
    }

    public static <S> S newInstance(final Class<S> clazz, final long param) {
        // get the constructor for the specified class that takes a long param. Then construct it.
        Constructor<S> ctor = getConstructor(clazz, new Class[] { long.class });
        return newInstance(ctor, param);

    }

    public static <T> T newInstance(final Constructor<T> ctor, final Object... args) {
        T result = null;

        try {
            result = ctor.newInstance(args);
        }
        catch (Exception e) {
            throw new RuntimeException("failed to instantiate class: " + ctor.getClass().getName());

        }
        return result;
    }

    public static <T> Constructor<T> getConstructor(final Class<T> clazz, final Class<?>... paramTypes) {
        Constructor<T> result = null;
        try {
            result = clazz.getConstructor(paramTypes);
        }
        catch (Exception e) {
            throw new RuntimeException("failed to get constructor for class: " + clazz.getName());

        }
        return result;

    }

}
