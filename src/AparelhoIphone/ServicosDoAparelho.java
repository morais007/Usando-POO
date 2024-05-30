package AparelhoIphone;

public class ServicosDoAparelho {
	//public String musica;
	
	
	// Reprodutor de Musica
	public void tocar() {
		System.out.println("Tocar a musica!");
	}
	
	public void pausar() {
		System.out.println("Musica pausada!");
	}
	
	public void selecionarMusica(String musica) {
		musica = "Internacionais";
		System.out.println("Selecionar Musica!");
		System.out.println(musica);
		
		
	}
	
	// Aparelho Telefônico
	
	public void ligar(String numero) {
		numero = "(88)9 9223-3044";
		System.out.printf("Ligar para o número: %s",numero);
		
		
	}
	
	public void atender() {
		System.out.println("Atender!");
	}
	
	public void iniciarCorreioVoz() {
		System.out.println("Iniciar correio de voz!");
	}
	
	
	// Navegar na Internet
	
	public void exibirPagina(String url) {
		url = "https://github.com/morais007/Usando-POO";
		System.out.printf("Exibindo a página %s",url);
		
	}
	
	public void adicionarNovaAba() {
		System.out.println("Nova Aba: google.com");
	}
	
	public void atualizarPagina() {
		System.out.println("Atualizar a página!");
	}

}
