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
        //int[] aux=new int[100];
        ArrayList aux= new ArrayList();
        Nodo n= new Nodo();
        readFile("teste.txt",aux);
        ponteiro auxx=new ponteiro(aux);
        pam(n, auxx);

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
        System.out.println(le);
       
    }

    public static int letexto(ponteiro p) {
      int cont2=p.cont;
      cont2++;
      p.setCont(cont2);
      return (int) p.getAux().get(cont2);
    }
}
