package com.umartariq;

import java.math.BigInteger;
import java.util.*;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;
import java.util.stream.Stream;

/**
 * Main.java created by umartariq on 06/12/2020
 * 11:14 AM inside the package - com.umartariq
 * in the java project fibonacci using IDE IntelliJ IDEA
 */
public class Main {
    private static Map<Integer, BigInteger> memo = new HashMap<>();


    public static long recFibN(final int n)
    {
        return (n < 2) ? n : recFibN(n - 1) + recFibN(n - 2);
    }


    public static BigInteger fibonacciusingmemoization(int n) {


        if( n == 0 ) {return BigInteger.ZERO;}
        if( n == 1 ) {return BigInteger.ONE;}

        if (memo.containsKey(n)) {

            return memo.get(n);
        }
        BigInteger v = fibonacciusingmemoization(n - 2).add(fibonacciusingmemoization(n - 1));
        System.out.println("Putting result in cache for "+n);
        memo.put(n, v);
        return v;
    }

    public static void printFibonacciMemoizationHashMap() {


        for (Integer name: memo.keySet()){
            String key = name.toString();
            String value = memo.get(name).toString();
            System.out.println(key + " " + value);
        }

    }

    public static void printfibonacciRecursion(int n){

        for (int i = 0; i <=n; i++) {
            System.out.println(recFibN(i));
        }
    }

    public static void main(String[] args) {
        //printfibonacciRecursion(100);

        //System.out.println(getFibonacciBigInteger(1000));
        fibonacciusingmemoization(500);
        printFibonacciMemoizationHashMap();






    }


    public static BigInteger getFibonacciBigInteger(int series) {
        return Stream.iterate(new BigInteger[]{
                BigInteger.ZERO, BigInteger.ONE}, t -> new BigInteger[]{t[1], t[0].add(t[1])})
                .limit(series)
                .map(n -> n[1]) // find, we need n[1]
                .reduce((a, b) -> b).orElse(BigInteger.ZERO);

    }



}
