package main.sample.Model;


import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Parse {

    static HashMap<String,String> Date_DataStructure = new HashMap<>();
    HashSet<String> StopWords;
    HashMap<String,Term> Terms;
    Stemmer stemmer;
    String DocID;
    boolean IsStemmerNeeded;
    boolean IsRegNumber;
    boolean IsPrecent;
    boolean IsAPrice;
    boolean IsADate;
    boolean IsARange;


    public Parse(HashMap<String, String> Docs,boolean StemmerNeeded , String StopWordsPath) {
        StopWords = new HashSet<>();
        Terms = new HashMap<>();
        stemmer = new Stemmer();







    }
}
