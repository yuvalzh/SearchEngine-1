package main.sample.Model;

import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.nio.file.Files;
import java.io.BufferedReader;
import java.io.FileReader;


public class ReadFile {



    protected File MainPath;
    public ArrayList<File> SubFilesPath;
    public ArrayList<Document> Docs;
    public StringBuilder stb;


    public void ReadFile(String path) throws IOException {
        this.MainPath= new File(path);
        Docs = new ArrayList<Document>();
        SubFilesPath = new ArrayList<File>();
        stb = new StringBuilder();
        if(MainPath.isDirectory() && MainPath != null) {
            ProccessSubFilesDirectories(MainPath);
        }
    }


    public void ProccessSubFilesDirectories(File path) throws IOException {
        File [] SubDirectories = path.listFiles();
        for(int i=0 ;i<SubDirectories.length;i++){
            if (SubDirectories[i].isDirectory() && SubDirectories[i] != null){
                SubFilesPath.add(SubDirectories[i].getAbsoluteFile());
            }
        }
        ProccessSubFilesToDocs(SubFilesPath);
    }

    public void ProccessSubFilesToDocs(ArrayList<File> subdirectory) throws IOException {

        for (int i = 0; i < subdirectory.size(); i++) {
            File f = new File(subdirectory.get(i).getAbsolutePath());
            BufferedReader bfr = new BufferedReader(new FileReader(f));
            String line = bfr.readLine();
            while (line != null) {
                stb.append(line);
                line = bfr.readLine();
            }
            String content = stb.toString();
            Document d = new Document();
            d.setText(content);
        }
    }




}
