/*
 * Created on Dec 12, 2004
 */
package org.mindswap.exceptions;

/**
 * @author Evren Sirin
 */
public class ExecutionException extends RuntimeException {
    /**
     * 
     */
    public ExecutionException() {
        super();
    }

    /**
     * @param message
     */
    public ExecutionException(String message) {
        super(message);
    }
}
