package atleta;

public class Atleta {

    private String nome;
    private String sexo;
    private double altura;
    private double peso;

    public Atleta(String nome, String sexo, double altura, double peso) {
        this.nome = nome;
        this.sexo = validarSexo(sexo);
        this.altura = validarPositivo(altura, "altura");
        this.peso = validarPositivo(peso, "peso");
    }

    private double validarPositivo(double valor, String tipo) {
        if (valor > 0) {
            return valor;
        }
        throw new IllegalArgumentException("Valor inválido para " + tipo + ": deve ser positivo.");
    }

    private String validarSexo(String sexo) {
        if (sexo.equalsIgnoreCase("M") || sexo.equalsIgnoreCase("F")) {
            return sexo.toUpperCase();
        }
        throw new IllegalArgumentException("Sexo inválido: deve ser 'M' ou 'F'.");
    }

    public String getNome() {
        return nome;
    }

    public String getSexo() {
        return sexo;
    }

    public double getAltura() {
        return altura;
    }

    public double getPeso() {
        return peso;
    }
    
}