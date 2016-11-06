/**
 * 
 */
package baseDeDatos;

/**
 * @author jaime fuentealba
 *
 */
public class Tiempo {
	// Atributos
	private int horas;
	private int  minutos;
	private int  segundos;
	private String displayTiempo;
	/**
	 * 
	 */
	public Tiempo() {
		super();
	}
	/**
	 * @param horas
	 * @param minutos
	 * @param segundos
	 * @param displayTiempo
	 */
	public Tiempo(int horas, int minutos, int segundos, String displayTiempo) {
		super();
		this.horas = horas;
		this.minutos = minutos;
		this.segundos = segundos;
		this.displayTiempo = displayTiempo;
		
	}
	public int getHoras() {
		return horas;
	}
	public void setHoras(int horas) {
		this.horas = horas;
	}
	public int getMinutos() {
		return minutos;
	}
	public void setMinutos(int minutos) {
		this.minutos = minutos;
	}
	public int getSegundos() {
		return segundos;
	}
	public void setSegundos(int segundos) {
		this.segundos = segundos;
	}
	public String getDisplayTiempo() {
		return displayTiempo;
	}
	public void setDisplayTiempo(String displayTiempo) {
		this.displayTiempo = displayTiempo;
	}
	
	//duracion minutos
	public int duracionMinutos(int minutos){
		int cont=0, tope=59;
		for(int i=0;i<tope;i++){
			cont+=1;
			if(cont==minutos){
				break;
			}
		}
		return cont;
	}
	//duracion segundos
	public int duracionSegundos(int segundos){
		int cont2=0, tope=59;
		for(int i=0;i<tope;i++){
			cont2+=1;
			if(cont2==segundos){
				break;
			}
		}
		return cont2;
	}
	
	public void impresion(){
		System.out.println("Horas: " +getHoras()+", Minutos: "+getMinutos()+"Segundos"+"Display Tiempo: "+getDisplayTiempo());
		
		
	}
	
	

}
