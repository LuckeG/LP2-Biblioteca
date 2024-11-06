import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/*public class Main {
    public static void main(String[] args) {

        Casa casa1 = new Casa(4, 5, "Centro");
        casa1.exibirCasa();
        System.out.println();

        Casa casa2 = new Aluguel(10, 20, "Longe", 5000);
        casa2.exibirCasa();
    }
}
*/

/*public class Main {
    public static void main(String[] args) {

        Estudante estudante1 = new Estudante("Lucas", 21, "12", 908734638 );


        System.out.println("Estudante 1: " +estudante1.getNome());
        System.out.println("Estudante 1: " +estudante1.getIdade());
        System.out.println("Estudante 1: " +estudante1.getMatricula());
        System.out.println("Estudante 1: " +estudante1.getCpf());

        estudante1.setNome("Camily");

        System.out.println("Estudante 1 Modificada: " +estudante1.getNome());
    }
}
*/

/*public class Main{
    public static void main(String[] args){
        Animal animal1 = new Cachorro();
        Animal animal2 = new Gato();
        animal1.falar();
        animal2.falar();

    }
}
*/

/*public class Main{
    public static  void main(String[] args){
        Scanner leitor = new Scanner(System.in);
        List<Jogo> jogo = new ArrayList<>();
        int opcao = 0;
        jogo.add(new Fisico("The last of us", 300, "202030"));
        jogo.add(new Digital("The Legend of Zelda", 200, "0102030405"));
        jogo.add(new Fisico("Dragon Ball Z", 300, "102923"));
        jogo.add(new Digital("Monster Hunter", 200, "8823474232"));

        for (Jogo jogos : jogo){
            jogos.exibirJogo();
        }

        do{
            System.out.println("\nO que deseja ver?");
            System.out.println("1 - Jogos Fisicos");
            System.out.println("2 - Jogos Digitais");
            System.out.println("3 - Todos os Jogos");
            System.out.println("0 - Sair");
            System.out.println("Digite uma opcão");
            opcao = leitor.nextInt();

            switch (opcao){
                case 1:
                    System.out.println("\nJogos Fisicos: ");
                    for (Jogo jogos : jogo){
                        if(jogo instanceof Fisico){
                            jogos.exibirJogo();
                        }
                    }
                    break;
                case 2:
                    System.out.println("\nJogos Digitais: ");
                    for (Jogo jogos : jogo){
                        if(jogo instanceof Digital){
                            jogos.exibirJogo();
                        }
                    }
                    break;
                case 3:
                    System.out.println("\nTodos os Jogos: ");
                    for (Jogo jogos : jogo){
                       jogos.exibirJogo();
                    }
                    break;
                default:
                    System.out.println("Opção Invalida");
            }
        }while(opcao!=0);

        leitor.close();
    }
}
*/

/*public class Main{
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);
        List<Produto> produtos = new ArrayList<>();

        produtos.add(new Notebook("Acer", 3000, 4));
        produtos.add(new Smartphone("Positivo", 4000, 5));
        produtos.add(new Notebook("AlienWare", 9000, 2));
        produtos.add(new Smartphone("HP", 1000, 10));


    }
}
*/

public class Main{
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);

        Revista revista1 = new Revista("Trono de Vidro", "Sarah", 2013, "Num sei");

        System.out.println("Disponibilidade: "+ revista1.itemDisponivel());
        revista1.emprestar();
        System.out.println("Disponibilidade: "+ revista1.itemDisponivel());
        revista1.devolver();
        System.out.println("Disponibilidade: "+ revista1.itemDisponivel());
        revista1.devolver();

    }
}