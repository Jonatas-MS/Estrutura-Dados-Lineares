package tad.arvore.modelos;

import java.util.Iterator;

/**
 *
 * @author jonatas-ms
 */
public interface InterfaceNo {

    /**
     * adiciona um No filho.
     */
    void addChild(No o);

    /**
     * retorna um iterator com os filhos do no,
     * que é uma lista com filhos do no.
     */
    Iterator children();

    /**
     * retorna a quantidade de Nos filhos.
     */
    int childrenNumber();

    /**
     * retorna o elemento do No.
     */
    Object element();

    /**
     * retorna o No pai, do No.
     */
    No parent();

    /**
     * remover um No filho.
     */
    void removeChild(No o);

    /**
     * adiciona um elemento no No.
     */
    void setElement(Object o);
    
}
