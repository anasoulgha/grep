package es.etg.dam.grep;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

public class Grep {

    private static final String PALABRA = "psp";

    private static final String TEXTO_1 = "Me gusta psp y java";
    private static final String TEXTO_2 = "psp se programa en java";
    private static final String TEXTO_3 = "es un módulo de DAM";
    private static final String TEXTO_4 = "y se programa de forma concurrente en psp";
    private static final String TEXTO_5 = "psp es programación.";
    public static void main(String[] args) throws IOException {

        Process p = Runtime.getRuntime().exec("grep "+PALABRA);
        OutputStream out = p.getOutputStream();
        PrintWriter pw = new PrintWriter(new OutputStreamWriter(out));
        pw.println(TEXTO_1);
        pw.println(TEXTO_2);
        pw.println(TEXTO_3);
        pw.println(TEXTO_4);
        pw.println(TEXTO_5);
        pw.close();

        BufferedReader br = new BufferedReader(new InputStreamReader(p.getInputStream()));
        String linea;
        while ((linea = br.readLine()) != null) {
            System.out.println(linea);
        }
        br.close();

    }
}
