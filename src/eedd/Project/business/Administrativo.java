package eedd.Project.business;
/**
 * Clase administrativo
 * @author Javi
 *
 */
public class Administrativo extends Persona {
	/**
	 * Categor�a del administrativo
	 */
	private String categoria;
	/**
	 * Constructor que no recibe ning�n par�metro
	 */
	public Administrativo() {
		super();
	}
	/**
	 * Constructor que el par�metro categoria
	 * @param categoria Categor�a
	 */
	public Administrativo(String categoria) {
		super();
		this.nombre = super.nombre;
		this.apellidos = super.apellidos;
		this.dni = super.dni;
		this.fechaNacimiento = super.fechaNacimiento;
		this.categoria=categoria;
	}
	/**
	 * M�todo que devuelve la categor�a del administrativo
	 * @return Categor�a
	 */
	public String getCategoria() {
		return categoria;
	}
	/**
	 * M�todo que asigna una categor�a al administrativo
	 * @param categoria Categor�a que recibe para asignarla
	 */
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	@Override
	public int getSalario() {
		int result = 0;
		if (this.categoria.equals("A"))
			result = 1500;
		else 
			result = 1200;
			
		return result;
	}
	
}