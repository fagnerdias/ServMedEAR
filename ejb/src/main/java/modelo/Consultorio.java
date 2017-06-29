package modelo;

import java.io.Serializable;
import java.util.ArrayList;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;


@Entity
@SequenceGenerator(name = "SEQ_CONSULTORIO", initialValue = 1, allocationSize = 1, sequenceName = "seq_consultorio")
public class Consultorio implements Serializable{
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_CONSULTORIO")
    @Column(name = "id_Consultorio")
	private Integer id;
    String nome;
    String endereco;
    String telefone;
   // @OneToMany(mappedBy = "consultorio")
    ArrayList<Medico> medicos = new ArrayList<Medico>();

    public Consultorio(){}

    public Consultorio(String nome, String endereco, String telefone, ArrayList<Medico> medicos){
        this.medicos = medicos;
        this.telefone = telefone;
        this.endereco = endereco;
        this.nome = nome;

    }

    public String getNome(){
        return this.nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getEndereco(){
        return this.endereco;
    }
    public void setEndereco(String endereco){
        this.endereco = endereco;
    }
    public String getTelefone(){
        return this.telefone;
    }
    public void setTelefone(String telefone){
        this.telefone = telefone;
    }
    public ArrayList<Medico> getListMedicos(){
        return this.medicos;
    }
    public void setListMedicos(ArrayList<Medico> medicos){
        this.medicos = medicos;
    }

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public ArrayList<Medico> getMedicos() {
		return medicos;
	}

	public void setMedicos(ArrayList<Medico> medicos) {
		this.medicos = medicos;
	}
    
}