package problems.wordCount;

import java.io.File;
import java.util.Scanner;

public class WordCount {
    public static void main(String[] args) throws Exception {
        File file = new File("src/main/java/problems/wordCount/Mission_Furniture_Part_1.txt");
        Scanner scanner = new Scanner(file);
        int wordCount = 0;
        String line;

        while(scanner.hasNextLine()) {
            line = scanner.nextLine();
            wordCount += line.split(" ").length;
        }

        System.out.println("Total words in the file are : " + wordCount);
    }
}
