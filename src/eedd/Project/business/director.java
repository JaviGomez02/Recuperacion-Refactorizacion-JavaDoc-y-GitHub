package eedd.Project.business;

/**
 * Clase director
 * @author Javi
 *
 */
public class director extends Persona {
	
	/**
	 * Constructor de la clase
	 */
	public director() {
		super();
		this.nombre = super.nombre;
		this.apellidos = super.apellidos;
		this.dni = super.dni;
		this.fechaNacimiento = super.fechaNacimiento;
	}

	@Override
	public int getSalario() {
		return 2300;
	}

	
}