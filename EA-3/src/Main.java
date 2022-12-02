import java.util.ArrayList;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Filme filme1= new Filme("The Clockwork Orange","Stanley Kubrick", "Sci-fi", "136 min", "In the future, a sadistic gang leader is imprisoned and volunteers for a conduct-aversion experiment, but it doesn't go as planned.");
		Filme filme2= new Filme("The Godfather", "Francis Ford Coppola", "Crime fiction", "175 min", "A mafia family struggles to establish supremacy in the United States after World War II. An assassination attempt leaves boss Vito Corleone incapacitated and forces sons Michael and Sonny to take over the business.");
		Filme filme3= new Filme("Forest Gump", "Robert Zemeckis", "Comedy drama", "142 min", "Even with slow thinking, Forrest Gump never felt disadvantaged. Thanks to his mother's support, he had a normal life. Whether on the football field as a sports star, fighting in Vietnam or captaining a shrimp boat, Forrest inspires everyone with his optimism. But the person Forrest loves most may be the hardest to save: his childhood sweetheart, sweet and troubled Jenny.");
		Filme filme4= new Filme("Into The Wild", "Sean Penn", "Adventure drama", "148 min", "Christopher McCandless, the son of wealthy parents, graduates from Emory University as a top student and athlete. However, instead of embarking on a prestigious and lucrative career, he chooses to donate his savings to charity, get rid of his belongings and travel to Alaska.");
		ArrayList<Filme> filme = new ArrayList<Filme>();
		filme.add(filme1);
		filme.add(filme2);
		filme.add(filme3); 
		filme.add(filme4); 
				
		
		MenuController cicle= new MenuController(0);
		IngressoVIP ingresso= new IngressoVIP("","","");
		cicle.setMeia(12);
		cicle.setInteira(24);
		int total=0;
		int counter = 0;
		int soma;
		boolean versao= false;
		int dimensoes = 0;
		Scanner reader = new Scanner(System.in);
		while(counter!= 4) {
			System.out.println("Qual ingresso você deseja comprar?");
			System.out.println("  1 - Ingresso VIP");
			System.out.println("  2 - Ingresso comum");
			cicle.setPreferencia(reader.nextInt());
			if (cicle.getPreferencia()==1) {
				versao= true;
				filme1.setFilme3D(true);
				filme2.setFilme3D(true);
				filme3.setFilme3D(true);
				filme4.setFilme3D(true);
				cicle.setMeia(24);
				cicle.setInteira(48);
			}
			else {
				versao= false;
				filme1.setFilme3D(false);
				filme2.setFilme3D(false);
				filme3.setFilme3D(false);
				filme4.setFilme3D(false);
				cicle.setMeia(12);
				cicle.setInteira(24);
			}
			System.out.println("Digite o código do filme desejado: ");
			
			
			System.out.println("1 - "+filme1.getNome()+".");
			System.out.println("  Diretor: "+filme1.getDiretor()+".");
			System.out.println("  Descrição: "+filme1.getDescricao()+".");
			System.out.println("  Gênero: "+filme1.getGenero()+".");
			System.out.println("  Duração: "+filme1.getDuracao()+".");
			System.out.println("");
			
			System.out.println("2 - "+filme2.getNome()+".");
			System.out.println("  Diretor: "+filme2.getDiretor()+".");
			System.out.println("  Descrição: "+filme2.getDescricao()+".");
			System.out.println("  Gênero: "+filme2.getGenero()+".");
			System.out.println("  Duração: "+filme2.getDuracao()+".");
			System.out.println("");
			
			System.out.println("3 - "+filme3.getNome()+".");
			System.out.println("  Diretor: "+filme3.getDiretor()+".");
			System.out.println("  Descrição: "+filme3.getDescricao()+".");
			System.out.println("  Gênero: "+filme3.getGenero()+".");
			System.out.println("  Duração: "+filme3.getDuracao()+".");
			System.out.println("");
			
			System.out.println("4 - "+filme4.getNome()+".");
			System.out.println("  Diretor: "+filme4.getDiretor()+".");
			System.out.println("  Descrição: "+filme4.getDescricao()+".");
			System.out.println("  Gênero: "+filme4.getGenero()+".");
			System.out.println("  Duração: "+filme4.getDuracao()+".");
			
			cicle.setPreferencia(reader.nextInt());
			cicle.setPreferencia(cicle.getPreferencia()-1);
			ingresso.setFilme(filme.get(cicle.getPreferencia()).getNome()+filme.get(cicle.getPreferencia()).getDiretor()+filme.get(cicle.getPreferencia()).getDescricao()+ filme.get(cicle.getPreferencia()).getGenero()+filme.get(cicle.getPreferencia()).getDuracao());
			
			System.out.println("Filme escolhido: "+ filme.get(cicle.getPreferencia()).getNome());
			System.out.println("");
			
			System.out.println("Digite o código da sessão desejada:");
			System.out.println("  1 - 13:30");
			System.out.println("  2 - 15:10");
			System.out.println("  3 - 17:30");
			cicle.setSessao(reader.nextInt());
			if (cicle.getSessao()==1) {
				ingresso.setHorarioDaSessao("Horário selecionado: 13:30");
			}
			if (cicle.getSessao()==2) {
				ingresso.setHorarioDaSessao("Horário selecionado: 15:10");
			}
			if (cicle.getSessao()==3) {
				ingresso.setHorarioDaSessao("Horário selecionado: 17:30");
			}

			if (filme.get(cicle.getPreferencia()).getFilme3D()) {
				System.out.println("Digite o código da opção desejada:");
				System.out.println("  1 - 3D");
				System.out.println("  2 - 2D");
				dimensoes = reader.nextInt();
				if (dimensoes==2) {
					filme1.setFilme3D(false);
					filme2.setFilme3D(false);
					filme3.setFilme3D(false);
					filme4.setFilme3D(false);
				}
				else {
					filme1.setFilme3D(true);
					filme2.setFilme3D(true);
					filme3.setFilme3D(true);
					filme4.setFilme3D(true);
				}
			}
			System.out.println("Digite a quantidades de Ingressos Inteiros (R$32,00)");
			soma = reader.nextInt();
			
			if (soma>0) {
				ingresso.setTipoDeIngresso("Ingressos Inteiros");
			}
			total= soma*cicle.getInteira();
			
			System.out.println("Digite a quantidades de ingressos Meia Entrada (R$16,00)");
			soma = reader.nextInt();
			
			if (soma>0) {
				if (total>0) {
					ingresso.setTipoDeIngresso(ingresso.getTipoDeIngresso()+" e ingressos meia entrada");
				}
				else {
					ingresso.setTipoDeIngresso("Ingressos Meia Entrada");
				}
			}
			
			total+= soma*cicle.getMeia();
			
			System.out.println("O valor total para " + filme.get(cicle.getPreferencia()).getNome() + ", " + ingresso.getHorarioDaSessao() +" é R$" + total + ",00.");
					
					//ingresso.filme +"\n"+ingresso.getHorarioDaSessao()+"\n"+ ingresso.getTipoDeIngresso()+" = "+ total);
		
			if(versao) {
				if (filme.get(cicle.getPreferencia()).getFilme3D()) {
					ingresso.acessoLanchonete(true, true);
				} else {
					ingresso.acessoLanchonete(true, false);
				}
			} else {
				ingresso.acessoLanchonete();
			}
			total= 0;
			
			System.out.println("Quer comprar mais ingressos?");
			System.out.println("  1 - Sim");
			System.out.println("  2 - Não");
			counter = reader.nextInt();
			
			if (counter==2) {
				System.out.println("OK, Boa sessão!");
				break;
			
		}
	}

}}
