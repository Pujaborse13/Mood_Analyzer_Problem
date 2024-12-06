package org.example;

import org.junit.jupiter.api.Test;

import static junit.framework.Assert.assertEquals;

public class MoodAnalyserTest {

    @Test
    void givenInAnyMood_ShouldReturnHappy()
    {
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        String msg = "I am in any Mood";
        assertEquals("Happy", moodAnalyser.analyseMood(msg));

    }


}