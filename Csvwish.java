package trainingTest2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Csvwish {

	public static void main(String[] args) {

        readCsvUsingScanner("C:\\Users\\Aman Vishnoi\\Documents\\Book1.csv");
    }

    private static void readCsvUsingScanner(String filePath) {
        try {
            Scanner sc = new Scanner(new File(filePath));

            if (sc.hasNext()) {
                sc.next();
            }

            while (sc.hasNext()) {

                System.out.println("Happy Birthday: " + sc.next().toString());
            }
            sc.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
