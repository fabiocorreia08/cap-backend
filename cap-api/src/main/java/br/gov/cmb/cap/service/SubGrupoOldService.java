package br.gov.cmb.cap.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.gov.cmb.cap.entidade.GrupoOld;
import br.gov.cmb.cap.repository.GrupoOldRepository;

@Service
public class SubGrupoOldService {
	
	@Autowired
	GrupoOldRepository grupoOldRepo;
		
	public List<GrupoOld> buscarTodos() {
		List<GrupoOld> gruposOld = new ArrayList<GrupoOld>();
		gruposOld = grupoOldRepo.findAll();
		return gruposOld;
	}
		
	public Optional<GrupoOld> buscarPorId(Long id) {
		return grupoOldRepo.findById(id);	
	}	

}
