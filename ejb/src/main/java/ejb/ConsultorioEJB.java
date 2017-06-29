package ejb;

import javax.ejb.EJB;

import dao.ConsultaDao;
import dao.ConsultorioDao;
import dao.MedicoDao;
import dao.PacienteDao;
import interfaces.IConsultorio;
import modelo.Consulta;
import modelo.Consultorio;
import modelo.Medico;
import modelo.Paciente;

public class ConsultorioEJB implements IConsultorio{
	
	@EJB ConsultorioDao consultorioDao;
	@EJB PacienteDao pDao;
	@EJB MedicoDao mDao;
	@EJB ConsultaDao cDao;

	@Override
	public void marcarConsulta(Consultorio consultorio, Medico medico, Paciente paciente) {
		Consulta consulta = new Consulta();
		consulta.setLocal(consultorioDao.searchById(consultorio.getId()));
		consulta.setMedico(mDao.searchByCrm(medico.getCrm()));
		consulta.setPaciente(pDao.searchByCpf(paciente.getCpf()));
		consulta.setAgendada(true);
		cDao.save(consulta);
	}

			
}
