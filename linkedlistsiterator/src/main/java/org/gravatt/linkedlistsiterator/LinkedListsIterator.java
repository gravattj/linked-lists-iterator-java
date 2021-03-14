/**
 * 
 */
package org.gravatt.linkedlistsiterator;

import java.util.LinkedList;
import java.util.Iterator;
import java.util.TreeMap;
import java.util.Collection;

/**
 * @author gravattj
 *
 */
public class LinkedListsIterator implements Iterable<Node> {

	private TreeMap<String, Node> tmap = new TreeMap<String, Node>();
	
	public LinkedListsIterator() {
		
	}

    @Override
    public Iterator<Node> iterator() {
		Collection<Node> collection = tmap.values();
		return collection.iterator();	
    }
    
	public void add(LinkedList<Node> list) {
		
		Iterator<Node> iterator = list.iterator();
		while (iterator.hasNext()) {
			Node node = iterator.next();
			tmap.put(node.id, node);
		}	
	}
}

