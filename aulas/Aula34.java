package aulas;

class Endereco {
    private String rua;
    private int numero;
    private String cep;
    private String cidade;
    private String estado;
    private String pais;

    // Getters e Setters
    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }
}

class Pessoa {
    private String nome;
    private String dataNasc;
    private String email;
    private Endereco endereco;

    public Pessoa() {
        System.out.println("Nova Pessoa");
        endereco = new Endereco();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(String dataNasc) {
        this.dataNasc = dataNasc;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void mostrar() {
        System.out.println("Nome              : " + this.nome);
        System.out.println("Data de Nascimento: " + this.dataNasc);
        System.out.println("Email             : " + this.email);
        System.out.println("Endereço          : "+this.endereco.getRua() + ", " +this.endereco.getNumero()+" - "+this.endereco.getCidade()+", "+this.endereco.getEstado() +"/" +this.endereco.getCep());
        System.out.println();
    }
}

public class Aula34 {
    public static void aula() {
        System.out.println("## REGISTROS ##");
        popula(); 
    }

    public static void popula() {
        Pessoa[] pessoas = new Pessoa[10];

        for (int i = 0; i < 10; i++) {
            pessoas[i] = new Pessoa(); 
            pessoas[i].setNome("Pedro " + (i + 1)); 
            pessoas[i].setDataNasc("00/00/2000");
            pessoas[i].setEmail("pedroschroeder@gmail.com");
            pessoas[i].getEndereco().setRua("Av Brasil");
            pessoas[i].getEndereco().setNumero(756);
            pessoas[i].getEndereco().setCidade("Foz do Iguaçu");
            pessoas[i].getEndereco().setEstado("Paraná");
            pessoas[i].getEndereco().setCep("85800-00");

            pessoas[i].mostrar();
        }

    }
}