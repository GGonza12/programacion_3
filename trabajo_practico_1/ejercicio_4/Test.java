package ejercicio_4;

import ejercicio_1.Node;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node<String> n1 = new Node<String>();
		Node<String> n2 = new Node<String>();
		Node<String> n3 = new Node<String>();
		Node<String> n4 = new Node<String>();
		Node<String> nt = new Node<String>();
		n1.setInfo("testeo1");
		n2.setInfo("testeo 2");
		n3.setInfo("testeo 3");
		n4.setInfo("testeo 4");
		LinkedList<Node<String>> lista1 = new LinkedList<Node<String>>();
		lista1.insertFront(n1);
		lista1.insertFront(n2);
		lista1.insertFront(n3);
		lista1.insertFront(n4);
		nt.setInfo("testeo1");
		System.out.println(lista1.indexOf(nt));
	}

}
