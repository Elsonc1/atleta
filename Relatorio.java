package atleta;

import java.util.List;

public class Relatorio {

	private List<Atleta> atletas;

    public Relatorio(List<Atleta> atletas) {
        this.atletas = atletas;
    }

    public double calcularPesoMedio() {
        double somaPeso = 0;
        for (Atleta atleta : atletas) {
            somaPeso += atleta.getPeso();
        }
        return somaPeso / atletas.size();
    }

    public String atletaMaisAlto() {
        String nomeMaisAlto = "";
        double maiorAltura = 0;
        for (Atleta atleta : atletas) {
            if (atleta.getAltura() > maiorAltura) {
                maiorAltura = atleta.getAltura();
                nomeMaisAlto = atleta.getNome();
            }
        }
        return nomeMaisAlto;
    }

    public double calcularPorcentagemHomens() {
        int homens = 0;
        for (Atleta atleta : atletas) {
            if (atleta.getSexo().equals("M")) {
                homens++;
            }
        }
        return (double) homens / atletas.size() * 100;
    }

    public String calcularAlturaMediaMulheres() {
        double somaAltura = 0;
        int mulheres = 0;
        for (Atleta atleta : atletas) {
            if (atleta.getSexo().equals("F")) {
                somaAltura += atleta.getAltura();
                mulheres++;
            }
        }
        if (mulheres == 0) {
            return "Não há mulheres cadastradas";
        }
        return String.format("%.2f", somaAltura / mulheres);
    }

    public void gerarRelatorio() {
        System.out.println("\n### RELATÓRIO ###");
        System.out.printf("Peso médio dos atletas: %.2f%n", calcularPesoMedio());
        System.out.println("Atleta mais alto: " + atletaMaisAlto());
        System.out.printf("Porcentagem de homens: %.1f %% %n", calcularPorcentagemHomens());
        System.out.println("Altura média das mulheres: " + calcularAlturaMediaMulheres());
    }
}
