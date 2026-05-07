package org.example;

import com.google.gson.JsonObject;

public record ResultadoEmail(boolean esValido, String motivo,JsonObject jsonParticion)
{
}
