package listaXI;

public class Caminhao extends Veiculos{
	public Caminhao(String marca, String modelo, int ano) {
		super(marca, modelo, ano);
	}
	
	@Override
	public void acelerar() {
		System.out.println(getModelo() + " " + getMarca() + "está engrenando a próxima marcha e acelerando lentamente.\n\n");
	}
}
