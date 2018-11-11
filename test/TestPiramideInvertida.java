import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestPiramideInvertida {
    @Test
    void testIniciales() {
        Assertions.assertEquals("",PiramideInvertida.cadenaPiramideInvertida(0),"Con un cero la cadena debe ser la cadena vacía\"\"");
        Assertions.assertEquals("",PiramideInvertida.cadenaPiramideInvertida(-5),"Con un negativo la cadena debe ser la cadena vacía\"\"");
        Assertions.assertEquals("*",PiramideInvertida.cadenaPiramideInvertida(1),"Con un 1 la cadena debe ser *");

    }
}
