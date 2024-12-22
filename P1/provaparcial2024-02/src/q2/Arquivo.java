/**
 * Raony Togneri Gomes
 */

package q2;

public class Arquivo extends ItemSistemaArquivos {
    int size;

    public Arquivo(Pasta pai, String nome, int size) {
        super(pai, nome);
        this.size = size;
    }

    @Override
    public int tamanhoEmBytes() {
        return this.size;
    }

    @Override
    public String toString() {
        String toReturn = "/" + this.getPai().toString();
        toReturn += this.getNome();
        

        return toReturn;
    }

    
}
