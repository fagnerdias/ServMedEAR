package interfaces;

import javax.ejb.Local;

import modelo.Consulta;
import modelo.Consultorio;
import modelo.Medico;
import modelo.Paciente;

@Local
public interface IMedico {
	void iniciarConsulta(Paciente paciente, Consulta consulta);
	void atualizarAvaliacao(Consulta consulta);
	void finalizarConsulta(Paciente paciente);
}
