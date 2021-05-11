package todo;
import org.junit.jupiter.api.Test;

public class TarefaTest {
	@Test
	public void deveriaCriarTarefa() {
		TarefaController t 	= new TarefaController();
		String titulo = "Terminar trabalho SI405";
		String descricao = "Revisar artigo buscando melhorar o mesmo antes de submissão";

		Tarefa novaTarefa = t.criarTarefa(titulo, descricao);
		
		assertEquals(new Tarefa(titulo, descricao), novaTarefa);
		
	}
	
	@Test
	public void deveriaEditarTituloTarefa() {
		TarefaController t 	= new TarefaController();
		String titulo = "Terminar trabalho SI405";
		String descricao = "Revisar artigo buscando melhorar o mesmo antes de submissão";

		Tarefa novaTarefa = t.criarTarefa(titulo, descricao);
		
		novaTarefa.
		
		assertEquals(new Tarefa(titulo, descricao), novaTarefa);
		
	}
	
	@Test
	public void deveriaEditarDescricaoTarefa() {
		TarefaController t 	= new TarefaController();
		String titulo = "Terminar trabalho SI405";
		String descricao = "Revisar artigo buscando melhorar o mesmo antes de submissão";

		Tarefa novaTarefa = t.criarTarefa(titulo, descricao);
		
		assertEquals(new Tarefa(titulo, descricao), novaTarefa);
		
	}
}
