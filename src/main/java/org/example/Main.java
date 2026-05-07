package org.example;
public class Main
{
    void main()
    {
        String emailCorrecto = "leonardozaniladev@gmail.com";
        String noEmailCorrecto = "leonardozaniladevgmail.com";
        String emailVacio = "";
        String emailVacioWithSpace = "   sdasd  asd ";
        String emailNull = null;

        Email email = new Email();
        ResultadoEmail resultado = email.validoEmail(emailNull);
        if(resultado.esValido())
        {
            System.out.println("Correo valido: " + resultado.motivo());
        } else
        {
            System.out.println("Correo invalido: " + resultado.motivo());
        }

    }
}
