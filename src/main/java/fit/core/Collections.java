package fit.core;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Collections {
    public static void executar() {
        System.out.println("arrays simples ...");
        String[] names = { "Emilio", "Murta" };
        System.out.println(names);

        System.out.println("Array list");
        List<String> namesList = new ArrayList<>() {{
            add("Emilio");
            add("Murta");
        }};
        namesList.add("Novo");
        System.out.println(namesList);

        List<Integer> numeros = List.of(1,2,3);

        Map<String, String> registro = new LinkedHashMap() {{
            put("chave-1", "1");
            put("chave-2", "2");
        }};
        System.out.println(registro);

        Map<String, String> registros2 = Map.of("chave-1", "1", "chave-2", "2");
        System.out.println(registros2);
    }
}
