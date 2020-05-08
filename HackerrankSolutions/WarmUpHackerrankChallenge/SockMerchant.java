package com.georgypeychev;

//    John works at a clothing store. He has a large pile of socks that he must pair by color for sale. Given an array of integers representing the color of each sock, determine how many pairs of socks with matching colors there are.
//
//    For example, there are  socks with colors . There is one pair of color  and one of color . There are three odd socks left, one of each color. The number of pairs is .
//
//            Function Description
//
//    Complete the sockMerchant function in the editor below. It must return an integer representing the number of matching pairs of socks that are available.
//
//    sockMerchant has the following parameter(s):
//
//    n: the number of socks in the pile
//    ar: the colors of each sock
//    Input Format
//
//    The first line contains an integer , the number of socks represented in .
//    The second line contains  space-separated integers describing the colors  of the socks in the pile.
//
//            Constraints
//
//            where
//    Output Format
//
//    Return the total number of matching pairs of socks that John can sell.
//
//            Sample Input
//
//        9
//        10 20 20 10 10 30 50 10 20
//            Sample Output
//
//          3

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class SockMerchant {

    static int sockMerchant(int n, int[] arr) {
        int pairs = 0;

        Set<Integer> arrCheck = new HashSet<>();

        for (int i = 0; i < arr.length; i++) {
            if (!arrCheck.contains(arr[i]))
                arrCheck.add(arr[i]);
            else {
                arrCheck.remove(arr[i]);
                pairs++;
            }
        }

        return pairs;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());
        int[] arr = new int[n];

        String[] arrItems = sc.nextLine().split(" ");
        sc.close();

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        int result = sockMerchant(n, arr);
        System.out.println(result);

    }
}
