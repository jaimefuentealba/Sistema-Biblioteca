/**
 * 
 */
package baseDeDatos;

/**
 * @author jaime fuentealba jara
 * @version: 1.0
 *
 */
public abstract class Persona {
	
	//Atributos.
	
	private String nombre;
	private String apellidos;
	private String rut;
	private int edad;
	private String direccion;
	private String profesion;
	private int cantidadDeHijos;
	private String lugarDeTrabajo;
	private int antiguedadLaboral;
	
	
	//constructor sin parametros
	
	/**
	 * 
	 */
	public Persona() {
		super();
	}

	//constructor con todos los parametros
	
	/**
	 * @param nombre
	 * @param apellidos
	 * @param rut
	 * @param edad
	 * @param direccion
	 * @param profesion
	 * @param cantidadDeHijos
	 * @param lugarDeTrabajo
	 * @param antiguedadLaboral
	 */
	public Persona(String nombre, String apellidos, String rut, int edad, String direccion, String profesion,
			int cantidadDeHijos, String lugarDeTrabajo, int antiguedadLaboral) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.rut = rut;
		this.edad = edad;
		this.direccion = direccion;
		this.profesion = profesion;
		this.cantidadDeHijos = cantidadDeHijos;
		this.lugarDeTrabajo = lugarDeTrabajo;
		this.antiguedadLaboral = antiguedadLaboral;
	}
	
	//setter y getter

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getRut() {
		return rut;
	}

	public void setRut(String rut) {
		this.rut = rut;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getProfesion() {
		return profesion;
	}

	public void setProfesion(String profesion) {
		this.profesion = profesion;
	}

	public int getCantidadDeHijos() {
		return cantidadDeHijos;
	}

	public void setCantidadDeHijos(int cantidadDeHijos) {
		this.cantidadDeHijos = cantidadDeHijos;
	}

	public String getLugarDeTrabajo() {
		return lugarDeTrabajo;
	}

	public void setLugarDeTrabajo(String lugarDeTrabajo) {
		this.lugarDeTrabajo = lugarDeTrabajo;
	}

	public int getAntiguedadLaboral() {
		return antiguedadLaboral;
	}

	public void setAntiguedadLaboral(int antiguedadLaboral) {
		this.antiguedadLaboral = antiguedadLaboral;
	}
	
	// impresion
	public void impresion(){
		System.out.println("Nombre:"+getNombre()+", Apellido: "+ getApellidos()+ ", Rut. "+getRut()+", Edad:"+getRut()+"Direccion:"+
				getDireccion()+", Profesion: "+getProfesion()+", Cantidad de Hijos: "+getCantidadDeHijos()+", Lugar de trabajo: "+getLugarDeTrabajo()
				+", Antiguedad Laboral: "+getAntiguedadLaboral());
	}
	
	
	

}
