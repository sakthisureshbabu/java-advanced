package exceptionHandling;

import java.io.*;

public class InputException {
    static void readFile(String fileName) throws IOException {
        try (FileReader file = new FileReader(fileName)) {
            int data;
            while((data = file.read()) != -1) {
                System.out.print((char)data);
            }
        }
    }

    public static void main(String[] args) {
        try {
            readFile("input.txt");
        } catch(IOException e) {
            System.out.println("Cannot read the file: " + e.getMessage());
        }

        System.out.println("Program continues after file execution.");
    }
}