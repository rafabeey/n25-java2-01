package br.com.senaisp.bauru.secao03.aula09;

import java.util.Scanner;

public class OrdemTexto {

	public static void main(String[] args) {
     //
		Scanner sc = new Scanner(OrdemTexto.class.getResourceAsStream("palavras.txt"));
        //Definindo variaveis de trabalho
		String maiorTexto, menorTexto;
	    //Setando o maior e menor com o primeiro texto
		maiorTexto = sc.nextLine(); 
		menorTexto = maiorTexto; //Igualando os endereços para o mesmo conteudo
		//vamos usar o while (ja viu no Javai)
		while (sc.hasNextLine()) {
		  String apoio = sc.nextLine();
		  //comparando os textos - menor
		  if (apoio.compareTo(menorTexto)<0) {
			  menorTexto = "" + apoio;
		  } 
		  //Comparando os textos - maior
		 if (apoio.compareTo(maiorTexto)<0) {
			  maiorTexto = "" + apoio;
		  }
		}
		System.out.println("Maior texto foi " + maiorTexto);
		System.out.println("Menor texto foi " + menorTexto);
		//fenchando o arquivo
		sc.close();
	}
}
		

	
