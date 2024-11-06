import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

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
