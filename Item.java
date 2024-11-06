public abstract class Item extends ItemDeBiblioteca {
    private String titulo;
    private String autor;
    private int anoDePublicacao;
    private boolean disponivel = true;

    Item(String titulo, String autor, int anoDePublicacao){
        this.titulo = titulo;
        this.autor = autor;
        this.anoDePublicacao = anoDePublicacao;
    }

    public void setTitulo(String titulo){
        this.titulo = titulo;
    }

    public void setAutor(String autor){
        this.autor = autor;
    }

    public void setAnoDePublicacao(int anoDePublicacao){
        this.anoDePublicacao = anoDePublicacao;
    }

    public String getTitulo(){
        return titulo;
    }

    public String getAutor(){
        return autor;
    }

    public int getAnoDePublicacao(){
        return anoDePublicacao;
    }

    public void emprestar(){
        if(disponivel){
            disponivel = false;
            System.out.println("Item emprestado");
        }else{
            System.out.println("Item já emprestado");
        }
    }

    public void devolver(){
        if (!disponivel){
            disponivel = true;
            System.out.println("Item devolvido");
        }else{
            System.out.println("Item já está disponivel");
        }
    }

    public boolean itemDisponivel(){
        return disponivel;
    }
}
