package unidade3;

// Declaração da classe
public class Monitor {
    // Declaração dos atributos
    int tamanho;
    String resolucao;
    String marca;
    String modelo;
    int frequencia;
    double preco;
    
    void mostrarInfo() {
        System.out.println("Informações do Monitor");
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Tamanho: " + tamanho + "''");
        System.out.println(resolucao + " " + frequencia + "hz");
        System.out.println("Preço: " + preco);
    }
}
