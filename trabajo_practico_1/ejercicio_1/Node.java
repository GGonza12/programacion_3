package ejercicio_1;

public class Node<T> {

	private T info;
	private Node<T> next;

	public Node() {
		this.info = null;
		this.next = null;
	}
	
	public Node(T info, Node<T> next) {
		this.setInfo(info);
		this.setNext(next);
	}
	
	public Node<T> getNext() {
		return next;
	}

	public void setNext(Node<T> next) {
		this.next = next;
	}

	public T getInfo() {
		return info;
	}

	public void setInfo(T info) {
		this.info = info;
	}

	@Override
	public String toString() {
		return "Node [info=" + info + "]";
	}

	public boolean equals(Object obj) {
		
		//System.out.println(node.getInfo());
		//System.out.println(this.getInfo());
		return this.info==obj;
	}
	
	
}
