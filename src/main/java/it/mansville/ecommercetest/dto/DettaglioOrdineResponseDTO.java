package it.mansville.ecommercetest.dto;

public record DettaglioOrdineResponseDTO(
        Integer idProdotto,
        String codiceProdotto,
        String nomeProdotto,
        Integer quantita
) {}