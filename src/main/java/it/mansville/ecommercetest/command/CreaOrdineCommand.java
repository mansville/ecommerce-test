package it.mansville.ecommercetest.command;

import java.util.Map;

public record CreaOrdineCommand(
        String codiceFiscale,
        Map<String, Integer> dettagli
) {}