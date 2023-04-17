package ejercicio_1;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MySimpleLinkedList<String> lista1 = new MySimpleLinkedList<String>();
		lista1.insertFront("test1");
		lista1.insertFront("testeo 2");
		lista1.insertFront("testeo 3");
		lista1.insertFront("testeo 4");
		System.out.println(lista1.get(2));
		System.out.println(lista1.size());
		System.out.println(lista1);
		System.out.println(lista1.extractFront());
		System.out.println(lista1.get(0));
		System.out.println(lista1.size());
		System.out.println(lista1);
		
		
	}

}
