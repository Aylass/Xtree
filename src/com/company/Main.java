package com.company;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int nivel=1;
        //int[] aux=new int[100];
        ArrayList aux= new ArrayList();
        Nodo n= new Nodo();
        Xtree tree = new Xtree(n);
        readFile("teste.txt",aux);
        ponteiro auxx=new ponteiro(aux);

        pam(n, auxx);

        tree.caminha(tree.getRaiz());
        System.out.println(tree.soma);
        //int[] karol = n.getValores();
        //System.out.println("Valores: " + karol[0]);
        //caminha(n);
    }

    public static ArrayList readFile(String nomeArq,ArrayList aux){
        Boolean result2=false;
        Path path1= Paths.get(nomeArq);
        try(Scanner sc= new Scanner(Files.newBufferedReader(path1, Charset.defaultCharset())))
        {
            String pal=null;
            while(sc.hasNext())
            {
                pal=sc.next();
                int pal2=Integer.parseInt(pal);
                aux.add( pal2);
                /*for(int i=0; i<10;i++)
                {aux[i]= Integer.parseInt(pal);
                    System.out.println(aux[i]);
                }*/

                //System.out.println(pal);
            }
            /*for(int i = 0; i< aux.size();i++){
                System.out.println(aux.get(i));
            }*/
            result2=true;
        }
            catch (IOException e)
            {
                System.err.format("deu ruim",e);
                result2=false;
            }
        return aux;
    }

    public static void pam(Nodo nodo,ponteiro aux)
    {
        int le=letexto(aux);
       // System.out.println(le);
       if(le>0)
       {
           while(le>0)
           {
               Nodo n=new Nodo();
               n.setPai(nodo);
               nodo.getFilhos().add(n);
                n.setanivel();
                le--;
               //System.out.println("   nivel: "+n.getNivel());
           }
       }
       le=letexto(aux);
        //System.out.println("aqui "+le);
        nodo.valores=new int[le];
        //System.out.println(nodo.valores.size());
        for(int i=0;i<nodo.getFilhos().size();i++)
        {
            pam(nodo.getFilhos().get(i),aux);
        }

        for(int i=0;i<nodo.valores.length;i++)
        {
            le=letexto(aux);
            //System.out.println("ei "+le);
            nodo.getValores()[i]=le;
        }

    }

    public static int letexto(ponteiro p) {
      int cont2=p.cont;
      cont2++;
      p.setCont(cont2);
      //System.out.println(cont2);
      return (int) p.getAux().get(cont2);
    }

    public static void caminha(Nodo n){
        int[] val = n.valores;
        for(int i = 0; i<val.length;i++){
            System.out.println("Valor: " + val[i]);
        }
        for(Nodo fio: n.filhos){
            caminha(fio);
        }
    }
}
