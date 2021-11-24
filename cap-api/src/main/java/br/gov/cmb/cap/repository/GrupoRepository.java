package br.gov.cmb.cap.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.gov.cmb.cap.entidade.Grupo;

@Repository
public interface GrupoRepository extends JpaRepository<Grupo, Long>{

}
