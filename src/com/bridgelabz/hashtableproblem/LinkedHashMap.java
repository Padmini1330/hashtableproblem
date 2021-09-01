package com.bridgelabz.hashtableproblem;

import java.util.ArrayList;

public class LinkedHashMap<K,V>
{
	
	private final int numberOfBuckets;
	ArrayList<LinkedList<K>> myBucketArray;
	public LinkedHashMap() 
	{
		this.numberOfBuckets=10;
		this.myBucketArray=new ArrayList<LinkedList<K>>(numberOfBuckets);
		for(int i=0;i<numberOfBuckets;i++) 
		{
			this.myBucketArray.add(null);
		}
	}
	public int getBucketIndex(K key) 
	{
		int hashcode = Math.abs(key.hashCode());
		int index= hashcode%10;
		return index;
	}
	
	public V get(K key) 
	{
		int index = this.getBucketIndex(key);
		LinkedList<K> linkedlist = this.myBucketArray.get(index);
		if(linkedlist == null) return null;
		HashMapNode<K, V> node = (HashMapNode<K, V>)linkedlist.find(key);
		return(node ==null)?null:node.getValue();	
	}
	
	public void add(K key,V value) 
	{
		int index= this.getBucketIndex(key);
		LinkedList<K> linkedlist = this.myBucketArray.get(index);
		if(linkedlist==null) 
		{
			linkedlist = new LinkedList<>();
			this.myBucketArray.set(index, linkedlist);
		}
		HashMapNode<K, V> node = (HashMapNode<K, V>) linkedlist.find(key);
		if(node ==null) 
		{
			node = new HashMapNode<>(key, value);
			linkedlist.append(node);
		}
		else
			node.setValue(value);
	}
	
	@Override
	 public String toString() 
	{
		 return "MyHashMapNodes{"+myBucketArray+'}';
	 }

}

