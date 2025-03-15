package utilidades;

public class CoresTerminal {
    public static final String RESET = "\u001B[0m";   // Reseta a cor
    public static final String VERMELHO = "\u001B[31m";
    public static final String VERDE = "\u001B[32m";
    public static final String AMARELO = "\u001B[33m";
    public static final String AZUL = "\u001B[34m";
    public static final String ROXO = "\u001B[35m";
    public static final String CIANO = "\u001B[36m";
    public static final String BRANCO = "\u001B[37m";

    // Cor personalizada (ANSI 256)
    public static String cor256(int codigo) {
        return "\u001B[38;5;" + codigo + "m";
    }

    // Cor personalizada com RGB
    public static String corRGB(int r, int g, int b) {
        return "\u001B[38;2;" + r + ";" + g + ";" + b + "m";
    }
}
