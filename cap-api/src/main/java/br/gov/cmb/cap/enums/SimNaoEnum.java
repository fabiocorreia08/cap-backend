package br.gov.cmb.cap.enums;

public enum SimNaoEnum {
	
	S("S"),
	N("N");
	
	public String label;
	
	SimNaoEnum(String label) {
		this.label = label;
	}	
	
	public static SimNaoEnum getSimNaoEnumPor(String chave) {
		if (SimNaoEnum.S.label.equals(chave)) {
			return SimNaoEnum.S;
		} else if (SimNaoEnum.N.label.equals(chave)) {
			return SimNaoEnum.N;
		} else {
			return null;
		}
	}

}
