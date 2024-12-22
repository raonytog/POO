/**
 * Raony Togneri Gomes
 */

package q2;

import java.util.LinkedHashSet;

public class Pasta extends ItemSistemaArquivos{
    private LinkedHashSet<ItemSistemaArquivos> itens = new LinkedHashSet<>();

    public Pasta() {
        super(null, null);
    }

    public Pasta(Pasta pai, String nome) {
        super(pai, nome);
    }

    @Override
    public int tamanhoEmBytes() {
        int total = 0;
        for (ItemSistemaArquivos i : this.getItems()) {
            if (i instanceof Arquivo) { total += ((Arquivo)i).tamanhoEmBytes(); }
            else { total += i.tamanhoEmBytes(); }
        }
        return total;
    }

    void adicionaItem(ItemSistemaArquivos p) {
        this.itens.add(p);
    }

    public LinkedHashSet<ItemSistemaArquivos> getItems() {
        LinkedHashSet<ItemSistemaArquivos> copy = new LinkedHashSet<>(this.itens);
        return copy;
    }

    @Override
    public String toString() {
        String toReturn = "";
        if (this.getPai() != null)
            toReturn = this.getPai().toString();

        if (this.getNome() != null)
            toReturn += "/" + this.getNome();

        return toReturn;
    }

    
    
}
