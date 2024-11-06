public class Revista extends Item {
    private String editora;

    Revista(String titulo, String autor, int anoDePublicacao, String editora){
        super(titulo, autor, anoDePublicacao);
        this.editora = editora;
    }

    public String getEditora(){
        return editora;
    }

    public void setEditora(String editora){
        this.editora = editora;
    }

    public void emprestar(){
        super.emprestar();
    }
    public void devolver(){
        super.devolver();
    }
    public boolean itemDisponivel() {
        return super.itemDisponivel();
    }

}
