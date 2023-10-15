package JavaCaldeira.Exercícios_Java.aula02.ex004;
import javax.swing.event.ListDataEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ex004 {

    public static void main(String[] args) {

        Circulo circulo = new Circulo();
        Losangulo losangulo = new Losangulo();
        Quadrado quadrado = new Quadrado();
        Retangulo retangulo = new Retangulo();
        Triangulo triangulo = new Triangulo();

        List<FormaGeometrica> listaDasFormasGeometricas = new ArrayList<>();

        listaDasFormasGeometricas.add(retangulo);
        listaDasFormasGeometricas.add(triangulo);
        listaDasFormasGeometricas.add(losangulo);
        listaDasFormasGeometricas.add(quadrado);
        listaDasFormasGeometricas.add(circulo);

        for (FormaGeometrica forma : listaDasFormasGeometricas) {

            forma.calcularArea(5, 2);

        }


    }
}
