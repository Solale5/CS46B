package linked;

import java.util.*;


public class CharLinkedList 
{
	private CharNode		head;	// Empty if head and
	private CharNode		tail;	// tail are null
	
	
	public CharLinkedList()		{ }
	
	
	public CharLinkedList(String s)
	{
		for (int i=s.length()-1; i>=0; i--)
			insertAtHead(s.charAt(i));
	}
	/**
	 * 
	 * @param ch takes a char that is the data of the node we are looking for
	 * @return returns that node
	 */
	public CharNode find(char ch)
	{
		//stores head as variable
		CharNode increment = head;
		boolean done = false;
		
		while(!done)
		{
			//if increment is null returns null
			if(increment == null)
			{
				return null;
			}
			//if the increments data is what we are looking for returns increment and sets done to true
			else if(increment.getData() == ch)
			{
				done = true;
				return increment;
			}
			else
			{
				// goes to next node in the linked list (increments)
				increment = increment.getNext();
			}
			
		}
		return increment;
			
	}
	
	public void duplicate(char ch)
	{
		//if ch is not part of the linked list throws error message
		String err = new String("Error:"+ ch + " " + "is not in this linked list ");
		IllegalArgumentException chError = new IllegalArgumentException(err);
		// uses find method from earlier to check if ch is in the linked list
		if(find(ch)==null)
		{
			throw chError;
		}
		
		//case for if we are duplicating the last in the list or a list of one
		CharNode found = find(ch);
		if(found.getNext() == null)
		{
			CharNode duplicate = new CharNode(found.getData());
			found.setNext(duplicate);
			tail = duplicate;
		}
		else
		{
		//vanilla case
		CharNode duplicate = new CharNode(found.getData());
		CharNode afterFound = found.getNext();
		found.setNext(duplicate);
		duplicate.setNext(afterFound);
		}
	}
	
	public void insertAtHead(char ch)
	{
		assert hasIntegrity();		// Precondition
		
		CharNode node = new CharNode(ch);
		node.setNext(head);
		head = node;
		if (tail == null)
			tail = node;			// Corner case: inserting into empty node
		
		assert hasIntegrity();		// Postcondition
	}
	
	
	public String toString()
	{
		String s = "";
		CharNode node = head;
		while (node != null)
		{
			s += node.getData();
			node = node.getNext();
		}
		return s;
	}
	
	
	//
	// Returns true if this list has emptiness integrity, has tail integrity, has no loops,  
	// and tail is reachable from head.
	//
	// Caution: this checks for most but not all common integrity problems. 
	//
	boolean hasIntegrity()
	{
		// Check emptiness. If either head or tail is null, the other must
		// also be null. Different logic from what you saw in lecture. Returns
		// immediately if this list is empty.
		if (head == null  ||  tail == null)
			return head == null  &&  tail == null;
		
		// Check tail integrity (tail.next must be null).
		if (tail.getNext() != null)
			return false;
		
		// Check for loops.
		Set<CharNode> visitedNodes = new HashSet<>();
		CharNode node = head;
		while (node != null)
		{
			if (visitedNodes.contains(node))
				return false;		// Current node has been visited before, we must have a loop
			visitedNodes.add(node); // First visit to this node
			node = node.getNext();
		}
		
		// Make sure tail is reachable from head.
		node = head;
		while (node != null && node != tail)
			node = node.getNext();
		return node == tail;
	}
}
