import java.io.*;
import java.util.Random;

public class Namegen
{
	public static String namegen() throws IOException
	{
		BufferedReader reader = null;
		reader = new BufferedReader(new FileReader("syllables.dat"));
		
		String name = new String();
		Random gen = new Random();
		int syllableQuant = gen.nextInt(5) + 1;
		int syllableTot = 0;
		
		while (reader.ready())
		{
			reader.readLine();
			syllableTot++;
		}
		
		reader.close();
		reader = new BufferedReader(new FileReader("syllables.dat"));
		
		for (int n=0; n<syllableQuant; n++)
		{
			int syllableChooser = gen.nextInt(syllableTot) + 1;
			String syllable = new String();
			
			for (int counter=0; counter<syllableChooser; counter++)
			{
				syllable = reader.readLine();
			}
			
			name += syllable;
		}
		
		reader.close();
		return name;
	}
}