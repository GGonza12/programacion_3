package ejercicio_1;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node<String> n1 = new Node<String>();
		Node<String> n2 = new Node<String>();
		Node<String> n3 = new Node<String>();
		Node<String> n4 = new Node<String>();
		n1.setInfo("testeo1");
		n2.setInfo("testeo 2");
		n3.setInfo("testeo 3");
		n4.setInfo("testeo 4");
		MySimpleLinkedList<Node<String>> lista1 = new MySimpleLinkedList<Node<String>>();
		lista1.insertFront(n1);
		lista1.insertFront(n2);
		lista1.insertFront(n3);
		lista1.insertFront(n4);
		System.out.println(lista1.get(2));
		System.out.println(lista1.size());
		System.out.println(lista1.extractFront());
		System.out.println(lista1.get(0));
		System.out.println(lista1.size());
		
		
		
	}

}
