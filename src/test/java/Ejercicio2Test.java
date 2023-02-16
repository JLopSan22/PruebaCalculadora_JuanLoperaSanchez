import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Ejercicio2Test {
    @Test
    void ej1() {
        System.out.println("Casos de prueba del ejercicio 1 ");
        assertEquals(4,Ejercicio2.ej1(1,0,0));
        assertEquals(4,Ejercicio2.ej1(1,5,0));
        assertEquals(4,Ejercicio2.ej1(2,6,2));
        assertEquals(6,Ejercicio2.ej1(2,6,1));
    }

    @Test
    void ej2() {
        System.out.println("Casos de prueba del ejercicio 2 ");
        assertEquals(6,Ejercicio2.ej2(2,0,0));
        assertEquals(6,Ejercicio2.ej2(1,6,0));
        assertEquals(6,Ejercicio2.ej2(1,5,1));
        assertEquals(4,Ejercicio2.ej2(1,5,3));
    }

    @Test
    void ej5() {
        System.out.println("Casos de prueba del ejercicio 5 ");
        assertEquals(10,Ejercicio2.ej5(10,10));
        assertEquals(5,Ejercicio2.ej5(10,5));
        assertEquals(2,Ejercicio2.ej5(4,10));
    }

    @Test
    void ej6() {
        System.out.println("Casos de prueba del ejercicio 6 ");
        assertEquals(-1,Ejercicio2.ej6(0,9,2));
        assertEquals(0,Ejercicio2.ej6(5,6,9));
        assertEquals(-1,Ejercicio2.ej6(6,5,3));
        assertEquals(1,Ejercicio2.ej6(3,3,5));

    }

    @Test
    void ej8() {
        System.out.println("Casos de prueba del ejercicio 8 ");
        assertEquals(2,Ejercicio2.ej8(1,1));
        assertEquals(0,Ejercicio2.ej8(0,1));
    }
}
