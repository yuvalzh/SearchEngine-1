package main.sample.Model;

public class DictionaryDetailes {

    public String Name;
    public int NumOfDocsTermIN;
    public int NumOfTermInCorpus;
    public int Pointer;

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getNumOfDocsTermIN() {
        return NumOfDocsTermIN;
    }

    public void setNumOfDocsTermIN(int numOfDocsTermIN) {
        NumOfDocsTermIN = numOfDocsTermIN;
    }

    public int getNumOfTermInCorpus() {
        return NumOfTermInCorpus;
    }

    public void setNumOfTermInCorpus(int numOfTermInCorpus) {
        NumOfTermInCorpus = numOfTermInCorpus;
    }

    public int getPointer() {
        return Pointer;
    }

    public void setPointer(int pointer) {
        Pointer = pointer;
    }
}
