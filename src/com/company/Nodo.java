package com.company;

import java.util.ArrayList;

public class Nodo {
    private Nodo pai;
    private Nodo[] filhos;
    private ArrayList valores = new ArrayList();
    private int nivel;

    public Nodo(Nodo paii, int qtdf){
        if(pai!=null) {
            this.pai = paii;
            nivel = pai.getNivel() + 1;
            filhos = new Nodo[qtdf];
        }else{
            nivel = 0;
            filhos = new Nodo[qtdf];
        }
    }
    public Nodo[] getFilhos() {
        return filhos;
    }
    public ArrayList getValores() {
        return valores;
    }

    public int getNivel() {
        return nivel;
    }
    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public Nodo getPai() {
        return pai;
    }
    public void setPai(Nodo pai) {
        this.pai = pai;
    }
}
