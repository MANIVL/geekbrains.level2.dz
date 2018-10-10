package ru.geekbrains.java2.makerov.dz2;

public class Main {

    public static void main(String[] args) {

        String[][] correctMass = {{"5", "12", "43", "16"}, {"8", "75", "3", "6"}, {"4", "0", "5", "36"}, {"51", "0", "7", "4"}};
        String[][] crashMassSize = {{"6", "58", "36", "23"}, {"14", "0"}, {"8", "42", "69", "56"}, {"100", "0", "54", "46"}};
        String[][] crashMassChar = {{"14", "71", "36", "3"}, {"9", "70", "1", "56"}, {"X", "87", "12", "69"}, {"5", "63", "5", "1"}};

        try {
            System.out.println(Convert.Converter(correctMass));
        } catch (MassException e) {
            e.getMessage();
        }


        try {
            System.out.println(Convert.Converter(crashMassSize));
        } catch (MassException e) {
            System.err.println(e.getMessage());
        }

        try {
            System.out.println(Convert.Converter(crashMassChar));
        } catch (MassException e) {
            System.err.println(e.getMessage());
        }
    }

}

