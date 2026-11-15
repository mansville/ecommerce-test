package it.mansville.ecommercetest.mapper;

import it.mansville.ecommercetest.dto.DettaglioOrdineResponseDTO;
import it.mansville.ecommercetest.model.DettaglioOrdine;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingConstants;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface DettaglioOrdineMapper {
    @SuppressWarnings("unused")
    @Mapping(target = "idProdotto", source = "prodotto.id")
    @Mapping(target = "codiceProdotto", source = "prodotto.codice")
    @Mapping(target = "nomeProdotto", source = "prodotto.nome")
    DettaglioOrdineResponseDTO toDto(DettaglioOrdine dettaglioOrdine);
}