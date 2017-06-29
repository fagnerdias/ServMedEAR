package dao;


import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import modelo.Medico;

@Stateless
public class MedicoDao {

	private EntityManager manager;
	
	
	public Medico save(Medico medico){
		try{
			manager.persist(medico);
			System.out.println("medico persistida com sucesso!");
		}catch(Exception e){
			e.printStackTrace();
		}
		return medico;
	}
	
	public List<Medico> listarmedico(){
		TypedQuery<Medico> query = manager.createQuery("Selected c from medico c", Medico.class);
		List<Medico> medicos = query.getResultList();
		return medicos;
	}
	
	public Medico searchById(Integer id){
		Medico medico = manager.find(Medico.class, id);
		return medico;
	}
	
	public Medico searchByCrm(String crm) {
		Medico medico = manager.find(Medico.class, crm);
		return medico;
	}
	
	public Medico editar(Medico medico){
		try{
			System.out.println("medico atualizada com sucesso!");
			manager.merge(medico);
		}catch(Exception e){
			e.printStackTrace();
		}
		return medico;
	}
	
	public Medico remove(Medico medico){
		manager.remove(manager.merge(medico));
		return medico;
	}
	
}
