package Classe_Mae;

public class Clinica {

    public String nome_C;
    public String nome_D;
    public String nome_A;
    public String raca_A;
    public String servico;

    public Clinica (String nome_C, String servico){
    }
        public String setnome_C(String nome_C){
            return this.nome_C = nome_C;
        }
        public String setServico(String servico){
            return this.servico = servico;
        }


    public Clinica (String nome_D, String nome_A, String raca_A){
        this.nome_D = nome_D;
        this.nome_A = nome_A;
        this.raca_A = raca_A;
    }

    public void escolherServico() {
        String[] servicos = {
            "cirurgias", "consultas", "emergencias", "estetica",
            "exames", "internação", "orientação nutricional e comportamental",
            "tratamentos", "vascinação"
        };
        System.out.println("\nServiços disponíveis:");
        for (int i = 0; i < servicos.length; i++) {
            System.out.println((i+1) + " - " + servicos[i]);
        }
    }
}
