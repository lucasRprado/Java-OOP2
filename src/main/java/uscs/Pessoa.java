
package uscs;

public class Pessoa {
    private String nome;
    private String endereco;
    private String cpf;
    private String rg;
    
    public Pessoa(){
        
    }
    
    public Pessoa(String nome, String endereco, String cpf, String rg){
        this.nome = nome;
        this.endereco = endereco;
        this.cpf = cpf;
        this.rg = rg;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }
    
    public void ImprimePessoa(){
        System.out.println("Dados:");
        System.out.println("Nome: " + nome);
        System.out.println("Endereco: " + endereco);
        System.out.println("CPF: " + cpf);
        System.out.println("RG: " + rg);
    }
}
