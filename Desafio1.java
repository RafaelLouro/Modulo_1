public class Desafio1 {
    public static void main(String[] args) {
        calculaNumeroViagens(10, 20);
        calculaNumeroViagens(12, 55);
        calculaNumeroViagens(100, 87);
    }

    private static void calculaNumeroViagens(final int capacidade, final int numeroAlunos) {
        int capacidadeAlunos = capacidade -1;
        int resultado = numeroAlunos/capacidadeAlunos;

        if(numeroAlunos % capacidadeAlunos > 0)
            resultado++;

        System.out.println(resultado);
    }
}
