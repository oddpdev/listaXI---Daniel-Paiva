package listaXI;

public class Carro extends Veiculos {
	public Carro(String marca, String modelo, int ano) {
		super(marca, modelo, ano);
	}
	
	@Override
	public void acelerar() {
		System.out.println(getModelo() + ", da marca " + getMarca() + " está acelerando a de o a 100 km/h em 3,7 segundos. \n\n");
	}
}
