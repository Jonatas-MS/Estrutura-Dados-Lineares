package tad.arvore.modelos;

import java.util.Iterator;
import java.util.Vector;

/**
 *
 * @author jonatas-ms
 */
public class No implements InterfaceNo {

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
    @Override
    public Object element() {
        return o;
    }

    /**
     * retorna o No pai, do No.
     */
    @Override
    public No parent() {
        return pai;
    }

    /**
     * adiciona um elemento no No.
     */
    @Override
    public void setElement(Object o) {
        this.o = o;
    }

    /**
     * adiciona um No filho.
     */
    @Override
    public void addChild(No o) {
        filhos.add(o);
    }

    /**
     * remover um No filho.
     */
    @Override
    public void removeChild(No o) {
        filhos.remove(o);
    }

    /**
     * retorna a quantidade de Nos filhos.
     */
    @Override
    public int childrenNumber() {
        return filhos.size();
    }

    /**
     * retorna um iterator com os filhos do no, 
     * que é uma lista com filhos do no.
     */
    @Override
    public Iterator children() {
        return filhos.iterator();
    }

}
