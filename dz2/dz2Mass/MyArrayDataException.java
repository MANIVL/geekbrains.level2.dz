package ru.geekbrains.java2.makerov.dz2;

public class MyArrayDataException extends MassException {

    public MyArrayDataException(int row, int col) {
        super(String.format("Преобразование не удалось в массиве [%d, %d]", row, col));
    }
}
