package com.elias;

import com.elias.service.AppService;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AppServiceTest {

    @Test
    public void confirmaRetornoDoMetodoMediana(){
        int[] numeros = {9, 2, 1, 4, 6};
        assertEquals(4, AppService.mediana(numeros));
    }

}
