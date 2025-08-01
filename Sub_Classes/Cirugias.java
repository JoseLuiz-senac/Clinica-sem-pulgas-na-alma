package Sub_Classes;
import java.util.Scanner;  
import Classe_Mae.Clinica;


public class Cirugias extends Clinica{
    String Doutor;
    String data;
    int hora;
    String cirurgias;
    String valor;
    boolean pago = false;

    public Cirugias(String nome_C, String servico, String data, String hora, String cirurgias, String valor) {
        super(nome_C, servico);
        this.Doutor = "Dra. Samara";
        this.valor = "4.659,99";
        }
        public String setdoutor(String Doutor){
           return this.Doutor = Doutor;
        } 
        
        public String getDoutor(){
            return Doutor;
         }
        
        public String setdata(String Data){
           return this.data = Data;
        }
        public String getData(String data){
            return data;
         }
        
        public int setHora(int hora){
            return this.hora = hora;
        }
        public int gethora(){
            return hora;
        }
        
        public String setcirurgia(String Cirurgias){
           return this.cirurgias = Cirurgias;
        }
        public String getcirurgias(){
            return cirurgias;
         }

        public String setvalor(String valor){
           return this.valor = valor;
        }
        public String getvalor(){
            return valor;
         }


   
    public void reservarCirurgia() {
    	 String[] reservas = {
    	            "10:00", "10:50", "11:40", "12:30", "13:20", "14:10", "15:00", "15:50", "16:40", "17:30","18:20", "19:10", "20:00"
    	        };
        Scanner vet = new Scanner(System.in);
        System.out.println("Digite a data da consulta (dd/mm/yyyy): ");
        String data = vet.next();
        System.out.println("Escolha um horário disponível: ");
        for (int i = 0; i < reservas.length; i++) {
            System.out.println((i + 1) + " - " + reservas[i]);
        }
        int horario = vet.nextInt();
        String hora = reservas[horario - 1];
    	
        System.out.println("Consulta reservada para o dia " + data + " às " + hora + " com o " + Doutor + ".");
    }

    public boolean realizarPagamento(boolean pagou) {
        this.pago = pagou;
        if (pagou) {
            System.out.println("Pagamento de R$ " + valor + " realizado para a cirurgia: " + cirurgias + ".");
        } else {
            System.out.println("Pagamento não realizado para a cirurgia: " + cirurgias + ".");
        }
        return pago;
    }
}
