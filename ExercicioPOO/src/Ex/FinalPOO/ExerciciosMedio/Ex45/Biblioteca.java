package Ex.FinalPOO.ExerciciosMedio.Ex45;

public class Biblioteca {
    private int quantRevista;
    private int quantLivro;

    public int adicionarRevista(int valor){
        quantRevista +=valor;
        return quantRevista;
    }

    public int adicionarlivro(int valor){
        quantLivro +=valor;
        return quantLivro;
    }

    public int removerRevista(int valor){
        if (quantRevista> valor){
        quantRevista -=valor;
        return quantRevista;}
        else {System.out.println("Quantidade insuficiente");
            return quantRevista;
             }
    }

    public int removerlivro(int valor){
        if (quantLivro> valor){
            quantLivro -=valor;
            return quantLivro;}
        else {System.out.println("Quantidade insuficiente");
            return quantLivro;
        }
    }

    public void buscarLivro(){
        System.out.println("Quantidade de livros: "+quantLivro);
    }

    public void buscarRevista(){
        System.out.println("Quantidade de livros: "+quantRevista);
    }
}
