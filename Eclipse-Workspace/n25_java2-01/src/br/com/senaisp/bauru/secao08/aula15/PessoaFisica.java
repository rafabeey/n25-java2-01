package br.com.senaisp.bauru.secao08.aula15;

public class PessoaFisica extends Pessoa {
   public PessoaFisica() {
	   super(); //Usando o contructor da classe pai
	   setTipopessoa('F');
   }//Fechando constructor
  //Contructor com
   public PessoaFisica(String nom, String doc, String ende, String dtNas) throws Exception {
	   super(nom, doc, ende, dtNas);
	   setTipopessoa('F'); //Usando o contructor da classe pai
   }
@Override
protected boolean isDocumentoValido(String documento2) {
	//123.456.789-00
	return documento2.length()==14 || documento2.length()==11;
	
}
   
}
