package fit.paradigmas;

import java.util.ArrayList;
import java.util.List;

public class Streams {
    public static void executar() {
        System.out.println("Streams ...");

        System.out.println("Iterando de forma imperativa!");
        // 1 criar a lista com 3 elementos (texto)
        List<String> lista = new ArrayList<>();
        lista.add("NoMe");
        lista.add("TELEFONE");
        lista.add("email");
        
        // 2 iterar pela lista
        for (String string : lista) {
            // 3 para cada elemento eu vou aplicar caixa alta
            var nString = string.toUpperCase();
            // 4 imprimir o elemento em caixa alta
            System.out.println(nString);
        }

        System.out.println("Iterando de forma declarativa");
        List.of("NoMe", "TELEFONE", "email")
            .stream()
            .map(e -> e.toUpperCase())
            .forEach(System.out::println);
    }
}
