package ejercicio_3;



public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pila<String> pilaTest = new Pila<String>();
		pilaTest.push("pimer dato");
		pilaTest.push("segundo dato");
		pilaTest.push("tercer dato");
		pilaTest.push("cuarto dato");
		pilaTest.reverse();
		System.out.println(pilaTest);
	}

}
