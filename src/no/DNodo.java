package no;

/**
 *
 * @author jonatas-ms
 */

/** nodo de uma lista duplamente ligada*/
public class DNodo {
    
    private Object elemento; 
    private DNodo anterior, proximo;
    
    /**cria um Dnodo padrão*/
    public DNodo(){};
    
    /**cria um Dnodo com um dado elemento, Dnodo anterior e Dnodo proxim
     * @param elemento
     * @param anterior
     * @param proximo*/
    public DNodo(Object elemento, DNodo anterior, DNodo proximo){
        this.elemento = elemento;
        this.anterior = anterior;
        this.proximo = proximo;
    }
    
    /** retorna o elemento deste Dnodo
     * @return Object*/
    public Object getElemento(){
        return this.elemento;
    }
    
    /** retorna o DNodo anterior a este DNodo
     * @return nodo*/
    public DNodo getAnterior(){
        return this.anterior;
    }
    
    /** retorna o DNodo proximo a este DNodo
     * @return nodo*/
    public DNodo getProximo(){
        return this.proximo;
    }
    
    /** define o elemento deste Dnodo
     * @param novoElemento*/
    public void setElemento(Object novoElemento){
        this.elemento = elemento;
    }
    
    /** define o DNodo anterior a este DNod
     * @param novoAnterior*/
    public void setAnterior(DNodo novoAnterior){
        this.anterior = novoAnterior;
    }
    
    /** define o DNodo proximo a este DNod
     * @param novoProximo*/
    public void setProximo(DNodo novoProximo){
        this.proximo = novoProximo;
    }
}
