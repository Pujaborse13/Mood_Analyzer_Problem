package org.example;

import org.junit.jupiter.api.Test;

import static junit.framework.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class MoodAnalyserTest {

    @Test
    void givenNullMood_ShouldThrowMoodAnalysisException() {
        MoodAnalyser moodAnalyser = new MoodAnalyser(null);


        MoodAnalysisException exception = assertThrows(MoodAnalysisException.class, moodAnalyser::analyseMood);
        assertEquals("Mood is null", exception.getMessage());
        assertEquals(ErrorType.NULL_MOOD, exception.getErrorType());
    }

    @Test
    void givenEmptyMood_ShouldThrowMoodAnalysisException() {

        MoodAnalyser moodAnalyser = new MoodAnalyser("");

        MoodAnalysisException exception = assertThrows(MoodAnalysisException.class, moodAnalyser::analyseMood);
        assertEquals("Mood is empty", exception.getMessage());
        assertEquals(ErrorType.EMPTY_MOOD, exception.getErrorType());
    }


    @Test
    void givenNoMessageInDefaultConstructor_ShouldReturnHappy() throws MoodAnalysisException {
        MoodAnalyser moodAnalyser = new MoodAnalyser("I am In Sad Mood");

        String result = moodAnalyser.analyseMood();
        assertEquals("Happy", result);
    }

    @Test
    void givenNullMessage_ShouldReturnHappy() throws MoodAnalysisException {
        MoodAnalyser moodAnalyser = new MoodAnalyser(null);


        String result = moodAnalyser.analyseMood();
        assertEquals("Happy", result);

    }

       @Test
        void givenSadMessageConstructor_ShouldReturnSad() throws MoodAnalysisException {
            MoodAnalyser moodAnalyser = new MoodAnalyser("I am In Sad Mood");

            String result = moodAnalyser.analyseMood();
            assertEquals("sad", result);

        }


    @Test
    void givenHappyMessageConstructor_ShouldReturnHappy() throws MoodAnalysisException {
        MoodAnalyser moodAnalyser = new MoodAnalyser("I am In Happy Mood");

        String result = moodAnalyser.analyseMood();
        assertEquals("Happy", result);

    }


}



