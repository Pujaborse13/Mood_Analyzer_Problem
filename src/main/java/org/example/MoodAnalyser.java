package org.example;

public class MoodAnalyser {
    private String message;

    public MoodAnalyser() {
        message = "happy";

            }


    public MoodAnalyser(String message) {
        this.message = message;
                }


    public String analyseMood(String message) throws MoodAnalyserException {
        if (message == null || message.isEmpty()) {
            throw new MoodAnalyserException("Mood Can not be null");

        }
        if (message.toLowerCase().contains("sad")) {
            return "sad";
        }

        if (message.toLowerCase().contains("happy")) {
            return "happy";
        } else {
            throw new MoodAnalyserException("Invalid Mood");


        }
    }

    public static void main(String a[]) {

        MoodAnalyser ma = new MoodAnalyser();

        try {
            System.out.println(ma.analyseMood("786876"));


        } catch (NullPointerException | MoodAnalyserException e) {
            System.out.println("Exception : " + e.getMessage());
        }


    }
}

