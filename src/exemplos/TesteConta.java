package exemplos;
public class TesteConta {
    public static void main(String[] args) {
        Conta c = new Conta(123,"Maria",1000);
        c.depositar(50);
        c.depositar(100);
//        c.setNomeTitular("Marcelo");
//        c.setNumero(123456);
        boolean saqueEfetuado = c.sacar(800);
        if (saqueEfetuado) {
            System.out.println("Saque efetuado com sucesso!");
        } else {
            System.out.println("Erro ao efetuar saque");
        }
        System.out.println(c);
        System.out.println(new Conta(456, "Sara", 10000));
        System.out.println(new Conta(789, "Lucilene"));
    }
}
