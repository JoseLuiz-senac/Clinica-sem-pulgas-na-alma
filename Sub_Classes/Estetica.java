package Sub_Classes;

import Classe_Mae.Clinica;

public class Estetica extends Clinica {
    String Doutor;
    String data;
    String hora;
    String tossaH; // Tossa Higienica
    String tossaT; // Tossa Total
    String valor;
    boolean pago = false;

    public Estetica(String nome_C, String servico, String Doutor, String data, String hora, String tossaH, String tossaT, String valor) {
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

    public String setTossaH(String tossaH){
        return this.tossaH = tossaH;
    }

    public String setTossaT(String tossaT){
        return this.tossaT = tossaT;
    }

    public String setValor(String valor){
        return this.valor = valor;
    }

    Consultas c = new Consultas("Sem Pulgas Na Alma","Estetica","Dra. Jeane", "2025-02-30", "15:00", "", "269");

    public void reserva() {
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
