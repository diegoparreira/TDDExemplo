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
}
