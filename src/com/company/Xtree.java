package com.company;

public class Xtree {
    private Nodo raiz;
    private int nivel;

    public Xtree(Nodo root){
        this.raiz = root;
        this.nivel = 0;
    }

    public int getNivel() {
        return nivel;
    }
    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public Nodo getRaiz() {
        return raiz;
    }
    public void setRaiz(Nodo raiz) {
        this.raiz = raiz;
    }
}
