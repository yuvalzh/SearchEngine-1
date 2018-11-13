package main.sample.Model;

public class MyDocument {

    public String DocNum;
    public String DocDirectory;
    public String DocDate;
    public String DocTitle;
    public String Text;
    public Term MaxTF;
    public int SpecialWords;
    public String City;

    public MyDocument(String docNum, String docDirectory, String docDate, String docTitle, String text ,String city) {
        DocNum = docNum;
        DocDirectory = docDirectory;
        DocDate = docDate;
        DocTitle = docTitle;
        Text = text;
        MaxTF = null;
        SpecialWords =0;
        City = city;
    }

    public MyDocument(){};

    public String getDocNum() {
        return DocNum;
    }

    public void setDocNum(String docNum) {
        DocNum = docNum;
    }

    public String getDocDirectory() {
        return DocDirectory;
    }

    public void setDocDirectory(String docDirectory) {
        DocDirectory = docDirectory;
    }

    public String getDocDate() {
        return DocDate;
    }

    public void setDocDate(String docDate) {
        DocDate = docDate;
    }

    public String getDocTitle() {
        return DocTitle;
    }

    public void setDocTitle(String docTitle) {
        DocTitle = docTitle;
    }

    public String getText() {
        return Text;
    }

    public void setText(String text) {
        Text = text;
    }

    public Term getMaxTF() {
        return MaxTF;
    }

    public void setMaxTF(Term maxTF) {
        MaxTF = maxTF;
    }

    public int getSpecialWords() {
        return SpecialWords;
    }

    public void setSpecialWords(int specialWords) {
        SpecialWords = specialWords;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String city) {
        City = city;
    }
}
