//program to test the LongestCommonSubSequence class
import java.util.ArrayList;
import java.util.Random;

public class LCSTest
{
	public static void main(String[] args)
	{
		String[] protein = {"A","C","G","T"};
		int protn;

		//create Random object
		Random randomNumber = new Random();

		//create arraylists
		ArrayList<String> strand1 = new ArrayList<String>();
		ArrayList<String> strand2 = new ArrayList<String>();

		//initialising ArrayLists
		for(int i = 0; i < 20; i++)
		{
			//generate random protein and add it to strand1
			protn = randomNumber.nextInt(4);
			strand1.add(protein[protn]);

			//generate random protein and add it to strand2
			protn = randomNumber.nextInt(4);
			strand2.add(protein[protn]);

		}//end ArrayList initialisation loop

		//print generated arraylists
		System.out.print("Strand1 = {");
		for(String item : strand1)
			System.out.printf(" %s,", item);
		System.out.println("}");

		System.out.print("Strand2 = {");
		for(String item : strand2)
			System.out.printf(" %s,", item);
		System.out.println("}\n");

		//create object of LongestCommonSubSequence class
		LongestCommonSubSequence check = new LongestCommonSubSequence();

		//call method LCS of class LongestCommonSubSequence
		check.LCS(strand1, strand2);
	}
}