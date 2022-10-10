package week3.day3;

import java.util.*;

public class RemoveDuplicate {

	public static void main(String[] args) {
		String companyName = "google";
				
		char[] name = companyName.toCharArray();
		Set<Character> name1 = new LinkedHashSet<Character>();
		for (int i = 0; i < name.length; i++) {
			name1.add(name[i]);
		}
		System.out.println(name1);
			
			//declaring input
			String text = "we learn java basics as part of java sessions in java week1";

			//Split the words and sorting in array
			String[] strArray = text.split(" ");
			
			List<String> repeatwords= new ArrayList<String>();
		
			LinkedHashSet<String> unique = new LinkedHashSet<String>();
		
			//finding the repeated words
			for(String str:strArray)
			{
				if(!unique.add(str))
				{
					repeatwords.add(str);
				}
			}
			
			//Printing the repeated words
			//System.out.println(repeatwords);
			
			//Printing the unique set without deuplicates
			System.out.println(unique);
       }
       }
