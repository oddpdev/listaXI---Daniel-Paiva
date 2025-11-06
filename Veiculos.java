package listaXI;

public abstract class Veiculos {
	private String marca, modelo;
	private int ano;
	
	public Veiculos (String marca, String modelo, int ano) {
		this.marca = marca;
		this.modelo = modelo;
		this.ano = ano;
	}
	
	
	public void exibirDetalhes() {
		System.out.printf("Marca: %s\n", marca);
		System.out.printf("Modelo: %s\n", modelo);
		System.out.printf("Ano: %s\n\n", ano);
	}
	
	public abstract void acelerar();
	
	
	public String getModelo() {
		return modelo;
	}
	
	public String getMarca() {
		return marca;
	}
	
	public int getAno() {
		return ano;
	}

}
