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
	private int añoCreacion;
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
	 * @param añoCreacion
	 * @param representanteLegal
	 * @param codigo
	 * @param paisSede
	 */
	public Editorial(String nombre, int añoCreacion, String representanteLegal, int codigo, String paisSede) {
		super();
		this.nombre = nombre;
		this.añoCreacion = añoCreacion;
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

	public int getAñoCreacion() {
		return añoCreacion;
	}

	public void setAñoCreacion(int añoCreacion) {
		this.añoCreacion = añoCreacion;
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
		return "Editorial [nombre=" + nombre + ", añoCreacion=" + añoCreacion + ", representanteLegal="
				+ representanteLegal + ", codigo=" + codigo + ", paisSede=" + paisSede + "]";
	}
	
	
	

}
