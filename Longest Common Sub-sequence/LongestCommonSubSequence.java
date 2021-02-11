//A simple program to demonstrate Longest Common Sub-sequence algorithm
import java.util.ArrayList;

public class LongestCommonSubSequence
{
	//method to find LCS btw two arrays a and b
	public int LCS(ArrayList<String> a, ArrayList<String> b)
	{
		//initialize array indexes
		int i = 0;
		int j = 0;

		int numberOfMatches = 0;

		ArrayList<String> longestSubSequence = new ArrayList<String>();

		//add "0" to the end of each array
		a.add("0");
		b.add("0");

		//while loop to compare array elements
		while(true)
		{
			if(a.get(i) == "0" || b.get(j) == "0") //if either array element is "0" 
			{
				//print generated longestSubSequence arraylists
				System.out.printf("Number of matches found = %d\n",
					numberOfMatches);
				System.out.print("Longest Common SubSequence = {");
				for(String item : longestSubSequence)
					System.out.printf(" %s,", item);
				System.out.println("}\n");

				return 0;
			}

			else if(a.get(i) == b.get(j)) //if both array elements are the same
			{
				System.out.printf("Match Found: strand1[%d] & strand2[%d]\n",
					i,j);

				numberOfMatches += 1;
				longestSubSequence.add(a.get(i));

				i++;
				j++;

				continue;
			}

			else //if both array elements are not the same
			{
				if(i <= j)
					i++;
				else
					j++;
			}
		}//end while looop
	}//end methodLCS
}//end class LongestCommonSubSequence