package tarefas;

import java.util.ArrayList;
import java.util.List;

public class TarefaController {
	private List<Tarefa> listaTarefas;
	
	public TarefaController() {
		this.listaTarefas = new ArrayList<Tarefa>();
	};
	
	public Tarefa criarNovaTarefa(String nTitulo, String nDescricao) {
		Tarefa t = new Tarefa(nTitulo, nDescricao);
		listaTarefas.add(t);
		
		return t;
	}
	
	public void alterarTitulo(String nTitulo, Tarefa t) {
		int index        = this.listaTarefas.indexOf(t);
		Tarefa auxTarefa = this.listaTarefas.get(index);
		
		auxTarefa.setTitulo(nTitulo);
		
		listaTarefas.set(index, t);
	}
	
	public void alterarDescricao(String nDesc, Tarefa t) {
		int index        = this.listaTarefas.indexOf(t);
		Tarefa auxTarefa = this.listaTarefas.get(index);
		
		auxTarefa.setDescricao(nDesc);
		
		this.listaTarefas.set(index, t);
	}
	
	public void concluirTarefa(Tarefa t) {
		int index 		 = this.listaTarefas.indexOf(t);
		Tarefa auxTarefa = this.listaTarefas.get(index);
		
		auxTarefa.setConcluida();
		
		this.listaTarefas.set(index, t);
	}

	public List<Tarefa> getListaTarefas() {
		return listaTarefas;
	}
	
	public Tarefa getTarefaByIndex(int index) {
		return listaTarefas.get(index);
	}
	
	public void imprimirTarefas() {
		List<Tarefa> auxList = this.getListaTarefas();
		
		for(int i = 0 ; i < auxList.size() ; i++) {
			System.out.println("Tarefa [" + i + "]:");
			System.out.println(auxList.get(i).getTitulo() + " . Descrição: " + auxList.get(i).getDescricao() );
			System.out.println("--------------------");
		}
	}
}
