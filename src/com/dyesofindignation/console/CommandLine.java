package com.dyesofindignation.console;


import com.dyesofindignation.pack.Session;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Lord Ratte on 2015/03/19.
 */
public class CommandLine {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in ));
        Session session = new Session();
        System.out.print("FreePG\n=========\ntype \"close\" to exit.");
        String sIn = "";
        while (!sIn.equals("close")) {
            System.out.print("\n>>");
            sIn = br.readLine();
            System.out.print(session.query(sIn));
        }
    }
}
