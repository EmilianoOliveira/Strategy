package ufbb.br.musica;

public class MusicaSertanejo extends Musica   {

	String estiloMusical = "Sertanejo";
	int quantidadeDeViews;
	
	public MusicaSertanejo(String dura, String nome, String autor, double preco, int quant){
		
		super( dura,nome,autor,preco);
		this.quantidadeDeViews = quant;
		
	}
	
	
	
	public double precoParaGravar() {
		
		double valor = this.preco * this.quantidadeDeViews;
		
		return valor;
		
	}

}
