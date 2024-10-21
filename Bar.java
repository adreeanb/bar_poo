package projeto_bar;


import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class Bar {

    public static void main(String[] args) {
    
        DecimalFormat df = new DecimalFormat("#,##0.00");

   
        String sexo = "";
        while (!sexo.equals("M") && !sexo.equals("F")) {
            sexo = JOptionPane.showInputDialog("Informe o sexo (F ou M):").toUpperCase();
            if (!sexo.equals("M") && !sexo.equals("F")) {
                JOptionPane.showMessageDialog(null, "Erro: sexo inválido. Por favor, digite M ou F.", "Erro", JOptionPane.ERROR_MESSAGE);
            }
        }

        String quantidadeCervejasStr = JOptionPane.showInputDialog("Informe a quantidade de cervejas consumidas:");
        int quantidadeCervejas = Integer.parseInt(quantidadeCervejasStr);

        String quantidadeRefrigerantesStr = JOptionPane.showInputDialog("Informe a quantidade de refrigerantes consumidos:");
        int quantidadeRefrigerantes = Integer.parseInt(quantidadeRefrigerantesStr);

        String quantidadeEspetinhosStr = JOptionPane.showInputDialog("Informe a quantidade de espetinhos consumidos:");
        int quantidadeEspetinhos = Integer.parseInt(quantidadeEspetinhosStr);


        double ingresso = (sexo.equals("M")) ? 10.0 : 8.0;
        double precoCerveja = 5.0;
        double precoRefrigerante = 3.0;
        double precoEspetinho = 7.0;
        double couvert = 4.0;

        double totalConsumo = (quantidadeCervejas * precoCerveja) +
                (quantidadeRefrigerantes * precoRefrigerante) +
                (quantidadeEspetinhos * precoEspetinho);

     
        if (totalConsumo > 30) {
            couvert = 0.0; 
        }

      
        double totalAPagar = ingresso + totalConsumo + couvert;

        String mensagem = "Relatório da Conta:\n"
                + "Sexo: " + sexo + "\n"
                + "Ingresso: R$ " + df.format(ingresso) + "\n"
                + "Total de Cervejas: R$ " + df.format(quantidadeCervejas * precoCerveja) + "\n"
                + "Total de Refrigerantes: R$ " + df.format(quantidadeRefrigerantes * precoRefrigerante) + "\n"
                + "Total de Espetinhos: R$ " + df.format(quantidadeEspetinhos * precoEspetinho) + "\n"
                + "Couvert Artístico: R$ " + df.format(couvert) + "\n"
                + "Total a Pagar: R$ " + df.format(totalAPagar);

        JOptionPane.showMessageDialog(null, mensagem, "Relatório da Conta", JOptionPane.INFORMATION_MESSAGE);
    }
}

