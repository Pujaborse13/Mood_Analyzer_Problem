package org.example;

import org.junit.jupiter.api.Test;

import static junit.framework.Assert.assertEquals;

public class MoodAnalyserTest {




    @Test
    void givenNoMessageInDefaultConstructor_ShouldReturnHappy() {
        MoodAnalyser moodAnalyser = new MoodAnalyser("I am In Sad Mood");

        String result = moodAnalyser.analyseMood();
        assertEquals("Happy", result);
    }

    @Test
    void givenNullMessage_ShouldReturnHappy() {
        MoodAnalyser moodAnalyser = new MoodAnalyser();

        String result = moodAnalyser.analyseMood();
        assertEquals("Happy", result);

    }

       @Test
        void givenSadMessageConstructor_ShouldReturnSad() {
            MoodAnalyser moodAnalyser = new MoodAnalyser("I am In Sad Mood");

            String result = moodAnalyser.analyseMood();
            assertEquals("sad", result);

        }


}



