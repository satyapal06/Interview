package com.interview.hackerrank.week.one;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class PlusMinus {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());
        plusMinus(arr);
        bufferedReader.close();
    }

    public static void plusMinus(List<Integer> arr) {
        Integer countOfPositive = Math.toIntExact(arr.stream().filter(i -> i > 0).count());
        Integer countOfNegative = Math.toIntExact(arr.stream().filter(i -> i < 0).count());
        Integer countOfZero = Math.toIntExact(arr.stream().filter(i -> i == 0).count());
        Integer n = arr.size();
        System.out.printf("%6f%n", (double) countOfPositive / (double) n);
        System.out.printf("%6f%n", (double) countOfNegative / (double) n);
        System.out.printf("%6f%n", (double) countOfZero / (double) n);
    }
}
