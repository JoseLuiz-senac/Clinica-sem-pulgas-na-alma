package Sub_Classes;

import Classe_Mae.Clinica;
import java.util.Scanner;

public class Tratamentos extends Clinica {
    String Doutor;
    String data;
    String hora;
    String valor;
    boolean pago = false;

    public Tratamentos(String nome_C, String servico, String Doutor, String data, String hora, String valor) {
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
        System.out.println("Tratamento clínico reservado para o dia " + this.data +
            " às " + this.hora + " com o Dr. " + this.Doutor + ".");
    }

    public boolean pagamento(boolean pagou) {
        this.pago = pagou;
        if (pagou) {
            System.out.println("Pagamento de R$ " + this.valor + " realizado para o tratamento clínico.");
        } else {
            System.out.println("Pagamento não realizado para o tratamento clínico.");
        }
        return this.pago;
    }

    public void tratamentos() {
        String[] lista = {
            "Checkup veterinário",
            "Desparasitação",
            "Tratamento de infecção"
        };
        System.out.println("Tratamentos disponíveis:");
        for (int i = 0; i < lista.length; i++) {
            System.out.println((i+1) + " - " + lista[i]);
        }
    }
}
