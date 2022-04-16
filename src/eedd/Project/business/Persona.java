package eedd.Project.business;

import java.util.Date;
import java.util.Objects;
/**
 * Clase padre Persona
 * @author Javi
 *
 */
public abstract class Persona {
	/**
	 * Nombre de la persona
	 */
	protected String nombre;
	/**
	 * Apellidos de la persona
	 */
	protected String apellidos;
	/**
	 * DNI de la persona
	 */
	protected String dni;
	/**
	 * Fecha de nacimiento de la persona
	 */
	protected Date fechaNacimiento;
	/**
	 * Horarario de trabajo de la Persona
	 */
	public String horarioAsignado;
	/**
	 * Hora de entrada de la persona
	 */
	public int horaEntrada;
	/**
	 * Hora de salida de la persona
	 */
	public int horaSalida;

	/**
	 * Constructor que no recibe ningún parámetro
	 */
	public Persona() {
		super();
	}
	/**
	 * Constructor que recibe todos los parámetros
	 * @param nombre Nombre
	 * @param apellidos Apellidos
	 * @param dni DNI
	 * @param fechaNacimiento Fecha de nacimiento
	 * @param horarioAsignado Horario de trabajo
	 * @param horaEntrada Hora de entrada
	 * @param horaSalida Hora de salida
	 */
	public Persona(String nombre, String apellidos, String dni, Date fechaNacimiento, String horarioAsignado, int horaEntrada, int horaSalida) {
		super();
		this.nombre=nombre;
		this.apellidos=apellidos;
		this.dni=dni;
		this.fechaNacimiento=fechaNacimiento;
		this.horarioAsignado=horarioAsignado;
		this.horaEntrada=horaEntrada;
		this.horaSalida=horaSalida;
	}
	/**
	 * Método que devuelve el nombre
	 * @return Nombre de la persona
	 */
	public String getNombre() {
		return nombre;
	}
	/**
	 * Método que recibe un nombre para asignarlo a la clase
	 * @param nombre Nombre que recibe
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	/**
	 * Método que devuelve los apellidos
	 * @return Apellidos de la persona
	 */
	public String getApellidos() {
		return apellidos;
	}

	/**
	 * Método que asigna apellidos a la persona
	 * @param apellidos Apellidos que recibe para asignarlo
	 */
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	/**
	 * Método que devuelve el DNI 
	 * @return DNI de la persona
	 */
	public String getDni() {
		return dni;
	}
	/**
	 * Método para asignar un DNI a la persona
	 * @param dni DNI que recibe para asignarlo 
	 */
	public void setDni(String dni) {
		this.dni = dni;
	}
	/**
	 * Método que devuelve la fecha de nacimiento
	 * @return Fecha de nacimiento de la persona
	 */
	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}
	/**
	 * Método para asignar una fecha de nacimiento a la persona
	 * @param fechaNacimiento La fecha de nacimiento que recibe para asignarla
	 */
	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	/**
	 * Método que devuelve el salario
	 * @return Salario de la persona
	 */
	public abstract int getSalario();

	@Override
	public int hashCode() {
		return Objects.hash(dni);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		director other = (director) obj;
		return Objects.equals(dni, other.dni);
	}

	@Override
	public String toString() {
		return "director [nombre=" + nombre + ", apellidos=" + apellidos + ", dni=" + dni + ", fechaNacimiento="
				+ fechaNacimiento + ", horarioAsignado=" + horarioAsignado + ", horaEntrada=" + horaEntrada
				+ ", horaSalida=" + horaSalida + "]";
	}

}