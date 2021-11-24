package br.gov.cmb.cap.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.gov.cmb.cap.entidade.Equipamento;
import br.gov.cmb.cap.entidade.EquipamentoOld;
import br.gov.cmb.cap.enums.SimNaoEnum;
import br.gov.cmb.cap.repository.EquipamentoOldRepository;
import br.gov.cmb.cap.repository.EquipamentoRepository;

@Service
public class EquipamentoService {
	
	@Autowired
	EquipamentoRepository equipamentoRepo;
	
	@Autowired
	EquipamentoOldRepository equipamentoOldRepo;
		
	public List<Equipamento> buscarTodos() {
		List<Equipamento> equipamentos = new ArrayList<Equipamento>();
		equipamentos = equipamentoRepo.findAll();
		return equipamentos;
	}
		
	public Optional<Equipamento> buscarPorId(Long id) {
		return equipamentoRepo.findById(id);	
	}		
	
	public void migrarEquipamento() {
		
		List<EquipamentoOld> equipamentosOld = new ArrayList<EquipamentoOld>();
		
		equipamentosOld = equipamentoOldRepo.findAll();
		
		for (EquipamentoOld equipamentoOld : equipamentosOld) {
			
			Equipamento equipamento = new Equipamento();
			equipamento.setCodigoManutencao(equipamentoOld.getCodEquip().substring(0, 3)+"0"+equipamentoOld.getCodEquip().substring(3, 5));
			equipamento.setNomeEquipamento(equipamentoOld.getNomEquip());
			equipamento.setNumeroPatrimonio("1");
			equipamento.setNumeroTensao(new Long(1));
			equipamento.setNumeroPotencia(new Long(1));
			equipamento.setNomeTipoPotencia("1");
			equipamento.setNumeroPeso(new Long(1));
			equipamento.setNumeroAno(new Long(1));
			equipamento.setDataInstalacao(new Date());
			equipamento.setFlagPreventiva(SimNaoEnum.N);
			equipamento.setDescricaoPreRequisitoInformacao(null);
			equipamento.setDescricaoObservacao(null);
			
			equipamentoRepo.save(equipamento);			
			
		}
		
	}
	 

}
