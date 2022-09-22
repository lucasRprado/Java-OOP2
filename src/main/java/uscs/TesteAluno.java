
package uscs;

public class TesteAluno {

    public static void main(String[] args) {
        
        Pessoa j = new Pessoa("José", "Rua Antonio Marque, 30", "568.234.981-15", "3.698.222-8\n");
        j.ImprimePessoa();
        
        Aluno p = new Aluno("Francisco", "Rua Almeida, 20", "456.876.123-12", "4.687.098-2", 59751, 9.0, 9.5, 8);
        p.ImprimeAluno();
        p.Resultado();
        
        
    }
}
