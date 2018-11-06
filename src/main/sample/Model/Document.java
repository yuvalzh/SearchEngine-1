package main.sample.Model;

public class Document {

    public String DocNum;
    public String DocDirectory;
    public String DocDate;
    public String DocTitle;
    public String Text;

    public void Document(){}

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
}
