import java.io.*;
import java.util.Scanner;

public class PracticeProblem {
    public static void main(String[] args) {
    }

    public static String readFile(String filename) {
        String rastaman = "";

        try {
            FileReader reader = new FileReader(new File(filename));
            int ch;

            while ((ch = reader.read()) != -1) {
                rastaman += (char) ch;
            }

            reader.close();
        } catch (IOException e) {
            System.out.println("File could not be read.");
        }

        return rastaman;
    }

    public static String backwardsReadFile(String filename) {
        String rastaman = "";

        try {
            FileReader reader = new FileReader(new File(filename));
            int ch;

            while ((ch = reader.read()) != -1) {
                rastaman += (char) ch;
            }

            reader.close();
        } catch (IOException e) {
            System.out.println("File could not be read.");
        }

        // Reverse the content manually
        String reversed = "";
        for (int i = rastaman.length() - 1; i >= 0; i--) {
            reversed += rastaman.charAt(i);
        }

        return reversed;
    }
}