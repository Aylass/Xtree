package com.company;

public class Xtree {
    private Nodo raiz;
    public int nivel;
    public int soma;
    public int quantnodo;

    public Xtree(Nodo root){
        this.raiz = root;
        this.nivel = 0;
        this.soma = 0;
        this.quantnodo = 0;
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

    public void caminhaQuantNodos(Nodo n){
        this.quantnodo = quantnodo + 1;
        //System.out.println("Nodo: " + n.valores[0]);
        //System.out.println("QuantNodo: " + this.quantnodo);
        for(Nodo fio: n.filhos){
            caminhaQuantNodos(fio);
        }
    }
    public void caminhaSoma(Nodo n){
        int[] val = n.valores;
        for(int i = 0; i<val.length;i++){
            this.soma = soma + val[i];
        }
        for(Nodo fio: n.filhos){
            caminhaSoma(fio);
        }
    }
    public int caminhaNivel(Nodo n){
        int cont, max = 0;
        if(n.filhos.size()>0){//se tem filho
            for (Nodo fio: n.filhos) {
                cont = caminhaNivel(fio);
                if(cont > max){
                    max = cont;
                }
            }
        }else{
            max = n.getNivel();
        }
        return max;
    }
}
