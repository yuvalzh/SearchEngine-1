package main.sample.Model;

import java.io.IOException;
import java.util.HashMap;

public class SearchEngine {
    String CorpusPath;
    String StopWordsPath;
    boolean StemmerNeeded;
    public HashMap<String, String> Docs;



    public SearchEngine(String corpusPath, String stopWordsPath , boolean Steemer) throws IOException {
        CorpusPath = corpusPath;
        StopWordsPath = stopWordsPath;
        StemmerNeeded = Steemer;
        ReadFile readFile = new ReadFile();
        readFile.ReadFile(CorpusPath);
        Parse parse = new Parse(readFile.Docs,StemmerNeeded,StopWordsPath);
    }

}
