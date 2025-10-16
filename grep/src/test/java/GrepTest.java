import static org.junit.jupiter.api.Assertions.assertEquals;

import es.etg.dam.grep.*;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.Test;

public class GrepTest {

    @Test
    public void testSalidaGrep() throws Exception {

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outContent));

        Grep.main(new String[] {});

        System.setOut(originalOut);

        String salida = outContent.toString();

        String salidaEsperada = "Me gusta psp y java\n" +
                "psp se programa en java\n" +
                "y se programa de forma concurrente en psp\n" +
                "psp es programación.\n";

        assertEquals(salidaEsperada, salida);
    }
}
