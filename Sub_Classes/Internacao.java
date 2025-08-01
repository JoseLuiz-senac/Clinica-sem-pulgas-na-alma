package Sub_Classes;

import Classe_Mae.Clinica;
import java.time.LocalTime;
import java.util.Scanner;

public class Internacao extends Clinica {
    Scanner vet = new Scanner(System.in);
    String Doutor;
    String data;
    String hora;
    String motivo;
    String valor;
    boolean pago = false;

    public Internacao(String nome_C, String servico, String Doutor, String data, String hora, String motivo, String valor) {
        super(nome_C, servico);
        this.Doutor = "Dr. Nathan";
        this.valor = "10.857,50";
    }

    public String setDoutor(String Doutor){
        return this.Doutor = "Dr. Nathan";
    }
    public String getDoutor(){
        return Doutor;
     }

    public String setData(String data){
        return this.data = data;
    }
    public String getdata(){
        return Doutor;
     }

    public String setHora(String hora){
        return this.hora = hora;
    }
    public String gethora(){
        return Doutor;
     }

    public String setMotivo(String motivo){
        return this.motivo = motivo;
    }
    public String getmotivo(){
        return motivo;
     }

    public String setValor(String valor){
        return this.valor = valor;
    }
    public String getvalor(){
        return valor;
     }

    public void entrada() {
        LocalTime agora = LocalTime.now();
        System.out.println("Digite o motivo: ");
        this.motivo = vet.next();

        System.out.println("Internação registrada "+
            " com o " + this.Doutor + ". Motivo: " + this.motivo +
            ". Entrada registrada às: " + agora.withNano(0));
    }

    public boolean pagamento(boolean pagou) {
        this.pago = pagou;
        if (pagou) {
            System.out.println("Pagamento de R$ " + this.valor + " realizado para a internação: " + this.motivo + ".");
        } else {
            System.out.println("Pagamento não realizado para a internação: " + this.motivo + ".");
        }
        return this.pago;
    }
}
