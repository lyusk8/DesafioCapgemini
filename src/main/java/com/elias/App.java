package com.elias;

import com.elias.service.AppService;

public class App 
{
    public static void main( String[] args )
    {
        int[] numeros = {9, 2, 1, 4, 6};
        int[] numeros2 = {1,5,3,4,2};

        System.out.println(AppService.informaMediana(numeros));
        System.out.println(AppService.paresComDiferencaDeterminada(numeros2, 2));
        AppService.encriptaTexto("ola mundo");
    }
}
