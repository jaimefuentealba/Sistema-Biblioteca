/**
 * 
 */
package baseDeDatos;

/**
 * @author jaime fuentealba
 * @version 1.0
 *
 */
public class Revista {
	
	private String nombre;
	private int periodicidad;
	private int cantidadEjemplaresPeriodico;
	private int cantidadPagina;
	private Issn issn;
	private boolean traducidad;
	
	//constructor sin parametros
	/**
	 * 
	 */
	public Revista() {
		super();
	}

	/**
	 * @param nombre
	 * @param periodicidad
	 * @param cantidadEjemplaresPeriodico
	 * @param cantidadPagina
	 * @param issn
	 * @param traducidad
	 */
	public Revista(String nombre, int periodicidad, int cantidadEjemplaresPeriodico, int cantidadPagina, Issn issn,
			boolean traducidad) {
		super();
		this.nombre = nombre;
		this.periodicidad = periodicidad;
		this.cantidadEjemplaresPeriodico = cantidadEjemplaresPeriodico;
		this.cantidadPagina = cantidadPagina;
		this.issn = issn;
		this.traducidad = traducidad;
	}
	// set y get

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the periodicidad
	 */
	public int getPeriodicidad() {
		return periodicidad;
	}

	/**
	 * @param periodicidad the periodicidad to set
	 */
	public void setPeriodicidad(int periodicidad) {
		this.periodicidad = periodicidad;
	}

	/**
	 * @return the cantidadEjemplaresPeriodico
	 */
	public int getCantidadEjemplaresPeriodico() {
		return cantidadEjemplaresPeriodico;
	}

	/**
	 * @param cantidadEjemplaresPeriodico the cantidadEjemplaresPeriodico to set
	 */
	public void setCantidadEjemplaresPeriodico(int cantidadEjemplaresPeriodico) {
		this.cantidadEjemplaresPeriodico = cantidadEjemplaresPeriodico;
	}

	/**
	 * @return the cantidadPagina
	 */
	public int getCantidadPagina() {
		return cantidadPagina;
	}

	/**
	 * @param cantidadPagina the cantidadPagina to set
	 */
	public void setCantidadPagina(int cantidadPagina) {
		this.cantidadPagina = cantidadPagina;
	}

	/**
	 * @return the issn
	 */
	public Issn getIssn() {
		return issn;
	}

	/**
	 * @param issn the issn to set
	 */
	public void setIssn(Issn issn) {
		this.issn = issn;
	}

	/**
	 * @return the traducidad
	 */
	public boolean isTraducidad() {
		return traducidad;
	}

	/**
	 * @param traducidad the traducidad to set
	 */
	public void setTraducidad(boolean traducidad) {
		this.traducidad = traducidad;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	
	//toString
	@Override
	public String toString() {
		return "Revista [nombre=" + nombre + ", periodicidad=" + periodicidad + ", cantidadEjemplaresPeriodico="
				+ cantidadEjemplaresPeriodico + ", cantidadPagina=" + cantidadPagina + ", issn=" + issn
				+ ", traducidad=" + traducidad + "]";
	}
	
	
	

}
