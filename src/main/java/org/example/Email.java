package org.example;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Email
{
    private static final Pattern PATRON_EMAIL = Pattern.compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");
    public ResultadoEmail validoEmail(String email)
    {
        if(email==null)
        {
            return new ResultadoEmail(false,"El correo es null");
        }
        else if(email.isBlank())
        {
            return new ResultadoEmail(false,"El correo esta vacio");
        }
        else
        {
            Matcher matcher = PATRON_EMAIL.matcher(email);
            if(matcher.matches())
            {
                return new ResultadoEmail(true, "El correo es valido");
            } else
            {
                return new ResultadoEmail(false, "El correo no es valido");
            }
        }
    }
}
