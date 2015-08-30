package com.dyesofindignation.namegenerator;

import java.io.*;
import java.util.Random;

public class Namegen
{
	public static String namegen(Class context)
	{
        try {
            BufferedReader reader = null;
            reader = new BufferedReader(new FileReader(context.getClassLoader().getResource("syllables.dat").getFile()));

            String name = "";
            Random gen = new Random();
            int syllableQuant = gen.nextInt(5) + 1;
            int syllableTot = 0;

            while (reader.ready()) {
                reader.readLine();
                syllableTot++;
            }

            reader.close();
            reader = new BufferedReader(new FileReader(context.getClassLoader().getResource("syllables.dat").getFile()));

            for (int n = 0; n < syllableQuant; n++) {
                int syllableChooser = gen.nextInt(syllableTot) + 1;
                String syllable = new String();

                for (int counter = 0; counter < syllableChooser; counter++) {
                    syllable = reader.readLine();
                }

                name += syllable;
            }

            reader.close();
            return name;
        } catch (Exception e) {
            return e.toString();
        }
	}
}