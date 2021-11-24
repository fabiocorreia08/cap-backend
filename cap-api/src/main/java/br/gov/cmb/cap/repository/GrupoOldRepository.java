package br.gov.cmb.cap.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.gov.cmb.cap.entidade.GrupoOld;

@Repository
public interface GrupoOldRepository extends JpaRepository<GrupoOld, Long>{

}
