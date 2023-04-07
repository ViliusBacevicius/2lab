package com.example.a2lab.Vilius;



public class WordCounter {
    public static String getWordsCount(String inputString) throws Exception {
        String text = inputString.replace("\n", " ");
        String[] textArray = text.split(" ");
        throw new Exception("NotImplemented!!!");
        return String.valueOf(textArray.length);
    }
}