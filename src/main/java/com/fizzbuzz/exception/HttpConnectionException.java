package com.fizzbuzz.exception;

public class HttpConnectionException
        extends RuntimeException {

    private static final long serialVersionUID = 1L;

    public HttpConnectionException(final String reason) {
        super(generateMessage(reason));
    }

    public HttpConnectionException(final String reason,
            final Throwable cause) {
        super(generateMessage(reason), cause);
    }

    public HttpConnectionException(final Throwable cause) {
        super(cause);
    }

    private static String generateMessage(final String reason) {
        return "Http connection failure: " + reason;
    }
}
