package br.gov.cmb.cap.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.gov.cmb.cap.entidade.HistoricoSituacaoEquipamento;
import br.gov.cmb.cap.repository.HistoricoSituacaoEquipamentoRepository;

@Service
public class HistoricoSituacaoEquipamentoService {
	
	@Autowired
	HistoricoSituacaoEquipamentoRepository historicoSituacaoEquipamentoRepo;
	
	public List<HistoricoSituacaoEquipamento> buscarTodos() {
		return historicoSituacaoEquipamentoRepo.findAll();
	}
		
	public Optional<HistoricoSituacaoEquipamento> buscarPorId(Long id) {
		return historicoSituacaoEquipamentoRepo.findById(id);	
	}
	
	/*
	 * public FuncionamentoMaquinaDTO salvar(FuncionamentoMaquinaDTO
	 * funcionamentoDTO) { FuncionamentoMaquina funcionamento =
	 * FuncionamentoMaquinaConverter.converter(funcionamentoDTO);
	 * atribuirDias(funcionamento); return
	 * FuncionamentoMaquinaConverter.converter(funcionamentoMaquinaDAO.salvar(
	 * funcionamento)); }
	 * 
	 * private void atribuirDias(FuncionamentoMaquina funcionamento) {
	 * funcionamento.getDiasFuncionamento().stream().forEach(n -> {
	 * n.setFuncionamentoMaquina(funcionamento); }); }
	 */

}
