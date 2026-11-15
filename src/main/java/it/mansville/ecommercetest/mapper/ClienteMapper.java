package it.mansville.ecommercetest.mapper;

import it.mansville.ecommercetest.dto.ClienteRequestDTO;
import it.mansville.ecommercetest.dto.ClienteResponseDTO;
import it.mansville.ecommercetest.model.Cliente;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING, unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface ClienteMapper {
    Cliente toEntity(ClienteRequestDTO clienteDTO);

    ClienteResponseDTO toDTO(Cliente cliente);
}