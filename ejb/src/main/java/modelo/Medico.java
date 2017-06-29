package modelo;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class Medico extends Pessoa implements Serializable {

	@Column(name="id_Crm")
	String crm;
	String especializacao;
	String expediente;

	public Medico (){

	}

	public Medico (String crm, String especializacao, String expediente){
		super();
		this.crm = crm;
		this.especializacao = especializacao;
		this.expediente = expediente;
	}


	public String getCrm() {
		return crm;
	}

	public void setCrm(String crm) {
		this.crm = crm;
	}

	public String getEspecializacao() {
		return especializacao;
	}

	public void setEspecializacao(String especializacao) {
		this.especializacao = especializacao;
	}

	public String getExpediente(){
		return this.expediente;
	}

	public void setExpediente(String expediente){
		this.expediente = expediente;
	}

}
