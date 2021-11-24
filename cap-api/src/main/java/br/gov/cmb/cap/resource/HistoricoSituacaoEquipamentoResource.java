package br.gov.cmb.cap.resource;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.gov.cmb.cap.entidade.HistoricoSituacaoEquipamento;
import br.gov.cmb.cap.service.HistoricoSituacaoEquipamentoService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/historico-situacao-equipamento")
public class HistoricoSituacaoEquipamentoResource {

	@Autowired
	HistoricoSituacaoEquipamentoService historicoSituacaoEquipamentoService;	
	
	@GetMapping
	public List<HistoricoSituacaoEquipamento> buscarTodos() {
		return historicoSituacaoEquipamentoService.buscarTodos();
	}
	
	@GetMapping("/{id}")
	public Optional<HistoricoSituacaoEquipamento> buscaPorId(@PathVariable Long id){		
		Optional<HistoricoSituacaoEquipamento> historicoSituacaoEquipamento = historicoSituacaoEquipamentoService.buscarPorId(id);		
		return historicoSituacaoEquipamento;
	}	
	

}