package br.gov.cmb.cap.resource;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.gov.cmb.cap.entidade.FuncionamentoMaquina;
import br.gov.cmb.cap.service.FuncionamentoMaquinaService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/funcionamento-maquina")
public class FuncionamentoMaquinaResource {

	@Autowired
	FuncionamentoMaquinaService funcionamentoMaquinaService;	
	
	@GetMapping
	public List<FuncionamentoMaquina> buscarTotos() {
		List<FuncionamentoMaquina> funcionamentoMaquinas = new ArrayList<FuncionamentoMaquina>();
		funcionamentoMaquinas = funcionamentoMaquinaService.buscarTodos();
		return funcionamentoMaquinas;
	}
	
	@GetMapping("/{id}")
	public Optional<FuncionamentoMaquina> buscaPorId(@PathVariable Long id){		
		Optional<FuncionamentoMaquina> funcionamentoMaquina = funcionamentoMaquinaService.buscarPorId(id);		
		return funcionamentoMaquina;
	}	
	
	@PostMapping("/gerarCalendario")
	public void gerarCalendarioFuncionamento(@RequestBody FuncionamentoMaquina funcionamentoMaquina) {		
		funcionamentoMaquinaService.salvar(funcionamentoMaquina);
	}

}