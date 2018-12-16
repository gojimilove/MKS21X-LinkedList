public class Node {
	private Integer data;
	private Node next,prev;

	public Node(Integer x) {
		data = x;
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
		//start and end are both null, point to each other, (empty list) and length = 0
		start = new Node(null);
		end = new Node(null);
		start.setPrev() = null;
		start.setNext() = end;
		end.setPrev() = start;
		end.setNext() = null;
		length = 0;
	}

	public boolean add(Integer value) {
		if (length == 0) { //neither start nor end have a real value yet
			start.setData(value);
		}
		if (length == 1) { //start has value but not end
			end.setData(value);
		}
		else { //both start and end have values, must add new one after end
			Node before = end.prev();
			Node oldEnd = new Node(end.getData())
			end.setData(value);
			before.setNext() = oldEnd;
			end.setPrev() = oldEnd;
			oldEnd.setPrev() = before;
			oldEnd.setNext() = end;
		}
		length++;
		return true;
	}

	public int size() {
		return length;
	}
	public Integer get(int index) {

	}
	public Integer set(int index, Integer value) {

	}
	public boolean contains(Integer value) {

	}
	public int indexOf(Integer value) {

	}
	public void add(int index, Integer value) {

	}
	public Integer remove(int index) {

	}
	public boolean remove(Integer value) {

	}
	public String toString() {
		String result = "[";

	}

}