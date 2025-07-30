package Sub_Classes;

import Classe_Mae.Clinica;

public class OrientacaoNutCompor extends Clinica {
    String Doutor;
    String data;
    String hora;
    String valor;
    boolean pago = false;

    public OrientacaoNutCompor(String nome_C, String servico, String Doutor, String data, String hora, String valor) {
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

    public String setValor(String valor){
        return this.valor = valor;
    }

    public void reserva() {
        System.out.println("Orientação nutricional e comportamental reservada para o dia " + this.data +
            " às " + this.hora + " com o Dr. " + this.Doutor + ".");
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
