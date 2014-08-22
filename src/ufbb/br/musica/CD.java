package ufbb.br.musica;

import java.util.ArrayList;
import java.util.List;

public class CD {

		private List<Musica> selecaoMusicas = null;

		public CD() {
			this.selecaoMusicas = new ArrayList<Musica>();
		}

		public void inserirMusica(Musica musica) {
			this.selecaoMusicas.add(musica);
		}

		public double valorBrutoCd() {
			double valorBruto = 0;
			for(int i = 0; i< this.selecaoMusicas.size() ; i++){
				valorBruto = this.selecaoMusicas.get(i).precoParaGravar() + valorBruto;	
			}
			return valorBruto;
		}

		public String informacoesMusicas (int pos){
			return this.selecaoMusicas.get(pos).informacoesMusica();
		}
}
	
