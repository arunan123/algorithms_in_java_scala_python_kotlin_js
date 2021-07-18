package org.algorithmdb.datastructures.map;

public interface Map<K, V> {
	
	public void put(K key,V value);
	
	public V get(K key);
	
	public boolean contains(K key);
	
	public void delete(K key);
	
	public int size();
}
