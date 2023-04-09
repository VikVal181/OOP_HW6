package org.example;

public interface VendingMachine <T extends Product> {
    T getProduct(String name) throws IllegalStateException;
}
