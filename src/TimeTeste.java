import java.util.Scanner;

public class TimeTeste {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int txtHora, txtMinuto, txtSegundo;
		
		System.out.println("\nDigite o horário:");
		
		txtHora = teclado.nextInt();
		txtMinuto = teclado.nextInt();
		txtSegundo = teclado.nextInt();
		
		Time t = new Time(txtHora, txtMinuto, txtSegundo);
		
		System.out.println(t.ExibirUniversal());
		System.out.println(t.ExibirPadrao());
	
		
		teclado.close();
}
}