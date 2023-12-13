package com.github.javacaldeiraonline.circulo;

public class Circulo {

    /**
     * Crie uma classe chamada Circulo com os seguintes atributos:
     * raio (representando o raio do círculo)
     */
    private double raio;

    /**
     * Crie um construtor para a classe que permita inicializar o raio ao criar um objeto.
     */
    public Circulo(double raio) {
        definirRaio(raio);
    }

    /**
     * calcularArea(): Este método deve calcular a área do círculo com base no raio e retornar o resultado.
     */
    public double calcularArea() {
        return Math.PI * Math.pow(raio, 2);
    }

    /**
     * calcularCircunferencia(): Este método deve calcular a circunferência do círculo
     * com base no raio e retornar o resultado.
     */
    public double calcularCircunferencia() {
        return 2 * Math.PI * raio;
    }

    /**
     * Implemente um método definirRaio(double novoRaio) que permita alterar o raio do círculo.
     */
    public void definirRaio(double novoRaio) {
        if (novoRaio > 0) {
            this.raio = novoRaio;
        } else {
            throw new IllegalArgumentException("O raio deve ser um valor positivo.");
        }
    }

    /**
     * Crie um método para calcular o diâmetro do círculo.
     */
    public double calcularDiametro() {
        return 2 * raio;
    }

    /**
     * Adicione um método para verificar se dois círculos são iguais, ou seja, se têm o mesmo raio.
     */
    public boolean saoIguais(Circulo outroCirculo) {
        return this.raio == outroCirculo.raio;
    }

    /**
     * Implemente um método para calcular a área sombreada entre dois círculos concêntricos de diferentes raios.
     */
    public double calcularAreaSombreada(Circulo outroCirculo) {
        if (this.raio >= outroCirculo.raio) {
            double areaCirculoMaior = this.calcularArea();
            double areaCirculoMenor = outroCirculo.calcularArea();
            return areaCirculoMaior - areaCirculoMenor;
        } else {
            throw new IllegalArgumentException("O raio do primeiro círculo deve ser maior ou igual ao raio do segundo círculo.");
        }
    }

    /**
     * Adicione a capacidade de criar um círculo a partir de um ponto no plano cartesiano (coordenadas x, y) e um raio.
     */
    public static Circulo criarAPartirDeCoordenadas(double x, double y, double raio) {
        double distanciaAoCentro = Math.sqrt(x * x + y * y);
        return new Circulo(distanciaAoCentro + raio);
    }

    /**
     * Implemente um método toString() que retorne uma representação em texto do círculo,
     * incluindo o raio, a área e a circunferência.
     */
    @Override
    public String toString() {
        return "Circulo{" +
                "raio=" + raio +
                '}';
    }

    /**
     * Método equals para comparar dois círculos e método hashCode para gerar um código hash.
     * ambos foram gerados pelo IntelliJ
     */

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Circulo circulo)) return false;

        return Double.compare(raio, circulo.raio) == 0;
    }

    @Override
    public int hashCode() {
        long temp = Double.doubleToLongBits(raio);
        return (int) (temp ^ (temp >>> 32));
    }

}