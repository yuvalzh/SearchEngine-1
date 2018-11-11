package main.sample.Model;

public class Term {

    String Name;

    public Term(String name, int firstTimeInDoc, int wordCounter, String docID) {
        Name = name;
        FirstTimeInDoc = firstTimeInDoc;
        WordCounter = wordCounter;
        DocID = docID;
    }

    private int FirstTimeInDoc;
    private int WordCounter;
    String DocID;


}
