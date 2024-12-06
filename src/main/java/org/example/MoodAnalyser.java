package org.example;

public class MoodAnalyser
{
    private String message;


        public String analyseMood(String message)

        {
            if(message.toLowerCase().contains("any"))
            {

                return "Happy";
            }

            if(message.toLowerCase().contains("sad"))
            {

                return "sad";
            }

            if(message.toLowerCase().contains("happy"))
            {

                return "Happy";
            }

            return "Happy";


    }
}
