package modelo;

import java.io.Serializable;
import java.util.ArrayList;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
@SequenceGenerator(name = "SEQ_REGIAO", initialValue = 1, allocationSize = 1, sequenceName = "seq_regiao")
public class Regiao implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_REGIAO")
    @Column(name = "id_Regiao")
	private int id;
    String nome;
    ArrayList<Consultorio>consultorios = new ArrayList<Consultorio>();

    public Regiao(){}

    public Regiao(String nome, ArrayList<Consultorio> consultorios){
        this.nome = nome;
        this.consultorios = consultorios;
    }

    public String getNome(){
        return this.nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public ArrayList<Consultorio> getListConsultorio(){
        return this.consultorios;
    }
    public void setListConsultorio(ArrayList<Consultorio> consultorios){
        this.consultorios = consultorios;
    }
}