package dao;


import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import modelo.Consulta;

@Stateless
public class ConsultaDao {

	private EntityManager manager;
	
	
	public Consulta save(Consulta consulta){
		try{
			manager.persist(consulta);
			System.out.println("consulta persistida com sucesso!");
		}catch(Exception e){
			e.printStackTrace();
		}
		return consulta;
	}
	
	public List<Consulta> listarConsulta(){
		TypedQuery<Consulta> query = manager.createQuery("Selected c from Consulta c", Consulta.class);
		List<Consulta> consultas = query.getResultList();
		System.out.println("lista de consultas no banco");
		return consultas;
	}
	
	public Consulta searchById(Integer id){
		Consulta consulta = manager.find(Consulta.class, id);
		return consulta;
		
	}
	
	public Consulta editar(Consulta consulta){
		try{
			System.out.println("Cidade atualizada com sucesso!");
			manager.merge(consulta);
		}catch(Exception e){
			e.printStackTrace();
		}
		return consulta;
	}
	
	public Consulta remove(Consulta consulta){
		manager.remove(manager.merge(consulta));
		return consulta;
	}

}
