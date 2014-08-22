package ufbb.br.musica;

public class MusicaFunk extends Musica   {

	String estiloMusical = "Funk";
	int quantidadeDeViews;
	
	public MusicaFunk(String dura, String nome, String autor, double preco, int quant){
		
		super( dura,nome,autor,preco);
		this.quantidadeDeViews = quant;
		
	}
	
	
	public double precoParaGravar() {
		
		double valor = this.preco * this.quantidadeDeViews;
		
		return valor;
		
	}

}
