package org.example;

import com.google.gson.Gson;
import com.google.gson.JsonObject;

public class Main
{
    void main()
    {
        Gson gson = new Gson();

        String emailCorrecto = "leonardozaniladev@gmail.com";
        String noEmailCorrecto = "leonardozaniladevgmail.com";
        String emailVacio = "";
        String emailVacioWithSpace = "   sdasd  asd ";
        String emailNull = null;
        Email email = new Email();
        ResultadoEmail resultado = email.validoEmail(emailNull);

        if(resultado.esValido()) {
            System.out.println("Es valido!");
        } else {
            System.out.println("Es invalido!");
        }
        System.out.println(resultado.jsonParticion().toString());
    }
}
