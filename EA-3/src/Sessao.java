import java.util.ArrayList;
import java.util.Scanner;
public class Sessao {

	public static void main(String[] args) {
		Filme filme1= new Filme("Harry Potter e a pedra filosofal","Chris Columbus", "Harry Potter é um garoto órfão que vive infeliz com seus tios, os Dursleys. Ele recebe uma carta contendo um convite para ingressar em Hogwarts, uma famosa escola especializada em formar jovens bruxos. Inicialmente, Harry é impedido de ler a carta por seu tio, mas logo recebe a visita de Hagrid, o guarda-caça de Hogwarts, que chega para levá-lo até a escola. Harry adentra um mundo mágico que jamais imaginara, vivendo diversas aventuras com seus novos amigos, Rony Weasley e Hermione Granger.", "Fantasia/Aventura", "2h 32m");
		Filme filme2= new Filme ("Harry Potter e a câmera secreta", "Chris Columbus", "Após as sofríveis férias na casa dos tios, Harry Potter se prepara para voltar a Hogwarts e começar seu segundo ano na escola de bruxos. Na véspera do início das aulas, a estranha criatura Dobby aparece em seu quarto e o avisa de que voltar é um erro e que algo muito ruim pode acontecer se Harry insistir em continuar os estudos de bruxaria. O garoto, no entanto, está disposto a correr o risco e se livrar do lar problemático.", "Fantasia/Aventura", "2h 41m");
		ArrayList<Filme> filme = new ArrayList<Filme>();
		filme.add(filme1);
		filme.add(filme2); 
				
		
		MenuController interacao= new MenuController(0);
		IngressoVIP ingresso= new IngressoVIP("","","");
		interacao.setMeia(12);
		interacao.setInteira(24);
		int total=0;
		int contador = 0;
		int soma;
		boolean versao= false;
		int posicao = 0;
		Scanner leitor = new Scanner(System.in);
		while(contador!= 4) {
			System.out.println("Qual ingresso você deseja comprar? 1 - vip 2 - comum");
			interacao.setPreferencia(leitor.nextInt());
			if (interacao.getPreferencia()==1) {
				versao= true;
				filme1.setFilme3D(true);
				filme2.setFilme3D(true);
				interacao.setMeia(24);
				interacao.setInteira(48);
			}
			else {
				versao= false;
				filme1.setFilme3D(false);
				filme2.setFilme3D(false);
				interacao.setMeia(12);
				interacao.setInteira(24);
			}
			System.out.println("1- Harry Potter e a pedra filosofal\n2- Harry Potter e a câmera secreta");
			interacao.setPreferencia(leitor.nextInt());
			interacao.setPreferencia(interacao.getPreferencia()-1);
			ingresso.setFilme(filme.get(interacao.getPreferencia()).getnome()+"\n"+filme.get(interacao.getPreferencia()).getDiretor()+"\n"+filme.get(interacao.getPreferencia()).getDescricao()+"\n"+ filme.get(interacao.getPreferencia()).getGenero()+"\n"+filme.get(interacao.getPreferencia()).getDuracao());
			
			System.out.println(filme.get(interacao.getPreferencia()).getnome());
			
			System.out.println("1 sessão = 14h versão dublada\n2 Sessão = 18h versão legendada");
			interacao.setSessao(leitor.nextInt());
			if (interacao.getSessao()==1) {
				ingresso.setHorarioDaSessao("14h versão dublada");
			}
			
			if (interacao.getSessao()==2) {
				ingresso.setHorarioDaSessao("18h versão legendada");
			}
			if (filme.get(interacao.getPreferencia()).getFilme3D()) {
				System.out.println("Deseja ver o filme 3D ou 2D? 1 - 3D 2 - 2D");
				posicao = leitor.nextInt();
				if (posicao==2) {
					filme1.setFilme3D(false);
					filme2.setFilme3D(false);
				}
			}
			System.out.println("Inteira = 32");
			soma = leitor.nextInt();
			
			if (soma>0) {
				ingresso.setTipoDeIngresso("inteira");
			}
			total= soma*interacao.getInteira();
			
			System.out.println("Meia = 16");
			soma = leitor.nextInt();
			
			if (soma>0) {
				if (total>0) {
					ingresso.setTipoDeIngresso(ingresso.getTipoDeIngresso()+" e meia");
				}
				else {
					ingresso.setTipoDeIngresso("meia");
				}
			}
			
			total+= soma*interacao.getMeia();
			
			System.out.println(ingresso.filme +"\n"+ingresso.getHorarioDaSessao()+"\n"+ ingresso.getTipoDeIngresso()+" = "+ total);
		
			if(versao) {
				if (filme.get(interacao.getPreferencia()).getFilme3D()) {
					ingresso.acessoLanchonete(true, true);
				} else {
					ingresso.acessoLanchonete(true, false);
				}
			} else {
				ingresso.acessoLanchonete();
			}
			total= 0;
			
			System.out.println(" Quer continuar comprando ingresso? 1 = sim e 2 = não");
			contador = leitor.nextInt();
			
			if (contador==2) {
				System.out.println("Obrigado pela sua escolha e tenha um bom filme");
				break;
			
		}
	}

}}
