import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    private static Calculadora calculadora; // Luego de refactorizar se agrega el atributo calculadora
    // REQUISITO 1
    @Test //Se Crea una prueba para el estado inicial = true de un Objeto Calculadora
    public void whenCalculatorInitializedThenReturnTrue() {
        // linea eliminada: Calculadora calculadora = new Calculadora();
        assertTrue(calculadora.getStatus());
    }
    // REQUISITO 2
    //Refactorizacion

    @BeforeAll // Se refactoriza crear un objeto calculadora en cada prueba
    public static void init() {
        calculadora = new Calculadora();
    }

    @Test
    public void whenAdditionTwoNumberThenReturnCorrectAnswer() {
        // linea eliminada: Calculadora calculadora = new Calculadora();
        assertEquals(5,calculadora.addition(2,3));

    }
    @Test //Añade la funcion de prueba de la resta
    public void whenDifferenceTwoNumberThenReturnCorrectoAnswer() {
        assertEquals(6,calculadora.differences(11,5));
    }
    // REQUISITO 3
    @Test // Agregamos metodo de prueba de la division
    public void whenDivisionThenReturnCorrectAnswer() {
        assertEquals(2,calculadora.division(8,4));
    }

    @Test // Prueba para la division entre 0
    public void whenDivisionByZeroThenThrowException() {
        Throwable exception = assertThrows(IllegalArgumentException.class,()->{calculadora.division(5,0);});
        assertEquals("No se puede dividir por cero",exception.getMessage());
    }

    // Agregando mas pruebas de la clase Calculadora
    @Test
    public void whenMultiplicationTwoNumberReturnCorrectAnswer() {
        assertEquals(24,calculadora.multiplication(6,4));
    }
    //Analogo con las dos pruebas para la division, para la raiz pero de un negativo
    @Test
    public void whenSquareRootNumberReturnCorrectAnswer() {
        assertEquals(4,calculadora.squareRoot(16));
    }

    @Test
    public void whenSquareRootWithNegativeNumber() {
        Throwable exception = assertThrows(IllegalArgumentException.class,()->{calculadora.squareRoot(-1);});
        assertEquals("No se puede sacar raiz cuadrada de un negativo",exception.getMessage());
    }
}
