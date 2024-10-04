package Ex.FinalPOO.ExerciciosMedio.Ex42;

public class Retangulo extends FiguraGeometrica{

    @Override
    public double calcularArea(double base, double altura, double pi, double raio, double lado1, double lado2) {
        double area = base * altura;
        return area;
    }

    @Override
    public double calcularPerimetro(double base, double altura, double pi, double raio, double lado1, double lado2) {
        double perimetro = base * 2 + altura * 2;
        return perimetro;
    }
}
