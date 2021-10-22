public class Desafio2 {

    /**
     * O fatorial de 8 é 40320, de 9 é 362880. Não podemos usar o 9, pois passamos do limite de 10 elevado a quinta especificado no exercício.
     */
    private static final short LIMITE_FATORIAL = 9;

    public static void main(String[] args) {
        calculaQuantidadeFatoriais(10);
        calculaQuantidadeFatoriais(25);
    }

    private static void calculaQuantidadeFatoriais(final int valor) {
        int resultado = 0;
        int somaTotalFatoriais = 0;

        do {
            int valorAcumuladoFatorial = 1;
            int valorRestante = valor - somaTotalFatoriais;
            for (int i = 1; i < LIMITE_FATORIAL; i++) {
                int proximoValor = i * valorAcumuladoFatorial;
                if (proximoValor > valorRestante) {
                    break;
                }
                valorAcumuladoFatorial = proximoValor;
            }
            somaTotalFatoriais = somaTotalFatoriais + valorAcumuladoFatorial;
            resultado++;
        } while(somaTotalFatoriais < valor);

        System.out.println(resultado);
    }
}
