package org.example;

public class MoodAnalyser {
    private String message;

    public MoodAnalyser() {
        message = "happy";

    }


    public MoodAnalyser(String message) {
        this.message = message;
    }

    public String analyseMood() {

        if (message == null || message.isEmpty()) {
            return "Happy";
        }

        if (message.toLowerCase().contains("any")) {

            return "Happy";
        }

        if (message.toLowerCase().contains("sad")) {

            return "sad";
        } else {

            return "Happy";

        }


    }



    public static void main(String a[])
    {
        MoodAnalyser ma = new MoodAnalyser();
        System.out.println(ma.analyseMood());


    }

}