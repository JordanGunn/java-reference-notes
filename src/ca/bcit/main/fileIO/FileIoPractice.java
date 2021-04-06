package ca.bcit.main.fileIO;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FileIoPractice {


    public static void main(String[] args) throws FileNotFoundException {

    }

    // if the I/O file for a scanner doesn't exist, a FileNotFoundException occurs
    // when the scanner object is constructed
    public void fileIoBasics() throws FileNotFoundException {
        // TO WORK WITH FILES

        // 1. create an object of the File class
        File inputFile = new File("hello.txt");

        // 2. Create a scanner object
        // ALWAYS PASS A FILE OBJECT TO SCANNER
        // NOT A FILE OBJECT
        Scanner in = new Scanner(inputFile);

        // can use various Scanner methods
        // // next()
        // // nextLine()
        // // hasNextLine()
        // // hasNext()
        // // nextDouble()
        // // nextInt()

        // 3. loop through file contents and process lines
        while (in.hasNextLine()) {
            String line = in.nextLine();
            System.out.println(line);
        }

        // 4. When finished processing the file you must close the file!!!
        //    as text may not be saved until you do!!!!
        in.close();
    }

    public void writeToFile() throws FileNotFoundException {

        // 1. Create a PrintWriter object
        PrintWriter out = new PrintWriter("sample.txt");

        // write some stuff with out method
        out.println("Hello, World!");
        out.println("Welcome to COMP2522");
        out.println("Happy Friday!");

        // close the file
        out.close();

        // read the file back in
        File inputFile = new File("smaple.txt");
        Scanner in = new Scanner(inputFile);

        // READ LINE BY LINE
        System.out.println("Reading line by line");
        while (in.hasNextLine()) {
            String line = in.nextLine();
            System.out.println(line);
        }

        // READ WORD BY WORD
        System.out.println("Reading word by word");
        in = new Scanner(inputFile);
        while (in.hasNext()) {
            // space delimited reading
            String word =  in.next();
            System.out.println(word);
        }

        // READ CHAR BY CHAR
        System.out.println("Reading character by character");
        in = new Scanner(inputFile);
        in.useDelimiter("");

        while (in.hasNext()) {
            String word = in.next();
            System.out.println(word);
        }

        // READ USING REGEX
        System.out.println("Reading by regex");
        in = new Scanner(inputFile);
        in.useDelimiter(("[^(A-Za-z)!]+"));

        while (in.hasNext()) {
            String word = in.next();
            System.out.println(word);
        }
    }

}
