package it.unicam.cs.lc2122.gedcom.ancdesc;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Rappresenta un individuo in un albero genealogico.
 *
 * @author Template: Luca Tesei
 */
public class Individual {
    // Codice univoco
    private final String code;
    // lista di puntatori ai figli
    private final List<Individual> children;
    // puntatore al padre
    private Individual father;
    // puntatore alla madre
    private Individual mother;

    /**
     * Create a new individual with a code
     *
     * @param code unique code for the individual
     */
    public Individual(String code) {
        this.code = Objects.requireNonNull(code);
        this.children = new ArrayList<>();
    }

    /**
     * @return the childs
     */
    public List<Individual> getChildren() {
        return children;
    }

    /**
     * Add a child
     *
     * @param child the child to add
     * @throws NullPointerException if the child is null
     */
    public void addChild(Individual child) {
        this.children.add(Objects.requireNonNull(child));
    }

    /**
     * @return the father
     */
    public Individual getFather() {
        return father;
    }

    /**
     * @param father the father to set
     */
    public void setFather(Individual father) {
        this.father = father;
    }

    /**
     * @return the mother
     */
    public Individual getMother() {
        return mother;
    }

    /**
     * @param mother the mother to set
     */
    public void setMother(Individual mother) {
        this.mother = mother;
    }

    /**
     * @return the code
     */
    public String getCode() {
        return code;
    }

    @Override
    public int hashCode() {
        return Objects.hash(code);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Individual other = (Individual) obj;
        return Objects.equals(code, other.code);
    }

    @Override
    public String toString() {
        return this.code.substring(1,this.code.length()-1);
    }

}