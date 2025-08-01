package Sub_Classes;

import java.util.Scanner;

import Classe_Mae.Clinica;

public class Exames extends Clinica {
    String Doutor;
    String data;
    String hora;
    String exames;
    String valor;
    boolean pago = false;

    public Exames(String nome_C, String servico, String Doutor, String data, String hora, String exames, String valor) {
        super(nome_C, servico);
        this.Doutor = "Dr. Paivá";
        this.valor = "1.750,0";
    }

    public String setDoutor(String Doutor){
        return this.Doutor = "Dra. Paivá";
    }
    public String getDoutor(){
        return Doutor;
     }

    public String setData(String data){
        return this.data = data;
    }
    public String getdata(){
        return data;
     }

    public String setHora(String hora){
        return this.hora = hora;
    }
    public String gethora(){
        return hora;
     }

    public String setExames(String exames){
        return this.exames = exames;
    }
    public String getExames(){
        return exames;
     }

    public String setValor(String valor){
        return this.valor = valor;
    }
    public String getvalor(){
        return valor;
     }

    public void reserva() {
    	
    	String[] reservas = {
	            "10:00", "10:50", "11:40", "12:30", "13:20", "14:10", "15:00", "15:50", "16:40", "17:30","18:20", "19:10", "20:00"
	        };
    Scanner vet = new Scanner(System.in);
    System.out.println("Digite a data do exame (dd/mm/yyyy): ");
    String data = vet.next();
    System.out.println("Escolha um horário disponível: ");
    for (int i = 0; i < reservas.length; i++) {
        System.out.println((i + 1) + " - " + reservas[i]);
    }
    int horario = vet.nextInt();
    String hora = reservas[horario - 1];
        System.out.println("Exame reservado para o dia " + this.data + " às " + this.hora +
            " com o Dr. " + this.Doutor + ". Exame: " + this.exames + ".");
    }

    public boolean pagamento(boolean pagou) {
        this.pago = pagou;
        if (pagou) {
            System.out.println("Pagamento de R$ " + this.valor + " realizado para o exame: " + this.exames + ".");
        } else {
            System.out.println("Pagamento não realizado para o exame: " + this.exames + ".");
        }
        return this.pago;
    }
}