/**
 * 
 */
package baseDeDatos;

/**
 * @author jaime fuentealba
 * @version 1.0
 *
 */
public abstract class Publicacion {
	
	// Atributos
	
	private String titulo;
	private int añoEdicion;
	private Autor autor;
	private int codigoInterno;
	private static int siguenteCodigoDisponible = 1;
	private String descripcion;
	private Editorial editorial;
	
	//constructor sin parametro
	/**
	 * 
	 */
	public Publicacion() {
		super();
	}
	
	//constructor con parametros

	/**
	 * @param titulo
	 * @param añoEdicion
	 * @param autor
	 * @param codigoInterno
	 * @param descripcion
	 * @param editorial
	 */
	public Publicacion(String titulo, int añoEdicion, Autor autor, String descripcion,
			Editorial editorial) {
		super();
		this.titulo = titulo;
		this.añoEdicion = añoEdicion;
		this.autor = autor;
		this.descripcion = descripcion;
		this.editorial = editorial;
		
	}

	//set y get
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getAñoEdicion() {
		return añoEdicion;
	}

	public void setAñoEdicion(int añoEdicion) {
		this.añoEdicion = añoEdicion;
	}

	public Autor getAutor() {
		return autor;
	}

	public void setAutor(Autor autor) {
		this.autor = autor;
	}

	public int getCodigoInterno() {
		return codigoInterno;
	}

	public void setCodigoInterno(int codigoInterno) {
		this.codigoInterno = codigoInterno;
	}

	public static int getSiguenteCodigoDisponible() {
		return siguenteCodigoDisponible;
	}

	public static void setSiguenteCodigoDisponible(int siguenteCodigoDisponible) {
		Publicacion.siguenteCodigoDisponible = siguenteCodigoDisponible;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Editorial getEditorial() {
		return editorial;
	}

	public void setEditorial(Editorial editorial) {
		this.editorial = editorial;
	}
	
	//toString

	@Override
	public String toString() {
		return "Publicacion [titulo=" + titulo + ", añoEdicion=" + añoEdicion + ", autor=" + autor + ", codigoInterno="
				+ codigoInterno + ", descripcion=" + descripcion + ", editorial=" + editorial + "]";
	}
	
	
	
	
	

}
