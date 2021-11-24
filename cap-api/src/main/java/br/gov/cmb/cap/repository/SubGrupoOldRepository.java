package br.gov.cmb.cap.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import br.gov.cmb.cap.entidade.SubGrupoOld;

@Repository
public interface SubGrupoOldRepository extends JpaRepository<SubGrupoOld, Long>{
	
	@Query("SELECT sg FROM SubGrupoOld sg WHERE sg.codGrupo = ?1")
    List<SubGrupoOld> findByCodGrupo(String codGrupo);

}
