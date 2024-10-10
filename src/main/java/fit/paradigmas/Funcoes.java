package fit.paradigmas;

import java.util.function.Consumer;

public class Funcoes {
    private static void logger(String text) {
        System.out.println(text);
    }

    private static Consumer<String> loggerBuilder(String prefixo) {
        return str -> {
            System.out.println();
            System.out.printf("%s %s", prefixo, str);
        };
    }

    public static void executar() {
        System.out.println("programacao funcional ...");
        logger("sem novidades ...");
        loggerBuilder("-").accept("com novidades ...");
        Consumer<String> loggerCustom = loggerBuilder("**");
        loggerCustom.accept("1");
        loggerCustom.accept("2");
    }
}
