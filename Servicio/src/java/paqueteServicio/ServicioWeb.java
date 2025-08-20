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
     * Web service operation
     */
    @WebMethod(operationName = "suma")
    public Integer suma(@WebParam(name = "numero1") int numero1, @WebParam(name = "numero2") int numero2) {
        //TODO write your implementation code here:
        return numero1 + numero2;
    }
    
        @WebMethod(operationName = "resta")
    public Integer resta(@WebParam(name = "numero1") int numero1, @WebParam(name = "numero2") int numero2) {
        return numero1 - numero2;
    }

    @WebMethod(operationName = "multiplicacion")
    public Integer multiplicacion(@WebParam(name = "numero1") int numero1, @WebParam(name = "numero2") int numero2) {
        return numero1 * numero2;
    }

    @WebMethod(operationName = "division")
    public Double division(@WebParam(name = "numero1") int numero1, @WebParam(name = "numero2") int numero2) {
        if (numero2 == 0) {
            throw new IllegalArgumentException("No se puede dividir entre cero");
        }
        return (double) numero1 / numero2;
    }
}
