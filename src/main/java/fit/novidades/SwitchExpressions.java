package fit.novidades;

public class SwitchExpressions {
    private static final String SEGUNDA = "segunda";
    private static final String TERCA = "terca";
    private static final String QUARTA = "quarta";

    public static void executar(String diaSemana) {
        int numDiasSemana = switch(diaSemana) {
            case SEGUNDA -> 1;
            case TERCA -> 2;
            case QUARTA -> 3;
            default -> -1;
        };

        int numDiasSemanaIfs = -1;
        if (diaSemana == SEGUNDA) numDiasSemanaIfs = 1;
        if (diaSemana == TERCA) numDiasSemanaIfs = 2;
        if (diaSemana == QUARTA) numDiasSemanaIfs = 3;

        int numDiasSemanaTernario = 
            diaSemana == SEGUNDA 
                ? 1 
                : diaSemana == TERCA 
                    ? 2 
                    : diaSemana == QUARTA 
                        ? 3 
                        : -1;

        System.out.println(numDiasSemana);
        System.out.println(numDiasSemanaIfs);
        System.out.println(numDiasSemanaTernario);
    }
}
