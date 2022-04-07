package com.javaacademy.javaspringrecap.Exceptions;

public class NotEnoughMoneyException extends Exception{
    public NotEnoughMoneyException() {
        super("Fonduri insuficiente");
    }
}
