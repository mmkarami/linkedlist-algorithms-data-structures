package com.mmkarami.linkedlist.adt;

import com.mmkarami.linkedlist.impl.singly.Node;

public interface LinkedList<E> {
	
	Node<E> get(int index);

	void addFirst(E value);

	void addLast(E value);

	void removeFirst();

	void removeLast();

	Node<E> head();

	Node<E> tail();

	int size();
	
	boolean isEmpty();
}