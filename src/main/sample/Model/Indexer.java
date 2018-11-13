package main.sample.Model;

import java.util.ArrayList;
import java.util.HashMap;

public class Indexer {

    public HashMap<String,String> Posting;
    public static HashMap <String,String> Cache;
    public static HashMap<String, String> Dictionary;
    //public HashMap <String, Pair<Integer, Pair <String, Integer>>> docs;



    public Indexer(){
      Posting = new HashMap<>();
      Cache = new HashMap<>();
      Dictionary = new HashMap<>();
    }


    public void CreateIndexer(HashMap<String,Term> CorpusAfterParse){



    }
}
