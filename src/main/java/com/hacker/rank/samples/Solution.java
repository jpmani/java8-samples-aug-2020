package com.hacker.rank.samples;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) throws IOException {
        //BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        //int n = Integer.parseInt(bufferedReader.readLine().trim());

        //String[] arTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");
    	
    	int n = 9;
    	String[] arTemp = {"10", "20", "20", "10", "10", "30", "50", "10", "20"};
        List<Integer> ar = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int arItem = Integer.parseInt(arTemp[i]);
            ar.add(arItem);
        }

        int result = Result.sockMerchant(n, ar);
        System.out.println("result:"+result);

        //bufferedWriter.write(String.valueOf(result));
        //bufferedWriter.newLine();

        //bufferedReader.close();
        //bufferedWriter.close();
    }
}
