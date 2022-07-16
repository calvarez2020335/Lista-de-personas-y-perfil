import persona.*;
import java.util.*;

public class Principal{
	public static void main(String args[]){

		Scanner leer = new Scanner(System.in);	
		Persona pers1 = new Persona();

		System.out.println("Ingrese su nombre ");
		String nombre = leer.nextLine();

		System.out.println("Ingrese su apellido ");
		String apellido = leer.nextLine();

		System.out.println("ingrese su sexo ");
		String sexo = leer.nextLine();

		System.out.println("Ingrese su ciudad ");
		String ciudad = leer.nextLine();


		System.out.println("Sus datos son los siguientes: ");
		System.out.println("                              ");
		System.out.println("                              ");
	
		pers1.setnombre(nombre);
		pers1.setapellido(apellido);
		pers1.setsexo(sexo);
		pers1.setciudad(ciudad);

		System.out.println("Su nombre es "+ pers1.getnombre() + " Su apellido es " + pers1.getapellido() + " Su sexo es "+ 
							pers1.getsexo() + " Y por ultimo su ciudad es "+ pers1.getciudad());




	}
}