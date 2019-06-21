package com.joeszaf;

public class Main {

    private static final String INVALID_VALUE_MESSAGE = "Invalid value";

    public static void main(String[] args) {
        System.out.println(getDurationString(75,59));
        System.out.println(getDurationString(-1,-1));
        System.out.println(getDurationString(20,60));
        System.out.println(getDurationString(50000));
        System.out.println(getDurationString(-542));
    }

    public static String getDurationString(int minutes, int seconds) {
        if (minutes < 0 || seconds < 0 || seconds > 59) {
            return INVALID_VALUE_MESSAGE;
        }
        int hours = minutes / 60;
        int remainingMinutes = minutes % 60;

        if (remainingMinutes < 10) {
            if (seconds < 10) {
                return String.format("%dh 0%dm 0%ds", hours, remainingMinutes, seconds);
            } else {
                return String.format("%dh 0%dm %ds", hours, remainingMinutes, seconds);
            }
        } else {
            if (seconds < 10) {
                return String.format("%dh %dm 0%ds", hours, remainingMinutes, seconds);
            } else {
                return String.format("%dh %dm %ds", hours, remainingMinutes, seconds);
            }
        }

    }

    public static String getDurationString(int seconds) {
        if (seconds < 0) {
            return INVALID_VALUE_MESSAGE;
        }
        int minutes = seconds / 60;
        int remainingSeconds = seconds % 60;
        return getDurationString(minutes, remainingSeconds);
    }
}
