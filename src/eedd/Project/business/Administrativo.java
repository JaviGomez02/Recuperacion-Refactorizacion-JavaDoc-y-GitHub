package eedd.Project.business;
/**
 * Clase administrativo
 * @author Javi
 *
 */
public class Administrativo extends Persona {
	/**
	 * Categoría del administrativo
	 */
	private String categoria;
	/**
	 * Constructor que no recibe ningún parámetro
	 */
	public Administrativo() {
		super();
	}
	/**
	 * Constructor que el parámetro categoria
	 * @param categoria Categoría
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
	 * Método que devuelve la categoría del administrativo
	 * @return Categoría
	 */
	public String getCategoria() {
		return categoria;
	}
	/**
	 * Método que asigna una categoría al administrativo
	 * @param categoria Categoría que recibe para asignarla
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