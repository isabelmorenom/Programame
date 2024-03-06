import java.util.Scanner;

public class Ejercicio711 {
	static Scanner in=new Scanner(System.in);
	
	public static boolean esPar(int n) {
		if (n%2==0) return false;
		else return true;
	}
	
	public static int mayor(String s) {
		int mayor=(int)(s.charAt(0)-'0');
		for (int i=0;i<s.length();i++) {
			int num=(int)(s.charAt(i)-'0');
			if (num>mayor) mayor=num;
		}
		return mayor;
	}
	public static int menor(String s) {
		int menor=(int)(s.charAt(0)-'0');
		for (int i=0;i<s.length();i++) {
			int num=(int)(s.charAt(i)-'0');
			if (num<menor) menor=num;
		}
		return menor;
	}
	public static int caldigpar(int n,String m) {
		int result=n*2+mayor(m);
		return result;		
	}
	public static int caldigimpar(int n, String m) {
		int result=n*3+menor(m);
		return result;
	}
	
	public static int casoDePrueba() {
		
		String linea=in.nextLine();
		int codigo=0; 
		for (int i=0; i<linea.length();i++) {
			if (esPar(i)) {
				int n=(int)(linea.charAt(i)-'0');
				String m=linea.substring(0, i);
				codigo=codigo+caldigpar(n,m);
				
			}else {
				int n=(int)(linea.charAt(i)-'0');
				String m=linea.substring(i+1, linea.length());
				codigo=codigo+caldigimpar(n,m);
				
			}
		}
		return codigo;
		
		
	}
	public static void main(String args[]) {
		int numCasos=Integer.parseInt(in.nextLine());
		for (int i=0;i<numCasos;i++) {
			int valor=casoDePrueba();
			if (valor!=0)
				System.out.println(valor);
			else
				System.out.println("caso no contemplado..");
		} 
				
	}

}