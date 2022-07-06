package principal;

import fruta.Fruta;
import javax.swing.JOptionPane;

public class Principal {
    
    public static void main(String[] args) {
        String entrada = "";
        entrada = JOptionPane.showInputDialog("Qual é o nome da fruta?");        
        String nome = entrada;
        entrada = JOptionPane.showInputDialog("Qual é o peso aproximado (g) ?");
        double pesoAproximado = Double.parseDouble(entrada);
        entrada = JOptionPane.showInputDialog("Qual é o tamanho aproximado (cm) ?");
        int tamanhoAproximado = Integer.parseInt(entrada);
        
        Fruta fruta1 = new Fruta();
        fruta1.setNome(nome);
        fruta1.setPesoAproximado(pesoAproximado);
        fruta1.setTamanhoAproximado(tamanhoAproximado);
        
        Fruta fruta2 = new Fruta("Melão", 500.25, 25);
        
        String resultado = fruta1 + "\n" + fruta2;
        JOptionPane.showMessageDialog(null, resultado);
    }
    
}
