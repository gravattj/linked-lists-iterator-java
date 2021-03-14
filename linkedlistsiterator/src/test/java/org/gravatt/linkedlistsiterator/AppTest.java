package org.gravatt.linkedlistsiterator;

import static org.junit.Assert.*;

import java.util.Iterator;
import java.util.LinkedList;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {

	@Test
	public void proveIt() {
		LinkedListsIterator lli = new LinkedListsIterator();
		LinkedList<Node> list1 = new LinkedList<Node>();
		LinkedList<Node> list2 = new LinkedList<Node>();
		LinkedList<Node> list3 = new LinkedList<Node>();
		LinkedList<Node> list4 = new LinkedList<Node>();

		list1.add(new Node("maple", new MyObject()));
		list1.add(new Node("oak", new MyObject()));

		list2.add(new Node("cherry", new MyObject()));
		list2.add(new Node("elm", new MyObject()));
		list2.add(new Node("hickory", new MyObject()));

		list3.add(new Node("pine", new MyObject()));
		list3.add(new Node("walnut", new MyObject()));

		list4.add(new Node("aspen", new MyObject()));
		list4.add(new Node("birch", new MyObject()));
		list4.add(new Node("cedar", new MyObject()));
		list4.add(new Node("cypress", new MyObject()));

		lli.add(list1);
		lli.add(list2);
		lli.add(list3);
		lli.add(list4);

		String[] expectedOrder = { "aspen", "birch", "cedar", "cherry", "cypress", "elm", "hickory", "maple", "oak",
				"pine", "walnut" };

		int counter = 0;
		
		Iterator<Node> iterator = lli.iterator();
		while (iterator.hasNext()) {
			Node node = iterator.next();
			assertEquals(node.id, expectedOrder[counter]);
			counter++;
		}
	}
}
