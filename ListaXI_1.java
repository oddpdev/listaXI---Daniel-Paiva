package listaXI;

import javax.swing.JOptionPane;

public class ListaXI_1 {
    public static void main(String[] args) {

        Veiculos[] garagem = {
            new Carro("Toyota", "Corolla", 2023),
            new Moto("Honda", "CB 500", 2024),
            new Caminhao("Volvo", "FH 540", 2020)
        };

        // Uso de StringBuilder para uso de String em pop up
        StringBuilder mensagemPopUp = new StringBuilder();
        mensagemPopUp.append("--- Relatório de Veículos na Garagem ---\n\n");

        for (Veiculos veiculo : garagem) {
            mensagemPopUp.append("Tipo: ");
            
            mensagemPopUp.append(veiculo.getClass().getSimpleName()).append("\n"); 
            
            mensagemPopUp.append("Marca: ").append(veiculo.getMarca()).append("\n");
            mensagemPopUp.append("Modelo: ").append(veiculo.getModelo()).append("\n");
            mensagemPopUp.append("Ano: ").append(veiculo.getAno()).append("\n");
            

            mensagemPopUp.append("Ação: ");
            if (veiculo instanceof Carro) {
                mensagemPopUp.append("Acelerando de 0 a 100 km/h em X segundos.");
            } else if (veiculo instanceof Moto) {
                mensagemPopUp.append("Acelerando e empinando a roda dianteira!");
            } else if (veiculo instanceof Caminhao) {
                mensagemPopUp.append("Engrenando a próxima marcha e acelerando lentamente.");
            }
            
            mensagemPopUp.append("\n----------------------------------\n");
        }


        JOptionPane.showMessageDialog(
            null, 
            mensagemPopUp.toString(), // Converte o StringBuilder para String para apresentação em pop up
            "Relatório Polimórfico de Veículos", 
            JOptionPane.INFORMATION_MESSAGE
        );
    }
}
