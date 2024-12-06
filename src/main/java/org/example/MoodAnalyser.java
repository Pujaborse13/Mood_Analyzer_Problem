package org.example;

public class MoodAnalyser {
    private String message;

    public MoodAnalyser() {
        message = "happy";

            }


    public MoodAnalyser(String message) {
        this.message = message;
                }


    public String analyseMood() throws MoodAnalyserException {

        try {
            if (message == null || message.isEmpty()) {
                return "Happy";
            }

            if (message.toLowerCase().contains("sad")) {
                return "sad";
            }

            if (message.toLowerCase().contains("happy")) {
                return "happy";
        }
            else {
            throw new MoodAnalyserException("Invalid Mood");
             }
        }
  catch (NullPointerException e)
  {
      return "Happy";
  }
    }


    public static void main(String a[]) throws MoodAnalyserException {

        MoodAnalyser ma = new MoodAnalyser();
        System.out.println(ma.analyseMood());

    }


    }

