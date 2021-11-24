package br.gov.cmb.cap.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.gov.cmb.cap.entidade.FuncionamentoMaquina;

@Repository
public interface FuncionamentoMaquinaRepository extends JpaRepository<FuncionamentoMaquina, Long>{

}
