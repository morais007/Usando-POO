package IphoneMain;
import java.util.Locale;
import java.util.Scanner;

import FuncoesIphone.AparelhoTelefonico;
import FuncoesIphone.NavegadorNaInternet;
import FuncoesIphone.ReprodutorMusical;
public class IphoneMain {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		// Reprodutor de Musica
		ReprodutorMusical repro = new ReprodutorMusical();
		String musica = repro.musica;
		repro.selecionarMusica(musica);
		repro.tocar();
		
		// Aparelho Telefônico
		AparelhoTelefonico tel = new AparelhoTelefonico();
		tel.ligar(tel.numero);
		System.out.println();
		tel.atender();
		tel.iniciarCorreioVoz();
		
		// Navegar na Internet
		NavegadorNaInternet nav= new NavegadorNaInternet();
		nav.exibirPagina(nav.url);
		System.out.println();
		nav.adicionarNovaAba();		
		nav.atualizarPagina();
		
		
		
		
		sc.close();
	}
}
