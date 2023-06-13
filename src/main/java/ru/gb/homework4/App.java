package ru.gb.homework4;

public class App {
    public static void main(String[] args) {
        int row = 4;
        int col = 4;
        String[][] testArray = new String[row][col];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                testArray[i][j] = "2";
            }
        }

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(testArray[i][j] + " ");
            }
            System.out.println();
        }

        int answer = 0;
        try {
            answer = sumArray(testArray);
        } catch (MyArraySizeException e) {
            System.out.println(e.getMessage());
        } catch (MyArrayDataException e) {
            System.out.println(e.getMessage());
        }

        System.out.println(answer);

    }

    public static int sumArray(String[][] array) throws MyArraySizeException, MyArrayDataException {
        int sum = 0;
        if (array.length == 4 && array[0].length == 4) {
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array[0].length; j++) {
                    try {
                        sum += Integer.parseInt(array[i][j]);
                    } catch (NumberFormatException e) {
                        throw new MyArrayDataException("Невозможно получить число", i, j);
                    }
                }
            }
        } else {
            throw new MyArraySizeException("Размер массива не соответствует", array.length, array[0].length);
        }

        return sum;
    }
}
