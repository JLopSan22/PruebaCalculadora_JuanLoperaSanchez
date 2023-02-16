/**
 * @author Juan Simón
 * @version 1.0
 */

public class Calculadora {
    /**
     * Esta clase contiene los metodos del programa calculadora
     */

    /**
     * Metodo constructor por defecto
     */
    public Calculadora(){}

    /**
     * Metodo para sumar dos numeros
     * @param num1 Primer numero a sumar
     * @param num2 Segundo numero a sumar
     * @return Devuelve la suma del primer y segundo numero
     */
    public int suma(int num1,int num2){
        return num1+num2;
    }

    /**
     * Metodo para restar dos numeros
     * @param num1 Primer numero a restar (minuendo)
     * @param num2 Segundo numero a restar (sustraendo)
     * @return Devuelve la resta del primer y segundo numero
     */
    public int resta(int num1,int num2){
        return num1-num2;
    }

    /**
     * Metodo para multiplicar dos numeros
     * @param num1 Primer numero a multiplicar
     * @param num2 Segundo numero a multiplicar
     * @return Devuelve la multiplicacion del primer y segundo numero
     */
    public int multiplica(int num1,int num2){
        return num1*num2;
    }

    /**
     * Metodo para dividir dos números
     * @param num1 Primer numero a dividir (dividendo)
     * @param num2 Segundo numero a dividir (divisor)
     * @return Devuelve la division del primer y segundo numero
     */
    public int divide(int num1,int num2){
        if (num2==0) throw new ArithmeticException("NO PUEDES DIVIDIR POR CERO, MELON");
        return num1/num2;
    }

	private int valor1;
	private int valor2;
}
