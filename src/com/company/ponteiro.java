package com.company;

import java.util.ArrayList;

public class ponteiro {
    public ArrayList aux;
    public int cont;

    public ponteiro(ArrayList aux)
    {
        this.aux = aux;
        cont=-1;
    }

    public void setCont(int cont) {
        this.cont = cont;
    }

    public int getCont() {
        return cont;
    }

    public ArrayList getAux() {
        return aux;
    }

    public void setAux(ArrayList aux) {
        this.aux = aux;
    }
}
