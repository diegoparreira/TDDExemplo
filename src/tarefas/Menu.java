package tarefas;

import java.util.Scanner;

public class Menu {
	
	Scanner ler;
	int opcao;
	TarefaController gerencTarefas = new TarefaController();
	
	public Menu() {
		ler = new Scanner(System.in);
		criarMenu();
	}
	
	public void criarMenu() {
		try {
			do {
				System.out.println("Digite a opção desejada:");
				System.out.println("1 - Criar nova tarefa");
				System.out.println("2 - Editar tarefa");
				System.out.println("3 - Concluir tarefa");
				opcao = ler.nextInt();
				
				switch(opcao) {
				case 1:
					this.opcoesCriarTarefa();
					break;
				case 2:
					this.gerencTarefas.imprimirTarefas();
					this.opcoesEditarTarefa();
					break;
				case 3:
					this.gerencTarefas.imprimirTarefas();
					this.opcoesConcluirTarefa();
					break;
				}
			}while(opcao != 0);
		} catch (Exception e) {
			System.out.println("Erro: " + e.getMessage());
		}
	}
	
	private void opcoesConcluirTarefa() {
		int indexTarefa = -1;
		this.gerencTarefas.imprimirTarefas();
		System.out.println("Indique o indice da tarefa que deseja alterar [n]:");
		indexTarefa = ler.nextInt();
		
		Tarefa t = this.gerencTarefas.getTarefaByIndex(indexTarefa);
		this.gerencTarefas.concluirTarefa(t);

	}

	private void opcoesEditarTarefa() {
		int indexTarefa = -1;
		int opcaoEditar =  0;
		this.gerencTarefas.imprimirTarefas();
		System.out.println("Indique o indice da tarefa que deseja alterar [n]:");
		indexTarefa = ler.nextInt();
		System.out.println("Voce deseja alterar o titulo[1] ou a descricao[2]?");
		opcaoEditar = ler.nextInt();
		
		if(opcaoEditar == 1) {
			String auxTitulo = "";
			System.out.println("Informe o novo titulo:");
			auxTitulo = ler.next();
			Tarefa t = this.gerencTarefas.getTarefaByIndex(indexTarefa);
			this.gerencTarefas.alterarTitulo(auxTitulo, t);
		}else if (opcaoEditar == 2) {
			String auxDescricao = "";
			System.out.println("Informe o nova descrição:");
			auxDescricao = ler.next();
			Tarefa t = this.gerencTarefas.getTarefaByIndex(indexTarefa);
			this.gerencTarefas.alterarDescricao(auxDescricao, t);			
		}else {
			System.out.println("Opção inválida, retornando:");
			return;
		}
	}

	public void opcoesCriarTarefa() {
		String titulo, descricao;
		
		System.out.println("Escolha o título da sua tarefa");
		titulo = ler.next();
		System.out.println("Descreva sua tarefa");
		descricao = ler.next();
		
		Tarefa t = this.gerencTarefas.criarNovaTarefa(titulo, descricao);
		
		if(t != null) {
			System.out.println("Tarefa criada com sucesso !!");
		}
	}
}
