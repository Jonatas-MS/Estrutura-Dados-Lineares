package tad.vetor.modelo;

import tad.vetor.excecao.EIndiceForaDosLimites;

/**
 *
 * @author jonatas-ms
 * @param <Object>
 */
public interface InterfaceVetor<Object> {
    //retorna quantidade de elementos desta lista
    public int size();
    
    //retorna se a lista esta vazia
    public boolean isEmpty();
    
    //insere um elemento no indece i deslocando todos elementos depois dele
    //insertAtRank
    public void add(int i, Object e) throws EIndiceForaDosLimites;
    
    //retorna o elemento no indece i sem removelo
    //elementAtRank
    public Object get(int i) throws EIndiceForaDosLimites;
    
    //remove e retorna o elemento no indece i deslocando os elementos apos este
    //removetAtRank
    public Object remove(int i) throws EIndiceForaDosLimites;
    
    //substitui o elemento no indece i por e, retornando o antigo elemento
    //replaceAtRank
    public Object set(int i, Object e) throws EIndiceForaDosLimites;
}
