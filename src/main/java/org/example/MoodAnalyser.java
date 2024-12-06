package org.example;

public class MoodAnalyser
{
    private String message;


    public MoodAnalyser() {
        message = "happy";

            }


    public MoodAnalyser(String message) {
        this.message = message;
                }


    public String analyseMood() throws MoodAnalysisException {
        try {
            if (message == null) {
                throw new MoodAnalysisException(ErrorType.NULL_MOOD, "Mood is null");
            }
            if (message.isEmpty()) {
                throw new MoodAnalysisException(ErrorType.EMPTY_MOOD, "Mood is empty");
            }

            if (message.toLowerCase().contains("sad")) {
                return "sad";
            }


            if (message.toLowerCase().contains("happy")) {
                return "happy";

            }
        } catch (NullPointerException e) {
            throw new MoodAnalysisException(ErrorType.NULL_MOOD, "Mood CanNot be null");


        }
        return "happy";
    }

    public static void main(String[] a) throws MoodAnalysisException {

        MoodAnalyser ma = new MoodAnalyser();
        System.out.println(ma.analyseMood());

        }

    }
