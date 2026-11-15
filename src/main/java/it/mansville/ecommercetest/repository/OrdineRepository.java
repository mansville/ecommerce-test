package it.mansville.ecommercetest.repository;

import it.mansville.ecommercetest.model.Ordine;
import it.mansville.ecommercetest.model.type.StatoOrdine;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrdineRepository extends JpaRepository<Ordine, Integer> {
    Page<Ordine> findByClienteCodiceFiscale(String clienteCodiceFiscale, Pageable pageable);

    Page<Ordine> findByClienteCodiceFiscaleAndStato(String clienteCodiceFiscale, StatoOrdine stato, Pageable pageable);

    int countByStato(StatoOrdine stato);
}