package eedd.Project.business;

/**
 * Clase profesor
 * @author Javi
 *
 */
public class Profesor extends Persona {
	/**
	 * Especialidad del profesor
	 */
	private String especialidad;
	/**
	 * Constructor que no recibe ning�n par�metro
	 */
	public Profesor() {
		super();
	}
	/**
	 * Constructor que recibe el par�metro especialidad
	 * @param especialidad Especialidad
	 */
	public Profesor(String especialidad) {
		super();
		this.nombre = super.nombre;
		this.apellidos = super.apellidos;
		this.dni = super.dni;
		this.fechaNacimiento = super.fechaNacimiento;
		this.especialidad=especialidad;
	}
	/**
	 * M�todo que devuelve la especialidad del profesor
	 * @return Especialidad del profesor
	 */
	public String getEspecialidad() {
		return especialidad;
	}
	/**
	 * M�todo que asigna una especialidad al profesor
	 * @param especialidad Especialidad a asignar
	 */
	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}

	@Override
	public int getSalario() {
		return 1900;
	}
}