package com.votacao.pauta.repository;

import com.votacao.pauta.models.Pauta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PautaInterface extends JpaRepository<Pauta,Long>  {
}
