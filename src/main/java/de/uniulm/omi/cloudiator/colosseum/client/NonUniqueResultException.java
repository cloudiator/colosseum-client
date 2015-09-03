package de.uniulm.omi.cloudiator.colosseum.client;

/**
 * Created by daniel on 03.09.15.
 */
public class NonUniqueResultException extends RuntimeException {

    public NonUniqueResultException() {
        super();
    }

    public NonUniqueResultException(String message) {
        super(message);
    }

    public NonUniqueResultException(String message, Throwable cause) {
        super(message, cause);
    }

    public NonUniqueResultException(Throwable cause) {
        super(cause);
    }

    protected NonUniqueResultException(String message, Throwable cause, boolean enableSuppression,
        boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
