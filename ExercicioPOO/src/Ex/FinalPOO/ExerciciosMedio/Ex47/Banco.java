package Ex.FinalPOO.ExerciciosMedio.Ex47;

public class Banco {
    private String conta1;
  private double saldo;

    public void criarConta(){
        System.out.println("Sistema indisponivel");

    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void transferencia(double valor){
        if (saldo>valor){
            System.out.println("tranferencia feita");
        }else {
            System.out.println("saldo insuficiente");
        }



    }
}
