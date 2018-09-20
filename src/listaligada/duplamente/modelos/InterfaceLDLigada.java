package listaligada.duplamente.modelos;

import listaligada.duplamente.modelos.no.DNodo;
import listaligada.duplamente.excecoes.*;

/**
 *
 * @author jonatas-ms
 */
public interface InterfaceLDLigada {

    /** insere um DNodo candidato depois de um dado DNodo suposto. Gera um erro se o DNodo suposto for o fim
     * @param candidato
     * @param suposto*/
    void addAfter(DNodo candidato, DNodo suposto);

    /** insere um DNodo candidato antes de um dado DNodo suposto. Gera um erro se o DNodo suposto for o inicio
     * @param candidato
     * @param suposto*/
    void addBefore(DNodo candidato, DNodo suposto);

    /** adicionar um nodo novo no inicio da lista duplamente ligada
     * @param novo*/
    void addFirst(DNodo novo);

    /** adicionar um nodo novo no final da lista duplamente ligada
     * @param novo*/
    void addLast(DNodo novo);

    /** retorna o DNodo  que antecede um dado DNodo
     * @param nodo
     * @return nodo*/
    DNodo getAntes(DNodo nodo) throws EParametroIlegal;

    /** retorna o DNodo que sucede um dado DNodo
     * @param nodo
     * @return nodo*/
    DNodo getDepois(DNodo nodo) throws EParametroIlegal;

    /** retorna o primeiro Dnodo da lista
     * @return nodo*/
    DNodo getFirst() throws EPosicaoIlegal;

    /** retorna o ultimo DNodo da lista
     * @return nodo*/
    DNodo getLast() throws EPosicaoIlegal;

    /** informa se a lista está vazia
     * @return boolean*/
    boolean isEmpty();

    /** remover um dado DNodo nodo da lista. Gera um erro se nodo é o inicio ou fim
     * @param nodo*/
    void remove(DNodo nodo);

    /** retorna a quantidade de elementos da lista duplamente ligada
     * @return boolean*/
    int size();

    /** indica se o DNodo nodo possui um antecessor
     * @param nodo
     * @return boolean*/
    boolean temAnterior(DNodo nodo);

    /** indica se o DNodo nodo possui um sucessor
     * @param nodo
     * @return boolean*/
    boolean temProximo(DNodo nodo);
    
}
