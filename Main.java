import Classe_Mae.Clinica;
import Sub_Classes.Cirugias;

public class Main {
    public static void main(String[] args){
        Clinica c = new Clinica("Sem Pulgas Na Alma", "servicos");
        c.escolherServico();

        Cirugias cirugia = new Cirugias("Sem Pulgas Na Alma", "cirurgia", "Dr. Silva", "2024-06-01", "13:00", "Apendicite", "1500");
        cirugia.reservarCirurgia();
    }
}