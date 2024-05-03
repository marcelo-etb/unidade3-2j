package unidade3;

public class TesteMonitor2 {
    
    public static void main(String[] args) {
        // Declarando objeto m
        Monitor m = new Monitor();
        // Modificando o estado do objeto m
        m.frequencia = 60;
        m.marca = "LG";
        m.modelo = "LW60q";
        m.resolucao = "1920x1080";
        m.tamanho = 21;
        m.preco = 540;
        // Declarando objeto m2
        Monitor m2 = new Monitor();
        // Chamando o metodo (enviando mensagem ao objeto)
        m.mostrarInfo();
        m2.mostrarInfo();
    }

}
