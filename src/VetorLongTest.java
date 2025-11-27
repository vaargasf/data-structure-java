public class VetorLongTest {

    private static final int TAMANHO = 1000;

    //Tempo de execução: 6546ms
    public static void main(String[] args) {
        long[] array = new long[TAMANHO];

        long startTime = System.currentTimeMillis();

        for (int i = 0; i < TAMANHO; i++) {
            for (int j = 0; j < TAMANHO; j++) {
                array[i] += j;
            }
        }

        long endTime = System.currentTimeMillis();

        System.out.println("Tempo de execucao " + (endTime - startTime) + "ms");
    }
}
