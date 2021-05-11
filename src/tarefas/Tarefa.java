package tarefas;

public class Tarefa {
	private String titulo;
	private String descricao;
	private boolean concluida;
	
	public Tarefa(String nTitulo, String nDesc) {
		this.titulo    = nTitulo;
		this.descricao = nDesc;
		this.concluida = false;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public boolean isConcluida() {
		return concluida;
	}

	public void setConcluida() {
		this.concluida = true;
		System.out.println("Parabéns, você concluiu a tarefa " + this.titulo);
	}
	
	
}
