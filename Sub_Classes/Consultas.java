package Sub_Classes;

import java.util.Scanner;

import Classe_Mae.Clinica;

public class Consultas extends Clinica {
    String Doutor;
    String data;
    String hora;
    String causa;
    String valor;
    boolean pago = false;

    public Consultas(String nome_C, String servico, String Doutor, String data, String hora, String causa, String valor) {
        super(nome_C, servico);
        this.Doutor = "Dr. Augustus";
        this.valor = "857,50";
    }

    public String setDoutor(String Doutor){
        return this.Doutor = "Dr. Augustus";
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

    public String setCausa(String causa){
        return this.causa = causa;
    }
    public String causa(){
        return causa;
     }

    public String setValor(String valor){
        return this.valor = valor;
    }
    public String getvalor(){
        return valor;
     }

    public void reservarConsulta() {
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

    	
        System.out.println("Consulta reservada para o dia " + this.data + " às " + this.hora + " com o Dr. " + this.Doutor + ".");
    }

    public boolean realizarPagamento(boolean pagou) {
        this.pago = pagou;
        if (pagou) {
            System.out.println("Pagamento de R$ " + this.valor + " realizado para a consulta de: " + this.causa + ".");
        } else {
            System.out.println("Pagamento não realizado para a consulta de: " + this.causa + ".");
        }
        return this.pago;
    }
}