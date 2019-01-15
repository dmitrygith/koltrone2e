package com.reloadbet.testData;

import java.security.SecureRandom;
import java.text.DecimalFormat;
import java.util.Calendar;
import java.util.Random;

public class RandomData {
    private static final String ALPHABET = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final SecureRandom RANDOM = new SecureRandom();

    public static String dataRandom(int count) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < count; ++i) {
            sb.append(ALPHABET.charAt(RANDOM.nextInt(ALPHABET.length())));
        }
        return sb.toString();


    }

    public static String phoneRandom() {

        Random rand = new Random();
        int num1 = (rand.nextInt(7) + 1) * 100 + (rand.nextInt(8) * 10) + rand.nextInt(8);
        int num2 = rand.nextInt(743);
        int num3 = rand.nextInt(10000);

        DecimalFormat df3 = new DecimalFormat("000");
        DecimalFormat df4 = new DecimalFormat("0000");

        String phoneNumber = df3.format(num1) + "-" + df3.format(num2) + "-" + df4.format(num3);

        return phoneNumber;
    }

    public static String dObRandom() {

        int yyyy = random(1920, 2000);
        int mm = random(1, 12);
        int dd = 0; // will set it later depending on year and month

        switch (mm) {
            case 2:
                if (isLeapYear(yyyy)) {
                    dd = random(1, 29);
                } else {
                    dd = random(1, 28);
                }
                break;

            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                dd = random(1, 31);
                break;

            default:
                dd = random(1, 30);
                break;
        }

        String year = Integer.toString(yyyy);
        String month = Integer.toString(mm);
        String day = Integer.toString(dd);

        if (mm < 10) {
            month = "0" + mm;
        }

        if (dd < 10) {
            day = "0" + dd;
        }

        return day + month + year;
    }

    public static int random(int lowerBound, int upperBound) {
        return (lowerBound + (int) Math.round(Math.random()
                * (upperBound - lowerBound)));
    }

    public static boolean isLeapYear(int year) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.YEAR, year);
        int noOfDays = calendar.getActualMaximum(Calendar.DAY_OF_YEAR);

        if (noOfDays > 365) {
            return true;
        }

        return false;
    }
    public String postCode = "123456test";
    public String passwordNewAcc = "Admin123";
}


