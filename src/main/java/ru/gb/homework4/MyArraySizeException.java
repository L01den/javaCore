package ru.gb.homework4;

public class MyArraySizeException extends Exception {
    public MyArraySizeException(String message, int row, int col) {
        super(message + " строк - " + row + ", столбцов - " + col);
    }
}
