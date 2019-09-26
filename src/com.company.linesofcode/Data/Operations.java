package Data;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Operations {
    private static int lineCount;

    public static void testLinesOfCode() {
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
