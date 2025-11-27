public class Vetor {

    private String[] elementos;
    private int tamanho;

    public Vetor(final int capacidade){
        this.elementos = new String[capacidade];
        this.tamanho = 0;
    }

    public void adicionar(final String elemento) throws Exception{
        if (tamanho < elemento.length()){
            elementos[tamanho] = elemento;
            tamanho++;
        }
        else {
            throw new Exception("Vetor ja cheio");
        }
    }
}
