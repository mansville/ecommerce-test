package it.mansville.ecommercetest.dto;

public record ProdottoResponseDTO(
        Integer id,
        String codice,
        String nome,
        Integer stock
) {}