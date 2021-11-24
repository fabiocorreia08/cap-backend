package br.gov.cmb.cap.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.gov.cmb.cap.entidade.FuncionamentoMaquinaDia;
import br.gov.cmb.cap.repository.FuncionamentoMaquinaDiaRepository;

@Service
public class FuncionamentoMaquinaDiaService {
	
	@Autowired
	FuncionamentoMaquinaDiaRepository funcionamentoMaquinaDiaRepo;
	
	public List<FuncionamentoMaquinaDia> buscarTodos() {		
		List<FuncionamentoMaquinaDia> funcionamentoMaquinaDias = new ArrayList<FuncionamentoMaquinaDia>();
		funcionamentoMaquinaDias = funcionamentoMaquinaDiaRepo.findAll();
		return funcionamentoMaquinaDias;
	}
	
	public Optional<FuncionamentoMaquinaDia> buscarPorId(Long id) {
		return funcionamentoMaquinaDiaRepo.findById(id);	
	}
	 

}
