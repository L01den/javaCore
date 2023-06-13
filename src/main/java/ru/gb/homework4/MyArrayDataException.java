package ru.gb.homework4;

public class MyArrayDataException extends Exception {
    public MyArrayDataException(String message, int row, int col) {
        super(message + " в строе - " + row + ", в столбце - " + col);
    }
}
