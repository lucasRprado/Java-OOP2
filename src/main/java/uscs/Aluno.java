package uscs;

public class Aluno extends Pessoa {
    private int matricula;
    private double p1;
    private double p2;
    private int faltas;
    
    public Aluno(){
        
    }
    
    public Aluno(String nome, String endereco, String cpf, String rg, int matricula, double p1, double p2, int faltas){
        super (nome, endereco, cpf, rg);
        this.matricula = matricula;
        this.p1 = p1;
        this.p2 = p2;
        this.faltas = faltas;
    }
    
    public void ImprimeAluno(){
        super.ImprimePessoa();
        System.out.println("Nota P1: " + p1);
        System.out.println("Nota P2: " + p2);
        System.out.println("Numero de faltas: " + faltas);
    }
    public void ImprimeFaltas(){
        System.out.println("Numero de faltas: " + faltas);
    }
    
    public void Resultado(){
        double media = (p1 + p2)/2;
        if (faltas > 10){
            System.out.println("\nAluno reprovado por número de faltas!");
        }
        else{
            if(media >= 7){
                System.out.println("Aluno aprovado com media = " + media);
            }
            else{
                if (media >= 3){
                    System.out.println("Aluno em exame com media = " + media);
                }
                else{
                    System.out.println("Aluno reprovado com media = " + media);
                }
            }
        }
         
    }
    
    
    
}
