/**
 * 
 */
package baseDeDatos;

/**
 * @author jaime fuentealba
 * @version 1.0
 *
 */
public class LibroConCD extends Libro {
	
	// Atributo
	
	private CD cd;
	
	//constructor sin parmetros

	/**
	 * 
	 */
	public LibroConCD() {
		super();
	}
	
	//constructor con todos los parametros

	/**
	 * @param cd
	 */
	public LibroConCD(CD cd) {
		super();
		this.cd = cd;
	}
	
	//setter y getter

	public CD getCd() {
		return cd;
	}

	public void setCd(CD cd) {
		this.cd = cd;
	}
	
	// metodo de impresion
	public void impresion(){
		System.out.println("Cd:"+getCd());
	}

}
