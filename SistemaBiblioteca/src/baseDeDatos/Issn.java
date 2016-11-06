/**
 * 
 */
package baseDeDatos;

/**
 * @author jaime fuentealba
 * @version 1.0
 *
 */
public class Issn {
	
	private String greupoUno;
	private String grupoDos;
	private String digitoControl;
	
	// constructor sin parametros
	/**
	 * 
	 */
	public Issn() {
		super();
	}

	/**
	 * @param greupoUno
	 * @param grupoDos
	 * @param digitoControl
	 */
	public Issn(String greupoUno, String grupoDos, String digitoControl) {
		super();
		this.greupoUno = greupoUno;
		this.grupoDos = grupoDos;
		this.digitoControl = digitoControl;
	}

	/**
	 * @return the greupoUno
	 */
	public String getGreupoUno() {
		return greupoUno;
	}

	/**
	 * @param greupoUno the greupoUno to set
	 */
	public void setGreupoUno(String greupoUno) {
		this.greupoUno = greupoUno;
	}

	/**
	 * @return the grupoDos
	 */
	public String getGrupoDos() {
		return grupoDos;
	}

	/**
	 * @param grupoDos the grupoDos to set
	 */
	public void setGrupoDos(String grupoDos) {
		this.grupoDos = grupoDos;
	}

	/**
	 * @return the digitoControl
	 */
	public String getDigitoControl() {
		return digitoControl;
	}

	/**
	 * @param digitoControl the digitoControl to set
	 */
	public void setDigitoControl(String digitoControl) {
		this.digitoControl = digitoControl;
	}
	
	public void impresion(){
		System.out.println("grupo uno: "+getGreupoUno()+"grupo dos"+getGrupoDos()+"digito: "+getDigitoControl());
	}

}
