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
	private int a�oEdicion;
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
	 * @param a�oEdicion
	 * @param autor
	 * @param codigoInterno
	 * @param descripcion
	 * @param editorial
	 */
	public Publicacion(String titulo, int a�oEdicion, Autor autor, String descripcion,
			Editorial editorial) {
		super();
		this.titulo = titulo;
		this.a�oEdicion = a�oEdicion;
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

	public int getA�oEdicion() {
		return a�oEdicion;
	}

	public void setA�oEdicion(int a�oEdicion) {
		this.a�oEdicion = a�oEdicion;
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
		return "Publicacion [titulo=" + titulo + ", a�oEdicion=" + a�oEdicion + ", autor=" + autor + ", codigoInterno="
				+ codigoInterno + ", descripcion=" + descripcion + ", editorial=" + editorial + "]";
	}
	
	
	
	
	

}
