package Sub_Classes;

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

    public String setExames(String exames){
        return this.exames = exames;
    }

    public String setValor(String valor){
        return this.valor = valor;
    }

    public void reserva() {
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