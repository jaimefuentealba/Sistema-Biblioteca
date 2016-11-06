/**
 * 
 */
package baseDeDatos;

/**
 * @author USUARIO
 *
 */
public class Editorial {
	
	//Atributos
	
	private String nombre;
	private int a�oCreacion;
	private String representanteLegal;
	private int codigo;
	private String paisSede;
	
	//constructor sin parametros
	
	/**
	 * 
	 */
	public Editorial() {
		super();
	}
	
	//constructor con parametros

	/**
	 * @param nombre
	 * @param a�oCreacion
	 * @param representanteLegal
	 * @param codigo
	 * @param paisSede
	 */
	public Editorial(String nombre, int a�oCreacion, String representanteLegal, int codigo, String paisSede) {
		super();
		this.nombre = nombre;
		this.a�oCreacion = a�oCreacion;
		this.representanteLegal = representanteLegal;
		this.codigo = codigo;
		this.paisSede = paisSede;
	}
	
	//setter y getter

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getA�oCreacion() {
		return a�oCreacion;
	}

	public void setA�oCreacion(int a�oCreacion) {
		this.a�oCreacion = a�oCreacion;
	}

	public String getRepresentanteLegal() {
		return representanteLegal;
	}

	public void setRepresentanteLegal(String representanteLegal) {
		this.representanteLegal = representanteLegal;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getPaisSede() {
		return paisSede;
	}

	public void setPaisSede(String paisSede) {
		this.paisSede = paisSede;
	}
	
	//toString sobre escrito

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Editorial [nombre=" + nombre + ", a�oCreacion=" + a�oCreacion + ", representanteLegal="
				+ representanteLegal + ", codigo=" + codigo + ", paisSede=" + paisSede + "]";
	}
	
	
	

}
