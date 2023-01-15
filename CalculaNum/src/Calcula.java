import java.util.Scanner;

public class Calcula {
/*  Esse programa pega a soma do primeiro número, na quantidade de vezes do numero2*/
	public static void main(String[] args) {
		Scanner teclado=new Scanner (System.in);
		System.out.println("Digite o primeiro número:");
		int N1=teclado.nextInt();
		System.out.println("Digite o segundo número:");
		int N2=teclado.nextInt();
		
		//int calcula []= {};
		int total=0;
		for(int i=0;i<N2;i++) {
			//calcula[i]=N1;
			total=N1+total;
			System.out.println(total);
		}System.out.println("O valor é "+total);
		
	}

}
