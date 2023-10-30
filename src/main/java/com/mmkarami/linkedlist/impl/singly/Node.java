package com.mmkarami.linkedlist.impl.singly;

public class Node<E> {

	private E value;
	
	private Node<E> next;

	public Node(E value, Node<E> next) {
		this.value = value;
		this.next = next;
	}

	public E value() {
		return value;
	}

	public void setValue(E value) {
		this.value = value;
	}

	public Node<E> next() {
		return next;
	}

	public void setNext(Node<E> next) {
		this.next = next;
	}
}