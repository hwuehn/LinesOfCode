package Data;

import org.w3c.dom.ls.LSOutput;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

import java.util.Scanner;


public class Operations {
    private static int lineCount;

    public static void testLinesOfCodeFromString(String str) {
        long count = str.lines().count();
        System.out.println(count);
        str.lines().forEach(System.out::println);

    }

    public static void testlinesOfCodeFromString() {
        String str = "\nHi\nHello\nYes\r\nNo\n";

        List<String> lines = new ArrayList<>();
        str.lines().forEach(s -> lines.add(s));

        System.out.println(lines);
        long count = str.lines().count();
        System.out.println(count);

        str.lines().forEach(System.out::println);
    }

    public static void testLinesOfCodeFromFile() {
        Scanner s = null;
        try {
            File file = new File("src\\com.company.linesofcode\\data\\CodeExample.java");
            s = new Scanner(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        while (s.hasNext()) {
            String string = s.nextLine();
            if (string != null) {
                lineCount++;
            }
        }
        System.out.println(lineCount);
    }
}
