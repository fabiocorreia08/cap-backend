package br.gov.cmb.cap.service;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.gov.cmb.cap.entidade.FuncionamentoMaquina;
import br.gov.cmb.cap.entidade.FuncionamentoMaquinaDia;
import br.gov.cmb.cap.entidade.HistoricoSituacaoEquipamento;
import br.gov.cmb.cap.repository.FuncionamentoMaquinaRepository;
import br.gov.cmb.cap.repository.HistoricoSituacaoEquipamentoRepository;

@Service
public class FuncionamentoMaquinaService {
	
	@Autowired
	FuncionamentoMaquinaRepository funcionamentoMaquinaRepo;
	
	@Autowired
	HistoricoSituacaoEquipamentoRepository historicoSituacaoEquipamentoRepo;
	
	public List<FuncionamentoMaquina> buscarTodos() {
		List<FuncionamentoMaquina> funcionamentoMaquinas = new ArrayList<FuncionamentoMaquina>();
		funcionamentoMaquinas = funcionamentoMaquinaRepo.findAll();
		return funcionamentoMaquinas;
	}
		
	public Optional<FuncionamentoMaquina> buscarPorId(Long id) {
		return funcionamentoMaquinaRepo.findById(id);	
	}
		
	public void salvar(FuncionamentoMaquina funcionamentoMaquina) {		
		
		Date date = new Date();  
        Timestamp ts = new Timestamp(date.getTime());   
        
        List<HistoricoSituacaoEquipamento> historicoSituacaoEquipamentos = new ArrayList<HistoricoSituacaoEquipamento>();
        historicoSituacaoEquipamentos = historicoSituacaoEquipamentoRepo.findAll();
        
        for (HistoricoSituacaoEquipamento historicoSituacaoEquipamento : historicoSituacaoEquipamentos) {        	
        	
        		FuncionamentoMaquina funcionamentoMaquinaSalvar = new FuncionamentoMaquina();
        		        	
        		funcionamentoMaquinaSalvar.setIdEquipamento(historicoSituacaoEquipamento.getIdEquipamento());
        		funcionamentoMaquinaSalvar.setCentroCusto(historicoSituacaoEquipamento.getCentroCusto());
        		funcionamentoMaquinaSalvar.setMes(funcionamentoMaquina.getMes());
        		funcionamentoMaquinaSalvar.setAno(funcionamentoMaquina.getAno());        		
        		funcionamentoMaquinaSalvar.setQuantidadeHorasPadrao(funcionamentoMaquina.getQuantidadeHorasPadrao());
        		funcionamentoMaquinaSalvar.setCodigoUsuario(funcionamentoMaquina.getCodigoUsuario());
        		funcionamentoMaquinaSalvar.setDataUltimaAlteracao(ts);
        	    
        	    atribuirDias(funcionamentoMaquinaSalvar);
        	    
        		funcionamentoMaquinaRepo.save(funcionamentoMaquinaSalvar);			
		}	    
        		
	}	
	
	private void atribuirDias(FuncionamentoMaquina funcionamentoMaquina) {	
		
		List<FuncionamentoMaquinaDia> funcionamentoMaquinaDias = new ArrayList<FuncionamentoMaquinaDia>();
		
		for(int i=1; i <=31; i++) {			
			
			FuncionamentoMaquinaDia funcionamentoMaquinaDia = new FuncionamentoMaquinaDia();
			
			funcionamentoMaquinaDia.setFuncionamentoMaquina(funcionamentoMaquina);
			funcionamentoMaquinaDia.setNumeroDia(i);
			funcionamentoMaquinaDia.setQuantidadeHoras(funcionamentoMaquina.getQuantidadeHorasPadrao());			
			
			funcionamentoMaquinaDias.add(funcionamentoMaquinaDia);
			
			funcionamentoMaquina.setDiasFuncionamento(funcionamentoMaquinaDias);
			
		}
		
	}	
	 

}
