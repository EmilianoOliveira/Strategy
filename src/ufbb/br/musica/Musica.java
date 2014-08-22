package ufbb.br.musica;

public abstract class Musica implements MusicaPai {
	
	String duracao;
	String nome;
	String autor;
	double preco;
	
	public Musica(String dura, String nome, String autor, double preco){
		
		this.duracao = dura;
		this.nome = nome;
		this.autor = autor;
		this.preco = preco;
		
		
	}
	
	public String informacoesMusica(){

		String informacoes = "O nome da m�sica � " +  nome + " e que tem dura��o de " + duracao ;
		
		return informacoes;	
	}
	
	abstract double precoParaGravar();


}