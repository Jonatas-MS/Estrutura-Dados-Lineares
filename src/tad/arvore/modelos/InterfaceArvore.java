package tad.arvore.modelos;

import java.util.Iterator;

/**
 *
 * @author jonatas-ms
 */
public interface InterfaceArvore {

    /* Métodos genéricos */
    /**
     * Retorna o número de nós da árvore
     */
    public int size();

    /**
     * retorna se a árvore está vazia
     */
    public boolean isEmpty();

    /**
     * Retorna a altura de um dado no
     */
    public int height(No no);

    /**
     * Retorna um iterator com os elementos 
     * armazenados nos nós da arvore
     */
    public Iterator elements();

    /**
     * Retorna um iterator com os nós da arvore
     */
    public Iterator Nos();

    /* Métodos de acesso*/
    /**
     * Retorna a raiz da árvore
     */
    public No root();

    /**
     * Retorna o nó pai de um nó
     */
    public No parent(No v);

    /**
     * Retorna os filhos de um nó
     */
    public Iterator children(No v);

    /* Métodos de consulta */
    /**
     * Testa se um nó é interno
     * É interno se tem um ou mais filhos
     */
    public boolean isInternal(No v);

    /**
     * Testa se um nó é externo
     * É externo se não tem filhos, é um no folha
     */
    public boolean isExternal(No v);

    /**
     * Testa se um nó é a raiz
     */
    public boolean isRoot(No v);

    /**
     * Retorna a profundidade de um nó
     */
    public int depth(No v);

    /* Métodos de atualização */
    /**
     * Retorna o elemento armazenado em v é substitui por o
     */
    public Object replace(No v, Object o);
}
