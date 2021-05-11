package tarefas;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class TarefaTest {

	@Test
	public void deveriaCriarTarefa() {
		TarefaController t = new TarefaController();
		String titulo      = "Terminar trabalho 03 - SI405";
		String descricao   = "Revisar antes de submeter o mesmo";
		
		Tarefa nTarefa     = t.criarNovaTarefa(titulo, descricao);

		assertEquals(nTarefa.getDescricao(), descricao);
		assertEquals(nTarefa.getTitulo(), titulo);
	}
	
	@Test
	public void deveriaModificarTituloTarefa() {
		TarefaController t = new TarefaController();
		Tarefa novaTarefa  = t.criarNovaTarefa("Teste titulo", "Teste descricao");
		String novoTitulo  = "Revisar trabalho 03 - SI405";
		
		t.alterarTitulo(novoTitulo, novaTarefa);
		
		assertEquals(novaTarefa.getTitulo(), novoTitulo);
	}
	
	@Test
	public void deveriaModificarDescricaoTarefa() {
		TarefaController t = new TarefaController();
		Tarefa novaTarefa  = t.criarNovaTarefa("Teste titulo", "Teste descricao");
		String novaDesc    = "Falta analisar trabalho dos colegas";
		
		t.alterarDescricao(novaDesc, novaTarefa);
		
		assertEquals(novaTarefa.getDescricao(), novaDesc);
	}
	
	@Test
	public void deveriaMarcarTarefaComoConcluida() {
		TarefaController t = new TarefaController();
		Tarefa novaTarefa  = t.criarNovaTarefa("Teste titulo", "Teste descricao");
		
		t.concluirTarefa(novaTarefa);
		
		assertEquals(novaTarefa.isConcluida(), true);
	}
	
	@Test
	public void deveriaRecuperarTarefas() {
		TarefaController t  = new TarefaController();
		Tarefa novaTarefa1  = t.criarNovaTarefa("Teste titulo 1", "Teste descricao 1");
		Tarefa novaTarefa2  = t.criarNovaTarefa("Teste titulo 2", "Teste descricao 2");
		Tarefa novaTarefa3  = t.criarNovaTarefa("Teste titulo 3", "Teste descricao 3");
		
		List<Tarefa> listaTarefasMock = new ArrayList<Tarefa>();
		listaTarefasMock.add(novaTarefa1);
		listaTarefasMock.add(novaTarefa2);
		listaTarefasMock.add(novaTarefa3);
		
		assertEquals(t.getListaTarefas(), listaTarefasMock);
	}

}
