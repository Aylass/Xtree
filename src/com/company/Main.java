package com.company;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        readFile("teste.txt",n);
    }

    public static boolean readFile(String nomeArq){
        Boolean result2=false;
        Path path1= Paths.get(nomeArq,Nodo nodo);
        try(Scanner sc= new Scanner(Files.newBufferedReader(path1, Charset.defaultCharset())))
        {
            String pal=null;
            while(sc.hasNext())
            {
                pal=sc.next();

                //System.out.println(pal);
            }
            result2=true;
        }
            catch (IOException e)
            {
                System.err.format("deu ruim",e);
                result2=false;
            }
        return result2;
    }


}
