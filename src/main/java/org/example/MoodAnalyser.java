package org.example;

public class MoodAnalyser
{
    private String message;


    public MoodAnalyser(String message) {
        this.message = message;
    }

    public String analyseMood() {
        if (message == null || message.isEmpty()) {
            return "Neutral";
        }

        if (message.toLowerCase().contains("happy")) {

            return "Happy";
        }

        else if (message.toLowerCase().contains("sad"))
        {
            return "Sad";
        }

        else {
            return "Neutral";
        }
    }

    public static void main(String[] args) {
        MoodAnalyser moodAnalyser1 = new MoodAnalyser("Happy Mood ");
        System.out.println("Mood: " + moodAnalyser1.analyseMood());

        MoodAnalyser moodAnalyser2 = new MoodAnalyser("Sad Mood ");
        System.out.println("Mood: " + moodAnalyser2.analyseMood());

        MoodAnalyser moodAnalyser3 = new MoodAnalyser("");
        System.out.println("Mood: " + moodAnalyser3.analyseMood());
    }
}
