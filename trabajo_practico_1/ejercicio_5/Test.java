package ejercicio_5;

import ejercicio_1.Node;
import ejercicio_4.LinkedList;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> lista1 = new LinkedList<String>();
		lista1.insertFront("test1");
		lista1.insertFront("testeo 2");
		lista1.insertFront("testeo 3");
		lista1.insertFront("testeo 4");
		for(int i:lista1) {
			System.out.println(i);
		}
	}

}
