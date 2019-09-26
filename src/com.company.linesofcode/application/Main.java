package application;

import Data.CodeExample;
import Data.Operations;

public class Main {

    public static void main(String[] args) {
        CodeExample source = new CodeExample();
        source.linesPrinted();
        Operations functions = new Operations();
        //functions.testLinesOfCodeFromFile();
        //functions.testlinesOfCodeFromString();


        String text ="package Data;\npublic class CodeExample {\npublic void linesPrinted() {\n" +
        "System.out.println(" + "These are some lines of code\n" +
        "for the example class\n" +
        "printed via main-method." + "  );\n" +
        "System.out.println("+"a new line..."+");\n" +
        "}\n" +
        "}";

        functions.testLinesOfCodeFromString(text);




    }





}
