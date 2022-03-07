package com.elias.service;

import java.util.Arrays;

public class AppService {

    public static int informaMediana(int[] numeros){
        int indice = numeros.length/2;
        Arrays.sort(numeros);
        return numeros[indice];
    }

    public static int paresComDiferencaDeterminada(int[] numeros, int numero){

        int total = 0;
        Arrays.sort(numeros);

        for(int i = 0; i < numeros.length; i++){
            for(int j = i+1; j < numeros.length; j++){
                if(numeros[j] - numeros[i] == numero) {
                    total++;
                }
            }

        }
        return total;
    }

    public static void encriptaTexto(String frase){

        int total  = frase.replace(" ","").trim().length();
        int tamanho = raiz(total);
        char[] letras = frase.replace(" ","").trim().toCharArray();
        char[][] resultado = new char[tamanho][tamanho];

        for(int i = 0; i < tamanho; i++){
            int step = i;
            for(int j = 0; j < tamanho; j++){
                if(step >= total) {
                    resultado[i][j] = ' ';
                    continue;
                }
                resultado[i][j] = letras[step];
                step += tamanho;
            }
        }
        System.out.println(Arrays.deepToString(resultado).replace("[", "").replace(",", "").replace("]", ""));
    }

    private static int raiz(int numero){
        int raiz = (int)Math.sqrt(numero);
        if(raiz*raiz != numero) return raiz + 1;
        return raiz;
    }
}
