import Classe_Mae.Clinica;
import java.util.Scanner;  
public class Main {
    public static void main(String[] args){
        Clinica c = new Clinica("Sem Pulgas Na Alma", "servicos");
        String[] reservas = {
            "10:00", "10:50", "11:40", "12:30", "13:20", "14:10", "15:00", "15:50", "16:40", "17:30","18:20", "19:10", "20:00"
        };
        Scanner vet = new Scanner(System.in);
        System.out.println("bom dia, bem vindo a"+c.nome_C+"!!!");

        System.out.println("Digite o nome do cliente: ");
        String nomeC = vet.nextLine();

        System.out.println("Digite o nome do animal: ");
        String nomeA = vet.nextLine();

        System.out.println("Digite a raça do animal: ");
        String racaA = vet.nextLine();

        Clinica cliente = new Clinica(nomeC, nomeA, racaA);
        c.escolherServico();

        System.out.println("Escolha um serviço para continuar: ");
        int esc = vet.nextInt();


    }
}