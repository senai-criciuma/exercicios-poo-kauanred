package Ex.FinalPOO.ExerciciosFacil.Ex35;

public class Quadrado implements FormaGeometrica {

    @Override
    public double calcularArea(double base, double altura, double pi, double perimetro){
        double area = base * altura;
        return area;
    }
    @Override
    public double calcularPerimetro(double base, double altura, double pi, double raio){
        double perimetro = base * 4;
        return perimetro;
    }
}
