package Aplicação;

public class Pedido {
	private String endereco;
	private int hora;
	private int Id;// Identificador do Pedido
	private int qtd;
	private float total;
	private String pagamento;
	private String status;
	private int Tempo;

	public String getendereco() {
		return endereco;
	}

	public int gethora() {
		return hora;
	}

	public int getId() {
		return Id;
	}

	public int getqtd() {
		return qtd;
	}

	public float gettotal() {
		return total;
	}

	public String getpagamento() {
		return pagamento;
	}

	public String getstatus() {
		return status;
	}

	public void setendereco(String endereco) {
		this.endereco = endereco;
	}

	public void sethora(int hora) {
		this.hora = hora;
	}

	public void setqtd(int qtd) {
		this.qtd = qtd;
	}

	public void calc() {
		this.total = 60 * qtd;
	}

	public void setId(int Id) {
		this.Id = Id;
	}

	public void setStatus(String Status) {
		this.status = Status;
	}

	public void setpagamento(String pagamento) {
		this.pagamento = pagamento;
	}

	public String alterarpedido(String endereco, int hora) {
		this.endereco = endereco;
		this.hora = hora;
		return ("Seu pedido foi alterado");
	}

	public int gettempo() {
		return Tempo;
	}

	public void Tentrega() {
		int t = hora + 6;
		if (t < 23) {
			this.Tempo = t;
		} else {
			this.Tempo = t - 24;
		}

	}
}
