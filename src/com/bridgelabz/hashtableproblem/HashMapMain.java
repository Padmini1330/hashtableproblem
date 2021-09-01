package com.bridgelabz.hashtableproblem;

public class HashMapMain 
{

	public static void main(String[] args) 
	{
		String sentence= "To be or not to be";
		HashMap<String, Integer> myHashMap = new HashMap<String, Integer>();
		String [] words = sentence.toLowerCase().split(" ");
		for(String word:words) 
		{
			Integer value = myHashMap.get(word);
			if(value==null) 
				value=1;
			else 
				value=value+1;
			myHashMap.add(word, value);
		}
		System.out.println("The Frequency of Word *to* is "+myHashMap.get("to"));
		System.out.println("The Frequency of Word *be* is "+myHashMap.get("be"));
		System.out.println("The Frequency of Word *or* is "+myHashMap.get("or"));
		System.out.println("The Frequency of Word *not* is "+myHashMap.get("not"));
		System.out.println(myHashMap);

	}


}

