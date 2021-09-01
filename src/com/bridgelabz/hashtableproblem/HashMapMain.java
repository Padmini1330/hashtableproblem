package com.bridgelabz.hashtableproblem;

public class HashMapMain 
{

	public static void main(String[] args) 
	{
		
		String sentence = "Paranoids are not paranoid because they are paranoid but because they keep putting themselves deliberately into paranoid avoidable situations";
		LinkedHashMap<String, Integer> myLinkedHashMap = new LinkedHashMap<>();
		String[] words = sentence.toLowerCase().split(" ");
		
		for(String word : words) 
		{
			Integer value = myLinkedHashMap.get(word);
			if(value == null)
				value = 1;
			else 
				value = value+1;
			myLinkedHashMap.add(word, value);
		}
		System.out.println(myLinkedHashMap);
		
		for (String word:words) 
		{
			int frequency = myLinkedHashMap.get(word);
			System.out.println("Frequency of word *"+word+"* : "+frequency);
		}
	}

}

