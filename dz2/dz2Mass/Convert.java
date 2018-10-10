package ru.geekbrains.java2.makerov.dz2;

public class Convert {

    public static int Converter(String[][] massArray)
            throws MySizeArrayException, MyArrayDataException {

        int sum = 0;

        if (4 != massArray.length) throw new MySizeArrayException();

        for (int i = 0; i < massArray.length; i++) {

            if (4 != massArray[i].length) throw new MySizeArrayException();

            for (int r = 0; r < massArray[i].length; r++) {

                try {
                    sum += Integer.parseInt(massArray[i][r]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException(i, r);
                }
            }
        }

        return sum;
    }
}
