package main.sample.Model;

import java.util.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;



public class ReadFile {

    protected File MainPath;
    public ArrayList<File> SubFilesPath;
    public HashMap<String, String> Docs;
    public StringBuilder stb;


    public void ReadFile(String path) throws IOException {
        this.MainPath= new File(path);
        Docs = new HashMap<String, String>();
        SubFilesPath = new ArrayList<File>();
        if(MainPath.isDirectory() && MainPath != null) {
            ProccessSubFilesDirectories(MainPath);
        }
    }


    public void ProccessSubFilesDirectories(File path) throws IOException {
        File [] SubDirectories = path.listFiles();
        for(int i=0 ;i<SubDirectories.length;i++){
            if (SubDirectories[i].isFile() && SubDirectories[i] != null){
                SubFilesPath.add(SubDirectories[i].getAbsoluteFile());
            }
            else if(SubDirectories[i] != null && SubDirectories[i].isDirectory()){
                ProccessSubFilesDirectories(SubDirectories[i]);
            }
        }
        ProccessSubFilesToDocs(SubFilesPath);
    }

    public HashMap<String, String> ProccessSubFilesToDocs(ArrayList<File> subdirectory) throws IOException {
        for (int i = 0; i < subdirectory.size(); i++) {
            File f = new File(subdirectory.get(i).getAbsolutePath());
            try (BufferedReader bfr = new BufferedReader(new FileReader(f))) {
                stb = new StringBuilder();
                String line = bfr.readLine();
                while (line != null) {
                    stb.append(line);
                    line = bfr.readLine();
                }
                String content = stb.toString();
                String DocID;
                String DocText;
               // Docs.put(DocID,DocText);
            }
        }
        return Docs;
    }

}
