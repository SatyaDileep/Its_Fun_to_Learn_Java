package com.java.practice.java8;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by satyat on 12/07/16.
 */
public class ReadingFiles {

    public static void main(String[] args) throws IOException{
        ReadingFiles readingFiles = new ReadingFiles();
        readingFiles.readFiles();
    }

    public void readFiles() throws IOException{
        List<String> fileContent = new ArrayList<>();
        try(BufferedReader bufferedReader = new BufferedReader(new FileReader("/Users/satyat/Desktop/CSV/Report_For_AutoComplete_Tasks.csv"))){
            bufferedReader.lines().forEach(s -> {
                fileContent.addAll(Arrays.asList(s.split(",")));
            });
        }
        catch (FileNotFoundException fileNotFound){
            System.out.println(fileNotFound);
        }
        finally {
            System.out.println(fileContent);
        }
    }
}
