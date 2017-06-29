package interfaces;

import javax.ejb.Local;

import modelo.Consultorio;
import modelo.Medico;
import modelo.Paciente;

@Local
public interface IConsultorio {
	
	void marcarConsulta(Consultorio consultorio, Medico medico, Paciente paciente);
}