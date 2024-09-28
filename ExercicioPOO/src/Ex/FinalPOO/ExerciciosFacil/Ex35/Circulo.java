package Ex.FinalPOO.ExerciciosFacil.Ex35;

public class Circulo implements FormaGeometrica {

    @Override
    public double calcularArea(double base, double altura, double pi, double raio){
        double area = pi * (raio * raio);
        return area;
    }
    @Override
    public double calcularPerimetro(double base, double altura, double pi, double raio){
double perimetro = 2 * pi * raio;
return perimetro;
    }
}
