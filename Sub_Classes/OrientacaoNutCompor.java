package Sub_Classes;

import Classe_Mae.Clinica;
import java.util.Scanner;

public class OrientacaoNutCompor extends Clinica {
    String Doutor;
    String data;
    int hora;
    String valor;
    boolean pago = false;

    public OrientacaoNutCompor(String nome_C, String servico, String Doutor, String data, String hora, String valor) {
        super(nome_C, servico);
        this.Doutor = "Dr. Thiago";
        this.valor = "450,00";
    }

    public String setDoutor(String Doutor){
        return this.Doutor = "Dr. Thiago";
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

    public int setHora(int hora){
        return this.hora = hora;
    }
    public int gethora(){
        return hora;
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
    System.out.println("Digite a data da Orientação Nutricional e Corporal (dd/mm/yyyy): ");
     this.data = vet.next();
    System.out.println("Escolha um horário disponível: ");
    for (int i = 0; i < reservas.length; i++) {
        System.out.println((i + 1) + " - " + reservas[i]);
    }
    this.hora = vet.nextInt();
    String hora = reservas[this.hora - 1];
        System.out.println("Orientação nutricional e comportamental reservada para o dia " + this.data +
            " às " + hora + " com o Dr. " + this.Doutor + ".");
    }

    public boolean pagamento(boolean pagou) {
        this.pago = pagou;
        if (pagou) {
            System.out.println("Pagamento de R$ " + this.valor + " realizado para a orientação nutricional e comportamental.");
        } else {
            System.out.println("Pagamento não realizado para a orientação nutricional e comportamental.");
        }
        return this.pago;
    }
}
