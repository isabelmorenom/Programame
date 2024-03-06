import java.util.Scanner;

public class Ejercicio710 {
static Scanner in=new Scanner(System.in);
	
	public static int casoDePrueba() {
		
		String linea=in.nextLine();
		String [] n=linea.split(" ");
		int sum=0;
		int total=Integer.parseInt(n[0]);
		for (int i=1;i<=6;i++) 
			sum=sum+Integer.parseInt(n[i]);
		if (sum<=total)
			return(total-sum);
		return -1;
	}
	public static void main(String args[]) {
		int numCasos=Integer.parseInt(in.nextLine());
		for (int i=0;i<numCasos;i++) {
			int valor=casoDePrueba();
			if (valor!=-1)
				System.out.println(valor);
			else
				System.out.println("caso no contemplado..");
		} 
				
	}

}