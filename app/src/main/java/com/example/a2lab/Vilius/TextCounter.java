package com.example.a2lab.Vilius;

public class TextCounter {
    public static String getCharsCount(String inputString) {
        if (inputString != null) {
            return String.valueOf(inputString.length());
        }
        return "0";
    }
}