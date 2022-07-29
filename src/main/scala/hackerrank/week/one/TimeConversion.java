package com.interview.hackerrank.week.one;

import java.io.*;

public class TimeConversion {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String s = bufferedReader.readLine();
        String result = timeConversion(s);
        System.out.println("Result:: " + result);
        bufferedReader.close();
    }

    public static String timeConversion(String s) {
        String tArr[] = s.split(":");
        String AmPm = tArr[2].substring(2, 4);
        int hh, mm, ss;
        hh = Integer.parseInt(tArr[0]);
        mm = Integer.parseInt(tArr[1]);
        ss = Integer.parseInt(tArr[2].substring(0, 2));

        String checkPM = "PM", checkAM = "AM";
        int h = hh;
        if (AmPm.equals(checkAM) && hh == 12)
            h = 0;
        else if (AmPm.equals(checkPM) && hh < 12)
            h += 12;

        return String.format("%02d:%02d:%02d", h, mm, ss);
    }
}
