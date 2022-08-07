package com.techelevator.util;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;

public class TELog {
    public  static void log(String message) {
        //instantiate a file
        File searchFile = new File("exercise/logs/search.log");
        //try/catch block
        try(PrintWriter writer = new PrintWriter(new FileOutputStream(searchFile, true))) {
            writer.println(message);
            writer.flush();

        } catch(FileNotFoundException e) {
            throw new TELogException(e.getMessage());
        }
    }
}
