import junit.framework.TestCase;

public class TestCalculadora extends TestCase {
	private Calculadora calculadora;
	
	public void escenario() {
		calculadora =new Calculadora();
	}
	public void testsumar () {
		escenario();
		assertTrue(calculadora.sumar(2, 2)==(2+2));
		
	}
	public void testrestar () {
		escenario();
	    assertEquals(3, calculadora.restar(5, 2));
		
	}
	public void testmultiplicar () {
		escenario();
		assertTrue(calculadora.multiplicar(2, 2)==4);
		
	}
	public void testdividir () {
		escenario();
		assertTrue(calculadora.dividir(2, 2)==(2/2));
		
	}
} 


