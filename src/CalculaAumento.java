import java.util.Scanner;

public class CalculaAumento {

	public static void main(String[] args){
		Scanner entrada = new Scanner(System.in);
		
		while(true){
			System.out.print("Digite um valor: ");
			double valor = entrada.nextDouble();
			System.out.print("Digite uma taxa de aumento (1 - 10% / 2 - 25% / 3 - 30% / 4 - 50%): ");
			int taxa = entrada.nextInt();
			if(taxa < 1 || taxa > 4){
				System.out.println("Valor de aumento indefinido!");
			}else{
				System.out.println("Valor total: "+calcularAumento(valor, taxa));
			}
		} 
	}
	
	public static double calcularAumento(double valor, int taxa) {
		
		double aumento = 0;
		
		switch(taxa){
		
		case 1:
			aumento = valor * 10 / 100;
			break;
			
		case 2:
			aumento = valor * 25 / 100;
			break;
			
		case 3:
			aumento = valor * 30 / 100;
			break;
			
		case 4:
			aumento = valor * 50 / 100;
			break;

		}
		
		return valor + aumento;
	}

}
