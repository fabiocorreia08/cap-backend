package br.gov.cmb.cap.resource;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.gov.cmb.cap.entidade.FuncionamentoMaquinaDia;
import br.gov.cmb.cap.service.FuncionamentoMaquinaDiaService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/funcionamento-maquina-dia")
public class FuncionamentoMaquinaDiaResource {

	@Autowired
	FuncionamentoMaquinaDiaService funcionamentoMaquinaDiaService;	
	
	@GetMapping
	public List<FuncionamentoMaquinaDia> buscarTotos() {
		return funcionamentoMaquinaDiaService.buscarTodos();
	}
	
	@GetMapping("/{id}")
	public Optional<FuncionamentoMaquinaDia> buscaPorId(@PathVariable Long id){		
		Optional<FuncionamentoMaquinaDia> funcionamentoMaquinaDia = funcionamentoMaquinaDiaService.buscarPorId(id);		
		return funcionamentoMaquinaDia;
	}	
		

}