package org.example;


import com.google.gson.JsonObject;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Email
{
    JsonObject jsonObject = new JsonObject();
    private static final Pattern PATRON_EMAIL = Pattern.compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");
    public ResultadoEmail validoEmail(String email)
    {
        boolean esValido;
        String motivo;
        JsonObject json = new JsonObject();
        if(email==null)
        {
            esValido = false;
            motivo = "El correo es null";
        }
        else if(email.isBlank())
        {
            esValido = false;
            motivo = "El correo esta vacio";
        }
        else
        {
            Matcher matcher = PATRON_EMAIL.matcher(email);
            if(matcher.matches())
            {
                esValido = true;
                motivo = "El correo es valido";
            } else
            {
                esValido = false;
                motivo = "El correo no es valido";
            }
        }

        json.addProperty("email", email);
        json.addProperty("esValido", esValido);
        json.addProperty("motivo", motivo);
        return new ResultadoEmail(esValido, motivo, json);
    }
}
