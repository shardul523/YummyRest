package org.esdpracticals.yummyrest.exception;

public class ProductNotFoundException extends RuntimeException {
    public ProductNotFoundException(String field) {
        super("Product with the given " + field + " is not found");
    }
}
