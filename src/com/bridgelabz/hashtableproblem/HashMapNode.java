package com.bridgelabz.hashtableproblem;

public class HashMapNode<K,V> implements INode<K> 
{
	K key;
	V value;
	HashMapNode<K,V> next;
	HashMapNode(K key,V value)
	{
		this.key=key;
		this.value=value;
		next=null;
	}
	
	@Override
	public K getKey() 
	{
		return key;
	}

	@Override
	public void setKey(K key) 
	{
		this.key=key;	
	}

	@Override
	public INode getNext() 
	{
		return next;
	}

	@Override
	public void setNext(INode next) 
	{
		this.next=(HashMapNode<K, V>) next;
		
	}
	
	public V getValue() 
	{
		return value;
	}
	
	public void setValue(V value) 
	{
		this.value=value;
	}
	
	@Override
	public String toString() 
	{
		StringBuilder myNodeString = new StringBuilder();
		myNodeString.append("myMapNode{" + "K = ").append(key).append(" , V = ").append(value).append("}");
		if(next!=null) 
			myNodeString.append("->").append(next);
		return myNodeString.toString();
	}

}