/**
 * 
 */
package baseDeDatos;

/**
 * @author jaime fuentealba
 *
 */
public class Libro extends Publicacion {
	
	protected String tema;
	protected int version;
	protected int cantidadTomos;
	protected int cantidadPaginas;
	protected Isbn isbn;
	protected String idioma;
	
	
	//constructor vacio
	/**
	 * 
	 */
	public Libro() {
		super();
	}
	/**
	 * @param tema
	 * @param version
	 * @param cantidadTomos
	 * @param cantidadPaginas
	 * @param isbn
	 * @param idioma
	 */
	
	//constructor lleno
	public Libro(String tema, int version, int cantidadTomos, int cantidadPaginas, Isbn isbn, String idioma) {
		super();
		this.tema = tema;
		this.version = version;
		this.cantidadTomos = cantidadTomos;
		this.cantidadPaginas = cantidadPaginas;
		this.isbn = isbn;
		this.idioma = idioma;
		
		// set y get
	}
	/**
	 * @return the tema
	 */
	public String getTema() {
		return tema;
	}
	/**
	 * @param tema the tema to set
	 */
	public void setTema(String tema) {
		this.tema = tema;
	}
	/**
	 * @return the version
	 */
	public int getVersion() {
		return version;
	}
	/**
	 * @param version the version to set
	 */
	public void setVersion(int version) {
		this.version = version;
	}
	/**
	 * @return the cantidadTomos
	 */
	public int getCantidadTomos() {
		return cantidadTomos;
	}
	/**
	 * @param cantidadTomos the cantidadTomos to set
	 */
	public void setCantidadTomos(int cantidadTomos) {
		this.cantidadTomos = cantidadTomos;
	}
	/**
	 * @return the cantidadPaginas
	 */
	public int getCantidadPaginas() {
		return cantidadPaginas;
	}
	/**
	 * @param cantidadPaginas the cantidadPaginas to set
	 */
	public void setCantidadPaginas(int cantidadPaginas) {
		this.cantidadPaginas = cantidadPaginas;
	}
	/**
	 * @return the isbn
	 */
	public Isbn getIsbn() {
		return isbn;
	}
	/**
	 * @param isbn the isbn to set
	 */
	public void setIsbn(Isbn isbn) {
		this.isbn = isbn;
	}
	/**
	 * @return the idioma
	 */
	public String getIdioma() {
		return idioma;
	}
	/**
	 * @param idioma the idioma to set
	 */
	public void setIdioma(String idioma) {
		this.idioma = idioma;
	}
	
	//toString
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Libro [tema=" + tema + ", version=" + version + ", cantidadTomos=" + cantidadTomos
				+ ", cantidadPaginas=" + cantidadPaginas + ", isbn=" + isbn + ", idioma=" + idioma + "]";
	}
	
	

}
