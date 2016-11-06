/**
 * 
 */
package baseDeDatos;

/**
 * @author jaime fuentealba
 * @version 1.0
 *
 */
public class Autor extends Persona {
	
	// Atributos
	
	private String nacionalidad;
	private boolean casado;
	
	//constructor sin parámetros
	
	/**
	 * 
	 */
	public Autor() {
		super();
	}
	
	//constructor con parametros

	/**
	 * @param nacionalidad
	 * @param casado
	 */
	public Autor(String nacionalidad, boolean casado) {
		super();
		this.nacionalidad = nacionalidad;
		this.casado = casado;
	}
	
	//setter y getter

	public String getNacionalidad() {
		return nacionalidad;
	}

	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}

	public boolean isCasado() {
		return casado;
	}

	public void setCasado(boolean casado) {
		this.casado = casado;
	}
	
	// Metodo de impresion
	public void impresion(){
		System.out.println("Nacionalidad:"+getNacionalidad()+", Casado: "+isCasado());
	}
	
	
	 
	

}
