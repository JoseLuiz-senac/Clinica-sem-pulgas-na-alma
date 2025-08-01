import Classe_Mae.Clinica;
import Sub_Classes.Cirugias;
import Sub_Classes.Consultas;
import Sub_Classes.Emergencia;
import Sub_Classes.Estetica;
import Sub_Classes.Exames;
import Sub_Classes.Internacao;
import Sub_Classes.OrientacaoNutCompor;
import Sub_Classes.Tratamentos;
import Sub_Classes.Vacinacao;
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Clinica c = new Clinica("Sem Pulgas Na Alma", "servicos");
        Scanner vet = new Scanner(System.in);
        System.out.println("bom dia, seja bem vindo a Sem Pulgas Na Alma!!");

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

        switch (esc) {
            case 1:
                Cirugias cirurgia = new Cirugias(nomeC, "cirurgias", "", "", "", "");
                System.out.println("Você escolheu cirurgias.");
                System.out.println("O nome da Doutora é: "+cirurgia.getDoutor());
                System.out.println("o valor da cirurgia será R$"+cirurgia.getvalor());


                
                cirurgia.reservarCirurgia();
                
                System.out.println("Deseja realizar o pagamento? (true/false)");
                boolean pagouci = vet.nextBoolean();
                cirurgia.realizarPagamento(pagouci);
                
                break;
                
            case 2:
            	Consultas consulta = new Consultas(nomeC, "Consulta", "", "", "", "", "");
                System.out.println("Você escolheu Consulta.");
                System.out.println("O nome do Doutor é: "+consulta.getDoutor());
                System.out.println("o valor da cirurgia será R$"+consulta.getvalor());


                
                consulta.reservarConsulta();
                
                System.out.println("Deseja realizar o pagamento? (true/false)");
                boolean pagoucon = vet.nextBoolean();
                consulta.realizarPagamento(pagoucon);

                break;
                
            case 3:
            	Emergencia emergencias = new Emergencia(nomeC, "Emergencia", "", "", "", "", "");
                System.out.println("Você escolheu Emergencia.");
                System.out.println("O nome do Doutor é: "+emergencias.getDoutor());
                System.out.println("o valor da cirurgia será R$"+emergencias.getvalor());


                
                emergencias.entrada();
                
                System.out.println("Deseja realizar o pagamento? (true/false)");
                boolean pagouem = vet.nextBoolean();
                emergencias.pagamento(pagouem);
                
                break;
            case 4:
            	Estetica Estetica = new Estetica(nomeC, "Emergencia", "", "", "", "", "", "");
                System.out.println("Você escolheu Estetica.");
                System.out.println("O nome da Doutora é: "+Estetica.getDoutor());
                System.out.println("o valor da cirurgia será R$"+Estetica.getvalor());
                
                Estetica.reserva();
                
                System.out.println("Deseja realizar o pagamento? (true/false)");
                boolean pagoues = vet.nextBoolean();
                Estetica.pagamento(pagoues);
                
                break;
                
            case 5:
            	Exames exames = new Exames(nomeC, "Exames", "", "", "", "", "");
                System.out.println("Você escolheu Exames.");
                System.out.println("O nome da Doutora é: "+exames.getDoutor());
                System.out.println("o valor da cirurgia será R$"+exames.getvalor());
                
                exames.reserva();
                
                System.out.println("Deseja realizar o pagamento? (true/false)");
                boolean pagouex = vet.nextBoolean();
                exames.pagamento(pagouex);
                
                break;
                
            case 6:
            	Internacao Internacao = new Internacao(nomeC, "Internação", "", "", "", "", "");
                System.out.println("Você escolheu internação.");
                System.out.println("O nome do Doutor é: "+Internacao.getDoutor());
                System.out.println("o valor da cirurgia será R$"+Internacao.getvalor());
                
                Internacao.entrada();
                
                System.out.println("Deseja realizar o pagamento? (true/false)");
                boolean pagouin = vet.nextBoolean();
                Internacao.pagamento(pagouin);
                
                break;
                
            case 7:
            	OrientacaoNutCompor orien = new OrientacaoNutCompor(nomeC, "Orientação Nutricional e Comportamental", "", "", "", "");
                System.out.println("Você escolheu Orientação Nutricional e Comportamental.");
                System.out.println("O nome do Doutor é: "+orien.getDoutor());
                System.out.println("o valor da cirurgia será R$"+orien.getvalor());
                
                orien.reserva();
                
                System.out.println("Deseja realizar o pagamento? (true/false)");
                boolean pagouon = vet.nextBoolean();
                orien.pagamento(pagouon);
                
                break;
                
            case 8:
            	Tratamentos Tratamentos = new Tratamentos(nomeC, "Tratamentos", "", "", "", "");
                System.out.println("Você escolheu Tratamentos.");
                System.out.println("O nome do Doutor é: "+Tratamentos.getDoutor());
                System.out.println("o valor da cirurgia será R$"+Tratamentos.getvalor());
                
                Tratamentos.reserva();
                
                System.out.println("Deseja realizar o pagamento? (true/false)");
                boolean pagoutr = vet.nextBoolean();
                Tratamentos.pagamento(pagoutr);
                
                break;
                
            case 9:
            	Vacinacao Vacinacao = new Vacinacao(nomeC, "vacinação", "", "", "", "");
                System.out.println("Você escolheu Vacinação.");
                System.out.println("O nome da Doutora é: "+Vacinacao.getDoutor());
                System.out.println("o valor da vacinação será R$"+Vacinacao.getvalor());
                
                Vacinacao.vacinas();
                
                Vacinacao.reservarVacina();
                
                System.out.println("Deseja realizar o pagamento? (true/false)");
                boolean pagouva = vet.nextBoolean();
                Vacinacao.pagamento(pagouva);
                
                break;
                
            default:
                System.out.println("Serviço não disponível.");
        }
        

    }
}