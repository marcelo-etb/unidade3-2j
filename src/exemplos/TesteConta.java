package exemplos;
import javax.swing.JOptionPane;
public class TesteConta {
    public static void main(String[] args) {
        Conta c = new Conta();
        c.depositar(50);
        c.depositar(100);
        boolean saqueEfetuado = c.sacar(80);
        if (saqueEfetuado) {
            JOptionPane.showMessageDialog(null, "Saque efetuado com sucesso!");
        } else {
            JOptionPane.showMessageDialog(null, "Erro ao efetuar saque");
        }
        JOptionPane.showMessageDialog(null, "Saldo atual: " + c.saldo);
    }
}
