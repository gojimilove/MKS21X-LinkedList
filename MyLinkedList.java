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
		if (length == 0) { //neither start nor end have a real value yet
			start = new Node(value);
			end = start;
		}
		else { //both start and end have values, must add new one after end
			Node n = new Node(value);
			end.setNext(n);
			n.setPrev(end);
			end = n;
		}
		length++;
		return true;
	}

	public int size() {
		return length;
	}

	private Node getNode(int index) {
		int i = 0;
		Node current = start.next();
		while(current.getData() != null && i <= index) {
			current = current.next();
			i++;
		}
		return current;
	}

	public Integer get(int index) {
		return 0;
	}

	public Integer set(int index, Integer value) {
		return 0;
	}

	public boolean contains(Integer value) {
		return true;
	}

	public int indexOf(Integer value) {
		return 0;
	}

	public void add(int index, Integer value) {

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
			//System.out.println("CURRENT: "+current.getData());
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