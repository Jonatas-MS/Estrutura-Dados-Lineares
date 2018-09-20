package tad.arvore.modelos;

import java.util.Iterator;
import java.util.Vector;

/**
 *
 * @author jonatas-ms
 */
public class No implements Position {

    //atributos do No
    private Object o;
    private No pai;
    private Vector filhos = new Vector();

    //construtor do no
    public No(No pai, Object o) {
        this.pai = pai;
        this.o = o;
    }

    /**
     * retorna o elemento do No.
     */
    public Object element() {
        return o;
    }

    /**
     * retorna o No pai, do No.
     */
    public No parent() {
        return pai;
    }

    /**
     * adiciona um elemento no No.
     */
    public void setElement(Object o) {
        this.o = o;
    }

    /**
     * adiciona um No filho.
     */
    public void addChild(No o) {
        filhos.add(o);
    }

    /**
     * remover um No filho.
     */
    public void removeChild(No o) {
        filhos.remove(o);
    }

    /**
     * retorna a quantidade de Nos filhos.
     */
    public int childrenNumber() {
        return filhos.size();
    }

    /**
     * retorna um iterator com os filhos do no, 
     * que é uma lista com filhos do no.
     */
    public Iterator children() {
        return filhos.iterator();
    }

}
