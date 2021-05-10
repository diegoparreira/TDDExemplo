package todo;

public class Tarefa {
	private String titulo;
	private String descricao;
	private boolean concluido;
	
	public Tarefa(String nTitulo, String nDescricao) {
		this.titulo    = nTitulo;
		this.descricao = nDescricao;
		this.concluido = false;
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

	public boolean isConcluido() {
		return concluido;
	}

	public void setConcluido(boolean concluido) {
		this.concluido = concluido;
	}
	
	
}
