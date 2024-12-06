package org.example;

public class MoodAnalysisException extends Exception
{
    private ErrorType errorType;

    public MoodAnalysisException(ErrorType errorType,String message) {
        super(message);
        this.errorType = errorType;
    }

    public ErrorType getErrorType() {
        return errorType;
    }

}
