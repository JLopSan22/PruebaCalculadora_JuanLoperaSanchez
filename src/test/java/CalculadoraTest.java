import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculadoraTest {
    Calculadora calculate = new Calculadora();
    @BeforeAll
    static void setUpBeforeClass() throws Exception {
        System.out.println("---Inicio de las pruebas---");
    }
    @AfterAll
    static void tearDownAfterClass() throws Exception {
        System.out.println("---Final de las pruebas---");
    }
    @Test
    void testCalculadora() {
        System.out.println("Casos de prueba de todos los métodos");
        assertEquals(8, calculate.suma(3, 5));
        assertEquals(-2, calculate.resta(3, 5));
        assertEquals(15, calculate.multiplica(3, 5));
        assertEquals(3, calculate.divide(15, 5));
    }
    @Test
    void testSuma() {System.out.println("Casos de prueba del método suma");
        assertEquals(2,calculate.suma(1,1));
        assertNotEquals(3,calculate.suma(1,1));
    }
    @Test
    public void testDivision() {
        System.out.println("Casos de prueba del método división");
        try {
            assertEquals(0, calculate.divide(15, 0));
        } catch ( Exception e) {
            System.out.println("División por 0 producida");
        }
    }

    @Test
    void testResta() {
        System.out.println("Casos de prueba del método resta");
        int[] numeros1 = new int[11];
        int[] numeros2 = new int[11];
        for (int i=0; i<=10; i++){
            numeros1[i]=(int)(Math.random()*10);
            numeros2[i]=(int)(Math.random()*10);
        }
        for (int i=0; i<=10; i++){
            assertEquals(numeros1[i]-numeros2[i],calculate.resta(numeros1[i],numeros2[i]));
        }
    }

    @Test
    void testMultiplicacion() {
        System.out.println("Casos de prueba del método multiplicación");
        int[] numeros1 = new int[11];
        int[] numeros2 = new int[11];
        for (int i=0; i<=10; i++){
            numeros1[i]=(int)(Math.random()*10);
            numeros2[i]=(int)(Math.random()*10);
        }
        for (int i=0; i<=10; i++){
            assertEquals(numeros1[i]*numeros2[i],calculate.multiplica(numeros1[i],numeros2[i]));
        }
    }
}