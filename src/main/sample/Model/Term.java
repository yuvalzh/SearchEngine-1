package main.sample.Model;

public class Term {

    public String Name;
    public String DocID;
    public int FirstTimeInDoc;
    public int NumberOfTimesInDoc;


    public Term(String name, int firstTimeInDoc, String docID) {
        Name = name;
        FirstTimeInDoc = firstTimeInDoc;
        NumberOfTimesInDoc = 0;
        DocID = docID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getDocID() {
        return DocID;
    }

    public void setDocID(String docID) {
        DocID = docID;
    }

    public int getFirstTimeInDoc() {
        return FirstTimeInDoc;
    }

    public void setFirstTimeInDoc(int firstTimeInDoc) {
        FirstTimeInDoc = firstTimeInDoc;
    }

    public int getNumberOfTimesInDoc() {
        return NumberOfTimesInDoc;
    }

    public void setNumberOfTimesInDoc(int numberOfTimesInDoc) {
        NumberOfTimesInDoc = numberOfTimesInDoc;
    }
}
