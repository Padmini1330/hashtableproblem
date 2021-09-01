package com.bridgelabz.hashtableproblem;

public class HashMap<K,V> 
{
	LinkedList<K> myLinkedList;
	public HashMap() 
	{
		this.myLinkedList = new LinkedList<>();
	}
	 public V get(K key) 
	 {
		 HashMapNode<K,V> node = (HashMapNode<K, V>) this.myLinkedList.find(key);
		 return (node==null)?null:node.getValue();
	 }
	 public void add(K key,V value) 
	 {
		 HashMapNode<K, V> node = (HashMapNode<K, V>) this.myLinkedList.find(key);
		 if(node == null) 
		 {
			 node = new HashMapNode<>(key,value);
			 this.myLinkedList.append(node);
		 }
		 else
			 node.setValue(value);
	 }
	 @Override
	 public String toString() 
	 {
		 return "MyHashMapNodes{"+myLinkedList+'}';
	 }
}


