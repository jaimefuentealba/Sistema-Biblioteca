/**
 * 
 */
package baseDeDatos;

/**
 * @author USUARIO
 *
 */
public final class Isbn {
	
	private String eanlnternacional;
	private String paisOrigen;
	private String idEditor;
	private String idTitulo;
	private String verificador;
	
	//constructor sin parametros
	/**
	 * 
	 */
	public Isbn() {
		super();
	}
	
	//constructor con parametros

	/**
	 * @param eanlnternacional
	 * @param paisOrigen
	 * @param idEditor
	 * @param idTitulo
	 * @param verificador
	 */
	public Isbn(String eanlnternacional, String paisOrigen, String idEditor, String idTitulo, String verificador) {
		super();
		this.eanlnternacional = eanlnternacional;
		this.paisOrigen = paisOrigen;
		this.idEditor = idEditor;
		this.idTitulo = idTitulo;
		this.verificador = verificador;
	}

	/**
	 * @return the eanlnternacional
	 */
	public String getEanlnternacional() {
		return eanlnternacional;
	}

	/**
	 * @param eanlnternacional the eanlnternacional to set
	 */
	public void setEanlnternacional(String eanlnternacional) {
		this.eanlnternacional = eanlnternacional;
	}

	/**
	 * @return the paisOrigen
	 */
	public String getPaisOrigen() {
		return paisOrigen;
	}

	/**
	 * @param paisOrigen the paisOrigen to set
	 */
	public void setPaisOrigen(String paisOrigen) {
		this.paisOrigen = paisOrigen;
	}

	/**
	 * @return the idEditor
	 */
	public String getIdEditor() {
		return idEditor;
	}

	/**
	 * @param idEditor the idEditor to set
	 */
	public void setIdEditor(String idEditor) {
		this.idEditor = idEditor;
	}

	/**
	 * @return the idTitulo
	 */
	public String getIdTitulo() {
		return idTitulo;
	}

	/**
	 * @param idTitulo the idTitulo to set
	 */
	public void setIdTitulo(String idTitulo) {
		this.idTitulo = idTitulo;
	}

	/**
	 * @return the verificador
	 */
	public String getVerificador() {
		return verificador;
	}

	/**
	 * @param verificador the verificador to set
	 */
	public void setVerificador(String verificador) {
		this.verificador = verificador;
	}
	
	public void impresion(){
		System.out.println(""+getEanlnternacional()+"Pais de origen: "+getPaisOrigen()+"Editor: "+getIdEditor()+"Titulo"+getIdTitulo()+ "verificador :"+getVerificador());
	}

}
