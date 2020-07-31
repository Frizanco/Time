
import java.util.Scanner;
public class TimeTeste {
	public static void main(String args[]) {
	Scanner teclado = new Scanner(System.in);
		
		int h, m, s;
		
		System.out.println("Entre os 3 inteiros:");
		h = teclado.nextInt();
		m = teclado.nextInt();
		s = teclado.nextInt();
		Time T = new Time(h,m,s);
		
		System.out.println(T.HoraPadrao());
		System.out.println(T.HoraDificil());
	}
}
