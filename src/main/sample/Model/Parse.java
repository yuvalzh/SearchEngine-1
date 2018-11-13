package main.sample.Model;


import java.io.*;
import java.util.*;

public class Parse {

    HashMap<String,String> Date_DataStructure;
    HashSet<String> StopWords;
    HashMap<String,Term> Terms;
    //HashSet<MyDocument> Documents;
    Stemmer stemmer;
    String StopWordsPath;
    boolean IsStemmerNeeded;
    boolean IsRegNumber;
    boolean IsPrecent;
    boolean IsAPrice;
    boolean IsADate;
    boolean IsARange;


    public Parse(HashSet<MyDocument> Docs,boolean stemmerneeded , String stopwordspath) {
        this.StopWordsPath = stopwordspath;
        this.IsStemmerNeeded=stemmerneeded;
        StopWords = new HashSet<>();
        Terms = new HashMap<>();
        Date_DataStructure = new HashMap<>();
        //Documents = new HashSet<>();
        stemmer = new Stemmer();
        InitiateDates();
        InitiateStopWords();

        Iterator<MyDocument> it = Docs.iterator();
        while (it.hasNext()) {
            ParseDoc(it.next(),IsStemmerNeeded);
            it.remove();
        }








    }




    public void ParseDoc(MyDocument doc , boolean stemmerneeded){
        ArrayList<String> DocList = new ArrayList<String>(Arrays.asList(doc.getText().split("[\\*\\ \\:\\?\\(\\)]+")));
        EliminateStopWords(DocList);


        if(stemmerneeded){
            StemmDoc(DocList);
        }





    }

    public void SuspectedAsNumber(){

    }

    public void SuspectedAsCapital(){

    }

    public void SuspectedAsPercent(){

    }

    public void SuspectedAsPrice(){

    }

    public void SuspectedAsDate(){

    }

    public void SuspectedAsRange(){

    }

    public void EliminateStopWords(ArrayList<String> Doctext){


    }

    public void StemmDoc(ArrayList<String> Doctext){



    }

    public void InitiateStopWords(){
        File f = new File(this.StopWordsPath);
        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(f))){
            String line = bufferedReader.readLine();
            while (line != null ){
                StopWords.add(line);
                line = bufferedReader.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void InitiateDates(){
        Date_DataStructure.put("JAN", "01"); Date_DataStructure.put("FEB", "02"); Date_DataStructure.put("MAR", "03"); Date_DataStructure.put("APR", "04");
        Date_DataStructure.put("MAY", "05"); Date_DataStructure.put("JUN", "06"); Date_DataStructure.put("JUL", "07"); Date_DataStructure.put("AUG", "08");
        Date_DataStructure.put("SEP", "09"); Date_DataStructure.put("OCT", "10"); Date_DataStructure.put("NOV", "11"); Date_DataStructure.put("DEC", "12");
        Date_DataStructure.put("Jan", "01"); Date_DataStructure.put("Feb", "01"); Date_DataStructure.put("Mar", "03"); Date_DataStructure.put("Apr", "04");
        Date_DataStructure.put("May", "05"); Date_DataStructure.put("Jun", "06"); Date_DataStructure.put("Jul", "07"); Date_DataStructure.put("Aug", "08");
        Date_DataStructure.put("Sep", "09"); Date_DataStructure.put("Oct", "10"); Date_DataStructure.put("Nov", "11"); Date_DataStructure.put("Dec", "12");
        Date_DataStructure.put("January", "01"); Date_DataStructure.put("February", "02"); Date_DataStructure.put("March", "03"); Date_DataStructure.put("April", "04");
        Date_DataStructure.put("June", "06"); Date_DataStructure.put("July", "07"); Date_DataStructure.put("August", "08"); Date_DataStructure.put("September", "09");
        Date_DataStructure.put("October", "10"); Date_DataStructure.put("November", "11"); Date_DataStructure.put("December", "12");
        Date_DataStructure.put("JANUARY", "01"); Date_DataStructure.put("FEBUARY", "02"); Date_DataStructure.put("MARCH", "03"); Date_DataStructure.put("APRIL", "04");
        Date_DataStructure.put("JUNE", "06"); Date_DataStructure.put("JULY", "07"); Date_DataStructure.put("AUGUST", "08"); Date_DataStructure.put("SEPTEMBER", "09");
        Date_DataStructure.put("OCTOBER", "10"); Date_DataStructure.put("NOVEMBER", "11"); Date_DataStructure.put("DECEMBER", "12");
    }
}
