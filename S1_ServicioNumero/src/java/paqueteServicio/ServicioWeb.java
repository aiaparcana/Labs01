/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paqueteServicio;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author antho
 */
@WebService(serviceName = "ServicioWeb")
public class ServicioWeb {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "mayor")
    public Integer mayor(
            @WebParam(name = "numero1") int numero1, 
            @WebParam(name = "numero2") int numero2, 
            @WebParam(name = "numero3") int numero3, 
            @WebParam(name = "numero4") int numero4) {
        //TODO write your implementation code here:
            int[] numeros = {numero1, numero2, numero3, numero4};
            int mayor = numeros[0];

            for (int i = 1; i < numeros.length; i++) {
                if (numeros[i] > mayor) {
                    mayor = numeros[i];
                }
            }
        return mayor;
    }
    @WebMethod(operationName = "menor")
    public Integer menor(
        @WebParam(name = "numero1") int numero1,
        @WebParam(name = "numero2") int numero2,
        @WebParam(name = "numero3") int numero3,
        @WebParam(name = "numero4") int numero4) {

        int[] numeros = {numero1, numero2, numero3, numero4};
        int menor = numeros[0];

        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] < menor) {
                menor = numeros[i];
            }
        }
        return menor;
    }   
@WebMethod(operationName = "promedio")
    public Integer promedio(
        @WebParam(name = "numero1") int numero1,
        @WebParam(name = "numero2") int numero2,
        @WebParam(name = "numero3") int numero3,
        @WebParam(name = "numero4") int numero4) {

        int promedio = (numero1+numero2+numero3+numero4)/4;
        return promedio;
    }  
}
