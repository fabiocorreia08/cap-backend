package br.gov.cmb.cap.resource;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.gov.cmb.cap.entidade.Equipamento;
import br.gov.cmb.cap.service.EquipamentoService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/equipamento")
public class EquipamentoResource {

	@Autowired
	EquipamentoService equipamentoService;	
	
	@GetMapping
	public List<Equipamento> buscarTotos() {
		List<Equipamento> equipamentos = new ArrayList<Equipamento>();
		equipamentos = equipamentoService.buscarTodos();
		return equipamentos;
	}
	
	@GetMapping("/{id}")
	public Optional<Equipamento> buscaPorId(@PathVariable Long id){		
		Optional<Equipamento> equipamento = equipamentoService.buscarPorId(id);		
		return equipamento;
	}	
	
	@GetMapping("/migrar-equipamento")
	public void migrarEquipamento() {		
		equipamentoService.migrarEquipamento();
	}
	
}