package Sub_Classes;

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
    }

    public String setDoutor(String Doutor){
        return this.Doutor = Doutor;
    }

    public String setData(String data){
        return this.data = data;
    }

    public String setHora(String hora){
        return this.hora = hora;
    }

    public String setCausa(String causa){
        return this.causa = causa;
    }

    public String setValor(String valor){
        return this.valor = valor;
    }

    public void reservarConsulta() {
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