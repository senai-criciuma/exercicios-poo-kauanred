package Ex.FinalPOO.ExerciciosFacil.Ex33;

public class ContaBancaria {
    private int numeroConta;
    private String titular;
    private double saldo;

    public double depositar(int valor){
        saldo =+ valor;
        return saldo;
    }

    public int sacar(int valor){
        if (saldo >= valor){
            saldo =- valor;
            return valor;
        }else {
            System.out.println("saldo insuficiente");
        }return 0;
    }

    public void setSaldo(double saldo) {
        System.out.println("Saldo:"+saldo);
    }
}
