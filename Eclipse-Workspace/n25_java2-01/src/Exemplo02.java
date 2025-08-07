import java.util.Scanner;

public class Exemplo02 {

	public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Digite seu nome complento:");
    String nome = sc.next(); //token padrão e espaço em branco
    System.out.println("Seu nome é" + nome);
    System.out.println("Digite sua idade: ");
    int idade = sc.nextInt();
    sc.nextLine(); //Captura somente o enter da linha anterior
    System.out.println("Digite seu endereço: ");
    String endereço = sc.nextLine(); //token é o termino de linha \n
    System.out.println("Seu endereço é: " + endereço);
    System.out.println("Sua idade é: " + idade);
    sc. close();
    
    
	}

}
