package Ex.FinalPOO.ExerciciosMedio.Ex49;

public class Restaurante {
    private int pratos;

    public int adicionarEstoque(int valor){
        pratos+=valor;
        return pratos;
    }

    public int removerEstoque(int valor) {
        if (pratos > valor) {
            pratos -= valor;
            return pratos;
        } else {
            System.out.println("Quantidade insuficiente");
            return pratos;
        }
    }
    public void buscarPorNome(){
        System.out.println("Item nao encontrado  ");
    }

    public void buscarPorCategoria(){
        System.out.println("Item nao encontrado ");
    }


}
