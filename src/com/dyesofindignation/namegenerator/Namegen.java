package com.dyesofindignation.namegenerator;

import com.sun.deploy.util.StringUtils;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Namegen
{
	public static String namegen(Class context, int... args) { // (context, [max_number_of_syllables])
        List<String> syls = new ArrayList<>();
        String name;
        Random gen;
        int maxSyls = args.length>0 ? args[0] : 5;
        int syllableQuant;
        try {
            BufferedReader reader = null;
            reader = new BufferedReader(new FileReader(context.getClassLoader().getResource("syllables.dat").getFile()));

            name = "";
            gen = new Random();
            syllableQuant = Math.abs(gen.nextInt() % maxSyls);

            while (reader.ready()) {
                syls.add(reader.readLine());
            }
            reader.close();
        } catch (Exception e) {
            System.out.print(e.toString());
            return null;
        }
        for (int i = 0; i < syllableQuant+1; i++)
            name += syls.get(Math.abs(gen.nextInt() % syls.size()));
        return name;
    }
}