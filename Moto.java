package listaXI;

public class Moto extends Veiculos{
	public Moto(String marca, String modelo, int ano) {
		super (marca, modelo, ano);
	}
	
	@Override
	public void acelerar() {
		System.out.println(getModelo() + ", da marca " + getMarca() + "está acelerando e empinando a roda dianteira.\n\n");
	}
}
