package Sub_Classes;

import Classe_Mae.Clinica;

public class Vacinacao extends Clinica {
    String Doutor;
    String data;
    String hora;
    String valor;
    boolean pago = false;

    public Vacinacao(String nome_C, String servico, String Doutor, String data, String hora, String valor) {
        super(nome_C, servico);
        this.Doutor = Doutor;
        this.data = data;
        this.hora = hora;
        this.valor = valor;
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

    public void reservarVacina() {
        System.out.println("Vacinação reservada para o dia " + this.data +
            " às " + this.hora + " com o Dr. " + this.Doutor + ".");
    }

    public void vacinas() {
        String[] lista = {
            "V8 (cães)", 
            "V10 (cães)", 
            "Antirrábica (cães e gatos)", 
            "Gripe (cães)", 
            "Leishmaniose (cães)", 
            "Quádrupla (gatos)", 
            "Leucemia Felina (gatos)"
        };
        System.out.println("Vacinas disponíveis para animais:");
        for (int i = 0; i < lista.length; i++) {
            System.out.println((i+1) + " - " + lista[i]);
        }
    }

    public boolean pagamento(boolean pagou) {
        this.pago = pagou;
        if (pagou) {
            System.out.println("Pagamento de R$ " + this.valor + " realizado para a vacinação.");
        } else {
            System.out.println("Pagamento não realizado para a vacinação.");
        }
        return this.pago;
    }
}