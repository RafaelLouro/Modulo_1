public class Desafio3 {
    public static void main(String[] args) {
        calculaNotaSegundaProva(100, 70);
        calculaNotaSegundaProva(80, 75);
        calculaNotaSegundaProva(1, 50);

    }

    private static void calculaNotaSegundaProva(final int notaPrimeiraProva, final int media) {
        int resultado = (media * 2) - notaPrimeiraProva;

        System.out.println(resultado);
    }
}
