
package listaligada.duplamente.modelos;

import listaligada.duplamente.modelos.no.DNodo;
import listaligada.duplamente.excecoes.*;

/**
 *
 * @author jonatas-ms
 */

/** lista duplamente ligada*/
public class LDLigada implements InterfaceLDLigada {
    
    private DNodo inicio;
    private DNodo fim;
    private int size;
    
    /** construtor padrao que cria uma lista duplamente ligada vazia*/
    public LDLigada(){
        size = 0;
        inicio = new DNodo(null, null, null);
        fim = new DNodo(null, inicio, null);
        inicio.setProximo(fim);
    }
    
    /** retorna a quantidade de elementos da lista duplamente ligada
     * @return boolean*/
    @Override
    public int size(){
        return this.size;
    }
    
    /** informa se a lista está vazia
     * @return boolean*/
    @Override
    public boolean isEmpty(){
        return size() == 0;
    }
    
    /** retorna o primeiro Dnodo da lista
     * @return nodo*/
    @Override
    public DNodo getFirst() throws EPosicaoIlegal{
        if (isEmpty()) {
            throw new EPosicaoIlegal("Lista está vazia");
        }
        return inicio.getProximo();
    }
    
    /** retorna o ultimo DNodo da lista
     * @return nodo*/
    @Override
    public DNodo getLast() throws EPosicaoIlegal{
        if (isEmpty()) {
            throw new EPosicaoIlegal("Lista está vazia");
        }
        return fim.getAnterior();
    }
    
    /** retorna o DNodo  que antecede um dado DNodo
     * @param nodo
     * @return nodo*/
    @Override
    public DNodo getAntes(DNodo nodo) throws EParametroIlegal{
        if (nodo == inicio) {
            throw new EParametroIlegal("O DNodo passado não faz parte da lista");
        }
        return nodo.getAnterior();
    }
    
    /** retorna o DNodo que sucede um dado DNodo
     * @param nodo
     * @return nodo*/
    @Override
    public DNodo getDepois(DNodo nodo) throws EParametroIlegal{
        if (nodo == fim) {
            throw new EParametroIlegal("O DNodo passado não faz parte da lista");
        }
        return nodo.getProximo();
    }
    
    /** insere um DNodo candidato antes de um dado DNodo suposto. Gera um erro se o DNodo suposto for o inicio
     * @param candidato
     * @param suposto*/
    @Override
    public void addBefore(DNodo candidato, DNodo suposto){
        DNodo anterior = getAntes(suposto); //pode lançar uma EPosicaoIlegal.
        candidato.setAnterior(anterior);
        candidato.setProximo(suposto);
        
        suposto.setAnterior(candidato);
        anterior.setProximo(candidato);
        size++;
    }
    
    /** insere um DNodo candidato depois de um dado DNodo suposto. Gera um erro se o DNodo suposto for o fim
     * @param candidato
     * @param suposto*/
    @Override
    public void addAfter(DNodo candidato, DNodo suposto){
        DNodo proximo = getDepois(suposto); //pode lançar uma excecao EPosicaoIlegal.
        candidato.setAnterior(suposto);
        candidato.setProximo(proximo);
        
        proximo.setAnterior(candidato);
        suposto.setProximo(candidato);
        size++;
    }
    
    /** adicionar um nodo novo no inicio da lista duplamente ligada
     * @param novo*/
    @Override
    public void addFirst(DNodo novo){
        addAfter(inicio, novo);
    }
    
    /** adicionar um nodo novo no final da lista duplamente ligada
     * @param novo*/
    @Override
    public void addLast(DNodo novo){
        addBefore(fim, novo);
    }
    
    /** remover um dado DNodo nodo da lista. Gera um erro se nodo é o inicio ou fim
     * @param nodo*/
    @Override
    public void remove(DNodo nodo){
        DNodo anterior = getAntes(nodo); //Pode lançar uma exceção EParametroIlegal.
        DNodo proximo = getDepois(nodo); //Pode lançar uma exceção EParametroIlegal.
        
        proximo.setAnterior(anterior);
        anterior.setProximo(proximo);
        
        nodo.setAnterior(null);
        nodo.setProximo(null);
        size--;
    }
    
    /** indica se o DNodo nodo possui um antecessor
     * @param nodo
     * @return boolean*/
    @Override
    public boolean temAnterior(DNodo nodo){
        return (nodo != inicio);
    }
    
    /** indica se o DNodo nodo possui um sucessor
     * @param nodo
     * @return boolean*/
    @Override
    public boolean temProximo(DNodo nodo){
        return (nodo != fim);
    }
}
