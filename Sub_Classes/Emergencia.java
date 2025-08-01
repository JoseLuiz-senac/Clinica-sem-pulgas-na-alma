package Sub_Classes;

import Classe_Mae.Clinica;
import java.time.LocalTime;

public class Emergencia extends Clinica {
    String Doutor;
    String data;
    String hora;
    String motivo;
    String valor;
    boolean pago = false;

    public Emergencia(String nome_C, String servico, String Doutor, String data, String hora, String motivo, String valor) {
        super(nome_C, servico);
        this.Doutor = "Dr. Sousa";
        this.valor = "2.200,00";
    }

    public String setDoutor(String Doutor){
        return this.Doutor = "Dr. Sousa";
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
        System.out.println("Emergência registrada para o dia " + this.data + " às " + this.hora +
            " com o Dr. " + this.Doutor + ". Motivo: " + this.motivo +
            ". Entrada registrada às: " + agora.withNano(0));
    }

    public boolean pagamento(boolean pagou) {
        this.pago = pagou;
        if (pagou) {
            System.out.println("Pagamento de R$ " + this.valor + " realizado para a emergência: " + this.motivo + ".");
        } else {
            System.out.println("Pagamento não realizado para a emergência: " + this.motivo + ".");
        }
        return this.pago;
    }
}
