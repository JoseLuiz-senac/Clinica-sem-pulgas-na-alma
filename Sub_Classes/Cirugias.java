package Sub_Classes;

import Classe_Mae.Clinica;


public class Cirugias extends Clinica{
    String Doutor;
    String data;
    String hora;
    String cirurgias;
    String valor;
    boolean pago = false;

    public Cirugias(String nome_C, String servico, String Doutor, String data, String hora, String cirurgias, String valor) {
        super(nome_C, servico);

        }
        public String setdoutor(String doutor){
           return this.Doutor = doutor;
        } 
        
        public String setdata(String Data){
           return this.data = Data;
        }
        
        public String sethora(String hora){
           return this.hora = hora;
        }
        
        public String setcirurgia(String Cirurgias){
           return this.cirurgias = Cirurgias;
        }

        public String setvalor(String valor){
           return this.valor = valor;
        }
   
    public void reservarCirurgia() {
        System.out.println("Cirurgia reservada para o dia " + data + " às " + hora + " com o Dr. " + Doutor + ".");
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
