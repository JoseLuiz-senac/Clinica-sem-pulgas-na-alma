package Classe_Mae;

import java.util.Scanner;

public class Clinica {

    String nome_C;
    String nome_D;
    String nome_A;
    String raca_A;
    String servico;

    public Clinica (String nome_C, String servico){
        this.nome_C = nome_C;
        this.servico = servico;
    }

    public Clinica (String nome_D, String nome_A, String raca_A){
        this.nome_D = nome_D;
        this.nome_A = nome_A;
        this.raca_A = raca_A;
    }

    public void escolherServico() {
        String[] servicos = {
            "cirurgias", "consultas", "emergencias", "estetica",
            "exames", "internação", "orientação nutricional e comportamental",
            "tratamentos", "vascinação"
        };
        System.out.println("\nServiços disponíveis:");
        for (int i = 0; i < servicos.length; i++) {
            System.out.println((i+1) + " - " + servicos[i]);
        }
        System.out.print("Escolha o número do serviço desejado: ");
        Scanner sc = new Scanner(System.in);
        int opcao = sc.nextInt();
        if (opcao >= 1 && opcao <= servicos.length) {
            servico = servicos[opcao-1];
            System.out.println("Serviço escolhido: " + servico);
        } else {
            System.out.println("Opção inválida.");
        }
    }
}
