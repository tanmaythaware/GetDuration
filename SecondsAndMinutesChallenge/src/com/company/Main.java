package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(getDurationString(7350));
    }

    public static String getDurationString(int minutes, int seconds){
        if((minutes >= 0) && (seconds >= 0 && seconds <= 59)){
            int hours = minutes / 60;
            int remainingMinutes = minutes % 60;
            String hoursTwoDigit = hours + "h";
            if(hours < 10){
                hoursTwoDigit = "0" + hoursTwoDigit;
            }

            String minsTwoDigit = remainingMinutes + "m";
            if(remainingMinutes < 10){
                minsTwoDigit = "0" + minsTwoDigit;
            }

            String secondsTwoDigit = seconds + "s";
            if(seconds < 10){
                secondsTwoDigit = "0" + secondsTwoDigit;
            }

            String result = hoursTwoDigit + " " + minsTwoDigit + " " + secondsTwoDigit;
            return result;
        } else {
            return "Invalid Value";
        }
    }

    public static String getDurationString(int seconds){
        if(seconds >= 0){
            int minutes = seconds / 60;
            int remainingSeconds = seconds % 60;
            return getDurationString(minutes, remainingSeconds);
        } else {
            return "Invalid Value";
        }
    }

}
