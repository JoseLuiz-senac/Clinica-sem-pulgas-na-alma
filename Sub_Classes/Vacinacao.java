package Sub_Classes;
import Classe_Mae.Clinica;
import java.util.Scanner;

public class Vacinacao extends Clinica {
    String Doutor;
    String data;
    String hora;
    String valor;
    boolean pago = false;
    Scanner vet = new Scanner(System.in);
    public Vacinacao(String nome_C, String servico, String Doutor, String data, String hora, String valor) {
        super(nome_C, servico);
        this.Doutor = "Dra. Beatriz";
        this.valor = "100,00";;
    }

    public String setDoutor(String Doutor){
        return this.Doutor = "Dra. Beatriz";
    }
    public String getDoutor(){
        return Doutor;
     }

    public String setData(String data){
        return this.data = data;
    }
    public String getdata(){
        return data;
     }

    public String setHora(String hora){
        return this.hora = hora;
    }
    public String gethora(){
        return hora;
     }

    public String setValor(String valor){
        return this.valor = valor;
    }
    public String getvalor(){
        return valor;
     }

    public void reservarVacina() {
    	String[] reservas = {
	            "10:00", "10:50", "11:40", "12:30", "13:20", "14:10", "15:00", "15:50", "16:40", "17:30","18:20", "19:10", "20:00"
	        };
    Scanner vet = new Scanner(System.in);
    System.out.println("Digite a data da vacinação (dd/mm/yyyy): ");
    this.data = vet.next();
    System.out.println("Escolha um horário disponível: ");
    for (int i = 0; i < reservas.length; i++) {
        System.out.println((i + 1) + " - " + reservas[i]);
    }
    int horario = vet.nextInt();
    this.hora = reservas[horario - 1];
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
        
        System.out.println("Escolha a vacina :");
        String vaci = vet.nextLine();
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