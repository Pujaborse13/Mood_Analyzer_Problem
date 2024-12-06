package org.example;

import org.junit.jupiter.api.Test;

import static junit.framework.Assert.assertEquals;

public class MoodAnalyserTest {

    @Test
    void givenSadMessage_ShouldReturnSad()
    {


        MoodAnalyser moodAnalyser = new MoodAnalyser("sad");
        String msg = "I am In sad Mood";
        assertEquals("Sad", moodAnalyser.analyseMood(msg));

    }









}