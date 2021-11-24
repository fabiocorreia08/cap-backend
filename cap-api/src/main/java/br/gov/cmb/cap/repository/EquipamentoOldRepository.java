package br.gov.cmb.cap.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.gov.cmb.cap.entidade.EquipamentoOld;

@Repository
public interface EquipamentoOldRepository extends JpaRepository<EquipamentoOld, Long> {

}
