import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

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
}
