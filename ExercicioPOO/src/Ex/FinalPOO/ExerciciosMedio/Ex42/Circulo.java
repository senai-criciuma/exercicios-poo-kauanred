package Ex.FinalPOO.ExerciciosMedio.Ex42;

public class Circulo extends FiguraGeometrica {

    @Override
    public double calcularArea(double base, double altura, double pi, double raio, double lado1, double lado2) {
        double area = pi * (raio * raio);
        return area;
    }

    @Override
    public double calcularPerimetro(double base, double altura, double pi, double raio, double lado1, double lado2) {
        double perimetro = 2 * pi * raio;
        return perimetro;
    }

}
