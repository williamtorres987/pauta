package com.votacao.pauta.repository;

import com.votacao.pauta.models.Pauta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PautaRepository extends JpaRepository<Pauta,Long>  {
}
