package org.example;

public class MoodAnalyser
{
    private String message;


        public String analyseMood(String message)

        {
            if(message.toLowerCase().contains("sad"))
            {

                return "Sad";
            }

            else {
                return "happy";
            }
    }
}
