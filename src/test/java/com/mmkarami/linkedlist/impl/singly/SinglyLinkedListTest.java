package com.mmkarami.linkedlist.impl.singly;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.mmkarami.linkedlist.adt.LinkedList;

public class SinglyLinkedListTest {

	@Test
	public void testCreateLinkedListSize_whenCreateLinkedList_thenSizeMustBeZero() {

		// Arrange
		LinkedList<String> linkedList;

		// Act
		linkedList = new SinglyLinkedList<String>();

		// Assert
		assertEquals(0, linkedList.size());
		assertEquals(null, linkedList.head());
		assertEquals(null, linkedList.tail());
	}

	@Test
	public void testAddFirst_whenAddFirst_thenJustOneNodeMustBeAdded() {

		// Arrange
		var linkedList = new SinglyLinkedList<String>();

		// Act
		linkedList.addFirst("Ferrari");

		// Assert
		assertEquals(1, linkedList.size(), "The size must be 1.");
		assertEquals("Ferrari", linkedList.head().next().value(), "The value must be Ferrari.");
	}

	@Test
	public void testAddLast_whenAddLast_thenJustOneNodeMustBeAddedToLast() {

		// Arrange
		var linkedList = new SinglyLinkedList<String>();

		// Act
		linkedList.addLast("Ferrari");

		// Assert
		assertEquals(1, linkedList.size());
		assertEquals("Ferrari", linkedList.tail().next().value());
	}

	@Test
	public void testRemoveFirst_whenRemoveFirst_thenJustOneNodeMustBeRemoved() {

		// Arrange
		var linkedList = new SinglyLinkedList<String>();
		linkedList.addFirst("Ferrari");

		// Act
		linkedList.removeFirst();

		// Assert
		assertEquals(0, linkedList.size());
		assertEquals(null, linkedList.head());
		assertEquals(null, linkedList.tail());
	}

	@Test
	public void testRemoveLast_whenRemoveLast_thenJustOneNodeMustBeRemovedFromLast() {

		// Arrange
		var linkedList = new SinglyLinkedList<String>();
		linkedList.addLast("Ferrari");

		// Act
		linkedList.removeLast();

		// Assert
		assertEquals(0, linkedList.size());
		assertEquals(null, linkedList.head());
		assertEquals(null, linkedList.tail());
	}

	@Test
	public void testGetValueBySpecificIndex_whenGetValueByIndex_thenReturnCorrectValue() {

		// Arrange
		var linkedList = new SinglyLinkedList<String>();
		linkedList.addFirst("Ferrari");
		linkedList.addFirst("BMW");

		// Act
		String firstValue = linkedList.get(0).value();
		String secondValue = linkedList.get(1).value();

		// Assert
		assertEquals("BMW", firstValue);
		assertEquals("Ferrari", secondValue);
	}
}