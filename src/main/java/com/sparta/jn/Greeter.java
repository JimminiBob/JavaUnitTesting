package com.sparta.jn;

public class Greeter {
    static String getGreeting(int timeOfDay) {
        String message;
        if (timeOfDay >= 5 && timeOfDay <= 12) {
            message = "Good Morning";
        } else if (timeOfDay >= 12 && timeOfDay <= 12) {
            message = "Good afternoon";
        } else {
            message = "Good evening";
        }
        return message;
    }
}
