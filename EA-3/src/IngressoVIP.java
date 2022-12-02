
public class IngressoVIP extends Ingresso {

	public IngressoVIP(String filme, String tipoDeIngresso, String horarioDaSessao) {
		super(filme, tipoDeIngresso, horarioDaSessao);
		
	}
	public void acessoLanchonete(boolean vip, boolean filme) {
		if (vip){
			System.out.print("Lanchonete do cinema liberada");
		}
		if (filme) {
			System.out.print("Selecionada sessão 3D");
		}
		
		else {
			System.out.print("Selecionada sessão 2D");
		}
	}
	
	public void acessoLanchonete() {
		System.out.println("Para acessar a Lanchonete, você necessita comprar um ingresso VIP.");
		System.out.println("Selecionada sessão 2D");
	}
	
	
}
