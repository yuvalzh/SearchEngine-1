package main.sample.Model;

public class SearchEngine {
    String CorpusPath;
    String StopWordsPath;

    public SearchEngine(String corpusPath, String stopWordsPath) {
        CorpusPath = corpusPath;
        StopWordsPath = stopWordsPath;


        ReadFile readFile = new ReadFile();

        Parse parse = new Parse()
    }

}
