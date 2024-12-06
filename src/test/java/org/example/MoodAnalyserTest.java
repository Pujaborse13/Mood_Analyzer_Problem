package org.example;

import org.junit.jupiter.api.Test;

import static junit.framework.Assert.assertEquals;

public class MoodAnalyserTest {

    @Test
    void givenNoMessageInDefaultConstructor_ShouldReturnHappy() throws MoodAnalyserException {
        MoodAnalyser moodAnalyser = new MoodAnalyser("I am In Sad Mood");

        String result = moodAnalyser.analyseMood();
        assertEquals("Happy", result);
    }

    @Test
    void givenNullMessage_ShouldReturnHappy() throws MoodAnalyserException {
        MoodAnalyser moodAnalyser = new MoodAnalyser(null);


        String result = moodAnalyser.analyseMood();
        assertEquals("Happy", result);

    }

       @Test
        void givenSadMessageConstructor_ShouldReturnSad() throws MoodAnalyserException {
            MoodAnalyser moodAnalyser = new MoodAnalyser("I am In Sad Mood");

            String result = moodAnalyser.analyseMood();
            assertEquals("sad", result);

        }


    @Test
    void givenHappyMessageConstructor_ShouldReturnHappy() throws MoodAnalyserException {
        MoodAnalyser moodAnalyser = new MoodAnalyser("I am In Happy Mood");

        String result = moodAnalyser.analyseMood();
        assertEquals("Happy", result);

    }


}



