package it.mansville.ecommercetest.repository;

import it.mansville.ecommercetest.model.Prodotto;
import jakarta.persistence.LockModeType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Lock;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ProdottoRepository extends JpaRepository<Prodotto, Integer> {
    boolean existsByCodice(String codice);

    Optional<Prodotto> findByCodice(String codice);

    @Lock(LockModeType.PESSIMISTIC_WRITE)
    @Query("select p from Prodotto p where p.codice = :codice")
    Optional<Prodotto> findByCodiceWithLock(@Param("codice") String codice);
}