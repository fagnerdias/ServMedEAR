package modelo;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;


@Entity
@SequenceGenerator(name = "SEQ_PESSOA", initialValue = 1, allocationSize = 1, sequenceName = "seq_pessoa")
public class Pessoa implements Serializable{
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_PESSOA")
    @Id
    Integer id;
    String cpf;
	String nome;
    String email;
    Date aniversario;
    String endereco;
    String telefone;

    public Pessoa(){ }

    public Pessoa(String nome, String cpf, String email, Date aniversario,
     String endereco, String telefone){
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.aniversario = aniversario;
        this.endereco = endereco;
        this.telefone = telefone;

    }

    public String getNome(){
        return this.nome;
    }
    public String getCpf(){
        return this.cpf;
    }
    public String getEmail(){
        return this.email;
    }
    public Date getAniversario(){
        return this.aniversario;
    }
    public String getEndereco(){
        return this.endereco;
    }
    public String getTelefone(){
        return this.telefone;
    }

    public void setNome(String nome){
         this.nome = nome ;
    }
    public void seCpf(String cpf){
        this.cpf = cpf;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public void setAniversario(Date aniversario){
        this.aniversario = aniversario;
    }
    public void setEndereco(String endereco){
        this.endereco = endereco;
    }
    public void setTelefone(String telefone){
        this.telefone = telefone;
    }
}