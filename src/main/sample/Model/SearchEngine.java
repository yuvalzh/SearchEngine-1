package main.sample.Model;

import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;

public class SearchEngine {
    String CorpusPath;
    String StopWordsPath;
    boolean StemmerNeeded;
    public HashSet<MyDocument> Docs;



    public SearchEngine(String corpusPath, String stopWordsPath , boolean Steemer) throws IOException {
        CorpusPath = corpusPath;
        StopWordsPath = stopWordsPath;
        StemmerNeeded = Steemer;
        Docs = new HashSet<>();
        ReadFile readFile = new ReadFile();
        Docs = readFile.ReadFile(CorpusPath);
        Parse parse = new Parse(Docs,StemmerNeeded,StopWordsPath);
    }

}
