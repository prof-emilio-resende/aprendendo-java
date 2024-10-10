package fit;

import fit.basicos.ControleFluxo;
import fit.basicos.Operadores;
import fit.core.Collections;
import fit.novidades.SwitchExpressions;
import fit.paradigmas.Funcoes;
import fit.paradigmas.Streams;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        Variaveis.executar();
        ControleFluxo.executar(2);
        ControleFluxo.executar(9);
        ControleFluxo.executar(10);
        Operadores.executar();

        Collections.executar();

        Funcoes.executar();

        Streams.executar();

        SwitchExpressions.executar("segunda");
        SwitchExpressions.executar("sexta");
    }
}
