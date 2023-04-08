package com.example.a2lab.Vilius;



public class WordCounter {
    public static String getWordsCount(String inputString) {
        if (inputString != null) {
        String text = inputString.replace("\n", " ");
        String[] textArray = text.split(" ");
        return String.valueOf(textArray.length);
        }
        return "0";
    }
}