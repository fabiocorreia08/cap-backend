package br.gov.cmb.cap.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.gov.cmb.cap.entidade.Equipamento;
import br.gov.cmb.cap.entidade.Grupo;
import br.gov.cmb.cap.entidade.GrupoOld;
import br.gov.cmb.cap.entidade.SubGrupoOld;
import br.gov.cmb.cap.enums.SimNaoEnum;
import br.gov.cmb.cap.repository.EquipamentoRepository;
import br.gov.cmb.cap.repository.GrupoOldRepository;
import br.gov.cmb.cap.repository.GrupoRepository;
import br.gov.cmb.cap.repository.SubGrupoOldRepository;

@Service
public class GrupoService {
	
	@Autowired
	GrupoRepository grupoRepo;
	
	@Autowired
	GrupoOldRepository gupoOldRepo;
	
	@Autowired
	SubGrupoOldRepository subGupoOldRepo;
	
	@Autowired
	EquipamentoRepository equipamentoRepo;
		
	public List<Grupo> buscarTodos() {
		List<Grupo> grupos = new ArrayList<Grupo>();
		grupos = grupoRepo.findAll();		
		return grupos;
	}
		
	public Grupo buscarPorId(Long id) {
		return grupoRepo.getOne(id);	
	}
		
	public void migrarGrupo() {	
		
		List<GrupoOld> gruposOld = new ArrayList<GrupoOld>();
				
		gruposOld = gupoOldRepo.findAll();
		
		for (GrupoOld grupoOld : gruposOld) {
			
			Equipamento equipamento = new Equipamento();
			equipamento = equipamentoRepo.findByCodManutencao(grupoOld.getCodEquip().substring(0, 3)+"0"+grupoOld.getCodEquip().substring(3, 5));
			Grupo grupo = new Grupo();
			grupo.setEquipamento(equipamento);
			grupo.setDescricaoGrupo(grupoOld.getNomGrupo());
			grupo.setCodigoSequencia(grupoOld.getCodGrupo());
			
			grupo.setFlagEletricista(SimNaoEnum.N);
			grupo.setFlagEletronico(SimNaoEnum.N);
			grupo.setFlagEngenharia(SimNaoEnum.N);
			grupo.setFlagMecanico(SimNaoEnum.N);
			grupo.setFlagPreventiva(SimNaoEnum.N);
			grupo.setFlagTI(SimNaoEnum.N);
			grupo.setFlagUtilidades(SimNaoEnum.N);
			
			grupoRepo.save(grupo);	
			
			migrarSubGrupo(grupoOld, equipamento, grupo);
			
		}
		
	} 
	
	public void migrarSubGrupo(GrupoOld grupoOld, Equipamento equipamento, Grupo grupo) {
		List<SubGrupoOld> subGruposOld = new ArrayList<SubGrupoOld>();
		subGruposOld = subGupoOldRepo.findByCodGrupo(grupoOld.getCodGrupo());
		
		for (SubGrupoOld subGrupoOld : subGruposOld) {				
			
			if(subGrupoOld.getCodGrupo().equals(grupoOld.getCodGrupo())) {
				Grupo subgrupo = new Grupo();
				subgrupo.setEquipamento(equipamento);
				subgrupo.setDescricaoGrupo(subGrupoOld.getNomSubGrupo());
				subgrupo.setGrupoPai(grupo);
				subgrupo.setCodigoSequencia(subGrupoOld.getCodSubGrupo());
				
				subgrupo.setFlagEletricista(SimNaoEnum.N);
				subgrupo.setFlagEletronico(SimNaoEnum.N);
				subgrupo.setFlagEngenharia(SimNaoEnum.N);
				subgrupo.setFlagMecanico(SimNaoEnum.N);
				subgrupo.setFlagPreventiva(SimNaoEnum.N);
				subgrupo.setFlagTI(SimNaoEnum.N);
				subgrupo.setFlagUtilidades(SimNaoEnum.N);
				
				grupoRepo.save(subgrupo);
				
			}			
		}
	}

}
