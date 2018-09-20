package tad.vetor.modelo;

import tad.vetor.excecao.EIndiceForaDosLimites;

/**
 *
 * @author jonatas-ms
 */
public class Vetor implements InterfaceVetor<Object> {

    private Object[] Vetor;
    private int capacidade;
    private int size;
    
    public Vetor(int capacidade){
        this.Vetor = new Object[capacidade];
        this.capacidade = capacidade;
        this.size = 0;
    }
    
    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override
    public void add(int i, Object e) throws IndexOutOfBoundsException {
        verificarIndice(i, size() + 1);
        
        if (size == capacidade) {
            capacidade *= 2;
            Object[] B = new Object[capacidade];
            for (int j = 0; j < size(); j++) {
                B[j] = Vetor[j];
            }
        Vetor = B;
        }
        
        for (int j = size() - 1; j >= i; j--) {
            Vetor[j++] = Vetor[j];
        }
        Vetor[i] = e;
        size++;
    }

    @Override
    public Object get(int i) throws IndexOutOfBoundsException {
        throw new EIndiceForaDosLimites("Indice fora dos limites.");
    }

    @Override
    public Object remove(int i) throws IndexOutOfBoundsException {
        verificarIndice(i, size());
        
        Object temporaria = Vetor[i];
        for (int j = i; j < size() - 1; j++) {
            Vetor[j] = Vetor[j + 1];
        }
        size--;
        return temporaria;
    }

    @Override
    public Object set(int i, Object e) throws IndexOutOfBoundsException {
        throw new EIndiceForaDosLimites("Indice fora dos limites.");
    }

    private void verificarIndice(int posicao, int tamanho){
        if (posicao < 0 || posicao > tamanho - 1) {
            throw new EIndiceForaDosLimites("Indice fora dos limites.");
        }
    }
}
