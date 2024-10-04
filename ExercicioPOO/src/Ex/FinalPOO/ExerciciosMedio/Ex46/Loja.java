package Ex.FinalPOO.ExerciciosMedio.Ex46;

public class Loja {
private int quantEstoque;

    public int adicionarEstoque(int valor){
        quantEstoque+=valor;
        return quantEstoque;
    }

    public int removerEstoque(int valor) {
        if (quantEstoque > valor) {
            quantEstoque -= valor;
            return quantEstoque;
        } else {
            System.out.println("Quantidade insuficiente");
            return quantEstoque;
        }
    }
        public void buscarPorNome(){
            System.out.println("Item nao encontrado  ");
        }

         public void buscarPorCategoria(){
        System.out.println("Item nao encontrado ");
    }

    }
