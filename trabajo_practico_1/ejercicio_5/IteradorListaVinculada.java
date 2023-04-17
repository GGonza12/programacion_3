package ejercicio_5;

import java.util.Iterator;

import ejercicio_1.Node;

public class IteradorListaVinculada<T> implements Iterator<T> {
	private Node<T> cursor;

	public IteradorListaVinculada(Node<T> cursor) {
		this.cursor=cursor;
	}
	@Override
	public boolean hasNext() {
		return this.cursor!=null;
	}
	@Override
	public T next() {
		T valor = cursor.getInfo();
		cursor = cursor.getNext();
		return valor;
	}
	public T valorSiguiente() {
		T valor = cursor.getNext().getInfo();
		return valor;
	}
	
}
