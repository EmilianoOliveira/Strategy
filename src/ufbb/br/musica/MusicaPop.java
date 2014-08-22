package ufbb.br.musica;

public class MusicaPop extends Musica   {

	String estiloMusical = "POP";
	int quantidadeDeViews;
	
	public MusicaPop(String dura, String nome, String autor, double preco, int quant){
		
		super( dura,nome,autor,preco);
		this.quantidadeDeViews = quant;
		
	}
	
	
	public double precoParaGravar() {
		
		double valor = this.preco * this.quantidadeDeViews;
		
		return valor;
		
	}

}

