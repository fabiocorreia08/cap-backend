package br.gov.cmb.cap.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import br.gov.cmb.cap.entidade.Equipamento;

@Repository
public interface EquipamentoRepository extends JpaRepository<Equipamento, Long>{
	
	@Query("SELECT e FROM Equipamento e WHERE e.codigoManutencao = ?1")
    Equipamento findByCodManutencao(String codigoManutencao);

}
