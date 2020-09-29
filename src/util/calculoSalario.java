package util;

public class calculoSalario {
	
	private Integer id;	
	private String nome;		
	private Double salario;
	
	public calculoSalario () {
		
	}
	public calculoSalario(Integer id, String nome, Double salario) {
		super();
		this.id = id;
		this.nome = nome;
		this.salario = salario;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(Double salario) {
		this.salario = salario;
	}
	
	public void incrementoSalario(double percentual) {
		salario += salario * percentual/100;
	}
	public String toString() {
		return id+", "+ nome+", "+String.format("%.2f",salario);
	}
	
}
	
	