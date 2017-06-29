package dao;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import modelo.Consulta;
import modelo.Consultorio;
import modelo.Paciente;

@Stateless
public class PacienteDao {

	private EntityManager manager;
	
	
	public Paciente save(Paciente paciente){
		try{
			manager.persist(paciente);
			System.out.println("paciente persistida com sucesso!");
		}catch(Exception e){
			e.printStackTrace();
		}
		return paciente;
	}
	
	public List<Paciente> listarpaciente(){
		TypedQuery<Paciente> query = manager.createQuery("Selected c from paciente c", Paciente.class);
		List<Paciente> pacientes = query.getResultList();
		return pacientes;
	}
	
	public Paciente searchById(Integer id){
		Paciente paciente = manager.find(Paciente.class, id);
		return paciente;
	}	
	
	public Paciente searchByCpf(String cpf) {
		Paciente paciente = manager.find(Paciente.class, cpf);
		return paciente;
	}
	
	public String historicoPaciente(Paciente paciente, Consulta consulta) {
		Consulta historico = manager.find(Consulta.class, Integer.parseInt(paciente.getCpf()));
		return historico.getAvaliacao();
	}
	public Paciente editar(Paciente paciente){
		try{
			System.out.println("Paciente atualizada com sucesso!");
			manager.merge(paciente);
		}catch(Exception e){
			e.printStackTrace();
		}
		return paciente;
	}
	
	public Paciente remove(Paciente paciente){
		manager.remove(manager.merge(paciente));
		return paciente;
	}
}
