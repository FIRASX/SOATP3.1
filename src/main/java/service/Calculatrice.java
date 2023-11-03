package service;


import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;

@WebService(name = "calculws")
public class Calculatrice {
    @WebMethod(operationName = "somme")
    public double somme(@WebParam(name= "val") double a,@WebParam(name= "val1") double b) {
        return a + b;
    }

}
