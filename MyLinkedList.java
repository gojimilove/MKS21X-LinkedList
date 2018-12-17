class Node {
	private Integer data;
	private Node next,prev;

	public Node(Integer x) {
		data = x;
		next = null;
		prev = null;
	}
	public Node next() {
		return next;
	}
	public Node prev() {
		return prev;
	}
	public void setNext(Node other) {
		next = other;
	}
	public void setPrev(Node other) {
		prev = other;
	}
	public Integer getData() {
		return data;
	}
	public Integer setData(Integer i) {
		data = i;
		return data;
	}
	public String toString() {
		String result = "";
		result+= getData();
		return result;
	}

}

public class MyLinkedList {
	private int length;
	private Node start,end;

	public MyLinkedList() {
		//empty list
		length = 0;
	}

	public boolean add(Integer value) {
		//System.out.println("Length before: "+length);
		if (length == 0) { //list is empty, make a new node start and end both point to
			start = new Node(value);
			end = start;
		}
		else { //start and end both point to something
			Node n = new Node(value);
			//current last value now points to new node, vice versa
			end.setNext(n);
			n.setPrev(end);
			//new node is now the end
			end = n;
		}
		length++;
		return true;
	}

	public int size() {
		return length;
	}

	private Node getNode(int index) {
		Node current = start;
		//go through linked list until either you reach the end or you reach the index, then return that node
		while(current.getData() != null && index > 0) {
			current = current.next();
			index--;
		}
		return current;
	}

	public Integer get(int index) {
		//get node at index
		Node n = getNode(index);
		//get data from that node
		return n.getData();
	}

	public Integer set(int index, Integer value) {
		//get node at index
		Node n = getNode(index);
		Integer x = n.getData();
		//set data for that index as value, return old value
		n.setData(value);
		return x;
	}

	public boolean contains(Integer value) {
		//go through list, if it's not in it return false
		Node current = start;
		while(current != null) {
			if (current.getData().equals(value)) {
				return true; //if value matches then return true
			}
			current = current.next();
		}
		return false;
	}

	public int indexOf(Integer value) {
		//return -1 if value does not exist
		if (!contains(value)) {
			return -1;
		}
		int i = 0;
		Node current = start;
		//loop through until you find the value, then stop and return the index
		while(current != null && !current.getData().equals(value)) {
			current = current.next();
			i++;
		}
		return i;
	}

	public void add(int index, Integer value) {
		Node before = getNode(index - 1);
		Node after = getNode(index);
		Node n = new Node(value);
		before.setNext(n);
		n.setPrev(before);
		n.setNext(after);
		after.setPrev(n);
		length++;
	}

	public Integer remove(int index) {
		return 0;
	}

	public boolean remove(Integer value) {
		return true;
	}

	public String toString() {
		String result = "[";
		Node current = start;
		while (current != null) {
			result += current.getData();
			if (current.next() != null) {
				result += ", ";
			}
			current = current.next();
		}
		result += "]";
		return result;
	}

}