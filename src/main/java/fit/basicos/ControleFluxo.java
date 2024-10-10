package fit.basicos;

public class ControleFluxo {
    public static void executar(int numero) {
        boolean ehPar = ((numero % 2) == 0);
        String texto = "";
        if (ehPar) {
            switch(numero) {
                case (2):
                    System.out.println("dois");
                    texto = "dois";
                    break;
                case (3):
                    System.out.println("tres");
                    texto = "tres";
                    break;
                case (8):
                    System.out.println("oito");
                    texto = "oito";
                    break;
                default:
                    System.out.println("padrao");
                    texto = "padrao";
                    break;
            }
        }

        for(int i = 0; i < texto.length(); i++) {
            System.out.println(texto.charAt(i));
        }
    }
}
