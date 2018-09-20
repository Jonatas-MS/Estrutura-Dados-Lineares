package tad.lista.modelo;

import no.DNodo;

/**
 *
 * @author jonatas-ms
 */
public interface InterfaceLista {
    
    //métodos genéricos
    
    /**Retorna o número de elementos da lista*/
    public int size();
    
    /**Retorna se a lista está vazia*/
    public boolean isEmpty();
    
    //métodos de consulta
    
    /**Retorna se um dado nodo é o Primeiro da lista.*/
    public boolean isFirst(DNodo nodo);
    
    /**Retorna se um dado nodo é o Ultimo da lista.*/
    public boolean isLast(DNodo nodo);
    
    //métodos de acesso
    
    /**Retorna a posição do primeiro elemento da lista*/
    public DNodo getFirst();
    
    /**Retorna a posição do ultimo elemento da lista*/
    public DNodo getLast();
    
    /**Retorna a posição do elemento que e antecessor de um dado nodo*/
    public DNodo getPrev(DNodo nodo);
    
    /**Retorna a posição do elemento que e sucessor de um dado nodo*/
    public DNodo getNext(DNodo nodo);
    
    //métodos de atualização
    
    /**Substitui o elemento de um dado nodo da lista, por o*/
    public void replaceElement(DNodo nodo, Object o);
    
    /**Substitui o nodo que se encontra na posição p da lista, por q
     *retornando o antigo elemento p.
     */
    public void swapElements(DNodo p, DNodo q);
    
    /**Remove e retorna o elemento de uma dada posição*/
    public Object remove(DNodo nodo);
    
    /**Insere o novo nodo como primeiro da lista*/
    public void addFist(DNodo novo);
    
    /**Insere o novo nodo como ultimo da lista*/
    public void addLast(DNodo novo);
    
    /**Insere o novo nodo antes de um dado elem da lista*/
    public void addAntes(DNodo novo, DNodo elem);
    
    /**Insere o novo nodo depois de um dado elem da lista*/
    public void addDepois(DNodo novo, DNodo elem);
}
