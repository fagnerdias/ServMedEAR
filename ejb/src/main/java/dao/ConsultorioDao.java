package dao;


import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import modelo.Consultorio;

@Stateless
public class ConsultorioDao {

	private EntityManager manager;
	
	
	public Consultorio save(Consultorio consultorio){
		try{
			manager.persist(consultorio);
			System.out.println("consultorio persistida com sucesso!");
		}catch(Exception e){
			e.printStackTrace();
		}
		return consultorio;
	}
	
	public List<Consultorio> listarconsultorio(){
		TypedQuery<Consultorio> query = manager.createQuery("Selected c from consultorio c", Consultorio.class);
		List<Consultorio> consultorios = query.getResultList();
		return consultorios;
	}
	
	public Consultorio searchById(Integer id){
		Consultorio consultorio = manager.find(Consultorio.class, id);
		return consultorio;
	}
	
	public Consultorio editar(Consultorio consultorio){
		try{
			System.out.println("consultorio atualizada com sucesso!");
			manager.merge(consultorio);
		}catch(Exception e){
			e.printStackTrace();
		}
		return consultorio;
	}
	
	public Consultorio remove(Consultorio consultorio){
		manager.remove(manager.merge(consultorio));
		return consultorio;
	}
}
