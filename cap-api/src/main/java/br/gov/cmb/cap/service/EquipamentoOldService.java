package br.gov.cmb.cap.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.gov.cmb.cap.entidade.EquipamentoOld;
import br.gov.cmb.cap.repository.EquipamentoOldRepository;

@Service
public class EquipamentoOldService {
	
	@Autowired
	EquipamentoOldRepository equipamentoOldRepo;
		
	public List<EquipamentoOld> buscarTodos() {
		List<EquipamentoOld> equipamentos = new ArrayList<EquipamentoOld>();
		equipamentos = equipamentoOldRepo.findAll();
		return equipamentos;
	}
		
	public Optional<EquipamentoOld> buscarPorId(Long id) {
		return equipamentoOldRepo.findById(id);	
	}		
	 

}
