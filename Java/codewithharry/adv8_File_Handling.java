package com.company.codewithharry;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class adv8_File_Handling {
    public static void main(String[] args) {
        // code to create a new file
        /*
        File myFile = new File("Alok.txt");
        try {
            myFile.createNewFile();
        } catch (IOException e) {
            System.out.println("Unable to create this file");
            e.printStackTrace();
        }
         */

        // code to write to a file
        /*
        try {
            FileWriter fileWriter = new FileWriter("Alok.txt");
            fileWriter.write("This iis our first file from the java language.\n ok now bye");
            fileWriter.close();
        } catch (IOException e) {
            System.out.println("Unable to write");
            e.printStackTrace();
        }
         */

        // reading a file
        /*
        File myFile = new File("Alok.txt");
        try {
            Scanner sc = new Scanner(myFile);
            while (sc.hasNextLine()){
                String line = sc.nextLine();
                System.out.println(line);
            }
            sc.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
         */

        // deleting a file
        File myFile = new File("Alok.txt");
        if(myFile.delete()){
            System.out.println("I have deleted: " + myFile.getName());
        }
        else{
            System.out.println("Some problem occurred while deleting the file");
        }

    }
}
