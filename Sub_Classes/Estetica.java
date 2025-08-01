package Sub_Classes;

import java.util.Scanner;

import Classe_Mae.Clinica;

public class Estetica extends Clinica {
    String Doutor;
    String data;
    String hora;
    String tossaH; 
    String tossaT; 
    String valor;
    boolean pago = false;

    public Estetica(String nome_C, String servico, String Doutor, String data, String hora, String tossaH, String tossaT, String valor) {
        super(nome_C, servico);
        this.Doutor = "Dra. Gaby";
        this.valor = "3.000.000.000,00";
    }

    public String setDoutor(String Doutor){
        return this.Doutor = "Dra. Gaby";
    }
    public String getDoutor(){
        return Doutor;
     }

    public String setData(String data){
        return this.data = data;
    }
    public String getData(){
        return data;
     }

    public String setHora(String hora){
        return this.hora = hora;
    }
    public String gethora(){
        return hora;
     }

    public String setTossaH(String tossaH){
        return this.tossaH = tossaH;
    }
    public String gettossah(){
        return tossaH;
     }

    public String setTossaT(String tossaT){
        return this.tossaT = tossaT;
    }
    public String gettossaT(){
        return tossaT;
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
    System.out.println("Digite a data da Estetica (dd/mm/yyyy): ");
    String data = vet.next();
    System.out.println("Escolha um horário disponível: ");
    for (int i = 0; i < reservas.length; i++) {
        System.out.println((i + 1) + " - " + reservas[i]);
    }
    int horario = vet.nextInt();
    String hora = reservas[horario - 1];
    	
        System.out.println("Estética reservada para o dia " + this.data + " às " + this.hora +
            " com o Dr. " + this.Doutor + ". Tossa Higienica: " + this.tossaH + ", Tossa Total: " + this.tossaT + ".");
    }

    public boolean pagamento(boolean pagou) {
        this.pago = pagou;
        if (pagou) {
            System.out.println("Pagamento de R$ " + this.valor + " realizado para o serviço de estética.");
        } else {
            System.out.println("Pagamento não realizado para o serviço de estética.");
        }
        return this.pago;
    }
}
