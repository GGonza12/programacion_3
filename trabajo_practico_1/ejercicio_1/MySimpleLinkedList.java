package ejercicio_1;

public class MySimpleLinkedList<T> {
	
	private Node<T> first;
	private int size;
	
	public MySimpleLinkedList() {
		this.first = null;
	}
	
	public void insertFront(T info) {
		Node<T> tmp = new Node<T>(info,null);
		tmp.setNext(this.first);
		this.first = tmp;
		this.size++;
	}
	
	public T extractFront() {		
		Node<T> aux = this.first;
		this.first= this.first.getNext();
		this.size--;
		return aux.getInfo();
	}

	public boolean isEmpty() {
		if(this.first==null) {
			return false;
		}
		return true;
	}
	
	public T get(int index) {
		
		Node<T> aux = this.first;	
		int pos=0;
		while((index>pos)&&(aux.getNext()!=null)) {
			aux= aux.getNext();
			pos++;
		}
	
		return aux.getInfo();
	}
	
	public int size() {
		
		return this.size;
	}
	
	@Override
	public String toString() {
		return "MySimpleLinkedList [first=" + first + "]";
	}
}
