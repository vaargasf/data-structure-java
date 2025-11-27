import java.util.HashMap;
public class HashMapTest {

    private static final int TAMANHO = 100000;

    public static void main(String[] args) {

        HashMap<Integer, Produto> mapa = new HashMap<>();

        for (int i = 0; i < TAMANHO; i++) {
            mapa.put(i, new Produto(i, "Produto" + i, i * 20.0));
        }

        long startTime = System.currentTimeMillis();

        for (int qtd = 0; qtd < TAMANHO; qtd++) {
            Produto p = mapa.get(qtd);

            if (p == null) {
                System.out.println("Produto nao encontrado: " + qtd);
            }
        }

        long endTime = System.currentTimeMillis();

        System.out.println("Tempo de execucao (ms): " + (endTime - startTime));
    }
}
