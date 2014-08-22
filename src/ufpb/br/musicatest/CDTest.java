package ufpb.br.musicatest;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import ufbb.br.musica.CD;
import ufbb.br.musica.Musica;
import ufbb.br.musica.MusicaFunk;
import ufbb.br.musica.MusicaPop;
import ufbb.br.musica.MusicaSertanejo;


public class CDTest {

	CD cd = null;
	Musica musica1 = null;
	Musica musica2 = null;
	Musica musica3 = null;

	@Before
	public void inicio() {
		cd = new CD();
		musica1 = new MusicaFunk("2:45", "Aps ostenta", "Mc Javin", 20, 2000);
		musica2 = new MusicaSertanejo("3:45", "O mock me pegou", "Seu Apache", 30, 4000);
		musica3 = new MusicaPop("3:23", "Java não me deixe", "Banda Eclipse", 40, 6000);
    	cd.inserirMusica(musica1);
    	cd.inserirMusica(musica2);
    	cd.inserirMusica(musica3);
    				
	}

	@Test
	public void valorBrutoCd() {
		double valor = cd.valorBrutoCd();
		assertEquals(valor, 400000,00);
	}

	@Test
	public void informacoesMusicas () {
		String song = cd.informacoesMusicas(0);
		assertEquals("O nome da música é Aps ostenta e que tem duração de 2:45", song);
		String song2 = cd.informacoesMusicas(1);
		assertEquals("O nome da música é O mock me pegou e que tem duração de 3:45", song2);
		String song3 = cd.informacoesMusicas(2);
		assertEquals("O nome da música é Java não me deixe e que tem duração de 3:23", song3);
		
	}
}