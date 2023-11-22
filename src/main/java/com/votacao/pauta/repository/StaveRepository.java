package com.votacao.pauta.repository;

import com.votacao.pauta.models.Stave;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StaveRepository extends JpaRepository<Stave,Long>  {
}
