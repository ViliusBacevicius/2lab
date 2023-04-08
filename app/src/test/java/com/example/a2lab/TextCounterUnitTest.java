package com.example.a2lab;

import org.junit.Test;

import static org.junit.Assert.*;

import com.example.a2lab.Vilius.TextCounter;
import com.example.a2lab.Vilius.WordCounter;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class TextCounterUnitTest {
    @Test
    public void getCharsCount_WhenEmptyString_ResultZero() {

        String givenValue = "";
        String expected = "0";
        String actual = TextCounter.getCharsCount(givenValue);
        assertEquals(expected, actual);
    }

    @Test
    public void getCharsCount_WhenNullString_ResultZero() {

        String givenValue = null;
        String expected = "0";
        String actual = TextCounter.getCharsCount(givenValue);
        assertEquals(expected, actual);
    }

    @Test
    public void getCharsCount_WhenFiveCharsString_ResultFive() {

        String givenValue = "12345";
        String expected = "5";
        String actual = TextCounter.getCharsCount(givenValue);
        assertEquals(expected, actual);
    }

    @Test
    public void getWordsCount_WhenNullString_ResultZero() {

        String givenValue = null;
        String expected = "0";
        String actual = WordCounter.getWordsCount(givenValue);
        assertEquals(expected, actual);
    }
    @Test
    public void getWordsCount_WhenSixWordsString_ResultSix() {

        String givenValue = "one two three four five six";
        String expected = "6";
        String actual = WordCounter.getWordsCount(givenValue);
        assertEquals(expected, actual);
}

    @Test
    public void getWordsCount_WhenSpacesString_Resultzero() {

        String givenValue = "                          ";
        String expected = "0";
        String actual = WordCounter.getWordsCount(givenValue);
        assertEquals(expected, actual);
    }

    @Test
    public void getWordsCount_WhenSymbolsString_Resultone() {

        String givenValue = "!@@!$#@%#$^$%&^%*(&^(^*&%E";
        String expected = "1";
        String actual = WordCounter.getWordsCount(givenValue);
        assertEquals(expected, actual);
    }
}