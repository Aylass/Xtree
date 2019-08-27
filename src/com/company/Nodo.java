package com.company;

import java.util.ArrayList;

public class Nodo {
    private Nodo pai;
    public ArrayList<Nodo> filhos= new ArrayList<Nodo>();
    public int[] valores;
    private int nivel;

    public Nodo(Nodo paii, int qtdf){

        if(pai!=null) {
            this.pai = paii;
            nivel = pai.getNivel() + 1;
            filhos = new ArrayList<Nodo> (qtdf);
        }else{
            nivel = 0;
            filhos = new ArrayList<Nodo> (qtdf);
        }

    }
    public Nodo(){

    }

    public void setanivel(){
        this.nivel = pai.getNivel() + 1;
    }
    public ArrayList<Nodo> getFilhos() {
        return filhos;
    }
    public int[] getValores() {
        return valores;
    }

    public void setValores(int[] valores) { this.valores = valores; }

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
