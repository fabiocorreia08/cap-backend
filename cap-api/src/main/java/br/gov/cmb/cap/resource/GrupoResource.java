package br.gov.cmb.cap.resource;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.gov.cmb.cap.entidade.Grupo;
import br.gov.cmb.cap.service.GrupoService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/grupo")
public class GrupoResource {

	@Autowired
	GrupoService grupoService;	
	
	@GetMapping
	public List<Grupo> buscarTotos() {
		List<Grupo> grupos = new ArrayList<Grupo>();
		grupos = grupoService.buscarTodos();
		return grupos;
	}
	
	@GetMapping("/{id}")
	public Grupo buscaPorId(@PathVariable Long id){		
		Grupo grupo = grupoService.buscarPorId(id);		
		return grupo;
	}	
	
	@GetMapping("/migrar-grupo")
	public void migrarGrupo() {		
		grupoService.migrarGrupo();
	}
	
}