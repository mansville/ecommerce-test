package it.mansville.ecommercetest.mapper;

import it.mansville.ecommercetest.dto.ProdottoRequestDTO;
import it.mansville.ecommercetest.dto.ProdottoResponseDTO;
import it.mansville.ecommercetest.model.Prodotto;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING, unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface ProdottoMapper {
    Prodotto toEntity(ProdottoRequestDTO prodottoDTO);

    ProdottoResponseDTO toDTO(Prodotto prodotto);
}