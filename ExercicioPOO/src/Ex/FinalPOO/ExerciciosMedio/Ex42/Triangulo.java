package Ex.FinalPOO.ExerciciosMedio.Ex42;

public class Triangulo extends FiguraGeometrica {

    @Override
    public double calcularArea(double base, double altura, double pi, double raio, double lado1, double lado2) {
        double area = (base * altura)/2;
        return area;
    }

    @Override
    public double calcularPerimetro(double base, double altura, double pi, double raio, double lado1, double lado2) {
        double perimetro = base + lado1 + lado2;
        return perimetro;
    }
}
