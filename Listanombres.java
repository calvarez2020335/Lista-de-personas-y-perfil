import java.util.*;

public class Listanombres{
	public static void main(String[] args) {
		
		Scanner f = new Scanner(System.in);

		System.out.print("Hasta que numero de lista quiere ver: ");
		int hasta = f.nextInt();

		System.out.println("                                     ");

		String y[] = new String [hasta];

		for(int i=0; i<y.length; i++) {
			int g=i+1;
			System.out.print(g+") ");
			y[i] = f.next(); 
		}
			System.out.println("                                     ");
			System.out.println("El orden es: ");
			System.out.println("                                     ");


			for(String fy : y){
				System.out.println(fy);
			}



	}
}