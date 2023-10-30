package com.mmkarami.linkedlist.impl.singly;

import com.mmkarami.linkedlist.adt.LinkedList;

public class SinglyLinkedList<E> implements LinkedList<E> {

	private Node<E> head;

	private Node<E> tail;

	private int size;

	public SinglyLinkedList() {
		this.size = 0;
		this.head = null;
		this.tail = null;
	}

	public SinglyLinkedList(Node<E> head, Node<E> tail, int size) {
		this.head = head;
		this.tail = tail;
		this.size = size;
	}

	public Node<E> get(int index) {
		if (isEmpty())
			throw new ArrayIndexOutOfBoundsException(index);
		Node<E> cursorNode = head().next();
		for (int i = 0; i < size(); i++) {
			if (i == index)
				return cursorNode;
			cursorNode = cursorNode.next();
		}
		throw new ArrayIndexOutOfBoundsException(index);
	}

	public void addFirst(E value) {
		Node<E> newNode = new Node<E>(value, null);
		if (isEmpty()) {
			this.head = new Node<E>(null, newNode);
			this.tail = new Node<E>(null, newNode);
		} else {
			newNode.setNext(head().next());
			head().setNext(newNode);
		}
		size++;
	}

	public void addLast(E value) {
		Node<E> newNode = new Node<E>(value, null);
		if (isEmpty()) {
			this.head = new Node<E>(null, newNode);
			this.tail = new Node<E>(null, newNode);
		} else {
			tail().next().setNext(newNode);
			tail.setNext(newNode);
		}
		size++;
	}

	public void removeFirst() {
		if (isEmpty()) {
			throw new ArrayIndexOutOfBoundsException();
		}
		if (size() == 1) {
			this.head = null;
			this.tail = null;
			this.size--;
		} else {
			head.setNext(head().next().next());
			this.size--;
		}
	}

	public void removeLast() {
		if (isEmpty()) {
			throw new ArrayIndexOutOfBoundsException();
		}
		if (size() == 1) {
			this.head = null;
			this.tail = null;
			this.size--;
		} else {
			Node<E> newLastNode = get(this.size - 2);
			tail.setNext(newLastNode);
			this.size--;
		}
	}

	public Node<E> head() {
		return this.head;
	}

	public Node<E> tail() {
		return this.tail;
	}

	public int size() {
		return this.size;
	}

	public boolean isEmpty() {
		return size() == 0;
	}
}