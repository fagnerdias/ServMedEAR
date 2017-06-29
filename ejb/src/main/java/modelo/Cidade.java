package modelo;

import java.util.ArrayList;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import java.io.Serializable;


@Entity
@SequenceGenerator(name = "SEQ_CIDADE", initialValue = 1, allocationSize = 1, sequenceName = "seq_cidade")
public class Cidade implements Serializable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_CIDADE")
	@Column(name="id_cidade")
	private Integer id;
    private String nome;
    
    
   // @OneToMany(mappedBy="cidade")
    private ArrayList<Regiao>regioes;

    public Cidade(){}

    public Cidade(String nome, ArrayList<Regiao>regioes){
        this.nome = nome;
        this.regioes = regioes;
    }

    public String getNome(){
        return this.nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public ArrayList<Regiao> getListRegiao(){
        return this.regioes;
    }
    public void setListRegiao(ArrayList<Regiao> regioes){
        this.regioes = regioes;
    }

	public Integer getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public ArrayList<Regiao> getRegioes() {
		return regioes;
	}

	public void setRegioes(ArrayList<Regiao> regioes) {
		this.regioes = regioes;
	}
    
}