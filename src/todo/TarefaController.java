package todo;

public class TarefaController {
	public TarefaController() {};
	
	public Tarefa criarTarefa(String nTitulo, String nDescricao) {
		Tarefa t    = new Tarefa();
		t.titulo    = nTitulo;
		t.descricao = nDescicao;
		
		return t;
	}
}
