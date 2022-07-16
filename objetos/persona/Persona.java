package persona;


public class Persona {
	
	private String nombre;
	private String apellido;
	private String sexo;
	private String ciudad;


	public Persona(){

	} 

	public Persona(String nombre, String apellido, String sexo, String ciudad){
		this.nombre = nombre;
		this.apellido = apellido;
		this.sexo = sexo;
		this.ciudad = ciudad;
	}

	public String getnombre(){
		return nombre;
	}	
	public void setnombre(String nombre){
		this.nombre = nombre;
	}

	public String getapellido(){
		return apellido;
	}
	public void setapellido(String apellido){
		this.apellido = apellido;
	}	

	public String getsexo(){
		return sexo;
	}
	public void setsexo(String sexo){
		this.sexo = sexo;
	}

	public String getciudad(){
		return ciudad;
	}
	public void setciudad(String ciudad){
		this.ciudad = ciudad; 
	}






	

}