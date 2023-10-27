package Aplicação;

public  abstract class  Colecionavéis {
	private int id;
	private String Titulo;
	private String DataAq;
	public void setId(int id) {
		this.id=id;
	}
	public void setTitulo(String Titulo) {
		this.Titulo=Titulo;
	}
	public void setDataAq(String DataAq) {
		this.DataAq=DataAq;
	}
	public int getId() {
		return id;
	}
	public String getTitulo() {
		return Titulo;
	}
	public String getDataAq() {
		return DataAq;
	}
}
