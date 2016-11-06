/**
 * 
 */
package baseDeDatos;

/**
 * @author jaime fuentealba
 *
 */
public class CD extends Publicacion {
	
	// Atributos
	
	private String tema;
	private Issn issn;
	private Tiempo duracion;
	private int cantidadPistas;
	
	//constructor sin parametros
	/**
	 * 
	 */
	public CD() {
		super();
	}
	
	//constructor con parametros

	/**
	 * @param tema
	 * @param issn
	 * @param duracion
	 * @param cantidadPistas
	 */
	public CD(String tema, Issn issn, Tiempo duracion, int cantidadPistas) {
		super();
		this.tema = tema;
		this.issn = issn;
		this.duracion = duracion;
		this.cantidadPistas = cantidadPistas;
	}

	public String getTema() {
		return tema;
	}

	public void setTema(String tema) {
		this.tema = tema;
	}

	public Issn getIssn() {
		return issn;
	}

	public void setIssn(Issn issn) {
		this.issn = issn;
	}

	public Tiempo getDuracion() {
		return duracion;
	}

	public void setDuracion(Tiempo duracion) {
		this.duracion = duracion;
	}

	public int getCantidadPistas() {
		return cantidadPistas;
	}

	public void setCantidadPistas(int cantidadPistas) {
		this.cantidadPistas = cantidadPistas;
	}
	
	// metodo de impresion
	public void impresion(){
		System.out.println("Tema: "+getTema()+" ISSN: "+getIssn()+" Duracion: "+getDuracion()+" Cantidad de pistas: "+getCantidadPistas());
	}
	

}
