package ejercicio_3;

import ejercicio_1.MySimpleLinkedList;

public class Pila<T> {
	private MySimpleLinkedList<T> lista;
	public Pila() {
		lista = new MySimpleLinkedList<>();
	}
	public void push(T info) {
		this.lista.insertFront(info);
	}
	public T pop (){
		return lista.extractFront();
	
		
	}
	public T top() {
		return lista.get(0);
	}
	
	public void reverse() {
		MySimpleLinkedList<T> auxList = new MySimpleLinkedList<>();
		int tamano= this.lista.size();
		for(int i=0;i<tamano;i++) {
			auxList.insertFront(lista.extractFront());
		}
		lista = auxList;
	}
	@Override
	public String toString() {
		return "Pila [lista=" + lista + "]";
	}
	
	
	
}
