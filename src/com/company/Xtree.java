package com.company;

public class Xtree {
    private Nodo raiz;
    private int nivel;
    public int soma;

    public Xtree(Nodo root){
        this.raiz = root;
        this.nivel = 0;
        this.soma = 0;
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
    public void caminha(Nodo n){
        int[] val = n.valores;
        for(int i = 0; i<val.length;i++){
            this.soma = soma + val[i];
        }
        for(Nodo fio: n.filhos){
            caminha(fio);
        }
    }
}
