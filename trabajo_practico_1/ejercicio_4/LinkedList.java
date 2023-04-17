package ejercicio_4;

import ejercicio_1.Node;

public class LinkedList<T> {
	
	private Node<T> first;
	private int size;
	
	public LinkedList() {
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
	public int indexOf(T elem) {
		boolean encontrado=false;
		Node<T> aux = this.first;	
		int pos=0;
			while((aux!=null)&&(encontrado==false)) {
				if(aux.getInfo().equals(elem)) {
					encontrado=!encontrado;
					pos--;
				}
				aux = aux.getNext();
				pos++;
				}
			if(encontrado==false) {
				pos=-1;
			}
			return pos;
		
	}
	
	@Override
	public String toString() {
		String result="";
		Node<T> aux = this.first;
		for(int i=0;i<this.size;i++) {
			result+= "["+i+"] =>"+aux.getInfo()+ "\n";
			if(aux.getNext()!=null) {
				aux=aux.getNext();
			}
		}
		return result;
	}
}
